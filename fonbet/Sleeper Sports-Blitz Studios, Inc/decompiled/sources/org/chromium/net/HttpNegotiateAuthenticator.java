package org.chromium.net;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import internal.org.jni_zero.JNINamespace;
import java.io.IOException;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.ContextUtils;
import org.chromium.base.Log;
import org.chromium.base.ThreadUtils;

@JNINamespace("net::android")
/* loaded from: classes10.dex */
public class HttpNegotiateAuthenticator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "net_auth";
    private final String mAccountType;
    private Bundle mSpnegoContext;

    interface Natives {
        void setResult(long nativeJavaNegotiateResultWrapper, int status, String authToken);
    }

    static class RequestData {
        public Account account;
        public final AccountManager accountManager;
        public final String authTokenType;
        public final long nativeResultObject;
        public final Bundle options;

        RequestData(long nativeResultObject, AccountManager accountManager, Bundle options, String authTokenType) {
            this.nativeResultObject = nativeResultObject;
            this.accountManager = accountManager;
            this.options = options;
            this.authTokenType = authTokenType;
        }
    }

    class GetAccountsCallback implements AccountManagerCallback<Account[]> {
        private final RequestData mRequestData;

        public GetAccountsCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Account[]> future) {
            try {
                Account[] result = future.getResult();
                if (result.length == 0) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                    return;
                }
                if (result.length > 1) {
                    Log.w(HttpNegotiateAuthenticator.TAG, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", Integer.valueOf(result.length));
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISSING_AUTH_CREDENTIALS, null);
                } else if (HttpNegotiateAuthenticator.this.lacksPermission(ContextUtils.getApplicationContext(), "android.permission.USE_CREDENTIALS", true)) {
                    Log.e(HttpNegotiateAuthenticator.TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
                } else {
                    this.mRequestData.account = result[0];
                    this.mRequestData.accountManager.getAuthToken(this.mRequestData.account, this.mRequestData.authTokenType, this.mRequestData.options, true, (AccountManagerCallback<Bundle>) HttpNegotiateAuthenticator.this.new GetTokenCallback(this.mRequestData), new Handler(ThreadUtils.getUiThreadLooper()));
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }
    }

    class GetTokenCallback implements AccountManagerCallback<Bundle> {
        private final RequestData mRequestData;

        public GetTokenCallback(RequestData requestData) {
            this.mRequestData = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(AccountManagerFuture<Bundle> future) {
            try {
                Bundle result = future.getResult();
                if (result.containsKey(SDKConstants.PARAM_INTENT)) {
                    final Context applicationContext = ContextUtils.getApplicationContext();
                    ContextUtils.registerProtectedBroadcastReceiver(applicationContext, new BroadcastReceiver(this) { // from class: org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.1
                        final /* synthetic */ GetTokenCallback this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // android.content.BroadcastReceiver
                        public void onReceive(Context context, Intent intent) {
                            applicationContext.unregisterReceiver(this);
                            this.this$1.mRequestData.accountManager.getAuthToken(this.this$1.mRequestData.account, this.this$1.mRequestData.authTokenType, this.this$1.mRequestData.options, true, (AccountManagerCallback<Bundle>) HttpNegotiateAuthenticator.this.new GetTokenCallback(this.this$1.mRequestData), (Handler) null);
                        }
                    }, new IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                } else {
                    HttpNegotiateAuthenticator.this.processResult(result, this.mRequestData);
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e) {
                Log.w(HttpNegotiateAuthenticator.TAG, "ERR_UNEXPECTED: Error while attempting to obtain a token.", e);
                HttpNegotiateAuthenticatorJni.get().setResult(this.mRequestData.nativeResultObject, -9, null);
            }
        }
    }

    protected HttpNegotiateAuthenticator(String accountType) {
        this.mAccountType = accountType;
    }

    static HttpNegotiateAuthenticator create(String accountType) {
        return new HttpNegotiateAuthenticator(accountType);
    }

    void getNextAuthToken(final long nativeResultObject, final String principal, String authToken, boolean canDelegate) {
        Context applicationContext = ContextUtils.getApplicationContext();
        String[] strArr = {HttpNegotiateConstants.SPNEGO_FEATURE};
        Bundle bundle = new Bundle();
        if (authToken != null) {
            bundle.putString(HttpNegotiateConstants.KEY_INCOMING_AUTH_TOKEN, authToken);
        }
        Bundle bundle2 = this.mSpnegoContext;
        if (bundle2 != null) {
            bundle.putBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT, bundle2);
        }
        bundle.putBoolean(HttpNegotiateConstants.KEY_CAN_DELEGATE, canDelegate);
        RequestData requestData = new RequestData(nativeResultObject, AccountManager.get(applicationContext), bundle, HttpNegotiateConstants.SPNEGO_TOKEN_TYPE_BASE + principal);
        Activity lastTrackedFocusedActivity = ApplicationStatus.getLastTrackedFocusedActivity();
        if (lastTrackedFocusedActivity == null) {
            requestTokenWithoutActivity(applicationContext, requestData, strArr);
        } else {
            requestTokenWithActivity(applicationContext, lastTrackedFocusedActivity, requestData, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processResult(Bundle result, RequestData requestData) {
        this.mSpnegoContext = result.getBundle(HttpNegotiateConstants.KEY_SPNEGO_CONTEXT);
        int i = -9;
        switch (result.getInt(HttpNegotiateConstants.KEY_SPNEGO_RESULT, 1)) {
            case 0:
                i = 0;
                break;
            case 2:
                i = -3;
                break;
            case 3:
                i = NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS;
                break;
            case 4:
                i = NetError.ERR_INVALID_RESPONSE;
                break;
            case 5:
                i = NetError.ERR_INVALID_AUTH_CREDENTIALS;
                break;
            case 6:
                i = NetError.ERR_UNSUPPORTED_AUTH_SCHEME;
                break;
            case 7:
                i = NetError.ERR_MISSING_AUTH_CREDENTIALS;
                break;
            case 8:
                i = NetError.ERR_UNDOCUMENTED_SECURITY_LIBRARY_STATUS;
                break;
            case 9:
                i = NetError.ERR_MALFORMED_IDENTITY;
                break;
        }
        HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, i, result.getString("authtoken"));
    }

    private void requestTokenWithoutActivity(Context ctx, RequestData requestData, String[] features) {
        if (lacksPermission(ctx, "android.permission.GET_ACCOUNTS", true)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        } else {
            requestData.accountManager.getAccountsByTypeAndFeatures(this.mAccountType, features, new GetAccountsCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
        }
    }

    private void requestTokenWithActivity(Context ctx, Activity activity, RequestData requestData, String[] features) {
        if (lacksPermission(ctx, "android.permission.GET_ACCOUNTS", false)) {
            Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            HttpNegotiateAuthenticatorJni.get().setResult(requestData.nativeResultObject, NetError.ERR_MISCONFIGURED_AUTH_ENVIRONMENT, null);
        } else {
            requestData.accountManager.getAuthTokenByFeatures(this.mAccountType, requestData.authTokenType, features, activity, null, requestData.options, new GetTokenCallback(requestData), new Handler(ThreadUtils.getUiThreadLooper()));
        }
    }

    boolean lacksPermission(Context context, String permission, boolean onlyPreM) {
        return (onlyPreM || context.checkPermission(permission, Process.myPid(), Process.myUid()) == 0) ? false : true;
    }
}

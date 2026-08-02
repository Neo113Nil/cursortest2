package com.reactnativegooglesignin;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.reactnativegooglesignin.RNGoogleSigninModule;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import qc.C6137b;
import qc.C6138c;
import qc.o;
import v9.AbstractC6667b;

/* loaded from: classes4.dex */
public class RNGoogleSigninModule extends NativeGoogleSigninSpec {
    public static final String PLAY_SERVICES_NOT_AVAILABLE = "PLAY_SERVICES_NOT_AVAILABLE";
    public static final int RC_SIGN_IN = 9001;
    public static final int REQUEST_CODE_ADD_SCOPES = 53295;
    public static final int REQUEST_CODE_RECOVER_AUTH = 53294;
    private static final String SHOULD_RECOVER = "SHOULD_RECOVER";
    private GoogleSignInClient _apiClient;
    private C6137b pendingAuthRecovery;
    private final C6138c signInOrAddScopesPromiseWrapper;
    private final C6138c silentSignInPromiseWrapper;
    private final C6138c tokenClearingPromiseWrapper;
    private final C6138c tokenRetrievalPromiseWrapper;

    public static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f41397a;

        public a(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f41397a = new WeakReference(rNGoogleSigninModule);
        }

        public final void a(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap) {
            Activity currentActivity = rNGoogleSigninModule.getCurrentActivity();
            if (currentActivity != null) {
                rNGoogleSigninModule.pendingAuthRecovery = new C6137b(writableMap);
                currentActivity.startActivityForResult(((UserRecoverableAuthException) exc).a(), RNGoogleSigninModule.REQUEST_CODE_RECOVER_AUTH);
                return;
            }
            rNGoogleSigninModule.pendingAuthRecovery = null;
            rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().c("Cannot attempt recovery auth because app is not in foreground. " + exc.getLocalizedMessage());
        }

        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(WritableMap... writableMapArr) {
            WritableMap writableMap = writableMapArr[0];
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f41397a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            try {
                d(rNGoogleSigninModule, writableMap);
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().g(writableMap);
            } catch (Exception e10) {
                c(rNGoogleSigninModule, e10, writableMap, writableMapArr.length >= 2 ? writableMapArr[1] : null);
            }
            return null;
        }

        public final void c(RNGoogleSigninModule rNGoogleSigninModule, Exception exc, WritableMap writableMap, WritableMap writableMap2) {
            if (!(exc instanceof UserRecoverableAuthException)) {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            } else if (writableMap2 != null && writableMap2.hasKey(RNGoogleSigninModule.SHOULD_RECOVER) && writableMap2.getBoolean(RNGoogleSigninModule.SHOULD_RECOVER)) {
                a(rNGoogleSigninModule, exc, writableMap);
            } else {
                rNGoogleSigninModule.getTokenRetrievalPromiseWrapper().b(exc);
            }
        }

        public final void d(RNGoogleSigninModule rNGoogleSigninModule, WritableMap writableMap) {
            writableMap.putString("accessToken", AbstractC6667b.b(rNGoogleSigninModule.getReactApplicationContext(), new Account(writableMap.getMap("user").getString("email"), "com.google"), o.e(writableMap.getArray("scopes"))));
        }
    }

    public class b extends BaseActivityEventListener {
        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            if (i10 == 9001) {
                Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
                RNGoogleSigninModule rNGoogleSigninModule = RNGoogleSigninModule.this;
                rNGoogleSigninModule.handleSignInTaskResult(signedInAccountFromIntent, rNGoogleSigninModule.signInOrAddScopesPromiseWrapper);
            } else {
                if (i10 == 53294) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.rerunFailedAuthTokenTask();
                        return;
                    } else {
                        RNGoogleSigninModule.this.tokenRetrievalPromiseWrapper.c("Failed authentication recovery attempt, probably user-rejected.");
                        return;
                    }
                }
                if (i10 == 53295) {
                    if (i11 == -1) {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.g(Boolean.TRUE);
                    } else {
                        RNGoogleSigninModule.this.signInOrAddScopesPromiseWrapper.c("Failed to add scopes.");
                    }
                }
            }
        }

        public b() {
        }
    }

    public static class c extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f41399a;

        public c(RNGoogleSigninModule rNGoogleSigninModule) {
            this.f41399a = new WeakReference(rNGoogleSigninModule);
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(String... strArr) {
            RNGoogleSigninModule rNGoogleSigninModule = (RNGoogleSigninModule) this.f41399a.get();
            if (rNGoogleSigninModule == null) {
                return null;
            }
            C6138c tokenClearingPromiseWrapper = rNGoogleSigninModule.getTokenClearingPromiseWrapper();
            try {
                AbstractC6667b.a(rNGoogleSigninModule.getReactApplicationContext(), strArr[0]);
                tokenClearingPromiseWrapper.g(null);
            } catch (Exception e10) {
                tokenClearingPromiseWrapper.b(e10);
            }
            return null;
        }
    }

    public RNGoogleSigninModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.signInOrAddScopesPromiseWrapper = new C6138c(NativeGoogleSigninSpec.NAME);
        this.silentSignInPromiseWrapper = new C6138c(NativeGoogleSigninSpec.NAME);
        this.tokenRetrievalPromiseWrapper = new C6138c(NativeGoogleSigninSpec.NAME);
        this.tokenClearingPromiseWrapper = new C6138c(NativeGoogleSigninSpec.NAME);
        reactApplicationContext.addActivityEventListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSignInTaskResult(Task<GoogleSignInAccount> task, C6138c c6138c) {
        try {
            GoogleSignInAccount result = task.getResult(com.google.android.gms.common.api.b.class);
            if (result == null) {
                c6138c.c("GoogleSignInAccount instance was null");
            } else {
                c6138c.g(o.d(result));
            }
        } catch (com.google.android.gms.common.api.b e10) {
            if (e10.getStatusCode() == 10) {
                c6138c.d(String.valueOf(10), "DEVELOPER_ERROR: Follow troubleshooting instructions at https://react-native-google-signin.github.io/docs/troubleshooting");
            } else {
                c6138c.b(e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleSignOutOrRevokeAccessTask, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signOut$3(@NonNull Task<Void> task, Promise promise) {
        if (task.isSuccessful()) {
            promise.resolve(null);
            return;
        }
        int b10 = o.b(task);
        promise.reject(String.valueOf(b10), GoogleSignInStatusCodes.getStatusCodeString(b10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signIn$2(Activity activity) {
        activity.startActivityForResult(this._apiClient.getSignInIntent(), RC_SIGN_IN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$0(Task task) {
        handleSignInTaskResult(task, this.silentSignInPromiseWrapper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInSilently$1() {
        Task<GoogleSignInAccount> silentSignIn = this._apiClient.silentSignIn();
        if (silentSignIn.isSuccessful()) {
            handleSignInTaskResult(silentSignIn, this.silentSignInPromiseWrapper);
        } else {
            silentSignIn.addOnCompleteListener(new OnCompleteListener() { // from class: qc.f
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$signInSilently$0(task);
                }
            });
        }
    }

    public static void rejectWithNullActivity(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "activity is null");
    }

    private void rejectWithNullClientError(Promise promise) {
        promise.reject(NativeGoogleSigninSpec.NAME, "apiClient is null - call configure() first");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rerunFailedAuthTokenTask() {
        WritableMap a10 = this.pendingAuthRecovery.a();
        if (a10 != null) {
            new a(this).execute(a10, null);
        } else {
            this.tokenRetrievalPromiseWrapper.c("rerunFailedAuthTokenTask: recovery failed");
        }
    }

    private void startTokenRetrievalTaskWithRecovery(GoogleSignInAccount googleSignInAccount) {
        WritableMap d10 = o.d(googleSignInAccount);
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean(SHOULD_RECOVER, true);
        new a(this).execute(d10, createMap);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void addScopes(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
            return;
        }
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(getReactApplicationContext());
        if (lastSignedInAccount == null) {
            promise.resolve(Boolean.FALSE);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "addScopes");
            GoogleSignIn.requestPermissions(currentActivity, REQUEST_CODE_ADD_SCOPES, lastSignedInAccount, o.a(readableMap.getArray("scopes")));
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void clearCachedAccessToken(String str, Promise promise) {
        this.tokenClearingPromiseWrapper.h(promise, "clearCachedAccessToken");
        new c(this).execute(str);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void configure(ReadableMap readableMap, Promise promise) {
        boolean z10;
        ReadableArray array = readableMap.hasKey("scopes") ? readableMap.getArray("scopes") : Arguments.createArray();
        String string = readableMap.hasKey("webClientId") ? readableMap.getString("webClientId") : null;
        boolean z11 = true;
        if (readableMap.hasKey("offlineAccess") && readableMap.getBoolean("offlineAccess")) {
            z10 = true;
        } else {
            z10 = true;
            z11 = false;
        }
        this._apiClient = GoogleSignIn.getClient(getReactApplicationContext(), o.c(o.a(array), string, z11, (readableMap.hasKey("forceCodeForRefreshToken") && readableMap.getBoolean("forceCodeForRefreshToken")) ? z10 : false, readableMap.hasKey("accountName") ? readableMap.getString("accountName") : null, readableMap.hasKey("hostedDomain") ? readableMap.getString("hostedDomain") : null));
        promise.resolve(null);
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getCurrentUser() {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(getReactApplicationContext());
        if (lastSignedInAccount == null) {
            return null;
        }
        return o.d(lastSignedInAccount);
    }

    public C6138c getTokenClearingPromiseWrapper() {
        return this.tokenClearingPromiseWrapper;
    }

    public C6138c getTokenRetrievalPromiseWrapper() {
        return this.tokenRetrievalPromiseWrapper;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void getTokens(Promise promise) {
        GoogleSignInAccount lastSignedInAccount = GoogleSignIn.getLastSignedInAccount(getReactApplicationContext());
        if (lastSignedInAccount == null) {
            promise.reject("getTokens", "getTokens requires a user to be signed in");
        } else {
            this.tokenRetrievalPromiseWrapper.h(promise, "getTokens");
            startTokenRetrievalTaskWithRecovery(lastSignedInAccount);
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("BUTTON_SIZE_ICON", 2);
        hashMap.put("BUTTON_SIZE_STANDARD", 0);
        hashMap.put("BUTTON_SIZE_WIDE", 1);
        hashMap.put("SIGN_IN_CANCELLED", String.valueOf(GoogleSignInStatusCodes.SIGN_IN_CANCELLED));
        hashMap.put("SIGN_IN_REQUIRED", String.valueOf(4));
        hashMap.put("SCOPES_ALREADY_GRANTED", "NEVER_HAPPENS_ON_ANDROID");
        hashMap.put("ONE_TAP_START_FAILED", "ONE_TAP_START_FAILED");
        hashMap.put("NO_SAVED_CREDENTIAL_FOUND", "NO_SAVED_CREDENTIAL_FOUND");
        hashMap.put("IN_PROGRESS", "ASYNC_OP_IN_PROGRESS");
        hashMap.put(PLAY_SERVICES_NOT_AVAILABLE, PLAY_SERVICES_NOT_AVAILABLE);
        return hashMap;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean hasPreviousSignIn() {
        return GoogleSignIn.getLastSignedInAccount(getReactApplicationContext()) != null;
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void playServicesAvailable(boolean z10, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            Log.w(NativeGoogleSigninSpec.NAME, "could not determine playServicesAvailable, activity is null");
            rejectWithNullActivity(promise);
            return;
        }
        GoogleApiAvailability r10 = GoogleApiAvailability.r();
        int i10 = r10.i(currentActivity);
        if (i10 == 0) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        if (z10 && r10.m(i10)) {
            r10.o(currentActivity, i10, 2404).show();
        }
        promise.reject(PLAY_SERVICES_NOT_AVAILABLE, "Play services not available");
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void revokeAccess(final Promise promise) {
        GoogleSignInClient googleSignInClient = this._apiClient;
        if (googleSignInClient == null) {
            rejectWithNullClientError(promise);
        } else {
            googleSignInClient.revokeAccess().addOnCompleteListener(new OnCompleteListener() { // from class: qc.i
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$revokeAccess$4(promise, task);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signIn(ReadableMap readableMap, Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
            return;
        }
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            rejectWithNullActivity(promise);
        } else {
            this.signInOrAddScopesPromiseWrapper.h(promise, "signIn");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: qc.h
                @Override // java.lang.Runnable
                public final void run() {
                    RNGoogleSigninModule.this.lambda$signIn$2(currentActivity);
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signInSilently(Promise promise) {
        if (this._apiClient == null) {
            rejectWithNullClientError(promise);
        } else {
            this.silentSignInPromiseWrapper.h(promise, "signInSilently");
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: qc.j
                @Override // java.lang.Runnable
                public final void run() {
                    RNGoogleSigninModule.this.lambda$signInSilently$1();
                }
            });
        }
    }

    @Override // com.reactnativegooglesignin.NativeGoogleSigninSpec
    @ReactMethod
    public void signOut(final Promise promise) {
        GoogleSignInClient googleSignInClient = this._apiClient;
        if (googleSignInClient == null) {
            rejectWithNullClientError(promise);
        } else {
            googleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener() { // from class: qc.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    RNGoogleSigninModule.this.lambda$signOut$3(promise, task);
                }
            });
        }
    }
}

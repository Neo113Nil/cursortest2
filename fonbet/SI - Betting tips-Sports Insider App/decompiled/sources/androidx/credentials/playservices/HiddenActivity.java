package androidx.credentials.playservices;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import e5.p;
import e6.y;
import g6.v;
import io.sentry.android.core.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w7.h;
import w7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\"\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0014H\u0014J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/HiddenActivity;", "Landroid/app/Activity;", "()V", "mWaitingForActivityResult", "", "resultReceiver", "Landroid/os/ResultReceiver;", "handleBeginSignIn", "", "handleCreatePassword", "handleCreatePublicKeyCredential", "handleGetSignInIntent", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "restoreState", "setupFailure", "errName", "", "errMsg", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class HiddenActivity extends Activity {
    private static final int DEFAULT_VALUE = 1;

    @NotNull
    private static final String KEY_AWAITING_RESULT = "androidx.credentials.playservices.AWAITING_RESULT";

    @NotNull
    private static final String TAG = "HiddenActivity";
    private boolean mWaitingForActivityResult;

    @Nullable
    private ResultReceiver resultReceiver;

    private final void handleBeginSignIn() {
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        final int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        m mVar = null;
        if (beginSignInRequest != null) {
            f7.b bVar = new f7.b(this, new u5.c());
            new BeginSignInRequest.GoogleIdTokenRequestOptions(false, null, null, true, null, null, false, null, null);
            new BeginSignInRequest.PasskeysRequestOptions(null, false, null);
            new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.f4314b;
            v.h(googleIdTokenRequestOptions);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = beginSignInRequest.f4313a;
            v.h(passwordRequestOptions);
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.f4318f;
            v.h(passkeysRequestOptions);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.f4319g;
            v.h(passkeyJsonRequestOptions);
            BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, bVar.f9475l, beginSignInRequest.f4316d, beginSignInRequest.f4317e, passkeysRequestOptions, passkeyJsonRequestOptions, beginSignInRequest.f4320h);
            e6.m a7 = y.a();
            a7.f8725d = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
            a7.f8722a = new io.sentry.internal.debugmeta.c(7, bVar, beginSignInRequest2);
            a7.f8724c = true;
            a7.f8723b = false;
            a7.f8726e = 1553;
            mVar = bVar.c(0, a7.a());
            a aVar = new a(new Function1<BeginSignInResult, Unit>() { // from class: androidx.credentials.playservices.HiddenActivity$handleBeginSignIn$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((BeginSignInResult) obj);
                    return Unit.f19194a;
                }

                public final void invoke(BeginSignInResult beginSignInResult) {
                    ResultReceiver resultReceiver;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(beginSignInResult.f4336a.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e7) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        Intrinsics.checkNotNull(resultReceiver);
                        hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During begin sign in, one tap ui intent sender failure: " + e7.getMessage());
                    }
                }
            }, 5);
            mVar.getClass();
            p pVar = h.f24980a;
            mVar.e(pVar, aVar);
            mVar.c(pVar, new f(this, 3));
        }
        if (mVar == null) {
            Log.i(TAG, "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleBeginSignIn$lambda$10$lambda$9(HiddenActivity hiddenActivity, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        String str = ((e7 instanceof d6.e) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((d6.e) e7).f8245a.f4466a))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During begin sign in, failure response from one tap: " + e7.getMessage());
    }

    private final void handleCreatePassword() {
        m mVar;
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        int i5 = 1;
        final int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (savePasswordRequest != null) {
            f7.b bVar = new f7.b(this, new u5.a());
            SavePasswordRequest savePasswordRequest2 = new SavePasswordRequest(savePasswordRequest.f4357a, bVar.f9475l, savePasswordRequest.f4359c);
            e6.m a7 = y.a();
            a7.f8725d = new Feature[]{f7.e.f9478b};
            a7.f8722a = new d7.e(7, bVar, savePasswordRequest2);
            a7.f8724c = true;
            a7.f8723b = false;
            a7.f8726e = 1536;
            mVar = bVar.c(0, a7.a());
            a aVar = new a(new Function1<SavePasswordResult, Unit>() { // from class: androidx.credentials.playservices.HiddenActivity$handleCreatePassword$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((SavePasswordResult) obj);
                    return Unit.f19194a;
                }

                public final void invoke(SavePasswordResult savePasswordResult) {
                    ResultReceiver resultReceiver;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(savePasswordResult.f4360a.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e7) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        Intrinsics.checkNotNull(resultReceiver);
                        hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During save password, found UI intent sender failure: " + e7.getMessage());
                    }
                }
            }, 3);
            mVar.getClass();
            p pVar = h.f24980a;
            mVar.e(pVar, aVar);
            mVar.c(pVar, new f(this, i5));
        } else {
            mVar = null;
        }
        if (mVar == null) {
            Log.i(TAG, "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePassword$lambda$14$lambda$13(HiddenActivity hiddenActivity, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        String str = ((e7 instanceof d6.e) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((d6.e) e7).f8245a.f4466a))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During save password, found password failure response from one tap " + e7.getMessage());
    }

    private final void handleCreatePublicKeyCredential() {
        m mVar;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        final int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (publicKeyCredentialCreationOptions != null) {
            x6.a aVar = new x6.a(this, x6.a.f25411l, d6.b.f8244d0, new m3.f(12));
            e6.m a7 = y.a();
            a7.f8722a = new r7.a(aVar, publicKeyCredentialCreationOptions);
            a7.f8726e = 5407;
            mVar = aVar.c(0, a7.a());
            a aVar2 = new a(new Function1<PendingIntent, Unit>() { // from class: androidx.credentials.playservices.HiddenActivity$handleCreatePublicKeyCredential$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PendingIntent) obj);
                    return Unit.f19194a;
                }

                public final void invoke(PendingIntent result) {
                    ResultReceiver resultReceiver;
                    Intrinsics.checkNotNullParameter(result, "result");
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(result.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e7) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        Intrinsics.checkNotNull(resultReceiver);
                        hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.CREATE_UNKNOWN, "During public key credential, found IntentSender failure on public key creation: " + e7.getMessage());
                    }
                }
            }, 2);
            mVar.getClass();
            p pVar = h.f24980a;
            mVar.e(pVar, aVar2);
            mVar.c(pVar, new f(this, 0));
        } else {
            mVar = null;
        }
        if (mVar == null) {
            w0.m(TAG, "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleCreatePublicKeyCredential$lambda$2$lambda$1(HiddenActivity hiddenActivity, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        String str = ((e7 instanceof d6.e) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((d6.e) e7).f8245a.f4466a))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During create public key credential, fido registration failure: " + e7.getMessage());
    }

    private final void handleGetSignInIntent() {
        m mVar;
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) getIntent().getParcelableExtra(CredentialProviderBaseController.REQUEST_TAG);
        final int intExtra = getIntent().getIntExtra(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG, 1);
        if (getSignInIntentRequest != null) {
            f7.b bVar = new f7.b(this, new u5.c());
            String str = getSignInIntentRequest.f4340a;
            v.h(str);
            GetSignInIntentRequest getSignInIntentRequest2 = new GetSignInIntentRequest(str, getSignInIntentRequest.f4341b, bVar.f9475l, getSignInIntentRequest.f4343d, getSignInIntentRequest.f4344e, getSignInIntentRequest.f4345f, getSignInIntentRequest.f4346g);
            e6.m a7 = y.a();
            a7.f8725d = new Feature[]{f7.e.f9479c};
            a7.f8722a = new l1.a(19, bVar, getSignInIntentRequest2, false);
            a7.f8726e = 1555;
            mVar = bVar.c(0, a7.a());
            a aVar = new a(new Function1<PendingIntent, Unit>() { // from class: androidx.credentials.playservices.HiddenActivity$handleGetSignInIntent$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((PendingIntent) obj);
                    return Unit.f19194a;
                }

                public final void invoke(PendingIntent pendingIntent) {
                    ResultReceiver resultReceiver;
                    try {
                        HiddenActivity.this.mWaitingForActivityResult = true;
                        HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), intExtra, null, 0, 0, 0, null);
                    } catch (IntentSender.SendIntentException e7) {
                        HiddenActivity hiddenActivity = HiddenActivity.this;
                        resultReceiver = hiddenActivity.resultReceiver;
                        Intrinsics.checkNotNull(resultReceiver);
                        hiddenActivity.setupFailure(resultReceiver, CredentialProviderBaseController.GET_UNKNOWN, "During get sign-in intent, one tap ui intent sender failure: " + e7.getMessage());
                    }
                }
            }, 4);
            mVar.getClass();
            p pVar = h.f24980a;
            mVar.e(pVar, aVar);
            mVar.c(pVar, new f(this, 2));
        } else {
            mVar = null;
        }
        if (mVar == null) {
            Log.i(TAG, "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleGetSignInIntent$lambda$6$lambda$5(HiddenActivity hiddenActivity, Exception e7) {
        Intrinsics.checkNotNullParameter(e7, "e");
        String str = ((e7 instanceof d6.e) && CredentialProviderBaseController.INSTANCE.getRetryables().contains(Integer.valueOf(((d6.e) e7).f8245a.f4466a))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        ResultReceiver resultReceiver = hiddenActivity.resultReceiver;
        Intrinsics.checkNotNull(resultReceiver);
        hiddenActivity.setupFailure(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + e7.getMessage());
    }

    private final void restoreState(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            this.mWaitingForActivityResult = savedInstanceState.getBoolean(KEY_AWAITING_RESULT, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFailure(ResultReceiver resultReceiver, String errName, String errMsg) {
        CredentialProviderBaseController.INSTANCE.reportError$credentials_play_services_auth_release(resultReceiver, errName, errMsg);
        finish();
    }

    @Override // android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        ResultReceiver resultReceiver = this.resultReceiver;
        if (resultReceiver != null) {
            CredentialProviderBaseController.INSTANCE.reportResult$credentials_play_services_auth_release(resultReceiver, requestCode, resultCode, data);
        }
        this.mWaitingForActivityResult = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra(CredentialProviderBaseController.TYPE_TAG);
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG);
        this.resultReceiver = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        restoreState(savedInstanceState);
        if (this.mWaitingForActivityResult) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals(CredentialProviderBaseController.BEGIN_SIGN_IN_TAG)) {
                        handleBeginSignIn();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG)) {
                        handleCreatePublicKeyCredential();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals(CredentialProviderBaseController.CREATE_PASSWORD_TAG)) {
                        handleCreatePassword();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals(CredentialProviderBaseController.SIGN_IN_INTENT_TAG)) {
                        handleGetSignInIntent();
                        return;
                    }
                    break;
            }
        }
        w0.m(TAG, "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        outState.putBoolean(KEY_AWAITING_RESULT, this.mWaitingForActivityResult);
        super.onSaveInstanceState(outState);
    }
}

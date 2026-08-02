package androidx.credentials.playservices.controllers.BeginSignIn;

import android.content.Context;
import androidx.credentials.CredentialOption;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetPasswordOption;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import xsna.exc0;
import xsna.wrt;
import xsna.zcl;

/* compiled from: BeginSignInControllerUtility.kt */
/* loaded from: classes12.dex */
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;
    private static final long AUTH_MIN_VERSION_PREFER_IMME_CRED = 241217000;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    /* compiled from: BeginSignInControllerUtility.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(wrt wrtVar) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.a i = BeginSignInRequest.GoogleIdTokenRequestOptions.i();
            wrtVar.getClass();
            i.b = false;
            exc0.f(null);
            i.a = true;
            return i.a();
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long j) {
            return j < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(GetCredentialRequest getCredentialRequest, Context context) {
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
            BeginSignInRequest.GoogleIdTokenRequestOptions.a i = BeginSignInRequest.GoogleIdTokenRequestOptions.i();
            i.a = false;
            BeginSignInRequest.GoogleIdTokenRequestOptions a = i.a();
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions(null, null, false);
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions(false, null);
            long determineDeviceGMSVersionCode = determineDeviceGMSVersionCode(context);
            BeginSignInRequest.PasswordRequestOptions passwordRequestOptions2 = passwordRequestOptions;
            boolean z = false;
            boolean z2 = false;
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = a;
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions2 = passkeysRequestOptions;
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions2 = passkeyJsonRequestOptions;
            for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
                if (credentialOption instanceof GetPasswordOption) {
                    passwordRequestOptions2 = new BeginSignInRequest.PasswordRequestOptions(true);
                    if (!z2 && !credentialOption.isAutoSelectAllowed()) {
                        z2 = false;
                    }
                    z2 = true;
                } else if ((credentialOption instanceof GetPublicKeyCredentialOption) && !z) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode)) {
                        BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyRequest((GetPublicKeyCredentialOption) credentialOption);
                        exc0.i(convertToPlayAuthPasskeyRequest);
                        passkeysRequestOptions2 = convertToPlayAuthPasskeyRequest;
                    } else {
                        BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest = PublicKeyCredentialControllerUtility.Companion.convertToPlayAuthPasskeyJsonRequest((GetPublicKeyCredentialOption) credentialOption);
                        exc0.i(convertToPlayAuthPasskeyJsonRequest);
                        passkeyJsonRequestOptions2 = convertToPlayAuthPasskeyJsonRequest;
                    }
                    z = true;
                } else if (credentialOption instanceof wrt) {
                    wrt wrtVar = (wrt) credentialOption;
                    googleIdTokenRequestOptions = convertToGoogleIdTokenOption(wrtVar);
                    exc0.i(googleIdTokenRequestOptions);
                    if (z2) {
                        z2 = true;
                    } else {
                        wrtVar.getClass();
                        z2 = false;
                    }
                }
            }
            return new BeginSignInRequest(passwordRequestOptions2, googleIdTokenRequestOptions, null, z2, 0, passkeysRequestOptions2, passkeyJsonRequestOptions2, determineDeviceGMSVersionCode > BeginSignInControllerUtility.AUTH_MIN_VERSION_PREFER_IMME_CRED ? getCredentialRequest.preferImmediatelyAvailableCredentials() : false);
        }

        private Companion() {
        }
    }
}

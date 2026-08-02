package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Base64;
import android.util.Log;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.GetPublicKeyCredentialOption;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.AbortError;
import androidx.credentials.exceptions.domerrors.ConstraintError;
import androidx.credentials.exceptions.domerrors.DataError;
import androidx.credentials.exceptions.domerrors.DomError;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.InvalidStateError;
import androidx.credentials.exceptions.domerrors.NetworkError;
import androidx.credentials.exceptions.domerrors.NotAllowedError;
import androidx.credentials.exceptions.domerrors.NotReadableError;
import androidx.credentials.exceptions.domerrors.NotSupportedError;
import androidx.credentials.exceptions.domerrors.SecurityError;
import androidx.credentials.exceptions.domerrors.TimeoutError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.drm0;
import xsna.exc0;
import xsna.go9;
import xsna.m5k;
import xsna.ozl;
import xsna.pn00;
import xsna.zcl;

/* compiled from: PublicKeyCredentialControllerUtility.kt */
/* loaded from: classes12.dex */
public final class PublicKeyCredentialControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_CREATE = 241217000;
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";
    public static final Companion Companion = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = InAppPurchaseMetaData.KEY_SIGNATURE;
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = "rpId";
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = HiAnalyticsConstant.HaKey.BI_KEY_APPID;
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = JwsHeader.ALGORITHM;
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = CommonConstant.KEY_DISPLAY_NAME;
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";
    private static final LinkedHashMap<ErrorCode, DomError> orderedErrorCodeToExceptions = pn00.j(new Pair(ErrorCode.UNKNOWN_ERR, new UnknownError()), new Pair(ErrorCode.ABORT_ERR, new AbortError()), new Pair(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new NotReadableError()), new Pair(ErrorCode.CONSTRAINT_ERR, new ConstraintError()), new Pair(ErrorCode.DATA_ERR, new DataError()), new Pair(ErrorCode.INVALID_STATE_ERR, new InvalidStateError()), new Pair(ErrorCode.ENCODING_ERR, new EncodingError()), new Pair(ErrorCode.NETWORK_ERR, new NetworkError()), new Pair(ErrorCode.NOT_ALLOWED_ERR, new NotAllowedError()), new Pair(ErrorCode.NOT_SUPPORTED_ERR, new NotSupportedError()), new Pair(ErrorCode.SECURITY_ERR, new SecurityError()), new Pair(ErrorCode.TIMEOUT_ERR, new TimeoutError()));

    /* compiled from: PublicKeyCredentialControllerUtility.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private final byte[] getChallenge(JSONObject jSONObject) {
            String optString = jSONObject.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), "");
            if (optString.length() != 0) {
                return b64Decode(optString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        private final boolean isDeviceGMSVersionOlderThan(Context context, long j) {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0 && GetGMSVersion.getVersionLong(context.getPackageManager().getPackageInfo("com.google.android.gms", 0)) > j;
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] bArr, byte[] bArr2, String[] strArr, JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(bArr));
            jSONObject2.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(bArr2));
            jSONObject2.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(strArr));
            jSONObject.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject2);
        }

        public final byte[] b64Decode(String str) {
            return Base64.decode(str, 11);
        }

        public final String b64Encode(byte[] bArr) {
            return Base64.encodeToString(bArr, 11);
        }

        public final GetCredentialException beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode errorCode, String str) {
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            return domError == null ? new GetPublicKeyCredentialDomException(new UnknownError(), go9.b("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && str != null && drm0.D(str, "Unable to get sync account", false)) ? new GetCredentialCancellationException("Passkey retrieval was cancelled by the user.") : new GetPublicKeyCredentialDomException(domError, str);
        }

        public final boolean checkAlgSupported(int i) {
            try {
                COSEAlgorithmIdentifier.a(i);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Context context) {
            return isDeviceGMSVersionOlderThan(context, PublicKeyCredentialControllerUtility.AUTH_MIN_VERSION_JSON_CREATE) ? new PublicKeyCredentialCreationOptions(createPublicKeyCredentialRequest.getRequestJson()) : convertJSON$credentials_play_services_auth_release(new JSONObject(createPublicKeyCredentialRequest.getRequestJson()));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject jSONObject) {
            PublicKeyCredentialCreationOptions.a aVar = new PublicKeyCredentialCreationOptions.a();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(jSONObject, aVar);
            parseRequiredRpAndParams$credentials_play_services_auth_release(jSONObject, aVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(jSONObject, aVar);
            parseOptionalTimeout$credentials_play_services_auth_release(jSONObject, aVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(jSONObject, aVar);
            parseOptionalExtensions$credentials_play_services_auth_release(jSONObject, aVar);
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = aVar.a;
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = aVar.b;
            byte[] bArr = aVar.c;
            ArrayList arrayList = aVar.d;
            Double d = aVar.e;
            ArrayList arrayList2 = aVar.f;
            AuthenticatorSelectionCriteria authenticatorSelectionCriteria = aVar.g;
            AttestationConveyancePreference attestationConveyancePreference = aVar.h;
            return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), aVar.i, null, null);
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(GetPublicKeyCredentialOption getPublicKeyCredentialOption) {
            return new BeginSignInRequest.PasskeyJsonRequestOptions(true, getPublicKeyCredentialOption.getRequestJson());
        }

        @ozl
        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(GetPublicKeyCredentialOption getPublicKeyCredentialOption) {
            JSONObject jSONObject = new JSONObject(getPublicKeyCredentialOption.getRequestJson());
            String optString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), "");
            if (optString.length() != 0) {
                return new BeginSignInRequest.PasskeysRequestOptions(optString, getChallenge(jSONObject), true);
            }
            throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<ErrorCode, DomError> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            if (jSONObject.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                boolean optBoolean = jSONObject2.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String optString = jSONObject2.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), "");
                ResidentKeyRequirement a = optString.length() > 0 ? ResidentKeyRequirement.a(optString) : null;
                Boolean valueOf = Boolean.valueOf(optBoolean);
                String optString2 = jSONObject2.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), "");
                Attachment a2 = optString2.length() > 0 ? Attachment.a(optString2) : null;
                aVar.g = new AuthenticatorSelectionCriteria(valueOf, a2 == null ? null : a2.toString(), null, a == null ? null : a.toString());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            if (jSONObject.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                String optString = jSONObject2.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), "");
                aVar.i = new AuthenticationExtensions(optString.length() > 0 ? new FidoAppIdExtension(optString) : null, null, jSONObject2.optBoolean("uvm", false) ? new UserVerificationMethodExtension(true) : null, null, null, null, null, null, jSONObject2.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false) ? new GoogleThirdPartyPaymentExtension(true) : null, null, null, null);
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            if (jSONObject.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                aVar.e = Double.valueOf(jSONObject.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000);
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            ArrayList arrayList;
            ArrayList arrayList2 = new ArrayList();
            if (jSONObject.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    byte[] b64Decode = b64Decode(jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release()));
                    String string = jSONObject2.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    if (string.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (b64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject2.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject2.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            try {
                                arrayList.add(Transport.a(jSONArray2.getString(i2)));
                            } catch (Transport.UnsupportedTransportException e) {
                                throw new CreatePublicKeyCredentialDomException(new EncodingError(), e.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string, b64Decode, arrayList));
                }
            }
            aVar.f = arrayList2;
            String optString = jSONObject.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            aVar.h = AttestationConveyancePreference.a(optString.length() != 0 ? optString : "none");
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            byte[] challenge = getChallenge(jSONObject);
            aVar.getClass();
            exc0.i(challenge);
            aVar.c = challenge;
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            byte[] b64Decode = b64Decode(jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release()));
            String string = jSONObject2.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string2 = jSONObject2.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String optString = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (b64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            aVar.b = new PublicKeyCredentialUserEntity(b64Decode, string, optString, string2);
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject jSONObject, PublicKeyCredentialCreationOptions.a aVar) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = jSONObject2.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String optString = jSONObject2.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), "");
            String optString2 = jSONObject2.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), "");
            if (optString2.length() == 0) {
                optString2 = null;
            }
            if (optString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            if (string.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp ID is missing or unexpectedly empty");
            }
            aVar.a = new PublicKeyCredentialRpEntity(string, optString, optString2);
            JSONArray jSONArray = jSONObject.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                int i2 = (int) jSONObject3.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String optString3 = jSONObject3.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), "");
                if (optString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i2)) {
                    arrayList.add(new PublicKeyCredentialParameters(optString3, i2));
                }
            }
            aVar.d = arrayList;
        }

        public final CreateCredentialException publicKeyCredentialResponseContainsError(PublicKeyCredential publicKeyCredential) {
            SafeParcelable safeParcelable = publicKeyCredential.e;
            if (safeParcelable == null && (safeParcelable = publicKeyCredential.f) == null && (safeParcelable = publicKeyCredential.g) == null) {
                throw new IllegalStateException("No response set.");
            }
            if (!(safeParcelable instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) safeParcelable;
            ErrorCode errorCode = authenticatorErrorResponse.b;
            DomError domError = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCode);
            String str = authenticatorErrorResponse.c;
            return domError == null ? new CreatePublicKeyCredentialDomException(new UnknownError(), go9.b("unknown fido gms exception - ", str)) : (errorCode == ErrorCode.NOT_ALLOWED_ERR && str != null && drm0.D(str, "Unable to get sync account", false)) ? new CreateCredentialCancellationException("Passkey registration was cancelled by the user.") : new CreatePublicKeyCredentialDomException(domError, str);
        }

        public final String toAssertPasskeyResponse(SignInCredential signInCredential) {
            Object obj;
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredential = signInCredential.j;
            if (publicKeyCredential != null) {
                obj = publicKeyCredential.e;
                if (obj == null && (obj = publicKeyCredential.f) == null && (obj = publicKeyCredential.g) == null) {
                    throw new IllegalStateException("No response set.");
                }
            } else {
                obj = null;
            }
            if (obj instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(authenticatorErrorResponse.b, authenticatorErrorResponse.c);
            }
            if (!(obj instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: ".concat(obj.getClass().getName()));
                return jSONObject.toString();
            }
            try {
                return publicKeyCredential.i().toString();
            } catch (Throwable th) {
                throw new GetCredentialUnknownException(m5k.b(th, new StringBuilder("The PublicKeyCredential response json had an unexpected exception when parsing: ")));
            }
        }

        private Companion() {
        }
    }

    /* compiled from: PublicKeyCredentialControllerUtility.kt */
    public static final class GetGMSVersion {
        public static final GetGMSVersion INSTANCE = new GetGMSVersion();

        private GetGMSVersion() {
        }

        public static final long getVersionLong(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static final PublicKeyCredentialCreationOptions convert(CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest, Context context) {
        return Companion.convert(createPublicKeyCredentialRequest, context);
    }
}

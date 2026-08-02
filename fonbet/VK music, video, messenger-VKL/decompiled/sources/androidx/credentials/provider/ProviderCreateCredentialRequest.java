package androidx.credentials.provider;

import android.os.Bundle;
import androidx.credentials.CreateCredentialRequest;
import xsna.zcl;

/* compiled from: ProviderCreateCredentialRequest.kt */
/* loaded from: classes12.dex */
public final class ProviderCreateCredentialRequest {
    public static final Companion Companion = new Companion(null);
    private static final String EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE = "androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_TYPE";
    private static final String EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA = "androidx.credentials.provider.extra.CREATE_REQUEST_CANDIDATE_QUERY_DATA";
    private static final String EXTRA_CREATE_REQUEST_CREDENTIAL_DATA = "androidx.credentials.provider.extra.CREATE_REQUEST_CREDENTIAL_DATA";
    private final BiometricPromptResult biometricPromptResult;
    private final CallingAppInfo callingAppInfo;
    private final CreateCredentialRequest callingRequest;

    /* compiled from: ProviderCreateCredentialRequest.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Bundle asBundle(ProviderCreateCredentialRequest providerCreateCredentialRequest) {
            Bundle bundle = new Bundle();
            bundle.putString(ProviderCreateCredentialRequest.EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE, providerCreateCredentialRequest.getCallingRequest().getType());
            bundle.putBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CREDENTIAL_DATA, providerCreateCredentialRequest.getCallingRequest().getCredentialData());
            bundle.putBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA, providerCreateCredentialRequest.getCallingRequest().getCandidateQueryData());
            CallingAppInfo.Companion.setCallingAppInfo$credentials_release(bundle, providerCreateCredentialRequest.getCallingAppInfo());
            return bundle;
        }

        public final ProviderCreateCredentialRequest fromBundle(Bundle bundle) {
            String string = bundle.getString(ProviderCreateCredentialRequest.EXTRA_CREATE_CREDENTIAL_REQUEST_TYPE);
            if (string == null) {
                throw new IllegalArgumentException("Bundle was missing request type.");
            }
            Bundle bundle2 = bundle.getBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CREDENTIAL_DATA);
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            Bundle bundle4 = bundle.getBundle(ProviderCreateCredentialRequest.EXTRA_CREATE_REQUEST_CANDIDATE_QUERY_DATA);
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = bundle4;
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            CallingAppInfo extractCallingAppInfo$credentials_release = CallingAppInfo.Companion.extractCallingAppInfo$credentials_release(bundle);
            if (extractCallingAppInfo$credentials_release == null) {
                throw new IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            try {
                return new ProviderCreateCredentialRequest(CreateCredentialRequest.Companion.createFrom(string, bundle3, bundle5, false, string2), extractCallingAppInfo$credentials_release, null, 4, null);
            } catch (Exception e) {
                throw new IllegalArgumentException("Conversion failed with " + e);
            }
        }

        private Companion() {
        }
    }

    public ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo) {
        this(createCredentialRequest, callingAppInfo, null, 4, null);
    }

    public static final Bundle asBundle(ProviderCreateCredentialRequest providerCreateCredentialRequest) {
        return Companion.asBundle(providerCreateCredentialRequest);
    }

    public static final ProviderCreateCredentialRequest fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public final BiometricPromptResult getBiometricPromptResult() {
        return this.biometricPromptResult;
    }

    public final CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final CreateCredentialRequest getCallingRequest() {
        return this.callingRequest;
    }

    public ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult) {
        this.callingRequest = createCredentialRequest;
        this.callingAppInfo = callingAppInfo;
        this.biometricPromptResult = biometricPromptResult;
    }

    public /* synthetic */ ProviderCreateCredentialRequest(CreateCredentialRequest createCredentialRequest, CallingAppInfo callingAppInfo, BiometricPromptResult biometricPromptResult, int i, zcl zclVar) {
        this(createCredentialRequest, callingAppInfo, (i & 4) != 0 ? null : biometricPromptResult);
    }
}

package androidx.credentials.internal;

import android.annotation.SuppressLint;
import android.credentials.Credential;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.GetCredentialResponse;
import xsna.k92;
import xsna.l92;
import xsna.m92;
import xsna.ya1;
import xsna.zcl;

/* compiled from: FrameworkImplHelper.kt */
/* loaded from: classes12.dex */
public final class FrameworkImplHelper {
    public static final Companion Companion = new Companion(null);

    /* compiled from: FrameworkImplHelper.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
            GetCredentialRequest build;
            CredentialOption.Builder isSystemProviderRequired;
            CredentialOption.Builder allowedProviders;
            CredentialOption build2;
            ya1.h();
            GetCredentialRequest.Builder b = k92.b(androidx.credentials.GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
            for (androidx.credentials.CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
                m92.g();
                isSystemProviderRequired = l92.c(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired());
                allowedProviders = isSystemProviderRequired.setAllowedProviders(credentialOption.getAllowedProviders());
                build2 = allowedProviders.build();
                b.addCredentialOption(build2);
            }
            setOriginForGetRequest(getCredentialRequest, b);
            build = b.build();
            return build;
        }

        public final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
            Credential credential;
            String type;
            Bundle data;
            credential = getCredentialResponse.getCredential();
            Credential.Companion companion = androidx.credentials.Credential.Companion;
            type = credential.getType();
            data = credential.getData();
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        @SuppressLint({"MissingPermission"})
        public final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
            if (getCredentialRequest.getOrigin() != null) {
                builder.setOrigin(getCredentialRequest.getOrigin());
            }
        }

        private Companion() {
        }
    }

    public static final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return Companion.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    public static final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
        return Companion.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    @SuppressLint({"MissingPermission"})
    public static final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        Companion.setOriginForGetRequest(getCredentialRequest, builder);
    }
}

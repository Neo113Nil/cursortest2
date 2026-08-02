package androidx.credentials.internal;

import android.credentials.Credential;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import androidx.credentials.Credential;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.provider.Action$Companion$$ExternalSyntheticApiModelOutline0;
import io.sentry.protocol.Response;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FrameworkImplHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper;", "", "()V", "Companion", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FrameworkImplHelper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    public static final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest getCredentialRequest) {
        return INSTANCE.convertGetRequestToFrameworkClass(getCredentialRequest);
    }

    @JvmStatic
    public static final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse getCredentialResponse) {
        return INSTANCE.convertGetResponseToJetpackClass(getCredentialResponse);
    }

    @JvmStatic
    public static final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        INSTANCE.setOriginForGetRequest(getCredentialRequest, builder);
    }

    /* compiled from: FrameworkImplHelper.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Landroidx/credentials/internal/FrameworkImplHelper$Companion;", "", "()V", "convertGetRequestToFrameworkClass", "Landroid/credentials/GetCredentialRequest;", "request", "Landroidx/credentials/GetCredentialRequest;", "convertGetResponseToJetpackClass", "Landroidx/credentials/GetCredentialResponse;", Response.TYPE, "Landroid/credentials/GetCredentialResponse;", "setOriginForGetRequest", "", "builder", "Landroid/credentials/GetCredentialRequest$Builder;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GetCredentialResponse convertGetResponseToJetpackClass(android.credentials.GetCredentialResponse response) {
            Credential credential;
            String type;
            Bundle data;
            Intrinsics.checkNotNullParameter(response, "response");
            credential = response.getCredential();
            Intrinsics.checkNotNullExpressionValue(credential, "response.credential");
            Credential.Companion companion = androidx.credentials.Credential.INSTANCE;
            type = credential.getType();
            Intrinsics.checkNotNullExpressionValue(type, "credential.type");
            data = credential.getData();
            Intrinsics.checkNotNullExpressionValue(data, "credential.data");
            return new GetCredentialResponse(companion.createFrom(type, data));
        }

        @JvmStatic
        public final GetCredentialRequest convertGetRequestToFrameworkClass(androidx.credentials.GetCredentialRequest request) {
            GetCredentialRequest build;
            CredentialOption.Builder isSystemProviderRequired;
            CredentialOption.Builder allowedProviders;
            CredentialOption build2;
            Intrinsics.checkNotNullParameter(request, "request");
            Action$Companion$$ExternalSyntheticApiModelOutline0.m9229m();
            GetCredentialRequest.Builder m9211m = Action$Companion$$ExternalSyntheticApiModelOutline0.m9211m(androidx.credentials.GetCredentialRequest.INSTANCE.getRequestMetadataBundle(request));
            for (androidx.credentials.CredentialOption credentialOption : request.getCredentialOptions()) {
                Action$Companion$$ExternalSyntheticApiModelOutline0.m9234m$1();
                isSystemProviderRequired = Action$Companion$$ExternalSyntheticApiModelOutline0.m9207m(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.getIsSystemProviderRequired());
                allowedProviders = isSystemProviderRequired.setAllowedProviders(credentialOption.getAllowedProviders());
                build2 = allowedProviders.build();
                m9211m.addCredentialOption(build2);
            }
            setOriginForGetRequest(request, m9211m);
            build = m9211m.build();
            Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
            return build;
        }

        @JvmStatic
        public final void setOriginForGetRequest(androidx.credentials.GetCredentialRequest request, GetCredentialRequest.Builder builder) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (request.getOrigin() != null) {
                builder.setOrigin(request.getOrigin());
            }
        }
    }
}

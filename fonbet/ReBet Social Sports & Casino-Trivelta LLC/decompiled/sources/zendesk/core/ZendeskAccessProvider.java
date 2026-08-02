package zendesk.core;

import androidx.annotation.NonNull;
import java.io.IOException;
import ld.AbstractC5459a;
import retrofit2.Response;

/* loaded from: classes5.dex */
class ZendeskAccessProvider implements AccessProvider {
    private static final String LOG_TAG = "ZendeskAccessProvider";
    private final AccessService accessService;
    private final IdentityManager identityManager;

    public ZendeskAccessProvider(@NonNull IdentityManager identityManager, @NonNull AccessService accessService) {
        this.identityManager = identityManager;
        this.accessService = accessService;
    }

    @Override // zendesk.core.AccessProvider
    public Response<AuthenticationResponse> getAuthTokenViaAnonymous(@NonNull AnonymousIdentity anonymousIdentity) {
        AbstractC5459a.b(LOG_TAG, "Requesting an access token for anonymous identity.", new Object[0]);
        try {
            return this.accessService.getAuthTokenForAnonymous(new AuthenticationRequestWrapper(new ApiAnonymousIdentity(anonymousIdentity, this.identityManager.getSdkGuid()))).execute();
        } catch (IOException e10) {
            AbstractC5459a.c(LOG_TAG, e10.getMessage(), e10, new Object[0]);
            return null;
        }
    }

    @Override // zendesk.core.AccessProvider
    public Response<AuthenticationResponse> getAuthTokenViaJwt(@NonNull JwtIdentity jwtIdentity) {
        AbstractC5459a.b(LOG_TAG, "Requesting an access token for jwt identity.", new Object[0]);
        if (com.zendesk.util.d.c(jwtIdentity.getJwtUserIdentifier())) {
            AbstractC5459a.d(LOG_TAG, AccessProvider.NO_JWT_ERROR_MESSAGE, new Object[0]);
            return null;
        }
        try {
            return this.accessService.getAuthTokenForJwt(new AuthenticationRequestWrapper(jwtIdentity)).execute();
        } catch (IOException e10) {
            AbstractC5459a.c(LOG_TAG, e10.getMessage(), e10, new Object[0]);
            return null;
        }
    }
}

package zendesk.core;

import com.plaid.internal.EnumC3631g;
import ld.AbstractC5459a;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Protocol;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
class ZendeskAccessInterceptor implements Interceptor {
    private static final String EMPTY_JSON = "{}";
    private static final String LOG_TAG = "ZendeskAccessInterceptor";
    private static final int RETRY_LIMIT = 3;
    private AccessProvider accessProvider;
    private CoreSettingsStorage coreSettingsStorage;
    private IdentityManager identityManager;
    private int retryCounter;
    private Storage storage;

    public ZendeskAccessInterceptor(IdentityManager identityManager, AccessProvider accessProvider, Storage storage, CoreSettingsStorage coreSettingsStorage) {
        this.identityManager = identityManager;
        this.accessProvider = accessProvider;
        this.storage = storage;
        this.coreSettingsStorage = coreSettingsStorage;
    }

    private Response errorResponse(Interceptor.Chain chain, String str) {
        return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_2).code(400).message(str).body(ResponseBody.create(MediaType.parse(Constants.TEXT_JSON), EMPTY_JSON)).build();
    }

    public static String getErrorLogMessage(AuthenticationType authenticationType, Identity identity) {
        StringBuilder sb2 = new StringBuilder(EnumC3631g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
        sb2.append("The expected type of authentication is ");
        if (authenticationType == null) {
            sb2.append("null. Check that settings have been downloaded.");
        } else if (authenticationType == AuthenticationType.ANONYMOUS) {
            sb2.append("anonymous.");
        } else if (authenticationType == AuthenticationType.JWT) {
            sb2.append("jwt.");
        }
        sb2.append('\n');
        sb2.append("The local identity is");
        if (identity == null) {
            sb2.append(" not");
        }
        sb2.append(" present.\n");
        if (identity != null) {
            sb2.append("The local identity is ");
            if (identity instanceof AnonymousIdentity) {
                sb2.append("anonymous.");
            } else if (identity instanceof JwtIdentity) {
                sb2.append("jwt.");
            } else {
                sb2.append("unknown.");
            }
        }
        return sb2.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        retrofit2.Response<AuthenticationResponse> authTokenViaJwt;
        Identity identity = this.identityManager.getIdentity();
        AuthenticationType authentication = this.coreSettingsStorage.getCoreSettings().getAuthentication();
        if (this.identityManager.getStoredAccessTokenAsBearerToken() != null) {
            AbstractC5459a.b(LOG_TAG, "Access token present, no need to intercept.", new Object[0]);
            return chain.proceed(chain.request());
        }
        AbstractC5459a.b(LOG_TAG, "Access token is required, intercepting.", new Object[0]);
        if (AuthenticationType.ANONYMOUS == authentication && (identity instanceof AnonymousIdentity)) {
            AbstractC5459a.b(LOG_TAG, "Anonymous Identity found. Requesting and storing auth token.", new Object[0]);
            authTokenViaJwt = this.accessProvider.getAuthTokenViaAnonymous((AnonymousIdentity) identity);
        } else {
            if (AuthenticationType.JWT != authentication || !(identity instanceof JwtIdentity)) {
                this.storage.clear();
                String errorLogMessage = getErrorLogMessage(authentication, identity);
                AbstractC5459a.d(LOG_TAG, errorLogMessage, new Object[0]);
                return errorResponse(chain, errorLogMessage);
            }
            AbstractC5459a.b(LOG_TAG, "JWT Identity found. Requesting and storing auth token.", new Object[0]);
            authTokenViaJwt = this.accessProvider.getAuthTokenViaJwt((JwtIdentity) identity);
        }
        if (authTokenViaJwt == null) {
            return errorResponse(chain, "Response was null, failed to auth user.");
        }
        if (authTokenViaJwt.code() == 409) {
            int i10 = this.retryCounter;
            if (i10 >= 3) {
                return errorResponse(chain, "Response was 409, failed to auth user.");
            }
            this.retryCounter = i10 + 1;
            return intercept(chain);
        }
        if (authTokenViaJwt.body() == null) {
            return errorResponse(chain, "Response body was null, failed to auth user.");
        }
        AccessToken authentication2 = authTokenViaJwt.body().getAuthentication();
        if (authentication2 != null) {
            this.identityManager.storeAccessToken(authentication2);
        }
        this.retryCounter = 0;
        return chain.proceed(chain.request());
    }
}

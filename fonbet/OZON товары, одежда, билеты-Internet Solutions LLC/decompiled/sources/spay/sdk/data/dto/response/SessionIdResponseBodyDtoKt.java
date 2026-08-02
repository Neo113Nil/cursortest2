package spay.sdk.data.dto.response;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.SessionIdResponseBody;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toDto", "Lspay/sdk/data/dto/response/SessionIdResponseBodyDto;", "Lspay/sdk/domain/model/response/SessionIdResponseBody;", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SessionIdResponseBodyDtoKt {
    @NotNull
    public static final SessionIdResponseBodyDto toDto(@NotNull SessionIdResponseBody sessionIdResponseBody) {
        Intrinsics.checkNotNullParameter(sessionIdResponseBody, "<this>");
        return new SessionIdResponseBodyDto(sessionIdResponseBody.getDeeplink(), sessionIdResponseBody.getState(), sessionIdResponseBody.getSessionId(), sessionIdResponseBody.getClientId(), sessionIdResponseBody.getNonce(), sessionIdResponseBody.isBnplEnabled(), sessionIdResponseBody.getCodeChallengeMethod(), sessionIdResponseBody.getCodeChallenge(), sessionIdResponseBody.getScope(), sessionIdResponseBody.getRefreshTokenIsActive(), sessionIdResponseBody.getClientIdPhone());
    }
}

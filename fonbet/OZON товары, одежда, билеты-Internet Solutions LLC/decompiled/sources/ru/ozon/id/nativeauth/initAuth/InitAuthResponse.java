package ru.ozon.id.nativeauth.initAuth;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/id/nativeauth/initAuth/InitAuthResponse;", "", "authToken", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "<init>", "(Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;)V", "getAuthToken", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InitAuthResponse {

    @NotNull
    private final AuthTokenDTO authToken;

    public InitAuthResponse(@NotNull AuthTokenDTO authToken) {
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        this.authToken = authToken;
    }

    public static /* synthetic */ InitAuthResponse copy$default(InitAuthResponse initAuthResponse, AuthTokenDTO authTokenDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            authTokenDTO = initAuthResponse.authToken;
        }
        return initAuthResponse.copy(authTokenDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final InitAuthResponse copy(@NotNull AuthTokenDTO authToken) {
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        return new InitAuthResponse(authToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InitAuthResponse) && Intrinsics.d(this.authToken, ((InitAuthResponse) other).authToken);
    }

    @NotNull
    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    public int hashCode() {
        return this.authToken.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitAuthResponse(authToken=" + this.authToken + ")";
    }
}

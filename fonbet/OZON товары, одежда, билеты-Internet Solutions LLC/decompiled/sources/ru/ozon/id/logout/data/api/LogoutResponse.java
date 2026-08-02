package ru.ozon.id.logout.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.id.nativeauth.data.models.AuthTokenDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/id/logout/data/api/LogoutResponse;", "", "deeplink", "", "authToken", "Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;)V", "getDeeplink", "()Ljava/lang/String;", "getAuthToken", "()Lru/ozon/id/nativeauth/data/models/AuthTokenDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LogoutResponse {
    private final AuthTokenDTO authToken;
    private final String deeplink;

    public LogoutResponse(String str, AuthTokenDTO authTokenDTO) {
        this.deeplink = str;
        this.authToken = authTokenDTO;
    }

    public static /* synthetic */ LogoutResponse copy$default(LogoutResponse logoutResponse, String str, AuthTokenDTO authTokenDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = logoutResponse.deeplink;
        }
        if ((i11 & 2) != 0) {
            authTokenDTO = logoutResponse.authToken;
        }
        return logoutResponse.copy(str, authTokenDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: component2, reason: from getter */
    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final LogoutResponse copy(String deeplink, AuthTokenDTO authToken) {
        return new LogoutResponse(deeplink, authToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LogoutResponse)) {
            return false;
        }
        LogoutResponse logoutResponse = (LogoutResponse) other;
        return Intrinsics.d(this.deeplink, logoutResponse.deeplink) && Intrinsics.d(this.authToken, logoutResponse.authToken);
    }

    public final AuthTokenDTO getAuthToken() {
        return this.authToken;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    public int hashCode() {
        String str = this.deeplink;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        AuthTokenDTO authTokenDTO = this.authToken;
        return hashCode + (authTokenDTO != null ? authTokenDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LogoutResponse(deeplink=" + this.deeplink + ", authToken=" + this.authToken + ")";
    }
}

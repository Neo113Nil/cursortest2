package ru.ozon.id.nativeauth.crossApp.migration.data.model;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/migration/data/model/PublicKeyBindMobileCredentials;", "", "authPublicKey", "", "fromAppName", "accessToken", "refreshToken", "idpToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthPublicKey", "()Ljava/lang/String;", "getFromAppName", "getAccessToken", "getRefreshToken", "getIdpToken", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PublicKeyBindMobileCredentials {
    private final String accessToken;

    @NotNull
    private final String authPublicKey;
    private final String fromAppName;
    private final String idpToken;
    private final String refreshToken;

    public PublicKeyBindMobileCredentials(@NotNull String authPublicKey, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(authPublicKey, "authPublicKey");
        this.authPublicKey = authPublicKey;
        this.fromAppName = str;
        this.accessToken = str2;
        this.refreshToken = str3;
        this.idpToken = str4;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getAuthPublicKey() {
        return this.authPublicKey;
    }

    public final String getFromAppName() {
        return this.fromAppName;
    }

    public final String getIdpToken() {
        return this.idpToken;
    }

    public final String getRefreshToken() {
        return this.refreshToken;
    }

    public /* synthetic */ PublicKeyBindMobileCredentials(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5);
    }
}

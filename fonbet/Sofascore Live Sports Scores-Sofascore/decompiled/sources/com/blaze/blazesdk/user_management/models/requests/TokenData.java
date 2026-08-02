package com.blaze.blazesdk.user_management.models.requests;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/blaze/blazesdk/user_management/models/requests/TokenData;", "", "accessToken", "", "refreshToken", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessToken", "()Ljava/lang/String;", "getRefreshToken", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TokenData {
    public static final int $stable = 0;

    @b6h("accessToken")
    @NotNull
    private final String accessToken;

    @b6h("refreshToken")
    @NotNull
    private final String refreshToken;

    @b6h("userId")
    @Nullable
    private final String userId;

    public TokenData(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.accessToken = str;
        this.refreshToken = str2;
        this.userId = str3;
    }

    public static /* synthetic */ TokenData copy$default(TokenData tokenData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenData.accessToken;
        }
        if ((i & 2) != 0) {
            str2 = tokenData.refreshToken;
        }
        if ((i & 4) != 0) {
            str3 = tokenData.userId;
        }
        return tokenData.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final TokenData copy(@NotNull String accessToken, @NotNull String refreshToken, @Nullable String userId) {
        accessToken.getClass();
        refreshToken.getClass();
        return new TokenData(accessToken, refreshToken, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) other;
        return Intrinsics.c(this.accessToken, tokenData.accessToken) && Intrinsics.c(this.refreshToken, tokenData.refreshToken) && Intrinsics.c(this.userId, tokenData.userId);
    }

    @NotNull
    public final String getAccessToken() {
        return this.accessToken;
    }

    @NotNull
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int k = o6a.k(this.refreshToken, this.accessToken.hashCode() * 31);
        String str = this.userId;
        return k + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("TokenData(accessToken=");
        sb.append(this.accessToken);
        sb.append(", refreshToken=");
        sb.append(this.refreshToken);
        sb.append(", userId=");
        return lnb.q(sb, this.userId, ')');
    }
}

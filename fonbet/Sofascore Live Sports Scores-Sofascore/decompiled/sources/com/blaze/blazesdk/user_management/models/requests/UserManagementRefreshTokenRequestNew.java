package com.blaze.blazesdk.user_management.models.requests;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.lnb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/blaze/blazesdk/user_management/models/requests/UserManagementRefreshTokenRequestNew;", "", "tokenData", "Lcom/blaze/blazesdk/user_management/models/requests/TokenData;", "externalUserId", "", "<init>", "(Lcom/blaze/blazesdk/user_management/models/requests/TokenData;Ljava/lang/String;)V", "getTokenData", "()Lcom/blaze/blazesdk/user_management/models/requests/TokenData;", "getExternalUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserManagementRefreshTokenRequestNew {
    public static final int $stable = 0;

    @b6h("externalId")
    @Nullable
    private final String externalUserId;

    @b6h("tokenData")
    @NotNull
    private final TokenData tokenData;

    public UserManagementRefreshTokenRequestNew(@NotNull TokenData tokenData, @Nullable String str) {
        tokenData.getClass();
        this.tokenData = tokenData;
        this.externalUserId = str;
    }

    public static /* synthetic */ UserManagementRefreshTokenRequestNew copy$default(UserManagementRefreshTokenRequestNew userManagementRefreshTokenRequestNew, TokenData tokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            tokenData = userManagementRefreshTokenRequestNew.tokenData;
        }
        if ((i & 2) != 0) {
            str = userManagementRefreshTokenRequestNew.externalUserId;
        }
        return userManagementRefreshTokenRequestNew.copy(tokenData, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TokenData getTokenData() {
        return this.tokenData;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @NotNull
    public final UserManagementRefreshTokenRequestNew copy(@NotNull TokenData tokenData, @Nullable String externalUserId) {
        tokenData.getClass();
        return new UserManagementRefreshTokenRequestNew(tokenData, externalUserId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserManagementRefreshTokenRequestNew)) {
            return false;
        }
        UserManagementRefreshTokenRequestNew userManagementRefreshTokenRequestNew = (UserManagementRefreshTokenRequestNew) other;
        return Intrinsics.c(this.tokenData, userManagementRefreshTokenRequestNew.tokenData) && Intrinsics.c(this.externalUserId, userManagementRefreshTokenRequestNew.externalUserId);
    }

    @Nullable
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @NotNull
    public final TokenData getTokenData() {
        return this.tokenData;
    }

    public int hashCode() {
        int hashCode = this.tokenData.hashCode() * 31;
        String str = this.externalUserId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("UserManagementRefreshTokenRequestNew(tokenData=");
        sb.append(this.tokenData);
        sb.append(", externalUserId=");
        return lnb.q(sb, this.externalUserId, ')');
    }
}

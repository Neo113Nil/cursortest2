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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/blaze/blazesdk/user_management/models/requests/UserManagementExternalIdRequest;", "", "externalUserId", "", "<init>", "(Ljava/lang/String;)V", "getExternalUserId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserManagementExternalIdRequest {
    public static final int $stable = 0;

    @b6h("externalId")
    @Nullable
    private final String externalUserId;

    public UserManagementExternalIdRequest(@Nullable String str) {
        this.externalUserId = str;
    }

    public static /* synthetic */ UserManagementExternalIdRequest copy$default(UserManagementExternalIdRequest userManagementExternalIdRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userManagementExternalIdRequest.externalUserId;
        }
        return userManagementExternalIdRequest.copy(str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    @NotNull
    public final UserManagementExternalIdRequest copy(@Nullable String externalUserId) {
        return new UserManagementExternalIdRequest(externalUserId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserManagementExternalIdRequest) && Intrinsics.c(this.externalUserId, ((UserManagementExternalIdRequest) other).externalUserId);
    }

    @Nullable
    public final String getExternalUserId() {
        return this.externalUserId;
    }

    public int hashCode() {
        String str = this.externalUserId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return lnb.q(new StringBuilder("UserManagementExternalIdRequest(externalUserId="), this.externalUserId, ')');
    }
}

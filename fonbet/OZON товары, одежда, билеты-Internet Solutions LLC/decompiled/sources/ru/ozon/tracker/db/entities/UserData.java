package ru.ozon.tracker.db.entities;

import G.g;
import Pk0.c;
import Sc.InterfaceC3999a;
import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\fJ7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0018J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\u0007HÆ\u0003JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001e\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lru/ozon/tracker/db/entities/UserData;", "", "abGroup", "", "regionId", "", "userId", "", "companyId", "userRoles", "<init>", "(IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "(IJLjava/lang/String;Ljava/lang/Integer;)V", "getAbGroup", "()I", "getRegionId", "()J", "getUserId", "()Ljava/lang/String;", "getCompanyId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUserRoles", "copy", "(IJLjava/lang/String;Ljava/lang/Integer;)Lru/ozon/tracker/db/entities/UserData;", "id", "getId", "setId", "(J)V", "component1", "component2", "component3", "component4", "component5", "(IJLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/tracker/db/entities/UserData;", "equals", "", "other", "hashCode", "toString", "Companion", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserData {

    @NotNull
    public static final String TABLE_NAME = "user_data";
    private final int abGroup;
    private final Integer companyId;
    private long id;
    private final long regionId;

    @NotNull
    private final String userId;

    @NotNull
    private final String userRoles;

    public UserData(int i11, long j11, @NotNull String userId, Integer num, @NotNull String userRoles) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userRoles, "userRoles");
        this.abGroup = i11;
        this.regionId = j11;
        this.userId = userId;
        this.companyId = num;
        this.userRoles = userRoles;
        this.id = 1L;
    }

    public static /* synthetic */ UserData copy$default(UserData userData, int i11, long j11, String str, Integer num, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = userData.abGroup;
        }
        if ((i12 & 2) != 0) {
            j11 = userData.regionId;
        }
        if ((i12 & 4) != 0) {
            str = userData.userId;
        }
        if ((i12 & 8) != 0) {
            num = userData.companyId;
        }
        if ((i12 & 16) != 0) {
            str2 = userData.userRoles;
        }
        String str3 = str2;
        String str4 = str;
        return userData.copy(i11, j11, str4, num, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAbGroup() {
        return this.abGroup;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRegionId() {
        return this.regionId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getCompanyId() {
        return this.companyId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getUserRoles() {
        return this.userRoles;
    }

    @NotNull
    public final UserData copy(int abGroup, long regionId, @NotNull String userId, Integer companyId, @NotNull String userRoles) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userRoles, "userRoles");
        return new UserData(abGroup, regionId, userId, companyId, userRoles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserData)) {
            return false;
        }
        UserData userData = (UserData) other;
        return this.abGroup == userData.abGroup && this.regionId == userData.regionId && Intrinsics.d(this.userId, userData.userId) && Intrinsics.d(this.companyId, userData.companyId) && Intrinsics.d(this.userRoles, userData.userRoles);
    }

    public final int getAbGroup() {
        return this.abGroup;
    }

    public final Integer getCompanyId() {
        return this.companyId;
    }

    public final long getId() {
        return this.id;
    }

    public final long getRegionId() {
        return this.regionId;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getUserRoles() {
        return this.userRoles;
    }

    public int hashCode() {
        int a11 = g.a(c.a(Integer.hashCode(this.abGroup) * 31, 31, this.regionId), 31, this.userId);
        Integer num = this.companyId;
        return this.userRoles.hashCode() + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final void setId(long j11) {
        this.id = j11;
    }

    @NotNull
    public String toString() {
        int i11 = this.abGroup;
        long j11 = this.regionId;
        String str = this.userId;
        Integer num = this.companyId;
        String str2 = this.userRoles;
        StringBuilder sb2 = new StringBuilder("UserData(abGroup=");
        sb2.append(i11);
        sb2.append(", regionId=");
        sb2.append(j11);
        sb2.append(", userId=");
        sb2.append(str);
        sb2.append(", companyId=");
        sb2.append(num);
        return C6594f.a(", userRoles=", str2, ")", sb2);
    }

    public static /* synthetic */ UserData copy$default(UserData userData, int i11, long j11, String str, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = userData.abGroup;
        }
        if ((i12 & 2) != 0) {
            j11 = userData.regionId;
        }
        if ((i12 & 4) != 0) {
            str = userData.userId;
        }
        if ((i12 & 8) != 0) {
            num = userData.companyId;
        }
        return userData.copy(i11, j11, str, num);
    }

    @InterfaceC3999a
    public final /* synthetic */ UserData copy(int abGroup, long regionId, String userId, Integer companyId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return copy(abGroup, regionId, userId, companyId, this.userRoles);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UserData(int i11, long j11, @NotNull String userId, Integer num) {
        this(i11, j11, userId, num, "");
        Intrinsics.checkNotNullParameter(userId, "userId");
    }
}

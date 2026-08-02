package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.badges.BadgeItem;
import xsna.epx;

/* compiled from: BadgeInfo.kt */
/* loaded from: classes18.dex */
public final class BadgeInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgeInfo> CREATOR = new a();
    public final boolean b;
    public final BadgeItem.BadgeLockStatus c;
    public final BadgeUnlockInfo d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeInfo a(Serializer serializer) {
            return new BadgeInfo(serializer.m(), (BadgeItem.BadgeLockStatus) serializer.C(), (BadgeUnlockInfo) serializer.A(BadgeUnlockInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeInfo[i];
        }
    }

    public BadgeInfo(boolean z, BadgeItem.BadgeLockStatus badgeLockStatus, BadgeUnlockInfo badgeUnlockInfo) {
        this.b = z;
        this.c = badgeLockStatus;
        this.d = badgeUnlockInfo;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.g0(this.c);
        serializer.e0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeInfo)) {
            return false;
        }
        BadgeInfo badgeInfo = (BadgeInfo) obj;
        return this.b == badgeInfo.b && this.c == badgeInfo.c && epx.f(this.d, badgeInfo.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.b) * 31;
        BadgeItem.BadgeLockStatus badgeLockStatus = this.c;
        int hashCode2 = (hashCode + (badgeLockStatus == null ? 0 : badgeLockStatus.hashCode())) * 31;
        BadgeUnlockInfo badgeUnlockInfo = this.d;
        return hashCode2 + (badgeUnlockInfo != null ? badgeUnlockInfo.hashCode() : 0);
    }

    public final String toString() {
        return "BadgeInfo(isDisabled=" + this.b + ", lockStatus=" + this.c + ", unlockInfo=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}

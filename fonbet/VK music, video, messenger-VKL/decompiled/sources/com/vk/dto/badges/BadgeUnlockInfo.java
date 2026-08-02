package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;

/* compiled from: BadgeUnlockInfo.kt */
/* loaded from: classes18.dex */
public final class BadgeUnlockInfo implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgeUnlockInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final UnlockButton d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeUnlockInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeUnlockInfo a(Serializer serializer) {
            return new BadgeUnlockInfo(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeUnlockInfo[i];
        }
    }

    public BadgeUnlockInfo(String str, String str2, UnlockButton unlockButton) {
        this.b = str;
        this.c = str2;
        this.d = unlockButton;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.i0(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeUnlockInfo)) {
            return false;
        }
        BadgeUnlockInfo badgeUnlockInfo = (BadgeUnlockInfo) obj;
        return epx.f(this.b, badgeUnlockInfo.b) && epx.f(this.c, badgeUnlockInfo.c) && epx.f(this.d, badgeUnlockInfo.d);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        UnlockButton unlockButton = this.d;
        return a2 + (unlockButton == null ? 0 : unlockButton.hashCode());
    }

    public final String toString() {
        return "BadgeUnlockInfo(title=" + this.b + ", text=" + this.c + ", button=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgeUnlockInfo(Serializer serializer) {
        this(r0, r2 != null ? r2 : "", (UnlockButton) serializer.G(UnlockButton.class.getClassLoader()));
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
    }
}

package com.vk.superapp.api.dto.menu;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.qxm0;
import xsna.shy;

/* compiled from: BadgeInfo.kt */
/* loaded from: classes6.dex */
public final class BadgeInfo implements Parcelable {
    public static final a CREATOR = new a();
    public static final BadgeInfo h = new BadgeInfo("", false, false, 0, false, false);
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;

    /* compiled from: BadgeInfo.kt */
    public static final class a implements Parcelable.Creator<BadgeInfo> {
        @Override // android.os.Parcelable.Creator
        public final BadgeInfo createFromParcel(Parcel parcel) {
            return new BadgeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgeInfo[] newArray(int i) {
            return new BadgeInfo[i];
        }
    }

    public BadgeInfo() {
        this(null, false, false, 0, false, false, 63, null);
    }

    public static BadgeInfo a(BadgeInfo badgeInfo, String str, boolean z, boolean z2, int i, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            str = badgeInfo.b;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            z = badgeInfo.c;
        }
        boolean z4 = z;
        if ((i2 & 4) != 0) {
            z2 = badgeInfo.d;
        }
        boolean z5 = z2;
        boolean z6 = badgeInfo.f;
        if ((i2 & 32) != 0) {
            z3 = badgeInfo.g;
        }
        badgeInfo.getClass();
        return new BadgeInfo(str2, z4, z5, i, z6, z3);
    }

    public final int d() {
        return this.e;
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
        return epx.f(this.b, badgeInfo.b) && this.c == badgeInfo.c && this.d == badgeInfo.d && this.e == badgeInfo.e && this.f == badgeInfo.f && this.g == badgeInfo.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeInfo(promo=");
        sb.append(this.b);
        sb.append(", isNew=");
        sb.append(this.c);
        sb.append(", hasDot=");
        sb.append(this.d);
        sb.append(", counter=");
        sb.append(this.e);
        sb.append(", isFavorite=");
        sb.append(this.f);
        sb.append(", isAvailableInMessenger=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public BadgeInfo(String str, boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = z3;
        this.g = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BadgeInfo(java.lang.String r2, boolean r3, boolean r4, int r5, boolean r6, boolean r7, int r8, xsna.zcl r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r3 = r0
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.api.dto.menu.BadgeInfo.<init>(java.lang.String, boolean, boolean, int, boolean, boolean, int, xsna.zcl):void");
    }

    public BadgeInfo(Parcel parcel) {
        this(parcel.readString(), qxm0.v(parcel), qxm0.v(parcel), parcel.readInt(), qxm0.v(parcel), qxm0.v(parcel));
    }
}

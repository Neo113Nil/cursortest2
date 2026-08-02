package com.vk.dto.badges;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgeItem.kt */
/* loaded from: classes18.dex */
public final class BadgeItem implements Serializer.StreamParcelable {
    public static final Serializer.c<BadgeItem> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final BadgeImage e;
    public final Integer f;
    public final BadgeLockStatus g;
    public final int h;
    public final Integer i;
    public final Integer j;
    public final BadgeType k;
    public final String l;
    public final BadgeUnlockInfo m;
    public final boolean n;
    public final BadgeStyle o;
    public final boolean p;
    public final String q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgeItem.kt */
    public static final class BadgeLockStatus {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeLockStatus[] $VALUES;
        public static final a Companion;
        public static final BadgeLockStatus LOCKED;
        public static final BadgeLockStatus NONE;
        public static final BadgeLockStatus UNLOCKED;
        private final int value;

        /* compiled from: BadgeItem.kt */
        public static final class a {
            public static BadgeLockStatus a(int i) {
                return i != 0 ? i != 1 ? i != 2 ? BadgeLockStatus.NONE : BadgeLockStatus.UNLOCKED : BadgeLockStatus.LOCKED : BadgeLockStatus.NONE;
            }
        }

        static {
            BadgeLockStatus badgeLockStatus = new BadgeLockStatus("NONE", 0, 0);
            NONE = badgeLockStatus;
            BadgeLockStatus badgeLockStatus2 = new BadgeLockStatus("LOCKED", 1, 1);
            LOCKED = badgeLockStatus2;
            BadgeLockStatus badgeLockStatus3 = new BadgeLockStatus("UNLOCKED", 2, 2);
            UNLOCKED = badgeLockStatus3;
            BadgeLockStatus[] badgeLockStatusArr = {badgeLockStatus, badgeLockStatus2, badgeLockStatus3};
            $VALUES = badgeLockStatusArr;
            $ENTRIES = new asp(badgeLockStatusArr);
            Companion = new a();
        }

        public BadgeLockStatus(String str, int i, int i2) {
            this.value = i2;
        }

        public static BadgeLockStatus valueOf(String str) {
            return (BadgeLockStatus) Enum.valueOf(BadgeLockStatus.class, str);
        }

        public static BadgeLockStatus[] values() {
            return (BadgeLockStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: BadgeItem.kt */
    public static final class BadgeStyle implements Serializer.StreamParcelable {
        public static final Serializer.c<BadgeStyle> CREATOR = new a();
        public final Integer b;
        public final Integer c;
        public final Integer d;
        public final Integer e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<BadgeStyle> {
            @Override // com.vk.core.serialize.Serializer.c
            public final BadgeStyle a(Serializer serializer) {
                return new BadgeStyle(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BadgeStyle[i];
            }
        }

        public BadgeStyle() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.V(this.b);
            serializer.V(this.c);
            serializer.V(this.d);
            serializer.V(this.e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }

        public BadgeStyle(Integer num, Integer num2, Integer num3, Integer num4) {
            this.b = num;
            this.c = num2;
            this.d = num3;
            this.e = num4;
        }

        public /* synthetic */ BadgeStyle(Integer num, Integer num2, Integer num3, Integer num4, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4);
        }

        public BadgeStyle(Serializer serializer) {
            this(serializer.v(), serializer.v(), serializer.v(), serializer.v());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgeItem.kt */
    public static final class BadgeType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BadgeType[] $VALUES;
        public static final a Companion;
        public static final BadgeType DISCOUNT;
        public static final BadgeType NEW;
        private final String value;

        /* compiled from: BadgeItem.kt */
        public static final class a {
        }

        static {
            BadgeType badgeType = new BadgeType("NEW", 0, "new");
            NEW = badgeType;
            BadgeType badgeType2 = new BadgeType("DISCOUNT", 1, "discount");
            DISCOUNT = badgeType2;
            BadgeType[] badgeTypeArr = {badgeType, badgeType2};
            $VALUES = badgeTypeArr;
            $ENTRIES = new asp(badgeTypeArr);
            Companion = new a();
        }

        public BadgeType(String str, int i, String str2) {
            this.value = str2;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<BadgeItem> {
        @Override // com.vk.core.serialize.Serializer.c
        public final BadgeItem a(Serializer serializer) {
            return new BadgeItem(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BadgeItem[i];
        }
    }

    public BadgeItem(int i, String str, String str2, BadgeImage badgeImage, Integer num, BadgeLockStatus badgeLockStatus, int i2, Integer num2, Integer num3, BadgeType badgeType, String str3, BadgeUnlockInfo badgeUnlockInfo, boolean z, BadgeStyle badgeStyle, boolean z2, String str4) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = badgeImage;
        this.f = num;
        this.g = badgeLockStatus;
        this.h = i2;
        this.i = num2;
        this.j = num3;
        this.k = badgeType;
        this.l = str3;
        this.m = badgeUnlockInfo;
        this.n = z;
        this.o = badgeStyle;
        this.p = z2;
        this.q = str4;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.i0(this.e);
        serializer.V(this.f);
        serializer.S(this.g.ordinal());
        serializer.S(this.h);
        serializer.V(this.i);
        serializer.V(this.j);
        BadgeType badgeType = this.k;
        serializer.V(badgeType != null ? Integer.valueOf(badgeType.ordinal()) : null);
        serializer.j0(this.l);
        serializer.i0(this.m);
        serializer.L(this.n ? (byte) 1 : (byte) 0);
        serializer.i0(this.o);
        serializer.j0(this.q);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeItem)) {
            return false;
        }
        BadgeItem badgeItem = (BadgeItem) obj;
        return this.b == badgeItem.b && epx.f(this.c, badgeItem.c) && epx.f(this.d, badgeItem.d) && epx.f(this.e, badgeItem.e) && epx.f(this.f, badgeItem.f) && this.g == badgeItem.g && this.h == badgeItem.h && epx.f(this.i, badgeItem.i) && epx.f(this.j, badgeItem.j) && this.k == badgeItem.k && epx.f(this.l, badgeItem.l) && epx.f(this.m, badgeItem.m) && this.n == badgeItem.n && epx.f(this.o, badgeItem.o) && this.p == badgeItem.p && epx.f(this.q, badgeItem.q);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31;
        Integer num = this.f;
        int a2 = shy.a(this.h, (this.g.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31);
        Integer num2 = this.i;
        int hashCode2 = (a2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.j;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        BadgeType badgeType = this.k;
        int hashCode4 = (hashCode3 + (badgeType == null ? 0 : badgeType.hashCode())) * 31;
        String str = this.l;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        BadgeUnlockInfo badgeUnlockInfo = this.m;
        int b = qoy.b((this.o.hashCode() + qoy.b((hashCode5 + (badgeUnlockInfo == null ? 0 : badgeUnlockInfo.hashCode())) * 31, 31, this.n)) * 31, 31, this.p);
        String str2 = this.q;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgeItem(id=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", image=");
        sb.append(this.e);
        sb.append(", limit=");
        sb.append(this.f);
        sb.append(", lockStatus=");
        sb.append(this.g);
        sb.append(", priceCurrent=");
        sb.append(this.h);
        sb.append(", priceRegular=");
        sb.append(this.i);
        sb.append(", priceDiscountPercent=");
        sb.append(this.j);
        sb.append(", badgeType=");
        sb.append(this.k);
        sb.append(", badgeText=");
        sb.append(this.l);
        sb.append(", unlockInfo=");
        sb.append(this.m);
        sb.append(", isDisabled=");
        sb.append(this.n);
        sb.append(", badgeStyle=");
        sb.append(this.o);
        sb.append(", isDonut=");
        sb.append(this.p);
        sb.append(", accessibilityDescription=");
        return ho8.a(sb, this.q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BadgeItem(int r20, java.lang.String r21, java.lang.String r22, com.vk.dto.badges.BadgeImage r23, java.lang.Integer r24, com.vk.dto.badges.BadgeItem.BadgeLockStatus r25, int r26, java.lang.Integer r27, java.lang.Integer r28, com.vk.dto.badges.BadgeItem.BadgeType r29, java.lang.String r30, com.vk.dto.badges.BadgeUnlockInfo r31, boolean r32, com.vk.dto.badges.BadgeItem.BadgeStyle r33, boolean r34, java.lang.String r35, int r36, xsna.zcl r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 32
            if (r1 == 0) goto La
            com.vk.dto.badges.BadgeItem$BadgeLockStatus r1 = com.vk.dto.badges.BadgeItem.BadgeLockStatus.NONE
            r8 = r1
            goto Lc
        La:
            r8 = r25
        Lc:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r26
        L15:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r3 = 0
            if (r1 == 0) goto L1c
            r12 = r3
            goto L1e
        L1c:
            r12 = r29
        L1e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L24
            r13 = r3
            goto L26
        L24:
            r13 = r30
        L26:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L2c
            r15 = r2
            goto L2e
        L2c:
            r15 = r32
        L2e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L4b
            r17 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r10 = r27
            r11 = r28
            r14 = r31
            r16 = r33
            r18 = r35
            r2 = r19
            goto L63
        L4b:
            r17 = r34
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r10 = r27
            r11 = r28
            r14 = r31
            r16 = r33
            r18 = r35
        L63:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.badges.BadgeItem.<init>(int, java.lang.String, java.lang.String, com.vk.dto.badges.BadgeImage, java.lang.Integer, com.vk.dto.badges.BadgeItem$BadgeLockStatus, int, java.lang.Integer, java.lang.Integer, com.vk.dto.badges.BadgeItem$BadgeType, java.lang.String, com.vk.dto.badges.BadgeUnlockInfo, boolean, com.vk.dto.badges.BadgeItem$BadgeStyle, boolean, java.lang.String, int, xsna.zcl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BadgeItem(Serializer serializer) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14 == null ? new BadgeStyle(null, null, null, null, 15, null) : r14, false, serializer.H(), 16384, null);
        BadgeLockStatus badgeLockStatus;
        int u = serializer.u();
        String H = serializer.H();
        H = H == null ? "" : H;
        String H2 = serializer.H();
        String str = H2 != null ? H2 : "";
        BadgeImage badgeImage = (BadgeImage) serializer.G(BadgeImage.class.getClassLoader());
        Integer v = serializer.v();
        try {
            badgeLockStatus = BadgeLockStatus.values()[serializer.u()];
        } catch (Exception unused) {
            badgeLockStatus = BadgeLockStatus.NONE;
        }
        int u2 = serializer.u();
        Integer v2 = serializer.v();
        Integer v3 = serializer.v();
        Integer v4 = serializer.v();
        BadgeType badgeType = null;
        if (v4 != null) {
            try {
                badgeType = BadgeType.values()[v4.intValue()];
            } catch (Exception unused2) {
            }
        }
        BadgeType badgeType2 = badgeType;
        String H3 = serializer.H();
        BadgeUnlockInfo badgeUnlockInfo = (BadgeUnlockInfo) serializer.G(BadgeUnlockInfo.class.getClassLoader());
        boolean m = serializer.m();
        BadgeStyle badgeStyle = (BadgeStyle) serializer.G(BadgeStyle.class.getClassLoader());
    }
}

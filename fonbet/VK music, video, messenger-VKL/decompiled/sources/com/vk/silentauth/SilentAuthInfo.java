package com.vk.silentauth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.fkq0;
import xsna.fw3;
import xsna.gzs;
import xsna.ho8;
import xsna.ozl;
import xsna.s3q0;
import xsna.shy;
import xsna.urd0;

/* compiled from: SilentAuthInfo.kt */
/* loaded from: classes5.dex */
public final class SilentAuthInfo implements Parcelable {
    public static final Parcelable.Creator<SilentAuthInfo> CREATOR = new a();
    public final UserId b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Bundle m;
    public final int n;
    public final String o;
    public final String p;
    public final List<SilentTokenProviderInfo> q;
    public final int r;
    public final String s;

    /* compiled from: SilentAuthInfo.kt */
    public static final class a implements Parcelable.Creator<SilentAuthInfo> {
        @Override // android.os.Parcelable.Creator
        public final SilentAuthInfo createFromParcel(Parcel parcel) {
            return new SilentAuthInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SilentAuthInfo[] newArray(int i) {
            return new SilentAuthInfo[i];
        }
    }

    public SilentAuthInfo(UserId userId, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bundle bundle, int i, String str10, String str11, List<SilentTokenProviderInfo> list, int i2, String str12) {
        this.b = userId;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = bundle;
        this.n = i;
        this.o = str10;
        this.p = str11;
        this.q = list;
        this.r = i2;
        this.s = str12;
    }

    public static SilentAuthInfo a(SilentAuthInfo silentAuthInfo, String str, String str2, long j, String str3, int i) {
        return new SilentAuthInfo(silentAuthInfo.b, (i & 2) != 0 ? silentAuthInfo.c : str, (i & 4) != 0 ? silentAuthInfo.d : str2, (i & 8) != 0 ? silentAuthInfo.e : j, silentAuthInfo.f, silentAuthInfo.g, silentAuthInfo.h, silentAuthInfo.i, silentAuthInfo.j, silentAuthInfo.k, silentAuthInfo.l, silentAuthInfo.m, silentAuthInfo.n, silentAuthInfo.o, silentAuthInfo.p, silentAuthInfo.q, silentAuthInfo.r, (i & 131072) != 0 ? silentAuthInfo.s : str3);
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle.getBoolean("isExchangeUser");
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SilentAuthInfo)) {
            return false;
        }
        SilentAuthInfo silentAuthInfo = (SilentAuthInfo) obj;
        return epx.f(this.b, silentAuthInfo.b) && epx.f(this.c, silentAuthInfo.c) && epx.f(this.d, silentAuthInfo.d) && this.e == silentAuthInfo.e && epx.f(this.f, silentAuthInfo.f) && epx.f(this.g, silentAuthInfo.g) && epx.f(this.h, silentAuthInfo.h) && epx.f(this.i, silentAuthInfo.i) && epx.f(this.j, silentAuthInfo.j) && epx.f(this.k, silentAuthInfo.k) && epx.f(this.l, silentAuthInfo.l) && epx.f(this.m, silentAuthInfo.m) && this.n == silentAuthInfo.n && epx.f(this.o, silentAuthInfo.o) && epx.f(this.p, silentAuthInfo.p) && epx.f(this.q, silentAuthInfo.q) && this.r == silentAuthInfo.r && epx.f(this.s, silentAuthInfo.s);
    }

    public final int hashCode() {
        int a2 = urd0.a(bh10.a(urd0.a(urd0.a(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int a3 = urd0.a((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.j);
        String str4 = this.k;
        int hashCode3 = (a3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Bundle bundle = this.m;
        int a4 = urd0.a(shy.a(this.n, (hashCode4 + (bundle == null ? 0 : bundle.hashCode())) * 31, 31), 31, this.o);
        String str6 = this.p;
        int a5 = shy.a(this.r, fw3.a((a4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.q), 31);
        String str7 = this.s;
        return a5 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SilentAuthInfo(userId=");
        sb.append(this.b);
        sb.append(", uuid=");
        sb.append(this.c);
        sb.append(", token=");
        sb.append(this.d);
        sb.append(", expireTime=");
        sb.append(this.e);
        sb.append(", firstName=");
        sb.append(this.f);
        sb.append(", photo50=");
        sb.append(this.g);
        sb.append(", photo100=");
        sb.append(this.h);
        sb.append(", photo200=");
        sb.append(this.i);
        sb.append(", lastName=");
        sb.append(this.j);
        sb.append(", phone=");
        sb.append(this.k);
        sb.append(", serviceInfo=");
        sb.append(this.l);
        sb.append(", extras=");
        sb.append(this.m);
        sb.append(", weight=");
        sb.append(this.n);
        sb.append(", userHash=");
        sb.append(this.o);
        sb.append(", applicationProviderPackage=");
        sb.append(this.p);
        sb.append(", providerInfoItems=");
        sb.append(this.q);
        sb.append(", providerAppId=");
        sb.append(this.r);
        sb.append(", phoneToActualize=");
        return ho8.a(sb, this.s, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UserId userId = this.b;
        parcel.writeInt((int) userId.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeLong(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeParcelable(this.m, 0);
        parcel.writeInt(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeList(this.q);
        parcel.writeParcelable(userId, 0);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public SilentAuthInfo(com.vk.dto.common.id.UserId r24, java.lang.String r25, java.lang.String r26, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, android.os.Bundle r36, int r37, java.lang.String r38, java.lang.String r39, java.util.List r40, int r41, java.lang.String r42, int r43, xsna.zcl r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 16
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r9 = r2
            goto Lc
        La:
            r9 = r29
        Lc:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L13
            r10 = r3
            goto L15
        L13:
            r10 = r30
        L15:
            r1 = r0 & 64
            if (r1 == 0) goto L1b
            r11 = r3
            goto L1d
        L1b:
            r11 = r31
        L1d:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L23
            r12 = r3
            goto L25
        L23:
            r12 = r32
        L25:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L2b
            r13 = r2
            goto L2d
        L2b:
            r13 = r33
        L2d:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L33
            r14 = r3
            goto L35
        L33:
            r14 = r34
        L35:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3b
            r15 = r3
            goto L3d
        L3b:
            r15 = r35
        L3d:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L44
            r16 = r3
            goto L46
        L44:
            r16 = r36
        L46:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r4 = 0
            if (r1 == 0) goto L4e
            r17 = r4
            goto L50
        L4e:
            r17 = r37
        L50:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L57
            r18 = r2
            goto L59
        L57:
            r18 = r38
        L59:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L60
            r19 = r3
            goto L62
        L60:
            r19 = r39
        L62:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L6d
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.b
            r20 = r1
            goto L6f
        L6d:
            r20 = r40
        L6f:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L77
            r21 = r4
            goto L79
        L77:
            r21 = r41
        L79:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L8b
            r22 = r3
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r3 = r23
            goto L97
        L8b:
            r22 = r42
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
        L97:
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.silentauth.SilentAuthInfo.<init>(com.vk.dto.common.id.UserId, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle, int, java.lang.String, java.lang.String, java.util.List, int, java.lang.String, int, xsna.zcl):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SilentAuthInfo(int i, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Bundle bundle, int i2, String str10, String str11, List<SilentTokenProviderInfo> list, UserId userId, int i3, String str12) {
        this(r4, str, str2, j, str3, str4, str5, str6, str7, str8, str9, bundle, i2, str10, str11, list, i3, str12);
        UserId userId2;
        if (userId == null) {
            gzs<s3q0> gzsVar = fkq0.a;
            userId2 = new UserId(i);
        } else {
            userId2 = userId;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SilentAuthInfo(Parcel parcel) {
        this(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r1, (UserId) parcel.readParcelable(UserId.class.getClassLoader()), parcel.readInt(), parcel.readString());
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        long readLong = parcel.readLong();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        Bundle bundle = (Bundle) parcel.readParcelable(Bundle.class.getClassLoader());
        int readInt2 = parcel.readInt();
        String readString10 = parcel.readString();
        readString10 = readString10 == null ? "" : readString10;
        String readString11 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, SilentTokenProviderInfo.class.getClassLoader());
        s3q0 s3q0Var = s3q0.a;
    }
}

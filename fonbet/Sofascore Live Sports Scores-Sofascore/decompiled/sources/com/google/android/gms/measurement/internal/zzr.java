package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final long A;
    public final String B;
    public final String C;
    public final long D;
    public final int E;
    public final long F;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final int m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final long q;
    public final List r;
    public final String s;
    public final String t;
    public final String u;
    public final boolean v;
    public final long w;
    public final int x;
    public final String y;
    public final int z;

    public zzr(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, List list, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        Preconditions.f(str);
        this.a = str;
        this.b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = list;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.r(parcel, 7, 8);
        parcel.writeLong(this.f);
        SafeParcelWriter.m(parcel, 8, this.g, false);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.h ? 1 : 0);
        SafeParcelWriter.r(parcel, 10, 4);
        parcel.writeInt(this.i ? 1 : 0);
        SafeParcelWriter.r(parcel, 11, 8);
        parcel.writeLong(this.j);
        SafeParcelWriter.m(parcel, 12, this.k, false);
        SafeParcelWriter.r(parcel, 14, 8);
        parcel.writeLong(this.l);
        SafeParcelWriter.r(parcel, 15, 4);
        parcel.writeInt(this.m);
        SafeParcelWriter.r(parcel, 16, 4);
        parcel.writeInt(this.n ? 1 : 0);
        SafeParcelWriter.r(parcel, 18, 4);
        parcel.writeInt(this.o ? 1 : 0);
        SafeParcelWriter.a(parcel, 21, this.p);
        SafeParcelWriter.r(parcel, 22, 8);
        parcel.writeLong(this.q);
        SafeParcelWriter.o(parcel, 23, this.r);
        SafeParcelWriter.m(parcel, 25, this.s, false);
        SafeParcelWriter.m(parcel, 26, this.t, false);
        SafeParcelWriter.m(parcel, 27, this.u, false);
        SafeParcelWriter.r(parcel, 28, 4);
        parcel.writeInt(this.v ? 1 : 0);
        SafeParcelWriter.r(parcel, 29, 8);
        parcel.writeLong(this.w);
        SafeParcelWriter.r(parcel, 30, 4);
        parcel.writeInt(this.x);
        SafeParcelWriter.m(parcel, 31, this.y, false);
        SafeParcelWriter.r(parcel, 32, 4);
        parcel.writeInt(this.z);
        SafeParcelWriter.r(parcel, 34, 8);
        parcel.writeLong(this.A);
        SafeParcelWriter.m(parcel, 35, this.B, false);
        SafeParcelWriter.m(parcel, 36, this.C, false);
        SafeParcelWriter.r(parcel, 37, 8);
        parcel.writeLong(this.D);
        SafeParcelWriter.r(parcel, 38, 4);
        parcel.writeInt(this.E);
        SafeParcelWriter.r(parcel, 39, 8);
        parcel.writeLong(this.F);
        SafeParcelWriter.t(parcel, s);
    }

    public zzr(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, int i, boolean z3, boolean z4, Boolean bool, long j5, ArrayList arrayList, String str7, String str8, String str9, boolean z5, long j6, int i2, String str10, int i3, long j7, String str11, String str12, long j8, int i4, long j9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = i;
        this.n = z3;
        this.o = z4;
        this.p = bool;
        this.q = j5;
        this.r = arrayList;
        this.s = str7;
        this.t = str8;
        this.u = str9;
        this.v = z5;
        this.w = j6;
        this.x = i2;
        this.y = str10;
        this.z = i3;
        this.A = j7;
        this.B = str11;
        this.C = str12;
        this.D = j8;
        this.E = i4;
        this.F = j9;
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import xsna.exc0;
import xsna.io01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new io01();

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;
    public final long f;
    public final long g;

    @Nullable
    public final String h;
    public final boolean i;
    public final boolean j;
    public final long k;

    @Nullable
    public final String l;

    @Deprecated
    public final long m;
    public final long n;
    public final int o;
    public final boolean p;
    public final boolean q;

    @Nullable
    public final String r;

    @Nullable
    public final Boolean s;
    public final long t;

    @Nullable
    public final List u;

    @Nullable
    public final String v;
    public final String w;
    public final String x;

    @Nullable
    public final String y;

    public zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, long j, @Nullable String str4, long j2, long j3, @Nullable String str5, boolean z, boolean z2, @Nullable String str6, long j4, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j5, @Nullable List list, String str8, String str9, @Nullable String str10) {
        exc0.f(str);
        this.b = str;
        this.c = true == TextUtils.isEmpty(str2) ? null : str2;
        this.d = str3;
        this.k = j;
        this.e = str4;
        this.f = j2;
        this.g = j3;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = 0L;
        this.n = j4;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = str7;
        this.s = bool;
        this.t = j5;
        this.u = list;
        this.v = null;
        this.w = str8;
        this.x = str9;
        this.y = str10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(this.f);
        ozg0.v(parcel, 7, 8);
        parcel.writeLong(this.g);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.j ? 1 : 0);
        ozg0.v(parcel, 11, 8);
        parcel.writeLong(this.k);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.v(parcel, 13, 8);
        parcel.writeLong(this.m);
        ozg0.v(parcel, 14, 8);
        parcel.writeLong(this.n);
        ozg0.v(parcel, 15, 4);
        parcel.writeInt(this.o);
        ozg0.v(parcel, 16, 4);
        parcel.writeInt(this.p ? 1 : 0);
        ozg0.v(parcel, 18, 4);
        parcel.writeInt(this.q ? 1 : 0);
        ozg0.q(parcel, 19, this.r, false);
        ozg0.c(parcel, 21, this.s);
        ozg0.v(parcel, 22, 8);
        parcel.writeLong(this.t);
        ozg0.s(parcel, this.u, 23);
        ozg0.q(parcel, 24, this.v, false);
        ozg0.q(parcel, 25, this.w, false);
        ozg0.q(parcel, 26, this.x, false);
        ozg0.q(parcel, 27, this.y, false);
        ozg0.x(w, parcel);
    }

    public zzq(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j, long j2, @Nullable String str5, boolean z, boolean z2, long j3, @Nullable String str6, long j4, long j5, int i, boolean z3, boolean z4, @Nullable String str7, @Nullable Boolean bool, long j6, @Nullable ArrayList arrayList, @Nullable String str8, String str9, String str10, String str11) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.k = j3;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = str5;
        this.i = z;
        this.j = z2;
        this.l = str6;
        this.m = j4;
        this.n = j5;
        this.o = i;
        this.p = z3;
        this.q = z4;
        this.r = str7;
        this.s = bool;
        this.t = j6;
        this.u = arrayList;
        this.v = str8;
        this.w = str9;
        this.x = str10;
        this.y = str11;
    }
}

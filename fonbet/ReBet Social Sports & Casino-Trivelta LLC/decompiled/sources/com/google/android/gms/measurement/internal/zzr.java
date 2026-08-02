package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new d7();

    /* renamed from: A, reason: collision with root package name */
    public final long f34457A;

    /* renamed from: B, reason: collision with root package name */
    public final String f34458B;

    /* renamed from: C, reason: collision with root package name */
    public final String f34459C;

    /* renamed from: D, reason: collision with root package name */
    public final long f34460D;

    /* renamed from: E, reason: collision with root package name */
    public final int f34461E;

    /* renamed from: a, reason: collision with root package name */
    public final String f34462a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34463b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34464c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34465d;

    /* renamed from: e, reason: collision with root package name */
    public final long f34466e;

    /* renamed from: f, reason: collision with root package name */
    public final long f34467f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34468g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f34469h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f34470i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34471j;

    /* renamed from: k, reason: collision with root package name */
    public final String f34472k;

    /* renamed from: l, reason: collision with root package name */
    public final long f34473l;

    /* renamed from: m, reason: collision with root package name */
    public final int f34474m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f34475n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f34476o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f34477p;

    /* renamed from: q, reason: collision with root package name */
    public final long f34478q;

    /* renamed from: r, reason: collision with root package name */
    public final List f34479r;

    /* renamed from: s, reason: collision with root package name */
    public final String f34480s;

    /* renamed from: t, reason: collision with root package name */
    public final String f34481t;

    /* renamed from: u, reason: collision with root package name */
    public final String f34482u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f34483v;

    /* renamed from: w, reason: collision with root package name */
    public final long f34484w;

    /* renamed from: x, reason: collision with root package name */
    public final int f34485x;

    /* renamed from: y, reason: collision with root package name */
    public final String f34486y;

    /* renamed from: z, reason: collision with root package name */
    public final int f34487z;

    public zzr(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        AbstractC3191o.g(str);
        this.f34462a = str;
        this.f34463b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f34464c = str3;
        this.f34471j = j10;
        this.f34465d = str4;
        this.f34466e = j11;
        this.f34467f = j12;
        this.f34468g = str5;
        this.f34469h = z10;
        this.f34470i = z11;
        this.f34472k = str6;
        this.f34473l = j13;
        this.f34474m = i10;
        this.f34475n = z12;
        this.f34476o = z13;
        this.f34477p = bool;
        this.f34478q = j14;
        this.f34479r = list;
        this.f34480s = str7;
        this.f34481t = str8;
        this.f34482u = str9;
        this.f34483v = z14;
        this.f34484w = j15;
        this.f34485x = i11;
        this.f34486y = str10;
        this.f34487z = i12;
        this.f34457A = j16;
        this.f34458B = str11;
        this.f34459C = str12;
        this.f34460D = j17;
        this.f34461E = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f34462a;
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, str, false);
        E9.b.F(parcel, 3, this.f34463b, false);
        E9.b.F(parcel, 4, this.f34464c, false);
        E9.b.F(parcel, 5, this.f34465d, false);
        E9.b.y(parcel, 6, this.f34466e);
        E9.b.y(parcel, 7, this.f34467f);
        E9.b.F(parcel, 8, this.f34468g, false);
        E9.b.g(parcel, 9, this.f34469h);
        E9.b.g(parcel, 10, this.f34470i);
        E9.b.y(parcel, 11, this.f34471j);
        E9.b.F(parcel, 12, this.f34472k, false);
        E9.b.y(parcel, 14, this.f34473l);
        E9.b.u(parcel, 15, this.f34474m);
        E9.b.g(parcel, 16, this.f34475n);
        E9.b.g(parcel, 18, this.f34476o);
        E9.b.i(parcel, 21, this.f34477p, false);
        E9.b.y(parcel, 22, this.f34478q);
        E9.b.H(parcel, 23, this.f34479r, false);
        E9.b.F(parcel, 25, this.f34480s, false);
        E9.b.F(parcel, 26, this.f34481t, false);
        E9.b.F(parcel, 27, this.f34482u, false);
        E9.b.g(parcel, 28, this.f34483v);
        E9.b.y(parcel, 29, this.f34484w);
        E9.b.u(parcel, 30, this.f34485x);
        E9.b.F(parcel, 31, this.f34486y, false);
        E9.b.u(parcel, 32, this.f34487z);
        E9.b.y(parcel, 34, this.f34457A);
        E9.b.F(parcel, 35, this.f34458B, false);
        E9.b.F(parcel, 36, this.f34459C, false);
        E9.b.y(parcel, 37, this.f34460D);
        E9.b.u(parcel, 38, this.f34461E);
        E9.b.b(parcel, a10);
    }

    public zzr(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.f34462a = str;
        this.f34463b = str2;
        this.f34464c = str3;
        this.f34471j = j12;
        this.f34465d = str4;
        this.f34466e = j10;
        this.f34467f = j11;
        this.f34468g = str5;
        this.f34469h = z10;
        this.f34470i = z11;
        this.f34472k = str6;
        this.f34473l = j13;
        this.f34474m = i10;
        this.f34475n = z12;
        this.f34476o = z13;
        this.f34477p = bool;
        this.f34478q = j14;
        this.f34479r = list;
        this.f34480s = str7;
        this.f34481t = str8;
        this.f34482u = str9;
        this.f34483v = z14;
        this.f34484w = j15;
        this.f34485x = i11;
        this.f34486y = str10;
        this.f34487z = i12;
        this.f34457A = j16;
        this.f34458B = str11;
        this.f34459C = str12;
        this.f34460D = j17;
        this.f34461E = i13;
    }
}

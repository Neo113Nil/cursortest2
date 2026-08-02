package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new C3262h();

    /* renamed from: a, reason: collision with root package name */
    public String f34422a;

    /* renamed from: b, reason: collision with root package name */
    public String f34423b;

    /* renamed from: c, reason: collision with root package name */
    public zzpl f34424c;

    /* renamed from: d, reason: collision with root package name */
    public long f34425d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f34426e;

    /* renamed from: f, reason: collision with root package name */
    public String f34427f;

    /* renamed from: g, reason: collision with root package name */
    public final zzbg f34428g;

    /* renamed from: h, reason: collision with root package name */
    public long f34429h;

    /* renamed from: i, reason: collision with root package name */
    public zzbg f34430i;

    /* renamed from: j, reason: collision with root package name */
    public final long f34431j;

    /* renamed from: k, reason: collision with root package name */
    public final zzbg f34432k;

    public zzah(zzah zzahVar) {
        AbstractC3191o.m(zzahVar);
        this.f34422a = zzahVar.f34422a;
        this.f34423b = zzahVar.f34423b;
        this.f34424c = zzahVar.f34424c;
        this.f34425d = zzahVar.f34425d;
        this.f34426e = zzahVar.f34426e;
        this.f34427f = zzahVar.f34427f;
        this.f34428g = zzahVar.f34428g;
        this.f34429h = zzahVar.f34429h;
        this.f34430i = zzahVar.f34430i;
        this.f34431j = zzahVar.f34431j;
        this.f34432k = zzahVar.f34432k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34422a, false);
        E9.b.F(parcel, 3, this.f34423b, false);
        E9.b.D(parcel, 4, this.f34424c, i10, false);
        E9.b.y(parcel, 5, this.f34425d);
        E9.b.g(parcel, 6, this.f34426e);
        E9.b.F(parcel, 7, this.f34427f, false);
        E9.b.D(parcel, 8, this.f34428g, i10, false);
        E9.b.y(parcel, 9, this.f34429h);
        E9.b.D(parcel, 10, this.f34430i, i10, false);
        E9.b.y(parcel, 11, this.f34431j);
        E9.b.D(parcel, 12, this.f34432k, i10, false);
        E9.b.b(parcel, a10);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.f34422a = str;
        this.f34423b = str2;
        this.f34424c = zzplVar;
        this.f34425d = j10;
        this.f34426e = z10;
        this.f34427f = str3;
        this.f34428g = zzbgVar;
        this.f34429h = j11;
        this.f34430i = zzbgVar2;
        this.f34431j = j12;
        this.f34432k = zzbgVar3;
    }
}

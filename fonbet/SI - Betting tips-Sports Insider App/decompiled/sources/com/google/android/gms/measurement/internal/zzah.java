package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new b(7);

    /* renamed from: a, reason: collision with root package name */
    public String f5785a;

    /* renamed from: b, reason: collision with root package name */
    public String f5786b;

    /* renamed from: c, reason: collision with root package name */
    public zzpl f5787c;

    /* renamed from: d, reason: collision with root package name */
    public long f5788d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5789e;

    /* renamed from: f, reason: collision with root package name */
    public String f5790f;

    /* renamed from: g, reason: collision with root package name */
    public final zzbg f5791g;

    /* renamed from: h, reason: collision with root package name */
    public long f5792h;

    /* renamed from: i, reason: collision with root package name */
    public zzbg f5793i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final zzbg f5794k;

    public zzah(zzah zzahVar) {
        v.h(zzahVar);
        this.f5785a = zzahVar.f5785a;
        this.f5786b = zzahVar.f5786b;
        this.f5787c = zzahVar.f5787c;
        this.f5788d = zzahVar.f5788d;
        this.f5789e = zzahVar.f5789e;
        this.f5790f = zzahVar.f5790f;
        this.f5791g = zzahVar.f5791g;
        this.f5792h = zzahVar.f5792h;
        this.f5793i = zzahVar.f5793i;
        this.j = zzahVar.j;
        this.f5794k = zzahVar.f5794k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 2, this.f5785a, false);
        h8.b.O(parcel, 3, this.f5786b, false);
        h8.b.N(parcel, 4, this.f5787c, i5, false);
        long j = this.f5788d;
        h8.b.U(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z5 = this.f5789e;
        h8.b.U(parcel, 6, 4);
        parcel.writeInt(z5 ? 1 : 0);
        h8.b.O(parcel, 7, this.f5790f, false);
        h8.b.N(parcel, 8, this.f5791g, i5, false);
        long j6 = this.f5792h;
        h8.b.U(parcel, 9, 8);
        parcel.writeLong(j6);
        h8.b.N(parcel, 10, this.f5793i, i5, false);
        h8.b.U(parcel, 11, 8);
        parcel.writeLong(this.j);
        h8.b.N(parcel, 12, this.f5794k, i5, false);
        h8.b.W(parcel, V);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j, boolean z5, String str3, zzbg zzbgVar, long j6, zzbg zzbgVar2, long j10, zzbg zzbgVar3) {
        this.f5785a = str;
        this.f5786b = str2;
        this.f5787c = zzplVar;
        this.f5788d = j;
        this.f5789e = z5;
        this.f5790f = str3;
        this.f5791g = zzbgVar;
        this.f5792h = j6;
        this.f5793i = zzbgVar2;
        this.j = j10;
        this.f5794k = zzbgVar3;
    }
}

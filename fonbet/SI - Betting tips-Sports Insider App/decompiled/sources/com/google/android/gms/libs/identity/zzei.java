package com.google.android.gms.libs.identity;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import m7.h;
import m7.p;
import m7.r;
import p7.i;
import p7.k;
import p7.l;
import p7.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new j(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f4874a;

    /* renamed from: b, reason: collision with root package name */
    public final zzeg f4875b;

    /* renamed from: c, reason: collision with root package name */
    public final m f4876c;

    /* renamed from: d, reason: collision with root package name */
    public final p7.j f4877d;

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f4878e;

    /* renamed from: f, reason: collision with root package name */
    public final r f4879f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4880g;

    public zzei(int i5, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        m mVar;
        p7.j jVar;
        this.f4874a = i5;
        this.f4875b = zzegVar;
        r rVar = null;
        if (iBinder != null) {
            int i10 = l.f21530f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new k(iBinder, "com.google.android.gms.location.ILocationListener", 5);
        } else {
            mVar = null;
        }
        this.f4876c = mVar;
        this.f4878e = pendingIntent;
        if (iBinder2 != null) {
            int i11 = h.f20458g;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            jVar = queryLocalInterface2 instanceof p7.j ? (p7.j) queryLocalInterface2 : new i(iBinder2, "com.google.android.gms.location.ILocationCallback", 5);
        } else {
            jVar = null;
        }
        this.f4877d = jVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            rVar = queryLocalInterface3 instanceof r ? (r) queryLocalInterface3 : new p(iBinder3);
        }
        this.f4879f = rVar;
        this.f4880g = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4874a);
        b.N(parcel, 2, this.f4875b, i5, false);
        m mVar = this.f4876c;
        b.I(parcel, 3, mVar == null ? null : mVar.asBinder());
        b.N(parcel, 4, this.f4878e, i5, false);
        p7.j jVar = this.f4877d;
        b.I(parcel, 5, jVar == null ? null : jVar.asBinder());
        r rVar = this.f4879f;
        b.I(parcel, 6, rVar != null ? rVar.asBinder() : null);
        b.O(parcel, 8, this.f4880g, false);
        b.W(parcel, V);
    }
}

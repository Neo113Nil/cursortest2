package com.google.android.gms.libs.identity;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;
import m7.p;
import m7.r;
import p7.f;
import p7.g;
import p7.h;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new j(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f4898a;

    /* renamed from: b, reason: collision with root package name */
    public final zzh f4899b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4900c;

    /* renamed from: d, reason: collision with root package name */
    public final r f4901d;

    public zzj(int i5, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        h fVar;
        this.f4898a = i5;
        this.f4899b = zzhVar;
        r rVar = null;
        if (iBinder == null) {
            fVar = null;
        } else {
            int i10 = g.f21529f;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            fVar = queryLocalInterface instanceof h ? (h) queryLocalInterface : new f(iBinder, "com.google.android.gms.location.IDeviceOrientationListener", 5);
        }
        this.f4900c = fVar;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            rVar = queryLocalInterface2 instanceof r ? (r) queryLocalInterface2 : new p(iBinder2);
        }
        this.f4901d = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4898a);
        b.N(parcel, 2, this.f4899b, i5, false);
        h hVar = this.f4900c;
        b.I(parcel, 3, hVar == null ? null : hVar.asBinder());
        r rVar = this.f4901d;
        b.I(parcel, 4, rVar != null ? rVar.asBinder() : null);
        b.W(parcel, V);
    }
}

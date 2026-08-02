package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.InterfaceC3184h;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new P();

    /* renamed from: a, reason: collision with root package name */
    public final int f32762a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f32763b;

    /* renamed from: c, reason: collision with root package name */
    public final ConnectionResult f32764c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32765d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32766e;

    public zav(int i10, IBinder iBinder, ConnectionResult connectionResult, boolean z10, boolean z11) {
        this.f32762a = i10;
        this.f32763b = iBinder;
        this.f32764c = connectionResult;
        this.f32765d = z10;
        this.f32766e = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.f32764c.equals(zavVar.f32764c) && AbstractC3189m.b(h(), zavVar.h());
    }

    public final ConnectionResult g() {
        return this.f32764c;
    }

    public final InterfaceC3184h h() {
        IBinder iBinder = this.f32763b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3184h.a.c(iBinder);
    }

    public final boolean i() {
        return this.f32765d;
    }

    public final boolean j() {
        return this.f32766e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, this.f32762a);
        E9.b.t(parcel, 2, this.f32763b, false);
        E9.b.D(parcel, 3, this.f32764c, i10, false);
        E9.b.g(parcel, 4, this.f32765d);
        E9.b.g(parcel, 5, this.f32766e);
        E9.b.b(parcel, a10);
    }
}

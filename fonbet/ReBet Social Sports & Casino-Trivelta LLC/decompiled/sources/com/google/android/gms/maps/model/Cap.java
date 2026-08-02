package com.google.android.gms.maps.model;

import N9.b;
import Y9.k;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public final int f33194a;

    /* renamed from: b, reason: collision with root package name */
    public final Y9.b f33195b;

    /* renamed from: c, reason: collision with root package name */
    public final Float f33196c;

    public Cap(int i10, IBinder iBinder, Float f10) {
        this(i10, iBinder == null ? null : new Y9.b(b.a.c(iBinder)), f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.f33194a == cap.f33194a && AbstractC3189m.b(this.f33195b, cap.f33195b) && AbstractC3189m.b(this.f33196c, cap.f33196c);
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33194a), this.f33195b, this.f33196c);
    }

    public String toString() {
        return "[Cap: type=" + this.f33194a + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33194a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, i11);
        Y9.b bVar = this.f33195b;
        E9.b.t(parcel, 3, bVar == null ? null : bVar.a().asBinder(), false);
        E9.b.s(parcel, 4, this.f33196c, false);
        E9.b.b(parcel, a10);
    }

    public Cap(int i10, Y9.b bVar, Float f10) {
        boolean z10 = f10 != null && f10.floatValue() > 0.0f;
        if (i10 == 3) {
            r0 = bVar != null && z10;
            i10 = 3;
        }
        AbstractC3191o.b(r0, String.format("Invalid Cap: type=%s bitmapDescriptor=%s bitmapRefWidth=%s", Integer.valueOf(i10), bVar, f10));
        this.f33194a = i10;
        this.f33195b = bVar;
        this.f33196c = f10;
    }
}

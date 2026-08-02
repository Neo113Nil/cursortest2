package com.google.android.gms.maps.model;

import Y9.o;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLng> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final double f33210a;

    /* renamed from: b, reason: collision with root package name */
    public final double f33211b;

    public LatLng(double d10, double d11) {
        if (d11 < -180.0d || d11 >= 180.0d) {
            this.f33211b = ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f33211b = d11;
        }
        this.f33210a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f33210a) == Double.doubleToLongBits(latLng.f33210a) && Double.doubleToLongBits(this.f33211b) == Double.doubleToLongBits(latLng.f33211b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f33210a);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f33211b);
        return ((((int) j10) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f33210a + "," + this.f33211b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f33210a;
        int a10 = E9.b.a(parcel);
        E9.b.n(parcel, 2, d10);
        E9.b.n(parcel, 3, this.f33211b);
        E9.b.b(parcel, a10);
    }
}

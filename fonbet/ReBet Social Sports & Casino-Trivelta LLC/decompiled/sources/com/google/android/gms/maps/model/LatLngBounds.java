package com.google.android.gms.maps.model;

import Y9.n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f33212a;

    /* renamed from: b, reason: collision with root package name */
    public final LatLng f33213b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public double f33214a = Double.POSITIVE_INFINITY;

        /* renamed from: b, reason: collision with root package name */
        public double f33215b = Double.NEGATIVE_INFINITY;

        /* renamed from: c, reason: collision with root package name */
        public double f33216c = Double.NaN;

        /* renamed from: d, reason: collision with root package name */
        public double f33217d = Double.NaN;

        public LatLngBounds a() {
            AbstractC3191o.q(!Double.isNaN(this.f33216c), "no included points");
            return new LatLngBounds(new LatLng(this.f33214a, this.f33216c), new LatLng(this.f33215b, this.f33217d));
        }

        public a b(LatLng latLng) {
            AbstractC3191o.n(latLng, "point must not be null");
            this.f33214a = Math.min(this.f33214a, latLng.f33210a);
            this.f33215b = Math.max(this.f33215b, latLng.f33210a);
            double d10 = latLng.f33211b;
            if (Double.isNaN(this.f33216c)) {
                this.f33216c = d10;
                this.f33217d = d10;
                return this;
            }
            double d11 = this.f33216c;
            double d12 = this.f33217d;
            if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                    this.f33216c = d10;
                    return this;
                }
                this.f33217d = d10;
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        AbstractC3191o.n(latLng, "southwest must not be null.");
        AbstractC3191o.n(latLng2, "northeast must not be null.");
        double d10 = latLng2.f33210a;
        double d11 = latLng.f33210a;
        AbstractC3191o.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f33210a));
        this.f33212a = latLng;
        this.f33213b = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f33212a.equals(latLngBounds.f33212a) && this.f33213b.equals(latLngBounds.f33213b);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33212a, this.f33213b);
    }

    public String toString() {
        return AbstractC3189m.d(this).a("southwest", this.f33212a).a("northeast", this.f33213b).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f33212a;
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, latLng, i10, false);
        E9.b.D(parcel, 3, this.f33213b, i10, false);
        E9.b.b(parcel, a10);
    }
}

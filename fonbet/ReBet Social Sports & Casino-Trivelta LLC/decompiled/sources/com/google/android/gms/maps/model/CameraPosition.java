package com.google.android.gms.maps.model;

import Y9.g;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final LatLng f33186a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33187b;

    /* renamed from: c, reason: collision with root package name */
    public final float f33188c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33189d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public LatLng f33190a;

        /* renamed from: b, reason: collision with root package name */
        public float f33191b;

        /* renamed from: c, reason: collision with root package name */
        public float f33192c;

        /* renamed from: d, reason: collision with root package name */
        public float f33193d;

        public a a(float f10) {
            this.f33193d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f33190a, this.f33191b, this.f33192c, this.f33193d);
        }

        public a c(LatLng latLng) {
            this.f33190a = (LatLng) AbstractC3191o.n(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f33192c = f10;
            return this;
        }

        public a e(float f10) {
            this.f33191b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        AbstractC3191o.n(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        AbstractC3191o.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f33186a = latLng;
        this.f33187b = f10;
        this.f33188c = f11 + 0.0f;
        this.f33189d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a g() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f33186a.equals(cameraPosition.f33186a) && Float.floatToIntBits(this.f33187b) == Float.floatToIntBits(cameraPosition.f33187b) && Float.floatToIntBits(this.f33188c) == Float.floatToIntBits(cameraPosition.f33188c) && Float.floatToIntBits(this.f33189d) == Float.floatToIntBits(cameraPosition.f33189d);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33186a, Float.valueOf(this.f33187b), Float.valueOf(this.f33188c), Float.valueOf(this.f33189d));
    }

    public String toString() {
        return AbstractC3189m.d(this).a("target", this.f33186a).a("zoom", Float.valueOf(this.f33187b)).a("tilt", Float.valueOf(this.f33188c)).a("bearing", Float.valueOf(this.f33189d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f33186a;
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, latLng, i10, false);
        E9.b.q(parcel, 3, this.f33187b);
        E9.b.q(parcel, 4, this.f33188c);
        E9.b.q(parcel, 5, this.f33189d);
        E9.b.b(parcel, a10);
    }
}

package org.maplibre.android.geometry;

import B90.C2619v;
import Cm.e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007R,\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR,\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00048\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\b\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lorg/maplibre/android/geometry/LatLng;", "Landroid/os/Parcelable;", "<init>", "()V", "", "latitude", "longitude", "(DD)V", "D", "a", "()D", "c", "(D)V", "b", "d", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LatLng implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatLng> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private double f79624a;

    @Keep
    private double latitude;

    @Keep
    private double longitude;

    public static final class a implements Parcelable.Creator<LatLng> {
        @Override // android.os.Parcelable.Creator
        public final LatLng createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatLng(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LatLng[] newArray(int i11) {
            return new LatLng[i11];
        }
    }

    public LatLng() {
        c(0.0d);
        d(0.0d);
    }

    /* renamed from: a, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* renamed from: b, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    public final void c(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        }
        if (Math.abs(d11) > 90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
        this.latitude = d11;
    }

    public final void d(double d11) {
        if (Double.isNaN(d11)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        }
        if (Double.isInfinite(d11)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
        this.longitude = d11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LatLng.class.equals(obj.getClass())) {
            LatLng latLng = (LatLng) obj;
            if (Double.compare(latLng.f79624a, this.f79624a) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i11 = (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f79624a);
        return (i11 * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    @NotNull
    public final String toString() {
        double d11 = this.latitude;
        double d12 = this.longitude;
        StringBuilder e11 = e.e(d11, "LatLng [latitude=", ", longitude=");
        e11.append(d12);
        e11.append(", altitude=");
        return C2619v.c(e11, this.f79624a, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.latitude);
        out.writeDouble(this.longitude);
        out.writeDouble(this.f79624a);
    }

    @Keep
    public LatLng(double d11, double d12) {
        c(d11);
        d(d12);
    }

    public LatLng(@NotNull Parcel in) {
        Intrinsics.checkNotNullParameter(in, "in");
        c(in.readDouble());
        d(in.readDouble());
        this.f79624a = in.readDouble();
    }
}

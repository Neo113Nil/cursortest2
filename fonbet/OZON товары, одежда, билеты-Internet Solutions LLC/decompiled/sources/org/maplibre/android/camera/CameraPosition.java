package org.maplibre.android.camera;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.camera.a;
import org.maplibre.android.geometry.LatLng;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0013\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013BM\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB5\b\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0014"}, d2 = {"Lorg/maplibre/android/camera/CameraPosition;", "Landroid/os/Parcelable;", "Lorg/maplibre/android/geometry/LatLng;", "target", "", "centerAltitude", "zoom", "tilt", "bearing", "roll", "fov", "", "padding", "<init>", "(Lorg/maplibre/android/geometry/LatLng;DDDDDD[D)V", "(Lorg/maplibre/android/geometry/LatLng;DDD[D)V", "Lorg/maplibre/android/geometry/LatLng;", "D", "[D", "a", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CameraPosition implements Parcelable {

    @Keep
    public final double bearing;

    @Keep
    public final double centerAltitude;

    @Keep
    public final double fov;

    @Keep
    public final double[] padding;

    @Keep
    public final double roll;

    @Keep
    public final LatLng target;

    @Keep
    public final double tilt;

    @Keep
    public final double zoom;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final CameraPosition f79608a = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d, new double[]{0.0d, 0.0d, 0.0d, 0.0d});

    @NotNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new b();

    public static final class b implements Parcelable.Creator<CameraPosition> {
        @Override // android.os.Parcelable.Creator
        public final CameraPosition createFromParcel(Parcel parcel) {
            LatLng latLng;
            double[] dArr;
            Object readParcelable;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double readDouble = parcel.readDouble();
            if (Build.VERSION.SDK_INT > 33) {
                readParcelable = parcel.readParcelable(LatLng.class.getClassLoader(), LatLng.class);
                latLng = (LatLng) readParcelable;
            } else {
                latLng = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            }
            LatLng latLng2 = latLng;
            double readDouble2 = parcel.readDouble();
            double readDouble3 = parcel.readDouble();
            double readDouble4 = parcel.readDouble();
            double readDouble5 = parcel.readDouble();
            double readDouble6 = parcel.readDouble();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                dArr = new double[readInt];
                for (int i11 = 0; i11 < readInt; i11++) {
                    dArr[i11] = parcel.readDouble();
                }
            } else {
                dArr = null;
            }
            return new CameraPosition(latLng2, readDouble2, readDouble6, readDouble3, readDouble, readDouble4, readDouble5, dArr);
        }

        @Override // android.os.Parcelable.Creator
        public final CameraPosition[] newArray(int i11) {
            return new CameraPosition[i11];
        }
    }

    @Keep
    public CameraPosition(LatLng latLng, double d11, double d12, double d13, double d14, double d15, double d16, double[] dArr) {
        this.target = latLng;
        this.centerAltitude = d11;
        this.zoom = d12;
        this.tilt = d13;
        this.bearing = d14;
        this.roll = d15;
        this.fov = d16;
        this.padding = dArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CameraPosition.class.equals(obj.getClass())) {
            CameraPosition cameraPosition = (CameraPosition) obj;
            LatLng latLng = this.target;
            return (latLng == null || Intrinsics.d(latLng, cameraPosition.target)) && this.centerAltitude == cameraPosition.centerAltitude && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.roll == cameraPosition.roll && this.fov == cameraPosition.fov && this.bearing == cameraPosition.bearing && Arrays.equals(this.padding, cameraPosition.padding);
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.bearing);
        int i11 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        LatLng latLng = this.target;
        int hashCode = latLng != null ? latLng.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.centerAltitude);
        int i12 = ((i11 + hashCode) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.tilt);
        int i13 = (i12 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.roll);
        int i14 = (i13 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
        long doubleToLongBits5 = Double.doubleToLongBits(this.fov);
        int i15 = (i14 * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)));
        long doubleToLongBits6 = Double.doubleToLongBits(this.zoom);
        return Arrays.hashCode(this.padding) + (((i15 * 31) + ((int) ((doubleToLongBits6 >>> 32) ^ doubleToLongBits6))) * 31);
    }

    @NotNull
    public final String toString() {
        return "Target: " + this.target + ", Center Altitude:" + this.centerAltitude + ", Zoom:" + this.zoom + ", Bearing:" + this.bearing + ", Tilt:" + this.tilt + ", Roll:" + this.roll + ", FOV:" + this.fov + ", Padding:" + Arrays.toString(this.padding);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.bearing);
        out.writeParcelable(this.target, i11);
        out.writeDouble(this.centerAltitude);
        out.writeDouble(this.tilt);
        out.writeDouble(this.roll);
        out.writeDouble(this.fov);
        out.writeDouble(this.zoom);
        double[] dArr = this.padding;
        if (dArr == null) {
            out.writeInt(-1);
            return;
        }
        out.writeInt(dArr.length);
        for (double d11 : this.padding) {
            out.writeDouble(d11);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private double f79609a;

        /* renamed from: b, reason: collision with root package name */
        private LatLng f79610b;

        /* renamed from: c, reason: collision with root package name */
        private double f79611c;

        /* renamed from: d, reason: collision with root package name */
        private double f79612d;

        /* renamed from: e, reason: collision with root package name */
        private double[] f79613e;

        public a() {
            this.f79609a = -1.0d;
            this.f79611c = -1.0d;
            this.f79612d = -1.0d;
        }

        @NotNull
        public final void a(double d11) {
            while (d11 >= 360.0d) {
                d11 -= 360.0d;
            }
            while (d11 < 0.0d) {
                d11 += 360.0d;
            }
            this.f79609a = d11;
        }

        @NotNull
        public final CameraPosition b() {
            return new CameraPosition(this.f79610b, this.f79612d, this.f79611c, this.f79609a, this.f79613e);
        }

        @NotNull
        public final void c(double[] dArr) {
            this.f79613e = dArr;
        }

        @NotNull
        public final void d(LatLng latLng) {
            this.f79610b = latLng;
        }

        @NotNull
        public final void e(double d11) {
            this.f79611c = Math.max(0.0d, Math.min(60.0d, d11));
        }

        @NotNull
        public final void f(double d11) {
            this.f79612d = d11;
        }

        public a(CameraPosition cameraPosition) {
            this.f79609a = cameraPosition.bearing;
            this.f79610b = cameraPosition.target;
            this.f79611c = cameraPosition.tilt;
            this.f79612d = cameraPosition.zoom;
            this.f79613e = cameraPosition.padding;
        }

        public a(TypedArray typedArray) {
            this.f79609a = -1.0d;
            this.f79611c = -1.0d;
            this.f79612d = -1.0d;
            if (typedArray != null) {
                this.f79609a = typedArray.getFloat(6, 0.0f);
                this.f79610b = new LatLng(typedArray.getFloat(12, 0.0f), typedArray.getFloat(13, 0.0f));
                typedArray.getFloat(7, 0.0f);
                this.f79611c = typedArray.getFloat(14, 0.0f);
                typedArray.getFloat(11, 0.0f);
                typedArray.getFloat(8, 36.869896f);
                this.f79612d = typedArray.getFloat(15, 0.0f);
            }
        }

        public a(a.C1339a c1339a) {
            this.f79609a = -1.0d;
            this.f79611c = -1.0d;
            this.f79612d = -1.0d;
            if (c1339a != null) {
                this.f79609a = c1339a.b();
                this.f79610b = c1339a.d();
                this.f79611c = c1339a.e();
                this.f79612d = c1339a.f();
                this.f79613e = c1339a.c();
            }
        }
    }

    @Keep
    public CameraPosition(LatLng latLng, double d11, double d12, double d13, double[] dArr) {
        this(latLng, 0.0d, d11, d12, d13, 0.0d, 36.86989764584402d, dArr);
    }
}

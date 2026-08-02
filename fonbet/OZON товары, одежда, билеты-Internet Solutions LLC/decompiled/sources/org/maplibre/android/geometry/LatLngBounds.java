package org.maplibre.android.geometry;

import Cm.e;
import T7.E;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C7729k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002RSB)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\nJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"J-\u0010!\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b!\u0010'J\u0017\u0010)\u001a\u0004\u0018\u00010\u00002\u0006\u0010(\u001a\u00020\u0000¢\u0006\u0004\b)\u0010\"J-\u0010)\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0016¢\u0006\u0004\b-\u0010,J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u001a2\u0006\u00104\u001a\u00020\u0002H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u001a2\u0006\u00107\u001a\u00020\u0002H\u0002¢\u0006\u0004\b8\u00106J/\u00109\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b9\u0010'J1\u0010:\u001a\u0004\u0018\u00010\u00002\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0011\u0010>\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0011\u0010B\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bA\u0010=R\u0011\u0010D\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bC\u0010=R\u0011\u0010F\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bE\u0010=R\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\nR\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\nR\u0011\u0010O\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds;", "Landroid/os/Parcelable;", "", "latitudeNorth", "longitudeEast", "latitudeSouth", "longitudeWest", "<init>", "(DDDD)V", "getLatNorth", "()D", "getLatSouth", "getLonEast", "getLonWest", "", "toString", "()Ljava/lang/String;", "", "Lorg/maplibre/android/geometry/LatLng;", "toLatLngs", "()[Lorg/maplibre/android/geometry/LatLng;", "latLng", "include", "(Lorg/maplibre/android/geometry/LatLng;)Lorg/maplibre/android/geometry/LatLngBounds;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "contains", "(Lorg/maplibre/android/geometry/LatLng;)Z", "(Lorg/maplibre/android/geometry/LatLngBounds;)Z", "bounds", "union", "(Lorg/maplibre/android/geometry/LatLngBounds;)Lorg/maplibre/android/geometry/LatLngBounds;", "northLat", "eastLon", "southLat", "westLon", "(DDDD)Lorg/maplibre/android/geometry/LatLngBounds;", "box", "intersect", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "out", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "latitude", "containsLatitude", "(D)Z", "longitude", "containsLongitude", "unionNoParamCheck", "intersectNoParamCheck", "D", "getCenter", "()Lorg/maplibre/android/geometry/LatLng;", RichContentDTO.ALIGN_CENTER, "getSouthWest", "southWest", "getNorthEast", "northEast", "getSouthEast", "southEast", "getNorthWest", "northWest", "LXf/a;", "getSpan", "()LXf/a;", "span", "getLatitudeSpan", "latitudeSpan", "getLongitudeSpan", "longitudeSpan", "isEmptySpan", "()Z", "Companion", "a", "c", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LatLngBounds implements Parcelable {

    @Keep
    public final double latitudeNorth;

    @Keep
    public final double latitudeSouth;

    @Keep
    public final double longitudeEast;

    @Keep
    public final double longitudeWest;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f79625a = new ArrayList();

        @NotNull
        public final LatLngBounds a() {
            ArrayList latLngs = this.f79625a;
            if (latLngs.size() < 2) {
                throw new Wf.b(E.a(latLngs.size(), "Cannot create a LatLngBounds from ", " items"));
            }
            LatLngBounds.INSTANCE.getClass();
            Intrinsics.checkNotNullParameter(latLngs, "latLngs");
            Iterator it = latLngs.iterator();
            double d11 = 90.0d;
            double d12 = Double.MAX_VALUE;
            double d13 = -90.0d;
            double d14 = -1.7976931348623157E308d;
            while (it.hasNext()) {
                LatLng latLng = (LatLng) it.next();
                double latitude = latLng.getLatitude();
                double longitude = latLng.getLongitude();
                d11 = Math.min(d11, latitude);
                d12 = Math.min(d12, longitude);
                d13 = Math.max(d13, latitude);
                d14 = Math.max(d14, longitude);
            }
            return new LatLngBounds(d13, d14, d11, d12);
        }

        @NotNull
        public final void b(@NotNull LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            this.f79625a.add(latLng);
        }
    }

    public static final class b implements Parcelable.Creator<LatLngBounds> {
        @Override // android.os.Parcelable.Creator
        public final LatLngBounds createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            LatLngBounds.INSTANCE.getClass();
            return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final LatLngBounds[] newArray(int i11) {
            return new LatLngBounds[i11];
        }
    }

    /* renamed from: org.maplibre.android.geometry.LatLngBounds$c, reason: from kotlin metadata */
    public static final class Companion {
        public static final /* synthetic */ void a(Companion companion, double d11, double d12, double d13, double d14) {
            companion.getClass();
            b(d11, d12, d13, d14);
        }

        private static void b(double d11, double d12, double d13, double d14) {
            C7729k c7729k = C7729k.f71812a;
            Intrinsics.checkNotNullParameter(c7729k, "<this>");
            if (!Double.isNaN(d11)) {
                Intrinsics.checkNotNullParameter(c7729k, "<this>");
                if (!Double.isNaN(d13)) {
                    Intrinsics.checkNotNullParameter(c7729k, "<this>");
                    if (!Double.isNaN(d12)) {
                        Intrinsics.checkNotNullParameter(c7729k, "<this>");
                        if (!Double.isNaN(d14)) {
                            Intrinsics.checkNotNullParameter(c7729k, "<this>");
                            if (!Double.isInfinite(d12)) {
                                Intrinsics.checkNotNullParameter(c7729k, "<this>");
                                if (!Double.isInfinite(d14)) {
                                    if (d11 > 90.0d || d11 < -90.0d || d13 > 90.0d || d13 < -90.0d) {
                                        throw new IllegalArgumentException("latitude must be between -90 and 90");
                                    }
                                    if (d11 < d13) {
                                        throw new IllegalArgumentException("latNorth cannot be less than latSouth");
                                    }
                                    if (d12 < d14) {
                                        throw new IllegalArgumentException("lonEast cannot be less than lonWest");
                                    }
                                    return;
                                }
                            }
                            throw new IllegalArgumentException("longitude must not be infinite");
                        }
                    }
                    throw new IllegalArgumentException("longitude must not be NaN");
                }
            }
            throw new IllegalArgumentException("latitude must not be NaN");
        }

        @NotNull
        public static LatLngBounds c(double d11, double d12, double d13, double d14) {
            b(d11, d12, d13, d14);
            return new LatLngBounds(d11, d12, d13, d14);
        }

        @NotNull
        public static LatLngBounds d(int i11, int i12, int i13) {
            double d11 = i11;
            return new LatLngBounds(e(i11, i13), (((i12 + 1) / Math.pow(2.0d, d11)) * 360.0d) - 180.0d, e(i11, i13 + 1), ((i12 / Math.pow(2.0d, d11)) * 360.0d) - 180.0d);
        }

        private static double e(int i11, int i12) {
            double pow = 3.141592653589793d - ((i12 * 6.283185307179586d) / Math.pow(2.0d, i11));
            return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
        }
    }

    @Keep
    public LatLngBounds(double d11, double d12, double d13, double d14) {
        this.latitudeNorth = d11;
        this.longitudeEast = d12;
        this.latitudeSouth = d13;
        this.longitudeWest = d14;
    }

    private final boolean containsLatitude(double latitude) {
        return latitude <= this.latitudeNorth && latitude >= this.latitudeSouth;
    }

    private final boolean containsLongitude(double longitude) {
        return longitude <= this.longitudeEast && longitude >= this.longitudeWest;
    }

    @NotNull
    public static final LatLngBounds from(double d11, double d12, double d13, double d14) {
        INSTANCE.getClass();
        return Companion.c(d11, d12, d13, d14);
    }

    private final LatLngBounds intersectNoParamCheck(double northLat, double eastLon, double southLat, double westLon) {
        double max = Math.max(this.longitudeWest, westLon);
        double min = Math.min(this.longitudeEast, eastLon);
        if (min < max) {
            return null;
        }
        double max2 = Math.max(this.latitudeSouth, southLat);
        double min2 = Math.min(this.latitudeNorth, northLat);
        if (min2 >= max2) {
            return new LatLngBounds(min2, min, max2, max);
        }
        return null;
    }

    private final LatLngBounds unionNoParamCheck(double northLat, double eastLon, double southLat, double westLon) {
        double d11 = this.latitudeNorth;
        if (d11 < northLat) {
            d11 = northLat;
        }
        double d12 = this.longitudeEast;
        double d13 = d12 < eastLon ? eastLon : d12;
        double d14 = this.latitudeSouth;
        double d15 = d14 > southLat ? southLat : d14;
        double d16 = this.longitudeWest;
        return new LatLngBounds(d11, d13, d15, d16 > westLon ? westLon : d16);
    }

    @NotNull
    public static final LatLngBounds world() {
        INSTANCE.getClass();
        return Companion.c(90.0d, 180.0d, -90.0d, -180.0d);
    }

    public final boolean contains(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) other;
            if (this.latitudeNorth == latLngBounds.latitudeNorth && this.latitudeSouth == latLngBounds.latitudeSouth && this.longitudeEast == latLngBounds.longitudeEast && this.longitudeWest == latLngBounds.longitudeWest) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    /* renamed from: getLatNorth, reason: from getter */
    public final double getLatitudeNorth() {
        return this.latitudeNorth;
    }

    /* renamed from: getLatSouth, reason: from getter */
    public final double getLatitudeSouth() {
        return this.latitudeSouth;
    }

    public final double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    /* renamed from: getLonEast, reason: from getter */
    public final double getLongitudeEast() {
        return this.longitudeEast;
    }

    /* renamed from: getLonWest, reason: from getter */
    public final double getLongitudeWest() {
        return this.longitudeWest;
    }

    public final double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    @NotNull
    public final LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    @NotNull
    public final LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    @NotNull
    public final LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    @NotNull
    public final LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    @NotNull
    public final Xf.a getSpan() {
        return new Xf.a(getLatitudeSpan(), getLongitudeSpan());
    }

    public int hashCode() {
        double d11 = 90;
        double d12 = ((this.latitudeSouth + d11) * 1000) + this.latitudeNorth + d11;
        double d13 = 180;
        return (int) (((this.longitudeWest + d13) * 1000000000) + ((this.longitudeEast + d13) * 1000000) + d12);
    }

    @NotNull
    public final LatLngBounds include(@NotNull LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        a aVar = new a();
        aVar.b(getNorthEast());
        aVar.b(getSouthWest());
        aVar.b(latLng);
        return aVar.a();
    }

    public final LatLngBounds intersect(@NotNull LatLngBounds box) {
        Intrinsics.checkNotNullParameter(box, "box");
        return intersectNoParamCheck(box.latitudeNorth, box.longitudeEast, box.latitudeSouth, box.longitudeWest);
    }

    public final boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    @NotNull
    public final LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    @NotNull
    public String toString() {
        double d11 = this.latitudeNorth;
        double d12 = this.longitudeEast;
        double d13 = this.latitudeSouth;
        double d14 = this.longitudeWest;
        StringBuilder e11 = e.e(d11, "N:", "; E:");
        e11.append(d12);
        e11.append("; S:");
        e11.append(d13);
        e11.append("; W:");
        e11.append(d14);
        return e11.toString();
    }

    @NotNull
    public final LatLngBounds union(@NotNull LatLngBounds bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return unionNoParamCheck(bounds.latitudeNorth, bounds.longitudeEast, bounds.latitudeSouth, bounds.longitudeWest);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.latitudeNorth);
        out.writeDouble(this.longitudeEast);
        out.writeDouble(this.latitudeSouth);
        out.writeDouble(this.longitudeWest);
    }

    @NotNull
    public static final LatLngBounds from(int i11, int i12, int i13) {
        INSTANCE.getClass();
        return Companion.d(i11, i12, i13);
    }

    public final boolean contains(@NotNull LatLngBounds other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return contains(other.getNorthEast()) && contains(other.getSouthWest());
    }

    @NotNull
    public final LatLngBounds intersect(double northLat, double eastLon, double southLat, double westLon) {
        Companion.a(INSTANCE, northLat, eastLon, southLat, westLon);
        LatLngBounds intersectNoParamCheck = intersectNoParamCheck(northLat, eastLon, southLat, westLon);
        Intrinsics.f(intersectNoParamCheck);
        return intersectNoParamCheck;
    }

    @NotNull
    public final LatLngBounds union(double northLat, double eastLon, double southLat, double westLon) {
        Companion.a(INSTANCE, northLat, eastLon, southLat, westLon);
        return unionNoParamCheck(northLat, eastLon, southLat, westLon);
    }
}

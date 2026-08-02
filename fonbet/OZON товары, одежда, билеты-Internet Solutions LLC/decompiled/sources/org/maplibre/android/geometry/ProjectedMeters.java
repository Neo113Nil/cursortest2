package org.maplibre.android.geometry;

import B90.C2619v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/geometry/ProjectedMeters;", "Landroid/os/Parcelable;", "", "northing", "easting", "<init>", "(DD)V", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ProjectedMeters implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProjectedMeters> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private double f79626a;

    /* renamed from: b, reason: collision with root package name */
    private double f79627b;

    public static final class a implements Parcelable.Creator<ProjectedMeters> {
        @Override // android.os.Parcelable.Creator
        public final ProjectedMeters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProjectedMeters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ProjectedMeters[] newArray(int i11) {
            return new ProjectedMeters[i11];
        }
    }

    @Keep
    public ProjectedMeters(double d11, double d12) {
        this.f79626a = d11;
        this.f79627b = d12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ProjectedMeters.class.equals(obj.getClass())) {
            ProjectedMeters projectedMeters = (ProjectedMeters) obj;
            if (Double.compare(projectedMeters.f79627b, this.f79627b) == 0 && Double.compare(projectedMeters.f79626a, this.f79626a) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f79627b);
        int i11 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f79626a);
        return (i11 * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProjectedMeters [northing=");
        sb2.append(this.f79626a);
        sb2.append(", easting=");
        return C2619v.c(sb2, this.f79627b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.f79626a);
        out.writeDouble(this.f79627b);
    }

    public ProjectedMeters(Parcel parcel) {
        this.f79626a = parcel.readDouble();
        this.f79627b = parcel.readDouble();
    }
}

package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lorg/maplibre/android/geometry/LatLngQuad;", "Landroid/os/Parcelable;", "Lorg/maplibre/android/geometry/LatLng;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;)V", "Lorg/maplibre/android/geometry/LatLng;", "getTopLeft", "()Lorg/maplibre/android/geometry/LatLng;", "getTopRight", "getBottomRight", "getBottomLeft", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LatLngQuad implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LatLngQuad> CREATOR = new a();

    @Keep
    @NotNull
    private final LatLng bottomLeft;

    @Keep
    @NotNull
    private final LatLng bottomRight;

    @Keep
    @NotNull
    private final LatLng topLeft;

    @Keep
    @NotNull
    private final LatLng topRight;

    public static final class a implements Parcelable.Creator<LatLngQuad> {
        @Override // android.os.Parcelable.Creator
        public final LatLngQuad createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final LatLngQuad[] newArray(int i11) {
            return new LatLngQuad[i11];
        }
    }

    @Keep
    public LatLngQuad(@NotNull LatLng topLeft, @NotNull LatLng topRight, @NotNull LatLng bottomRight, @NotNull LatLng bottomLeft) {
        Intrinsics.checkNotNullParameter(topLeft, "topLeft");
        Intrinsics.checkNotNullParameter(topRight, "topRight");
        Intrinsics.checkNotNullParameter(bottomRight, "bottomRight");
        Intrinsics.checkNotNullParameter(bottomLeft, "bottomLeft");
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
        this.bottomLeft = bottomLeft;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!LatLngQuad.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type org.maplibre.android.geometry.LatLngQuad");
        LatLngQuad latLngQuad = (LatLngQuad) obj;
        return Intrinsics.d(this.topLeft, latLngQuad.topLeft) && Intrinsics.d(this.topRight, latLngQuad.topRight) && Intrinsics.d(this.bottomRight, latLngQuad.bottomRight) && Intrinsics.d(this.bottomLeft, latLngQuad.bottomLeft);
    }

    public final int hashCode() {
        return this.bottomLeft.hashCode() + ((this.bottomRight.hashCode() + ((this.topRight.hashCode() + (this.topLeft.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i11) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.topLeft.writeToParcel(out, i11);
        this.topRight.writeToParcel(out, i11);
        this.bottomRight.writeToParcel(out, i11);
        this.bottomLeft.writeToParcel(out, i11);
    }
}

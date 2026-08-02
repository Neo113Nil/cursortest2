package org.maplibre.android.offline;

import E80.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B5\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB=\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0016@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0087\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0016@RX\u0097\u000e¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R$\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8\u0016@RX\u0097\u000e¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r8\u0016@RX\u0097\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition;", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "", "styleURL", "Lorg/maplibre/geojson/Geometry;", "geometry", "", "minZoom", "maxZoom", "", "pixelRatio", "<init>", "(Ljava/lang/String;Lorg/maplibre/geojson/Geometry;DDF)V", "", "includeIdeographs", "(Ljava/lang/String;Lorg/maplibre/geojson/Geometry;DDFZ)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "getStyleURL", "()Ljava/lang/String;", "Lorg/maplibre/geojson/Geometry;", "getGeometry", "()Lorg/maplibre/geojson/Geometry;", "D", "getMinZoom", "()D", "getMaxZoom", "F", "getPixelRatio", "()F", "Z", "getIncludeIdeographs", "()Z", "MapLibreAndroid_openglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class OfflineGeometryRegionDefinition implements OfflineRegionDefinition {

    @NotNull
    public static final Parcelable.Creator<?> CREATOR = new a();

    @Keep
    private Geometry geometry;

    @Keep
    private boolean includeIdeographs;

    @Keep
    private double maxZoom;

    @Keep
    private double minZoom;

    @Keep
    private float pixelRatio;

    @Keep
    private String styleURL;

    public static final class a implements Parcelable.Creator<Object> {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new OfflineGeometryRegionDefinition(in);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new OfflineGeometryRegionDefinition[i11];
        }
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry, double d11, double d12, float f7) {
        this(str, geometry, d11, d12, f7, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final LatLngBounds getBounds() {
        Geometry geometry = this.geometry;
        if (geometry == null) {
            return null;
        }
        double[] d11 = c.d(geometry);
        LatLngBounds.Companion companion = LatLngBounds.INSTANCE;
        double d12 = d11[3];
        double d13 = d11[2];
        double d14 = d11[1];
        double d15 = d11[0];
        companion.getClass();
        return LatLngBounds.Companion.c(d12, d13, d14, d15);
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final boolean getIncludeIdeographs() {
        return this.includeIdeographs;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMaxZoom() {
        return this.maxZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final double getMinZoom() {
        return this.minZoom;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final float getPixelRatio() {
        return this.pixelRatio;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    public final String getStyleURL() {
        return this.styleURL;
    }

    @Override // org.maplibre.android.offline.OfflineRegionDefinition
    @NotNull
    public final String getType() {
        return "shaperegion";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.styleURL);
        dest.writeString(Feature.fromGeometry(this.geometry).toJson());
        dest.writeDouble(this.minZoom);
        dest.writeDouble(this.maxZoom);
        dest.writeFloat(this.pixelRatio);
        dest.writeByte(this.includeIdeographs ? (byte) 1 : (byte) 0);
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry, double d11, double d12, float f7, boolean z11) {
        this.styleURL = str;
        this.geometry = geometry;
        this.minZoom = d11;
        this.maxZoom = d12;
        this.pixelRatio = f7;
        this.includeIdeographs = z11;
    }

    public OfflineGeometryRegionDefinition(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.styleURL = parcel.readString();
        String readString = parcel.readString();
        Intrinsics.f(readString);
        this.geometry = Feature.fromJson(readString).geometry();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
        this.includeIdeographs = parcel.readByte() != 0;
    }
}

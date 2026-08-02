package org.maplibre.geojson;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.io.Serializable;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

@Keep
/* loaded from: classes10.dex */
public class BoundingBox implements Serializable {
    private final Point northeast;
    private final Point southwest;

    BoundingBox(Point point, Point point2) {
        if (point == null) {
            throw new NullPointerException("Null southwest");
        }
        this.southwest = point;
        if (point2 == null) {
            throw new NullPointerException("Null northeast");
        }
        this.northeast = point2;
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d11, double d12, double d13, double d14) {
        return fromLngLats(d11, d12, d13, d14);
    }

    public static BoundingBox fromJson(String str) {
        f fVar = new f();
        fVar.c(BoundingBox.class, new BoundingBoxTypeAdapter());
        return (BoundingBox) fVar.a().d(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(double d11, double d12, double d13, double d14) {
        return new BoundingBox(Point.fromLngLat(d11, d12), Point.fromLngLat(d13, d14));
    }

    public static BoundingBox fromPoints(@NonNull Point point, @NonNull Point point2) {
        return new BoundingBox(point, point2);
    }

    public static TypeAdapter<BoundingBox> typeAdapter(Gson gson) {
        return new BoundingBoxTypeAdapter();
    }

    public final double east() {
        return northeast().longitude();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BoundingBox) {
            BoundingBox boundingBox = (BoundingBox) obj;
            if (this.southwest.equals(boundingBox.southwest()) && this.northeast.equals(boundingBox.northeast())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public final double north() {
        return northeast().latitude();
    }

    @NonNull
    public Point northeast() {
        return this.northeast;
    }

    public final double south() {
        return southwest().latitude();
    }

    @NonNull
    public Point southwest() {
        return this.southwest;
    }

    public final String toJson() {
        f fVar = new f();
        fVar.c(BoundingBox.class, new BoundingBoxTypeAdapter());
        return fVar.a().l(this, BoundingBox.class);
    }

    public String toString() {
        return "BoundingBox{southwest=" + this.southwest + ", northeast=" + this.northeast + "}";
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d11, double d12, double d13, double d14, double d15, double d16) {
        return fromLngLats(d11, d12, d13, d14, d15, d16);
    }

    public static BoundingBox fromLngLats(double d11, double d12, double d13, double d14, double d15, double d16) {
        return new BoundingBox(Point.fromLngLat(d11, d12, d13), Point.fromLngLat(d14, d15, d16));
    }
}

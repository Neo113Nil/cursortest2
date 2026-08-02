package org.maplibre.geojson;

import B90.C2618u;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;
import org.maplibre.geojson.shifter.CoordinateShifterManager;

@Keep
/* loaded from: classes10.dex */
public final class Point implements CoordinateContainer<List<Double>> {
    private static final String TYPE = "Point";
    private final BoundingBox bbox;

    @NonNull
    private final List<Double> coordinates;

    @NonNull
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.maplibre.geojson.BaseGeometryTypeAdapter
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Double> list) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, list);
        }

        @Override // com.google.gson.TypeAdapter
        public Point read(JsonReader jsonReader) throws IOException {
            return (Point) readCoordinateContainer(jsonReader);
        }

        @Override // com.google.gson.TypeAdapter
        public void write(JsonWriter jsonWriter, Point point) throws IOException {
            writeCoordinateContainer(jsonWriter, point);
        }
    }

    Point(String str, BoundingBox boundingBox, List<Double> list) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.type = str;
        this.bbox = boundingBox;
        if (list == null || list.size() == 0) {
            throw new NullPointerException("Null coordinates");
        }
        this.coordinates = list;
    }

    public static Point fromJson(@NonNull String str) {
        f fVar = new f();
        fVar.d(GeoJsonAdapterFactory.create());
        return (Point) fVar.a().d(str, Point.class);
    }

    public static Point fromLngLat(double d11, double d12) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d11, d12));
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return coordinates().get(2).doubleValue();
    }

    @Override // org.maplibre.geojson.GeoJson
    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            if (this.type.equals(point.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(point.bbox()) : point.bbox() == null) && this.coordinates.equals(point.coordinates())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public double latitude() {
        return coordinates().get(1).doubleValue();
    }

    public double longitude() {
        return coordinates().get(0).doubleValue();
    }

    @Override // org.maplibre.geojson.GeoJson
    public String toJson() {
        f fVar = new f();
        fVar.d(GeoJsonAdapterFactory.create());
        return fVar.a().k(this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Point{type=");
        sb2.append(this.type);
        sb2.append(", bbox=");
        sb2.append(this.bbox);
        sb2.append(", coordinates=");
        return C2618u.h(sb2, this.coordinates, "}");
    }

    @Override // org.maplibre.geojson.GeoJson
    @NonNull
    public String type() {
        return this.type;
    }

    @Override // org.maplibre.geojson.CoordinateContainer
    @NonNull
    public List<Double> coordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d11, double d12, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d11, d12));
    }

    public static Point fromLngLat(double d11, double d12, double d13) {
        return new Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d11, d12, d13));
    }

    public static Point fromLngLat(double d11, double d12, double d13, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d11, d12, d13));
    }

    static Point fromLngLat(@NonNull double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }
}

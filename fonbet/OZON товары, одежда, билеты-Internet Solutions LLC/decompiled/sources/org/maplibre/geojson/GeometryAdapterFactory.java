package org.maplibre.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.a;
import com.google.gson.t;
import org.maplibre.geojson.internal.typeadapters.RuntimeTypeAdapterFactory;

@Keep
/* loaded from: classes10.dex */
public abstract class GeometryAdapterFactory implements t {
    private static t geometryTypeFactory;

    public static t create() {
        if (geometryTypeFactory == null) {
            geometryTypeFactory = RuntimeTypeAdapterFactory.of(Geometry.class, "type", true).registerSubtype(GeometryCollection.class, "GeometryCollection").registerSubtype(Point.class, "Point").registerSubtype(MultiPoint.class, "MultiPoint").registerSubtype(LineString.class, "LineString").registerSubtype(MultiLineString.class, "MultiLineString").registerSubtype(Polygon.class, "Polygon").registerSubtype(MultiPolygon.class, "MultiPolygon");
        }
        return geometryTypeFactory;
    }

    @Override // com.google.gson.t
    public abstract /* synthetic */ TypeAdapter create(Gson gson, a aVar);
}

package org.maplibre.geojson.gson;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.gson.f;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.GeometryAdapterFactory;

@Keep
/* loaded from: classes10.dex */
public class GeometryGeoJson {
    public static Geometry fromJson(@NonNull String str) {
        f fVar = new f();
        fVar.d(GeoJsonAdapterFactory.create());
        fVar.d(GeometryAdapterFactory.create());
        return (Geometry) fVar.a().d(str, Geometry.class);
    }
}

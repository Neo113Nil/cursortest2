package org.maplibre.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
/* loaded from: classes10.dex */
public interface GeoJson extends Serializable {
    BoundingBox bbox();

    String toJson();

    String type();
}

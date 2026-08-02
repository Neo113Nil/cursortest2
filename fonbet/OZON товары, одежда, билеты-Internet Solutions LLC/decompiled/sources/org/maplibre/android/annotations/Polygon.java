package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;

@Deprecated
/* loaded from: classes10.dex */
public final class Polygon extends BasePointCollection {

    @Keep
    private int fillColor = -16777216;

    @Keep
    private int strokeColor = -16777216;

    @Keep
    private List<List<LatLng>> holes = new ArrayList();

    Polygon() {
    }
}

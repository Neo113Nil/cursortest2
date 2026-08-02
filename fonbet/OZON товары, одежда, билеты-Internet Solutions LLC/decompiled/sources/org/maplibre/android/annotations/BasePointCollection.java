package org.maplibre.android.annotations;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.android.geometry.LatLng;

@Deprecated
/* loaded from: classes10.dex */
public abstract class BasePointCollection extends Sf.a {

    @Keep
    private float alpha = 1.0f;

    @Keep
    private List<LatLng> points = new ArrayList();

    protected BasePointCollection() {
    }
}

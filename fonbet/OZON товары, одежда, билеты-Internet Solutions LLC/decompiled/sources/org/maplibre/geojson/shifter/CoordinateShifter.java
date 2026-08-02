package org.maplibre.geojson.shifter;

import java.util.List;
import org.maplibre.geojson.Point;

/* loaded from: classes10.dex */
public interface CoordinateShifter {
    List<Double> shiftLonLat(double d11, double d12);

    List<Double> shiftLonLatAlt(double d11, double d12, double d13);

    List<Double> unshiftPoint(List<Double> list);

    List<Double> unshiftPoint(Point point);
}

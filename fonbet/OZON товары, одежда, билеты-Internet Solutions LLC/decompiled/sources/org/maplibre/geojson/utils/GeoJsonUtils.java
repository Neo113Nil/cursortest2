package org.maplibre.geojson.utils;

/* loaded from: classes10.dex */
public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = (long) (9.223372036854776E18d / 1.0E7d);
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d11) {
        long j11 = MAX_DOUBLE_TO_ROUND;
        return (d11 > ((double) j11) || d11 < ((double) (-j11))) ? d11 : Math.round(d11 * ROUND_PRECISION) / ROUND_PRECISION;
    }
}

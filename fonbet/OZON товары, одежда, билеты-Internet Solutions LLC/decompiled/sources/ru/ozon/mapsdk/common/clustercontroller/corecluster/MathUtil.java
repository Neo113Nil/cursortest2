package ru.ozon.mapsdk.common.clustercontroller.corecluster;

/* loaded from: classes3.dex */
class MathUtil {
    static final double EARTH_RADIUS = 6371009.0d;

    MathUtil() {
    }

    static double arcHav(double d11) {
        return Math.asin(Math.sqrt(d11)) * 2.0d;
    }

    static double clamp(double d11, double d12, double d13) {
        return d11 < d12 ? d12 : d11 > d13 ? d13 : d11;
    }

    static double hav(double d11) {
        double sin = Math.sin(d11 * 0.5d);
        return sin * sin;
    }

    static double havDistance(double d11, double d12, double d13) {
        return (Math.cos(d12) * Math.cos(d11) * hav(d13)) + hav(d11 - d12);
    }

    static double havFromSin(double d11) {
        double d12 = d11 * d11;
        return (d12 / (Math.sqrt(1.0d - d12) + 1.0d)) * 0.5d;
    }

    static double inverseMercator(double d11) {
        return (Math.atan(Math.exp(d11)) * 2.0d) - 1.5707963267948966d;
    }

    static double mercator(double d11) {
        return Math.log(Math.tan((d11 * 0.5d) + 0.7853981633974483d));
    }

    static double mod(double d11, double d12) {
        return ((d11 % d12) + d12) % d12;
    }

    static double sinFromHav(double d11) {
        return Math.sqrt((1.0d - d11) * d11) * 2.0d;
    }

    static double sinSumFromHav(double d11, double d12) {
        double sqrt = Math.sqrt((1.0d - d11) * d11);
        double sqrt2 = Math.sqrt((1.0d - d12) * d12);
        return ((sqrt + sqrt2) - (((sqrt2 * d11) + (sqrt * d12)) * 2.0d)) * 2.0d;
    }

    static double wrap(double d11, double d12, double d13) {
        return (d11 < d12 || d11 >= d13) ? mod(d11 - d12, d13 - d12) + d12 : d11;
    }
}

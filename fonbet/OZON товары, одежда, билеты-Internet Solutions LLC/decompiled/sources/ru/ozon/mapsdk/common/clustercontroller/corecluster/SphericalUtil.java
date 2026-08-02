package ru.ozon.mapsdk.common.clustercontroller.corecluster;

import java.util.List;
import we0.m;

/* loaded from: classes3.dex */
public class SphericalUtil {
    private SphericalUtil() {
    }

    static double computeAngleBetween(m mVar, m mVar2) {
        return distanceRadians(Math.toRadians(mVar.getLatitude()), Math.toRadians(mVar.getLongitude()), Math.toRadians(mVar2.getLatitude()), Math.toRadians(mVar2.getLongitude()));
    }

    public static double computeArea(List<m> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeDistanceBetween(m mVar, m mVar2) {
        return computeAngleBetween(mVar, mVar2) * 6371009.0d;
    }

    public static double computeHeading(m mVar, m mVar2) {
        double radians = Math.toRadians(mVar.getLatitude());
        double radians2 = Math.toRadians(mVar.getLongitude());
        double radians3 = Math.toRadians(mVar2.getLatitude());
        double radians4 = Math.toRadians(mVar2.getLongitude()) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.cos(radians3) * Math.sin(radians4), (Math.sin(radians3) * Math.cos(radians)) - (Math.cos(radians4) * (Math.cos(radians3) * Math.sin(radians))))), -180.0d, 180.0d);
    }

    public static double computeLength(List<m> list) {
        double d11 = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        m mVar = null;
        for (m mVar2 : list) {
            if (mVar != null) {
                d11 += distanceRadians(Math.toRadians(mVar.getLatitude()), Math.toRadians(mVar.getLongitude()), Math.toRadians(mVar2.getLatitude()), Math.toRadians(mVar2.getLongitude()));
            }
            mVar = mVar2;
        }
        return d11 * 6371009.0d;
    }

    public static m computeOffset(m mVar, double d11, double d12) {
        double d13 = d11 / 6371009.0d;
        double radians = Math.toRadians(d12);
        double radians2 = Math.toRadians(mVar.getLatitude());
        double radians3 = Math.toRadians(mVar.getLongitude());
        double cos = Math.cos(d13);
        double sin = Math.sin(d13);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (Math.cos(radians) * cos2) + (cos * sin2);
        return new m(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * cos2, cos - (sin2 * cos3))));
    }

    public static m computeOffsetOrigin(m mVar, double d11, double d12) {
        double radians = Math.toRadians(d12);
        double d13 = d11 / 6371009.0d;
        double cos = Math.cos(d13);
        double cos2 = Math.cos(radians) * Math.sin(d13);
        double sin = Math.sin(radians) * Math.sin(d13);
        double sin2 = Math.sin(Math.toRadians(mVar.getLatitude()));
        double d14 = cos * cos;
        double d15 = cos2 * cos2;
        double d16 = ((d14 * d14) + (d15 * d14)) - ((d14 * sin2) * sin2);
        if (d16 < 0.0d) {
            return null;
        }
        double d17 = cos2 * sin2;
        double d18 = d14 + d15;
        double sqrt = (Math.sqrt(d16) + d17) / d18;
        double d19 = (sin2 - (cos2 * sqrt)) / cos;
        double atan2 = Math.atan2(d19, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d19, (d17 - Math.sqrt(d16)) / d18);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new m(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(mVar.getLongitude()) - Math.atan2(sin, (Math.cos(atan2) * cos) - (Math.sin(atan2) * cos2))));
    }

    public static double computeSignedArea(List<m> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    private static double distanceRadians(double d11, double d12, double d13, double d14) {
        return MathUtil.arcHav(MathUtil.havDistance(d11, d13, d12 - d14));
    }

    public static m interpolate(m mVar, m mVar2, double d11) {
        double radians = Math.toRadians(mVar.getLatitude());
        double radians2 = Math.toRadians(mVar.getLongitude());
        double radians3 = Math.toRadians(mVar2.getLatitude());
        double radians4 = Math.toRadians(mVar2.getLongitude());
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double computeAngleBetween = computeAngleBetween(mVar, mVar2);
        double sin = Math.sin(computeAngleBetween);
        if (sin < 1.0E-6d) {
            return new m(((mVar2.getLatitude() - mVar.getLatitude()) * d11) + mVar.getLatitude(), ((mVar2.getLongitude() - mVar.getLongitude()) * d11) + mVar.getLongitude());
        }
        double sin2 = Math.sin((1.0d - d11) * computeAngleBetween) / sin;
        double sin3 = Math.sin(computeAngleBetween * d11) / sin;
        double d12 = cos * sin2;
        double d13 = cos2 * sin3;
        double cos3 = (Math.cos(radians4) * d13) + (Math.cos(radians2) * d12);
        double sin4 = (Math.sin(radians4) * d13) + (Math.sin(radians2) * d12);
        return new m(Math.toDegrees(Math.atan2((Math.sin(radians3) * sin3) + (Math.sin(radians) * sin2), Math.sqrt((sin4 * sin4) + (cos3 * cos3)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    private static double polarTriangleArea(double d11, double d12, double d13, double d14) {
        double d15 = d12 - d14;
        double d16 = d11 * d13;
        return Math.atan2(Math.sin(d15) * d16, (Math.cos(d15) * d16) + 1.0d) * 2.0d;
    }

    static double computeSignedArea(List<m> list, double d11) {
        int size = list.size();
        double d12 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        m mVar = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(mVar.getLatitude())) / 2.0d);
        double radians = Math.toRadians(mVar.getLongitude());
        double d13 = tan;
        double d14 = radians;
        for (m mVar2 : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(mVar2.getLatitude())) / 2.0d);
            double radians2 = Math.toRadians(mVar2.getLongitude());
            d12 += polarTriangleArea(tan2, radians2, d13, d14);
            d13 = tan2;
            d14 = radians2;
        }
        return d11 * d11 * d12;
    }
}

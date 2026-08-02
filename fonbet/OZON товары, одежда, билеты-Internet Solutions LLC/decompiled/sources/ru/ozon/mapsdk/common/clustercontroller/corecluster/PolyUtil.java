package ru.ozon.mapsdk.common.clustercontroller.corecluster;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import we0.m;

/* loaded from: classes3.dex */
public class PolyUtil {
    public static final double DEFAULT_TOLERANCE = 0.1d;

    private PolyUtil() {
    }

    public static boolean containsLocation(m mVar, List<m> list, boolean z11) {
        return containsLocation(mVar.getLatitude(), mVar.getLongitude(), list, z11);
    }

    public static List<m> decode(String str) {
        int i11;
        int i12;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < length) {
            int i16 = 1;
            int i17 = 0;
            int i18 = 1;
            while (true) {
                i11 = i13 + 1;
                int charAt = str.charAt(i13) - '@';
                i18 += charAt << i17;
                i17 += 5;
                if (charAt < 31) {
                    break;
                }
                i13 = i11;
            }
            int i19 = ((i18 & 1) != 0 ? ~(i18 >> 1) : i18 >> 1) + i14;
            int i21 = 0;
            while (true) {
                i12 = i11 + 1;
                int charAt2 = str.charAt(i11) - '@';
                i16 += charAt2 << i21;
                i21 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i11 = i12;
            }
            i15 += (i16 & 1) != 0 ? ~(i16 >> 1) : i16 >> 1;
            arrayList.add(new m(i19 * 1.0E-5d, i15 * 1.0E-5d));
            i14 = i19;
            i13 = i12;
        }
        return arrayList;
    }

    public static double distanceToLine(m mVar, m mVar2, m mVar3) {
        if (mVar2.equals(mVar3)) {
            return SphericalUtil.computeDistanceBetween(mVar3, mVar);
        }
        double radians = Math.toRadians(mVar.getLatitude());
        double radians2 = Math.toRadians(mVar.getLongitude());
        double radians3 = Math.toRadians(mVar2.getLatitude());
        double radians4 = Math.toRadians(mVar2.getLongitude());
        double radians5 = Math.toRadians(mVar3.getLatitude());
        double radians6 = Math.toRadians(mVar3.getLongitude());
        double cos = Math.cos(radians3);
        double d11 = radians5 - radians3;
        double d12 = (radians6 - radians4) * cos;
        double d13 = ((((radians2 - radians4) * cos) * d12) + ((radians - radians3) * d11)) / ((d12 * d12) + (d11 * d11));
        if (d13 <= 0.0d) {
            return SphericalUtil.computeDistanceBetween(mVar, mVar2);
        }
        if (d13 >= 1.0d) {
            return SphericalUtil.computeDistanceBetween(mVar, mVar3);
        }
        return SphericalUtil.computeDistanceBetween(mVar, new m(((mVar3.getLatitude() - mVar2.getLatitude()) * d13) + mVar2.getLatitude(), ((mVar3.getLongitude() - mVar2.getLongitude()) * d13) + mVar2.getLongitude()));
    }

    public static String encode(List<m> list) {
        StringBuffer stringBuffer = new StringBuffer();
        long j11 = 0;
        long j12 = 0;
        for (m mVar : list) {
            long round = Math.round(mVar.getLatitude() * 100000.0d);
            long round2 = Math.round(mVar.getLongitude() * 100000.0d);
            encode(round - j11, stringBuffer);
            encode(round2 - j12, stringBuffer);
            j11 = round;
            j12 = round2;
        }
        return stringBuffer.toString();
    }

    private static boolean intersects(double d11, double d12, double d13, double d14, double d15, boolean z11) {
        if ((d15 >= 0.0d && d15 >= d13) || ((d15 < 0.0d && d15 < d13) || d14 <= -1.5707963267948966d || d11 <= -1.5707963267948966d || d12 <= -1.5707963267948966d || d11 >= 1.5707963267948966d || d12 >= 1.5707963267948966d || d13 <= -3.141592653589793d)) {
            return false;
        }
        double d16 = ((d12 * d15) + ((d13 - d15) * d11)) / d13;
        if (d11 >= 0.0d && d12 >= 0.0d && d14 < d16) {
            return false;
        }
        if ((d11 > 0.0d || d12 > 0.0d || d14 < d16) && d14 < 1.5707963267948966d) {
            return z11 ? Math.tan(d14) >= tanLatGC(d11, d12, d13, d15) : MathUtil.mercator(d14) >= mercatorLatRhumb(d11, d12, d13, d15);
        }
        return true;
    }

    public static boolean isClosedPolygon(List<m> list) {
        return list.get(0).equals(list.get(list.size() - 1));
    }

    public static boolean isLocationOnEdge(m mVar, List<m> list, boolean z11, double d11) {
        return isLocationOnEdgeOrPath(mVar, list, true, z11, d11);
    }

    private static boolean isLocationOnEdgeOrPath(m mVar, List<m> list, boolean z11, boolean z12, double d11) {
        return locationIndexOnEdgeOrPath(mVar, list, z11, z12, d11) >= 0;
    }

    public static boolean isLocationOnPath(m mVar, List<m> list, boolean z11, double d11) {
        return isLocationOnEdgeOrPath(mVar, list, false, z11, d11);
    }

    private static boolean isOnSegmentGC(double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        double havDistance = MathUtil.havDistance(d11, d15, d12 - d16);
        if (havDistance <= d17) {
            return true;
        }
        double havDistance2 = MathUtil.havDistance(d13, d15, d14 - d16);
        if (havDistance2 <= d17) {
            return true;
        }
        double havFromSin = MathUtil.havFromSin(MathUtil.sinFromHav(havDistance) * sinDeltaBearing(d11, d12, d13, d14, d15, d16));
        if (havFromSin > d17) {
            return false;
        }
        double havDistance3 = MathUtil.havDistance(d11, d13, d12 - d14);
        double d18 = ((1.0d - (havDistance3 * 2.0d)) * havFromSin) + havDistance3;
        if (havDistance <= d18 && havDistance2 <= d18) {
            if (havDistance3 < 0.74d) {
                return true;
            }
            double d19 = 1.0d - (2.0d * havFromSin);
            if (MathUtil.sinSumFromHav((havDistance - havFromSin) / d19, (havDistance2 - havFromSin) / d19) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public static int locationIndexOnEdgeOrPath(m mVar, List<m> list, boolean z11, boolean z12, double d11) {
        boolean z13 = true;
        int size = list.size();
        if (size == 0) {
            return -1;
        }
        double d12 = d11 / 6371009.0d;
        double hav = MathUtil.hav(d12);
        double radians = Math.toRadians(mVar.getLatitude());
        double radians2 = Math.toRadians(mVar.getLongitude());
        m mVar2 = list.get(z11 ? size - 1 : 0);
        double radians3 = Math.toRadians(mVar2.getLatitude());
        double radians4 = Math.toRadians(mVar2.getLongitude());
        if (z12) {
            int i11 = 0;
            double d13 = radians3;
            double d14 = radians4;
            for (m mVar3 : list) {
                double radians5 = Math.toRadians(mVar3.getLatitude());
                double radians6 = Math.toRadians(mVar3.getLongitude());
                if (isOnSegmentGC(d13, d14, radians5, radians6, radians, radians2, hav)) {
                    return Math.max(0, i11 - 1);
                }
                i11++;
                d13 = radians5;
                d14 = radians6;
            }
        } else {
            double d15 = radians - d12;
            double d16 = d12 + radians;
            double mercator = MathUtil.mercator(radians3);
            double mercator2 = MathUtil.mercator(radians);
            Iterator<m> it = list.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                m next = it.next();
                boolean z14 = z13;
                Iterator<m> it2 = it;
                double radians7 = Math.toRadians(next.getLatitude());
                double mercator3 = MathUtil.mercator(radians7);
                double radians8 = Math.toRadians(next.getLongitude());
                if (Math.max(radians3, radians7) >= d15 && Math.min(radians3, radians7) <= d16) {
                    double wrap = MathUtil.wrap(radians8 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double wrap2 = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
                    double[] dArr = new double[3];
                    dArr[0] = wrap2;
                    dArr[z14 ? 1 : 0] = wrap2 + 6.283185307179586d;
                    dArr[2] = wrap2 - 6.283185307179586d;
                    int i13 = 0;
                    while (i13 < 3) {
                        double d17 = dArr[i13];
                        double d18 = mercator3 - mercator;
                        double d19 = (d18 * d18) + (wrap * wrap);
                        double clamp = d19 > 0.0d ? MathUtil.clamp((((mercator2 - mercator) * d18) + (d17 * wrap)) / d19, 0.0d, 1.0d) : 0.0d;
                        double d21 = radians;
                        if (MathUtil.havDistance(d21, MathUtil.inverseMercator((clamp * d18) + mercator), d17 - (clamp * wrap)) < hav) {
                            return Math.max(0, i12 - 1);
                        }
                        i13++;
                        radians = d21;
                    }
                }
                i12++;
                radians3 = radians7;
                mercator = mercator3;
                z13 = z14 ? 1 : 0;
                it = it2;
                radians4 = radians8;
                radians = radians;
            }
        }
        return -1;
    }

    public static int locationIndexOnPath(m mVar, List<m> list, boolean z11, double d11) {
        return locationIndexOnEdgeOrPath(mVar, list, false, z11, d11);
    }

    private static double mercatorLatRhumb(double d11, double d12, double d13, double d14) {
        return ((MathUtil.mercator(d12) * d14) + ((d13 - d14) * MathUtil.mercator(d11))) / d13;
    }

    public static List<m> simplify(List<m> list, double d11) {
        m mVar;
        int size = list.size();
        int i11 = 1;
        if (size < 1) {
            throw new IllegalArgumentException("Polyline must have at least 1 point");
        }
        if (d11 <= 0.0d) {
            throw new IllegalArgumentException("Tolerance must be greater than zero");
        }
        boolean isClosedPolygon = isClosedPolygon(list);
        if (isClosedPolygon) {
            mVar = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(new m(mVar.getLatitude() + 1.0E-11d, mVar.getLongitude() + 1.0E-11d));
        } else {
            mVar = null;
        }
        Stack stack = new Stack();
        double[] dArr = new double[size];
        int i12 = 0;
        dArr[0] = 1.0d;
        int i13 = size - 1;
        dArr[i13] = 1.0d;
        if (size > 2) {
            stack.push(new int[]{0, i13});
            int i14 = 0;
            while (stack.size() > 0) {
                int[] iArr = (int[]) stack.pop();
                int i15 = iArr[0] + i11;
                double d12 = 0.0d;
                while (i15 < iArr[i11]) {
                    int i16 = i11;
                    double distanceToLine = distanceToLine(list.get(i15), list.get(iArr[0]), list.get(iArr[i16]));
                    if (distanceToLine > d12) {
                        i14 = i15;
                        d12 = distanceToLine;
                    }
                    i15++;
                    i11 = i16;
                }
                int i17 = i11;
                if (d12 > d11) {
                    dArr[i14] = d12;
                    stack.push(new int[]{iArr[0], i14});
                    stack.push(new int[]{i14, iArr[i17]});
                }
                i11 = i17;
            }
        }
        if (isClosedPolygon) {
            list.remove(list.size() - 1);
            list.add(mVar);
        }
        ArrayList arrayList = new ArrayList();
        for (m mVar2 : list) {
            if (dArr[i12] != 0.0d) {
                arrayList.add(mVar2);
            }
            i12++;
        }
        return arrayList;
    }

    private static double sinDeltaBearing(double d11, double d12, double d13, double d14, double d15, double d16) {
        double sin = Math.sin(d11);
        double cos = Math.cos(d13);
        double cos2 = Math.cos(d15);
        double d17 = d16 - d12;
        double d18 = d14 - d12;
        double sin2 = Math.sin(d17) * cos2;
        double sin3 = Math.sin(d18) * cos;
        double d19 = sin * 2.0d;
        double hav = (cos2 * d19 * MathUtil.hav(d17)) + Math.sin(d15 - d11);
        double hav2 = (d19 * cos * MathUtil.hav(d18)) + Math.sin(d13 - d11);
        double d21 = ((hav2 * hav2) + (sin3 * sin3)) * ((hav * hav) + (sin2 * sin2));
        if (d21 <= 0.0d) {
            return 1.0d;
        }
        return ((sin2 * hav2) - (hav * sin3)) / Math.sqrt(d21);
    }

    private static double tanLatGC(double d11, double d12, double d13, double d14) {
        return ((Math.sin(d14) * Math.tan(d12)) + (Math.sin(d13 - d14) * Math.tan(d11))) / Math.sin(d13);
    }

    public static boolean containsLocation(double d11, double d12, List<m> list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return false;
        }
        double radians = Math.toRadians(d11);
        double radians2 = Math.toRadians(d12);
        m mVar = list.get(size - 1);
        double radians3 = Math.toRadians(mVar.getLatitude());
        double radians4 = Math.toRadians(mVar.getLongitude());
        int i11 = 0;
        double d13 = radians3;
        for (m mVar2 : list) {
            double wrap = MathUtil.wrap(radians2 - radians4, -3.141592653589793d, 3.141592653589793d);
            if (radians == d13 && wrap == 0.0d) {
                return true;
            }
            double radians5 = Math.toRadians(mVar2.getLatitude());
            double radians6 = Math.toRadians(mVar2.getLongitude());
            if (intersects(d13, radians5, MathUtil.wrap(radians6 - radians4, -3.141592653589793d, 3.141592653589793d), radians, wrap, z11)) {
                i11++;
            }
            d13 = radians5;
            radians4 = radians6;
        }
        return (i11 & 1) != 0;
    }

    public static boolean isLocationOnEdge(m mVar, List<m> list, boolean z11) {
        return isLocationOnEdge(mVar, list, z11, 0.1d);
    }

    public static boolean isLocationOnPath(m mVar, List<m> list, boolean z11) {
        return isLocationOnPath(mVar, list, z11, 0.1d);
    }

    public static int locationIndexOnPath(m mVar, List<m> list, boolean z11) {
        return locationIndexOnPath(mVar, list, z11, 0.1d);
    }

    private static void encode(long j11, StringBuffer stringBuffer) {
        long j12 = j11 << 1;
        if (j11 < 0) {
            j12 = ~j12;
        }
        while (j12 >= 32) {
            stringBuffer.append(Character.toChars((int) ((32 | (31 & j12)) + 63)));
            j12 >>= 5;
        }
        stringBuffer.append(Character.toChars((int) (j12 + 63)));
    }
}

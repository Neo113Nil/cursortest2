package org.maplibre.geojson.utils;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.Point;

/* loaded from: classes10.dex */
public final class PolylineUtils {
    private static final boolean SIMPLIFY_DEFAULT_HIGHEST_QUALITY = false;
    private static final double SIMPLIFY_DEFAULT_TOLERANCE = 1.0d;

    private PolylineUtils() {
    }

    @NonNull
    public static List<Point> decode(@NonNull String str, int i11) {
        int i12;
        int i13;
        int length = str.length();
        double pow = Math.pow(10.0d, i11);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < length) {
            int i17 = 1;
            int i18 = 0;
            int i19 = 1;
            while (true) {
                i12 = i14 + 1;
                int charAt = str.charAt(i14) - '@';
                i19 += charAt << i18;
                i18 += 5;
                if (charAt < 31) {
                    break;
                }
                i14 = i12;
            }
            int i21 = ((i19 & 1) != 0 ? ~(i19 >> 1) : i19 >> 1) + i15;
            int i22 = 0;
            while (true) {
                i13 = i12 + 1;
                int charAt2 = str.charAt(i12) - '@';
                i17 += charAt2 << i22;
                i22 += 5;
                if (charAt2 < 31) {
                    break;
                }
                i12 = i13;
            }
            i16 += (i17 & 1) != 0 ? ~(i17 >> 1) : i17 >> 1;
            arrayList.add(Point.fromLngLat(i16 / pow, i21 / pow));
            i15 = i21;
            i14 = i13;
        }
        return arrayList;
    }

    @NonNull
    public static String encode(@NonNull List<Point> list, int i11) {
        StringBuilder sb2 = new StringBuilder();
        double pow = Math.pow(10.0d, i11);
        long j11 = 0;
        long j12 = 0;
        for (Point point : list) {
            long round = Math.round(point.latitude() * pow);
            long round2 = Math.round(point.longitude() * pow);
            encode(round - j11, sb2);
            encode(round2 - j12, sb2);
            j11 = round;
            j12 = round2;
        }
        return sb2.toString();
    }

    private static double getSqDist(Point point, Point point2) {
        double longitude = point.longitude() - point2.longitude();
        double latitude = point.latitude() - point2.latitude();
        return (latitude * latitude) + (longitude * longitude);
    }

    private static double getSqSegDist(Point point, Point point2, Point point3) {
        double longitude = point2.longitude();
        double latitude = point2.latitude();
        double longitude2 = point3.longitude() - longitude;
        double latitude2 = point3.latitude() - latitude;
        if (longitude2 != 0.0d || latitude2 != 0.0d) {
            double latitude3 = (((point.latitude() - latitude) * latitude2) + ((point.longitude() - longitude) * longitude2)) / ((latitude2 * latitude2) + (longitude2 * longitude2));
            if (latitude3 > 1.0d) {
                longitude = point3.longitude();
                latitude = point3.latitude();
            } else if (latitude3 > 0.0d) {
                longitude += longitude2 * latitude3;
                latitude += latitude2 * latitude3;
            }
        }
        double longitude3 = point.longitude() - longitude;
        double latitude4 = point.latitude() - latitude;
        return (latitude4 * latitude4) + (longitude3 * longitude3);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list) {
        return simplify(list, 1.0d, false);
    }

    private static List<Point> simplifyDouglasPeucker(List<Point> list, double d11) {
        int size = list.size() - 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(list.get(0));
        arrayList.addAll(simplifyDpStep(list, 0, size, d11, arrayList));
        arrayList.add(list.get(size));
        return arrayList;
    }

    private static List<Point> simplifyDpStep(List<Point> list, int i11, int i12, double d11, List<Point> list2) {
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        double d12 = d11;
        for (int i15 = i11 + 1; i15 < i12; i15++) {
            double sqSegDist = getSqSegDist(list.get(i15), list.get(i11), list.get(i12));
            if (sqSegDist > d12) {
                i14 = i15;
                d12 = sqSegDist;
            }
        }
        if (d12 > d11) {
            if (i14 - i11 > 1) {
                List<Point> simplifyDpStep = simplifyDpStep(list, i11, i14, d11, list2);
                i13 = i14;
                arrayList.addAll(simplifyDpStep);
            } else {
                i13 = i14;
            }
            arrayList.add(list.get(i13));
            if (i12 - i13 > 1) {
                arrayList.addAll(simplifyDpStep(list, i13, i12, d11, list2));
            }
        }
        return arrayList;
    }

    private static List<Point> simplifyRadialDist(List<Point> list, double d11) {
        Point point = list.get(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        int size = list.size();
        Point point2 = null;
        for (int i11 = 1; i11 < size; i11++) {
            point2 = list.get(i11);
            if (getSqDist(point2, point) > d11) {
                arrayList.add(point2);
                point = point2;
            }
        }
        if (!point.equals(point2)) {
            arrayList.add(point2);
        }
        return arrayList;
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d11) {
        return simplify(list, d11, false);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, boolean z11) {
        return simplify(list, 1.0d, z11);
    }

    @NonNull
    public static List<Point> simplify(@NonNull List<Point> list, double d11, boolean z11) {
        if (list.size() <= 2) {
            return list;
        }
        double d12 = d11 * d11;
        if (!z11) {
            list = simplifyRadialDist(list, d12);
        }
        return simplifyDouglasPeucker(list, d12);
    }

    private static void encode(long j11, StringBuilder sb2) {
        long j12 = j11 << 1;
        if (j11 < 0) {
            j12 = ~j12;
        }
        while (j12 >= 32) {
            sb2.append(Character.toChars((int) ((32 | (31 & j12)) + 63)));
            j12 >>= 5;
        }
        sb2.append(Character.toChars((int) (j12 + 63)));
    }
}

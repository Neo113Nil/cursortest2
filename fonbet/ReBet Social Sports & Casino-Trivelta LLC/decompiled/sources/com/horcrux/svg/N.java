package com.horcrux.svg;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class N {

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f38705d;

    /* renamed from: e, reason: collision with root package name */
    public static int f38706e;

    /* renamed from: f, reason: collision with root package name */
    public static L f38707f;

    /* renamed from: g, reason: collision with root package name */
    public static L f38708g;

    /* renamed from: h, reason: collision with root package name */
    public static L f38709h;

    /* renamed from: i, reason: collision with root package name */
    public static L f38710i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f38711j;

    /* renamed from: a, reason: collision with root package name */
    public O f38712a;

    /* renamed from: b, reason: collision with root package name */
    public L f38713b;

    /* renamed from: c, reason: collision with root package name */
    public double f38714c;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$ElementType;
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$RNSVGMarkerType;

        static {
            int[] iArr = new int[EnumC3529g.values().length];
            $SwitchMap$com$horcrux$svg$ElementType = iArr;
            try {
                iArr[EnumC3529g.kCGPathElementAddCurveToPoint.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[EnumC3529g.kCGPathElementAddQuadCurveToPoint.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[EnumC3529g.kCGPathElementMoveToPoint.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[EnumC3529g.kCGPathElementAddLineToPoint.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$horcrux$svg$ElementType[EnumC3529g.kCGPathElementCloseSubpath.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[O.values().length];
            $SwitchMap$com$horcrux$svg$RNSVGMarkerType = iArr2;
            try {
                iArr2[O.kStartMarker.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RNSVGMarkerType[O.kMidMarker.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$horcrux$svg$RNSVGMarkerType[O.kEndMarker.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public N(O o10, L l10, double d10) {
        this.f38712a = o10;
        this.f38713b = l10;
        this.f38714c = d10;
    }

    public static double a(double d10, double d11) {
        if (Math.abs(d10 - d11) > 180.0d) {
            d10 += 360.0d;
        }
        return (d10 + d11) / 2.0d;
    }

    public static void b(S s10, L l10, L l11, L l12) {
        s10.f38733a = k(l11, l10);
        s10.f38734b = k(l12, l11);
        if (i(s10.f38733a)) {
            s10.f38733a = s10.f38734b;
        } else if (i(s10.f38734b)) {
            s10.f38734b = s10.f38733a;
        }
    }

    public static double c(O o10) {
        double j10 = j(f(f38709h));
        double j11 = j(f(f38710i));
        int i10 = a.$SwitchMap$com$horcrux$svg$RNSVGMarkerType[o10.ordinal()];
        if (i10 == 1) {
            return f38711j ? j11 + 180.0d : j11;
        }
        if (i10 == 2) {
            return a(j10, j11);
        }
        if (i10 != 3) {
            return 0.0d;
        }
        return j10;
    }

    public static S d(H h10) {
        S s10 = new S();
        L[] lArr = h10.points;
        int i10 = a.$SwitchMap$com$horcrux$svg$ElementType[h10.f38675a.ordinal()];
        if (i10 == 1) {
            s10.f38735c = lArr[2];
            s10.f38733a = k(lArr[0], f38707f);
            s10.f38734b = k(lArr[2], lArr[1]);
            if (i(s10.f38733a)) {
                b(s10, lArr[0], lArr[1], lArr[2]);
                return s10;
            }
            if (i(s10.f38734b)) {
                b(s10, f38707f, lArr[0], lArr[1]);
            }
        } else {
            if (i10 == 2) {
                L l10 = lArr[1];
                s10.f38735c = l10;
                b(s10, f38707f, lArr[0], l10);
                return s10;
            }
            if (i10 == 3 || i10 == 4) {
                L l11 = lArr[0];
                s10.f38735c = l11;
                s10.f38733a = k(l11, f38707f);
                s10.f38734b = k(s10.f38735c, f38707f);
                return s10;
            }
            if (i10 == 5) {
                L l12 = f38708g;
                s10.f38735c = l12;
                s10.f38733a = k(l12, f38707f);
                s10.f38734b = k(s10.f38735c, f38707f);
                return s10;
            }
        }
        return s10;
    }

    public static void e() {
        O o10 = O.kEndMarker;
        f38705d.add(new N(o10, f38707f, c(o10)));
    }

    public static double f(L l10) {
        return Math.atan2(l10.f38704b, l10.f38703a);
    }

    public static void g(H h10) {
        S d10 = d(h10);
        f38710i = d10.f38733a;
        int i10 = f38706e;
        if (i10 > 0) {
            O o10 = i10 == 1 ? O.kStartMarker : O.kMidMarker;
            f38705d.add(new N(o10, f38707f, c(o10)));
        }
        f38709h = d10.f38734b;
        f38707f = d10.f38735c;
        EnumC3529g enumC3529g = h10.f38675a;
        if (enumC3529g == EnumC3529g.kCGPathElementMoveToPoint) {
            f38708g = h10.points[0];
        } else if (enumC3529g == EnumC3529g.kCGPathElementCloseSubpath) {
            f38708g = new L(0.0d, 0.0d);
        }
        f38706e++;
    }

    public static ArrayList h(ArrayList arrayList) {
        f38705d = new ArrayList();
        f38706e = 0;
        f38707f = new L(0.0d, 0.0d);
        f38708g = new L(0.0d, 0.0d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((H) it.next());
        }
        e();
        return f38705d;
    }

    public static boolean i(L l10) {
        return l10.f38703a == 0.0d && l10.f38704b == 0.0d;
    }

    public static double j(double d10) {
        return d10 * 57.29577951308232d;
    }

    public static L k(L l10, L l11) {
        return new L(l11.f38703a - l10.f38703a, l11.f38704b - l10.f38704b);
    }
}

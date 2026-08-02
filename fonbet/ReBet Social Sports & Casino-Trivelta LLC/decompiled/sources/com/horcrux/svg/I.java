package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static float f38676a;

    /* renamed from: b, reason: collision with root package name */
    public static int f38677b;

    /* renamed from: c, reason: collision with root package name */
    public static int f38678c;

    /* renamed from: d, reason: collision with root package name */
    public static String f38679d;

    /* renamed from: e, reason: collision with root package name */
    public static Path f38680e;

    /* renamed from: f, reason: collision with root package name */
    public static ArrayList f38681f;

    /* renamed from: g, reason: collision with root package name */
    public static float f38682g;

    /* renamed from: h, reason: collision with root package name */
    public static float f38683h;

    /* renamed from: i, reason: collision with root package name */
    public static float f38684i;

    /* renamed from: j, reason: collision with root package name */
    public static float f38685j;

    /* renamed from: k, reason: collision with root package name */
    public static float f38686k;

    /* renamed from: l, reason: collision with root package name */
    public static float f38687l;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f38688m;

    public static void A(float f10, float f11, float f12, float f13) {
        float f14 = (f38682g * 2.0f) - f38684i;
        float f15 = (f38683h * 2.0f) - f38685j;
        f38684i = f10;
        f38685j = f11;
        e(f14, f15, f10, f11, f12, f13);
    }

    public static void B(float f10, float f11) {
        C(f10 + f38682g, f11 + f38683h);
    }

    public static void C(float f10, float f11) {
        u((f38682g * 2.0f) - f38684i, (f38683h * 2.0f) - f38685j, f10, f11);
    }

    public static void a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        b(f10, f11, f12, z10, z11, f13 + f38682g, f14 + f38683h);
    }

    public static void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19 = f38682g;
        float f20 = f38683h;
        float abs = Math.abs(f11 == 0.0f ? f10 == 0.0f ? f14 - f20 : f10 : f11);
        float abs2 = Math.abs(f10 == 0.0f ? f13 - f19 : f10);
        if (abs2 == 0.0f || abs == 0.0f || (f13 == f19 && f14 == f20)) {
            l(f13, f14);
            return;
        }
        float radians = (float) Math.toRadians(f12);
        double d10 = radians;
        float cos = (float) Math.cos(d10);
        float sin = (float) Math.sin(d10);
        float f21 = f13 - f19;
        float f22 = f14 - f20;
        float f23 = ((cos * f21) / 2.0f) + ((sin * f22) / 2.0f);
        float f24 = -sin;
        float f25 = ((f24 * f21) / 2.0f) + ((cos * f22) / 2.0f);
        float f26 = abs2 * abs2;
        float f27 = f26 * abs * abs;
        float f28 = (f27 - ((f26 * f25) * f25)) - (((abs * abs) * f23) * f23);
        if (f28 < 0.0f) {
            float f29 = 1.0f - (f28 / f27);
            f15 = 0.0f;
            float sqrt = (float) Math.sqrt(f29);
            abs2 *= sqrt;
            f18 = abs * sqrt;
            f17 = f21 / 2.0f;
            f16 = f22 / 2.0f;
        } else {
            f15 = 0.0f;
            float sqrt2 = (float) Math.sqrt(f28 / (r16 + r18));
            if (z10 == z11) {
                sqrt2 = -sqrt2;
            }
            float f30 = (((-sqrt2) * f25) * abs2) / abs;
            float f31 = ((sqrt2 * f23) * abs) / abs2;
            f16 = (f22 / 2.0f) + (f30 * sin) + (f31 * cos);
            f17 = ((cos * f30) - (sin * f31)) + (f21 / 2.0f);
            f18 = abs;
        }
        float f32 = cos / abs2;
        float f33 = sin / abs2;
        float f34 = f24 / f18;
        float f35 = cos / f18;
        float f36 = -f17;
        float f37 = -f16;
        float f38 = f17;
        float atan2 = (float) Math.atan2((f34 * f36) + (f35 * f37), (f36 * f32) + (f33 * f37));
        float f39 = f21 - f38;
        float f40 = f22 - f16;
        float atan22 = (float) Math.atan2((f34 * f39) + (f35 * f40), (f32 * f39) + (f33 * f40));
        float f41 = f38 + f19;
        float f42 = f16 + f20;
        float f43 = f21 + f19;
        float f44 = f22 + f20;
        w();
        f38684i = f43;
        f38682g = f43;
        f38685j = f44;
        f38683h = f44;
        if (abs2 != f18 || radians != f15) {
            c(f41, f42, abs2, f18, atan2, atan22, z11, radians);
            return;
        }
        float degrees = (float) Math.toDegrees(atan2);
        float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
        if (!z10 ? abs3 > 180.0f : abs3 < 180.0f) {
            abs3 = 360.0f - abs3;
        }
        if (!z11) {
            abs3 = -abs3;
        }
        float f45 = f38676a;
        f38680e.arcTo(new RectF((f41 - abs2) * f45, (f42 - abs2) * f45, (f41 + abs2) * f45, (f42 + abs2) * f45), degrees, abs3);
        f38681f.add(new H(EnumC3529g.kCGPathElementAddCurveToPoint, new L[]{new L(f43, f44)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[LOOP:0: B:7:0x0065->B:8:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, float f16) {
        double d10;
        int ceil;
        int i10;
        float f17 = f14;
        double d11 = f16;
        float cos = (float) Math.cos(d11);
        float sin = (float) Math.sin(d11);
        float f18 = cos * f12;
        float f19 = (-sin) * f13;
        float f20 = sin * f12;
        float f21 = cos * f13;
        float f22 = f15 - f17;
        if (f22 >= 0.0f || !z10) {
            if (f22 > 0.0f && !z10) {
                d10 = f22 - 6.283185307179586d;
            }
            ceil = (int) Math.ceil(Math.abs(v(f22 / 1.5707963267948966d)));
            float f23 = f22 / ceil;
            float tan = (float) (Math.tan(f23 / 4.0f) * 1.3333333333333333d);
            double d12 = f17;
            float cos2 = (float) Math.cos(d12);
            float sin2 = (float) Math.sin(d12);
            i10 = 0;
            while (i10 < ceil) {
                float f24 = cos2 - (tan * sin2);
                float f25 = sin2 + (cos2 * tan);
                float f26 = f17 + f23;
                double d13 = f26;
                float cos3 = (float) Math.cos(d13);
                float sin3 = (float) Math.sin(d13);
                float f27 = (tan * sin3) + cos3;
                float f28 = sin3 - (tan * cos3);
                float f29 = f10 + (f18 * f24) + (f19 * f25);
                float f30 = f11 + (f24 * f20) + (f25 * f21);
                float f31 = f10 + (f18 * f27) + (f19 * f28);
                float f32 = f11 + (f27 * f20) + (f28 * f21);
                float f33 = f10 + (f18 * cos3) + (f19 * sin3);
                float f34 = f11 + (f20 * cos3) + (f21 * sin3);
                Path path = f38680e;
                float f35 = f38676a;
                path.cubicTo(f29 * f35, f30 * f35, f31 * f35, f32 * f35, f33 * f35, f35 * f34);
                float f36 = f23;
                f38681f.add(new H(EnumC3529g.kCGPathElementAddCurveToPoint, new L[]{new L(f29, f30), new L(f31, f32), new L(f33, f34)}));
                i10++;
                f17 = f26;
                f21 = f21;
                f23 = f36;
                f20 = f20;
                sin2 = sin3;
                f18 = f18;
                f19 = f19;
                ceil = ceil;
                cos2 = cos3;
            }
        }
        d10 = f22 + 6.283185307179586d;
        f22 = (float) d10;
        ceil = (int) Math.ceil(Math.abs(v(f22 / 1.5707963267948966d)));
        float f232 = f22 / ceil;
        float tan2 = (float) (Math.tan(f232 / 4.0f) * 1.3333333333333333d);
        double d122 = f17;
        float cos22 = (float) Math.cos(d122);
        float sin22 = (float) Math.sin(d122);
        i10 = 0;
        while (i10 < ceil) {
        }
    }

    public static void d() {
        if (f38688m) {
            f38682g = f38686k;
            f38683h = f38687l;
            f38688m = false;
            f38680e.close();
            f38681f.add(new H(EnumC3529g.kCGPathElementCloseSubpath, new L[]{new L(f38682g, f38683h)}));
        }
    }

    public static void e(float f10, float f11, float f12, float f13, float f14, float f15) {
        w();
        f38682g = f14;
        f38683h = f15;
        Path path = f38680e;
        float f16 = f38676a;
        path.cubicTo(f10 * f16, f11 * f16, f12 * f16, f13 * f16, f14 * f16, f16 * f15);
        f38681f.add(new H(EnumC3529g.kCGPathElementAddCurveToPoint, new L[]{new L(f10, f11), new L(f12, f13), new L(f14, f15)}));
    }

    public static void f(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16 = f38682g;
        float f17 = f38683h;
        g(f10 + f16, f11 + f17, f12 + f16, f13 + f17, f14 + f16, f15 + f17);
    }

    public static void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        f38684i = f12;
        f38685j = f13;
        e(f10, f11, f12, f13, f14, f15);
    }

    public static boolean h(char c10) {
        return Character.isUpperCase(c10);
    }

    public static boolean i(char c10) {
        switch (c10) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    public static boolean j(char c10) {
        return (c10 >= '0' && c10 <= '9') || c10 == '.' || c10 == '-' || c10 == '+';
    }

    public static void k(float f10, float f11) {
        l(f10 + f38682g, f11 + f38683h);
    }

    public static void l(float f10, float f11) {
        w();
        f38682g = f10;
        f38684i = f10;
        f38683h = f11;
        f38685j = f11;
        Path path = f38680e;
        float f12 = f38676a;
        path.lineTo(f10 * f12, f12 * f11);
        f38681f.add(new H(EnumC3529g.kCGPathElementAddLineToPoint, new L[]{new L(f10, f11)}));
    }

    public static void m(float f10, float f11) {
        n(f10 + f38682g, f11 + f38683h);
    }

    public static void n(float f10, float f11) {
        f38682g = f10;
        f38684i = f10;
        f38686k = f10;
        f38683h = f11;
        f38685j = f11;
        f38687l = f11;
        Path path = f38680e;
        float f12 = f38676a;
        path.moveTo(f10 * f12, f12 * f11);
        f38681f.add(new H(EnumC3529g.kCGPathElementMoveToPoint, new L[]{new L(f10, f11)}));
    }

    public static Path o(String str) {
        f38681f = new ArrayList();
        Path path = new Path();
        f38680e = path;
        if (str == null) {
            return path;
        }
        f38678c = str.length();
        f38679d = str;
        f38677b = 0;
        f38682g = 0.0f;
        f38683h = 0.0f;
        f38684i = 0.0f;
        f38685j = 0.0f;
        f38686k = 0.0f;
        f38687l = 0.0f;
        f38688m = false;
        char c10 = ' ';
        while (f38677b < f38678c) {
            y();
            int i10 = f38677b;
            if (i10 >= f38678c) {
                return f38680e;
            }
            boolean z10 = true;
            boolean z11 = c10 != ' ';
            char charAt = f38679d.charAt(i10);
            if (!z11 && charAt != 'M' && charAt != 'm') {
                throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f38677b), f38679d));
            }
            if (i(charAt)) {
                f38677b++;
                z10 = false;
                c10 = charAt;
            } else {
                if (!j(charAt) || !z11) {
                    throw new IllegalArgumentException(String.format("Unexpected character '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f38677b), f38679d));
                }
                if (c10 == 'Z' || c10 == 'z') {
                    throw new IllegalArgumentException(String.format("Unexpected number after 'z' (s=%s)", f38679d));
                }
                if (c10 == 'M' || c10 == 'm') {
                    c10 = h(c10) ? Matrix.MATRIX_TYPE_RANDOM_LT : 'l';
                } else {
                    z10 = false;
                }
            }
            boolean h10 = h(c10);
            switch (c10) {
                case 'A':
                    b(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'C':
                    g(q(), q(), q(), q(), q(), q());
                    break;
                case 'H':
                    l(q(), f38683h);
                    break;
                case 'L':
                    l(q(), q());
                    break;
                case 'M':
                    n(q(), q());
                    break;
                case 'Q':
                    u(q(), q(), q(), q());
                    break;
                case 'S':
                    A(q(), q(), q(), q());
                    break;
                case 'T':
                    C(q(), q());
                    break;
                case 'V':
                    l(f38682g, q());
                    break;
                case 'Z':
                case 'z':
                    d();
                    break;
                case 'a':
                    a(q(), q(), q(), p(), p(), q(), q());
                    break;
                case 'c':
                    f(q(), q(), q(), q(), q(), q());
                    break;
                case 'h':
                    k(q(), 0.0f);
                    break;
                case 'l':
                    k(q(), q());
                    break;
                case 'm':
                    m(q(), q());
                    break;
                case 'q':
                    t(q(), q(), q(), q());
                    break;
                case 's':
                    z(q(), q(), q(), q());
                    break;
                case 't':
                    B(q(), q());
                    break;
                case 'v':
                    k(0.0f, q());
                    break;
                default:
                    throw new IllegalArgumentException(String.format("Unexpected comand '%c' (s=%s)", Character.valueOf(c10), f38679d));
            }
            if (z10) {
                c10 = h10 ? 'M' : 'm';
            }
        }
        return f38680e;
    }

    public static boolean p() {
        y();
        char charAt = f38679d.charAt(f38677b);
        if (charAt != '0' && charAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f38677b), f38679d));
        }
        int i10 = f38677b + 1;
        f38677b = i10;
        if (i10 < f38678c && f38679d.charAt(i10) == ',') {
            f38677b++;
        }
        y();
        return charAt == '1';
    }

    public static float q() {
        if (f38677b == f38678c) {
            throw new Error(String.format("Unexpected end (s=%s)", f38679d));
        }
        float s10 = s();
        y();
        r();
        return s10;
    }

    public static void r() {
        int i10 = f38677b;
        if (i10 >= f38678c || f38679d.charAt(i10) != ',') {
            return;
        }
        f38677b++;
    }

    public static float s() {
        char charAt;
        y();
        int i10 = f38677b;
        if (i10 == f38678c) {
            throw new Error(String.format("Unexpected end (s=%s)", f38679d));
        }
        char charAt2 = f38679d.charAt(i10);
        if (charAt2 == '-' || charAt2 == '+') {
            int i11 = f38677b + 1;
            f38677b = i11;
            charAt2 = f38679d.charAt(i11);
        }
        if (charAt2 >= '0' && charAt2 <= '9') {
            x();
            int i12 = f38677b;
            if (i12 < f38678c) {
                charAt2 = f38679d.charAt(i12);
            }
        } else if (charAt2 != '.') {
            throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f38677b), f38679d));
        }
        if (charAt2 == '.') {
            f38677b++;
            x();
            int i13 = f38677b;
            if (i13 < f38678c) {
                charAt2 = f38679d.charAt(i13);
            }
        }
        if (charAt2 == 'e' || charAt2 == 'E') {
            int i14 = f38677b;
            if (i14 + 1 < f38678c && (charAt = f38679d.charAt(i14 + 1)) != 'm' && charAt != 'x') {
                int i15 = f38677b + 1;
                f38677b = i15;
                char charAt3 = f38679d.charAt(i15);
                if (charAt3 == '+' || charAt3 == '-') {
                    f38677b++;
                    x();
                } else {
                    if (charAt3 < '0' || charAt3 > '9') {
                        throw new IllegalArgumentException(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f38677b), f38679d));
                    }
                    x();
                }
            }
        }
        String substring = f38679d.substring(i10, f38677b);
        float parseFloat = Float.parseFloat(substring);
        if (Float.isInfinite(parseFloat) || Float.isNaN(parseFloat)) {
            throw new IllegalArgumentException(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i10), Integer.valueOf(f38677b), f38679d));
        }
        return parseFloat;
    }

    public static void t(float f10, float f11, float f12, float f13) {
        float f14 = f38682g;
        float f15 = f38683h;
        u(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }

    public static void u(float f10, float f11, float f12, float f13) {
        f38684i = f10;
        f38685j = f11;
        float f14 = f10 * 2.0f;
        float f15 = f11 * 2.0f;
        e((f38682g + f14) / 3.0f, (f38683h + f15) / 3.0f, (f12 + f14) / 3.0f, (f13 + f15) / 3.0f, f12, f13);
    }

    public static double v(double d10) {
        return Math.round(d10 * r0) / Math.pow(10.0d, 4.0d);
    }

    public static void w() {
        if (f38688m) {
            return;
        }
        f38686k = f38682g;
        f38687l = f38683h;
        f38688m = true;
    }

    public static void x() {
        while (true) {
            int i10 = f38677b;
            if (i10 >= f38678c || !Character.isDigit(f38679d.charAt(i10))) {
                return;
            } else {
                f38677b++;
            }
        }
    }

    public static void y() {
        while (true) {
            int i10 = f38677b;
            if (i10 >= f38678c || !Character.isWhitespace(f38679d.charAt(i10))) {
                return;
            } else {
                f38677b++;
            }
        }
    }

    public static void z(float f10, float f11, float f12, float f13) {
        float f14 = f38682g;
        float f15 = f38683h;
        A(f10 + f14, f11 + f15, f12 + f14, f13 + f15);
    }
}

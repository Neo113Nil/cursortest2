package g0;

import android.graphics.Path;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public char f9681a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f9682b;

    public f(char c2, float[] fArr) {
        this.f9681a = c2;
        this.f9682b = fArr;
    }

    public static void a(Path path, float f6, float f10, float f11, float f12, float f13, float f14, float f15, boolean z5, boolean z7) {
        double d10;
        double d11;
        double radians = Math.toRadians(f15);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d12 = f6;
        double d13 = f10;
        double d14 = f13;
        double d15 = ((d13 * sin) + (d12 * cos)) / d14;
        double d16 = f14;
        double d17 = ((d13 * cos) + ((-f6) * sin)) / d16;
        double d18 = f12;
        double d19 = ((d18 * sin) + (f11 * cos)) / d14;
        double d20 = ((d18 * cos) + ((-f11) * sin)) / d16;
        double d21 = d15 - d19;
        double d22 = d17 - d20;
        double d23 = (d15 + d19) / 2.0d;
        double d24 = (d17 + d20) / 2.0d;
        double d25 = (d22 * d22) + (d21 * d21);
        if (d25 == 0.0d) {
            w0.m("PathParser", " Points are coincident");
            return;
        }
        double d26 = (1.0d / d25) - 0.25d;
        if (d26 < 0.0d) {
            w0.m("PathParser", "Points are too far apart " + d25);
            float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
            a(path, f6, f10, f11, f12, f13 * sqrt, sqrt * f14, f15, z5, z7);
            return;
        }
        double sqrt2 = Math.sqrt(d26);
        double d27 = sqrt2 * d21;
        double d28 = sqrt2 * d22;
        if (z5 == z7) {
            d10 = d23 - d28;
            d11 = d24 + d27;
        } else {
            d10 = d23 + d28;
            d11 = d24 - d27;
        }
        double atan2 = Math.atan2(d17 - d11, d15 - d10);
        double atan22 = Math.atan2(d20 - d11, d19 - d10) - atan2;
        if (z7 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d29 = d10 * d14;
        double d30 = d11 * d16;
        double d31 = (d29 * cos) - (d30 * sin);
        double d32 = (d30 * cos) + (d29 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d33 = -d14;
        double d34 = d33 * cos2;
        double d35 = d16 * sin2;
        double d36 = (d34 * sin3) - (d35 * cos3);
        double d37 = d33 * sin2;
        double d38 = d16 * cos2;
        double d39 = atan22 / ceil;
        double d40 = (cos3 * d38) + (sin3 * d37);
        double d41 = d12;
        double d42 = d13;
        int i5 = 0;
        double d43 = atan2;
        while (i5 < ceil) {
            double d44 = d43 + d39;
            double sin4 = Math.sin(d44);
            double cos4 = Math.cos(d44);
            int i10 = ceil;
            double d45 = (((d14 * cos2) * cos4) + d31) - (d35 * sin4);
            double d46 = (d38 * sin4) + (d14 * sin2 * cos4) + d32;
            double d47 = (d34 * sin4) - (d35 * cos4);
            double d48 = (cos4 * d38) + (sin4 * d37);
            double d49 = d44 - d43;
            double tan = Math.tan(d49 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d49)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d36 * sqrt3) + d41), (float) ((d40 * sqrt3) + d42), (float) (d45 - (sqrt3 * d47)), (float) (d46 - (sqrt3 * d48)), (float) d45, (float) d46);
            i5++;
            d42 = d46;
            cos2 = cos2;
            d37 = d37;
            d43 = d44;
            d40 = d48;
            d41 = d45;
            ceil = i10;
            d36 = d47;
            d39 = d39;
        }
    }

    public f(f fVar) {
        this.f9681a = fVar.f9681a;
        float[] fArr = fVar.f9682b;
        this.f9682b = y4.a.l(fArr.length, fArr);
    }
}

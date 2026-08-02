package O;

import O.b;
import O.h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class d {
    public static final double a(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(q(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final double b(double d10, double d11, double d12, double d13, double d14, double d15) {
        return Math.copySign(s(d10 < 0.0d ? -d10 : d10, d11, d12, d13, d14, d15), d10);
    }

    public static final c c(c cVar, y whitePoint, a adaptation) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation, "adaptation");
        if (b.e(cVar.e(), b.f8149a.b())) {
            w wVar = (w) cVar;
            if (!f(wVar.J(), whitePoint)) {
                return new w(wVar, k(e(adaptation.b(), wVar.J().c(), whitePoint.c()), wVar.I()), whitePoint);
            }
        }
        return cVar;
    }

    public static /* synthetic */ c d(c cVar, y yVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            aVar = a.f8145a.a();
        }
        return c(cVar, yVar, aVar);
    }

    public static final float[] e(float[] matrix, float[] srcWhitePoint, float[] dstWhitePoint) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(srcWhitePoint, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(dstWhitePoint, "dstWhitePoint");
        float[] m10 = m(matrix, srcWhitePoint);
        float[] m11 = m(matrix, dstWhitePoint);
        return k(j(matrix), l(new float[]{m11[0] / m10[0], m11[1] / m10[1], m11[2] / m10[2]}, matrix));
    }

    public static final boolean f(y a10, y b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        return Math.abs(a10.a() - b10.a()) < 0.001f && Math.abs(a10.b() - b10.b()) < 0.001f;
    }

    public static final boolean g(float[] a10, float[] b10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        if (a10 == b10) {
            return true;
        }
        int length = a10.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (Float.compare(a10[i10], b10[i10]) != 0 && Math.abs(a10[i10] - b10[i10]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final h h(c connect, c destination, int i10) {
        Intrinsics.checkNotNullParameter(connect, "$this$connect");
        Intrinsics.checkNotNullParameter(destination, "destination");
        g gVar = g.f8158a;
        if (connect == gVar.h()) {
            if (destination == gVar.h()) {
                return h.f8179f.d();
            }
            if (destination == gVar.g() && m.e(i10, m.f8204a.b())) {
                return h.f8179f.e();
            }
        } else if (connect == gVar.g() && destination == gVar.h() && m.e(i10, m.f8204a.b())) {
            return h.f8179f.c();
        }
        if (connect == destination) {
            return h.f8179f.f(connect);
        }
        long e10 = connect.e();
        b.a aVar = b.f8149a;
        DefaultConstructorMarker defaultConstructorMarker = null;
        return (b.e(e10, aVar.b()) && b.e(destination.e(), aVar.b())) ? new h.b((w) connect, (w) destination, i10, defaultConstructorMarker) : new h(connect, destination, i10, defaultConstructorMarker);
    }

    public static /* synthetic */ h i(c cVar, c cVar2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar2 = g.f8158a.h();
        }
        if ((i11 & 2) != 0) {
            i10 = m.f8204a.b();
        }
        return h(cVar, cVar2, i10);
    }

    public static final float[] j(float[] m10) {
        Intrinsics.checkNotNullParameter(m10, "m");
        float f10 = m10[0];
        float f11 = m10[3];
        float f12 = m10[6];
        float f13 = m10[1];
        float f14 = m10[4];
        float f15 = m10[7];
        float f16 = m10[2];
        float f17 = m10[5];
        float f18 = m10[8];
        float f19 = (f14 * f18) - (f15 * f17);
        float f20 = (f15 * f16) - (f13 * f18);
        float f21 = (f13 * f17) - (f14 * f16);
        float f22 = (f10 * f19) + (f11 * f20) + (f12 * f21);
        float[] fArr = new float[m10.length];
        fArr[0] = f19 / f22;
        fArr[1] = f20 / f22;
        fArr[2] = f21 / f22;
        fArr[3] = ((f12 * f17) - (f11 * f18)) / f22;
        fArr[4] = ((f18 * f10) - (f12 * f16)) / f22;
        fArr[5] = ((f16 * f11) - (f17 * f10)) / f22;
        fArr[6] = ((f11 * f15) - (f12 * f14)) / f22;
        fArr[7] = ((f12 * f13) - (f15 * f10)) / f22;
        fArr[8] = ((f10 * f14) - (f11 * f13)) / f22;
        return fArr;
    }

    public static final float[] k(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0];
        float f12 = lhs[3];
        float f13 = rhs[1];
        float f14 = lhs[6];
        float f15 = rhs[2];
        float f16 = (f10 * f11) + (f12 * f13) + (f14 * f15);
        float f17 = lhs[1];
        float f18 = lhs[4];
        float f19 = lhs[7];
        float f20 = (f17 * f11) + (f18 * f13) + (f19 * f15);
        float f21 = lhs[2];
        float f22 = lhs[5];
        float f23 = lhs[8];
        float f24 = (f11 * f21) + (f13 * f22) + (f15 * f23);
        float f25 = rhs[3];
        float f26 = rhs[4];
        float f27 = rhs[5];
        float f28 = (f10 * f25) + (f12 * f26) + (f14 * f27);
        float f29 = (f17 * f25) + (f18 * f26) + (f19 * f27);
        float f30 = (f25 * f21) + (f26 * f22) + (f27 * f23);
        float f31 = rhs[6];
        float f32 = rhs[7];
        float f33 = rhs[8];
        return new float[]{f16, f20, f24, f28, f29, f30, (f10 * f31) + (f12 * f32) + (f14 * f33), (f17 * f31) + (f18 * f32) + (f19 * f33), (f21 * f31) + (f22 * f32) + (f23 * f33)};
    }

    public static final float[] l(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = lhs[0];
        float f11 = rhs[0] * f10;
        float f12 = lhs[1];
        float f13 = rhs[1] * f12;
        float f14 = lhs[2];
        return new float[]{f11, f13, rhs[2] * f14, rhs[3] * f10, rhs[4] * f12, rhs[5] * f14, f10 * rhs[6], f12 * rhs[7], f14 * rhs[8]};
    }

    public static final float[] m(float[] lhs, float[] rhs) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        Intrinsics.checkNotNullParameter(rhs, "rhs");
        float f10 = rhs[0];
        float f11 = rhs[1];
        float f12 = rhs[2];
        rhs[0] = (lhs[0] * f10) + (lhs[3] * f11) + (lhs[6] * f12);
        rhs[1] = (lhs[1] * f10) + (lhs[4] * f11) + (lhs[7] * f12);
        rhs[2] = (lhs[2] * f10) + (lhs[5] * f11) + (lhs[8] * f12);
        return rhs;
    }

    public static final float n(float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[0] * f10) + (lhs[3] * f11) + (lhs[6] * f12);
    }

    public static final float o(float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[1] * f10) + (lhs[4] * f11) + (lhs[7] * f12);
    }

    public static final float p(float[] lhs, float f10, float f11, float f12) {
        Intrinsics.checkNotNullParameter(lhs, "lhs");
        return (lhs[2] * f10) + (lhs[5] * f11) + (lhs[8] * f12);
    }

    public static final double q(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 * d13 ? (Math.pow(d10, 1.0d / d15) - d12) / d11 : d10 / d13;
    }

    public static final double r(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 * d13 ? (Math.pow(d10 - d15, 1.0d / d17) - d12) / d11 : (d10 - d16) / d13;
    }

    public static final double s(double d10, double d11, double d12, double d13, double d14, double d15) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d15) : d13 * d10;
    }

    public static final double t(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        return d10 >= d14 ? Math.pow((d11 * d10) + d12, d17) + d15 : (d13 * d10) + d16;
    }
}

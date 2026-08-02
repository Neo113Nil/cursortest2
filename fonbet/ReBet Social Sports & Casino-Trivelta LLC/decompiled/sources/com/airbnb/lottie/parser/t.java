package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.AbstractC2935e;
import com.airbnb.lottie.C2940j;
import com.airbnb.lottie.parser.moshi.c;
import i3.C4527h;
import java.lang.ref.WeakReference;
import lb.C5444x;
import z0.AbstractC6908a;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: b, reason: collision with root package name */
    public static z.s f29078b;

    /* renamed from: a, reason: collision with root package name */
    public static final Interpolator f29077a = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static c.a f29079c = c.a.a("t", "s", com.bumptech.glide.gifdecoder.e.f29601m, "o", com.google.android.material.shape.i.f35755A, C4527h.f48087o, "to", "ti");

    /* renamed from: d, reason: collision with root package name */
    public static c.a f29080d = c.a.a(C5444x.f55808b, "y");

    public static WeakReference a(int i10) {
        WeakReference weakReference;
        synchronized (t.class) {
            weakReference = (WeakReference) g().e(i10);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator a10;
        pointF.x = com.airbnb.lottie.utils.l.b(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.l.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.l.b(pointF2.x, -1.0f, 1.0f);
        float b10 = com.airbnb.lottie.utils.l.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b10;
        int i10 = com.airbnb.lottie.utils.z.i(pointF.x, pointF.y, pointF2.x, b10);
        WeakReference a11 = AbstractC2935e.e() ? null : a(i10);
        Interpolator interpolator = a11 != null ? (Interpolator) a11.get() : null;
        if (a11 != null && interpolator != null) {
            return interpolator;
        }
        try {
            a10 = AbstractC6908a.a(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e10) {
            a10 = "The Path cannot loop back on itself.".equals(e10.getMessage()) ? AbstractC6908a.a(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        if (!AbstractC2935e.e()) {
            try {
                h(i10, new WeakReference(a10));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return a10;
    }

    public static G3.a c(com.airbnb.lottie.parser.moshi.c cVar, C2940j c2940j, float f10, N n10, boolean z10, boolean z11) {
        return (z10 && z11) ? e(c2940j, cVar, f10, n10) : z10 ? d(c2940j, cVar, f10, n10) : f(cVar, f10, n10);
    }

    public static G3.a d(C2940j c2940j, com.airbnb.lottie.parser.moshi.c cVar, float f10, N n10) {
        Interpolator b10;
        Object obj;
        cVar.m();
        PointF pointF = null;
        Object obj2 = null;
        Object obj3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f11 = 0.0f;
        boolean z10 = false;
        PointF pointF4 = null;
        while (cVar.hasNext()) {
            switch (cVar.U(f29079c)) {
                case 0:
                    f11 = (float) cVar.nextDouble();
                    break;
                case 1:
                    obj3 = n10.a(cVar, f10);
                    break;
                case 2:
                    obj2 = n10.a(cVar, f10);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.nextInt() != 1) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f10);
                    break;
                default:
                    cVar.C();
                    break;
            }
        }
        cVar.t();
        if (z10) {
            b10 = f29077a;
            obj = obj3;
        } else {
            b10 = (pointF == null || pointF4 == null) ? f29077a : b(pointF, pointF4);
            obj = obj2;
        }
        G3.a aVar = new G3.a(c2940j, obj3, obj, b10, f11, null);
        aVar.f3868o = pointF2;
        aVar.f3869p = pointF3;
        return aVar;
    }

    public static G3.a e(C2940j c2940j, com.airbnb.lottie.parser.moshi.c cVar, float f10, N n10) {
        Interpolator interpolator;
        Interpolator b10;
        Interpolator b11;
        Object obj;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        G3.a aVar;
        PointF pointF3;
        boolean z10;
        float f11;
        cVar.m();
        boolean z11 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        Object obj2 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f12 = 0.0f;
        Object obj3 = null;
        while (cVar.hasNext()) {
            switch (cVar.U(f29079c)) {
                case 0:
                    f12 = (float) cVar.nextDouble();
                    break;
                case 1:
                    obj2 = n10.a(cVar, f10);
                    break;
                case 2:
                    obj3 = n10.a(cVar, f10);
                    break;
                case 3:
                    boolean z12 = z11;
                    if (cVar.B() == c.b.BEGIN_OBJECT) {
                        cVar.m();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.hasNext()) {
                            int U10 = cVar.U(f29080d);
                            if (U10 == 0) {
                                pointF3 = pointF8;
                                c.b B10 = cVar.B();
                                c.b bVar = c.b.NUMBER;
                                if (B10 == bVar) {
                                    f15 = (float) cVar.nextDouble();
                                    f13 = f15;
                                } else {
                                    cVar.p();
                                    f13 = (float) cVar.nextDouble();
                                    f15 = cVar.B() == bVar ? (float) cVar.nextDouble() : f13;
                                    cVar.n();
                                }
                            } else if (U10 != 1) {
                                cVar.C();
                            } else {
                                c.b B11 = cVar.B();
                                c.b bVar2 = c.b.NUMBER;
                                if (B11 == bVar2) {
                                    pointF3 = pointF8;
                                    f16 = (float) cVar.nextDouble();
                                    f14 = f16;
                                } else {
                                    pointF3 = pointF8;
                                    cVar.p();
                                    f14 = (float) cVar.nextDouble();
                                    f16 = cVar.B() == bVar2 ? (float) cVar.nextDouble() : f14;
                                    cVar.n();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f13, f14);
                        pointF7 = new PointF(f15, f16);
                        cVar.t();
                    } else {
                        pointF4 = s.e(cVar, f10);
                    }
                    z11 = z12;
                    break;
                case 4:
                    if (cVar.B() != c.b.BEGIN_OBJECT) {
                        pointF5 = s.e(cVar, f10);
                        break;
                    } else {
                        cVar.m();
                        float f17 = 0.0f;
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f20 = 0.0f;
                        while (cVar.hasNext()) {
                            int U11 = cVar.U(f29080d);
                            if (U11 != 0) {
                                z10 = z11;
                                if (U11 != 1) {
                                    cVar.C();
                                } else {
                                    c.b B12 = cVar.B();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (B12 == bVar3) {
                                        f20 = (float) cVar.nextDouble();
                                        f18 = f20;
                                    } else {
                                        cVar.p();
                                        PointF pointF12 = pointF10;
                                        float nextDouble = (float) cVar.nextDouble();
                                        f20 = cVar.B() == bVar3 ? (float) cVar.nextDouble() : nextDouble;
                                        cVar.n();
                                        pointF10 = pointF12;
                                        f18 = nextDouble;
                                    }
                                }
                            } else {
                                z10 = z11;
                                PointF pointF13 = pointF10;
                                c.b B13 = cVar.B();
                                c.b bVar4 = c.b.NUMBER;
                                if (B13 == bVar4) {
                                    pointF10 = pointF13;
                                    f19 = (float) cVar.nextDouble();
                                    f17 = f19;
                                } else {
                                    pointF10 = pointF13;
                                    cVar.p();
                                    float nextDouble2 = (float) cVar.nextDouble();
                                    if (cVar.B() == bVar4) {
                                        f11 = nextDouble2;
                                        f19 = (float) cVar.nextDouble();
                                    } else {
                                        f11 = nextDouble2;
                                        f19 = f11;
                                    }
                                    cVar.n();
                                    f17 = f11;
                                }
                            }
                            z11 = z10;
                        }
                        PointF pointF14 = new PointF(f17, f18);
                        PointF pointF15 = new PointF(f19, f20);
                        cVar.t();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    }
                case 5:
                    if (cVar.nextInt() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 6:
                    pointF10 = s.e(cVar, f10);
                    break;
                case 7:
                    pointF11 = s.e(cVar, f10);
                    break;
                default:
                    cVar.C();
                    break;
            }
        }
        boolean z13 = z11;
        PointF pointF16 = pointF8;
        cVar.t();
        if (z13) {
            interpolator2 = f29077a;
            obj = obj2;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = b(pointF4, pointF5);
            } else {
                if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                    b10 = b(pointF6, pointF16);
                    b11 = b(pointF7, pointF9);
                    obj = obj3;
                    interpolator2 = null;
                    if (b10 != null || b11 == null) {
                        pointF = pointF10;
                        pointF2 = pointF11;
                        aVar = new G3.a(c2940j, obj2, obj, interpolator2, f12, null);
                    } else {
                        pointF2 = pointF11;
                        pointF = pointF10;
                        aVar = new G3.a(c2940j, obj2, obj, b10, b11, f12, null);
                    }
                    aVar.f3868o = pointF;
                    aVar.f3869p = pointF2;
                    return aVar;
                }
                interpolator = f29077a;
            }
            interpolator2 = interpolator;
            obj = obj3;
        }
        b10 = null;
        b11 = null;
        if (b10 != null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        aVar = new G3.a(c2940j, obj2, obj, interpolator2, f12, null);
        aVar.f3868o = pointF;
        aVar.f3869p = pointF2;
        return aVar;
    }

    public static G3.a f(com.airbnb.lottie.parser.moshi.c cVar, float f10, N n10) {
        return new G3.a(n10.a(cVar, f10));
    }

    public static z.s g() {
        if (f29078b == null) {
            f29078b = new z.s();
        }
        return f29078b;
    }

    public static void h(int i10, WeakReference weakReference) {
        synchronized (t.class) {
            f29078b.i(i10, weakReference);
        }
    }
}

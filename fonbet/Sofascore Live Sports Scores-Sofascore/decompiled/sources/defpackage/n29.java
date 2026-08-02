package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n29 {
    public static final pla y;
    public final p29 a;
    public Outline f;
    public float j;
    public pea k;
    public b20 l;
    public b20 m;
    public boolean n;
    public wj2 o;
    public gtj p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public kx4 b = xw3.d;
    public ema c = ema.a;
    public Function1 d = s84.v;
    public final oo e = new oo(this, 20);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final n72 r = new n72();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        y = lowerCase.equals("robolectric") ? wxf.g : Build.VERSION.SDK_INT >= 28 ? tla.a : p4h.f;
    }

    public n29(p29 p29Var) {
        this.a = p29Var;
        p29Var.s(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            p29 p29Var = this.a;
            if (z || p29Var.N() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                b20 b20Var = this.l;
                if (b20Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = b20Var instanceof b20;
                    if (!z2) {
                        a70.m("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = b20Var.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            y9.p(outline, b20Var);
                        } else {
                            if (!z2) {
                                a70.m("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = b20Var;
                    if (outline != null) {
                        outline.setAlpha(p29Var.a());
                        outline2 = outline;
                    }
                    p29Var.D(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        p29Var.s(false);
                        p29Var.e();
                    } else {
                        p29Var.s(this.w);
                    }
                } else {
                    p29Var.s(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long I = d7a.I(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        I = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (I >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (I & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(p29Var.a());
                    p29Var.D(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                p29Var.s(false);
                p29Var.D(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            n72 n72Var = this.r;
            n29 n29Var = (n29) n72Var.b;
            if (n29Var != null) {
                n29Var.q--;
                n29Var.b();
                n72Var.b = null;
            }
            y0d y0dVar = (y0d) n72Var.d;
            if (y0dVar != null) {
                Object[] objArr = y0dVar.b;
                long[] jArr = y0dVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((n29) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                y0dVar.b();
            }
            this.a.e();
        }
    }

    public final void c(uj2 uj2Var, n29 n29Var) {
        boolean z;
        boolean z2;
        Canvas canvas;
        boolean z3;
        float f;
        if (this.s) {
            return;
        }
        a();
        p29 p29Var = this.a;
        if (!p29Var.j()) {
            try {
                p29Var.t(this.b, this.c, this, this.e);
            } catch (Throwable unused) {
            }
        }
        boolean z4 = p29Var.N() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z4) {
            uj2Var.j();
        }
        Canvas b = xx.b(uj2Var);
        boolean isHardwareAccelerated = b.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            long j = this.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & 4294967295L);
            long j2 = this.u;
            float f4 = ((int) (j2 >> 32)) + f2;
            float f5 = ((int) (j2 & 4294967295L)) + f3;
            float a = p29Var.a();
            ay1 g = p29Var.g();
            int y2 = p29Var.y();
            if (a < 1.0f || y2 != 3 || g != null || p29Var.f() == 1) {
                gtj gtjVar = this.p;
                if (gtjVar == null) {
                    gtjVar = yqo.n();
                    this.p = gtjVar;
                }
                gtjVar.t(a);
                gtjVar.u(y2);
                gtjVar.w(g);
                b = b;
                f = f2;
                b.saveLayer(f, f3, f4, f5, (Paint) gtjVar.d);
            } else {
                b.save();
                b = b;
                f = f2;
            }
            b.translate(f, f3);
            b.concat(p29Var.v());
        }
        boolean z5 = !isHardwareAccelerated && this.w;
        if (z5) {
            uj2Var.o();
            pea e = e();
            if (e instanceof dxd) {
                uj2.t(uj2Var, ((dxd) e).g);
            } else if (e instanceof exd) {
                b20 b20Var = this.m;
                if (b20Var != null) {
                    b20Var.a.rewind();
                } else {
                    b20Var = e20.a();
                    this.m = b20Var;
                }
                b20.c(b20Var, ((exd) e).g);
                uj2Var.r(b20Var);
            } else {
                if (!(e instanceof cxd)) {
                    zzl.b();
                    return;
                }
                uj2Var.r(((cxd) e).g);
            }
        }
        if (n29Var != null) {
            n72 n72Var = n29Var.r;
            if (!n72Var.a) {
                q3a.a("Only add dependencies during a tracking");
            }
            y0d y0dVar = (y0d) n72Var.d;
            if (y0dVar != null) {
                y0dVar.a(this);
            } else if (((n29) n72Var.b) != null) {
                y0d y0dVar2 = rrg.a;
                y0d y0dVar3 = new y0d();
                n29 n29Var2 = (n29) n72Var.b;
                n29Var2.getClass();
                y0dVar3.a(n29Var2);
                y0dVar3.a(this);
                n72Var.d = y0dVar3;
                n72Var.b = null;
            } else {
                n72Var.b = this;
            }
            y0d y0dVar4 = (y0d) n72Var.e;
            if (y0dVar4 != null) {
                z3 = !y0dVar4.l(this);
            } else if (((n29) n72Var.c) != this) {
                z3 = true;
            } else {
                n72Var.c = null;
                z3 = false;
            }
            if (z3) {
                this.q++;
            }
        }
        if (((wx) uj2Var).a.isHardwareAccelerated()) {
            z = z4;
            z2 = z5;
            canvas = b;
            p29Var.E(uj2Var);
        } else {
            wj2 wj2Var = this.o;
            if (wj2Var == null) {
                wj2Var = new wj2();
                this.o = wj2Var;
            }
            sx2 sx2Var = wj2Var.b;
            kx4 kx4Var = this.b;
            ema emaVar = this.c;
            long I = d7a.I(this.u);
            kx4 u = sx2Var.u();
            ema z6 = sx2Var.z();
            uj2 t = sx2Var.t();
            z2 = z5;
            canvas = b;
            long D = sx2Var.D();
            z = z4;
            n29 n29Var3 = (n29) sx2Var.b;
            sx2Var.L(kx4Var);
            sx2Var.M(emaVar);
            sx2Var.K(uj2Var);
            sx2Var.N(I);
            sx2Var.b = this;
            uj2Var.o();
            try {
                d(wj2Var);
            } finally {
                uj2Var.h();
                sx2Var.L(u);
                sx2Var.M(z6);
                sx2Var.K(t);
                sx2Var.N(D);
                sx2Var.b = n29Var3;
            }
        }
        if (z2) {
            uj2Var.h();
        }
        if (z) {
            uj2Var.p();
        }
        if (isHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    public final void d(ha5 ha5Var) {
        n72 n72Var = this.r;
        n72Var.c = (n29) n72Var.b;
        y0d y0dVar = (y0d) n72Var.d;
        if (y0dVar != null && y0dVar.h()) {
            y0d y0dVar2 = (y0d) n72Var.e;
            if (y0dVar2 == null) {
                y0d y0dVar3 = rrg.a;
                y0dVar2 = new y0d();
                n72Var.e = y0dVar2;
            }
            y0dVar2.j(y0dVar);
            y0dVar.b();
        }
        n72Var.a = true;
        this.d.invoke(ha5Var);
        n72Var.a = false;
        n29 n29Var = (n29) n72Var.c;
        if (n29Var != null) {
            n29Var.q--;
            n29Var.b();
        }
        y0d y0dVar4 = (y0d) n72Var.e;
        if (y0dVar4 == null || !y0dVar4.h()) {
            return;
        }
        Object[] objArr = y0dVar4.b;
        long[] jArr = y0dVar4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((n29) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        y0dVar4.b();
    }

    public final pea e() {
        pea dxdVar;
        pea peaVar = this.k;
        b20 b20Var = this.l;
        if (peaVar != null) {
            return peaVar;
        }
        if (b20Var != null) {
            cxd cxdVar = new cxd(b20Var);
            this.k = cxdVar;
            return cxdVar;
        }
        long I = d7a.I(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            I = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (I >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (I & 4294967295L)) + intBitsToFloat2;
        if (this.j > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            dxdVar = new exd(uaa.d(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            dxdVar = new dxd(new oqf(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = dxdVar;
        return dxdVar;
    }

    public final void f(kx4 kx4Var, ema emaVar, long j, Function1 function1) {
        boolean a = c7a.a(this.u, j);
        p29 p29Var = this.a;
        if (!a) {
            this.u = j;
            long j2 = this.t;
            p29Var.h((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = kx4Var;
        this.c = emaVar;
        this.d = function1;
        p29Var.t(kx4Var, emaVar, this, this.e);
    }

    public final void g(float f) {
        p29 p29Var = this.a;
        if (p29Var.a() == f) {
            return;
        }
        p29Var.H(f);
    }

    public final void h(long j, long j2, float f) {
        if (dnd.c(this.h, j) && njh.c(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(sq3 sq3Var) {
        m29 m29Var;
        int i;
        if (sq3Var instanceof m29) {
            m29Var = (m29) sq3Var;
            int i2 = m29Var.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m29Var.t = i2 - Integer.MIN_VALUE;
                Object obj = m29Var.r;
                lu3 lu3Var = lu3.a;
                i = m29Var.t;
                if (i != 0) {
                    y6a.M(obj);
                    m29Var.t = 1;
                    obj = y.c(this, m29Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return new a10((Bitmap) obj);
            }
        }
        m29Var = new m29(this, sq3Var);
        Object obj2 = m29Var.r;
        lu3 lu3Var2 = lu3.a;
        i = m29Var.t;
        if (i != 0) {
        }
        return new a10((Bitmap) obj2);
    }
}

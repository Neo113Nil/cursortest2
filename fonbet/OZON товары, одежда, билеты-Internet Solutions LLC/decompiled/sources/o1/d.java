package o1;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.collection.M;
import androidx.collection.Y;
import k1.C7455a;
import k1.C7456b;
import k1.C7459e;
import k1.C7460f;
import k1.C7462h;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7784B;
import l1.C7785C;
import l1.C7786D;
import l1.C7790H;
import l1.C7807Z;
import l1.C7845v;
import l1.InterfaceC7802U;
import l1.s0;
import l1.z0;
import n1.C8411d;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e f77482a;

    /* renamed from: f, reason: collision with root package name */
    private Outline f77487f;

    /* renamed from: j, reason: collision with root package name */
    private float f77491j;

    /* renamed from: k, reason: collision with root package name */
    private AbstractC7839p0 f77492k;

    /* renamed from: l, reason: collision with root package name */
    private s0 f77493l;

    /* renamed from: m, reason: collision with root package name */
    private C7786D f77494m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f77495n;

    /* renamed from: o, reason: collision with root package name */
    private C7784B f77496o;

    /* renamed from: p, reason: collision with root package name */
    private int f77497p;

    /* renamed from: r, reason: collision with root package name */
    private boolean f77499r;

    /* renamed from: s, reason: collision with root package name */
    private long f77500s;

    /* renamed from: t, reason: collision with root package name */
    private long f77501t;

    /* renamed from: u, reason: collision with root package name */
    private long f77502u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f77503v;

    /* renamed from: w, reason: collision with root package name */
    private RectF f77504w;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Z1.d f77483b = C8411d.a();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private Z1.s f77484c = Z1.s.Ltr;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f77485d = C8629c.f77481b;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function1<InterfaceC8412e, Unit> f77486e = new C8628b(this);

    /* renamed from: g, reason: collision with root package name */
    private boolean f77488g = true;

    /* renamed from: h, reason: collision with root package name */
    private long f77489h = 0;

    /* renamed from: i, reason: collision with root package name */
    private long f77490i = 9205357640488583168L;

    /* renamed from: q, reason: collision with root package name */
    @NotNull
    private final C8627a f77498q = new C8627a();

    static {
        boolean unused;
        unused = l.f77587a;
    }

    public d(@NotNull e eVar) {
        this.f77482a = eVar;
        eVar.x(false);
        this.f77500s = 0L;
        this.f77501t = 0L;
        this.f77502u = 9205357640488583168L;
    }

    private final void d() {
        Outline outline;
        if (this.f77488g) {
            boolean z11 = this.f77503v;
            e eVar = this.f77482a;
            Outline outline2 = null;
            if (z11 || eVar.t() > 0.0f) {
                s0 s0Var = this.f77493l;
                if (s0Var != null) {
                    RectF rectF = this.f77504w;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f77504w = rectF;
                    }
                    boolean z12 = s0Var instanceof C7786D;
                    if (!z12) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    C7786D c7786d = (C7786D) s0Var;
                    c7786d.x().computeBounds(rectF, false);
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 > 28 || s0Var.o()) {
                        outline = this.f77487f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f77487f = outline;
                        }
                        if (i11 >= 30) {
                            q.f77591a.a(outline, s0Var);
                        } else {
                            if (!z12) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(c7786d.x());
                        }
                        this.f77495n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f77487f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f77495n = true;
                        outline = null;
                    }
                    this.f77493l = s0Var;
                    if (outline != null) {
                        outline.setAlpha(eVar.getAlpha());
                        outline2 = outline;
                    }
                    eVar.o(outline2, Z1.r.a(Math.round(rectF.width()), Math.round(rectF.height())));
                    if (this.f77495n && this.f77503v) {
                        eVar.x(false);
                        eVar.s();
                    } else {
                        eVar.x(this.f77503v);
                    }
                } else {
                    eVar.x(this.f77503v);
                    Outline outline4 = this.f77487f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f77487f = outline4;
                    }
                    Outline outline5 = outline4;
                    long b11 = Z1.r.b(this.f77501t);
                    long j11 = this.f77489h;
                    long j12 = this.f77490i;
                    long j13 = j12 == 9205357640488583168L ? b11 : j12;
                    outline5.setRoundRect(Math.round(C7459e.g(j11)), Math.round(C7459e.h(j11)), Math.round(C7464j.f(j13) + C7459e.g(j11)), Math.round(C7464j.d(j13) + C7459e.h(j11)), this.f77491j);
                    outline5.setAlpha(eVar.getAlpha());
                    eVar.o(outline5, (Math.round(C7464j.f(j13)) << 32) | (Math.round(C7464j.d(j13)) & 4294967295L));
                }
            } else {
                eVar.x(false);
                eVar.o(null, 0L);
            }
        }
        this.f77488g = false;
    }

    private final void e() {
        d dVar;
        M m11;
        if (this.f77499r && this.f77497p == 0) {
            C8627a c8627a = this.f77498q;
            dVar = c8627a.f77475a;
            if (dVar != null) {
                dVar.v();
                c8627a.f77475a = null;
            }
            m11 = c8627a.f77477c;
            if (m11 != null) {
                Object[] objArr = m11.f38663b;
                long[] jArr = m11.f38662a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j11 = jArr[i11];
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((255 & j11) < 128) {
                                    ((d) objArr[(i11 << 3) + i13]).v();
                                }
                                j11 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                m11.f();
            }
            this.f77482a.s();
        }
    }

    private final void v() {
        this.f77497p--;
        e();
    }

    private final void x() {
        d dVar;
        M elements;
        d dVar2;
        M m11;
        M m12;
        C8627a c8627a = this.f77498q;
        dVar = c8627a.f77475a;
        c8627a.f77476b = dVar;
        elements = c8627a.f77477c;
        if (elements != null && elements.c()) {
            m12 = c8627a.f77478d;
            if (m12 == null) {
                m12 = Y.a();
                c8627a.f77478d = m12;
            }
            Intrinsics.checkNotNullParameter(elements, "elements");
            m12.j(elements);
            elements.f();
        }
        c8627a.f77479e = true;
        this.f77482a.a(this.f77483b, this.f77484c, this, this.f77486e);
        c8627a.f77479e = false;
        dVar2 = c8627a.f77476b;
        if (dVar2 != null) {
            dVar2.v();
        }
        m11 = c8627a.f77478d;
        if (m11 == null || !m11.c()) {
            return;
        }
        Object[] objArr = m11.f38663b;
        long[] jArr = m11.f38662a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            ((d) objArr[(i11 << 3) + i13]).v();
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        m11.f();
    }

    public final void A(long j11) {
        e eVar = this.f77482a;
        if (C7807Z.p(j11, eVar.B())) {
            return;
        }
        eVar.H(j11);
    }

    public final void B(float f7) {
        e eVar = this.f77482a;
        if (eVar.i() == f7) {
            return;
        }
        eVar.d(f7);
    }

    public final void C(boolean z11) {
        if (this.f77503v != z11) {
            this.f77503v = z11;
            this.f77488g = true;
            d();
        }
    }

    public final void D(int i11) {
        e eVar = this.f77482a;
        if (eVar.v() == i11) {
            return;
        }
        eVar.G(i11);
    }

    public final void E(@NotNull s0 s0Var) {
        this.f77492k = null;
        this.f77490i = 9205357640488583168L;
        this.f77489h = 0L;
        this.f77491j = 0.0f;
        this.f77488g = true;
        this.f77495n = false;
        this.f77493l = s0Var;
        d();
    }

    public final void F(long j11) {
        if (C7459e.d(this.f77502u, j11)) {
            return;
        }
        this.f77502u = j11;
        this.f77482a.E(j11);
    }

    public final void G(z0 z0Var) {
        e eVar = this.f77482a;
        if (Intrinsics.d(eVar.b(), z0Var)) {
            return;
        }
        eVar.l(z0Var);
    }

    public final void H(float f7) {
        e eVar = this.f77482a;
        if (eVar.F() == f7) {
            return;
        }
        eVar.e(f7);
    }

    public final void I(float f7) {
        e eVar = this.f77482a;
        if (eVar.y() == f7) {
            return;
        }
        eVar.f(f7);
    }

    public final void J(float f7) {
        e eVar = this.f77482a;
        if (eVar.A() == f7) {
            return;
        }
        eVar.h(f7);
    }

    public final void K(long j11, long j12, float f7) {
        if (C7459e.d(this.f77489h, j11) && C7464j.c(this.f77490i, j12) && this.f77491j == f7 && this.f77493l == null) {
            return;
        }
        this.f77492k = null;
        this.f77493l = null;
        this.f77488g = true;
        this.f77495n = false;
        this.f77489h = j11;
        this.f77490i = j12;
        this.f77491j = f7;
        d();
    }

    public final void L(float f7) {
        e eVar = this.f77482a;
        if (eVar.D() == f7) {
            return;
        }
        eVar.j(f7);
    }

    public final void M(float f7) {
        e eVar = this.f77482a;
        if (eVar.I() == f7) {
            return;
        }
        eVar.k(f7);
    }

    public final void N(float f7) {
        e eVar = this.f77482a;
        if (eVar.t() == f7) {
            return;
        }
        eVar.z(f7);
        this.f77488g = true;
        d();
    }

    public final void O(long j11) {
        e eVar = this.f77482a;
        if (C7807Z.p(j11, eVar.g())) {
            return;
        }
        eVar.J(j11);
    }

    public final void P(long j11) {
        if (Z1.m.c(this.f77500s, j11)) {
            return;
        }
        this.f77500s = j11;
        long j12 = this.f77501t;
        this.f77482a.w((int) (j11 >> 32), (int) (j11 & 4294967295L), j12);
    }

    public final void Q(float f7) {
        e eVar = this.f77482a;
        if (eVar.q() == f7) {
            return;
        }
        eVar.n(f7);
    }

    public final void R(float f7) {
        e eVar = this.f77482a;
        if (eVar.p() == f7) {
            return;
        }
        eVar.c(f7);
    }

    public final void f(@NotNull InterfaceC7802U interfaceC7802U, d dVar) {
        float f7;
        if (this.f77499r) {
            return;
        }
        d();
        e eVar = this.f77482a;
        if (!eVar.r()) {
            try {
                x();
            } catch (Throwable unused) {
            }
        }
        boolean z11 = eVar.t() > 0.0f;
        if (z11) {
            interfaceC7802U.q();
        }
        Canvas b11 = C7845v.b(interfaceC7802U);
        boolean isHardwareAccelerated = b11.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            b11.save();
            long j11 = this.f77500s;
            float f11 = (int) (j11 >> 32);
            float f12 = (int) (j11 & 4294967295L);
            long j12 = this.f77501t;
            float f13 = ((int) (j12 >> 32)) + f11;
            float f14 = ((int) (j12 & 4294967295L)) + f12;
            float alpha = eVar.getAlpha();
            int C11 = eVar.C();
            if (alpha < 1.0f || C11 != 3 || eVar.v() == 1) {
                C7784B c7784b = this.f77496o;
                if (c7784b == null) {
                    c7784b = C7785C.a();
                    this.f77496o = c7784b;
                }
                c7784b.setAlpha(alpha);
                c7784b.o(C11);
                c7784b.c(null);
                b11 = b11;
                f7 = f11;
                b11.saveLayer(f7, f12, f13, f14, c7784b.d());
            } else {
                b11.save();
                b11 = b11;
                f7 = f11;
            }
            b11.translate(f7, f12);
            b11.concat(eVar.m());
        }
        boolean z12 = !isHardwareAccelerated && this.f77503v;
        if (z12) {
            interfaceC7802U.save();
            AbstractC7839p0 i11 = i();
            if (i11 instanceof AbstractC7839p0.b) {
                interfaceC7802U.r(i11.a());
            } else if (i11 instanceof AbstractC7839p0.c) {
                C7786D c7786d = this.f77494m;
                if (c7786d != null) {
                    c7786d.h();
                } else {
                    c7786d = C7790H.a();
                    this.f77494m = c7786d;
                }
                c7786d.s(((AbstractC7839p0.c) i11).b(), s0.a.CounterClockwise);
                interfaceC7802U.u(c7786d);
            } else if (i11 instanceof AbstractC7839p0.a) {
                interfaceC7802U.u(((AbstractC7839p0.a) i11).b());
            }
        }
        if (dVar != null && dVar.f77498q.i(this)) {
            this.f77497p++;
        }
        eVar.u(interfaceC7802U);
        if (z12) {
            interfaceC7802U.p();
        }
        if (z11) {
            interfaceC7802U.i();
        }
        if (isHardwareAccelerated) {
            return;
        }
        b11.restore();
    }

    public final float g() {
        return this.f77482a.getAlpha();
    }

    public final boolean h() {
        return this.f77503v;
    }

    @NotNull
    public final AbstractC7839p0 i() {
        AbstractC7839p0 bVar;
        AbstractC7839p0 abstractC7839p0 = this.f77492k;
        s0 s0Var = this.f77493l;
        if (abstractC7839p0 != null) {
            return abstractC7839p0;
        }
        if (s0Var != null) {
            AbstractC7839p0.a aVar = new AbstractC7839p0.a(s0Var);
            this.f77492k = aVar;
            return aVar;
        }
        long b11 = Z1.r.b(this.f77501t);
        long j11 = this.f77489h;
        long j12 = this.f77490i;
        if (j12 != 9205357640488583168L) {
            b11 = j12;
        }
        float g10 = C7459e.g(j11);
        float h11 = C7459e.h(j11);
        float f7 = C7464j.f(b11) + g10;
        float d11 = C7464j.d(b11) + h11;
        float f11 = this.f77491j;
        if (f11 > 0.0f) {
            long a11 = C7456b.a(f11, f11);
            long a12 = C7456b.a(C7455a.d(a11), C7455a.e(a11));
            bVar = new AbstractC7839p0.c(new C7462h(g10, h11, f7, d11, a12, a12, a12, a12));
        } else {
            bVar = new AbstractC7839p0.b(new C7460f(g10, h11, f7, d11));
        }
        this.f77492k = bVar;
        return bVar;
    }

    public final long j() {
        return this.f77502u;
    }

    public final float k() {
        return this.f77482a.F();
    }

    public final float l() {
        return this.f77482a.y();
    }

    public final float m() {
        return this.f77482a.A();
    }

    public final float n() {
        return this.f77482a.D();
    }

    public final float o() {
        return this.f77482a.I();
    }

    public final float p() {
        return this.f77482a.t();
    }

    public final long q() {
        return this.f77501t;
    }

    public final long r() {
        return this.f77500s;
    }

    public final float s() {
        return this.f77482a.q();
    }

    public final float t() {
        return this.f77482a.p();
    }

    public final boolean u() {
        return this.f77499r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(@NotNull Z1.d dVar, @NotNull Z1.s sVar, long j11, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        if (!Z1.q.c(this.f77501t, j11)) {
            this.f77501t = j11;
            long j12 = this.f77500s;
            this.f77482a.w((int) (j12 >> 32), (int) (j12 & 4294967295L), j11);
            if (this.f77490i == 9205357640488583168L) {
                this.f77488g = true;
                d();
            }
        }
        this.f77483b = dVar;
        this.f77484c = sVar;
        this.f77485d = (AbstractC7737t) function1;
        x();
    }

    public final void y() {
        if (this.f77499r) {
            return;
        }
        this.f77499r = true;
        e();
    }

    public final void z(float f7) {
        e eVar = this.f77482a;
        if (eVar.getAlpha() == f7) {
            return;
        }
        eVar.setAlpha(f7);
    }
}

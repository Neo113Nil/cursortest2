package o1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l1.C7803V;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7845v;
import l1.InterfaceC7802U;
import l1.z0;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;
import p1.C8830a;

/* loaded from: classes8.dex */
public final class k implements e {

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final a f77560B = new a();

    /* renamed from: A, reason: collision with root package name */
    private z0 f77561A;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8830a f77562b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C7803V f77563c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final u f77564d;

    /* renamed from: e, reason: collision with root package name */
    private final Resources f77565e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Rect f77566f;

    /* renamed from: g, reason: collision with root package name */
    private int f77567g;

    /* renamed from: h, reason: collision with root package name */
    private int f77568h;

    /* renamed from: i, reason: collision with root package name */
    private long f77569i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f77570j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f77571k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f77572l;

    /* renamed from: m, reason: collision with root package name */
    private int f77573m;

    /* renamed from: n, reason: collision with root package name */
    private int f77574n;

    /* renamed from: o, reason: collision with root package name */
    private float f77575o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f77576p;

    /* renamed from: q, reason: collision with root package name */
    private float f77577q;

    /* renamed from: r, reason: collision with root package name */
    private float f77578r;

    /* renamed from: s, reason: collision with root package name */
    private float f77579s;

    /* renamed from: t, reason: collision with root package name */
    private float f77580t;

    /* renamed from: u, reason: collision with root package name */
    private float f77581u;

    /* renamed from: v, reason: collision with root package name */
    private long f77582v;

    /* renamed from: w, reason: collision with root package name */
    private long f77583w;

    /* renamed from: x, reason: collision with root package name */
    private float f77584x;

    /* renamed from: y, reason: collision with root package name */
    private float f77585y;

    /* renamed from: z, reason: collision with root package name */
    private float f77586z;

    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public k(C8830a c8830a) {
        long j11;
        long j12;
        C7803V c7803v = new C7803V();
        C8408a c8408a = new C8408a();
        this.f77562b = c8830a;
        this.f77563c = c7803v;
        u uVar = new u(c8830a, c7803v, c8408a);
        this.f77564d = uVar;
        this.f77565e = c8830a.getResources();
        this.f77566f = new Rect();
        c8830a.addView(uVar);
        uVar.setClipBounds(null);
        this.f77569i = 0L;
        View.generateViewId();
        this.f77573m = 3;
        this.f77574n = 0;
        this.f77575o = 1.0f;
        this.f77577q = 1.0f;
        this.f77578r = 1.0f;
        j11 = C7807Z.f72248b;
        this.f77582v = j11;
        j12 = C7807Z.f72248b;
        this.f77583w = j12;
    }

    @Override // o1.e
    public final float A() {
        return this.f77586z;
    }

    @Override // o1.e
    public final long B() {
        return this.f77582v;
    }

    @Override // o1.e
    public final int C() {
        return this.f77573m;
    }

    @Override // o1.e
    public final float D() {
        return this.f77577q;
    }

    @Override // o1.e
    public final void E(long j11) {
        boolean e11 = P9.a.e(j11);
        u uVar = this.f77564d;
        if (!e11) {
            this.f77576p = false;
            uVar.setPivotX(C7459e.g(j11));
            uVar.setPivotY(C7459e.h(j11));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                uVar.resetPivot();
                return;
            }
            this.f77576p = true;
            uVar.setPivotX(((int) (this.f77569i >> 32)) / 2.0f);
            uVar.setPivotY(((int) (this.f77569i & 4294967295L)) / 2.0f);
        }
    }

    @Override // o1.e
    public final float F() {
        return this.f77584x;
    }

    @Override // o1.e
    public final void G(int i11) {
        this.f77574n = i11;
        u uVar = this.f77564d;
        boolean z11 = true;
        if (i11 == 1 || this.f77573m != 3) {
            uVar.setLayerType(2, null);
            uVar.b(true);
            return;
        }
        if (i11 == 1) {
            uVar.setLayerType(2, null);
        } else if (i11 == 2) {
            uVar.setLayerType(0, null);
            z11 = false;
        } else {
            uVar.setLayerType(0, null);
        }
        uVar.b(z11);
    }

    @Override // o1.e
    public final void H(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f77582v = j11;
            this.f77564d.setOutlineAmbientShadowColor(C7811b0.i(j11));
        }
    }

    @Override // o1.e
    public final float I() {
        return this.f77578r;
    }

    @Override // o1.e
    public final void J(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f77583w = j11;
            this.f77564d.setOutlineSpotShadowColor(C7811b0.i(j11));
        }
    }

    @Override // o1.e
    public final void a(@NotNull Z1.d dVar, @NotNull Z1.s sVar, @NotNull d dVar2, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        u uVar = this.f77564d;
        ViewParent parent = uVar.getParent();
        C8830a c8830a = this.f77562b;
        if (parent == null) {
            c8830a.addView(uVar);
        }
        uVar.c(dVar, sVar, dVar2, function1);
        if (uVar.isAttachedToWindow()) {
            uVar.setVisibility(4);
            uVar.setVisibility(0);
            try {
                C7803V c7803v = this.f77563c;
                a aVar = f77560B;
                Canvas v11 = c7803v.a().v();
                c7803v.a().w(aVar);
                c8830a.a(c7803v.a(), uVar, uVar.getDrawingTime());
                c7803v.a().w(v11);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // o1.e
    public final z0 b() {
        return this.f77561A;
    }

    @Override // o1.e
    public final void c(float f7) {
        this.f77580t = f7;
        this.f77564d.setTranslationY(f7);
    }

    @Override // o1.e
    public final void d(float f7) {
        this.f77564d.setCameraDistance(f7 * this.f77565e.getDisplayMetrics().densityDpi);
    }

    @Override // o1.e
    public final void e(float f7) {
        this.f77584x = f7;
        this.f77564d.setRotationX(f7);
    }

    @Override // o1.e
    public final void f(float f7) {
        this.f77585y = f7;
        this.f77564d.setRotationY(f7);
    }

    @Override // o1.e
    public final long g() {
        return this.f77583w;
    }

    @Override // o1.e
    public final float getAlpha() {
        return this.f77575o;
    }

    @Override // o1.e
    public final void h(float f7) {
        this.f77586z = f7;
        this.f77564d.setRotation(f7);
    }

    @Override // o1.e
    public final float i() {
        return this.f77564d.getCameraDistance() / this.f77565e.getDisplayMetrics().densityDpi;
    }

    @Override // o1.e
    public final void j(float f7) {
        this.f77577q = f7;
        this.f77564d.setScaleX(f7);
    }

    @Override // o1.e
    public final void k(float f7) {
        this.f77578r = f7;
        this.f77564d.setScaleY(f7);
    }

    @Override // o1.e
    public final void l(z0 z0Var) {
        this.f77561A = z0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f77564d.setRenderEffect(z0Var != null ? z0Var.a() : null);
        }
    }

    @Override // o1.e
    @NotNull
    public final Matrix m() {
        return this.f77564d.getMatrix();
    }

    @Override // o1.e
    public final void n(float f7) {
        this.f77579s = f7;
        this.f77564d.setTranslationX(f7);
    }

    @Override // o1.e
    public final void o(Outline outline, long j11) {
        u uVar = this.f77564d;
        uVar.d(outline);
        if ((this.f77572l || uVar.getClipToOutline()) && outline != null) {
            uVar.setClipToOutline(true);
            if (this.f77572l) {
                this.f77572l = false;
                this.f77570j = true;
            }
        }
        this.f77571k = outline != null;
    }

    @Override // o1.e
    public final float p() {
        return this.f77580t;
    }

    @Override // o1.e
    public final float q() {
        return this.f77579s;
    }

    @Override // o1.e
    public final void s() {
        this.f77562b.removeViewInLayout(this.f77564d);
    }

    @Override // o1.e
    public final void setAlpha(float f7) {
        this.f77575o = f7;
        this.f77564d.setAlpha(f7);
    }

    @Override // o1.e
    public final float t() {
        return this.f77581u;
    }

    @Override // o1.e
    public final void u(@NotNull InterfaceC7802U interfaceC7802U) {
        Rect rect;
        boolean z11 = this.f77570j;
        u uVar = this.f77564d;
        if (z11) {
            if ((this.f77572l || uVar.getClipToOutline()) && !this.f77571k) {
                rect = this.f77566f;
                rect.left = 0;
                rect.top = 0;
                rect.right = uVar.getWidth();
                rect.bottom = uVar.getHeight();
            } else {
                rect = null;
            }
            uVar.setClipBounds(rect);
        }
        if (C7845v.b(interfaceC7802U).isHardwareAccelerated()) {
            this.f77562b.a(interfaceC7802U, uVar, uVar.getDrawingTime());
        }
    }

    @Override // o1.e
    public final int v() {
        return this.f77574n;
    }

    @Override // o1.e
    public final void w(int i11, int i12, long j11) {
        boolean c11 = Z1.q.c(this.f77569i, j11);
        u uVar = this.f77564d;
        if (c11) {
            int i13 = this.f77567g;
            if (i13 != i11) {
                uVar.offsetLeftAndRight(i11 - i13);
            }
            int i14 = this.f77568h;
            if (i14 != i12) {
                uVar.offsetTopAndBottom(i12 - i14);
            }
        } else {
            if (this.f77572l || uVar.getClipToOutline()) {
                this.f77570j = true;
            }
            int i15 = (int) (j11 >> 32);
            int i16 = (int) (4294967295L & j11);
            uVar.layout(i11, i12, i11 + i15, i12 + i16);
            this.f77569i = j11;
            if (this.f77576p) {
                uVar.setPivotX(i15 / 2.0f);
                uVar.setPivotY(i16 / 2.0f);
            }
        }
        this.f77567g = i11;
        this.f77568h = i12;
    }

    @Override // o1.e
    public final void x(boolean z11) {
        boolean z12 = false;
        this.f77572l = z11 && !this.f77571k;
        this.f77570j = true;
        if (z11 && this.f77571k) {
            z12 = true;
        }
        this.f77564d.setClipToOutline(z12);
    }

    @Override // o1.e
    public final float y() {
        return this.f77585y;
    }

    @Override // o1.e
    public final void z(float f7) {
        this.f77581u = f7;
        this.f77564d.setElevation(f7);
    }
}

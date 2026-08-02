package o1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7803V;
import l1.C7807Z;
import l1.C7811b0;
import l1.C7844u;
import l1.C7845v;
import l1.InterfaceC7802U;
import l1.z0;
import n1.C8408a;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class f implements e {

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private static final AtomicBoolean f77509B = new AtomicBoolean(true);

    /* renamed from: A, reason: collision with root package name */
    private z0 f77510A;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7803V f77511b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8408a f77512c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final RenderNode f77513d;

    /* renamed from: e, reason: collision with root package name */
    private long f77514e;

    /* renamed from: f, reason: collision with root package name */
    private Matrix f77515f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f77516g;

    /* renamed from: h, reason: collision with root package name */
    private long f77517h;

    /* renamed from: i, reason: collision with root package name */
    private int f77518i;

    /* renamed from: j, reason: collision with root package name */
    private int f77519j;

    /* renamed from: k, reason: collision with root package name */
    private float f77520k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f77521l;

    /* renamed from: m, reason: collision with root package name */
    private float f77522m;

    /* renamed from: n, reason: collision with root package name */
    private float f77523n;

    /* renamed from: o, reason: collision with root package name */
    private float f77524o;

    /* renamed from: p, reason: collision with root package name */
    private float f77525p;

    /* renamed from: q, reason: collision with root package name */
    private float f77526q;

    /* renamed from: r, reason: collision with root package name */
    private long f77527r;

    /* renamed from: s, reason: collision with root package name */
    private long f77528s;

    /* renamed from: t, reason: collision with root package name */
    private float f77529t;

    /* renamed from: u, reason: collision with root package name */
    private float f77530u;

    /* renamed from: v, reason: collision with root package name */
    private float f77531v;

    /* renamed from: w, reason: collision with root package name */
    private float f77532w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f77533x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f77534y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f77535z;

    public f(@NotNull AndroidComposeView androidComposeView, @NotNull C7803V c7803v, @NotNull C8408a c8408a) {
        long j11;
        long j12;
        this.f77511b = c7803v;
        this.f77512c = c8408a;
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.f77513d = create;
        this.f77514e = 0L;
        this.f77517h = 0L;
        if (f77509B.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                s sVar = s.f77593a;
                sVar.c(create, sVar.a(create));
                sVar.d(create, sVar.b(create));
            }
            r.f77592a.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        L(0);
        this.f77518i = 0;
        this.f77519j = 3;
        this.f77520k = 1.0f;
        this.f77522m = 1.0f;
        this.f77523n = 1.0f;
        j11 = C7807Z.f72248b;
        this.f77527r = j11;
        j12 = C7807Z.f72248b;
        this.f77528s = j12;
        this.f77532w = 8.0f;
    }

    private final void K() {
        boolean z11 = this.f77533x;
        boolean z12 = false;
        boolean z13 = z11 && !this.f77516g;
        if (z11 && this.f77516g) {
            z12 = true;
        }
        if (z13 != this.f77534y) {
            this.f77534y = z13;
            this.f77513d.setClipToBounds(z13);
        }
        if (z12 != this.f77535z) {
            this.f77535z = z12;
            this.f77513d.setClipToOutline(z12);
        }
    }

    private final void L(int i11) {
        RenderNode renderNode = this.f77513d;
        if (i11 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // o1.e
    public final float A() {
        return this.f77531v;
    }

    @Override // o1.e
    public final long B() {
        return this.f77527r;
    }

    @Override // o1.e
    public final int C() {
        return this.f77519j;
    }

    @Override // o1.e
    public final float D() {
        return this.f77522m;
    }

    @Override // o1.e
    public final void E(long j11) {
        if (P9.a.e(j11)) {
            this.f77521l = true;
            this.f77513d.setPivotX(((int) (this.f77514e >> 32)) / 2.0f);
            this.f77513d.setPivotY(((int) (this.f77514e & 4294967295L)) / 2.0f);
        } else {
            this.f77521l = false;
            this.f77513d.setPivotX(C7459e.g(j11));
            this.f77513d.setPivotY(C7459e.h(j11));
        }
    }

    @Override // o1.e
    public final float F() {
        return this.f77529t;
    }

    @Override // o1.e
    public final void G(int i11) {
        this.f77518i = i11;
        if (i11 != 1 && this.f77519j == 3) {
            L(i11);
        } else {
            L(1);
        }
    }

    @Override // o1.e
    public final void H(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f77527r = j11;
            s.f77593a.c(this.f77513d, C7811b0.i(j11));
        }
    }

    @Override // o1.e
    public final float I() {
        return this.f77523n;
    }

    @Override // o1.e
    public final void J(long j11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f77528s = j11;
            s.f77593a.d(this.f77513d, C7811b0.i(j11));
        }
    }

    @Override // o1.e
    public final void a(@NotNull Z1.d dVar, @NotNull Z1.s sVar, @NotNull d dVar2, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        Canvas start = this.f77513d.start(Math.max((int) (this.f77514e >> 32), (int) (this.f77517h >> 32)), Math.max((int) (this.f77514e & 4294967295L), (int) (this.f77517h & 4294967295L)));
        try {
            C7803V c7803v = this.f77511b;
            Canvas v11 = c7803v.a().v();
            c7803v.a().w(start);
            C7844u a11 = c7803v.a();
            C8408a c8408a = this.f77512c;
            long b11 = Z1.r.b(this.f77514e);
            Z1.d b12 = c8408a.w0().b();
            Z1.s d11 = c8408a.w0().d();
            InterfaceC7802U a12 = c8408a.w0().a();
            long e11 = c8408a.w0().e();
            d c11 = c8408a.w0().c();
            C8408a.b w02 = c8408a.w0();
            w02.h(dVar);
            w02.j(sVar);
            w02.g(a11);
            w02.k(b11);
            w02.i(dVar2);
            a11.save();
            try {
                ((C8628b) function1).invoke(c8408a);
                a11.p();
                C8408a.b w03 = c8408a.w0();
                w03.h(b12);
                w03.j(d11);
                w03.g(a12);
                w03.k(e11);
                w03.i(c11);
                c7803v.a().w(v11);
            } catch (Throwable th2) {
                a11.p();
                C8408a.b w04 = c8408a.w0();
                w04.h(b12);
                w04.j(d11);
                w04.g(a12);
                w04.k(e11);
                w04.i(c11);
                throw th2;
            }
        } finally {
            this.f77513d.end(start);
        }
    }

    @Override // o1.e
    public final z0 b() {
        return this.f77510A;
    }

    @Override // o1.e
    public final void c(float f7) {
        this.f77525p = f7;
        this.f77513d.setTranslationY(f7);
    }

    @Override // o1.e
    public final void d(float f7) {
        this.f77532w = f7;
        this.f77513d.setCameraDistance(-f7);
    }

    @Override // o1.e
    public final void e(float f7) {
        this.f77529t = f7;
        this.f77513d.setRotationX(f7);
    }

    @Override // o1.e
    public final void f(float f7) {
        this.f77530u = f7;
        this.f77513d.setRotationY(f7);
    }

    @Override // o1.e
    public final long g() {
        return this.f77528s;
    }

    @Override // o1.e
    public final float getAlpha() {
        return this.f77520k;
    }

    @Override // o1.e
    public final void h(float f7) {
        this.f77531v = f7;
        this.f77513d.setRotation(f7);
    }

    @Override // o1.e
    public final float i() {
        return this.f77532w;
    }

    @Override // o1.e
    public final void j(float f7) {
        this.f77522m = f7;
        this.f77513d.setScaleX(f7);
    }

    @Override // o1.e
    public final void k(float f7) {
        this.f77523n = f7;
        this.f77513d.setScaleY(f7);
    }

    @Override // o1.e
    public final void l(z0 z0Var) {
        this.f77510A = z0Var;
    }

    @Override // o1.e
    @NotNull
    public final Matrix m() {
        Matrix matrix = this.f77515f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f77515f = matrix;
        }
        this.f77513d.getMatrix(matrix);
        return matrix;
    }

    @Override // o1.e
    public final void n(float f7) {
        this.f77524o = f7;
        this.f77513d.setTranslationX(f7);
    }

    @Override // o1.e
    public final void o(Outline outline, long j11) {
        this.f77517h = j11;
        this.f77513d.setOutline(outline);
        this.f77516g = outline != null;
        K();
    }

    @Override // o1.e
    public final float p() {
        return this.f77525p;
    }

    @Override // o1.e
    public final float q() {
        return this.f77524o;
    }

    @Override // o1.e
    public final boolean r() {
        return this.f77513d.isValid();
    }

    @Override // o1.e
    public final void s() {
        r.f77592a.a(this.f77513d);
    }

    @Override // o1.e
    public final void setAlpha(float f7) {
        this.f77520k = f7;
        this.f77513d.setAlpha(f7);
    }

    @Override // o1.e
    public final float t() {
        return this.f77526q;
    }

    @Override // o1.e
    public final void u(@NotNull InterfaceC7802U interfaceC7802U) {
        DisplayListCanvas b11 = C7845v.b(interfaceC7802U);
        Intrinsics.g(b11, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        b11.drawRenderNode(this.f77513d);
    }

    @Override // o1.e
    public final int v() {
        return this.f77518i;
    }

    @Override // o1.e
    public final void w(int i11, int i12, long j11) {
        int i13 = (int) (j11 >> 32);
        int i14 = (int) (4294967295L & j11);
        this.f77513d.setLeftTopRightBottom(i11, i12, i11 + i13, i12 + i14);
        if (Z1.q.c(this.f77514e, j11)) {
            return;
        }
        if (this.f77521l) {
            this.f77513d.setPivotX(i13 / 2.0f);
            this.f77513d.setPivotY(i14 / 2.0f);
        }
        this.f77514e = j11;
    }

    @Override // o1.e
    public final void x(boolean z11) {
        this.f77533x = z11;
        K();
    }

    @Override // o1.e
    public final float y() {
        return this.f77530u;
    }

    @Override // o1.e
    public final void z(float f7) {
        this.f77526q = f7;
        this.f77513d.setElevation(f7);
    }

    public /* synthetic */ f(AndroidComposeView androidComposeView) {
        this(androidComposeView, new C7803V(), new C8408a());
    }
}

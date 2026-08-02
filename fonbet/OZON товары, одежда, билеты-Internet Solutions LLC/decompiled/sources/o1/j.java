package o1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
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

/* loaded from: classes.dex */
public final class j implements e {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C7803V f77536b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C8408a f77537c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final RenderNode f77538d;

    /* renamed from: e, reason: collision with root package name */
    private long f77539e;

    /* renamed from: f, reason: collision with root package name */
    private Matrix f77540f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f77541g;

    /* renamed from: h, reason: collision with root package name */
    private float f77542h;

    /* renamed from: i, reason: collision with root package name */
    private int f77543i;

    /* renamed from: j, reason: collision with root package name */
    private float f77544j;

    /* renamed from: k, reason: collision with root package name */
    private float f77545k;

    /* renamed from: l, reason: collision with root package name */
    private float f77546l;

    /* renamed from: m, reason: collision with root package name */
    private float f77547m;

    /* renamed from: n, reason: collision with root package name */
    private float f77548n;

    /* renamed from: o, reason: collision with root package name */
    private long f77549o;

    /* renamed from: p, reason: collision with root package name */
    private long f77550p;

    /* renamed from: q, reason: collision with root package name */
    private float f77551q;

    /* renamed from: r, reason: collision with root package name */
    private float f77552r;

    /* renamed from: s, reason: collision with root package name */
    private float f77553s;

    /* renamed from: t, reason: collision with root package name */
    private float f77554t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f77555u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f77556v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f77557w;

    /* renamed from: x, reason: collision with root package name */
    private z0 f77558x;

    /* renamed from: y, reason: collision with root package name */
    private int f77559y;

    public j() {
        long j11;
        long j12;
        C7803V c7803v = new C7803V();
        C8408a c8408a = new C8408a();
        this.f77536b = c7803v;
        this.f77537c = c8408a;
        RenderNode a11 = g.a();
        this.f77538d = a11;
        this.f77539e = 0L;
        a11.setClipToBounds(false);
        L(a11, 0);
        this.f77542h = 1.0f;
        this.f77543i = 3;
        this.f77544j = 1.0f;
        this.f77545k = 1.0f;
        j11 = C7807Z.f72248b;
        this.f77549o = j11;
        j12 = C7807Z.f72248b;
        this.f77550p = j12;
        this.f77554t = 8.0f;
        this.f77559y = 0;
    }

    private final void K() {
        boolean z11 = this.f77555u;
        boolean z12 = false;
        boolean z13 = z11 && !this.f77541g;
        if (z11 && this.f77541g) {
            z12 = true;
        }
        if (z13 != this.f77556v) {
            this.f77556v = z13;
            this.f77538d.setClipToBounds(z13);
        }
        if (z12 != this.f77557w) {
            this.f77557w = z12;
            this.f77538d.setClipToOutline(z12);
        }
    }

    private static void L(RenderNode renderNode, int i11) {
        if (i11 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i11 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // o1.e
    public final float A() {
        return this.f77553s;
    }

    @Override // o1.e
    public final long B() {
        return this.f77549o;
    }

    @Override // o1.e
    public final int C() {
        return this.f77543i;
    }

    @Override // o1.e
    public final float D() {
        return this.f77544j;
    }

    @Override // o1.e
    public final void E(long j11) {
        if (P9.a.e(j11)) {
            this.f77538d.resetPivot();
        } else {
            this.f77538d.setPivotX(C7459e.g(j11));
            this.f77538d.setPivotY(C7459e.h(j11));
        }
    }

    @Override // o1.e
    public final float F() {
        return this.f77551q;
    }

    @Override // o1.e
    public final void G(int i11) {
        this.f77559y = i11;
        if (i11 != 1 && this.f77543i == 3 && this.f77558x == null) {
            L(this.f77538d, i11);
        } else {
            L(this.f77538d, 1);
        }
    }

    @Override // o1.e
    public final void H(long j11) {
        this.f77549o = j11;
        this.f77538d.setAmbientShadowColor(C7811b0.i(j11));
    }

    @Override // o1.e
    public final float I() {
        return this.f77545k;
    }

    @Override // o1.e
    public final void J(long j11) {
        this.f77550p = j11;
        this.f77538d.setSpotShadowColor(C7811b0.i(j11));
    }

    @Override // o1.e
    public final void a(@NotNull Z1.d dVar, @NotNull Z1.s sVar, @NotNull d dVar2, @NotNull Function1<? super InterfaceC8412e, Unit> function1) {
        RecordingCanvas beginRecording;
        C8408a c8408a = this.f77537c;
        beginRecording = this.f77538d.beginRecording();
        try {
            C7803V c7803v = this.f77536b;
            Canvas v11 = c7803v.a().v();
            c7803v.a().w(beginRecording);
            C7844u a11 = c7803v.a();
            C8408a.b w02 = c8408a.w0();
            w02.h(dVar);
            w02.j(sVar);
            w02.i(dVar2);
            w02.k(this.f77539e);
            w02.g(a11);
            ((C8628b) function1).invoke(c8408a);
            c7803v.a().w(v11);
        } finally {
            this.f77538d.endRecording();
        }
    }

    @Override // o1.e
    public final z0 b() {
        return this.f77558x;
    }

    @Override // o1.e
    public final void c(float f7) {
        this.f77547m = f7;
        this.f77538d.setTranslationY(f7);
    }

    @Override // o1.e
    public final void d(float f7) {
        this.f77554t = f7;
        this.f77538d.setCameraDistance(f7);
    }

    @Override // o1.e
    public final void e(float f7) {
        this.f77551q = f7;
        this.f77538d.setRotationX(f7);
    }

    @Override // o1.e
    public final void f(float f7) {
        this.f77552r = f7;
        this.f77538d.setRotationY(f7);
    }

    @Override // o1.e
    public final long g() {
        return this.f77550p;
    }

    @Override // o1.e
    public final float getAlpha() {
        return this.f77542h;
    }

    @Override // o1.e
    public final void h(float f7) {
        this.f77553s = f7;
        this.f77538d.setRotationZ(f7);
    }

    @Override // o1.e
    public final float i() {
        return this.f77554t;
    }

    @Override // o1.e
    public final void j(float f7) {
        this.f77544j = f7;
        this.f77538d.setScaleX(f7);
    }

    @Override // o1.e
    public final void k(float f7) {
        this.f77545k = f7;
        this.f77538d.setScaleY(f7);
    }

    @Override // o1.e
    public final void l(z0 z0Var) {
        this.f77558x = z0Var;
        if (Build.VERSION.SDK_INT >= 31) {
            t.f77594a.a(this.f77538d, z0Var);
        }
    }

    @Override // o1.e
    @NotNull
    public final Matrix m() {
        Matrix matrix = this.f77540f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f77540f = matrix;
        }
        this.f77538d.getMatrix(matrix);
        return matrix;
    }

    @Override // o1.e
    public final void n(float f7) {
        this.f77546l = f7;
        this.f77538d.setTranslationX(f7);
    }

    @Override // o1.e
    public final void o(Outline outline, long j11) {
        this.f77538d.setOutline(outline);
        this.f77541g = outline != null;
        K();
    }

    @Override // o1.e
    public final float p() {
        return this.f77547m;
    }

    @Override // o1.e
    public final float q() {
        return this.f77546l;
    }

    @Override // o1.e
    public final boolean r() {
        boolean hasDisplayList;
        hasDisplayList = this.f77538d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // o1.e
    public final void s() {
        this.f77538d.discardDisplayList();
    }

    @Override // o1.e
    public final void setAlpha(float f7) {
        this.f77542h = f7;
        this.f77538d.setAlpha(f7);
    }

    @Override // o1.e
    public final float t() {
        return this.f77548n;
    }

    @Override // o1.e
    public final void u(@NotNull InterfaceC7802U interfaceC7802U) {
        C7845v.b(interfaceC7802U).drawRenderNode(this.f77538d);
    }

    @Override // o1.e
    public final int v() {
        return this.f77559y;
    }

    @Override // o1.e
    public final void w(int i11, int i12, long j11) {
        this.f77538d.setPosition(i11, i12, ((int) (j11 >> 32)) + i11, ((int) (4294967295L & j11)) + i12);
        this.f77539e = Z1.r.b(j11);
    }

    @Override // o1.e
    public final void x(boolean z11) {
        this.f77555u = z11;
        K();
    }

    @Override // o1.e
    public final float y() {
        return this.f77552r;
    }

    @Override // o1.e
    public final void z(float f7) {
        this.f77548n = f7;
        this.f77538d.setElevation(f7);
    }
}

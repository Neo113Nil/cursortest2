package com.vk.content.design.view.camera;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.camera.widgets.TabsRecycler;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.core.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.asu0;
import xsna.bpn0;
import xsna.cqi;
import xsna.e43;
import xsna.epx;
import xsna.gn10;
import xsna.gq;
import xsna.iah0;
import xsna.j5g;
import xsna.l8g;
import xsna.mkj0;
import xsna.nkj0;
import xsna.nt10;
import xsna.okj0;
import xsna.u11;
import xsna.uia;
import xsna.wmz;
import xsna.wq;
import xsna.xwk;
import xsna.y8g0;

/* compiled from: ShutterButton.kt */
/* loaded from: classes.dex */
public final class ShutterButton extends FrameLayout implements TabsRecycler.d, TabsRecycler.b, GestureDetector.OnGestureListener {
    public static final float L = iah0.a(54.0f);
    public static final float M = iah0.a(74.0f);
    public static final int N;
    public static final int O;
    public static final int P;
    public static final float Q;
    public static final float R;
    public static final float S;
    public static final Typeface T;
    public static final float U;
    public static final int V;
    public static final int W;
    public float A;
    public float B;
    public int C;
    public ValueAnimator D;
    public com.vk.content.design.view.camera.d E;
    public mkj0 F;
    public boolean G;
    public final okj0 H;
    public ValueAnimator I;
    public e J;
    public boolean K;
    public List<d> b;
    public int c;
    public int d;
    public float e;
    public a f;
    public View.OnTouchListener g;
    public b h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final int l;
    public final long m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    public io.reactivex.rxjava3.disposables.c r;
    public boolean s;
    public boolean t;
    public boolean u;
    public final bpn0 v;
    public boolean w;
    public ValueAnimator x;
    public float y;
    public float z;

    /* compiled from: ShutterButton.kt */
    public interface a {
        void a(int i);

        void c(long j);

        void d(int i);

        void g(int i);

        void j();
    }

    /* compiled from: ShutterButton.kt */
    /* loaded from: classes17.dex */
    public interface b {
        void a(int i, int i2);
    }

    /* compiled from: ShutterButton.kt */
    /* loaded from: classes17.dex */
    public interface c {
    }

    /* compiled from: ShutterButton.kt */
    /* loaded from: classes17.dex */
    public static final class d {
        public String a;
        public Bitmap b;
        public final Rect c = new Rect();
        public final Rect d = new Rect();
        public boolean e;
        public int f;
        public float g;
        public boolean h;
        public int i;
        public final boolean j;
        public final boolean k;
        public int l;
        public final int m;
        public boolean n;
        public boolean o;
        public int p;
        public int q;
        public boolean r;
        public int s;
        public final Typeface t;
        public final float u;
        public String v;
        public final float w;
        public boolean x;

        public d() {
            float f = ShutterButton.L;
            this.f = ShutterButton.O;
            this.g = ShutterButton.L;
            this.h = true;
            int i = okj0.z0;
            this.i = okj0.z0;
            this.j = true;
            this.k = true;
            this.l = 17;
            this.m = 48;
            this.p = okj0.A0;
            this.q = 255;
            this.s = ShutterButton.N;
            this.t = ShutterButton.T;
            this.u = iah0.a(16);
            this.w = ShutterButton.U;
            this.x = true;
        }

        public final Bitmap a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }

        public final float c() {
            return this.u;
        }

        public final Typeface d() {
            return this.t;
        }

        public final boolean e() {
            return this.k;
        }

        public final boolean f() {
            return this.j;
        }

        public final boolean g() {
            return this.n;
        }

        public final boolean h() {
            return this.r;
        }

        public final float i() {
            return this.g;
        }

        public final int j() {
            return this.p;
        }

        public final int k() {
            return this.q;
        }

        public final String l() {
            return this.v;
        }

        public final int m() {
            return this.l;
        }

        public final int n() {
            return this.m;
        }

        public final boolean o() {
            return this.h;
        }

        public final boolean p() {
            return this.o;
        }

        public final Rect q() {
            return this.d;
        }

        public final int r() {
            return this.f;
        }

        public final boolean s() {
            return this.e;
        }

        public final float t() {
            return this.w;
        }

        public final int u() {
            return this.i;
        }

        public final Rect v() {
            return this.c;
        }

        public final boolean w() {
            return this.x;
        }

        public final int x() {
            return this.s;
        }
    }

    /* compiled from: ShutterButton.kt */
    /* loaded from: classes17.dex */
    public interface e {
        void G(float f);
    }

    static {
        iah0.b(56.0f);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        N = context.getColor(R.color.vk_white);
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        O = context2.getColor(R.color.almost_black);
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        P = context3.getColor(R.color.vk_red_nice);
        Q = iah0.a(3.0f);
        R = iah0.a(14.0f);
        S = iah0.a(15.0f);
        Context context4 = e43.a;
        Typeface a2 = cqi.a(Font.Companion, FontFamily.REGULAR, 13.0f, context4 != null ? context4 : null);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        T = a2;
        U = iah0.a(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
        V = iah0.a(108);
        W = iah0.a(32);
    }

    public ShutterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new ArrayList();
        Paint paint = new Paint(1);
        this.i = true;
        this.j = true;
        this.k = true;
        this.l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.m = ViewConfiguration.getLongPressTimeout() / 2;
        this.v = new bpn0(new uia(this, 7));
        this.G = true;
        this.H = new okj0(this);
        paint.setColor(Color.parseColor("#ff00ff00"));
        setWillNotDraw(false);
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.v.getValue();
    }

    private final void setLayoutParamsAsNextBtn(int i) {
        int i2 = V;
        if (i < i2) {
            i = i2;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.width = i;
        layoutParams.gravity = 85;
        setLayoutParams(layoutParams);
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.d
    public final boolean a(MotionEvent motionEvent) {
        a aVar;
        a aVar2;
        b bVar;
        if (motionEvent.getPointerCount() > 1) {
            if (motionEvent.getActionMasked() == 5 && (bVar = this.h) != null) {
                bVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            }
            if (!this.k) {
                return false;
            }
            if (!this.u) {
                a aVar3 = this.f;
                if (aVar3 != null) {
                    aVar3.j();
                }
                setCanceledTouch(true);
                f();
            }
            return true;
        }
        View.OnTouchListener onTouchListener = this.g;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        getGestureDetector().onTouchEvent(motionEvent);
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        okj0 okj0Var = this.H;
        RectF rectF = okj0Var.m0;
        float f = i;
        float f2 = rectF.left + f;
        float f3 = S;
        float f4 = f2 - f3;
        float f5 = rectF.right + f + f3;
        float rawX = motionEvent.getRawX();
        if (f4 <= rawX && rawX <= f5) {
            RectF rectF2 = okj0Var.m0;
            float f6 = i2;
            float f7 = (rectF2.top + f6) - f3;
            float f8 = rectF2.bottom + f6 + f3;
            float rawY = motionEvent.getRawY();
            if (f7 <= rawY && rawY <= f8) {
                this.p = true;
            }
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                boolean z = this.u;
                if (!z) {
                    if (this.j && !this.q && this.p && !this.s && !z && (aVar2 = this.f) != null) {
                        aVar2.a(this.c);
                    }
                    if (this.s && !this.u && (aVar = this.f) != null) {
                        aVar.d(this.c);
                    }
                }
                f();
            } else if (action != 2) {
                if (action != 3) {
                    f();
                } else {
                    f();
                }
            } else if (!this.u) {
                float abs = Math.abs(this.n - motionEvent.getX());
                float f9 = this.l;
                if (abs > f9 || gq.a(motionEvent, this.o) > f9) {
                    this.q = true;
                }
                if (!this.s && Math.abs(this.n - motionEvent.getX()) > W && gq.a(motionEvent, this.o) < iah0.a(32)) {
                    this.w = true;
                }
            }
        } else if (!this.u) {
            this.n = motionEvent.getX();
            this.o = motionEvent.getY();
            io.reactivex.rxjava3.disposables.c cVar = this.r;
            if (cVar != null) {
                cVar.dispose();
            }
            if (this.i) {
                this.r = q.B0(this.m, TimeUnit.MILLISECONDS).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new wmz(new nt10(this, 24), 20));
            }
        }
        motionEvent.getX();
        return this.t;
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void b(int i, boolean z) {
        this.c = i;
        this.d = -1;
        setDelta(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c();
        d();
        invalidate();
    }

    public final void c() {
        okj0 okj0Var;
        if (this.b.isEmpty()) {
            return;
        }
        d dVar = (d) j5g.b0(this.c, this.b);
        if (dVar == null) {
            return;
        }
        okj0 okj0Var2 = this.H;
        TextPaint textPaint = okj0Var2.i;
        Paint paint = okj0Var2.c;
        Paint paint2 = okj0Var2.d;
        okj0Var2.i0 = dVar.q();
        okj0Var2.j0 = dVar.q();
        okj0Var2.t = dVar.v();
        okj0Var2.u = dVar.v();
        okj0Var2.z = dVar.s();
        okj0Var2.A = false;
        okj0Var2.j.setColor(dVar.r());
        okj0Var2.W = dVar.a();
        okj0Var2.X = null;
        TextPaint textPaint2 = okj0Var2.h;
        textPaint2.setTextSize(dVar.c());
        ShutterButton shutterButton = okj0Var2.a;
        String b2 = okj0Var2.b(dVar, textPaint2, shutterButton.getPosCur());
        okj0Var2.Y = b2;
        okj0Var2.Z = null;
        if (b2 != null) {
            okj0Var2.g0 = okj0Var2.c(shutterButton.getPosCur(), textPaint2, b2);
        }
        okj0Var2.J = okj0Var2.d(okj0Var2.Y, okj0Var2.g0, okj0Var2.t, okj0Var2.i0, dVar);
        okj0Var2.K = dVar.i();
        Rect rect = okj0Var2.i0;
        okj0Var2.L = dVar.i() + rect.top + rect.bottom;
        okj0Var2.C = dVar.o();
        okj0Var2.B = false;
        okj0Var2.P = dVar.p();
        okj0Var2.Q = false;
        okj0Var2.R = dVar.j();
        okj0Var2.T = dVar.k();
        okj0Var2.N = dVar.u();
        okj0Var2.c0 = dVar.x();
        okj0Var2.e0 = dVar.d();
        okj0Var2.a0 = 0;
        float f = okj0Var2.n0;
        okj0Var2.n0 = okj0Var2.e(dVar.m(), okj0Var2.t, okj0Var2.J);
        okj0Var2.o0 = okj0Var2.f(dVar.n(), okj0Var2.t, okj0Var2.L);
        if (okj0Var2.k0) {
            if (paint.getShader() == null || okj0Var2.n0 != f || okj0Var2.o0 != f) {
                paint.setShader(new SweepGradient(okj0Var2.n0, okj0Var2.o0, okj0.B0, okj0.C0));
            }
            if (paint2.getShader() == null || okj0Var2.n0 != f || okj0Var2.o0 != f) {
                SweepGradient sweepGradient = new SweepGradient(okj0Var2.n0, okj0Var2.o0, new int[]{0, paint2.getColor()}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f});
                Matrix matrix = new Matrix();
                matrix.setRotate(175.0f, okj0Var2.n0, okj0Var2.o0);
                sweepGradient.setLocalMatrix(matrix);
                paint2.setShader(sweepGradient);
            }
        } else {
            paint.setShader(null);
            paint2.setShader(null);
        }
        if (shutterButton.getPosCur() == shutterButton.getPosNext() || okj0Var2.s0 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || shutterButton.getPosNext() == -1) {
            okj0Var = okj0Var2;
        } else {
            d dVar2 = shutterButton.getItems().get(shutterButton.getPosNext());
            okj0Var2.X = dVar2.a();
            okj0Var2.A = dVar2.s();
            okj0Var2.u = dVar2.v();
            okj0Var2.j0 = dVar2.q();
            okj0Var2.V = dVar2.h();
            String b3 = okj0Var2.b(dVar2, textPaint, shutterButton.getPosNext());
            okj0Var2.Z = b3;
            if (b3 != null) {
                textPaint.setTextSize(dVar2.c());
                okj0Var2.h0 = okj0Var2.c(shutterButton.getPosNext(), textPaint, okj0Var2.Z);
            }
            okj0Var = okj0Var2;
            okj0Var.K = okj0Var.d(okj0Var.Z, okj0Var.h0, okj0Var.u, okj0Var.j0, dVar2);
            Rect rect2 = okj0Var.j0;
            okj0Var.M = dVar2.i() + rect2.top + rect2.bottom;
            okj0Var.B = dVar2.o();
            okj0Var.Q = dVar2.p();
            okj0Var.S = dVar2.j();
            okj0Var.U = dVar2.k();
            okj0Var.O = dVar2.u();
            okj0Var.d0 = dVar2.x();
            okj0Var.f0 = dVar2.d();
            okj0Var.b0 = 0;
            okj0Var.H = okj0Var.e(dVar2.m(), okj0Var.u, okj0Var.K);
            okj0Var.I = okj0Var.f(dVar2.n(), okj0Var.u, okj0Var.M);
        }
        if (epx.f(dVar.b(), y8g0.e(R.string.story_multi_uploading_next_title))) {
            setLayoutParamsAsNextBtn((int) okj0Var.J);
        } else {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = -1;
            layoutParams.gravity = 81;
            setLayoutParams(layoutParams);
        }
        this.j = dVar.e();
        this.i = dVar.f();
        setContentDescription(dVar.l());
        setImportantForAccessibility(dVar.l() == null ? 2 : 0);
        this.k = dVar.w();
    }

    public final void d() {
        int i = this.c;
        int i2 = this.d;
        if (i != i2 && (i2 != -1 || this.e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            this.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else {
            this.y = Math.abs(this.e / 5.0f);
            setDelta(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // com.vk.clips.design.view.camera.widgets.TabsRecycler.b
    public final void e(float f, int i, int i2) {
        this.c = i;
        this.d = i2;
        setDelta(f);
        c();
        d();
        invalidate();
    }

    public final void f() {
        this.n = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.o = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.p = false;
        this.q = false;
        this.t = false;
        this.s = false;
        setCanceledTouch(false);
        this.w = false;
        invalidate();
    }

    public final ValueAnimator getAScale() {
        return this.x;
    }

    public final boolean getCanceledTouch() {
        return this.u;
    }

    public final a getClickListener() {
        return this.f;
    }

    public final float getDelta() {
        return this.e;
    }

    public final b getExternalDownListener() {
        return this.h;
    }

    public final View.OnTouchListener getExternalTouchListener() {
        return this.g;
    }

    public final boolean getForwardDirection() {
        return this.G;
    }

    public final c getHorizontalScrollListener() {
        return null;
    }

    public final List<d> getItems() {
        return this.b;
    }

    public final float getIterationProgressPercent() {
        return this.A;
    }

    public final float getLoadingProgress() {
        return this.H.x0;
    }

    public final int getPosCur() {
        return this.c;
    }

    public final int getPosNext() {
        return this.d;
    }

    public final float getScaleBounceFactor() {
        return this.y;
    }

    public final float getScalePressFactor() {
        return this.z;
    }

    public final float getTotalProgressPercent() {
        return this.B;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x019e, code lost:
    
        if (r3 < com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0658  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        Matrix matrix;
        int i;
        float f2;
        float f3;
        Canvas canvas2;
        boolean z;
        float f4;
        float f5;
        float f6;
        Shader shader;
        Bitmap bitmap;
        float f7;
        int i2;
        Matrix matrix2;
        int i3;
        float f8;
        int i4;
        int i5;
        int i6;
        int i7;
        float f9;
        int i8;
        int i9;
        int i10;
        int i11;
        Bitmap bitmap2;
        float f10;
        float f11;
        String str;
        float totalProgressPercent;
        float iterationProgressPercent;
        float f12;
        float f13;
        Canvas canvas3 = canvas;
        super.onDraw(canvas);
        okj0 okj0Var = this.H;
        Matrix matrix3 = okj0Var.y;
        Paint paint = okj0Var.c;
        RectF rectF = okj0Var.m0;
        int i12 = okj0.z0;
        float f14 = okj0Var.n0;
        float f15 = okj0Var.H;
        float f16 = okj0Var.J;
        float f17 = okj0Var.K;
        float f18 = okj0Var.s0;
        float f19 = 2;
        float f20 = (((f16 - f17) / f19) * f18) + (((f15 * f18) + ((1.0f - f18) * f14)) - (f16 / f19));
        float f21 = okj0Var.o0;
        float f22 = okj0Var.I;
        float f23 = okj0Var.L;
        float f24 = okj0Var.M;
        float f25 = 1.0f - f18;
        rectF.set(f20, (((f23 - f24) / 2.0f) * f18) + (((f22 * f18) + (f25 * f21)) - (f23 / 2.0f)), ((f16 / f19) + ((f15 * f18) + (f25 * f14))) - (((f16 - f17) / f19) * f18), ((f23 / 2.0f) + ((f22 * f18) + ((1.0f - f18) * f21))) - (((f23 - f24) / 2.0f) * f18));
        float f26 = okj0Var.n0;
        float f27 = okj0Var.s0;
        float f28 = 1.0f - f27;
        okj0Var.E = (okj0Var.H * f27) + (f26 * f28);
        okj0Var.F = (okj0Var.I * f27) + (f28 * okj0Var.o0);
        float f29 = okj0Var.L;
        okj0Var.D = (((okj0Var.M - f29) / 2.0f) * f27) + (f29 / 2.0f);
        rectF.width();
        okj0Var.G = rectF.height();
        ShutterButton shutterButton = okj0Var.a;
        float scalePressFactor = shutterButton.getScalePressFactor() + shutterButton.getScaleBounceFactor() + 1.0f;
        int save = canvas3.save();
        canvas3.scale(scalePressFactor, scalePressFactor, okj0Var.E, okj0Var.F);
        boolean z2 = okj0Var.u0;
        boolean z3 = z2 || okj0Var.v0;
        boolean z4 = !z2 || okj0Var.v0;
        if (z3) {
            int save2 = canvas3.save();
            if (okj0Var.v0) {
                float f30 = okj0Var.w0;
                canvas3.scale(f30, f30, okj0Var.E, okj0Var.F);
            }
            canvas3.drawCircle(okj0Var.E, okj0Var.F, okj0Var.D, okj0Var.k);
            float strokeWidth = (paint.getStrokeWidth() * 0.5f) + okj0Var.D + okj0Var.m;
            float a2 = xwk.a(okj0Var.x0 * 360.0f, okj0Var.n, okj0Var.o);
            float f31 = okj0Var.E;
            float f32 = okj0Var.F;
            f = f19;
            matrix = matrix3;
            canvas3.drawArc(f31 - strokeWidth, f32 - strokeWidth, f31 + strokeWidth, f32 + strokeWidth, okj0Var.y0, a2, false, okj0Var.l);
            okj0Var.y0 += 1.0f;
            shutterButton.invalidate();
            canvas3.restoreToCount(save2);
        } else {
            f = f19;
            matrix = matrix3;
        }
        if (z4) {
            int save3 = canvas3.save();
            if (okj0Var.v0) {
                float f33 = 1.0f - okj0Var.w0;
                canvas3.scale(f33, f33, okj0Var.E, okj0Var.F);
            }
            Matrix matrix4 = okj0Var.v;
            Paint paint2 = okj0Var.d;
            RectF rectF2 = okj0Var.p;
            Paint paint3 = okj0Var.b;
            int save4 = canvas3.save();
            if (okj0Var.B || okj0Var.C) {
                okj0Var.a(canvas3);
                boolean z5 = okj0Var.B;
                if (z5 && okj0Var.C) {
                    f2 = 1.0f;
                } else if (z5) {
                    float f34 = okj0Var.s0 - 0.5f;
                    if (f34 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f34 = 0.0f;
                    }
                    f2 = f34 * f;
                } else {
                    if (okj0Var.C) {
                        f2 = 1.0f - (okj0Var.s0 * f);
                    }
                    f2 = 0.0f;
                }
                paint3.setAlpha((int) (f2 * 255.0f));
                paint3.setColor(l8g.a(okj0Var.s0, okj0Var.N, okj0Var.O));
                float f35 = okj0.D0;
                paint3.setStrokeWidth(f35 * f2);
                float f36 = ((f35 / f) + okj0.E0) * f2;
                rectF2.set(rectF.left - f36, rectF.top - f36, rectF.right + f36, rectF.bottom + f36);
                float f37 = okj0Var.D + f36;
                canvas3.drawRoundRect(rectF2, f37, f37, paint3);
                if (okj0Var.p0 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    paint.setAlpha((int) (okj0Var.r0 * 255.0f));
                    if (okj0Var.k0) {
                        float f38 = okj0Var.p0 - ((int) r2);
                        if (0.66f <= f38 && f38 <= 1.0f) {
                            paint2.setAlpha(StrictMath.min(255, (int) (((f38 - 0.66f) / 0.33999997f) * 255.0f)));
                            f3 = 0.0f;
                            canvas3.drawArc(rectF2, 180.0f, 90.0f, false, paint2);
                            z = okj0Var.k0;
                            float f39 = -90.0f;
                            if (z) {
                                float f40 = okj0Var.p0;
                                if (f40 > 0.33f) {
                                    f4 = 360.0f;
                                    f39 = u11.b(f40, 0.33f, 360.0f, -90.0f);
                                    f5 = 118.8f;
                                    if (z || (shader = paint.getShader()) == null) {
                                        f6 = f39;
                                    } else {
                                        f6 = f39;
                                        matrix4.setRotate(((f6 + f5) - ((f35 / ((float) (okj0Var.D * 6.283185307179586d))) * f4)) - 118.8f, okj0Var.n0, okj0Var.o0);
                                        shader.setLocalMatrix(matrix4);
                                    }
                                    canvas3 = canvas;
                                    canvas3.drawArc(rectF2, f6, f5, false, paint);
                                }
                            }
                            f4 = 360.0f;
                            f5 = okj0Var.p0 * 360.0f;
                            if (z) {
                            }
                            f6 = f39;
                            canvas3 = canvas;
                            canvas3.drawArc(rectF2, f6, f5, false, paint);
                        }
                    }
                    f3 = 0.0f;
                    z = okj0Var.k0;
                    float f392 = -90.0f;
                    if (z) {
                    }
                    f4 = 360.0f;
                    f5 = okj0Var.p0 * 360.0f;
                    if (z) {
                    }
                    f6 = f392;
                    canvas3 = canvas;
                    canvas3.drawArc(rectF2, f6, f5, false, paint);
                } else {
                    f3 = 0.0f;
                }
                canvas2 = canvas3;
                canvas2.restoreToCount(save4);
            } else {
                canvas2 = canvas3;
                f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            Matrix matrix5 = okj0Var.x;
            Paint paint4 = okj0Var.e;
            int save5 = canvas2.save();
            boolean z6 = okj0Var.P;
            if (z6 || okj0Var.Q) {
                matrix5.setTranslate((z6 && okj0Var.Q) ? -canvas2.getWidth() : z6 ? -((canvas2.getWidth() * okj0Var.s0) + canvas2.getWidth()) : okj0Var.Q ? okj0Var.s0 * (-canvas2.getWidth()) : f3, f3);
                okj0Var.w.setLocalMatrix(matrix5);
                paint4.setShader(okj0Var.w);
            } else {
                paint4.setShader(null);
            }
            int i13 = okj0Var.U;
            int i14 = okj0Var.T;
            float f41 = okj0Var.s0;
            paint4.setColor(l8g.g(l8g.a(f41, okj0Var.R, okj0Var.S), (int) ((((i13 - i14) * f41) + i14) * okj0Var.l0)));
            okj0Var.a(canvas2);
            float f42 = okj0Var.D;
            canvas2.drawRoundRect(rectF, f42, f42, paint4);
            canvas2.restoreToCount(save5);
            Paint paint5 = okj0Var.f;
            int save6 = canvas2.save();
            Bitmap bitmap3 = okj0Var.W;
            if (bitmap3 == null) {
                i6 = 3;
                i7 = 5;
                i2 = save;
                matrix2 = matrix;
                i4 = 0;
                i5 = 1;
            } else {
                float height = bitmap3.getHeight();
                float width = bitmap3.getWidth();
                float f43 = okj0Var.s0;
                float f44 = (f43 * 0.5f) + 1.0f;
                if (okj0Var.V) {
                    bitmap = bitmap3;
                    f7 = f43;
                    matrix2 = matrix;
                    i2 = save;
                    i3 = 20;
                    matrix2.setPolyToPoly(okj0.a.a(width, height, 1.0f), 0, okj0.a.a(width, height, 1.0f - okj0Var.s0), 0, 4);
                    matrix2.postTranslate(((okj0Var.G / f) + rectF.left) - (width / f), okj0Var.F - (height / f));
                    f8 = 2.0f;
                } else {
                    bitmap = bitmap3;
                    f7 = f43;
                    i2 = save;
                    matrix2 = matrix;
                    i3 = 20;
                    matrix2.setPolyToPoly(okj0.a.a(width, height, 1.0f), 0, okj0.a.b(width, height, okj0Var.s0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), 0, 4);
                    float f45 = rectF.left;
                    float f46 = okj0Var.G / f;
                    float f47 = width / f;
                    matrix2.postTranslate(((f45 + f46) - f47) - ((f46 - f47) * okj0Var.s0), okj0Var.F - (height / f));
                    f8 = 1.0f;
                }
                okj0Var.a(canvas2);
                float[] fArr = new float[i3];
                i4 = 0;
                fArr[0] = f44;
                i5 = 1;
                fArr[1] = 0.0f;
                fArr[2] = 0.0f;
                i6 = 3;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                i7 = 5;
                fArr[5] = 0.0f;
                fArr[6] = f44;
                fArr[7] = 0.0f;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = 0.0f;
                fArr[11] = 0.0f;
                fArr[12] = f44;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                fArr[18] = 1.0f - (f7 * f8);
                fArr[19] = 0.0f;
                paint5.setColorFilter(new ColorMatrixColorFilter(fArr));
                paint5.setAlpha((int) (255 * okj0Var.l0));
                canvas2.drawBitmap(bitmap, matrix2, paint5);
                canvas2.restoreToCount(save6);
            }
            Paint paint6 = okj0Var.g;
            int save7 = canvas2.save();
            Bitmap bitmap4 = okj0Var.X;
            if (bitmap4 == null) {
                i8 = save3;
                i9 = i4;
                i10 = i5;
                i11 = i7;
                f10 = 2.0f;
            } else {
                float height2 = bitmap4.getHeight();
                float width2 = bitmap4.getWidth();
                float f48 = okj0Var.s0;
                float f49 = (f48 * 0.5f) + 0.5f;
                if (okj0Var.V) {
                    i9 = i4;
                    bitmap2 = bitmap4;
                    f9 = f48;
                    i8 = save3;
                    i10 = i5;
                    i11 = i7;
                    matrix2.setPolyToPoly(okj0.a.a(width2, height2, 1.0f), 0, okj0.a.a(width2, height2, okj0Var.s0), 0, 4);
                    matrix2.postTranslate(((okj0Var.G / f) + rectF.left) - (width2 / f), okj0Var.F - (height2 / f));
                    f10 = 2.0f;
                } else {
                    f9 = f48;
                    i8 = save3;
                    i9 = i4;
                    i10 = i5;
                    i11 = i7;
                    bitmap2 = bitmap4;
                    matrix2.setPolyToPoly(okj0.a.a(width2, height2, 1.0f), 0, okj0.a.b(width2, height2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f - okj0Var.s0), 0, 4);
                    float f50 = rectF.right;
                    float f51 = okj0Var.G;
                    f10 = 2.0f;
                    matrix2.postTranslate(u11.b(1.0f, okj0Var.s0, wq.a(f51, width2, 2.0f, width2), (f50 - (f51 / f)) - (width2 / 2.0f)), okj0Var.F - (height2 / f));
                }
                okj0Var.a(canvas2);
                float[] fArr2 = new float[20];
                fArr2[i9] = f49;
                fArr2[i10] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[i6] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[i11] = 0.0f;
                fArr2[6] = f49;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = f49;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                fArr2[18] = f9;
                fArr2[19] = 0.0f;
                paint6.setColorFilter(new ColorMatrixColorFilter(fArr2));
                paint6.setAlpha((int) (255 * okj0Var.l0));
                canvas2.drawBitmap(bitmap2, matrix2, paint6);
                canvas2.restoreToCount(save7);
            }
            TextPaint textPaint = okj0Var.h;
            int save8 = canvas2.save();
            String str2 = okj0Var.Y;
            Typeface typeface = T;
            if (str2 != null) {
                float f52 = okj0Var.s0;
                if (f52 <= 0.2f) {
                    textPaint.setAlpha((int) ((0.2f - f52) * 255.0f * i11));
                    textPaint.setColor(okj0Var.c0);
                    Typeface typeface2 = okj0Var.e0;
                    if (typeface2 == null) {
                        typeface2 = typeface;
                    }
                    textPaint.setTypeface(typeface2);
                    if (okj0Var.a0 == i10) {
                        f13 = okj0Var.i0.left + rectF.left;
                    } else {
                        float f53 = okj0Var.E;
                        Rect rect = okj0Var.g0;
                        f13 = f53 - ((rect.right - rect.left) / f10);
                    }
                    float f54 = f13;
                    okj0Var.a(canvas2);
                    f11 = f10;
                    canvas3 = canvas2;
                    canvas3.drawText(str2, 0, str2.length(), f54, okj0Var.F - (okj0Var.g0.top / 2), (Paint) textPaint);
                    canvas3.restoreToCount(save8);
                    TextPaint textPaint2 = okj0Var.i;
                    int save9 = canvas3.save();
                    str = okj0Var.Z;
                    if (str != null) {
                        float f55 = okj0Var.s0;
                        if (f55 >= 0.8f) {
                            textPaint2.setAlpha((int) ((f55 - 0.8f) * 255.0f * i11));
                            textPaint2.setColor(okj0Var.d0);
                            Typeface typeface3 = okj0Var.f0;
                            if (typeface3 != null) {
                                typeface = typeface3;
                            }
                            textPaint2.setTypeface(typeface);
                            if (okj0Var.b0 == 1) {
                                f12 = okj0Var.j0.left + rectF.left;
                            } else {
                                float f56 = okj0Var.E;
                                Rect rect2 = okj0Var.h0;
                                f12 = f56 - (((rect2.right - rect2.left) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / f11);
                            }
                            float f57 = f12;
                            okj0Var.a(canvas3);
                            canvas3.drawText(str, 0, str.length(), f57, okj0Var.F - (okj0Var.h0.top / 2), (Paint) textPaint2);
                            canvas3.restoreToCount(save9);
                        }
                    }
                    RectF rectF3 = okj0Var.q;
                    Paint paint7 = okj0Var.j;
                    if (!okj0Var.z || okj0Var.A) {
                        if (shutterButton.D == null) {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                            ofFloat.setDuration(4400L);
                            ofFloat.setRepeatCount(-1);
                            ofFloat.addUpdateListener(new gn10(shutterButton, 1));
                            ofFloat.addListener(new nkj0(shutterButton));
                            ofFloat.start();
                            shutterButton.D = ofFloat;
                        }
                        if (shutterButton.getForwardDirection()) {
                            totalProgressPercent = shutterButton.getTotalProgressPercent() * 360 * i6;
                            iterationProgressPercent = (1.0f - shutterButton.getIterationProgressPercent()) * 360.0f;
                        } else {
                            totalProgressPercent = shutterButton.getTotalProgressPercent() * 360 * i6;
                            iterationProgressPercent = shutterButton.getIterationProgressPercent() * 360.0f;
                        }
                        boolean z7 = okj0Var.z;
                        float f58 = (z7 || !okj0Var.A) ? !z7 ? 1.0f - okj0Var.s0 : okj0Var.A ? okj0Var.s0 : 0.0f : 1.0f;
                        paint7.setAlpha((int) (f58 * 255.0f));
                        float f59 = okj0Var.E;
                        float f60 = R * f58;
                        float f61 = okj0Var.F;
                        rectF3.set(f59 - f60, f61 - f60, f59 + f60, f60 + f61);
                        canvas3.drawArc(rectF3, totalProgressPercent, iterationProgressPercent, false, paint7);
                    } else {
                        ValueAnimator valueAnimator = shutterButton.D;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                            valueAnimator.removeAllUpdateListeners();
                            valueAnimator.removeAllListeners();
                        }
                        shutterButton.D = null;
                        shutterButton.A = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        shutterButton.B = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        shutterButton.C = i9;
                        shutterButton.G = true;
                    }
                    canvas3.restoreToCount(i8);
                    i = i2;
                }
            }
            f11 = f10;
            canvas3 = canvas2;
            TextPaint textPaint22 = okj0Var.i;
            int save92 = canvas3.save();
            str = okj0Var.Z;
            if (str != null) {
            }
            RectF rectF32 = okj0Var.q;
            Paint paint72 = okj0Var.j;
            if (okj0Var.z) {
            }
            if (shutterButton.D == null) {
            }
            if (shutterButton.getForwardDirection()) {
            }
            boolean z72 = okj0Var.z;
            if (z72) {
            }
            paint72.setAlpha((int) (f58 * 255.0f));
            float f592 = okj0Var.E;
            float f602 = R * f58;
            float f612 = okj0Var.F;
            rectF32.set(f592 - f602, f612 - f602, f592 + f602, f602 + f612);
            canvas3.drawArc(rectF32, totalProgressPercent, iterationProgressPercent, false, paint72);
            canvas3.restoreToCount(i8);
            i = i2;
        } else {
            i = save;
        }
        canvas3.restoreToCount(i);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null) {
            return false;
        }
        float y = motionEvent2.getY() - motionEvent.getY();
        float x = motionEvent2.getX() - motionEvent.getX();
        if (!this.w) {
            return true;
        }
        Math.abs(x);
        Math.abs(y);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            okj0 okj0Var = this.H;
            RectF rectF = okj0Var.m0;
            float f = rectF.left;
            float f2 = S;
            float f3 = f - f2;
            float f4 = rectF.right + f2;
            float x = motionEvent.getX();
            if (f3 <= x && x <= f4) {
                RectF rectF2 = okj0Var.m0;
                float f5 = rectF2.top - f2;
                float f6 = rectF2.bottom + f2;
                float y = motionEvent.getY();
                if (f5 <= y && y <= f6 && this.e == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    this.p = true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getWidth() != 0) {
            okj0 okj0Var = this.H;
            okj0Var.getClass();
            if (i != i3) {
                int i5 = okj0.A0;
                int i6 = okj0.F0;
                int i7 = okj0.G0;
                okj0Var.w = new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i * 3.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new int[]{i5, i5, i5, i6, i6, i7, i7, i5, i5, i5}, (float[]) null, Shader.TileMode.CLAMP);
            }
            c();
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return this.p;
    }

    public final void setAScale(ValueAnimator valueAnimator) {
        this.x = valueAnimator;
    }

    public final void setAlphaFactor(float f) {
        this.H.l0 = f;
    }

    public final void setCanceledTouch(boolean z) {
        a aVar;
        this.u = z;
        if (!z || z || (aVar = this.f) == null) {
            return;
        }
        aVar.j();
    }

    public final void setClickListener(a aVar) {
        this.f = aVar;
    }

    public final void setDelta(float f) {
        this.e = f;
        this.H.s0 = f;
    }

    public final void setEndless(boolean z) {
        this.K = z;
        this.H.k0 = z;
    }

    public final void setExternalDownListener(b bVar) {
        this.h = bVar;
    }

    public final void setExternalTouchListener(View.OnTouchListener onTouchListener) {
        this.g = onTouchListener;
    }

    public final void setForwardDirection(boolean z) {
        this.G = z;
    }

    public final void setHorizontal(boolean z) {
        this.H.t0 = z;
    }

    public final void setItems(List<d> list) {
        this.b = list;
    }

    public final void setIterationProgressPercent(float f) {
        this.A = f;
    }

    public final void setLoading(boolean z) {
        this.H.u0 = z;
    }

    public final void setLoadingProgress(float f) {
        this.H.x0 = f;
    }

    public final void setPosCur(int i) {
        this.c = i;
    }

    public final void setPosNext(int i) {
        this.d = i;
    }

    public final void setProgressListener(e eVar) {
        this.J = eVar;
    }

    public final void setScaleBounceFactor(float f) {
        this.y = f;
    }

    public final void setScalePressFactor(float f) {
        this.z = f;
    }

    public final void setTotalProgressPercent(float f) {
        this.B = f;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void setHorizontalScrollListener(c cVar) {
    }
}

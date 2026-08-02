package Ic;

import Ic.AbstractC1350d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t extends AbstractC1350d {

    /* renamed from: l0, reason: collision with root package name */
    public static final a f5652l0 = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public float f5653I;

    /* renamed from: J, reason: collision with root package name */
    public float f5654J;

    /* renamed from: K, reason: collision with root package name */
    public final float f5655K;

    /* renamed from: L, reason: collision with root package name */
    public float f5656L;

    /* renamed from: Z, reason: collision with root package name */
    public float f5670Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f5671a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f5672b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f5673c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f5674d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f5675e0;

    /* renamed from: f0, reason: collision with root package name */
    public VelocityTracker f5676f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f5677g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f5678h0;

    /* renamed from: j0, reason: collision with root package name */
    public Handler f5680j0;

    /* renamed from: M, reason: collision with root package name */
    public float f5657M = Float.MAX_VALUE;

    /* renamed from: N, reason: collision with root package name */
    public float f5658N = Float.MIN_VALUE;

    /* renamed from: O, reason: collision with root package name */
    public float f5659O = Float.MIN_VALUE;

    /* renamed from: P, reason: collision with root package name */
    public float f5660P = Float.MAX_VALUE;

    /* renamed from: Q, reason: collision with root package name */
    public float f5661Q = Float.MAX_VALUE;

    /* renamed from: R, reason: collision with root package name */
    public float f5662R = Float.MIN_VALUE;

    /* renamed from: S, reason: collision with root package name */
    public float f5663S = Float.MIN_VALUE;

    /* renamed from: T, reason: collision with root package name */
    public float f5664T = Float.MAX_VALUE;

    /* renamed from: U, reason: collision with root package name */
    public float f5665U = Float.MAX_VALUE;

    /* renamed from: V, reason: collision with root package name */
    public float f5666V = Float.MAX_VALUE;

    /* renamed from: W, reason: collision with root package name */
    public float f5667W = Float.MAX_VALUE;

    /* renamed from: X, reason: collision with root package name */
    public int f5668X = 1;

    /* renamed from: Y, reason: collision with root package name */
    public int f5669Y = 10;

    /* renamed from: i0, reason: collision with root package name */
    public final Runnable f5679i0 = new Runnable() { // from class: Ic.s
        @Override // java.lang.Runnable
        public final void run() {
            t.l1(t.this);
        }
    };

    /* renamed from: k0, reason: collision with root package name */
    public z f5681k0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void b(VelocityTracker velocityTracker, MotionEvent motionEvent) {
            float rawX = motionEvent.getRawX() - motionEvent.getX();
            float rawY = motionEvent.getRawY() - motionEvent.getY();
            motionEvent.offsetLocation(rawX, rawY);
            Intrinsics.checkNotNull(velocityTracker);
            velocityTracker.addMovement(motionEvent);
            motionEvent.offsetLocation(-rawX, -rawY);
        }

        public a() {
        }
    }

    public static final class b extends AbstractC1350d.c {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5682d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final Class f5683b = t.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5684c = "PanGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5684c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5683b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t a(Context context) {
            return new t(context);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.g c(t handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.g(handler);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(t handler, ReadableMap config) {
            boolean z10;
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            boolean z11 = true;
            if (config.hasKey("activeOffsetXStart")) {
                handler.f5657M = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXStart"));
                z10 = true;
            } else {
                z10 = false;
            }
            if (config.hasKey("activeOffsetXEnd")) {
                handler.f5658N = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXStart")) {
                handler.f5659O = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetXEnd")) {
                handler.f5660P = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetXEnd"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYStart")) {
                handler.f5661Q = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("activeOffsetYEnd")) {
                handler.f5662R = PixelUtil.toPixelFromDIP(config.getDouble("activeOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYStart")) {
                handler.f5663S = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYStart"));
                z10 = true;
            }
            if (config.hasKey("failOffsetYEnd")) {
                handler.f5664T = PixelUtil.toPixelFromDIP(config.getDouble("failOffsetYEnd"));
                z10 = true;
            }
            if (config.hasKey("minVelocity")) {
                handler.f5667W = PixelUtil.toPixelFromDIP(config.getDouble("minVelocity"));
                z10 = true;
            }
            if (config.hasKey("minVelocityX")) {
                handler.f5665U = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityX"));
                z10 = true;
            }
            if (config.hasKey("minVelocityY")) {
                handler.f5666V = PixelUtil.toPixelFromDIP(config.getDouble("minVelocityY"));
            } else {
                z11 = z10;
            }
            if (config.hasKey("minDist")) {
                handler.f5656L = PixelUtil.toPixelFromDIP(config.getDouble("minDist"));
            } else if (z11) {
                handler.f5656L = Float.MAX_VALUE;
            }
            if (config.hasKey("minPointers")) {
                handler.f5668X = config.getInt("minPointers");
            }
            if (config.hasKey("maxPointers")) {
                handler.f5669Y = config.getInt("maxPointers");
            }
            if (config.hasKey("avgTouches")) {
                handler.f5677g0 = config.getBoolean("avgTouches");
            }
            if (config.hasKey("activateAfterLongPress")) {
                handler.f5678h0 = config.getInt("activateAfterLongPress");
            }
        }
    }

    public t(Context context) {
        this.f5656L = Float.MIN_VALUE;
        Intrinsics.checkNotNull(context);
        float scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f5655K = scaledTouchSlop;
        this.f5656L = scaledTouchSlop;
    }

    public static final void l1(t tVar) {
        tVar.k();
    }

    @Override // Ic.AbstractC1350d
    public void j0() {
        Handler handler = this.f5680j0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ic.AbstractC1350d
    public void l(boolean z10) {
        if (S() != 4) {
            t0();
        }
        super.l(z10);
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            if (event.getToolType(0) == 2) {
                this.f5681k0 = z.f5745f.a(event);
            }
            int S10 = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (actionMasked == 5 || actionMasked == 6) {
                this.f5672b0 += this.f5674d0 - this.f5670Z;
                this.f5673c0 += this.f5675e0 - this.f5671a0;
                k kVar = k.f5610a;
                this.f5674d0 = kVar.b(sourceEvent, this.f5677g0);
                float c10 = kVar.c(sourceEvent, this.f5677g0);
                this.f5675e0 = c10;
                this.f5670Z = this.f5674d0;
                this.f5671a0 = c10;
            } else {
                k kVar2 = k.f5610a;
                this.f5674d0 = kVar2.b(sourceEvent, this.f5677g0);
                this.f5675e0 = kVar2.c(sourceEvent, this.f5677g0);
            }
            if (S10 != 0 || sourceEvent.getPointerCount() < this.f5668X) {
                VelocityTracker velocityTracker = this.f5676f0;
                if (velocityTracker != null) {
                    f5652l0.b(velocityTracker, sourceEvent);
                    VelocityTracker velocityTracker2 = this.f5676f0;
                    Intrinsics.checkNotNull(velocityTracker2);
                    velocityTracker2.computeCurrentVelocity(1000);
                    VelocityTracker velocityTracker3 = this.f5676f0;
                    Intrinsics.checkNotNull(velocityTracker3);
                    this.f5653I = velocityTracker3.getXVelocity();
                    VelocityTracker velocityTracker4 = this.f5676f0;
                    Intrinsics.checkNotNull(velocityTracker4);
                    this.f5654J = velocityTracker4.getYVelocity();
                }
            } else {
                t0();
                this.f5672b0 = 0.0f;
                this.f5673c0 = 0.0f;
                this.f5653I = 0.0f;
                this.f5654J = 0.0f;
                VelocityTracker obtain = VelocityTracker.obtain();
                this.f5676f0 = obtain;
                f5652l0.b(obtain, sourceEvent);
                p();
                if (this.f5678h0 > 0) {
                    if (this.f5680j0 == null) {
                        this.f5680j0 = new Handler(Looper.getMainLooper());
                    }
                    Handler handler = this.f5680j0;
                    Intrinsics.checkNotNull(handler);
                    handler.postDelayed(this.f5679i0, this.f5678h0);
                }
            }
            if (actionMasked == 1 || actionMasked == 12) {
                if (S10 == 4) {
                    B();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 5 && sourceEvent.getPointerCount() > this.f5669Y) {
                if (S10 == 4) {
                    q();
                    return;
                } else {
                    D();
                    return;
                }
            }
            if (actionMasked == 6 && S10 == 4 && sourceEvent.getPointerCount() < this.f5668X) {
                D();
                return;
            }
            if (S10 == 2) {
                if (s1()) {
                    D();
                } else if (r1()) {
                    k();
                }
            }
        }
    }

    public final z m1() {
        return this.f5681k0;
    }

    public final float n1() {
        return (this.f5674d0 - this.f5670Z) + this.f5672b0;
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        Handler handler = this.f5680j0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        VelocityTracker velocityTracker = this.f5676f0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5676f0 = null;
        }
        this.f5681k0 = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public final float o1() {
        return (this.f5675e0 - this.f5671a0) + this.f5673c0;
    }

    public final float p1() {
        return this.f5653I;
    }

    public final float q1() {
        return this.f5654J;
    }

    public final boolean r1() {
        float f10 = (this.f5674d0 - this.f5670Z) + this.f5672b0;
        float f11 = this.f5657M;
        if (f11 != Float.MAX_VALUE && f10 < f11) {
            return true;
        }
        float f12 = this.f5658N;
        if (f12 != Float.MIN_VALUE && f10 > f12) {
            return true;
        }
        float f13 = (this.f5675e0 - this.f5671a0) + this.f5673c0;
        float f14 = this.f5661Q;
        if (f14 != Float.MAX_VALUE && f13 < f14) {
            return true;
        }
        float f15 = this.f5662R;
        if (f15 != Float.MIN_VALUE && f13 > f15) {
            return true;
        }
        float f16 = (f10 * f10) + (f13 * f13);
        float f17 = this.f5656L;
        if (f17 != Float.MAX_VALUE && f16 >= f17 * f17) {
            return true;
        }
        float f18 = this.f5653I;
        float f19 = this.f5665U;
        if (f19 != Float.MAX_VALUE && ((f19 < 0.0f && f18 <= f19) || (0.0f <= f19 && f19 <= f18))) {
            return true;
        }
        float f20 = this.f5654J;
        float f21 = this.f5666V;
        if (f21 != Float.MAX_VALUE && ((f21 < 0.0f && f18 <= f21) || (0.0f <= f21 && f21 <= f18))) {
            return true;
        }
        float f22 = (f18 * f18) + (f20 * f20);
        float f23 = this.f5667W;
        return f23 != Float.MAX_VALUE && f22 >= f23 * f23;
    }

    @Override // Ic.AbstractC1350d
    public void s0() {
        super.s0();
        this.f5657M = Float.MAX_VALUE;
        this.f5658N = Float.MIN_VALUE;
        this.f5659O = Float.MIN_VALUE;
        this.f5660P = Float.MAX_VALUE;
        this.f5661Q = Float.MAX_VALUE;
        this.f5662R = Float.MIN_VALUE;
        this.f5663S = Float.MIN_VALUE;
        this.f5664T = Float.MAX_VALUE;
        this.f5665U = Float.MAX_VALUE;
        this.f5666V = Float.MAX_VALUE;
        this.f5667W = Float.MAX_VALUE;
        this.f5656L = this.f5655K;
        this.f5668X = 1;
        this.f5669Y = 10;
        this.f5678h0 = 0L;
        this.f5677g0 = false;
    }

    public final boolean s1() {
        float f10 = (this.f5674d0 - this.f5670Z) + this.f5672b0;
        float f11 = (this.f5675e0 - this.f5671a0) + this.f5673c0;
        if (this.f5678h0 > 0) {
            float f12 = (f10 * f10) + (f11 * f11);
            float f13 = this.f5655K;
            if (f12 > f13 * f13) {
                Handler handler = this.f5680j0;
                if (handler != null) {
                    handler.removeCallbacksAndMessages(null);
                }
                return true;
            }
        }
        float f14 = this.f5659O;
        if (f14 != Float.MIN_VALUE && f10 < f14) {
            return true;
        }
        float f15 = this.f5660P;
        if (f15 != Float.MAX_VALUE && f10 > f15) {
            return true;
        }
        float f16 = this.f5663S;
        if (f16 != Float.MIN_VALUE && f11 < f16) {
            return true;
        }
        float f17 = this.f5664T;
        return f17 != Float.MAX_VALUE && f11 > f17;
    }

    @Override // Ic.AbstractC1350d
    public void t0() {
        this.f5670Z = this.f5674d0;
        this.f5671a0 = this.f5675e0;
    }
}

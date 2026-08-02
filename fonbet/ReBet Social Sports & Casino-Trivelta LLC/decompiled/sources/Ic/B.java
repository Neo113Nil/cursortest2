package Ic;

import Ic.AbstractC1350d;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class B extends AbstractC1350d {

    /* renamed from: Z, reason: collision with root package name */
    public static final a f5500Z = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    public float f5509Q;

    /* renamed from: R, reason: collision with root package name */
    public float f5510R;

    /* renamed from: S, reason: collision with root package name */
    public float f5511S;

    /* renamed from: T, reason: collision with root package name */
    public float f5512T;

    /* renamed from: U, reason: collision with root package name */
    public float f5513U;

    /* renamed from: V, reason: collision with root package name */
    public float f5514V;

    /* renamed from: W, reason: collision with root package name */
    public Handler f5515W;

    /* renamed from: X, reason: collision with root package name */
    public int f5516X;

    /* renamed from: I, reason: collision with root package name */
    public float f5501I = Float.MIN_VALUE;

    /* renamed from: J, reason: collision with root package name */
    public float f5502J = Float.MIN_VALUE;

    /* renamed from: K, reason: collision with root package name */
    public float f5503K = Float.MIN_VALUE;

    /* renamed from: L, reason: collision with root package name */
    public long f5504L = 500;

    /* renamed from: M, reason: collision with root package name */
    public long f5505M = 200;

    /* renamed from: N, reason: collision with root package name */
    public int f5506N = 1;

    /* renamed from: O, reason: collision with root package name */
    public int f5507O = 1;

    /* renamed from: P, reason: collision with root package name */
    public int f5508P = 1;

    /* renamed from: Y, reason: collision with root package name */
    public final Runnable f5517Y = new Runnable() { // from class: Ic.A
        @Override // java.lang.Runnable
        public final void run() {
            B.d1(B.this);
        }
    };

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends AbstractC1350d.c {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5518d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final Class f5519b = B.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5520c = "TapGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5520c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5519b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public B a(Context context) {
            return new B();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.j c(B handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.j(handler);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(B handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("numberOfTaps")) {
                handler.f5506N = config.getInt("numberOfTaps");
            }
            if (config.hasKey("maxDurationMs")) {
                handler.f5504L = config.getInt("maxDurationMs");
            }
            if (config.hasKey("maxDelayMs")) {
                handler.f5505M = config.getInt("maxDelayMs");
            }
            if (config.hasKey("maxDeltaX")) {
                handler.f5501I = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaX"));
            }
            if (config.hasKey("maxDeltaY")) {
                handler.f5502J = PixelUtil.toPixelFromDIP(config.getDouble("maxDeltaY"));
            }
            if (config.hasKey("maxDist")) {
                handler.f5503K = PixelUtil.toPixelFromDIP(config.getDouble("maxDist"));
            }
            if (config.hasKey("minPointers")) {
                handler.f5507O = config.getInt("minPointers");
            }
        }
    }

    public B() {
        G0(true);
    }

    public static final void d1(B b10) {
        b10.D();
    }

    private final boolean e1() {
        float f10 = (this.f5513U - this.f5509Q) + this.f5511S;
        if (this.f5501I != Float.MIN_VALUE && Math.abs(f10) > this.f5501I) {
            return true;
        }
        float f11 = (this.f5514V - this.f5510R) + this.f5512T;
        if (this.f5502J != Float.MIN_VALUE && Math.abs(f11) > this.f5502J) {
            return true;
        }
        float f12 = (f11 * f11) + (f10 * f10);
        float f13 = this.f5503K;
        return f13 != Float.MIN_VALUE && f12 > f13 * f13;
    }

    public final void c1() {
        Handler handler = this.f5515W;
        if (handler == null) {
            this.f5515W = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        int i10 = this.f5516X + 1;
        this.f5516X = i10;
        if (i10 == this.f5506N && this.f5508P >= this.f5507O) {
            k();
            return;
        }
        Handler handler2 = this.f5515W;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.f5517Y, this.f5505M);
    }

    public final void f1() {
        Handler handler = this.f5515W;
        if (handler == null) {
            this.f5515W = new Handler(Looper.getMainLooper());
        } else {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = this.f5515W;
        Intrinsics.checkNotNull(handler2);
        handler2.postDelayed(this.f5517Y, this.f5504L);
    }

    @Override // Ic.AbstractC1350d
    public void j0() {
        Handler handler = this.f5515W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ic.AbstractC1350d
    public void l(boolean z10) {
        super.l(z10);
        B();
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (J0(sourceEvent)) {
            int S10 = S();
            int actionMasked = sourceEvent.getActionMasked();
            if (S10 == 0) {
                this.f5511S = 0.0f;
                this.f5512T = 0.0f;
                k kVar = k.f5610a;
                this.f5509Q = kVar.b(sourceEvent, true);
                this.f5510R = kVar.c(sourceEvent, true);
            }
            if (actionMasked == 5 || actionMasked == 6) {
                this.f5511S += this.f5513U - this.f5509Q;
                this.f5512T += this.f5514V - this.f5510R;
                k kVar2 = k.f5610a;
                this.f5513U = kVar2.b(sourceEvent, true);
                float c10 = kVar2.c(sourceEvent, true);
                this.f5514V = c10;
                this.f5509Q = this.f5513U;
                this.f5510R = c10;
            } else {
                k kVar3 = k.f5610a;
                this.f5513U = kVar3.b(sourceEvent, true);
                this.f5514V = kVar3.c(sourceEvent, true);
            }
            if (this.f5508P < sourceEvent.getPointerCount()) {
                this.f5508P = sourceEvent.getPointerCount();
            }
            if (e1()) {
                D();
                return;
            }
            if (S10 == 0) {
                if (actionMasked == 0 || actionMasked == 11) {
                    p();
                }
                f1();
                return;
            }
            if (S10 == 2) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 11) {
                            if (actionMasked != 12) {
                                return;
                            }
                        }
                    }
                    c1();
                    return;
                }
                f1();
            }
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        this.f5516X = 0;
        this.f5508P = 0;
        Handler handler = this.f5515W;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // Ic.AbstractC1350d
    public void s0() {
        super.s0();
        this.f5501I = Float.MIN_VALUE;
        this.f5502J = Float.MIN_VALUE;
        this.f5503K = Float.MIN_VALUE;
        this.f5504L = 500L;
        this.f5505M = 200L;
        this.f5506N = 1;
        this.f5507O = 1;
        G0(true);
    }
}

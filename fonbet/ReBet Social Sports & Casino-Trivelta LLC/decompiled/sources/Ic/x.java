package Ic;

import Ic.AbstractC1350d;
import Ic.w;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends AbstractC1350d {

    /* renamed from: O, reason: collision with root package name */
    public static final a f5710O = new a(null);

    /* renamed from: I, reason: collision with root package name */
    public w f5711I;

    /* renamed from: J, reason: collision with root package name */
    public double f5712J;

    /* renamed from: K, reason: collision with root package name */
    public double f5713K;

    /* renamed from: L, reason: collision with root package name */
    public float f5714L = Float.NaN;

    /* renamed from: M, reason: collision with root package name */
    public float f5715M = Float.NaN;

    /* renamed from: N, reason: collision with root package name */
    public final w.a f5716N = new c();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends AbstractC1350d.c {

        /* renamed from: b, reason: collision with root package name */
        public final Class f5717b = x.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5718c = "RotationGestureHandler";

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5718c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5717b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public x a(Context context) {
            return new x();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.i c(x handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.i(handler);
        }
    }

    public static final class c implements w.a {
        public c() {
        }

        @Override // Ic.w.a
        public boolean a(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double Y02 = x.this.Y0();
            x xVar = x.this;
            xVar.f5712J = xVar.Y0() + detector.d();
            long e10 = detector.e();
            if (e10 > 0) {
                x xVar2 = x.this;
                xVar2.f5713K = (xVar2.Y0() - Y02) / e10;
            }
            if (Math.abs(x.this.Y0()) < 0.08726646259971647d || x.this.S() != 2) {
                return true;
            }
            x.this.k();
            return true;
        }

        @Override // Ic.w.a
        public boolean b(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            return true;
        }

        @Override // Ic.w.a
        public void c(w detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            if (x.this.S() == 4) {
                x.this.B();
            } else {
                x.this.D();
            }
        }
    }

    public final float W0() {
        return this.f5714L;
    }

    public final float X0() {
        return this.f5715M;
    }

    public final double Y0() {
        return this.f5712J;
    }

    public final double Z0() {
        return this.f5713K;
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
        if (S() == 0) {
            t0();
            this.f5711I = new w(this.f5716N);
            this.f5714L = event.getX();
            this.f5715M = event.getY();
            p();
        }
        w wVar = this.f5711I;
        if (wVar != null) {
            wVar.f(sourceEvent);
        }
        w wVar2 = this.f5711I;
        if (wVar2 != null) {
            PointF Q02 = Q0(new PointF(wVar2.b(), wVar2.c()));
            this.f5714L = Q02.x;
            this.f5715M = Q02.y;
        }
        if (sourceEvent.getActionMasked() == 1 && S() == 2) {
            D();
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        this.f5711I = null;
        this.f5714L = Float.NaN;
        this.f5715M = Float.NaN;
        t0();
    }

    @Override // Ic.AbstractC1350d
    public void t0() {
        this.f5713K = 0.0d;
        this.f5712J = 0.0d;
    }
}

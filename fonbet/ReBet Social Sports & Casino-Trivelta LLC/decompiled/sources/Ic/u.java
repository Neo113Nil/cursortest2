package Ic;

import Ic.AbstractC1350d;
import Ic.y;
import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u extends AbstractC1350d {

    /* renamed from: I, reason: collision with root package name */
    public double f5685I;

    /* renamed from: J, reason: collision with root package name */
    public double f5686J;

    /* renamed from: M, reason: collision with root package name */
    public y f5689M;

    /* renamed from: N, reason: collision with root package name */
    public float f5690N;

    /* renamed from: O, reason: collision with root package name */
    public float f5691O;

    /* renamed from: K, reason: collision with root package name */
    public float f5687K = Float.NaN;

    /* renamed from: L, reason: collision with root package name */
    public float f5688L = Float.NaN;

    /* renamed from: P, reason: collision with root package name */
    public final y.b f5692P = new b();

    public static final class a extends AbstractC1350d.c {

        /* renamed from: b, reason: collision with root package name */
        public final Class f5693b = u.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5694c = "PinchGestureHandler";

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5694c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5693b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public u a(Context context) {
            return new u();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.h c(u handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.h(handler);
        }
    }

    public static final class b implements y.b {
        public b() {
        }

        @Override // Ic.y.b
        public boolean a(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            double b12 = u.this.b1();
            u uVar = u.this;
            uVar.f5685I = uVar.b1() * detector.g();
            double i10 = detector.i();
            if (i10 > 0.0d) {
                u uVar2 = u.this;
                uVar2.f5686J = (uVar2.b1() - b12) / i10;
            }
            if (Math.abs(u.this.f5690N - detector.d()) < u.this.f5691O || u.this.S() != 2) {
                return true;
            }
            u.this.k();
            return true;
        }

        @Override // Ic.y.b
        public void b(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
        }

        @Override // Ic.y.b
        public boolean c(y detector) {
            Intrinsics.checkNotNullParameter(detector, "detector");
            u.this.f5690N = detector.d();
            return true;
        }
    }

    public final float Z0() {
        return this.f5687K;
    }

    public final float a1() {
        return this.f5688L;
    }

    public final double b1() {
        return this.f5685I;
    }

    public final double c1() {
        return this.f5686J;
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
            View W10 = W();
            Intrinsics.checkNotNull(W10);
            Context context = W10.getContext();
            t0();
            this.f5689M = new y(context, this.f5692P);
            this.f5691O = ViewConfiguration.get(context).getScaledTouchSlop();
            this.f5687K = event.getX();
            this.f5688L = event.getY();
            p();
        }
        y yVar = this.f5689M;
        if (yVar != null) {
            yVar.k(sourceEvent);
        }
        y yVar2 = this.f5689M;
        if (yVar2 != null) {
            PointF Q02 = Q0(new PointF(yVar2.e(), yVar2.f()));
            this.f5687K = Q02.x;
            this.f5688L = Q02.y;
        }
        if (sourceEvent.getActionMasked() == 1) {
            if (S() == 4) {
                B();
            } else {
                D();
            }
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        this.f5689M = null;
        this.f5687K = Float.NaN;
        this.f5688L = Float.NaN;
        t0();
    }

    @Override // Ic.AbstractC1350d
    public void t0() {
        this.f5686J = 0.0d;
        this.f5685I = 1.0d;
    }
}

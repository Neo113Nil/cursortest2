package Ic;

import Ic.AbstractC1350d;
import Jc.k;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m extends AbstractC1350d {

    /* renamed from: L, reason: collision with root package name */
    public static final a f5612L = new a(null);

    /* renamed from: M, reason: collision with root package name */
    public static final Jc.o f5613M = new Jc.o();

    /* renamed from: I, reason: collision with root package name */
    public Handler f5614I;

    /* renamed from: J, reason: collision with root package name */
    public Runnable f5615J = new Runnable() { // from class: Ic.l
        @Override // java.lang.Runnable
        public final void run() {
            m.W0(m.this);
        }
    };

    /* renamed from: K, reason: collision with root package name */
    public z f5616K = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends AbstractC1350d.c {

        /* renamed from: b, reason: collision with root package name */
        public final Class f5617b = m.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5618c = "HoverGestureHandler";

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5618c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5617b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public m a(Context context) {
            return new m();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.c c(m handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.c(handler);
        }
    }

    public static final void W0(m mVar) {
        mVar.V0();
    }

    public static /* synthetic */ Boolean a1(m mVar, View view, View view2, View view3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = view.getRootView();
        }
        return mVar.Z0(view, view2, view3);
    }

    @Override // Ic.AbstractC1350d
    public boolean K0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (!(handler instanceof m) || ((m) handler).Y0(this)) {
            return super.K0(handler);
        }
        View W10 = handler.W();
        Intrinsics.checkNotNull(W10);
        View W11 = W();
        Intrinsics.checkNotNull(W11);
        Boolean a12 = a1(this, W10, W11, null, 4, null);
        Intrinsics.checkNotNull(a12);
        return a12.booleanValue();
    }

    @Override // Ic.AbstractC1350d
    public boolean L0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if (((handler instanceof m) && (Y0(handler) || ((m) handler).Y0(this))) || (handler instanceof k.b)) {
            return true;
        }
        return super.L0(handler);
    }

    @Override // Ic.AbstractC1350d
    public boolean M0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        if ((handler instanceof m) && !Y0(handler) && !((m) handler).Y0(this)) {
            View W10 = W();
            Intrinsics.checkNotNull(W10);
            View W11 = handler.W();
            Intrinsics.checkNotNull(W11);
            Boolean a12 = a1(this, W10, W11, null, 4, null);
            if (a12 != null) {
                return a12.booleanValue();
            }
        }
        return super.M0(handler);
    }

    public final void V0() {
        int S10 = S();
        if (S10 == 0) {
            q();
        } else if (S10 == 2) {
            D();
        } else {
            if (S10 != 4) {
                return;
            }
            B();
        }
    }

    public final z X0() {
        return this.f5616K;
    }

    public final boolean Y0(AbstractC1350d abstractC1350d) {
        View W10 = abstractC1350d.W();
        while (W10 != null) {
            if (Intrinsics.areEqual(W10, W())) {
                return true;
            }
            Object parent = W10.getParent();
            W10 = parent instanceof View ? (View) parent : null;
        }
        return false;
    }

    public final Boolean Z0(View view, View view2, View view3) {
        if (Intrinsics.areEqual(view3, view2)) {
            return Boolean.TRUE;
        }
        if (Intrinsics.areEqual(view3, view)) {
            return Boolean.FALSE;
        }
        if (!(view3 instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view3;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            Boolean Z02 = Z0(view, view2, f5613M.c(viewGroup, i10));
            if (Z02 != null) {
                return Z02;
            }
        }
        return null;
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 0) {
            Handler handler = this.f5614I;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f5614I = null;
            return;
        }
        if (event.getAction() != 1 || f0()) {
            return;
        }
        V0();
    }

    @Override // Ic.AbstractC1350d
    public void m0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        if (event.getAction() == 10) {
            if (this.f5614I == null) {
                this.f5614I = new Handler(Looper.getMainLooper());
            }
            Handler handler = this.f5614I;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f5615J, 4L);
            return;
        }
        if (!f0()) {
            V0();
            return;
        }
        if (S() == 4 && event.getToolType(0) == 2) {
            this.f5616K = z.f5745f.a(event);
            return;
        }
        if (S() == 0) {
            if (event.getAction() == 7 || event.getAction() == 9) {
                p();
                k();
            }
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        super.o0();
        this.f5616K = new z(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }
}

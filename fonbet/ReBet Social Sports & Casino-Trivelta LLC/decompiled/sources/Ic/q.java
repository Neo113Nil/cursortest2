package Ic;

import Ic.AbstractC1350d;
import android.content.Context;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.views.scroll.ReactHorizontalScrollView;
import com.facebook.react.views.scroll.ReactScrollView;
import com.facebook.react.views.swiperefresh.ReactSwipeRefreshLayout;
import com.facebook.react.views.text.ReactTextView;
import com.facebook.react.views.textinput.ReactEditText;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q extends AbstractC1350d {

    /* renamed from: L, reason: collision with root package name */
    public static final b f5636L = new b(null);

    /* renamed from: M, reason: collision with root package name */
    public static final a f5637M = new a();

    /* renamed from: I, reason: collision with root package name */
    public boolean f5638I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f5639J;

    /* renamed from: K, reason: collision with root package name */
    public e f5640K = f5637M;

    public static final class a implements e {
        @Override // Ic.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return e.a.h(this);
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return e.a.b(this, view);
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d abstractC1350d) {
            return e.a.g(this, abstractC1350d);
        }

        @Override // Ic.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Ic.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }

        public b() {
        }
    }

    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        public final q f5641a;

        /* renamed from: b, reason: collision with root package name */
        public final ReactEditText f5642b;

        /* renamed from: c, reason: collision with root package name */
        public float f5643c;

        /* renamed from: d, reason: collision with root package name */
        public float f5644d;

        /* renamed from: e, reason: collision with root package name */
        public int f5645e;

        public c(q handler, ReactEditText editText) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(editText, "editText");
            this.f5641a = handler;
            this.f5642b = editText;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(editText.getContext());
            this.f5645e = viewConfiguration.getScaledTouchSlop() * viewConfiguration.getScaledTouchSlop();
        }

        @Override // Ic.q.e
        public boolean a() {
            return true;
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return true;
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return e.a.b(this, view);
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.valueOf(handler.T() > 0 && !(handler instanceof q));
        }

        @Override // Ic.q.e
        public void g(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.f5641a.k();
            this.f5642b.onTouchEvent(event);
            this.f5643c = event.getX();
            this.f5644d = event.getY();
        }

        @Override // Ic.q.e
        public void h(MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (((event.getX() - this.f5643c) * (event.getX() - this.f5643c)) + ((event.getY() - this.f5644d) * (event.getY() - this.f5644d)) < this.f5645e) {
                this.f5642b.requestFocusFromJS();
            }
        }
    }

    public static final class d extends AbstractC1350d.c {

        /* renamed from: d, reason: collision with root package name */
        public static final a f5646d = new a(null);

        /* renamed from: b, reason: collision with root package name */
        public final Class f5647b = q.class;

        /* renamed from: c, reason: collision with root package name */
        public final String f5648c = "NativeViewGestureHandler";

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public a() {
            }
        }

        @Override // Ic.AbstractC1350d.c
        public String d() {
            return this.f5648c;
        }

        @Override // Ic.AbstractC1350d.c
        public Class e() {
            return this.f5647b;
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q a(Context context) {
            return new q();
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Kc.f c(q handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return new Kc.f(handler);
        }

        @Override // Ic.AbstractC1350d.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void f(q handler, ReadableMap config) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(config, "config");
            super.f(handler, config);
            if (config.hasKey("shouldActivateOnStart")) {
                handler.f5638I = config.getBoolean("shouldActivateOnStart");
            }
            if (config.hasKey("disallowInterruption")) {
                handler.f5639J = config.getBoolean("disallowInterruption");
            }
        }
    }

    public interface e {

        public static final class a {
            public static void a(e eVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static boolean b(e eVar, View view) {
                Intrinsics.checkNotNullParameter(view, "view");
                return view.isPressed();
            }

            public static boolean c(e eVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                return true;
            }

            public static void d(e eVar, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
            }

            public static Boolean e(e eVar, View view, MotionEvent event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (view != null) {
                    return Boolean.valueOf(view.onTouchEvent(event));
                }
                return null;
            }

            public static boolean f(e eVar) {
                return false;
            }

            public static Boolean g(e eVar, AbstractC1350d handler) {
                Intrinsics.checkNotNullParameter(handler, "handler");
                return null;
            }

            public static boolean h(e eVar) {
                return false;
            }
        }

        boolean a();

        boolean b(MotionEvent motionEvent);

        boolean c();

        boolean d(View view);

        Boolean e(View view, MotionEvent motionEvent);

        Boolean f(AbstractC1350d abstractC1350d);

        void g(MotionEvent motionEvent);

        void h(MotionEvent motionEvent);
    }

    public static final class f implements e {
        @Override // Ic.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return e.a.h(this);
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return e.a.b(this, view);
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            if (view != null) {
                return Boolean.valueOf(view.dispatchTouchEvent(event));
            }
            return null;
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d abstractC1350d) {
            return e.a.g(this, abstractC1350d);
        }

        @Override // Ic.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Ic.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public static final class g implements e {
        @Override // Ic.q.e
        public boolean a() {
            return true;
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return e.a.h(this);
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return e.a.b(this, view);
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d abstractC1350d) {
            return e.a.g(this, abstractC1350d);
        }

        @Override // Ic.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Ic.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public static final class h implements e {

        /* renamed from: a, reason: collision with root package name */
        public final q f5649a;

        /* renamed from: b, reason: collision with root package name */
        public final ReactSwipeRefreshLayout f5650b;

        public h(q handler, ReactSwipeRefreshLayout swipeRefreshLayout) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            Intrinsics.checkNotNullParameter(swipeRefreshLayout, "swipeRefreshLayout");
            this.f5649a = handler;
            this.f5650b = swipeRefreshLayout;
        }

        @Override // Ic.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return true;
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            return e.a.b(this, view);
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d abstractC1350d) {
            return e.a.g(this, abstractC1350d);
        }

        @Override // Ic.q.e
        public void g(MotionEvent event) {
            ArrayList<AbstractC1350d> s10;
            Intrinsics.checkNotNullParameter(event, "event");
            View childAt = this.f5650b.getChildAt(0);
            r1 = null;
            ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
            if (scrollView == null) {
                return;
            }
            Ic.i P10 = this.f5649a.P();
            if (P10 != null && (s10 = P10.s(scrollView)) != null) {
                for (AbstractC1350d abstractC1350d : s10) {
                    if (abstractC1350d instanceof q) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            if (abstractC1350d == null || abstractC1350d.S() != 4 || scrollView.getScrollY() <= 0) {
                return;
            }
            this.f5649a.D();
        }

        @Override // Ic.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public static final class i implements e {
        @Override // Ic.q.e
        public boolean a() {
            return e.a.f(this);
        }

        @Override // Ic.q.e
        public boolean b(MotionEvent motionEvent) {
            return e.a.c(this, motionEvent);
        }

        @Override // Ic.q.e
        public boolean c() {
            return e.a.h(this);
        }

        @Override // Ic.q.e
        public boolean d(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view instanceof ReactTextView;
        }

        @Override // Ic.q.e
        public Boolean e(View view, MotionEvent motionEvent) {
            return e.a.e(this, view, motionEvent);
        }

        @Override // Ic.q.e
        public Boolean f(AbstractC1350d handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            return Boolean.FALSE;
        }

        @Override // Ic.q.e
        public void g(MotionEvent motionEvent) {
            e.a.d(this, motionEvent);
        }

        @Override // Ic.q.e
        public void h(MotionEvent motionEvent) {
            e.a.a(this, motionEvent);
        }
    }

    public q() {
        G0(true);
    }

    @Override // Ic.AbstractC1350d
    public boolean K0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return !this.f5639J;
    }

    @Override // Ic.AbstractC1350d
    public boolean L0(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Boolean f10 = this.f5640K.f(handler);
        if (f10 != null) {
            return f10.booleanValue();
        }
        if (super.L0(handler)) {
            return true;
        }
        if ((handler instanceof q) && handler.S() == 4 && ((q) handler).f5639J) {
            return false;
        }
        boolean z10 = this.f5639J;
        return !(S() == 4 && handler.S() == 4 && !z10) && S() == 4 && !z10 && (!this.f5640K.a() || handler.T() > 0);
    }

    public final void W0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        e eVar = this.f5640K;
        View W10 = W();
        Intrinsics.checkNotNull(obtain);
        eVar.e(W10, obtain);
        obtain.recycle();
    }

    public final boolean X0() {
        return this.f5639J;
    }

    @Override // Ic.AbstractC1350d
    public void j0() {
        W0();
    }

    @Override // Ic.AbstractC1350d
    public void k0() {
        W0();
    }

    @Override // Ic.AbstractC1350d
    public void l0(MotionEvent event, MotionEvent sourceEvent) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(sourceEvent, "sourceEvent");
        View W10 = W();
        Intrinsics.checkNotNull(W10);
        Context context = W10.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        boolean d10 = Jc.a.d(context);
        if ((W10 instanceof RNGestureHandlerButtonViewManager.a) && d10) {
            return;
        }
        if (event.getActionMasked() == 1) {
            if (S() != 0 || this.f5640K.b(event)) {
                this.f5640K.e(W10, event);
                if ((S() == 0 || S() == 2) && this.f5640K.d(W10)) {
                    k();
                }
                if (S() == 0) {
                    q();
                } else {
                    B();
                }
            } else {
                q();
            }
            this.f5640K.h(event);
            return;
        }
        if (S() != 0 && S() != 2) {
            if (S() == 4) {
                this.f5640K.e(W10, event);
                return;
            }
            return;
        }
        if (this.f5638I) {
            f5636L.b(W10, event);
            this.f5640K.e(W10, event);
            k();
        } else if (f5636L.b(W10, event)) {
            this.f5640K.e(W10, event);
            k();
        } else if (this.f5640K.c()) {
            this.f5640K.g(event);
        } else {
            if (S() == 2 || !this.f5640K.b(event)) {
                return;
            }
            p();
        }
    }

    @Override // Ic.AbstractC1350d
    public void n0() {
        KeyEvent.Callback W10 = W();
        if (W10 instanceof e) {
            this.f5640K = (e) W10;
            return;
        }
        if (W10 instanceof ReactEditText) {
            this.f5640K = new c(this, (ReactEditText) W10);
            return;
        }
        if (W10 instanceof ReactSwipeRefreshLayout) {
            this.f5640K = new h(this, (ReactSwipeRefreshLayout) W10);
            return;
        }
        if (W10 instanceof ReactScrollView) {
            this.f5640K = new g();
            return;
        }
        if (W10 instanceof ReactHorizontalScrollView) {
            this.f5640K = new g();
        } else if (W10 instanceof ReactTextView) {
            this.f5640K = new i();
        } else if (W10 instanceof ReactViewGroup) {
            this.f5640K = new f();
        }
    }

    @Override // Ic.AbstractC1350d
    public void o0() {
        this.f5640K = f5637M;
    }

    @Override // Ic.AbstractC1350d
    public void s0() {
        super.s0();
        this.f5638I = false;
        this.f5639J = false;
        G0(true);
    }
}

package io.sentry.android.core.internal.gestures;

import B0.A0;
import Hj.C3143a;
import Jl.C3398a;
import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.C7209u1;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.InterfaceC7142f0;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.internal.gestures.b;
import io.sentry.n3;
import io.sentry.protocol.D;
import io.sentry.t3;
import io.sentry.u3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<Activity> f67122a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final A1 f67123b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f67124c;

    /* renamed from: d, reason: collision with root package name */
    private io.sentry.internal.gestures.b f67125d = null;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC7142f0 f67126e = null;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private b f67127f = b.Unknown;

    /* renamed from: g, reason: collision with root package name */
    private final c f67128g = new c();

    /* loaded from: classes10.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67129a;

        static {
            int[] iArr = new int[b.values().length];
            f67129a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67129a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67129a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67129a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    private static final class c {

        /* renamed from: b, reason: collision with root package name */
        private io.sentry.internal.gestures.b f67131b;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private b f67130a = b.Unknown;

        /* renamed from: c, reason: collision with root package name */
        private float f67132c = 0.0f;

        /* renamed from: d, reason: collision with root package name */
        private float f67133d = 0.0f;

        c() {
        }

        static String d(c cVar, MotionEvent motionEvent) {
            cVar.getClass();
            float x11 = motionEvent.getX() - cVar.f67132c;
            float y11 = motionEvent.getY() - cVar.f67133d;
            return Math.abs(x11) > Math.abs(y11) ? x11 > 0.0f ? "right" : "left" : y11 > 0.0f ? "down" : "up";
        }

        static void e(c cVar) {
            cVar.f67131b = null;
            cVar.f67130a = b.Unknown;
            cVar.f67132c = 0.0f;
            cVar.f67133d = 0.0f;
        }

        static void h(c cVar, io.sentry.internal.gestures.b bVar) {
            cVar.f67131b = bVar;
        }
    }

    public e(@NotNull Activity activity, @NotNull A1 a12, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        this.f67122a = new WeakReference<>(activity);
        this.f67123b = a12;
        this.f67124c = sentryAndroidOptions;
    }

    public static /* synthetic */ void a(e eVar, U u11, InterfaceC7142f0 interfaceC7142f0, InterfaceC7142f0 interfaceC7142f02) {
        if (interfaceC7142f02 != null) {
            eVar.f67124c.getLogger().c(I2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC7142f0.getName());
        } else {
            eVar.getClass();
            u11.t(interfaceC7142f0);
        }
    }

    public static /* synthetic */ void b(e eVar, U u11, InterfaceC7142f0 interfaceC7142f0) {
        if (interfaceC7142f0 == eVar.f67126e) {
            u11.v();
        }
    }

    private void c(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2, @NotNull Map<String, Object> map, @NotNull MotionEvent motionEvent) {
        if (this.f67124c.isEnableUserInteractionBreadcrumbs()) {
            int i11 = a.f67129a[bVar2.ordinal()];
            String str = i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "swipe" : "scroll" : "click";
            E e11 = new E();
            e11.k(motionEvent, "android:motionEvent");
            e11.k(bVar.e(), "android:view");
            this.f67123b.g(C7141f.t(str, bVar.d(), bVar.a(), null, map), e11);
        }
    }

    private View d(@NotNull String str) {
        Activity activity = this.f67122a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f67124c;
        if (activity == null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, A0.b("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, A0.b("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            return peekDecorView;
        }
        sentryAndroidOptions.getLogger().c(I2.DEBUG, A0.b("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    private void f(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2) {
        boolean z11 = bVar2 == b.Click || !(bVar2 == this.f67127f && bVar.equals(this.f67125d));
        SentryAndroidOptions sentryAndroidOptions = this.f67124c;
        boolean isTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        A1 a12 = this.f67123b;
        if (!isTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z11) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    a12.m(new C3143a());
                }
                this.f67125d = bVar;
                this.f67127f = bVar2;
                return;
            }
            return;
        }
        Activity activity = this.f67122a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String b11 = bVar.b();
        InterfaceC7142f0 interfaceC7142f0 = this.f67126e;
        if (interfaceC7142f0 != null) {
            if (!z11 && !interfaceC7142f0.h()) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, A0.b("The view with id: ", b11, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f67126e.d();
                    return;
                }
                return;
            }
            g(n3.OK);
        }
        String str = activity.getClass().getSimpleName() + "." + b11;
        int i11 = a.f67129a[bVar2.ordinal()];
        String concat = "ui.action.".concat(i11 != 1 ? i11 != 2 ? i11 != 3 ? "unknown" : "swipe" : "scroll" : "click");
        u3 u3Var = new u3();
        u3Var.r();
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        u3Var.o(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        u3Var.p(sentryAndroidOptions.getIdleTimeout());
        u3Var.g();
        u3Var.e("auto.ui.gesture_listener." + bVar.c());
        final InterfaceC7142f0 s11 = a12.s(new t3(str, D.COMPONENT, concat), u3Var);
        a12.m(new InterfaceC7217w1() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // io.sentry.InterfaceC7217w1
            public final void e(final U u11) {
                final e eVar = e.this;
                eVar.getClass();
                final InterfaceC7142f0 interfaceC7142f02 = s11;
                u11.L(new C7209u1.c() { // from class: io.sentry.android.core.internal.gestures.d
                    @Override // io.sentry.C7209u1.c
                    public final void a(InterfaceC7142f0 interfaceC7142f03) {
                        e.a(e.this, u11, interfaceC7142f02, interfaceC7142f03);
                    }
                });
            }
        });
        this.f67126e = s11;
        this.f67125d = bVar;
        this.f67127f = bVar2;
    }

    public final void e(@NotNull MotionEvent motionEvent) {
        View d11 = d("onUp");
        c cVar = this.f67128g;
        io.sentry.internal.gestures.b bVar = cVar.f67131b;
        if (d11 == null || bVar == null) {
            return;
        }
        if (cVar.f67130a == b.Unknown) {
            this.f67124c.getLogger().c(I2.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        c(bVar, cVar.f67130a, Collections.singletonMap("direction", c.d(cVar, motionEvent)), motionEvent);
        f(bVar, cVar.f67130a);
        c.e(cVar);
    }

    final void g(@NotNull n3 n3Var) {
        InterfaceC7142f0 interfaceC7142f0 = this.f67126e;
        if (interfaceC7142f0 != null) {
            if (interfaceC7142f0.getStatus() == null) {
                this.f67126e.n(n3Var);
            } else {
                this.f67126e.finish();
            }
        }
        this.f67123b.m(new C3398a(this));
        this.f67126e = null;
        if (this.f67125d != null) {
            this.f67125d = null;
        }
        this.f67127f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        c cVar = this.f67128g;
        c.e(cVar);
        cVar.f67132c = motionEvent.getX();
        cVar.f67133d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
        this.f67128g.f67130a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f11) {
        View d11 = d("onScroll");
        if (d11 != null && motionEvent != null) {
            c cVar = this.f67128g;
            if (cVar.f67130a == b.Unknown) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                b.a aVar = b.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f67124c;
                io.sentry.internal.gestures.b a11 = h.a(sentryAndroidOptions, d11, x11, y11, aVar);
                if (a11 == null) {
                    sentryAndroidOptions.getLogger().c(I2.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    cVar.f67130a = b.Scroll;
                    return false;
                }
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Scroll target found: " + a11.b(), new Object[0]);
                c.h(cVar, a11);
                cVar.f67130a = b.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View d11 = d("onSingleTapUp");
        if (d11 != null && motionEvent != null) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            b.a aVar = b.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f67124c;
            io.sentry.internal.gestures.b a11 = h.a(sentryAndroidOptions, d11, x11, y11, aVar);
            if (a11 == null) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            c(a11, bVar, Collections.EMPTY_MAP, motionEvent);
            f(a11, bVar);
        }
        return false;
    }
}

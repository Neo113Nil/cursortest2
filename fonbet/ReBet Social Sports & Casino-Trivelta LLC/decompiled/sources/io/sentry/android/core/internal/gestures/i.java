package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import com.twilio.voice.EventKeys;
import io.sentry.C4744f;
import io.sentry.EnumC4788n3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4790o0;
import io.sentry.J;
import io.sentry.L1;
import io.sentry.N1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.f4;
import io.sentry.internal.gestures.b;
import io.sentry.m4;
import io.sentry.o4;
import io.sentry.protocol.E;
import io.sentry.util.H;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class i implements GestureDetector.OnGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f51024a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC4740e0 f51025b;

    /* renamed from: c, reason: collision with root package name */
    public final SentryAndroidOptions f51026c;

    /* renamed from: d, reason: collision with root package name */
    public io.sentry.internal.gestures.b f51027d = null;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4790o0 f51028e = null;

    /* renamed from: f, reason: collision with root package name */
    public b f51029f = b.Unknown;

    /* renamed from: g, reason: collision with root package name */
    public final c f51030g = new c(null);

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType;

        static {
            int[] iArr = new int[b.values().length];
            $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public i(Activity activity, InterfaceC4740e0 interfaceC4740e0, SentryAndroidOptions sentryAndroidOptions) {
        this.f51024a = new WeakReference(activity);
        this.f51025b = interfaceC4740e0;
        this.f51026c = sentryAndroidOptions;
    }

    public static /* synthetic */ void a(i iVar, InterfaceC4730c0 interfaceC4730c0, InterfaceC4790o0 interfaceC4790o0) {
        if (interfaceC4790o0 == iVar.f51028e) {
            interfaceC4730c0.H();
        }
    }

    public static /* synthetic */ void b(i iVar, InterfaceC4730c0 interfaceC4730c0, InterfaceC4790o0 interfaceC4790o0, InterfaceC4790o0 interfaceC4790o02) {
        if (interfaceC4790o02 != null) {
            iVar.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC4790o0.getName());
        } else {
            iVar.getClass();
            interfaceC4730c0.D(interfaceC4790o0);
        }
    }

    public static /* synthetic */ void d(InterfaceC4790o0[] interfaceC4790o0Arr, InterfaceC4730c0 interfaceC4730c0) {
        interfaceC4790o0Arr[0] = interfaceC4730c0.k();
    }

    public static String k(b bVar) {
        int i10 = a.$SwitchMap$io$sentry$android$core$internal$gestures$SentryGestureListener$GestureType[bVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "swipe" : ViewProps.SCROLL : "click";
    }

    public final void f(io.sentry.internal.gestures.b bVar, b bVar2, Map map, MotionEvent motionEvent) {
        if (this.f51026c.isEnableUserInteractionBreadcrumbs()) {
            String k10 = k(bVar2);
            J j10 = new J();
            j10.m("android:motionEvent", motionEvent);
            j10.m("android:view", bVar.f());
            this.f51025b.g(C4744f.C(k10, bVar.d(), bVar.a(), bVar.e(), map), j10);
        }
    }

    public void g(final InterfaceC4730c0 interfaceC4730c0, final InterfaceC4790o0 interfaceC4790o0) {
        interfaceC4730c0.W(new L1.c() { // from class: io.sentry.android.core.internal.gestures.g
            @Override // io.sentry.L1.c
            public final void a(InterfaceC4790o0 interfaceC4790o02) {
                i.b(i.this, interfaceC4730c0, interfaceC4790o0, interfaceC4790o02);
            }
        });
    }

    public void h(final InterfaceC4730c0 interfaceC4730c0) {
        interfaceC4730c0.W(new L1.c() { // from class: io.sentry.android.core.internal.gestures.h
            @Override // io.sentry.L1.c
            public final void a(InterfaceC4790o0 interfaceC4790o0) {
                i.a(i.this, interfaceC4730c0, interfaceC4790o0);
            }
        });
    }

    public final View i(String str) {
        Activity activity = (Activity) this.f51024a.get();
        if (activity == null) {
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            return peekDecorView;
        }
        this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
        return null;
    }

    public final String j(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public void l(MotionEvent motionEvent) {
        View i10 = i("onUp");
        io.sentry.internal.gestures.b bVar = this.f51030g.f51032b;
        if (i10 == null || bVar == null) {
            return;
        }
        if (this.f51030g.f51031a == b.Unknown) {
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
            return;
        }
        f(bVar, this.f51030g.f51031a, Collections.singletonMap(EventKeys.DIRECTION_KEY, this.f51030g.i(motionEvent)), motionEvent);
        m(bVar, this.f51030g.f51031a);
        this.f51030g.j();
    }

    public final void m(io.sentry.internal.gestures.b bVar, b bVar2) {
        boolean z10 = bVar2 == b.Click || !(bVar2 == this.f51029f && bVar.equals(this.f51027d));
        if (!this.f51026c.isTracingEnabled() || !this.f51026c.isEnableUserInteractionTracing()) {
            if (z10) {
                if (this.f51026c.isEnableAutoTraceIdGeneration()) {
                    H.i(this.f51025b);
                }
                this.f51027d = bVar;
                this.f51029f = bVar2;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f51024a.get();
        if (activity == null) {
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String b10 = bVar.b();
        InterfaceC4790o0 interfaceC4790o0 = this.f51028e;
        if (interfaceC4790o0 != null) {
            if (!z10 && !interfaceC4790o0.d()) {
                this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "The view with id: " + b10 + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                if (this.f51026c.getIdleTimeout() != null) {
                    this.f51028e.r();
                    return;
                }
                return;
            }
            n(f4.OK);
        }
        final InterfaceC4790o0[] interfaceC4790o0Arr = {null};
        this.f51025b.l(new N1() { // from class: io.sentry.android.core.internal.gestures.e
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                i.d(interfaceC4790o0Arr, interfaceC4730c0);
            }
        });
        if (interfaceC4790o0Arr[0] != null) {
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", b10);
            return;
        }
        String str = j(activity) + "." + b10;
        String str2 = "ui.action." + k(bVar2);
        o4 o4Var = new o4();
        o4Var.x(true);
        long deadlineTimeout = this.f51026c.getDeadlineTimeout();
        o4Var.u(deadlineTimeout > 0 ? Long.valueOf(deadlineTimeout) : null);
        o4Var.v(this.f51026c.getIdleTimeout());
        o4Var.j(true);
        o4Var.g("auto.ui.gesture_listener." + bVar.c());
        final InterfaceC4790o0 w10 = this.f51025b.w(new m4(str, E.COMPONENT, str2), o4Var);
        this.f51025b.l(new N1() { // from class: io.sentry.android.core.internal.gestures.f
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                i.this.g(interfaceC4730c0, w10);
            }
        });
        this.f51028e = w10;
        this.f51027d = bVar;
        this.f51029f = bVar2;
    }

    public void n(f4 f4Var) {
        InterfaceC4790o0 interfaceC4790o0 = this.f51028e;
        if (interfaceC4790o0 != null) {
            if (interfaceC4790o0.getStatus() == null) {
                this.f51028e.l(f4Var);
            } else {
                this.f51028e.g();
            }
        }
        this.f51025b.l(new N1() { // from class: io.sentry.android.core.internal.gestures.d
            @Override // io.sentry.N1
            public final void a(InterfaceC4730c0 interfaceC4730c0) {
                i.this.h(interfaceC4730c0);
            }
        });
        this.f51028e = null;
        if (this.f51027d != null) {
            this.f51027d = null;
        }
        this.f51029f = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f51030g.j();
        this.f51030g.f51033c = motionEvent.getX();
        this.f51030g.f51034d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.f51030g.f51031a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View i10 = i("onScroll");
        if (i10 != null && motionEvent != null && this.f51030g.f51031a == b.Unknown) {
            io.sentry.internal.gestures.b a10 = k.a(this.f51026c, i10, motionEvent.getX(), motionEvent.getY(), b.a.SCROLLABLE);
            if (a10 == null) {
                this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                this.f51030g.f51031a = b.Scroll;
                return false;
            }
            this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Scroll target found: " + a10.b(), new Object[0]);
            this.f51030g.k(a10);
            this.f51030g.f51031a = b.Scroll;
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View i10 = i("onSingleTapUp");
        if (i10 != null && motionEvent != null) {
            io.sentry.internal.gestures.b a10 = k.a(this.f51026c, i10, motionEvent.getX(), motionEvent.getY(), b.a.CLICKABLE);
            if (a10 == null) {
                this.f51026c.getLogger().c(EnumC4788n3.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            f(a10, bVar, Collections.EMPTY_MAP, motionEvent);
            m(a10, bVar);
        }
        return false;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public b f51031a;

        /* renamed from: b, reason: collision with root package name */
        public io.sentry.internal.gestures.b f51032b;

        /* renamed from: c, reason: collision with root package name */
        public float f51033c;

        /* renamed from: d, reason: collision with root package name */
        public float f51034d;

        public c() {
            this.f51031a = b.Unknown;
            this.f51033c = 0.0f;
            this.f51034d = 0.0f;
        }

        public final String i(MotionEvent motionEvent) {
            float x10 = motionEvent.getX() - this.f51033c;
            float y10 = motionEvent.getY() - this.f51034d;
            return Math.abs(x10) > Math.abs(y10) ? x10 > 0.0f ? ViewProps.RIGHT : ViewProps.LEFT : y10 > 0.0f ? "down" : "up";
        }

        public final void j() {
            this.f51032b = null;
            this.f51031a = b.Unknown;
            this.f51033c = 0.0f;
            this.f51034d = 0.0f;
        }

        public final void k(io.sentry.internal.gestures.b bVar) {
            this.f51032b = bVar;
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}

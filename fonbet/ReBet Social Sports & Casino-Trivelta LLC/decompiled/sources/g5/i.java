package g5;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.AbstractC2177b;
import g5.i;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.x;
import r5.C6208b;
import r5.InterfaceC6207a;

/* loaded from: classes2.dex */
public final class i implements Closeable, Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final Application f46899a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6207a f46900b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f46902d;

    /* renamed from: e, reason: collision with root package name */
    public final x f46903e;

    /* renamed from: f, reason: collision with root package name */
    public final C f46904f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f46905g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f46906h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReference f46907i;

    /* renamed from: j, reason: collision with root package name */
    public final long f46908j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f46909k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicReference f46910l;

    public interface a {

        /* renamed from: g5.i$a$a, reason: collision with other inner class name */
        public static final class C0682a implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0682a f46911a = new C0682a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0682a);
            }

            public int hashCode() {
                return 429322047;
            }

            public String toString() {
                return "Idle";
            }
        }

        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public final long f46912a;

            public b(long j10) {
                this.f46912a = j10;
            }

            public final long a() {
                return this.f46912a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f46912a == ((b) obj).f46912a;
            }

            public int hashCode() {
                return Long.hashCode(this.f46912a);
            }

            public String toString() {
                return "WaitingForFirstFrame(startUptimeMs=" + this.f46912a + ")";
            }
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f46913a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f46914b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function1 f46915c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f46916d;

        public b(Ref.BooleanRef booleanRef, View view, Function1 function1, i iVar) {
            this.f46913a = booleanRef;
            this.f46914b = view;
            this.f46915c = function1;
            this.f46916d = iVar;
        }

        public static final void b(Function1 function1, i iVar, long j10) {
            function1.invoke(Long.valueOf(iVar.f46900b.b()));
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            Ref.BooleanRef booleanRef = this.f46913a;
            if (booleanRef.element) {
                return true;
            }
            booleanRef.element = true;
            if (this.f46914b.getViewTreeObserver().isAlive()) {
                this.f46914b.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            Choreographer choreographer = Choreographer.getInstance();
            final Function1 function1 = this.f46915c;
            final i iVar = this.f46916d;
            choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: g5.j
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    i.b.b(Function1.this, iVar, j10);
                }
            });
            return true;
        }
    }

    public i(Application application, InterfaceC6207a clock, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f46899a = application;
        this.f46900b = clock;
        this.f46901c = z10;
        this.f46902d = z11;
        x a10 = E.a(0, 8, Rh.d.f10308b);
        this.f46903e = a10;
        this.f46904f = AbstractC5323h.a(a10);
        this.f46905g = new AtomicBoolean(false);
        this.f46906h = new AtomicBoolean(false);
        this.f46907i = new AtomicReference(g.f46897a);
        this.f46908j = Process.getStartUptimeMillis();
        this.f46909k = new AtomicInteger(0);
        this.f46910l = new AtomicReference(a.C0682a.f46911a);
    }

    public static final Unit T1(i iVar, long j10) {
        iVar.w0(j10);
        return Unit.INSTANCE;
    }

    public static final void m1(final i iVar) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: g5.d
            @Override // java.lang.Runnable
            public final void run() {
                i.n1(i.this);
            }
        });
    }

    public static final void n1(i iVar) {
        AbstractC2177b.a(iVar.f46907i, g.f46897a, C4328f.f46896a);
    }

    public static final Unit y1(i iVar, long j10) {
        iVar.U(j10);
        return Unit.INSTANCE;
    }

    public final void A0(Activity activity, Function1 function1) {
        View findViewById = activity.findViewById(R.id.content);
        if (findViewById == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new b(new Ref.BooleanRef(), findViewById, function1, this));
        }
    }

    public final void D0() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: g5.c
            @Override // java.lang.Runnable
            public final void run() {
                i.m1(i.this);
            }
        });
    }

    public final void U(long j10) {
        if (AbstractC2177b.a(this.f46907i, h.f46898a, C4327e.f46895a)) {
            this.f46903e.a(e5.d.a("cold", "ms", RangesKt.coerceAtLeast(j10 - this.f46908j, 0L)));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f46905g.compareAndSet(true, false)) {
            this.f46899a.unregisterActivityLifecycleCallbacks(this);
        }
        this.f46907i.set(C4327e.f46895a);
        this.f46910l.set(a.C0682a.f46911a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.f46901c && AbstractC2177b.a(this.f46907i, g.f46897a, h.f46898a)) {
            A0(activity, new Function1() { // from class: g5.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit y12;
                    y12 = i.y1(i.this, ((Long) obj).longValue());
                    return y12;
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int incrementAndGet = this.f46909k.incrementAndGet();
        if (this.f46902d && incrementAndGet == 1 && this.f46906h.getAndSet(true)) {
            this.f46910l.set(new a.b(this.f46900b.b()));
            A0(activity, new Function1() { // from class: g5.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit T12;
                    T12 = i.T1(i.this, ((Long) obj).longValue());
                    return T12;
                }
            });
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        int decrementAndGet = this.f46909k.decrementAndGet();
        if (decrementAndGet < 0) {
            this.f46909k.set(0);
        } else {
            if (decrementAndGet != 0 || activity.isChangingConfigurations()) {
                return;
            }
            this.f46910l.set(a.C0682a.f46911a);
        }
    }

    public void start() {
        if ((this.f46901c || this.f46902d) && this.f46905g.compareAndSet(false, true)) {
            this.f46899a.registerActivityLifecycleCallbacks(this);
            if (this.f46901c) {
                D0();
            }
        }
    }

    public final void w0(long j10) {
        a aVar = (a) this.f46910l.get();
        if ((aVar instanceof a.b) && AbstractC2177b.a(this.f46910l, aVar, a.C0682a.f46911a)) {
            this.f46903e.a(e5.d.a("warm", "ms", RangesKt.coerceAtLeast(j10 - ((a.b) aVar).a(), 0L)));
        }
    }

    public C z0() {
        return this.f46904f;
    }

    public /* synthetic */ i(Application application, InterfaceC6207a interfaceC6207a, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, (i10 & 2) != 0 ? new C6208b() : interfaceC6207a, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11);
    }
}

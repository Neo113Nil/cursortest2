package io.sentry.android.replay;

import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4765j0;
import io.sentry.util.C4843a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class x implements g, e, io.sentry.android.replay.b {

    /* renamed from: a, reason: collision with root package name */
    public final F3 f51853a;

    /* renamed from: b, reason: collision with root package name */
    public final r f51854b;

    /* renamed from: c, reason: collision with root package name */
    public final u f51855c;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.replay.util.h f51856d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f51857e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f51858f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f51859g;

    /* renamed from: h, reason: collision with root package name */
    public Point f51860h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f51861i;

    /* renamed from: j, reason: collision with root package name */
    public final C4843a f51862j;

    /* renamed from: k, reason: collision with root package name */
    public final C4843a f51863k;

    /* renamed from: l, reason: collision with root package name */
    public final C4843a f51864l;

    /* renamed from: m, reason: collision with root package name */
    public volatile a f51865m;

    /* renamed from: n, reason: collision with root package name */
    public volatile HandlerThread f51866n;

    /* renamed from: o, reason: collision with root package name */
    public volatile Handler f51867o;

    public static final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final F3 f51868a;

        /* renamed from: b, reason: collision with root package name */
        public final io.sentry.android.replay.util.h f51869b;

        /* renamed from: c, reason: collision with root package name */
        public q f51870c;

        /* renamed from: d, reason: collision with root package name */
        public s f51871d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicBoolean f51872e;

        public a(F3 options, io.sentry.android.replay.util.h mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.f51868a = options;
            this.f51869b = mainLooperHandler;
            this.f51872e = new AtomicBoolean(true);
        }

        public final q a() {
            return this.f51870c;
        }

        public final void b() {
            q qVar = this.f51870c;
            if (qVar != null) {
                qVar.e();
            }
            this.f51872e.getAndSet(false);
        }

        public final void c() {
            if (this.f51868a.getSessionReplay().C()) {
                this.f51868a.getLogger().c(EnumC4788n3.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            q qVar = this.f51870c;
            if (qVar != null) {
                qVar.f();
            }
            this.f51872e.getAndSet(true);
            this.f51869b.d(this);
            if (this.f51869b.b(this)) {
                return;
            }
            this.f51868a.getLogger().c(EnumC4788n3.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        public final void d(s sVar) {
            this.f51871d = sVar;
        }

        public final void e(q qVar) {
            this.f51870c = qVar;
        }

        public final void f() {
            q qVar = this.f51870c;
            if (qVar != null) {
                qVar.d();
            }
            this.f51870c = null;
            this.f51872e.getAndSet(false);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f51872e.get()) {
                if (this.f51868a.getSessionReplay().C()) {
                    this.f51868a.getLogger().c(EnumC4788n3.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.f51868a.getSessionReplay().C()) {
                    this.f51868a.getLogger().c(EnumC4788n3.DEBUG, "Capturing a frame.", new Object[0]);
                }
                q qVar = this.f51870c;
                if (qVar != null) {
                    qVar.c();
                }
            } catch (Throwable th2) {
                this.f51868a.getLogger().b(EnumC4788n3.ERROR, "Failed to capture a frame", th2);
            }
            if (this.f51868a.getSessionReplay().C()) {
                ILogger logger = this.f51868a.getLogger();
                EnumC4788n3 enumC4788n3 = EnumC4788n3.DEBUG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Posting the capture runnable again, frame rate is ");
                s sVar = this.f51871d;
                sb2.append(sVar != null ? sVar.b() : 1);
                sb2.append(" fps.");
                logger.c(enumC4788n3, sb2.toString(), new Object[0]);
            }
            if (this.f51869b.c(this, 1000 / (this.f51871d != null ? r3.b() : 1))) {
                return;
            }
            this.f51868a.getLogger().c(EnumC4788n3.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    public static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f51874b;

        public b(View view) {
            this.f51874b = view;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) x.this.f51859g);
            if (!Intrinsics.areEqual(this.f51874b, weakReference != null ? (View) weakReference.get() : null)) {
                io.sentry.android.replay.util.r.i(this.f51874b, this);
                return true;
            }
            if (io.sentry.android.replay.util.r.e(this.f51874b)) {
                io.sentry.android.replay.util.r.i(this.f51874b, this);
                if (this.f51874b.getWidth() != x.this.f51860h.x || this.f51874b.getHeight() != x.this.f51860h.y) {
                    x.this.f51860h.set(this.f51874b.getWidth(), this.f51874b.getHeight());
                    x.this.f51855c.U(this.f51874b.getWidth(), this.f51874b.getHeight());
                }
            }
            return true;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f51875d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(1);
            this.f51875d = view;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.areEqual(it.get(), this.f51875d));
        }
    }

    public x(F3 options, r rVar, u windowCallback, io.sentry.android.replay.util.h mainLooperHandler, ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.f51853a = options;
        this.f51854b = rVar;
        this.f51855c = windowCallback;
        this.f51856d = mainLooperHandler;
        this.f51857e = replayExecutor;
        this.f51858f = new AtomicBoolean(false);
        this.f51859g = new ArrayList();
        this.f51860h = new Point();
        this.f51861i = new WeakHashMap();
        this.f51862j = new C4843a();
        this.f51863k = new C4843a();
        this.f51864l = new C4843a();
    }

    public static final void D0(x xVar, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (i12 - i10 == i16 - i14 && i18 == i19) {
            return;
        }
        WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) xVar.f51859g);
        if (Intrinsics.areEqual(view, weakReference != null ? (View) weakReference.get() : null)) {
            Intrinsics.checkNotNull(view);
            xVar.n1(view);
        }
    }

    public final void A0(View view) {
        if (this.f51861i.containsKey(view)) {
            return;
        }
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.w
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                x.D0(x.this, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f51861i.put(view, onLayoutChangeListener);
        view.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // io.sentry.android.replay.b
    public Handler B() {
        if (this.f51867o == null) {
            InterfaceC4765j0 d10 = this.f51864l.d();
            try {
                if (this.f51867o == null) {
                    this.f51866n = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.f51866n;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.f51866n;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.f51867o = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableKt.closeFinally(d10, null);
            } finally {
            }
        }
        Handler handler = this.f51867o;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        reset();
        this.f51856d.d(this.f51865m);
        InterfaceC4765j0 d10 = this.f51864l.d();
        try {
            Handler handler = this.f51867o;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.f51866n;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            AutoCloseableKt.closeFinally(d10, null);
            stop();
        } finally {
        }
    }

    @Override // io.sentry.android.replay.e
    public void d(View root, boolean z10) {
        q a10;
        q a11;
        q a12;
        Intrinsics.checkNotNullParameter(root, "root");
        InterfaceC4765j0 d10 = this.f51862j.d();
        try {
            if (!z10) {
                m1(root);
                a aVar = this.f51865m;
                if (aVar != null && (a11 = aVar.a()) != null) {
                    a11.g(root);
                }
                CollectionsKt.removeAll((List) this.f51859g, (Function1) new c(root));
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f51859g);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    a aVar2 = this.f51865m;
                    if (aVar2 != null && (a10 = aVar2.a()) != null) {
                        a10.b(view);
                    }
                    n1(view);
                    A0(view);
                }
            } else {
                if (z.a(root) == null) {
                    this.f51853a.getLogger().c(EnumC4788n3.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    AutoCloseableKt.closeFinally(d10, null);
                    return;
                }
                this.f51859g.add(new WeakReference(root));
                a aVar3 = this.f51865m;
                if (aVar3 != null && (a12 = aVar3.a()) != null) {
                    a12.b(root);
                }
                n1(root);
                A0(root);
            }
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(d10, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.g
    public void g(s config) {
        a aVar;
        q a10;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.f51858f.get()) {
            if (this.f51865m == null) {
                InterfaceC4765j0 d10 = this.f51863k.d();
                try {
                    if (this.f51865m == null) {
                        this.f51865m = new a(this.f51853a, this.f51856d);
                    }
                    Unit unit = Unit.INSTANCE;
                    AutoCloseableKt.closeFinally(d10, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        AutoCloseableKt.closeFinally(d10, th2);
                        throw th3;
                    }
                }
            }
            a aVar2 = this.f51865m;
            if (aVar2 != null) {
                aVar2.d(config);
            }
            a aVar3 = this.f51865m;
            if (aVar3 != null) {
                aVar3.e(new q(config, this.f51853a, this, this.f51854b));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.f51859g);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (aVar = this.f51865m) != null && (a10 = aVar.a()) != null) {
                a10.b(view);
            }
            this.f51856d.d(this.f51865m);
            if (this.f51856d.c(this.f51865m, 100L)) {
                return;
            }
            this.f51853a.getLogger().c(EnumC4788n3.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.b
    public io.sentry.android.replay.util.h k() {
        return this.f51856d;
    }

    public final void m1(View view) {
        View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f51861i.remove(view);
        if (onLayoutChangeListener != null) {
            view.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    public final void n1(View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!io.sentry.android.replay.util.r.e(root)) {
            io.sentry.android.replay.util.r.b(root, new b(root));
        } else {
            if (root.getWidth() == this.f51860h.x && root.getHeight() == this.f51860h.y) {
                return;
            }
            this.f51860h.set(root.getWidth(), root.getHeight());
            this.f51855c.U(root.getWidth(), root.getHeight());
        }
    }

    @Override // io.sentry.android.replay.g
    public void pause() {
        a aVar = this.f51865m;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // io.sentry.android.replay.b
    public ScheduledExecutorService r() {
        return this.f51857e;
    }

    @Override // io.sentry.android.replay.g
    public void reset() {
        q a10;
        this.f51860h.set(0, 0);
        InterfaceC4765j0 d10 = this.f51862j.d();
        try {
            Iterator it = this.f51859g.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    m1(view);
                    a aVar = this.f51865m;
                    if (aVar != null && (a10 = aVar.a()) != null) {
                        a10.g(view);
                    }
                }
            }
            this.f51859g.clear();
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.g
    public void resume() {
        a aVar = this.f51865m;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // io.sentry.android.replay.g
    public void start() {
        this.f51858f.getAndSet(true);
    }

    @Override // io.sentry.android.replay.g
    public void stop() {
        a aVar = this.f51865m;
        if (aVar != null) {
            aVar.f();
        }
        InterfaceC4765j0 d10 = this.f51863k.d();
        try {
            this.f51865m = null;
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(d10, null);
            this.f51858f.set(false);
        } finally {
        }
    }
}

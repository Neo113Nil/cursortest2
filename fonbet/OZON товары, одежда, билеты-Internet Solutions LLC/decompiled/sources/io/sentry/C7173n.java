package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7173n implements InterfaceC7157j {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ArrayList f68102d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f68103e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f68104f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final SentryAndroidOptions f68105g;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.a f68099a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    private volatile Timer f68100b = null;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap f68101c = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f68106h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    private long f68107i = 0;

    /* renamed from: io.sentry.n$a */
    /* loaded from: classes10.dex */
    final class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            Iterator it = C7173n.this.f68102d.iterator();
            while (it.hasNext()) {
                ((S) it.next()).c();
            }
        }
    }

    /* renamed from: io.sentry.n$b */
    /* loaded from: classes10.dex */
    final class b extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f68109a;

        b(ArrayList arrayList) {
            this.f68109a = arrayList;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C7173n c7173n = C7173n.this;
            if (currentTimeMillis - c7173n.f68107i <= 10) {
                return;
            }
            ArrayList arrayList = this.f68109a;
            arrayList.clear();
            c7173n.f68107i = currentTimeMillis;
            C7143f1 c7143f1 = new C7143f1(c7173n.f68105g.getDateProvider().now().d());
            Iterator it = c7173n.f68102d.iterator();
            while (it.hasNext()) {
                ((S) it.next()).d(c7143f1);
            }
            for (c cVar : c7173n.f68101c.values()) {
                if (cVar.c(c7143f1) && cVar.f68112b != null) {
                    arrayList.add(cVar.f68112b);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c7173n.b((InterfaceC7142f0) it2.next());
            }
        }
    }

    /* renamed from: io.sentry.n$c */
    /* loaded from: classes10.dex */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ArrayList f68111a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final e3 f68112b;

        /* renamed from: c, reason: collision with root package name */
        private final long f68113c;

        c(e3 e3Var) {
            this.f68112b = e3Var;
            this.f68113c = C7173n.this.f68105g.getDateProvider().now().d();
        }

        final boolean c(@NotNull C7143f1 c7143f1) {
            this.f68111a.add(c7143f1);
            return this.f68112b != null && C7173n.this.f68105g.getDateProvider().now().d() > TimeUnit.MILLISECONDS.toNanos(30000L) + this.f68113c;
        }
    }

    public C7173n(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        boolean z11 = false;
        io.sentry.util.p.b(sentryAndroidOptions, "The options object is required.");
        this.f68105g = sentryAndroidOptions;
        this.f68102d = new ArrayList();
        this.f68103e = new ArrayList();
        for (P p11 : sentryAndroidOptions.getPerformanceCollectors()) {
            if (p11 instanceof S) {
                this.f68102d.add((S) p11);
            }
            if (p11 instanceof Q) {
                this.f68103e.add((Q) p11);
            }
        }
        if (this.f68102d.isEmpty() && this.f68103e.isEmpty()) {
            z11 = true;
        }
        this.f68104f = z11;
    }

    @Override // io.sentry.InterfaceC7157j
    public final void a(@NotNull e3 e3Var) {
        if (this.f68104f) {
            this.f68105g.getLogger().c(I2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f68103e.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).b(e3Var);
        }
        String tVar = e3Var.k().toString();
        ConcurrentHashMap concurrentHashMap = this.f68101c;
        if (!concurrentHashMap.containsKey(tVar)) {
            concurrentHashMap.put(tVar, new c(e3Var));
        }
        f(tVar);
    }

    @Override // io.sentry.InterfaceC7157j
    public final List<C7143f1> b(@NotNull InterfaceC7142f0 interfaceC7142f0) {
        this.f68105g.getLogger().c(I2.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC7142f0.getName(), interfaceC7142f0.e().o().toString());
        Iterator it = this.f68103e.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).a(interfaceC7142f0);
        }
        return d(interfaceC7142f0.k().toString());
    }

    @Override // io.sentry.InterfaceC7157j
    public final void c(@NotNull i3 i3Var) {
        Iterator it = this.f68103e.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).a(i3Var);
        }
    }

    @Override // io.sentry.InterfaceC7157j
    public final void close() {
        this.f68105g.getLogger().c(I2.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f68101c.clear();
        Iterator it = this.f68103e.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).clear();
        }
        if (this.f68106h.getAndSet(false)) {
            InterfaceC7097a0 a11 = this.f68099a.a();
            try {
                if (this.f68100b != null) {
                    this.f68100b.cancel();
                    this.f68100b = null;
                }
                a11.close();
            } catch (Throwable th2) {
                try {
                    a11.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC7157j
    public final List<C7143f1> d(@NotNull String str) {
        ConcurrentHashMap concurrentHashMap = this.f68101c;
        c cVar = (c) concurrentHashMap.remove(str);
        this.f68105g.getLogger().c(I2.DEBUG, Nk.a.b("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (cVar != null) {
            return cVar.f68111a;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC7157j
    public final void e(@NotNull i3 i3Var) {
        Iterator it = this.f68103e.iterator();
        while (it.hasNext()) {
            ((Q) it.next()).b(i3Var);
        }
    }

    @Override // io.sentry.InterfaceC7157j
    public final void f(@NotNull String str) {
        if (this.f68104f) {
            this.f68105g.getLogger().c(I2.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f68101c.containsKey(str)) {
            this.f68101c.put(str, new c(null));
        }
        if (this.f68106h.getAndSet(true)) {
            return;
        }
        InterfaceC7097a0 a11 = this.f68099a.a();
        try {
            if (this.f68100b == null) {
                this.f68100b = new Timer(true);
            }
            this.f68100b.schedule(new a(), 0L);
            this.f68100b.scheduleAtFixedRate(new b(new ArrayList()), 100L, 100L);
            a11.close();
        } finally {
        }
    }
}

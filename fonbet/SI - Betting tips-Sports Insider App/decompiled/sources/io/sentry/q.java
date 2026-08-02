package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16966d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f16967e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16968f;

    /* renamed from: g, reason: collision with root package name */
    public final b6 f16969g;

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f16963a = new io.sentry.util.a();

    /* renamed from: b, reason: collision with root package name */
    public volatile Timer f16964b = null;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f16965c = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f16970h = new AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public long f16971i = 0;

    public q(SentryAndroidOptions sentryAndroidOptions) {
        boolean z5 = false;
        y4.a.C(sentryAndroidOptions, "The options object is required.");
        this.f16969g = sentryAndroidOptions;
        this.f16966d = new ArrayList();
        this.f16967e = new ArrayList();
        for (v0 v0Var : sentryAndroidOptions.getPerformanceCollectors()) {
            if (v0Var instanceof x0) {
                this.f16966d.add((x0) v0Var);
            }
            if (v0Var instanceof w0) {
                this.f16967e.add((w0) v0Var);
            }
        }
        if (this.f16966d.isEmpty() && this.f16967e.isEmpty()) {
            z5 = true;
        }
        this.f16968f = z5;
    }

    @Override // io.sentry.k
    public final void a(String str) {
        if (this.f16968f) {
            this.f16969g.getLogger().h(b5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f16965c.containsKey(str)) {
            this.f16965c.put(str, new p(this, null));
        }
        if (this.f16970h.getAndSet(true)) {
            return;
        }
        r a7 = this.f16963a.a();
        try {
            if (this.f16964b == null) {
                this.f16964b = new Timer(true);
            }
            this.f16964b.schedule(new n(0, this), 0L);
            this.f16964b.scheduleAtFixedRate(new o(this, new ArrayList()), 100L, 100L);
            a7.close();
        } finally {
        }
    }

    @Override // io.sentry.k
    public final void b(m6 m6Var) {
        Iterator it = this.f16967e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.g1) ((w0) it.next())).e(m6Var);
        }
    }

    @Override // io.sentry.k
    public final List c(String str) {
        ConcurrentHashMap concurrentHashMap = this.f16965c;
        p pVar = (p) concurrentHashMap.remove(str);
        this.f16969g.getLogger().h(b5.DEBUG, androidx.appcompat.widget.c1.m("stop collecting performance info for ", str), new Object[0]);
        if (concurrentHashMap.isEmpty()) {
            close();
        }
        if (pVar != null) {
            return pVar.f16714a;
        }
        return null;
    }

    @Override // io.sentry.k
    public final void close() {
        this.f16969g.getLogger().h(b5.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f16965c.clear();
        Iterator it = this.f16967e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.g1) ((w0) it.next())).d();
        }
        if (this.f16970h.getAndSet(false)) {
            r a7 = this.f16963a.a();
            try {
                if (this.f16964b != null) {
                    this.f16964b.cancel();
                    this.f16964b = null;
                }
                a7.close();
            } catch (Throwable th2) {
                try {
                    a7.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.k
    public final void d(m6 m6Var) {
        Iterator it = this.f16967e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.g1) ((w0) it.next())).f(m6Var);
        }
    }

    @Override // io.sentry.k
    public final void e(j6 j6Var) {
        if (this.f16968f) {
            this.f16969g.getLogger().h(b5.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f16967e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.g1) ((w0) it.next())).f(j6Var);
        }
        String vVar = j6Var.f16568a.toString();
        ConcurrentHashMap concurrentHashMap = this.f16965c;
        if (!concurrentHashMap.containsKey(vVar)) {
            concurrentHashMap.put(vVar, new p(this, j6Var));
        }
        a(vVar);
    }

    @Override // io.sentry.k
    public final List f(k1 k1Var) {
        this.f16969g.getLogger().h(b5.DEBUG, "stop collecting performance info for transactions %s (%s)", k1Var.getName(), k1Var.v().f16667a.toString());
        Iterator it = this.f16967e.iterator();
        while (it.hasNext()) {
            ((io.sentry.android.core.g1) ((w0) it.next())).e(k1Var);
        }
        return c(k1Var.q().toString());
    }
}

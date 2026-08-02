package io.sentry;

import io.sentry.util.C4843a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4789o implements InterfaceC4764j {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f52221f;

    /* renamed from: g, reason: collision with root package name */
    public final F3 f52222g;

    /* renamed from: a, reason: collision with root package name */
    public final C4843a f52216a = new C4843a();

    /* renamed from: b, reason: collision with root package name */
    public volatile Timer f52217b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Map f52218c = new ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f52223h = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final List f52219d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final List f52220e = new ArrayList();

    /* renamed from: io.sentry.o$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Iterator it = C4789o.this.f52219d.iterator();
            while (it.hasNext()) {
                ((InterfaceC4662a0) it.next()).c();
            }
        }
    }

    /* renamed from: io.sentry.o$b */
    public class b extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f52225a;

        public b(List list) {
            this.f52225a = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f52225a.clear();
            C4860w1 c4860w1 = new C4860w1(C4789o.this.f52222g.getDateProvider().now().f());
            Iterator it = C4789o.this.f52219d.iterator();
            while (it.hasNext()) {
                ((InterfaceC4662a0) it.next()).d(c4860w1);
            }
            for (c cVar : C4789o.this.f52218c.values()) {
                if (cVar.c(c4860w1) && cVar.f52228b != null) {
                    this.f52225a.add(cVar.f52228b);
                }
            }
            Iterator it2 = this.f52225a.iterator();
            while (it2.hasNext()) {
                C4789o.this.d((InterfaceC4790o0) it2.next());
            }
        }
    }

    /* renamed from: io.sentry.o$c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final List f52227a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC4790o0 f52228b;

        /* renamed from: c, reason: collision with root package name */
        public final long f52229c;

        public /* synthetic */ c(C4789o c4789o, InterfaceC4790o0 interfaceC4790o0, a aVar) {
            this(interfaceC4790o0);
        }

        public boolean c(C4860w1 c4860w1) {
            this.f52227a.add(c4860w1);
            return this.f52228b != null && C4789o.this.f52222g.getDateProvider().now().f() > this.f52229c + TimeUnit.MILLISECONDS.toNanos(30000L);
        }

        public c(InterfaceC4790o0 interfaceC4790o0) {
            this.f52227a = new ArrayList();
            this.f52228b = interfaceC4790o0;
            this.f52229c = C4789o.this.f52222g.getDateProvider().now().f();
        }
    }

    public C4789o(F3 f32) {
        boolean z10 = false;
        this.f52222g = (F3) io.sentry.util.w.c(f32, "The options object is required.");
        for (Y y10 : f32.getPerformanceCollectors()) {
            if (y10 instanceof InterfaceC4662a0) {
                this.f52219d.add((InterfaceC4662a0) y10);
            }
            if (y10 instanceof Z) {
                this.f52220e.add((Z) y10);
            }
        }
        if (this.f52219d.isEmpty() && this.f52220e.isEmpty()) {
            z10 = true;
        }
        this.f52221f = z10;
    }

    @Override // io.sentry.InterfaceC4764j
    public void a(InterfaceC4780m0 interfaceC4780m0) {
        Iterator it = this.f52220e.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).a(interfaceC4780m0);
        }
    }

    @Override // io.sentry.InterfaceC4764j
    public void b(InterfaceC4780m0 interfaceC4780m0) {
        Iterator it = this.f52220e.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).b(interfaceC4780m0);
        }
    }

    @Override // io.sentry.InterfaceC4764j
    public List c(String str) {
        c cVar = (c) this.f52218c.remove(str);
        this.f52222g.getLogger().c(EnumC4788n3.DEBUG, "stop collecting performance info for " + str, new Object[0]);
        if (this.f52218c.isEmpty()) {
            close();
        }
        if (cVar != null) {
            return cVar.f52227a;
        }
        return null;
    }

    @Override // io.sentry.InterfaceC4764j
    public void close() {
        this.f52222g.getLogger().c(EnumC4788n3.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        this.f52218c.clear();
        Iterator it = this.f52220e.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).clear();
        }
        if (this.f52223h.getAndSet(false)) {
            InterfaceC4765j0 d10 = this.f52216a.d();
            try {
                if (this.f52217b != null) {
                    this.f52217b.cancel();
                    this.f52217b = null;
                }
                if (d10 != null) {
                    d10.close();
                }
            } catch (Throwable th2) {
                if (d10 != null) {
                    try {
                        d10.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // io.sentry.InterfaceC4764j
    public List d(InterfaceC4790o0 interfaceC4790o0) {
        this.f52222g.getLogger().c(EnumC4788n3.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC4790o0.getName(), interfaceC4790o0.a().q().toString());
        Iterator it = this.f52220e.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).a(interfaceC4790o0);
        }
        return c(interfaceC4790o0.h().toString());
    }

    @Override // io.sentry.InterfaceC4764j
    public void e(InterfaceC4790o0 interfaceC4790o0) {
        if (this.f52221f) {
            this.f52222g.getLogger().c(EnumC4788n3.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        Iterator it = this.f52220e.iterator();
        while (it.hasNext()) {
            ((Z) it.next()).b(interfaceC4790o0);
        }
        String uVar = interfaceC4790o0.h().toString();
        if (!this.f52218c.containsKey(uVar)) {
            this.f52218c.put(uVar, new c(this, interfaceC4790o0, null));
        }
        f(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.InterfaceC4764j
    public void f(String str) {
        if (this.f52221f) {
            this.f52222g.getLogger().c(EnumC4788n3.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f52218c.containsKey(str)) {
            this.f52218c.put(str, new c(this, null, 0 == true ? 1 : 0));
        }
        if (this.f52223h.getAndSet(true)) {
            return;
        }
        InterfaceC4765j0 d10 = this.f52216a.d();
        try {
            if (this.f52217b == null) {
                this.f52217b = new Timer(true);
            }
            this.f52217b.schedule(new a(), 0L);
            this.f52217b.schedule(new b(new ArrayList()), 100L, 100L);
            if (d10 != null) {
                d10.close();
            }
        } finally {
        }
    }
}

package defpackage;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class x4d extends u4d implements Runnable {
    public final bo3 h;
    public Future i;
    public final AtomicBoolean j;
    public final AtomicBoolean k;
    public final ConcurrentHashMap l;
    public final ConcurrentHashMap m;
    public final ConcurrentHashMap n;
    public final ConcurrentHashMap o;
    public final Duration p;

    public x4d(p4d p4dVar) {
        super(p4dVar);
        this.h = new bo3();
        this.l = new ConcurrentHashMap();
        this.m = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.p = Duration.ofMinutes(5L);
    }

    @Override // defpackage.u4d
    public final bo3 a() {
        return this.h;
    }

    public final void b(String str, o5d o5dVar) {
        p4d p4dVar = this.a;
        p4dVar.S.p(str, true);
        char[] cArr = dkk.a;
        if (!this.j.get()) {
            a70.r("Dispatcher is closed");
            return;
        }
        if (this.g.get() != null) {
            a70.r("Dispatcher is draining");
            return;
        }
        if (p4dVar.isClosed()) {
            a70.r("Connection is Closed");
            return;
        }
        if (p4dVar.F.get() != null && this != p4dVar.x.get()) {
            a70.r("Connection is Draining");
            return;
        }
        String l = Long.toString(p4dVar.B.getAndIncrement());
        u5d u5dVar = new u5d(l, str, p4dVar, this);
        p4dVar.s.put(l, u5dVar);
        p4dVar.P0(l, str, false);
        ConcurrentHashMap concurrentHashMap = this.m;
        String str2 = u5dVar.i;
        concurrentHashMap.put(str2, u5dVar);
        ((Map) this.n.computeIfAbsent(u5dVar.h, new mn0(4))).put(str2, u5dVar);
        this.o.put(str2, o5dVar);
    }

    public final void c(final String str) {
        if (!this.j.get()) {
            a70.r("Dispatcher is closed");
            return;
        }
        if (this.g.get() != null) {
            return;
        }
        if (str.length() == 0) {
            a70.p("Subject is required in unsubscribe");
            return;
        }
        u5d u5dVar = (u5d) this.l.get(str);
        if (u5dVar != null) {
            this.a.Y0(u5dVar);
        }
        this.m.forEach(new BiConsumer() { // from class: v4d
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                u5d u5dVar2 = (u5d) obj2;
                if (str.equals(u5dVar2.h)) {
                    x4d.this.a.Y0(u5dVar2);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x006f, InterruptedException -> 0x007c, TryCatch #1 {InterruptedException -> 0x007c, blocks: (B:4:0x0008, B:6:0x000e, B:8:0x0014, B:10:0x0020, B:12:0x0028, B:15:0x0040, B:17:0x0044, B:19:0x0048, B:24:0x0052, B:28:0x0061, B:31:0x0082, B:37:0x009b, B:41:0x0073, B:43:0x007f, B:45:0x009e, B:47:0x00a9), top: B:3:0x0008, outer: #3 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        g5d g5dVar;
        boolean z;
        u5d u5dVar;
        boolean z2;
        bo3 bo3Var = this.h;
        p4d p4dVar = this.a;
        AtomicBoolean atomicBoolean = this.j;
        do {
            try {
                try {
                    if (atomicBoolean.get() && !Thread.interrupted()) {
                        Duration duration = this.p;
                        if (((AtomicInteger) bo3Var.d).get() == 0 || (g5dVar = bo3Var.a(duration)) == null) {
                            g5dVar = null;
                        } else {
                            ((AtomicLong) bo3Var.b).decrementAndGet();
                            ((AtomicLong) bo3Var.c).addAndGet(-g5dVar.d());
                        }
                        z = true;
                        if (g5dVar != null && (u5dVar = g5dVar.k) != null) {
                            if (u5dVar.j == null && u5dVar.k == null) {
                                z2 = false;
                                if (z2) {
                                    o5d o5dVar = (o5d) this.o.get(u5dVar.i);
                                    if (o5dVar == null) {
                                        o5dVar = null;
                                    }
                                    if (o5dVar != null) {
                                        u5dVar.e.incrementAndGet();
                                        this.e.incrementAndGet();
                                        try {
                                            o5dVar.a(g5dVar);
                                        } catch (Error e) {
                                            p4dVar.j0(new Exception(e));
                                        } catch (Exception e2) {
                                            p4dVar.j0(e2);
                                        }
                                        long j = u5dVar.l.get();
                                        if (j > 0 && j <= u5dVar.e.get()) {
                                            p4dVar.M(u5dVar);
                                        }
                                    }
                                }
                            }
                            z2 = true;
                            if (z2) {
                            }
                        }
                        if (((AtomicInteger) bo3Var.d).get() != 2 || ((AtomicLong) bo3Var.b).get() != 0) {
                            z = false;
                        }
                    }
                } catch (InterruptedException e3) {
                    if (atomicBoolean.get()) {
                        p4dVar.j0(e3);
                    }
                    Thread.currentThread().interrupt();
                }
                return;
            } finally {
                atomicBoolean.set(false);
                this.i = null;
            }
        } while (!z);
    }
}

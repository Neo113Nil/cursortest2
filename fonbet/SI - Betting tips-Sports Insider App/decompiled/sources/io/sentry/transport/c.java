package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.h0;
import io.sentry.j0;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.m4;
import io.sentry.r4;
import io.sentry.v;
import io.sentry.x6;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k2.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final n f17120a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.cache.d f17121b;

    /* renamed from: c, reason: collision with root package name */
    public final b6 f17122c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.j f17123d;

    /* renamed from: e, reason: collision with root package name */
    public final h f17124e;

    /* renamed from: f, reason: collision with root package name */
    public final e f17125f;

    /* renamed from: g, reason: collision with root package name */
    public volatile b f17126g;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(b6 b6Var, e5.j jVar, h hVar, io.sentry.internal.debugmeta.c cVar) {
        int maxQueueSize = b6Var.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
        final ILogger logger = b6Var.getLogger();
        l4 dateProvider = b6Var.getDateProvider();
        n nVar = new n(maxQueueSize, new j0(4), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    h0 h0Var = bVar.f17116b;
                    if (!x.t(h0Var, io.sentry.hints.d.class)) {
                        io.sentry.cache.d.this.y(bVar.f17115a, h0Var);
                    }
                    Object b10 = h0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b10 != null) {
                        ((io.sentry.hints.k) b10).b(false);
                    }
                    Object b11 = h0Var.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b11 != null) {
                        ((io.sentry.hints.h) b11).c(true);
                    }
                    logger.h(b5.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(b6Var, cVar, jVar);
        this.f17126g = null;
        this.f17120a = nVar;
        io.sentry.cache.d envelopeDiskCache2 = b6Var.getEnvelopeDiskCache();
        y4.a.C(envelopeDiskCache2, "envelopeCache is required");
        this.f17121b = envelopeDiskCache2;
        this.f17122c = b6Var;
        this.f17123d = jVar;
        y4.a.C(hVar, "transportGate is required");
        this.f17124e = hVar;
        this.f17125f = eVar;
    }

    @Override // io.sentry.transport.g
    public final void L(l1.a aVar, h0 h0Var) {
        io.sentry.cache.d dVar;
        boolean z5;
        l1.a aVar2;
        char c2;
        char c8;
        List singletonList;
        Iterable<r4> iterable = (Iterable) aVar.f19315c;
        boolean t3 = x.t(h0Var, io.sentry.hints.d.class);
        b6 b6Var = this.f17122c;
        io.sentry.cache.d dVar2 = this.f17121b;
        boolean z7 = false;
        if (t3) {
            b6Var.getLogger().h(b5.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.f17133a;
            z5 = true;
        } else {
            dVar = dVar2;
            z5 = false;
        }
        e5.j jVar = this.f17123d;
        b6 b6Var2 = (b6) jVar.f8646c;
        ArrayList arrayList = null;
        for (r4 r4Var : iterable) {
            String itemType = r4Var.f16985a.f17078e.getItemType();
            itemType.getClass();
            boolean z10 = z7;
            char c10 = 65535;
            switch (itemType.hashCode()) {
                case -1963501277:
                    c2 = 1;
                    if (itemType.equals("attachment")) {
                        c10 = z10 ? 1 : 0;
                        break;
                    }
                    break;
                case -1639516637:
                    c2 = 1;
                    if (itemType.equals("replay_video")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -729715625:
                    c2 = 1;
                    if (itemType.equals("profile_chunk")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -309425751:
                    c2 = 1;
                    if (itemType.equals("profile")) {
                        c8 = 3;
                        c10 = c8;
                        break;
                    }
                    break;
                case -191501435:
                    c2 = 1;
                    if (itemType.equals("feedback")) {
                        c8 = 4;
                        c10 = c8;
                        break;
                    }
                    break;
                case 107332:
                    c2 = 1;
                    if (itemType.equals("log")) {
                        c8 = 5;
                        c10 = c8;
                        break;
                    }
                    break;
                case 3536714:
                    c2 = 1;
                    if (itemType.equals("span")) {
                        c8 = 6;
                        c10 = c8;
                        break;
                    }
                    break;
                case 96891546:
                    c2 = 1;
                    if (itemType.equals("event")) {
                        c8 = 7;
                        c10 = c8;
                        break;
                    }
                    break;
                case 229505514:
                    c2 = 1;
                    if (itemType.equals("trace_metric")) {
                        c8 = '\b';
                        c10 = c8;
                        break;
                    }
                    break;
                case 1536888764:
                    c2 = 1;
                    if (itemType.equals("check_in")) {
                        c8 = '\t';
                        c10 = c8;
                        break;
                    }
                    break;
                case 1984987798:
                    c2 = 1;
                    if (itemType.equals("session")) {
                        c8 = '\n';
                        c10 = c8;
                        break;
                    }
                    break;
                case 2141246174:
                    c2 = 1;
                    if (itemType.equals("transaction")) {
                        c8 = 11;
                        c10 = c8;
                        break;
                    }
                    break;
                default:
                    c2 = 1;
                    break;
            }
            switch (c10) {
                case 0:
                    singletonList = Collections.singletonList(io.sentry.l.Attachment);
                    break;
                case 1:
                    singletonList = Collections.singletonList(io.sentry.l.Replay);
                    break;
                case 2:
                    io.sentry.l[] lVarArr = new io.sentry.l[2];
                    lVarArr[z10 ? 1 : 0] = io.sentry.l.ProfileChunkUi;
                    lVarArr[c2] = io.sentry.l.ProfileChunk;
                    singletonList = Arrays.asList(lVarArr);
                    break;
                case 3:
                    singletonList = Collections.singletonList(io.sentry.l.Profile);
                    break;
                case 4:
                    singletonList = Collections.singletonList(io.sentry.l.Feedback);
                    break;
                case 5:
                    singletonList = Collections.singletonList(io.sentry.l.LogItem);
                    break;
                case 6:
                    singletonList = Collections.singletonList(io.sentry.l.Span);
                    break;
                case 7:
                    singletonList = Collections.singletonList(io.sentry.l.Error);
                    break;
                case '\b':
                    singletonList = Collections.singletonList(io.sentry.l.TraceMetric);
                    break;
                case '\t':
                    singletonList = Collections.singletonList(io.sentry.l.Monitor);
                    break;
                case '\n':
                    singletonList = Collections.singletonList(io.sentry.l.Session);
                    break;
                case 11:
                    singletonList = Collections.singletonList(io.sentry.l.Transaction);
                    break;
                default:
                    singletonList = Collections.singletonList(io.sentry.l.Unknown);
                    break;
            }
            Iterator it = singletonList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (jVar.k((io.sentry.l) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(r4Var);
                    b6Var2.getClientReportRecorder().m(io.sentry.clientreport.e.RATELIMIT_BACKOFF, r4Var);
                }
            }
            z7 = z10 ? 1 : 0;
        }
        int i5 = z7;
        if (arrayList != null) {
            ILogger logger = b6Var2.getLogger();
            b5 b5Var = b5.WARNING;
            Object[] objArr = new Object[1];
            objArr[i5] = Integer.valueOf(arrayList.size());
            logger.h(b5Var, "%d envelope items will be dropped due rate limiting.", objArr);
            ArrayList arrayList2 = new ArrayList();
            for (r4 r4Var2 : iterable) {
                if (!arrayList.contains(r4Var2)) {
                    arrayList2.add(r4Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                b6Var2.getLogger().h(b5.WARNING, "Envelope discarded due all items rate limited.", new Object[i5]);
                Object b10 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b10 != null) {
                    ((io.sentry.hints.k) b10).b(i5);
                }
                Object b11 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b11 != null) {
                    ((io.sentry.hints.h) b11).c(false);
                }
                Object b12 = h0Var.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(h0Var.b("sentry:typeCheckHint")) && b12 != null) {
                    ((io.sentry.hints.c) b12).f16480a.countDown();
                    b6Var2.getLogger().h(b5.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                aVar2 = null;
            } else {
                aVar2 = new l1.a((m4) aVar.f19314b, arrayList2);
            }
        } else {
            aVar2 = aVar;
        }
        if (aVar2 == null) {
            if (z5) {
                dVar2.n(aVar);
                return;
            }
            return;
        }
        if (x6.class.isInstance(h0Var.b("sentry:typeCheckHint"))) {
            aVar2 = b6Var.getClientReportRecorder().n(aVar2);
        }
        Future submit = this.f17120a.submit(new b(this, aVar2, h0Var, dVar));
        if (submit != null && submit.isCancelled()) {
            b6Var.getClientReportRecorder().c(io.sentry.clientreport.e.QUEUE_OVERFLOW, aVar2);
            return;
        }
        Object b13 = h0Var.b("sentry:typeCheckHint");
        if (!v.class.isInstance(h0Var.b("sentry:typeCheckHint")) || b13 == null) {
            return;
        }
        v vVar = (v) b13;
        vVar.f17196g.add(vVar.f17195f);
        b6Var.getLogger().h(b5.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z5) {
        this.f17123d.close();
        this.f17120a.shutdown();
        this.f17122c.getLogger().h(b5.DEBUG, "Shutting down", new Object[0]);
        if (z5) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f17122c.getFlushTimeoutMillis();
            if (this.f17120a.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f17122c.getLogger().h(b5.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f17120a.shutdownNow();
            if (this.f17126g != null) {
                this.f17120a.getRejectedExecutionHandler().rejectedExecution(this.f17126g, this.f17120a);
            }
        } catch (InterruptedException unused) {
            this.f17122c.getLogger().h(b5.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void a0(l1.a aVar) {
        L(aVar, new h0());
    }

    @Override // io.sentry.transport.g
    public final void b(long j) {
        n nVar = this.f17120a;
        nVar.getClass();
        try {
            i2.d dVar = nVar.f17142e;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.getClass();
            ((p) dVar.f10882b).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e7) {
            nVar.f17140c.e(b5.ERROR, "Failed to wait till idle", e7);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final e5.j d() {
        return this.f17123d;
    }

    @Override // io.sentry.transport.g
    public final boolean e() {
        boolean z5;
        e5.j jVar = this.f17123d;
        jVar.getClass();
        ((d) jVar.f8645b).getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) jVar.f8647d;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z5 = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((io.sentry.l) it.next());
            if (date2 != null && !date.after(date2)) {
                z5 = true;
                break;
            }
        }
        n nVar = this.f17120a;
        k4 k4Var = nVar.f17139b;
        return (z5 || (k4Var != null && (nVar.f17141d.a().b(k4Var) > 2000000000L ? 1 : (nVar.f17141d.a().b(k4Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }
}

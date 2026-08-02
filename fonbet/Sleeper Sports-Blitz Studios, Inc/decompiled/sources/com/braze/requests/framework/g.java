package com.braze.requests.framework;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.o;
import com.braze.managers.j1;
import com.braze.models.outgoing.k;
import com.braze.requests.n;
import com.braze.requests.q;
import com.braze.requests.v;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class g {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) g.class);
    public static final long o = TimeUnit.HOURS.toMillis(1);
    public static final long p = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final com.braze.dispatch.h f672a;
    public final v b;
    public final boolean c;
    public final boolean d;
    public final LinkedHashMap e;
    public Deferred f;
    public final ReentrantLock g;
    public String h;
    public long i;
    public long j;
    public final AtomicInteger k;
    public final com.braze.requests.util.f l;
    public com.braze.enums.e m;

    public g(com.braze.dispatch.h dispatchDataProvider, v requestExecutor, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.f672a = dispatchDataProvider;
        this.b = requestExecutor;
        this.c = z;
        this.d = z2;
        this.e = new LinkedHashMap();
        this.g = new ReentrantLock();
        this.i = -1L;
        this.j = -1L;
        this.k = new AtomicInteger(0);
        this.l = new com.braze.requests.util.f(dispatchDataProvider.f500a.o.n(), dispatchDataProvider.f500a.o.o(), com.braze.requests.util.e.a(dispatchDataProvider, "com.braze.requestframework.tokenbucket", ""));
        this.m = com.braze.enums.e.c;
        dispatchDataProvider.f500a.n.c(com.braze.events.internal.dispatchmanager.c.class, new IEventSubscriber() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g.a(g.this, (com.braze.events.internal.dispatchmanager.c) obj);
            }
        });
        dispatchDataProvider.f500a.n.c(o.class, new IEventSubscriber() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda9
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g.a(g.this, (o) obj);
            }
        });
    }

    public static final void a(g gVar, com.braze.events.internal.dispatchmanager.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<destruct>");
        com.braze.events.internal.dispatchmanager.b bVar = cVar.f518a;
        com.braze.requests.o oVar = cVar.d;
        ReentrantLock reentrantLock = gVar.g;
        reentrantLock.lock();
        try {
            if (bVar == com.braze.events.internal.dispatchmanager.b.d && oVar != null) {
                gVar.a(oVar);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final String e() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String f() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String h() {
        return "Got call to shutdown request framework";
    }

    public static final String j() {
        return "Kicking off request framework.";
    }

    public final AtomicInteger c() {
        return this.k;
    }

    public final String d() {
        return this.h;
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.h();
            }
        }, 14, (Object) null);
        Deferred deferred = this.f;
        if (deferred != null) {
            Job.DefaultImpls.cancel$default((Job) deferred, (CancellationException) null, 1, (Object) null);
        }
        j1 j1Var = this.f672a.f500a;
        com.braze.requests.g gVar = new com.braze.requests.g(j1Var.o, j1Var.b.getBaseUrlForRequests(), new k(null, null, null));
        this.f672a.a((com.braze.requests.o) gVar);
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(nowInMillisecondsSystemClock, gVar, new h(gVar, nowInMillisecondsSystemClock, nowInMillisecondsSystemClock), new f(), false);
    }

    public final void i() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.j();
            }
        }, 7, (Object) null);
        a();
    }

    public static final String b(long j, h hVar) {
        return "Running at " + j + " for request " + hVar.a(j);
    }

    public static final String b(g gVar, long j) {
        return gVar.b(j);
    }

    public final String b(final long j) {
        LinkedHashMap linkedHashMap = this.e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((b) ((Map.Entry) it.next()).getValue());
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new Function1() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.b(j, (b) obj);
            }
        }, 30, null);
        return StringsKt.trimMargin$default("RequestFramework->\n            |mockAllNetworkRequests=" + this.c + "\n            |lastSdkAuthFailedToken=" + this.h + "\n            |lastSdkAuthFailureAt=" + (this.i - j) + "\n            |sdkAuthFailureBackoffUntil=" + (this.j - j) + "\n            |invalidApiKeyErrorCounter=" + this.k.get() + "\n            |globalRequestRateLimiter=" + this.l + "\n            |lastNetworkLevel=" + this.m + "\n            |currentSdkAuthToken=" + this.f672a.f500a.v.a() + "\n            |endpointQueues=\n            | \n            |" + joinToString$default + "\n            |  \n            |\n        ", null, 1, null);
    }

    public final void a(long j, b queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (j <= queue.f) {
            return;
        }
        queue.b(j);
        ArrayList arrayList = queue.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            h hVar = (h) next;
            if (hVar.d.a() && j >= hVar.b) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a(j, queue, (h) it2.next());
        }
    }

    public static final void a(g gVar, final o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(o.this);
            }
        }, 14, (Object) null);
        gVar.m = it.b;
    }

    public static final String a(o oVar) {
        return "Got network change event: " + oVar;
    }

    public static void a(g gVar) {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = gVar.g;
        reentrantLock.lock();
        try {
            if ((!gVar.d || gVar.m != com.braze.enums.e.f504a) && ((gVar.h == null || nowInMillisecondsSystemClock >= gVar.j || !Intrinsics.areEqual(gVar.f672a.f500a.v.a(), gVar.h)) && gVar.a(nowInMillisecondsSystemClock))) {
                Iterator it = gVar.e.entrySet().iterator();
                while (it.hasNext()) {
                    gVar.a(nowInMillisecondsSystemClock, (b) ((Map.Entry) it.next()).getValue());
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final CharSequence b(long j, b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d(j);
    }

    public final void a() {
        Deferred async$default;
        Deferred deferred = this.f;
        if (deferred == null || !deferred.isActive()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.b();
                }
            }, 6, (Object) null);
            async$default = BuildersKt__Builders_commonKt.async$default(BrazeCoroutineScope.INSTANCE, null, CoroutineStart.LAZY, new d(this, null), 1, null);
            this.f = async$default;
            if (async$default != null) {
                async$default.start();
            }
        }
    }

    public final void a(final long j, b queue, final h requestInfo) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, queue.c(), new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b(j, requestInfo);
            }
        }, 3, (Object) null);
        if (!a(j)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.e();
                }
            }, 7, (Object) null);
            return;
        }
        com.braze.requests.util.f b = queue.b();
        if (b == null || b.a(j) >= 1.0d) {
            com.braze.requests.o a2 = this.f672a.a(requestInfo.f673a);
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
            e eVar = new e(this, requestInfo, queue);
            requestInfo.a(j, i.c);
            com.braze.requests.util.f b2 = queue.b();
            requestInfo.f = (b2 == null ? null : Integer.valueOf((int) b2.a(j))) != null ? Integer.valueOf(RangesKt.coerceAtLeast(r0.intValue() - 1, 0)) : null;
            requestInfo.e = RangesKt.coerceAtLeast(((int) this.l.a(j)) - 1, 0);
            if (a(j, a2, requestInfo, eVar, false)) {
                return;
            }
            a(j, requestInfo);
            queue.a(j, requestInfo);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.f();
            }
        }, 7, (Object) null);
        com.braze.requests.util.f b3 = queue.b();
        requestInfo.b = (b3 != null ? b3.b() : 0L) + j;
    }

    public final boolean a(final long j, com.braze.requests.o oVar, final h hVar, c cVar, boolean z) {
        q qVar;
        final boolean z2 = oVar.a() || this.c;
        if (z2) {
            qVar = this.f672a.f500a.E;
        } else {
            qVar = this.b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(z2, hVar, j);
            }
        }, 3, (Object) null);
        qVar.a(hVar, cVar, z);
        return z2;
    }

    public static final String a(boolean z, h hVar, long j) {
        return "Running on " + (z ? "no-op" : "network") + " executor for " + hVar.a(j);
    }

    public final void a(com.braze.requests.o request) {
        b bVar;
        Intrinsics.checkNotNullParameter(request, "request");
        n c = request.c();
        if (!this.e.containsKey(c)) {
            int ordinal = c.ordinal();
            if (ordinal == 0) {
                bVar = new com.braze.requests.framework.queue.a(this.f672a);
            } else if (ordinal == 1) {
                bVar = new com.braze.requests.framework.queue.f(this.f672a);
            } else if (ordinal == 2) {
                bVar = new com.braze.requests.framework.queue.c(this.f672a);
            } else if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        bVar = new com.braze.requests.framework.queue.g(this.f672a);
                        break;
                    case 10:
                        bVar = new com.braze.requests.framework.queue.h(this.f672a);
                        break;
                    case 11:
                        bVar = new com.braze.requests.framework.queue.e(this.f672a);
                        break;
                    default:
                        bVar = new com.braze.requests.framework.queue.d(c, this.f672a);
                        break;
                }
            } else {
                bVar = new com.braze.requests.framework.queue.i(this.f672a);
            }
            this.e.put(c, bVar);
        } else {
            bVar = (b) this.e.get(c);
        }
        if (bVar == null) {
            return;
        }
        final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        bVar.a(nowInMillisecondsSystemClock, request);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.a(g.this, nowInMillisecondsSystemClock);
            }
        }, 3, (Object) null);
        a();
    }

    public static final String a(g gVar, long j) {
        return gVar.b(j);
    }

    public final void a(final long j, final h requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        this.l.a();
        if (!a(j)) {
            final long b = this.l.b();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g.a(h.this, j, b, this);
                }
            }, 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: com.braze.requests.framework.g$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.b(g.this, j);
            }
        }, 3, (Object) null);
    }

    public static final String a(h hVar, long j, long j2, g gVar) {
        return "Delaying next request after " + hVar.a(j) + " until next token is available in " + j2 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j + j2, null, null, 3, null) + "'\n" + gVar.l;
    }

    public final boolean a(long j) {
        return !this.f672a.f500a.o.K() || this.l.a(j) >= 1.0d;
    }
}

package bo.app;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.S;
import Ph.X;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
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

/* loaded from: classes.dex */
public final class hd {

    /* renamed from: n, reason: collision with root package name */
    public static final String f25520n = BrazeLogger.getBrazeLogTag((Class<?>) hd.class);

    /* renamed from: o, reason: collision with root package name */
    public static final long f25521o = TimeUnit.HOURS.toMillis(1);

    /* renamed from: p, reason: collision with root package name */
    public static final long f25522p = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final q5 f25523a;

    /* renamed from: b, reason: collision with root package name */
    public final cd f25524b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25525c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25526d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f25527e;

    /* renamed from: f, reason: collision with root package name */
    public X f25528f;

    /* renamed from: g, reason: collision with root package name */
    public final ReentrantLock f25529g;

    /* renamed from: h, reason: collision with root package name */
    public String f25530h;

    /* renamed from: i, reason: collision with root package name */
    public long f25531i;

    /* renamed from: j, reason: collision with root package name */
    public long f25532j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f25533k;

    /* renamed from: l, reason: collision with root package name */
    public final xf f25534l;

    /* renamed from: m, reason: collision with root package name */
    public cb f25535m;

    public hd(q5 dispatchDataProvider, cd requestExecutor, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        Intrinsics.checkNotNullParameter(requestExecutor, "requestExecutor");
        this.f25523a = dispatchDataProvider;
        this.f25524b = requestExecutor;
        this.f25525c = z10;
        this.f25526d = z11;
        this.f25527e = new LinkedHashMap();
        this.f25529g = new ReentrantLock();
        this.f25531i = -1L;
        this.f25532j = -1L;
        this.f25533k = new AtomicInteger(0);
        this.f25534l = new xf(dispatchDataProvider.f25944a.f25268j.o(), dispatchDataProvider.f25944a.f25268j.p(), wf.a(dispatchDataProvider, "com.braze.requestframework.tokenbucket", ""));
        this.f25535m = cb.f25353c;
        dispatchDataProvider.f25944a.f25267i.c(o5.class, new IEventSubscriber() { // from class: c3.c3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.hd.a(bo.app.hd.this, (bo.app.o5) obj);
            }
        });
        dispatchDataProvider.f25944a.f25267i.c(db.class, new IEventSubscriber() { // from class: c3.d3
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.hd.a(bo.app.hd.this, (bo.app.db) obj);
            }
        });
    }

    public static final void a(hd hdVar, o5 o5Var) {
        Intrinsics.checkNotNullParameter(o5Var, "<destruct>");
        n5 n5Var = o5Var.f25849a;
        d9 d9Var = o5Var.f25852d;
        ReentrantLock reentrantLock = hdVar.f25529g;
        reentrantLock.lock();
        try {
            if (n5Var == n5.f25790d && d9Var != null) {
                hdVar.a(d9Var);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String b() {
        return "Starting request sweeper job.";
    }

    public static final String c() {
        return "Skipping request sending due to lacking a global request rate limiting token.";
    }

    public static final String d() {
        return "Skipping request sending due to lacking an endpoint request rate limiting token.";
    }

    public static final String f() {
        return "Got call to shutdown request framework";
    }

    public static final String h() {
        return "Kicking off request framework.";
    }

    public final void e() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25520n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.g3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.f();
            }
        }, 14, (Object) null);
        X x10 = this.f25528f;
        if (x10 != null) {
            C0.a.b(x10, null, 1, null);
        }
        ah ahVar = this.f25523a.f25944a;
        l4 l4Var = new l4(ahVar.f25268j, ahVar.f25260b.getBaseUrlForRequests(), new lb(null, null, null));
        this.f25523a.a((d9) l4Var);
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        a(nowInMillisecondsSystemClock, l4Var, new id(l4Var, nowInMillisecondsSystemClock, nowInMillisecondsSystemClock), new gd());
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.X2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.h();
            }
        }, 7, (Object) null);
        a();
    }

    public static final String b(long j10, id idVar) {
        return "Running at " + j10 + " for request " + idVar.a(j10);
    }

    public static final String b(hd hdVar, long j10) {
        return hdVar.b(j10);
    }

    public final String b(final long j10) {
        LinkedHashMap linkedHashMap = this.f25527e;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((c7) ((Map.Entry) it.next()).getValue());
        }
        String joinToString$default = CollectionsKt.joinToString$default(arrayList, "\n\n", null, null, 0, null, new Function1() { // from class: c3.j3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bo.app.hd.b(j10, (bo.app.c7) obj);
            }
        }, 30, null);
        return StringsKt.trimMargin$default("RequestFramework->\n            |mockAllNetworkRequests=" + this.f25525c + "\n            |lastSdkAuthFailedToken=" + this.f25530h + "\n            |lastSdkAuthFailureAt=" + (this.f25531i - j10) + "\n            |sdkAuthFailureBackoffUntil=" + (this.f25532j - j10) + "\n            |invalidApiKeyErrorCounter=" + this.f25533k.get() + "\n            |globalRequestRateLimiter=" + this.f25534l + "\n            |lastNetworkLevel=" + this.f25535m + "\n            |currentSdkAuthToken=" + String.valueOf(this.f25523a.f25944a.f25275q.f25956d.readData(DataStoreKey.SDK_AUTH, "")) + "\n            |endpointQueues=\n            | \n            |" + joinToString$default + "\n            |  \n            |\n        ", null, 1, null);
    }

    public final void a(long j10, c7 queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        if (j10 <= queue.f25328f) {
            return;
        }
        queue.b(j10);
        ArrayList arrayList = queue.f25327e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            id idVar = (id) obj;
            jd jdVar = idVar.f25574d;
            jdVar.getClass();
            if (jdVar == jd.f25623a || jdVar == jd.f25624b) {
                if (j10 >= idVar.f25572b) {
                    arrayList2.add(obj);
                }
            }
        }
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            a(j10, queue, (id) obj2);
        }
    }

    public static final void a(hd hdVar, final db it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25520n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.a(bo.app.db.this);
            }
        }, 14, (Object) null);
        hdVar.f25535m = it.f25396b;
    }

    public static final String a(db dbVar) {
        return "Got network change event: " + dbVar;
    }

    public static void a(hd hdVar) {
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        ReentrantLock reentrantLock = hdVar.f25529g;
        reentrantLock.lock();
        try {
            if ((!hdVar.f25526d || hdVar.f25535m != cb.f25351a) && ((hdVar.f25530h == null || nowInMillisecondsSystemClock >= hdVar.f25532j || !Intrinsics.areEqual(String.valueOf(hdVar.f25523a.f25944a.f25275q.f25956d.readData(DataStoreKey.SDK_AUTH, "")), hdVar.f25530h)) && hdVar.a(nowInMillisecondsSystemClock))) {
                Iterator it = hdVar.f25527e.entrySet().iterator();
                while (it.hasNext()) {
                    hdVar.a(nowInMillisecondsSystemClock, (c7) ((Map.Entry) it.next()).getValue());
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final CharSequence b(long j10, c7 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.d(j10);
    }

    public final void a() {
        X b10;
        X x10 = this.f25528f;
        if (x10 == null || !x10.isActive()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.f3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.hd.b();
                }
            }, 6, (Object) null);
            b10 = AbstractC1459k.b(BrazeCoroutineScope.INSTANCE, null, S.f9048b, new ed(this, null), 1, null);
            this.f25528f = b10;
            if (b10 != null) {
                b10.start();
            }
        }
    }

    public final void a(final long j10, c7 queue, final id requestInfo) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, this, (BrazeLogger.Priority) null, (Throwable) null, queue.c(), new Function0() { // from class: c3.k3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.b(j10, requestInfo);
            }
        }, 3, (Object) null);
        if (!a(j10)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.hd.c();
                }
            }, 7, (Object) null);
            return;
        }
        xf b10 = queue.b();
        if (b10 == null || b10.a(j10) >= 1.0d) {
            d9 a10 = this.f25523a.a(requestInfo.f25571a);
            Intrinsics.checkNotNullParameter(queue, "queue");
            Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
            fd fdVar = new fd(this, requestInfo, queue);
            requestInfo.a(j10, jd.f25625c);
            xf b11 = queue.b();
            requestInfo.f25576f = (b11 == null ? null : Integer.valueOf((int) b11.a(j10))) != null ? Integer.valueOf(RangesKt.coerceAtLeast(r0.intValue() - 1, 0)) : null;
            requestInfo.f25575e = RangesKt.coerceAtLeast(((int) this.f25534l.a(j10)) - 1, 0);
            if (a(j10, a10, requestInfo, fdVar)) {
                return;
            }
            a(j10, requestInfo);
            queue.a(j10, requestInfo);
            return;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.d();
            }
        }, 7, (Object) null);
        xf b12 = queue.b();
        requestInfo.f25572b = (b12 != null ? b12.a() : 0L) + j10;
    }

    public final boolean a(final long j10, d9 d9Var, final id idVar, dd ddVar) {
        s9 s9Var;
        final boolean z10 = d9Var.c() || this.f25525c;
        if (z10) {
            s9Var = this.f25523a.f25944a.f25284z;
        } else {
            s9Var = this.f25524b;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.i3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.a(z10, idVar, j10);
            }
        }, 3, (Object) null);
        s9Var.a(idVar, ddVar);
        return z10;
    }

    public static final String a(boolean z10, id idVar, long j10) {
        return "Running on " + (z10 ? "no-op" : "network") + " executor for " + idVar.a(j10);
    }

    public final void a(d9 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        c9 b10 = request.b();
        c7 c7Var = (c7) this.f25527e.get(b10);
        if (c7Var == null) {
            int ordinal = b10.ordinal();
            if (ordinal == 0) {
                c7Var = new q3(this.f25523a);
            } else if (ordinal == 1) {
                c7Var = new b8(this.f25523a);
            } else if (ordinal == 2) {
                c7Var = new f4(this.f25523a);
            } else if (ordinal != 3) {
                switch (ordinal) {
                    case 9:
                        c7Var = new zd(this.f25523a);
                        break;
                    case 10:
                        c7Var = new ce(this.f25523a);
                        break;
                    case 11:
                        c7Var = new t5(this.f25523a);
                        break;
                    default:
                        c7Var = new s4(b10, this.f25523a);
                        break;
                }
            } else {
                c7Var = new of(this.f25523a);
            }
            this.f25527e.put(b10, c7Var);
        }
        final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        c7Var.a(nowInMillisecondsSystemClock, request);
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.h3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.a(bo.app.hd.this, nowInMillisecondsSystemClock);
            }
        }, 3, (Object) null);
        a();
    }

    public static final String a(hd hdVar, long j10) {
        return hdVar.b(j10);
    }

    public final void a(final long j10, final id requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        xf xfVar = this.f25534l;
        xfVar.getClass();
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double a10 = xfVar.a(nowInMillisecondsSystemClock);
        xfVar.f26289e = a10;
        vf vfVar = xfVar.f26287c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        vfVar.writeData(dataStoreKey, Float.valueOf((float) a10));
        xfVar.f26288d = nowInMillisecondsSystemClock;
        xfVar.f26287c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(nowInMillisecondsSystemClock));
        double d10 = xfVar.f26289e;
        if (d10 >= 1.0d) {
            double d11 = d10 - 1;
            xfVar.f26289e = d11;
            xfVar.f26287c.writeData(dataStoreKey, Float.valueOf((float) d11));
        }
        if (!a(j10)) {
            final long a11 = this.f25534l.a();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.a3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.hd.a(bo.app.id.this, j10, a11, this);
                }
            }, 7, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.b3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.hd.b(bo.app.hd.this, j10);
            }
        }, 3, (Object) null);
    }

    public static final String a(id idVar, long j10, long j11, hd hdVar) {
        return "Delaying next request after " + idVar.a(j10) + " until next token is available in " + j11 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j10 + j11, null, null, 3, null) + "'\n" + hdVar.f25534l;
    }

    public final boolean a(long j10) {
        return !this.f25523a.f25944a.f25268j.L() || this.f25534l.a(j10) >= 1.0d;
    }
}

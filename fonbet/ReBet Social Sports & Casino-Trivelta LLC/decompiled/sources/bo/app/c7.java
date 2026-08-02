package bo.app;

import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public abstract class c7 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f25322j = BrazeLogger.getBrazeLogTag((Class<?>) c7.class);

    /* renamed from: a, reason: collision with root package name */
    public final c9 f25323a;

    /* renamed from: b, reason: collision with root package name */
    public final q5 f25324b;

    /* renamed from: c, reason: collision with root package name */
    public long f25325c;

    /* renamed from: d, reason: collision with root package name */
    public long f25326d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f25327e;

    /* renamed from: f, reason: collision with root package name */
    public long f25328f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25329g;

    /* renamed from: h, reason: collision with root package name */
    public final x7 f25330h;

    /* renamed from: i, reason: collision with root package name */
    public xf f25331i;

    public c7(c9 destination, q5 dispatchDataProvider) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(dispatchDataProvider, "dispatchDataProvider");
        this.f25323a = destination;
        this.f25324b = dispatchDataProvider;
        this.f25327e = new ArrayList();
        int ordinal = destination.ordinal();
        this.f25329g = ordinal != 0 ? ordinal != 2 ? 0L : 75L : 25L;
        this.f25330h = new x7(dispatchDataProvider.f25944a.f25268j.j(), x7.f26259g, dispatchDataProvider.f25944a.f25268j.k(), dispatchDataProvider.f25944a.f25268j.l());
    }

    public static final String d(c7 c7Var, long j10) {
        return "New state after request success\n" + c7Var.d(j10);
    }

    public abstract void a(long j10);

    public final void a(final long j10, d9 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        request.a(this.f25324b.f25944a.f25267i);
        this.f25327e.add(new id(request, j10 + this.f25329g, j10));
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.O
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c7.a(bo.app.c7.this, j10);
            }
        }, 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final xf b() {
        Map x10;
        oe oeVar;
        ue ueVar = this.f25324b.f25944a.f25268j;
        ReentrantLock reentrantLock = ueVar.f26126c;
        reentrantLock.lock();
        try {
            re reVar = ueVar.f26128e;
            if (reVar != null) {
                x10 = reVar.f25997F;
                if (x10 == null) {
                }
                reentrantLock.unlock();
                oeVar = (oe) x10.get(this.f25323a);
                if (oeVar != null) {
                    this.f25331i = null;
                    return null;
                }
                xf xfVar = this.f25331i;
                int i10 = oeVar.f25894b;
                int i11 = oeVar.f25893a;
                if (xfVar == null) {
                    xfVar = new xf(i11, i10, wf.a(this.f25324b, "com.braze.endpointqueue.tokenbucket", String.valueOf(this.f25323a.f25347a.hashCode())));
                } else {
                    xfVar.a(i11, i10);
                }
                this.f25331i = xfVar;
                return xfVar;
            }
            x10 = ueVar.x();
            reentrantLock.unlock();
            oeVar = (oe) x10.get(this.f25323a);
            if (oeVar != null) {
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public boolean c() {
        return false;
    }

    public final void c(long j10) {
        ArrayList arrayList = this.f25327e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jd jdVar = ((id) obj).f25574d;
            jdVar.getClass();
            if (jdVar == jd.f25623a || jdVar == jd.f25624b) {
                arrayList2.add(obj);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new b7());
        if (sortedWith.size() >= 2) {
            int size2 = sortedWith.size();
            for (int i11 = 1; i11 < size2; i11++) {
                final id idVar = (id) sortedWith.get(i11);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25322j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.T
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.c7.a(bo.app.id.this);
                    }
                }, 6, (Object) null);
                idVar.a(j10, jd.f25626d);
            }
        }
    }

    public final String d(final long j10) {
        String str;
        String joinToString$default = CollectionsKt.joinToString$default(this.f25327e, "\n\n", null, null, 0, null, new Function1() { // from class: c3.S
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bo.app.c7.b(j10, (bo.app.id) obj);
            }
        }, 30, null);
        c9 c9Var = this.f25323a;
        long j11 = this.f25325c - j10;
        long j12 = this.f25326d - j10;
        long j13 = this.f25328f - j10;
        long j14 = this.f25329g;
        xf xfVar = this.f25331i;
        if (xfVar == null || (str = xfVar.toString()) == null) {
            str = "unset";
        }
        return StringsKt.trimMargin$default("\n            |EndpointQueue: " + c9Var + "\n            |   lastFailureAt = " + j11 + "\n            |   lastSuccessAt = " + j12 + "\n            |   failureBackoffUntil = " + j13 + "\n            |   pendingWaitDuration = " + j14 + "\n            |   endpointRateLimiter = " + str + "\n            |   requestInfoQueue: \n            |" + joinToString$default + "\n        ", null, 1, null);
    }

    public x7 a() {
        return this.f25330h;
    }

    public static final String a(c7 c7Var, long j10) {
        return "Added request now to queue " + c7Var.d(j10);
    }

    public static final String a(id idVar, long j10, int i10) {
        return "Set retry count for " + idVar.a(j10) + " to " + i10;
    }

    public static final String a(id idVar, long j10) {
        return "Marking request as framework complete \n" + idVar.a(j10);
    }

    public final void a(final long j10, final id requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        final xf b10 = b();
        if (b10 == null) {
            return;
        }
        long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
        double a10 = b10.a(nowInMillisecondsSystemClock);
        b10.f26289e = a10;
        vf vfVar = b10.f26287c;
        DataStoreKey dataStoreKey = DataStoreKey.TOKEN_BUCKET_CURRENT_TOKEN_COUNT;
        vfVar.writeData(dataStoreKey, Float.valueOf((float) a10));
        b10.f26288d = nowInMillisecondsSystemClock;
        b10.f26287c.writeData(DataStoreKey.TOKEN_BUCKET_LAST_CALL_AT_MS, Long.valueOf(nowInMillisecondsSystemClock));
        double d10 = b10.f26289e;
        if (d10 >= 1.0d) {
            double d11 = d10 - 1;
            b10.f26289e = d11;
            b10.f26287c.writeData(dataStoreKey, Float.valueOf((float) d11));
        }
        xf b11 = b();
        if (b11 != null && b11.a(j10) < 1.0d) {
            final long a11 = b10.a();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.U
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c7.a(bo.app.id.this, j10, a11, b10);
                }
            }, 3, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c7.b(bo.app.c7.this, j10);
            }
        }, 7, (Object) null);
    }

    public static final String c(c7 c7Var, long j10) {
        return "New state after request error " + c7Var.d(j10);
    }

    public final void b(final long j10) {
        final int i10;
        a(j10);
        ArrayList arrayList = this.f25327e;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (((id) obj).f25574d == jd.f25626d) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                int i13 = ((id) it.next()).f25578h;
                loop1: while (true) {
                    i10 = i13;
                    while (it.hasNext()) {
                        i13 = ((id) it.next()).f25578h;
                        if (i10 < i13) {
                            break;
                        }
                    }
                }
                ArrayList arrayList3 = this.f25327e;
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList3.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    jd jdVar = ((id) obj2).f25574d;
                    jdVar.getClass();
                    if (jdVar == jd.f25623a || jdVar == jd.f25624b) {
                        arrayList4.add(obj2);
                    }
                }
                int size3 = arrayList4.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    final id idVar = (id) arrayList4.get(i15);
                    idVar.f25578h = i10;
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.c7.a(bo.app.id.this, j10, i10);
                        }
                    }, 3, (Object) null);
                }
            } else {
                throw new NoSuchElementException();
            }
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = this.f25327e;
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList6.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj3 = arrayList6.get(i16);
            i16++;
            jd jdVar2 = ((id) obj3).f25574d;
            if (jdVar2 == jd.f25626d || jdVar2 == jd.f25627e) {
                arrayList7.add(obj3);
            }
        }
        arrayList5.addAll(arrayList7);
        ArrayList arrayList8 = this.f25327e;
        ArrayList arrayList9 = new ArrayList();
        int size5 = arrayList8.size();
        int i17 = 0;
        while (i17 < size5) {
            Object obj4 = arrayList8.get(i17);
            i17++;
            id idVar2 = (id) obj4;
            if (idVar2.f25578h >= 15) {
                jd jdVar3 = idVar2.f25574d;
                jdVar3.getClass();
                if (jdVar3 == jd.f25623a || jdVar3 == jd.f25624b) {
                    arrayList9.add(obj4);
                }
            }
        }
        arrayList5.addAll(arrayList9);
        int size6 = arrayList5.size();
        while (i11 < size6) {
            Object obj5 = arrayList5.get(i11);
            i11++;
            final id idVar3 = (id) obj5;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25322j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.Q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.c7.a(bo.app.id.this, j10);
                }
            }, 6, (Object) null);
            idVar3.f25571a.b(this.f25324b.f25944a.f25267i);
        }
        this.f25327e.removeAll(arrayList5);
    }

    public static final String a(id idVar, long j10, long j11, xf xfVar) {
        return "Delaying next request after '" + idVar.a(j10) + "' until next token is available in " + j11 + "ms - '" + DateTimeUtils.formatDateFromMillis$default(j10 + j11, null, null, 3, null) + "'\n" + xfVar;
    }

    public static final String a(id idVar) {
        return "About to batch request " + idVar;
    }

    public void a(final long j10, id requestInfo, j apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        nb nbVar = apiResponse instanceof nb ? (nb) apiResponse : null;
        t9 t9Var = nbVar != null ? nbVar.f25810d : null;
        Long l10 = apiResponse.f25582b;
        long longValue = l10 != null ? l10.longValue() : 0L;
        this.f25325c = j10;
        if (!(t9Var instanceof pd)) {
            x7 a10 = a();
            this.f25328f = longValue + j10 + a10.a(a10.f26261b);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25322j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.X
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c7.c(bo.app.c7.this, j10);
            }
        }, 6, (Object) null);
    }

    public void a(final long j10, id requestInfo, nb apiResponse) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        a().f26265f = 0;
        this.f25326d = j10;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f25322j, (BrazeLogger.Priority) null, (Throwable) null, c(), new Function0() { // from class: c3.W
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c7.d(bo.app.c7.this, j10);
            }
        }, 6, (Object) null);
    }

    public static final String b(c7 c7Var, long j10) {
        return c7Var.d(j10);
    }

    public static final CharSequence b(long j10, id it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.a(j10);
    }
}

package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f671a;
    public final /* synthetic */ h b;
    public final /* synthetic */ b c;

    public e(g gVar, h hVar, b bVar) {
        this.f671a = gVar;
        this.b = hVar;
        this.c = bVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.g apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ReentrantLock reentrantLock = this.f671a.g;
        final h hVar = this.b;
        b bVar = this.c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.n, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: com.braze.requests.framework.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(h.this, nowInMillisecondsSystemClock);
                }
            }, 6, (Object) null);
            hVar.a(nowInMillisecondsSystemClock, i.e);
            bVar.a(nowInMillisecondsSystemClock, hVar, apiResponse);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(h hVar, long j) {
        return "Request success received for " + hVar.a(j);
    }

    @Override // com.braze.requests.framework.c
    public final void a(com.braze.models.response.a apiResponse) {
        BrazeLogger brazeLogger;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final g gVar = this.f671a;
        ReentrantLock reentrantLock = gVar.g;
        final h hVar = this.b;
        b bVar = this.c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            com.braze.models.response.g gVar2 = apiResponse instanceof com.braze.models.response.g ? (com.braze.models.response.g) apiResponse : null;
            final com.braze.models.response.d dVar = gVar2 != null ? gVar2.d : null;
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, g.n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.e$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a(h.this, nowInMillisecondsSystemClock, dVar);
                }
            }, 14, (Object) null);
            hVar.a(nowInMillisecondsSystemClock, i.b);
            bVar.a(nowInMillisecondsSystemClock, hVar, apiResponse);
            if (dVar instanceof com.braze.models.response.h) {
                gVar.i = nowInMillisecondsSystemClock;
                gVar.h = ((com.braze.requests.b) ((com.braze.models.response.h) dVar).f654a).j;
                brazeLogger = brazeLogger2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.e$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a(g.this, hVar, nowInMillisecondsSystemClock);
                    }
                }, 7, (Object) null);
                gVar.j = nowInMillisecondsSystemClock + g.o;
            } else {
                brazeLogger = brazeLogger2;
            }
            if (dVar instanceof com.braze.models.response.e) {
                gVar.k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.e$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a(g.this);
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(h hVar, long j, com.braze.models.response.d dVar) {
        return "Request failure received " + hVar.a(j) + " \n" + dVar;
    }

    public static final String a(g gVar, h hVar, long j) {
        return "Got failed token " + gVar.d() + " for\n " + hVar.a(j);
    }

    public static final String a(g gVar) {
        return "Incremented invalidApiKeyErrorCounter to " + gVar.c().get();
    }
}

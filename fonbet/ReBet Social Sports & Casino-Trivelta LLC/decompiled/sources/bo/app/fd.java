package bo.app;

import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fd implements dd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hd f25460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ id f25461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c7 f25462c;

    public fd(hd hdVar, id idVar, c7 c7Var) {
        this.f25460a = hdVar;
        this.f25461b = idVar;
        this.f25462c = c7Var;
    }

    public static final String a(hd hdVar, id idVar, long j10) {
        return "Got failed token " + hdVar.f25530h + " for\n " + idVar.a(j10);
    }

    public static final String a(hd hdVar) {
        return "Incremented invalidApiKeyErrorCounter to " + hdVar.f25533k.get();
    }

    @Override // bo.app.dd
    public final void a(nb apiResponse) {
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        ReentrantLock reentrantLock = this.f25460a.f25529g;
        final id idVar = this.f25461b;
        c7 c7Var = this.f25462c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, hd.f25520n, (BrazeLogger.Priority) null, (Throwable) null, true, new Function0() { // from class: c3.N1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.fd.a(bo.app.id.this, nowInMillisecondsSystemClock);
                }
            }, 6, (Object) null);
            idVar.a(nowInMillisecondsSystemClock, jd.f25627e);
            c7Var.a(nowInMillisecondsSystemClock, idVar, apiResponse);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(id idVar, long j10) {
        return "Request success received for " + idVar.a(j10);
    }

    @Override // bo.app.dd
    public final void a(j apiResponse) {
        BrazeLogger brazeLogger;
        Intrinsics.checkNotNullParameter(apiResponse, "apiResponse");
        final hd hdVar = this.f25460a;
        ReentrantLock reentrantLock = hdVar.f25529g;
        final id idVar = this.f25461b;
        c7 c7Var = this.f25462c;
        reentrantLock.lock();
        try {
            final long nowInMillisecondsSystemClock = DateTimeUtils.nowInMillisecondsSystemClock();
            nb nbVar = apiResponse instanceof nb ? (nb) apiResponse : null;
            final t9 t9Var = nbVar != null ? nbVar.f25810d : null;
            BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
            BrazeLogger.brazelog$default(brazeLogger2, hd.f25520n, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.K1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.fd.a(bo.app.id.this, nowInMillisecondsSystemClock, t9Var);
                }
            }, 14, (Object) null);
            idVar.a(nowInMillisecondsSystemClock, jd.f25624b);
            c7Var.a(nowInMillisecondsSystemClock, idVar, apiResponse);
            if (t9Var instanceof pd) {
                hdVar.f25531i = nowInMillisecondsSystemClock;
                hdVar.f25530h = ((i2) ((pd) t9Var).f25907a).f25550k;
                brazeLogger = brazeLogger2;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.L1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.fd.a(bo.app.hd.this, idVar, nowInMillisecondsSystemClock);
                    }
                }, 7, (Object) null);
                hdVar.f25532j = nowInMillisecondsSystemClock + hd.f25521o;
            } else {
                brazeLogger = brazeLogger2;
            }
            if (t9Var instanceof sa) {
                hdVar.f25533k.incrementAndGet();
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.fd.a(bo.app.hd.this);
                    }
                }, 7, (Object) null);
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(id idVar, long j10, t9 t9Var) {
        return "Request failure received " + idVar.a(j10) + " \n" + t9Var;
    }
}

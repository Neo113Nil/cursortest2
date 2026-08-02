package com.braze.managers;

import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class f extends SuspendLambda implements Function1 {
    public f(Continuation continuation) {
        super(1, continuation);
    }

    public static final String a(d dVar) {
        return "Removing banner from monitor list " + dVar.a();
    }

    public static final String b(d dVar) {
        return "Error checking banner visibility for " + dVar.a() + ".Removing banner from visibility monitoring.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new f(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new f((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ReentrantLock reentrantLock = j.k;
        reentrantLock.lock();
        try {
            j.j = null;
            Iterator it = j.l.iterator();
            while (it.hasNext()) {
                final d dVar = (d) it.next();
                try {
                    if (!dVar.c) {
                        g gVar = j.h;
                        if (gVar.a(dVar)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) gVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.f$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return f.a(d.this);
                                }
                            }, 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) j.h, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.f$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f.b(d.this);
                        }
                    }, 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = j.l;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((d) it2.next()).c) {
                        g gVar2 = j.h;
                        g.d();
                        break;
                    }
                }
            }
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}

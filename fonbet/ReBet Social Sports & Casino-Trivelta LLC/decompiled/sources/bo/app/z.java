package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class z extends SuspendLambda implements Function1 {
    public z(Continuation continuation) {
        super(1, continuation);
    }

    public static final String a(x xVar) {
        return "Removing banner from monitor list " + xVar.f26211a;
    }

    public static final String b(x xVar) {
        return "Error checking banner visibility for " + xVar.f26211a + ".Removing banner from visibility monitoring.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new z(continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new z((Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ReentrantLock reentrantLock = d0.f25371m;
        reentrantLock.lock();
        try {
            d0.f25370l = null;
            Iterator it = d0.f25372n.iterator();
            while (it.hasNext()) {
                final x xVar = (x) it.next();
                try {
                    if (!xVar.f26213c) {
                        a0 a0Var = d0.f25368j;
                        if (a0Var.a(xVar)) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.xd
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.z.a(bo.app.x.this);
                                }
                            }, 7, (Object) null);
                            it.remove();
                        }
                    }
                } catch (Exception e10) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) d0.f25368j, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.yd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.z.b(bo.app.x.this);
                        }
                    }, 4, (Object) null);
                    it.remove();
                }
            }
            ArrayList arrayList = d0.f25372n;
            if (arrayList == null || !arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (!((x) obj2).f26213c) {
                        if (d0.f25370l == null) {
                            d0.f25370l = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 200L, null, new z(null), 2, null);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }
}

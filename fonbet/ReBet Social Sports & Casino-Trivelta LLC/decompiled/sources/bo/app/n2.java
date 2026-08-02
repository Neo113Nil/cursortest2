package bo.app;

import Ph.P;
import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2 f25784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f25785c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(q2 q2Var, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.f25784b = q2Var;
        this.f25785c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        n2 n2Var = new n2(this.f25784b, this.f25785c, continuation);
        n2Var.f25783a = obj;
        return n2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n2) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25783a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        q2 q2Var = this.f25784b;
        ReentrantLock reentrantLock = q2Var.f25934h;
        reentrantLock.lock();
        try {
            try {
                q2Var.j();
            } catch (Exception e10) {
                try {
                    q2Var.f25929c.b(e10, Throwable.class);
                } catch (Exception e11) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29470E, (Throwable) e11, false, new Function0() { // from class: c3.m6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.n2.a();
                        }
                    }, 4, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.f25785c.finish();
            return unit;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}

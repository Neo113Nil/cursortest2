package bo.app;

import Ph.P;
import Ph.Q;
import com.braze.support.BrazeLogger;
import java.io.BufferedReader;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j6 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f25600a;

    /* renamed from: b, reason: collision with root package name */
    public int f25601b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f25602c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BufferedReader f25603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Rh.y f25604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(BufferedReader bufferedReader, Rh.y yVar, Continuation continuation) {
        super(2, continuation);
        this.f25603d = bufferedReader;
        this.f25604e = yVar;
    }

    public static final String a() {
        return "Caught unexpected exception in dust stream producer";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j6 j6Var = new j6(this.f25603d, this.f25604e, continuation);
        j6Var.f25602c = obj;
        return j6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j6) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25602c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25601b;
        try {
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                String readLine = this.f25603d.readLine();
                if (readLine == null) {
                    return Unit.INSTANCE;
                }
                Rh.y yVar = this.f25604e;
                this.f25602c = p10;
                this.f25600a = SpillingKt.nullOutSpilledVariable(readLine);
                this.f25601b = 1;
                if (yVar.o(readLine, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e10) {
            if (Q.i(p10)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, BrazeLogger.Priority.f29469D, (Throwable) e10, false, new Function0() { // from class: c3.k4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.j6.a();
                    }
                }, 8, (Object) null);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, o6.f25853d, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.l4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.j6.a(e10);
                    }
                }, 14, (Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final String a(Exception exc) {
        return "Stream producer job cancelled " + exc;
    }
}

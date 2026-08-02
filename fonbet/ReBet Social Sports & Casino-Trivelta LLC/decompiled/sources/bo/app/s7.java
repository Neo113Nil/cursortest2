package bo.app;

import Ph.P;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s7 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f26041b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t7 f26042c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Function0 function0, t7 t7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f26041b = function0;
        this.f26042c = t7Var;
        this.f26043d = str;
    }

    public static final String a(String str) {
        return "Failed to " + str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        s7 s7Var = new s7(this.f26041b, this.f26042c, this.f26043d, continuation);
        s7Var.f26040a = obj;
        return s7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s7) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f26040a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            this.f26041b.invoke();
        } catch (Exception e10) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29470E;
            final String str = this.f26043d;
            BrazeLogger.brazelog$default(brazeLogger, (Object) p10, priority, (Throwable) e10, false, new Function0() { // from class: c3.La
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.s7.a(str);
                }
            }, 4, (Object) null);
            this.f26042c.a(e10);
        }
        return Unit.INSTANCE;
    }
}

package bo.app;

import Ph.P;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26298a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f26300c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Braze f26301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f26303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function0 f26304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(boolean z10, Braze braze, Object obj, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f26300c = z10;
        this.f26301d = braze;
        this.f26302e = obj;
        this.f26303f = function2;
        this.f26304g = function0;
    }

    public static final String a(Function0 function0) {
        return "Early returning because the Braze instance isn't fully initialized. Always use Braze.getInstance(context) to get the latest Braze instance. Please report to Braze if the issue continues. > " + function0.invoke();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        y0 y0Var = new y0(this.f26300c, this.f26301d, this.f26302e, this.f26303f, this.f26304g, continuation);
        y0Var.f26299b = obj;
        return y0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f26299b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26298a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        if (this.f26300c && this.f26301d.udm == null) {
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
            final Function0 function0 = this.f26304g;
            BrazeLogger.brazelog$default(brazeLogger, (Object) p10, priority, (Throwable) null, false, new Function0() { // from class: c3.Mc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.y0.a(Function0.this);
                }
            }, 6, (Object) null);
            return this.f26302e;
        }
        Function2 function2 = this.f26303f;
        this.f26299b = SpillingKt.nullOutSpilledVariable(p10);
        this.f26298a = 1;
        Object invoke = function2.invoke(p10, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }
}

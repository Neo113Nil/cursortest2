package bo.app;

import Ph.P;
import com.braze.BrazeUser;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f25313b = brazeUser;
        this.f25314c = str;
    }

    public static final String a(String str) {
        return "Successfully set LINE ID: " + str + ".";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        c3 c3Var = new c3(this.f25313b, this.f25314c, continuation);
        c3Var.f25312a = obj;
        return c3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c3) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        P p10 = (P) this.f25312a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25313b.userCache;
        String str = this.f25314c;
        synchronized (xgVar) {
            xgVar.c("native_line_id", str);
        }
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29473W;
        final String str2 = this.f25314c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) p10, priority, (Throwable) null, false, new Function0() { // from class: c3.C
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.c3.a(str2);
            }
        }, 6, (Object) null);
        return Unit.INSTANCE;
    }
}

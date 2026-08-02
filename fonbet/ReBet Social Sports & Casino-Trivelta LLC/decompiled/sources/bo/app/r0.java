package bo.app;

import Ph.P;
import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class r0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25962a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f25963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f25964c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(Braze braze, String str, Continuation continuation) {
        super(2, continuation);
        this.f25963b = braze;
        this.f25964c = str;
    }

    public static final String a(String str) {
        return "Getting Banner for " + str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        r0 r0Var = new r0(this.f25963b, this.f25964c, continuation);
        r0Var.f25962a = obj;
        return r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f25962a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        final String str = this.f25964c;
        BrazeLogger.brazelog$default(brazeLogger, (Object) p10, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ga
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.r0.a(str);
            }
        }, 7, (Object) null);
        return ((ah) this.f25963b.getUdm$android_sdk_base_release()).f25282x.a(this.f25964c);
    }
}

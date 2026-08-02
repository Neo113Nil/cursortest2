package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26098b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f26097a = brazeUser;
        this.f26098b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u2(this.f26097a, this.f26098b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u2(this.f26097a, this.f26098b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26097a.userCache;
        String dateString = this.f26098b;
        synchronized (xgVar) {
            Intrinsics.checkNotNullParameter(dateString, "dateString");
            xgVar.c("dob", dateString);
        }
        return Unit.INSTANCE;
    }
}

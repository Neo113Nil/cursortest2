package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26138b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f26137a = brazeUser;
        this.f26138b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v2(this.f26137a, this.f26138b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v2(this.f26137a, this.f26138b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26137a.userCache;
        String str = this.f26138b;
        synchronized (xgVar) {
            xgVar.c("email", str);
        }
        return Unit.INSTANCE;
    }
}

package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25244b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f25243a = brazeUser;
        this.f25244b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a3(this.f25243a, this.f25244b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new a3(this.f25243a, this.f25244b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25243a.userCache;
        String str = this.f25244b;
        synchronized (xgVar) {
            xgVar.c("language", str);
        }
        return Unit.INSTANCE;
    }
}

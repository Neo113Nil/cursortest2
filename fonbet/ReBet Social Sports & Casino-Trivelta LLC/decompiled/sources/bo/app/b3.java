package bo.app;

import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f25287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f25288b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f25287a = brazeUser;
        this.f25288b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b3(this.f25287a, this.f25288b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b3(this.f25287a, this.f25288b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f25287a.userCache;
        String str = this.f25288b;
        synchronized (xgVar) {
            xgVar.c("last_name", str);
        }
        return Unit.INSTANCE;
    }
}

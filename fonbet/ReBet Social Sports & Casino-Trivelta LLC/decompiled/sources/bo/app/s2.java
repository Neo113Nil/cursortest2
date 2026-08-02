package bo.app;

import com.appsflyer.AdRevenueScheme;
import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class s2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(BrazeUser brazeUser, String str, Continuation continuation) {
        super(2, continuation);
        this.f26037a = brazeUser;
        this.f26038b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s2(this.f26037a, this.f26038b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s2(this.f26037a, this.f26038b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26037a.userCache;
        String str = this.f26038b;
        synchronized (xgVar) {
            xgVar.c(AdRevenueScheme.COUNTRY, str);
        }
        return Unit.INSTANCE;
    }
}

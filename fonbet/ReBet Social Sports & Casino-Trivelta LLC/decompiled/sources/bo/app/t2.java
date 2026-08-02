package bo.app;

import Ph.P;
import com.braze.BrazeUser;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(BrazeUser brazeUser, String str, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f26068a = brazeUser;
        this.f26069b = str;
        this.f26070c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t2(this.f26068a, this.f26069b, this.f26070c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26068a.userCache;
        String key = this.f26069b;
        Object value = this.f26070c;
        synchronized (xgVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            xgVar.a(key, value);
        }
        return Unit.INSTANCE;
    }
}

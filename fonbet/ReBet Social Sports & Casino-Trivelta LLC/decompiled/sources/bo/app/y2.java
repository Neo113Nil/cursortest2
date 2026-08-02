package bo.app;

import com.braze.BrazeUser;
import com.braze.enums.Gender;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class y2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Gender f26313b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(BrazeUser brazeUser, Gender gender, Continuation continuation) {
        super(2, continuation);
        this.f26312a = brazeUser;
        this.f26313b = gender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new y2(this.f26312a, this.f26313b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y2(this.f26312a, this.f26313b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        String key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26312a.userCache;
        Gender gender = this.f26313b;
        synchronized (xgVar) {
            if (gender != null) {
                try {
                    key = gender.getKey();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                key = null;
            }
            xgVar.c("gender", key);
        }
        return Unit.INSTANCE;
    }
}

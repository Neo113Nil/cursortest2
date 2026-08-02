package bo.app;

import com.braze.BrazeUser;
import com.braze.enums.NotificationSubscriptionType;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f26153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationSubscriptionType f26154b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.f26153a = brazeUser;
        this.f26154b = notificationSubscriptionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w2(this.f26153a, this.f26154b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w2(this.f26153a, this.f26154b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xg xgVar;
        String key;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xgVar = this.f26153a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.f26154b;
        synchronized (xgVar) {
            if (notificationSubscriptionType != null) {
                try {
                    key = notificationSubscriptionType.getKey();
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                key = null;
            }
            xgVar.c("email_subscribe", key);
        }
        return Unit.INSTANCE;
    }
}

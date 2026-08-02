package com.braze;

import com.braze.enums.NotificationSubscriptionType;
import com.braze.storage.n3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class l0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f559a;
    public final /* synthetic */ NotificationSubscriptionType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(BrazeUser brazeUser, NotificationSubscriptionType notificationSubscriptionType, Continuation continuation) {
        super(2, continuation);
        this.f559a = brazeUser;
        this.b = notificationSubscriptionType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l0(this.f559a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new l0(this.f559a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n3 n3Var;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        n3Var = this.f559a.userCache;
        NotificationSubscriptionType notificationSubscriptionType = this.b;
        synchronized (n3Var) {
            n3Var.c("push_subscribe", notificationSubscriptionType != null ? notificationSubscriptionType.getJsonKey() : null);
        }
        return Unit.INSTANCE;
    }
}

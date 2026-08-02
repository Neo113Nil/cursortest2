package com.braze;

import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f545a;
    public final /* synthetic */ Braze b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f545a = iValueCallback;
        this.b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f545a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f545a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BrazeUser brazeUser;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Braze.INSTANCE.isSdkDisabledOrDelayed()) {
            this.f545a.onError();
            return Unit.INSTANCE;
        }
        IValueCallback iValueCallback = this.f545a;
        brazeUser = this.b.brazeUser;
        if (brazeUser == null) {
            Intrinsics.throwUninitializedPropertyAccessException("brazeUser");
            brazeUser = null;
        }
        iValueCallback.onSuccess(brazeUser);
        return Unit.INSTANCE;
    }
}

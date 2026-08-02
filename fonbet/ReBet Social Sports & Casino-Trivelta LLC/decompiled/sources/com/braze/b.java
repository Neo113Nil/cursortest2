package com.braze;

import bo.app.f5;
import com.braze.events.IValueCallback;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f29290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f29291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IValueCallback iValueCallback, Braze braze, Continuation continuation) {
        super(2, continuation);
        this.f29290a = iValueCallback;
        this.f29291b = braze;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b(this.f29290a, this.f29291b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b(this.f29290a, this.f29291b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (Braze.INSTANCE.isSdkDisabledOrDelayed()) {
            this.f29290a.onError();
            return Unit.INSTANCE;
        }
        this.f29290a.onSuccess(((f5) this.f29291b.getDeviceIdProvider$android_sdk_base_release()).a());
        return Unit.INSTANCE;
    }
}

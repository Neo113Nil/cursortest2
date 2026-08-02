package com.braze.models.inappmessage;

import com.braze.events.internal.f0;
import com.braze.managers.m0;
import com.braze.managers.r;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f634a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InAppMessageBase inAppMessageBase, Continuation continuation) {
        super(2, continuation);
        this.f634a = inAppMessageBase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f634a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f634a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AtomicBoolean atomicBoolean;
        m0 brazeManager;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        atomicBoolean = this.f634a.clickLogged;
        if (atomicBoolean.get() && (brazeManager = this.f634a.getBrazeManager()) != null) {
            com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(this.f634a.getTriggerId());
            Intrinsics.checkNotNullParameter(triggerEvent, "triggerEvent");
            ((com.braze.events.d) ((r) brazeManager).d).b(new f0(triggerEvent), f0.class);
        }
        return Unit.INSTANCE;
    }
}

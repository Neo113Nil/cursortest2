package com.vk.donut.video.subscription.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: DonutSubscriptionManagerImpl.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl", f = "DonutSubscriptionManagerImpl.kt", l = {110}, m = "saveSubscriptionForOwner")
/* loaded from: classes18.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DonutSubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DonutSubscriptionManagerImpl donutSubscriptionManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = donutSubscriptionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, this);
    }
}

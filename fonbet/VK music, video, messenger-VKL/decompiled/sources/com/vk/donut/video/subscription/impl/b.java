package com.vk.donut.video.subscription.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: DonutSubscriptionManagerImpl.kt */
@b6l(c = "com.vk.donut.video.subscription.impl.DonutSubscriptionManagerImpl", f = "DonutSubscriptionManagerImpl.kt", l = {88, 97}, m = "tryFetchSubscriptionAndSave")
/* loaded from: classes18.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DonutSubscriptionManagerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DonutSubscriptionManagerImpl donutSubscriptionManagerImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = donutSubscriptionManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DonutSubscriptionManagerImpl.a(this.this$0, null, this);
    }
}

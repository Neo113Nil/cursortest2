package com.vk.push.core.analytics;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: BaseAnalyticsSender.kt */
@b6l(c = "com.vk.push.core.analytics.BaseAnalyticsSender", f = "BaseAnalyticsSender.kt", l = {53, 60, 60, 66}, m = "handleEvent")
/* loaded from: classes.dex */
public final class a extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BaseAnalyticsSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BaseAnalyticsSender baseAnalyticsSender, spj<? super a> spjVar) {
        super(spjVar);
        this.this$0 = baseAnalyticsSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BaseAnalyticsSender.access$handleEvent(this.this$0, null, this);
    }
}

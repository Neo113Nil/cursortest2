package com.unity3d.ads.core.domain.events;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: UniversalRequestEventSender.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {23, 37}, m = "invoke")
/* loaded from: classes14.dex */
public final class UniversalRequestEventSender$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestEventSender this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestEventSender$invoke$1(UniversalRequestEventSender universalRequestEventSender, spj<? super UniversalRequestEventSender$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = universalRequestEventSender;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}

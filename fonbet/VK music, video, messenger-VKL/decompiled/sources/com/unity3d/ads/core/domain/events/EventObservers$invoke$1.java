package com.unity3d.ads.core.domain.events;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: EventObservers.kt */
@b6l(c = "com.unity3d.ads.core.domain.events.EventObservers", f = "EventObservers.kt", l = {14, 15}, m = "invoke")
/* loaded from: classes14.dex */
public final class EventObservers$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventObservers this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventObservers$invoke$1(EventObservers eventObservers, spj<? super EventObservers$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = eventObservers;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(this);
    }
}

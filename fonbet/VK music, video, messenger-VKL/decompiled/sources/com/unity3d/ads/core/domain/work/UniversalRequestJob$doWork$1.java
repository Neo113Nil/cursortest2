package com.unity3d.ads.core.domain.work;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: UniversalRequestJob.kt */
@b6l(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", l = {36, 43, 46}, m = "doWork$suspendImpl")
/* loaded from: classes14.dex */
public final class UniversalRequestJob$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob$doWork$1(UniversalRequestJob universalRequestJob, spj<? super UniversalRequestJob$doWork$1> spjVar) {
        super(spjVar);
        this.this$0 = universalRequestJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UniversalRequestJob.doWork$suspendImpl(this.this$0, this);
    }
}

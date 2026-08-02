package com.unity3d.ads.core.domain.work;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: OperativeEventJob.kt */
@b6l(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", l = {33}, m = "doWork")
/* loaded from: classes14.dex */
public final class OperativeEventJob$doWork$1 extends ContinuationImpl {
    long J$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperativeEventJob this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob$doWork$1(OperativeEventJob operativeEventJob, spj<? super OperativeEventJob$doWork$1> spjVar) {
        super(spjVar);
        this.this$0 = operativeEventJob;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}

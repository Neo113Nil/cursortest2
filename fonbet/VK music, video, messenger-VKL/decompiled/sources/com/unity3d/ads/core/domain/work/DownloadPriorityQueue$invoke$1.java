package com.unity3d.ads.core.domain.work;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.spj;

/* compiled from: DownloadPriorityQueue.kt */
@b6l(c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", f = "DownloadPriorityQueue.kt", l = {55, 32, 35, 72}, m = "invoke")
/* loaded from: classes14.dex */
public final class DownloadPriorityQueue$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DownloadPriorityQueue this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPriorityQueue$invoke$1(DownloadPriorityQueue downloadPriorityQueue, spj<? super DownloadPriorityQueue$invoke$1> spjVar) {
        super(spjVar);
        this.this$0 = downloadPriorityQueue;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}

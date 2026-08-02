package com.vk.push.pushsdk.work.scheduler;

import com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: DeleteTokensFromServerWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.scheduler.DeleteTokensFromServerWorker$DoWorker", f = "DeleteTokensFromServerWorker.kt", l = {55}, m = "doWork")
/* loaded from: classes5.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeleteTokensFromServerWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeleteTokensFromServerWorker.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, null, this);
    }
}

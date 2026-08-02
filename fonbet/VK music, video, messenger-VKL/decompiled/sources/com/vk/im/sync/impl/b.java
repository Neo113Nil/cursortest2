package com.vk.im.sync.impl;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: DeferredSyncWorker.kt */
@b6l(c = "com.vk.im.sync.impl.DeferredSyncWorker", f = "DeferredSyncWorker.kt", l = {61}, m = "sync")
/* loaded from: classes2.dex */
public final class b extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DeferredSyncWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DeferredSyncWorker deferredSyncWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = deferredSyncWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}

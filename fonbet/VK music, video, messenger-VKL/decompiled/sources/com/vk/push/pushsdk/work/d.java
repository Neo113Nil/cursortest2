package com.vk.push.pushsdk.work;

import com.vk.push.pushsdk.work.InitiateMasterElectionsWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: InitiateMasterElectionsWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.InitiateMasterElectionsWorker$DoWorker", f = "InitiateMasterElectionsWorker.kt", l = {53}, m = "doWork")
/* loaded from: classes5.dex */
public final class d extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitiateMasterElectionsWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InitiateMasterElectionsWorker.b bVar, ContinuationImpl continuationImpl) {
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

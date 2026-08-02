package com.vk.push.pushsdk.work;

import com.vk.push.pushsdk.work.OneTimePushReceiveWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: OneTimePushReceiveWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.OneTimePushReceiveWorker$DoWorker", f = "OneTimePushReceiveWorker.kt", l = {79}, m = "hasPushTokensInDatabase")
/* loaded from: classes5.dex */
public final class g extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneTimePushReceiveWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(OneTimePushReceiveWorker.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(this);
    }
}

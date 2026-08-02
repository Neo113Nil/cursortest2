package com.vk.push.pushsdk.work;

import com.vk.push.pushsdk.work.TokensHealthCheckWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: TokensHealthCheckWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.TokensHealthCheckWorker$DoWorker", f = "TokensHealthCheckWorker.kt", l = {179}, m = "startDeleting")
/* loaded from: classes5.dex */
public final class o extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokensHealthCheckWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(TokensHealthCheckWorker.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.g(null, this);
    }
}

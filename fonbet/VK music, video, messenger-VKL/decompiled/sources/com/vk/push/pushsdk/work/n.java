package com.vk.push.pushsdk.work;

import com.vk.push.pushsdk.work.TokensHealthCheckWorker;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: TokensHealthCheckWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.TokensHealthCheckWorker$DoWorker", f = "TokensHealthCheckWorker.kt", l = {Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 143}, m = "makeHealthCheckForApp")
/* loaded from: classes5.dex */
public final class n extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokensHealthCheckWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(TokensHealthCheckWorker.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.f(null, null, this);
    }
}

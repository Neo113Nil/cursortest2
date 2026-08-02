package com.vk.push.pushsdk.work;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.pushsdk.work.TokensHealthCheckWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;

/* compiled from: TokensHealthCheckWorker.kt */
@b6l(c = "com.vk.push.pushsdk.work.TokensHealthCheckWorker$DoWorker", f = "TokensHealthCheckWorker.kt", l = {186, PsExtractor.PRIVATE_STREAM_1}, m = "deleteFromLocalDatabase")
/* loaded from: classes5.dex */
public final class j extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TokensHealthCheckWorker.b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TokensHealthCheckWorker.b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}

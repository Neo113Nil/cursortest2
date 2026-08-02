package io.intercom.android.sdk.m5.push;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendMessageWorker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.push.SendMessageWorker", f = "SendMessageWorker.kt", i = {}, l = {31}, m = "doWork", n = {}, s = {})
/* loaded from: classes9.dex */
final class SendMessageWorker$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendMessageWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendMessageWorker$doWork$1(SendMessageWorker sendMessageWorker, Continuation<? super SendMessageWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = sendMessageWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}

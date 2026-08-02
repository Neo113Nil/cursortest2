package io.ktor.utils.io.jvm.nio;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WriteSuspendSession.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSessionKt", f = "WriteSuspendSession.kt", i = {0}, l = {43, 45, 45}, m = "writeSuspendSession", n = {"$this$writeSuspendSession"}, s = {"L$0"})
/* loaded from: classes4.dex */
final class WriteSuspendSessionKt$writeSuspendSession$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    WriteSuspendSessionKt$writeSuspendSession$1(Continuation<? super WriteSuspendSessionKt$writeSuspendSession$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return WriteSuspendSessionKt.writeSuspendSession(null, null, this);
    }
}

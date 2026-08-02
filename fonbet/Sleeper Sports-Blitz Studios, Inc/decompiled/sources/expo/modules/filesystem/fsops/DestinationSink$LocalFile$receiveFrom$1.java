package expo.modules.filesystem.fsops;

import expo.modules.filesystem.fsops.DestinationSink;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: DestinationSink.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.filesystem.fsops.DestinationSink$LocalFile", f = "DestinationSink.kt", i = {}, l = {37, 48}, m = "receiveFrom", n = {}, s = {})
/* loaded from: classes8.dex */
final class DestinationSink$LocalFile$receiveFrom$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DestinationSink.LocalFile this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DestinationSink$LocalFile$receiveFrom$1(DestinationSink.LocalFile localFile, Continuation<? super DestinationSink$LocalFile$receiveFrom$1> continuation) {
        super(continuation);
        this.this$0 = localFile;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.receiveFrom(null, this);
    }
}

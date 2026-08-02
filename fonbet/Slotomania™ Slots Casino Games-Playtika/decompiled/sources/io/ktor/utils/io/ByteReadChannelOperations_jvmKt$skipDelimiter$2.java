package io.ktor.utils.io;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.io.bytestring.ByteString;

/* compiled from: ByteReadChannelOperations.jvm.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.utils.io.ByteReadChannelOperations_jvmKt", f = "ByteReadChannelOperations.jvm.kt", i = {0, 0, 0}, l = {114}, m = "skipDelimiter", n = {"$this$skipDelimiter", TtmlNode.RUBY_DELIMITER, "i"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes5.dex */
final class ByteReadChannelOperations_jvmKt$skipDelimiter$2 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ByteReadChannelOperations_jvmKt$skipDelimiter$2(Continuation<? super ByteReadChannelOperations_jvmKt$skipDelimiter$2> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ByteReadChannelOperations_jvmKt.skipDelimiter((ByteReadChannel) null, (ByteString) null, this);
    }
}

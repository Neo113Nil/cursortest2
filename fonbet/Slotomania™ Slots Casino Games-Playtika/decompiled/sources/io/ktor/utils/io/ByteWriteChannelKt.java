package io.ktor.utils.io;

import io.ktor.utils.io.core.BytePacketBuilderKt;
import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ByteWriteChannel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/ByteWriteChannel;", "", "close", "(Lio/ktor/utils/io/ByteWriteChannel;)V", "Lio/ktor/utils/io/ByteChannel;", "cancel", "(Lio/ktor/utils/io/ByteChannel;)V", "flushIfNeeded", "(Lio/ktor/utils/io/ByteWriteChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ByteWriteChannelKt {
    @Deprecated(level = DeprecationLevel.WARNING, message = "Async close is deprecated. Please consider replacing it with flushAndClose or cancel ", replaceWith = @ReplaceWith(expression = "flushAndClose()", imports = {}))
    public static final void close(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        ByteWriteChannelOperationsKt.fireAndForget(new ByteWriteChannelKt$close$1(byteWriteChannel));
    }

    public static final void cancel(ByteChannel byteChannel) {
        Intrinsics.checkNotNullParameter(byteChannel, "<this>");
        byteChannel.cancel(new IOException("Channel was cancelled"));
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Cancel without reason is deprecated. Please provide a cause for cancellation.", replaceWith = @ReplaceWith(expression = "cancel(IOException())", imports = {"kotlinx.coroutines.cancel"}))
    public static final void cancel(ByteWriteChannel byteWriteChannel) {
        Intrinsics.checkNotNullParameter(byteWriteChannel, "<this>");
        byteWriteChannel.cancel(new IOException("Channel was cancelled"));
    }

    public static final Object flushIfNeeded(ByteWriteChannel byteWriteChannel, Continuation<? super Unit> continuation) {
        ByteReadChannelOperationsKt.rethrowCloseCauseIfNeeded(byteWriteChannel);
        ByteChannel byteChannel = byteWriteChannel instanceof ByteChannel ? (ByteChannel) byteWriteChannel : null;
        if ((byteChannel == null || !byteChannel.getAutoFlush()) && BytePacketBuilderKt.getSize(byteWriteChannel.getWriteBuffer()) < 1048576) {
            return Unit.INSTANCE;
        }
        Object flush = byteWriteChannel.flush(continuation);
        return flush == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : Unit.INSTANCE;
    }
}

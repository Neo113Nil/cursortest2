package io.ktor.util.cio;

import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperations_jvmKt;
import io.ktor.utils.io.ReaderScope;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/ReaderScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$writeChannel$1", f = "FileChannels.kt", i = {0}, l = {106}, m = "invokeSuspend", n = {"file"}, s = {"L$1"})
/* loaded from: classes5.dex */
final class FileChannelsKt$writeChannel$1 extends SuspendLambda implements Function2<ReaderScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ File $this_writeChannel;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileChannelsKt$writeChannel$1(File file, Continuation<? super FileChannelsKt$writeChannel$1> continuation) {
        super(2, continuation);
        this.$this_writeChannel = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileChannelsKt$writeChannel$1 fileChannelsKt$writeChannel$1 = new FileChannelsKt$writeChannel$1(this.$this_writeChannel, continuation);
        fileChannelsKt$writeChannel$1.L$0 = obj;
        return fileChannelsKt$writeChannel$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ReaderScope readerScope, Continuation<? super Unit> continuation) {
        return ((FileChannelsKt$writeChannel$1) create(readerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RandomAccessFile randomAccessFile;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                ReaderScope readerScope = (ReaderScope) this.L$0;
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.$this_writeChannel, "rw");
                RandomAccessFile randomAccessFile3 = randomAccessFile2;
                ByteReadChannel channel = readerScope.getChannel();
                FileChannel channel2 = randomAccessFile3.getChannel();
                Intrinsics.checkNotNullExpressionValue(channel2, "getChannel(...)");
                this.L$0 = randomAccessFile2;
                this.L$1 = randomAccessFile3;
                this.label = 1;
                obj = ByteReadChannelOperations_jvmKt.copyTo$default(channel, channel2, 0L, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                randomAccessFile = randomAccessFile3;
                r1 = randomAccessFile2;
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                randomAccessFile = (RandomAccessFile) this.L$1;
                Closeable closeable = (Closeable) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = closeable;
            }
            randomAccessFile.setLength(((Number) obj).longValue());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(r1, null);
            return Unit.INSTANCE;
        } finally {
        }
    }
}

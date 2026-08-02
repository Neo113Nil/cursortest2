package io.ktor.util.cio;

import io.ktor.utils.io.WriterScope;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lio/ktor/utils/io/WriterScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.util.cio.FileChannelsKt$readChannel$writer$1", f = "FileChannels.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class FileChannelsKt$readChannel$writer$1 extends SuspendLambda implements Function2<WriterScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $endInclusive;
    final /* synthetic */ long $fileLength;
    final /* synthetic */ Lazy<RandomAccessFile> $randomAccessFile$delegate;
    final /* synthetic */ long $start;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FileChannelsKt$readChannel$writer$1(long j, long j2, long j3, Lazy<? extends RandomAccessFile> lazy, Continuation<? super FileChannelsKt$readChannel$writer$1> continuation) {
        super(2, continuation);
        this.$start = j;
        this.$endInclusive = j2;
        this.$fileLength = j3;
        this.$randomAccessFile$delegate = lazy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FileChannelsKt$readChannel$writer$1 fileChannelsKt$readChannel$writer$1 = new FileChannelsKt$readChannel$writer$1(this.$start, this.$endInclusive, this.$fileLength, this.$randomAccessFile$delegate, continuation);
        fileChannelsKt$readChannel$writer$1.L$0 = obj;
        return fileChannelsKt$readChannel$writer$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WriterScope writerScope, Continuation<? super Unit> continuation) {
        return ((FileChannelsKt$readChannel$writer$1) create(writerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RandomAccessFile readChannel$lambda$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                WriterScope writerScope = (WriterScope) this.L$0;
                long j = this.$start;
                if (!(j >= 0)) {
                    throw new IllegalArgumentException(("start position shouldn't be negative but it is " + j).toString());
                }
                long j2 = this.$endInclusive;
                long j3 = this.$fileLength;
                if (j2 <= j3 - 1) {
                    readChannel$lambda$1 = FileChannelsKt.readChannel$lambda$1(this.$randomAccessFile$delegate);
                    RandomAccessFile randomAccessFile = readChannel$lambda$1;
                    long j4 = this.$start;
                    long j5 = this.$endInclusive;
                    FileChannel channel = randomAccessFile.getChannel();
                    Intrinsics.checkNotNullExpressionValue(channel, "getChannel(...)");
                    this.L$0 = randomAccessFile;
                    this.label = 1;
                    r1 = randomAccessFile;
                    if (FileChannelsKt.writeToScope(channel, writerScope, j4, j5, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalArgumentException(("endInclusive points to the position out of the file: file size = " + j3 + ", endInclusive = " + j2).toString());
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Closeable closeable = (Closeable) this.L$0;
                ResultKt.throwOnFailure(obj);
                r1 = closeable;
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(r1, null);
            return Unit.INSTANCE;
        } finally {
        }
    }
}

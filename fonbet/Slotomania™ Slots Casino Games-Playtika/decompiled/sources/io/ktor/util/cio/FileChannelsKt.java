package io.ktor.util.cio;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteReadChannelOperationsKt;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelOperationsKt;
import io.ktor.utils.io.ReaderScope;
import io.ktor.utils.io.WriterJob;
import io.ktor.utils.io.WriterScope;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.io.Buffer;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: FileChannels.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a,\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0080@¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Ljava/io/File;", "", TtmlNode.START, "endInclusive", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lio/ktor/utils/io/ByteReadChannel;", "readChannel", "(Ljava/io/File;JJLkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteReadChannel;", "Ljava/nio/channels/SeekableByteChannel;", "Lio/ktor/utils/io/WriterScope;", "writerScope", "", "writeToScope", "(Ljava/nio/channels/SeekableByteChannel;Lio/ktor/utils/io/WriterScope;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/ktor/utils/io/ByteWriteChannel;", "writeChannel", "(Ljava/io/File;Lkotlin/coroutines/CoroutineContext;)Lio/ktor/utils/io/ByteWriteChannel;", "Ljava/io/RandomAccessFile;", "randomAccessFile", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FileChannelsKt {
    public static /* synthetic */ ByteReadChannel readChannel$default(File file, long j, long j2, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = -1;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return readChannel(file, j3, j4, coroutineContext);
    }

    public static final ByteReadChannel readChannel(final File file, long j, long j2, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        long length = file.length();
        final Lazy lazy = LazyKt.lazy(new Function0() { // from class: io.ktor.util.cio.FileChannelsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RandomAccessFile readChannel$lambda$0;
                readChannel$lambda$0 = FileChannelsKt.readChannel$lambda$0(file);
                return readChannel$lambda$0;
            }
        });
        WriterJob writer = ByteWriteChannelOperationsKt.writer(CoroutineScopeKt.CoroutineScope(coroutineContext), new CoroutineName("file-reader").plus(coroutineContext), false, (Function2<? super WriterScope, ? super Continuation<? super Unit>, ? extends Object>) new FileChannelsKt$readChannel$writer$1(j, j2, length, lazy, null));
        ByteWriteChannelOperationsKt.invokeOnCompletion(writer, (Function1<? super Throwable, Unit>) new Function1() { // from class: io.ktor.util.cio.FileChannelsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit readChannel$lambda$2;
                readChannel$lambda$2 = FileChannelsKt.readChannel$lambda$2(Lazy.this, (Throwable) obj);
                return readChannel$lambda$2;
            }
        });
        return writer.getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile readChannel$lambda$0(File file) {
        return new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RandomAccessFile readChannel$lambda$1(Lazy<? extends RandomAccessFile> lazy) {
        return lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readChannel$lambda$2(Lazy lazy, Throwable th) {
        readChannel$lambda$1(lazy).close();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x021c, code lost:
    
        if (r12.flush(r3) == r4) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x021c -> B:11:0x021f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object writeToScope(SeekableByteChannel seekableByteChannel, WriterScope writerScope, long j, long j2, Continuation<? super Unit> continuation) {
        FileChannelsKt$writeToScope$1 fileChannelsKt$writeToScope$1;
        int i;
        SeekableByteChannel seekableByteChannel2;
        ByteWriteChannel channel;
        Ref.LongRef longRef;
        Ref.BooleanRef booleanRef;
        long j3;
        ByteWriteChannel channel2;
        Ref.BooleanRef booleanRef2;
        int read;
        if (continuation instanceof FileChannelsKt$writeToScope$1) {
            fileChannelsKt$writeToScope$1 = (FileChannelsKt$writeToScope$1) continuation;
            if ((fileChannelsKt$writeToScope$1.label & Integer.MIN_VALUE) != 0) {
                fileChannelsKt$writeToScope$1.label -= Integer.MIN_VALUE;
                Object obj = fileChannelsKt$writeToScope$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fileChannelsKt$writeToScope$1.label;
                String str = ". Should be in 0..";
                String str2 = "Invalid number of bytes written: ";
                boolean z = false;
                int i2 = 1;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j > 0) {
                        seekableByteChannel2 = seekableByteChannel;
                        seekableByteChannel2.position(j);
                    } else {
                        seekableByteChannel2 = seekableByteChannel;
                    }
                    if (j2 == -1) {
                        channel2 = writerScope.getChannel();
                        booleanRef2 = new Ref.BooleanRef();
                    } else {
                        Ref.LongRef longRef2 = new Ref.LongRef();
                        longRef2.element = j;
                        channel = writerScope.getChannel();
                        longRef = longRef2;
                        booleanRef = new Ref.BooleanRef();
                        j3 = j2;
                        if (booleanRef.element) {
                        }
                    }
                } else if (i == 1) {
                    booleanRef2 = (Ref.BooleanRef) fileChannelsKt$writeToScope$1.L$2;
                    channel2 = (ByteWriteChannel) fileChannelsKt$writeToScope$1.L$1;
                    SeekableByteChannel seekableByteChannel3 = (SeekableByteChannel) fileChannelsKt$writeToScope$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    seekableByteChannel2 = seekableByteChannel3;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j3 = fileChannelsKt$writeToScope$1.J$0;
                    booleanRef = (Ref.BooleanRef) fileChannelsKt$writeToScope$1.L$3;
                    channel = (ByteWriteChannel) fileChannelsKt$writeToScope$1.L$2;
                    longRef = (Ref.LongRef) fileChannelsKt$writeToScope$1.L$1;
                    SeekableByteChannel seekableByteChannel4 = (SeekableByteChannel) fileChannelsKt$writeToScope$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    String str3 = ". Should be in 0..";
                    String str4 = "Invalid number of bytes written: ";
                    char c = 2;
                    int i3 = 1;
                    seekableByteChannel2 = seekableByteChannel4;
                    i2 = i3;
                    str2 = str4;
                    str = str3;
                    z = false;
                    if (booleanRef.element) {
                        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                        Buffer bufferField = channel.getWriteBuffer().getBufferField();
                        Segment writableSegment = bufferField.writableSegment(i2);
                        byte[] dataAsByteArray = writableSegment.dataAsByteArray(z);
                        int limit = writableSegment.getLimit();
                        int i4 = i2;
                        ByteBuffer wrap = ByteBuffer.wrap(dataAsByteArray, limit, dataAsByteArray.length - limit);
                        Intrinsics.checkNotNull(wrap);
                        long j4 = (j3 - longRef.element) + 1;
                        str3 = str;
                        str4 = str2;
                        if (j4 < wrap.remaining()) {
                            int limit2 = wrap.limit();
                            wrap.limit(wrap.position() + ((int) j4));
                            read = seekableByteChannel2.read(wrap);
                            wrap.limit(limit2);
                        } else {
                            read = seekableByteChannel2.read(wrap);
                        }
                        if (read > 0) {
                            longRef.element += read;
                        }
                        booleanRef.element = ((read == -1 || longRef.element > j3) ? 0 : i4) ^ 1;
                        int position = wrap.position() - limit;
                        i3 = i4;
                        if (position == i3) {
                            writableSegment.writeBackData(dataAsByteArray, position);
                            writableSegment.setLimit(writableSegment.getLimit() + position);
                            bufferField.setSizeMut(bufferField.getSizeMut() + position);
                        } else {
                            if (position < 0 || position > writableSegment.getRemainingCapacity()) {
                                throw new IllegalStateException((str4 + position + str3 + writableSegment.getRemainingCapacity()).toString());
                            }
                            if (position != 0) {
                                writableSegment.writeBackData(dataAsByteArray, position);
                                writableSegment.setLimit(writableSegment.getLimit() + position);
                                bufferField.setSizeMut(bufferField.getSizeMut() + position);
                            } else if (SegmentKt.isEmpty(writableSegment)) {
                                bufferField.recycleTail();
                            }
                        }
                        fileChannelsKt$writeToScope$1.L$0 = seekableByteChannel2;
                        fileChannelsKt$writeToScope$1.L$1 = longRef;
                        fileChannelsKt$writeToScope$1.L$2 = channel;
                        fileChannelsKt$writeToScope$1.L$3 = booleanRef;
                        fileChannelsKt$writeToScope$1.J$0 = j3;
                        c = 2;
                        fileChannelsKt$writeToScope$1.label = 2;
                    } else {
                        return Unit.INSTANCE;
                    }
                }
                while (!booleanRef2.element) {
                    UnsafeBufferOperations unsafeBufferOperations2 = UnsafeBufferOperations.INSTANCE;
                    Buffer bufferField2 = channel2.getWriteBuffer().getBufferField();
                    Segment writableSegment2 = bufferField2.writableSegment(1);
                    byte[] dataAsByteArray2 = writableSegment2.dataAsByteArray(false);
                    int limit3 = writableSegment2.getLimit();
                    ByteBuffer wrap2 = ByteBuffer.wrap(dataAsByteArray2, limit3, dataAsByteArray2.length - limit3);
                    Intrinsics.checkNotNull(wrap2);
                    booleanRef2.element = !(seekableByteChannel2.read(wrap2) != -1);
                    int position2 = wrap2.position() - limit3;
                    if (position2 == 1) {
                        writableSegment2.writeBackData(dataAsByteArray2, position2);
                        writableSegment2.setLimit(writableSegment2.getLimit() + position2);
                        bufferField2.setSizeMut(bufferField2.getSizeMut() + position2);
                    } else {
                        if (position2 < 0 || position2 > writableSegment2.getRemainingCapacity()) {
                            throw new IllegalStateException(("Invalid number of bytes written: " + position2 + ". Should be in 0.." + writableSegment2.getRemainingCapacity()).toString());
                        }
                        if (position2 != 0) {
                            writableSegment2.writeBackData(dataAsByteArray2, position2);
                            writableSegment2.setLimit(writableSegment2.getLimit() + position2);
                            bufferField2.setSizeMut(bufferField2.getSizeMut() + position2);
                        } else if (SegmentKt.isEmpty(writableSegment2)) {
                            bufferField2.recycleTail();
                        }
                    }
                    fileChannelsKt$writeToScope$1.L$0 = seekableByteChannel2;
                    fileChannelsKt$writeToScope$1.L$1 = channel2;
                    fileChannelsKt$writeToScope$1.L$2 = booleanRef2;
                    fileChannelsKt$writeToScope$1.label = 1;
                    if (channel2.flush(fileChannelsKt$writeToScope$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        fileChannelsKt$writeToScope$1 = new FileChannelsKt$writeToScope$1(continuation);
        Object obj2 = fileChannelsKt$writeToScope$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fileChannelsKt$writeToScope$1.label;
        String str5 = ". Should be in 0..";
        String str22 = "Invalid number of bytes written: ";
        boolean z2 = false;
        int i22 = 1;
        if (i != 0) {
        }
        while (!booleanRef2.element) {
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ByteWriteChannel writeChannel$default(File file, CoroutineContext coroutineContext, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = Dispatchers.getIO();
        }
        return writeChannel(file, coroutineContext);
    }

    public static final ByteWriteChannel writeChannel(File file, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        return ByteReadChannelOperationsKt.reader((CoroutineScope) GlobalScope.INSTANCE, new CoroutineName("file-writer").plus(coroutineContext), true, (Function2<? super ReaderScope, ? super Continuation<? super Unit>, ? extends Object>) new FileChannelsKt$writeChannel$1(file, null)).getChannel();
    }
}

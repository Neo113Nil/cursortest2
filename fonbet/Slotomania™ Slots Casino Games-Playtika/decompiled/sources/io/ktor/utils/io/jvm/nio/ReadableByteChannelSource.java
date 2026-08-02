package io.ktor.utils.io.jvm.nio;

import com.appsflyer.AppsFlyerProperties;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.RawSource;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: Reading.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/ktor/utils/io/jvm/nio/ReadableByteChannelSource;", "Lkotlinx/io/RawSource;", "Ljava/nio/channels/ReadableByteChannel;", AppsFlyerProperties.CHANNEL, "<init>", "(Ljava/nio/channels/ReadableByteChannel;)V", "Lkotlinx/io/Buffer;", "sink", "", "byteCount", "readAtMostTo", "(Lkotlinx/io/Buffer;J)J", "", "close", "()V", "", "toString", "()Ljava/lang/String;", "Ljava/nio/channels/ReadableByteChannel;", "ktor-io"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
class ReadableByteChannelSource implements RawSource {
    private final ReadableByteChannel channel;

    public ReadableByteChannelSource(ReadableByteChannel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount <= 0) {
            return 0L;
        }
        int min = (int) Math.min(byteCount, 2147483647L);
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Segment writableSegment = sink.writableSegment(1);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        int read = this.channel.read(ByteBuffer.wrap(dataAsByteArray, limit, Math.min(min, dataAsByteArray.length - limit)));
        int max = Math.max(read, 0);
        if (max == 1) {
            writableSegment.writeBackData(dataAsByteArray, max);
            writableSegment.setLimit(writableSegment.getLimit() + max);
            sink.setSizeMut(sink.getSizeMut() + max);
        } else {
            if (max < 0 || max > writableSegment.getRemainingCapacity()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + max + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
            }
            if (max != 0) {
                writableSegment.writeBackData(dataAsByteArray, max);
                writableSegment.setLimit(writableSegment.getLimit() + max);
                sink.setSizeMut(sink.getSizeMut() + max);
            } else if (SegmentKt.isEmpty(writableSegment)) {
                sink.recycleTail();
            }
        }
        return read;
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.channel.close();
    }

    public String toString() {
        return "ReadableByteChannelSource(" + this.channel + ')';
    }
}

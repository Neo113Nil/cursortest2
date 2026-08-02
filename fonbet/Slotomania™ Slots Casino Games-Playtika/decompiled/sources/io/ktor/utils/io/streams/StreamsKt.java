package io.ktor.utils.io.streams;

import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.SinkByteWriteChannelKt;
import io.sentry.protocol.MetricSummary;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.Buffer;
import kotlinx.io.CoreKt;
import kotlinx.io.JvmCoreKt;
import kotlinx.io.Segment;
import kotlinx.io.SegmentKt;
import kotlinx.io.Sink;
import kotlinx.io.Source;
import kotlinx.io.SourcesJvmKt;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: Streams.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\n\u001a\u00020\t*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a*\u0010\n\u001a\u00020\t*\u00020\u00072\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\n\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljava/io/InputStream;", "Lkotlinx/io/Source;", "Lio/ktor/utils/io/core/Input;", "asInput", "(Ljava/io/InputStream;)Lkotlinx/io/Source;", "inputStream", "(Lkotlinx/io/Source;)Ljava/io/InputStream;", "Ljava/io/OutputStream;", "packet", "", "writePacket", "(Ljava/io/OutputStream;Lkotlinx/io/Source;)V", "Lkotlin/Function1;", "Lkotlinx/io/Sink;", "Lkotlin/ExtensionFunctionType;", "block", "(Ljava/io/OutputStream;Lkotlin/jvm/functions/Function1;)V", "", MetricSummary.JsonKeys.MIN, "readPacketAtLeast", "(Ljava/io/InputStream;I)Lkotlinx/io/Source;", "Lio/ktor/utils/io/ByteWriteChannel;", "asByteWriteChannel", "(Ljava/io/OutputStream;)Lio/ktor/utils/io/ByteWriteChannel;", "ktor-io"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamsKt {
    public static final Source asInput(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return CoreKt.buffered(JvmCoreKt.asSource(inputStream));
    }

    public static final InputStream inputStream(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return SourcesJvmKt.asInputStream(source);
    }

    public static final void writePacket(OutputStream outputStream, Source packet) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(packet, "packet");
        packet.transferTo(JvmCoreKt.asSink(outputStream));
    }

    public static final void writePacket(OutputStream outputStream, Function1<? super Sink, Unit> block) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Buffer buffer = new Buffer();
        block.invoke(buffer);
        writePacket(outputStream, buffer);
    }

    public static /* synthetic */ Source readPacketAtLeast$default(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return readPacketAtLeast(inputStream, i);
    }

    public static final Source readPacketAtLeast(InputStream inputStream, int i) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Buffer buffer = new Buffer();
        UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
        Segment writableSegment = buffer.writableSegment(i);
        byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
        int limit = writableSegment.getLimit();
        int read = inputStream.read(dataAsByteArray, limit, dataAsByteArray.length - limit);
        int i2 = read >= 0 ? read : 0;
        if (i2 == i) {
            writableSegment.writeBackData(dataAsByteArray, i2);
            writableSegment.setLimit(writableSegment.getLimit() + i2);
            buffer.setSizeMut(buffer.getSizeMut() + i2);
        } else {
            if (i2 < 0 || i2 > writableSegment.getRemainingCapacity()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i2 + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
            }
            if (i2 != 0) {
                writableSegment.writeBackData(dataAsByteArray, i2);
                writableSegment.setLimit(writableSegment.getLimit() + i2);
                buffer.setSizeMut(buffer.getSizeMut() + i2);
            } else if (SegmentKt.isEmpty(writableSegment)) {
                buffer.recycleTail();
            }
        }
        return buffer;
    }

    public static final ByteWriteChannel asByteWriteChannel(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return SinkByteWriteChannelKt.asByteWriteChannel(JvmCoreKt.asSink(outputStream));
    }
}

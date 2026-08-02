package kotlinx.io;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.bytestring.ByteString;
import kotlinx.io.bytestring.ByteStringKt;
import kotlinx.io.bytestring.unsafe.UnsafeByteStringOperations;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: ByteStrings.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\t\u001a\u0012\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\n\u001a\u00020\u0006\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\f\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\f¨\u0006\u000e"}, d2 = {"write", "", "Lkotlinx/io/Sink;", "byteString", "Lkotlinx/io/bytestring/ByteString;", "startIndex", "", "endIndex", "readByteString", "Lkotlinx/io/Source;", "byteCount", "indexOf", "", "Lkotlinx/io/Buffer;", "kotlinx-io-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ByteStringsKt {
    public static /* synthetic */ void write$default(Sink sink, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.getSize();
        }
        write(sink, byteString, i, i2);
    }

    public static final void write(Sink sink, ByteString byteString, int i, int i2) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        _UtilKt.checkBounds(byteString.getSize(), i, i2);
        if (i2 == i) {
            return;
        }
        Buffer bufferField = sink.getBufferField();
        UnsafeByteStringOperations unsafeByteStringOperations = UnsafeByteStringOperations.INSTANCE;
        byte[] data = byteString.getData();
        while (i < i2) {
            UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
            Segment writableSegment = bufferField.writableSegment(1);
            byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
            int limit = writableSegment.getLimit();
            int min = Math.min(i2 - i, dataAsByteArray.length - limit);
            int i3 = i + min;
            ArraysKt.copyInto(data, dataAsByteArray, limit, i, i3);
            if (min == 1) {
                writableSegment.writeBackData(dataAsByteArray, min);
                writableSegment.setLimit(writableSegment.getLimit() + min);
                bufferField.setSizeMut(bufferField.getSizeMut() + min);
            } else {
                if (min < 0 || min > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + min + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (min != 0) {
                    writableSegment.writeBackData(dataAsByteArray, min);
                    writableSegment.setLimit(writableSegment.getLimit() + min);
                    bufferField.setSizeMut(bufferField.getSizeMut() + min);
                } else if (SegmentKt.isEmpty(writableSegment)) {
                    bufferField.recycleTail();
                }
            }
            i = i3;
        }
        sink.hintEmit();
    }

    public static final ByteString readByteString(Source source) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UnsafeByteStringOperations.INSTANCE.wrapUnsafe(SourcesKt.readByteArray(source));
    }

    public static final ByteString readByteString(Source source, int i) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        return UnsafeByteStringOperations.INSTANCE.wrapUnsafe(SourcesKt.readByteArray(source, i));
    }

    public static /* synthetic */ long indexOf$default(Source source, ByteString byteString, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return indexOf(source, byteString, j);
    }

    public static final long indexOf(Source source, ByteString byteString, long j) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        long max = Math.max(0L, j);
        if (ByteStringKt.isEmpty(byteString)) {
            source.request(max);
            return Math.min(max, source.getBufferField().getSizeMut());
        }
        while (source.request(byteString.getSize() + max)) {
            long indexOf = indexOf(source.getBufferField(), byteString, max);
            if (indexOf >= 0) {
                return indexOf;
            }
            max = (source.getBufferField().getSizeMut() - byteString.getSize()) + 1;
        }
        return -1L;
    }

    public static /* synthetic */ long indexOf$default(Buffer buffer, ByteString byteString, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return indexOf(buffer, byteString, j);
    }

    public static final long indexOf(Buffer buffer, ByteString byteString, long j) {
        long j2;
        long j3;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        long j4 = 0;
        long max = Math.max(0L, Math.min(j, buffer.getSizeMut()));
        if (ByteStringKt.isEmpty(byteString)) {
            return max;
        }
        if (max > buffer.getSizeMut() - byteString.getSize()) {
            return -1L;
        }
        UnsafeByteStringOperations unsafeByteStringOperations = UnsafeByteStringOperations.INSTANCE;
        byte[] data = byteString.getData();
        if (buffer.getHead() == null) {
            return -1L;
        }
        if (buffer.getSizeMut() - max < max) {
            Segment tail = buffer.getTail();
            long sizeMut = buffer.getSizeMut();
            while (tail != null && sizeMut > max) {
                sizeMut -= tail.getLimit() - tail.getPos();
                if (sizeMut <= max) {
                    break;
                }
                tail = tail.getPrev();
            }
            if (sizeMut == -1) {
                return -1L;
            }
            do {
                Intrinsics.checkNotNull(tail);
                int max2 = Math.max((int) (max - sizeMut), 0);
                int indexOfBytesInbound = SegmentKt.indexOfBytesInbound(tail, data, max2);
                if (indexOfBytesInbound == -1) {
                    int indexOfBytesOutbound = SegmentKt.indexOfBytesOutbound(tail, data, Math.max(max2, (tail.getSize() - data.length) + 1));
                    if (indexOfBytesOutbound == -1) {
                        sizeMut += tail.getSize();
                        tail = tail.getNext();
                        if (tail == null) {
                            break;
                        }
                    } else {
                        j3 = indexOfBytesOutbound;
                    }
                } else {
                    j3 = indexOfBytesInbound;
                }
                return sizeMut + j3;
            } while (byteString.getSize() + sizeMut <= buffer.getSizeMut());
            return -1L;
        }
        Segment head = buffer.getHead();
        while (head != null) {
            long limit = (head.getLimit() - head.getPos()) + j4;
            if (limit > max) {
                break;
            }
            head = head.getNext();
            j4 = limit;
        }
        if (j4 == -1) {
            return -1L;
        }
        do {
            Intrinsics.checkNotNull(head);
            int max3 = Math.max((int) (max - j4), 0);
            int indexOfBytesInbound2 = SegmentKt.indexOfBytesInbound(head, data, max3);
            if (indexOfBytesInbound2 == -1) {
                int indexOfBytesOutbound2 = SegmentKt.indexOfBytesOutbound(head, data, Math.max(max3, (head.getSize() - data.length) + 1));
                if (indexOfBytesOutbound2 == -1) {
                    j4 += head.getSize();
                    head = head.getNext();
                    if (head == null) {
                        break;
                    }
                } else {
                    j2 = indexOfBytesOutbound2;
                }
            } else {
                j2 = indexOfBytesInbound2;
            }
            return j4 + j2;
        } while (byteString.getSize() + j4 <= buffer.getSizeMut());
        return -1L;
    }
}

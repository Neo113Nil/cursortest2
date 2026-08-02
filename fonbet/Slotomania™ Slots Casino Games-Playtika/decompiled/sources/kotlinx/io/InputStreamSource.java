package kotlinx.io;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.unsafe.UnsafeBufferOperations;

/* compiled from: JvmCore.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0012\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/io/InputStreamSource;", "Lkotlinx/io/RawSource;", "input", "Ljava/io/InputStream;", "<init>", "(Ljava/io/InputStream;)V", "readAtMostTo", "", "sink", "Lkotlinx/io/Buffer;", "byteCount", "close", "", "toString", "", "kotlinx-io-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
class InputStreamSource implements RawSource {
    private final InputStream input;

    public InputStreamSource(InputStream input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.input = input;
    }

    @Override // kotlinx.io.RawSource
    public long readAtMostTo(Buffer sink, long byteCount) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount == 0) {
            return 0L;
        }
        if (byteCount >= 0) {
            try {
                UnsafeBufferOperations unsafeBufferOperations = UnsafeBufferOperations.INSTANCE;
                Segment writableSegment = sink.writableSegment(1);
                int i = 0;
                byte[] dataAsByteArray = writableSegment.dataAsByteArray(false);
                long read = this.input.read(dataAsByteArray, writableSegment.getLimit(), (int) Math.min(byteCount, dataAsByteArray.length - r5));
                if (read != -1) {
                    i = (int) read;
                }
                if (i == 1) {
                    writableSegment.writeBackData(dataAsByteArray, i);
                    writableSegment.setLimit(writableSegment.getLimit() + i);
                    sink.setSizeMut(sink.getSizeMut() + i);
                    return read;
                }
                if (i < 0 || i > writableSegment.getRemainingCapacity()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + i + ". Should be in 0.." + writableSegment.getRemainingCapacity()).toString());
                }
                if (i != 0) {
                    writableSegment.writeBackData(dataAsByteArray, i);
                    writableSegment.setLimit(writableSegment.getLimit() + i);
                    sink.setSizeMut(sink.getSizeMut() + i);
                    return read;
                }
                if (SegmentKt.isEmpty(writableSegment)) {
                    sink.recycleTail();
                }
                return read;
            } catch (AssertionError e) {
                if (JvmCoreKt.isAndroidGetsocknameError(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        throw new IllegalArgumentException(("byteCount (" + byteCount + ") < 0").toString());
    }

    @Override // kotlinx.io.RawSource, java.lang.AutoCloseable
    public void close() {
        this.input.close();
    }

    public String toString() {
        return "RawSource(" + this.input + ')';
    }
}

package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ZstdOutputStreamNoFinalizer extends FilterOutputStream {
    private static final int dstSize;
    private final BufferPool bufferPool;
    private boolean closeFrameOnFlush;
    private final byte[] dst;
    private final ByteBuffer dstByteBuffer;
    private long dstPos;
    private boolean frameClosed;
    private boolean frameStarted;
    private boolean isClosed;
    private long srcPos;
    private final long stream;

    static {
        Native.load();
        dstSize = (int) recommendedCOutSize();
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, int i) throws IOException {
        this(outputStream, NoPool.INSTANCE);
        Zstd.setCompressionLevel(this.stream, i);
    }

    private native int compressStream(long j, byte[] bArr, int i, byte[] bArr2, int i2);

    private static native long createCStream();

    private native int endStream(long j, byte[] bArr, int i);

    private native int flushStream(long j, byte[] bArr, int i);

    private static native int freeCStream(long j);

    public static native long recommendedCOutSize();

    private native int resetCStream(long j);

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        close(true);
    }

    public synchronized void closeWithoutClosingParentStream() throws IOException {
        close(false);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws IOException {
        int flushStream;
        int endStream;
        try {
            if (this.isClosed) {
                throw new IOException("StreamClosed");
            }
            if (!this.frameClosed) {
                if (this.closeFrameOnFlush) {
                    do {
                        endStream = endStream(this.stream, this.dst, dstSize);
                        long j = endStream;
                        if (Zstd.isError(j)) {
                            throw new ZstdIOException(j);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (endStream > 0);
                    this.frameClosed = true;
                } else {
                    do {
                        flushStream = flushStream(this.stream, this.dst, dstSize);
                        long j2 = flushStream;
                        if (Zstd.isError(j2)) {
                            throw new ZstdIOException(j2);
                        }
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } while (flushStream > 0);
                }
                ((FilterOutputStream) this).out.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ZstdOutputStreamNoFinalizer setChainLog(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChainLog = Zstd.setCompressionChainLog(this.stream, i);
            if (Zstd.isError(compressionChainLog)) {
                throw new ZstdIOException(compressionChainLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setChecksum(boolean z) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionChecksums = Zstd.setCompressionChecksums(this.stream, z);
            if (Zstd.isError(compressionChecksums)) {
                throw new ZstdIOException(compressionChecksums);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setCloseFrameOnFlush(boolean z) {
        if (!this.frameClosed) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.closeFrameOnFlush = z;
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long loadDictCompress = Zstd.loadDictCompress(this.stream, bArr, bArr.length);
            if (Zstd.isError(loadDictCompress)) {
                throw new ZstdIOException(loadDictCompress);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setHashLog(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionHashLog = Zstd.setCompressionHashLog(this.stream, i);
            if (Zstd.isError(compressionHashLog)) {
                throw new ZstdIOException(compressionHashLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setJobSize(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionJobSize = Zstd.setCompressionJobSize(this.stream, i);
            if (Zstd.isError(compressionJobSize)) {
                throw new ZstdIOException(compressionJobSize);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLevel(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLevel = Zstd.setCompressionLevel(this.stream, i);
            if (Zstd.isError(compressionLevel)) {
                throw new ZstdIOException(compressionLevel);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setLong(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionLong = Zstd.setCompressionLong(this.stream, i);
            if (Zstd.isError(compressionLong)) {
                throw new ZstdIOException(compressionLong);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setMinMatch(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionMinMatch = Zstd.setCompressionMinMatch(this.stream, i);
            if (Zstd.isError(compressionMinMatch)) {
                throw new ZstdIOException(compressionMinMatch);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setOverlapLog(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionOverlapLog = Zstd.setCompressionOverlapLog(this.stream, i);
            if (Zstd.isError(compressionOverlapLog)) {
                throw new ZstdIOException(compressionOverlapLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setSearchLog(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionSearchLog = Zstd.setCompressionSearchLog(this.stream, i);
            if (Zstd.isError(compressionSearchLog)) {
                throw new ZstdIOException(compressionSearchLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setStrategy(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionStrategy = Zstd.setCompressionStrategy(this.stream, i);
            if (Zstd.isError(compressionStrategy)) {
                throw new ZstdIOException(compressionStrategy);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setTargetLength(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionTargetLength = Zstd.setCompressionTargetLength(this.stream, i);
            if (Zstd.isError(compressionTargetLength)) {
                throw new ZstdIOException(compressionTargetLength);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWindowLog(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWindowLog = Zstd.setCompressionWindowLog(this.stream, i);
            if (Zstd.isError(compressionWindowLog)) {
                throw new ZstdIOException(compressionWindowLog);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public synchronized ZstdOutputStreamNoFinalizer setWorkers(int i) throws IOException {
        try {
            if (!this.frameClosed) {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
            long compressionWorkers = Zstd.setCompressionWorkers(this.stream, i);
            if (Zstd.isError(compressionWorkers)) {
                throw new ZstdIOException(compressionWorkers);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        Throwable th;
        try {
            try {
                if (this.isClosed) {
                    throw new IOException("StreamClosed");
                }
                if (this.frameClosed) {
                    try {
                        long resetCStream = resetCStream(this.stream);
                        if (Zstd.isError(resetCStream)) {
                            throw new ZstdIOException(resetCStream);
                        }
                        this.frameClosed = false;
                        this.frameStarted = true;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                int i3 = i + i2;
                this.srcPos = i;
                while (this.srcPos < i3) {
                    byte[] bArr2 = bArr;
                    long compressStream = compressStream(this.stream, this.dst, dstSize, bArr2, i3);
                    if (Zstd.isError(compressStream)) {
                        throw new ZstdIOException(compressStream);
                    }
                    long j = this.dstPos;
                    if (j > 0) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) j);
                    }
                    bArr = bArr2;
                }
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream) throws IOException {
        this(outputStream, NoPool.INSTANCE);
    }

    private void close(boolean z) throws IOException {
        int endStream;
        if (this.isClosed) {
            return;
        }
        try {
            if (!this.frameStarted) {
                long resetCStream = resetCStream(this.stream);
                if (!Zstd.isError(resetCStream)) {
                    this.frameClosed = false;
                } else {
                    throw new ZstdIOException(resetCStream);
                }
            }
            if (!this.frameClosed) {
                do {
                    endStream = endStream(this.stream, this.dst, dstSize);
                    long j = endStream;
                    if (!Zstd.isError(j)) {
                        ((FilterOutputStream) this).out.write(this.dst, 0, (int) this.dstPos);
                    } else {
                        throw new ZstdIOException(j);
                    }
                } while (endStream > 0);
            }
            if (z) {
                ((FilterOutputStream) this).out.close();
            }
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
        } catch (Throwable th) {
            this.isClosed = true;
            this.bufferPool.release(this.dstByteBuffer);
            freeCStream(this.stream);
            throw th;
        }
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool, int i) throws IOException {
        this(outputStream, bufferPool);
        Zstd.setCompressionLevel(this.stream, i);
    }

    public ZstdOutputStreamNoFinalizer(OutputStream outputStream, BufferPool bufferPool) throws IOException {
        super(outputStream);
        this.srcPos = 0L;
        this.dstPos = 0L;
        this.isClosed = false;
        this.closeFrameOnFlush = false;
        this.frameClosed = true;
        this.frameStarted = false;
        this.stream = createCStream();
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, dstSize);
        this.dstByteBuffer = arrayBackedBuffer;
        this.dst = arrayBackedBuffer.array();
    }

    public synchronized ZstdOutputStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) throws IOException {
        try {
            if (this.frameClosed) {
                long loadFastDictCompress = Zstd.loadFastDictCompress(this.stream, zstdDictCompress);
                if (Zstd.isError(loadFastDictCompress)) {
                    throw new ZstdIOException(loadFastDictCompress);
                }
            } else {
                throw new IllegalStateException("Change of parameter on initialized stream");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }
}

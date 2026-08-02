package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ZstdDirectBufferCompressingStreamNoFinalizer implements Closeable, Flushable {
    private int level;
    private final long stream;
    private ByteBuffer target;
    private int consumed = 0;
    private int produced = 0;
    private boolean closed = false;
    private boolean initialized = false;
    private byte[] dict = null;
    private ZstdDictCompress fastDict = null;

    static {
        Native.load();
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer(ByteBuffer byteBuffer, int i) throws IOException {
        this.level = Zstd.defaultCompressionLevel();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Target buffer should be a direct buffer");
        }
        this.target = byteBuffer;
        this.level = i;
        this.stream = createCStream();
    }

    private native long compressDirectByteBuffer(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private static native long createCStream();

    private native long endStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private native long flushStream(long j, ByteBuffer byteBuffer, int i, int i2);

    private static native long freeCStream(long j);

    private native long initCStream(long j, int i);

    private native long initCStreamWithDict(long j, byte[] bArr, int i, int i2);

    private native long initCStreamWithFastDict(long j, ZstdDictCompress zstdDictCompress);

    private static native long recommendedCOutSize();

    public static int recommendedOutputBufferSize() {
        return (int) recommendedCOutSize();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long endStream;
        if (this.closed) {
            return;
        }
        try {
            if (this.initialized) {
                do {
                    long j = this.stream;
                    ByteBuffer byteBuffer = this.target;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    try {
                        endStream = zstdDirectBufferCompressingStreamNoFinalizer.endStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                        if (Zstd.isError(endStream)) {
                            throw new ZstdIOException(endStream);
                        }
                        ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
                        byteBuffer2.position(byteBuffer2.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
                        ByteBuffer flushBuffer = flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                        zstdDirectBufferCompressingStreamNoFinalizer.target = flushBuffer;
                        if (!flushBuffer.isDirect()) {
                            throw new IllegalArgumentException("Target buffer should be a direct buffer");
                        }
                        if (endStream > 0 && !zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                            throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                        }
                    } catch (Throwable th) {
                        th = th;
                        freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
                        zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
                        zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
                        zstdDirectBufferCompressingStreamNoFinalizer.target = null;
                        throw th;
                    }
                } while (endStream > 0);
            } else {
                zstdDirectBufferCompressingStreamNoFinalizer = this;
            }
            freeCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream);
            zstdDirectBufferCompressingStreamNoFinalizer.closed = true;
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = false;
            zstdDirectBufferCompressingStreamNoFinalizer.target = null;
        } catch (Throwable th2) {
            th = th2;
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        }
    }

    public void compress(ByteBuffer byteBuffer) throws IOException {
        ZstdDirectBufferCompressingStreamNoFinalizer zstdDirectBufferCompressingStreamNoFinalizer;
        long initCStream;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Source buffer should be a direct buffer");
        }
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.initialized) {
            zstdDirectBufferCompressingStreamNoFinalizer = this;
        } else {
            ZstdDictCompress zstdDictCompress = this.fastDict;
            if (zstdDictCompress != null) {
                zstdDictCompress.acquireSharedLock();
                try {
                    long initCStreamWithFastDict = initCStreamWithFastDict(this.stream, zstdDictCompress);
                    zstdDictCompress.releaseSharedLock();
                    initCStream = initCStreamWithFastDict;
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                } catch (Throwable th) {
                    zstdDictCompress.releaseSharedLock();
                    throw th;
                }
            } else {
                byte[] bArr = this.dict;
                if (bArr != null) {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    initCStream = zstdDirectBufferCompressingStreamNoFinalizer.initCStreamWithDict(this.stream, bArr, bArr.length, this.level);
                } else {
                    zstdDirectBufferCompressingStreamNoFinalizer = this;
                    initCStream = initCStream(zstdDirectBufferCompressingStreamNoFinalizer.stream, zstdDirectBufferCompressingStreamNoFinalizer.level);
                }
            }
            if (Zstd.isError(initCStream)) {
                throw new ZstdIOException(initCStream);
            }
            zstdDirectBufferCompressingStreamNoFinalizer.initialized = true;
        }
        while (byteBuffer.hasRemaining()) {
            if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                ByteBuffer flushBuffer = flushBuffer(zstdDirectBufferCompressingStreamNoFinalizer.target);
                zstdDirectBufferCompressingStreamNoFinalizer.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (!zstdDirectBufferCompressingStreamNoFinalizer.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            }
            long j = zstdDirectBufferCompressingStreamNoFinalizer.stream;
            ByteBuffer byteBuffer2 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            ByteBuffer byteBuffer3 = byteBuffer;
            long compressDirectByteBuffer = zstdDirectBufferCompressingStreamNoFinalizer.compressDirectByteBuffer(j, byteBuffer2, byteBuffer2.position(), zstdDirectBufferCompressingStreamNoFinalizer.target.remaining(), byteBuffer3, byteBuffer.position(), byteBuffer.remaining());
            if (Zstd.isError(compressDirectByteBuffer)) {
                throw new ZstdIOException(compressDirectByteBuffer);
            }
            ByteBuffer byteBuffer4 = zstdDirectBufferCompressingStreamNoFinalizer.target;
            byteBuffer4.position(byteBuffer4.position() + zstdDirectBufferCompressingStreamNoFinalizer.produced);
            byteBuffer3.position(byteBuffer3.position() + zstdDirectBufferCompressingStreamNoFinalizer.consumed);
            byteBuffer = byteBuffer3;
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        long flushStream;
        if (this.closed) {
            throw new IOException("Already closed");
        }
        if (this.initialized) {
            do {
                long j = this.stream;
                ByteBuffer byteBuffer = this.target;
                flushStream = flushStream(j, byteBuffer, byteBuffer.position(), this.target.remaining());
                if (Zstd.isError(flushStream)) {
                    throw new ZstdIOException(flushStream);
                }
                ByteBuffer byteBuffer2 = this.target;
                byteBuffer2.position(byteBuffer2.position() + this.produced);
                ByteBuffer flushBuffer = flushBuffer(this.target);
                this.target = flushBuffer;
                if (!flushBuffer.isDirect()) {
                    throw new IllegalArgumentException("Target buffer should be a direct buffer");
                }
                if (flushStream > 0 && !this.target.hasRemaining()) {
                    throw new IOException("The target buffer has no more space, even after flushing, and there are still bytes to compress");
                }
            } while (flushStream > 0);
        }
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(byte[] bArr) {
        if (this.initialized) {
            throw new IllegalStateException("Change of parameter on initialized stream");
        }
        this.dict = bArr;
        this.fastDict = null;
        return this;
    }

    public ZstdDirectBufferCompressingStreamNoFinalizer setDict(ZstdDictCompress zstdDictCompress) {
        if (!this.initialized) {
            this.dict = null;
            this.fastDict = zstdDictCompress;
            return this;
        }
        throw new IllegalStateException("Change of parameter on initialized stream");
    }

    public ByteBuffer flushBuffer(ByteBuffer byteBuffer) throws IOException {
        return byteBuffer;
    }
}

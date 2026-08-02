package com.github.luben.zstd;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public abstract class BaseZstdBufferDecompressingStreamNoFinalizer implements Closeable {
    private int consumed;
    private int produced;
    protected ByteBuffer source;
    protected long stream;
    protected boolean closed = false;
    private boolean finishedFrame = false;
    private boolean streamEnd = false;

    public BaseZstdBufferDecompressingStreamNoFinalizer(ByteBuffer byteBuffer) {
        this.source = byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.closed) {
            return;
        }
        try {
            freeDStream(this.stream);
        } finally {
            this.closed = true;
            this.source = null;
        }
    }

    public abstract long createDStream();

    public abstract long decompressStream(long j, ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public abstract long freeDStream(long j);

    public boolean hasRemaining() {
        if (this.streamEnd) {
            return false;
        }
        return this.source.hasRemaining() || !this.finishedFrame;
    }

    public abstract long initDStream(long j);

    public abstract int read(ByteBuffer byteBuffer) throws IOException;

    public int readInternal(ByteBuffer byteBuffer, boolean z) throws IOException {
        if (this.closed) {
            throw new IOException("Stream closed");
        }
        if (this.streamEnd) {
            return 0;
        }
        long j = this.stream;
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.source;
        long decompressStream = decompressStream(j, byteBuffer, position, remaining, byteBuffer2, byteBuffer2.position(), this.source.remaining());
        if (Zstd.isError(decompressStream)) {
            throw new ZstdIOException(decompressStream);
        }
        ByteBuffer byteBuffer3 = this.source;
        byteBuffer3.position(byteBuffer3.position() + this.consumed);
        byteBuffer.position(byteBuffer.position() + this.produced);
        if (!this.source.hasRemaining()) {
            ByteBuffer refill = refill(this.source);
            this.source = refill;
            if (!z && refill.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a non-direct buffer");
            }
            if (z && !this.source.isDirect()) {
                throw new IllegalArgumentException("Source buffer should be a direct buffer");
            }
        }
        boolean z2 = decompressStream == 0;
        this.finishedFrame = z2;
        if (z2) {
            this.streamEnd = !this.source.hasRemaining();
        }
        return this.produced;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(byte[] bArr) throws IOException {
        long loadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(loadDictDecompress)) {
            throw new ZstdIOException(loadDictDecompress);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setLongMax(int i) throws IOException {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public BaseZstdBufferDecompressingStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) throws IOException {
        zstdDictDecompress.acquireSharedLock();
        try {
            long loadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (Zstd.isError(loadFastDictDecompress)) {
                throw new ZstdIOException(loadFastDictDecompress);
            }
            return this;
        } finally {
            zstdDictDecompress.releaseSharedLock();
        }
    }

    public ByteBuffer refill(ByteBuffer byteBuffer) {
        return byteBuffer;
    }
}

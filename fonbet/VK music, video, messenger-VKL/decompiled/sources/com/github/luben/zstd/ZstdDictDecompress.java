package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class ZstdDictDecompress extends SharedDictBase {
    private long nativePtr;
    private ByteBuffer sharedDict;

    static {
        Native.load();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    private native void initDirect(ByteBuffer byteBuffer, int i, int i2, int i3);

    @Override // com.github.luben.zstd.AutoCloseBase, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // com.github.luben.zstd.AutoCloseBase
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
            this.sharedDict = null;
        }
    }

    public ByteBuffer getByReferenceBuffer() {
        return this.sharedDict;
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        init(bArr, i, i2);
        if (this.nativePtr == 0) {
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        storeFence();
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer) {
        this(byteBuffer, false);
    }

    public ZstdDictDecompress(ByteBuffer byteBuffer, boolean z) {
        this.nativePtr = 0L;
        this.sharedDict = null;
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (limit >= 0) {
            initDirect(byteBuffer, byteBuffer.position(), limit, z ? 1 : 0);
            if (this.nativePtr != 0) {
                if (z) {
                    this.sharedDict = byteBuffer;
                }
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createDDict failed");
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }
}

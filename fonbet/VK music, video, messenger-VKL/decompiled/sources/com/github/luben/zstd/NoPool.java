package com.github.luben.zstd;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class NoPool implements BufferPool {
    public static final BufferPool INSTANCE = new NoPool();

    private NoPool() {
    }

    @Override // com.github.luben.zstd.BufferPool
    public ByteBuffer get(int i) {
        return ByteBuffer.allocate(i);
    }

    @Override // com.github.luben.zstd.BufferPool
    public void release(ByteBuffer byteBuffer) {
    }
}

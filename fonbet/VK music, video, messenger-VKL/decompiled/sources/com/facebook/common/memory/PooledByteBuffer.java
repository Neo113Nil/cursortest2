package com.facebook.common.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public interface PooledByteBuffer extends Closeable {

    public static class ClosedException extends RuntimeException {
        public ClosedException() {
            super("Invalid bytebuf. Already closed");
        }
    }

    ByteBuffer D();

    byte F(int i);

    int a(int i, int i2, int i3, byte[] bArr);

    long getNativePtr();

    boolean isClosed();

    int size();
}

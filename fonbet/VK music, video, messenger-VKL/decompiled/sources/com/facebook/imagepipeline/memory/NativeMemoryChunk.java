package com.facebook.imagepipeline.memory;

import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import com.facebook.soloader.nativeloader.NativeLoader;
import java.io.Closeable;
import java.nio.ByteBuffer;
import xsna.d02;
import xsna.s220;
import xsna.sex0;
import xsna.zsn;

@zsn
/* loaded from: classes.dex */
public class NativeMemoryChunk implements s220, Closeable {
    public final long b;
    public final int c;
    public boolean d;

    static {
        NativeLoader.loadLibrary(ImagePipelineNativeLoader.DSO_NAME);
    }

    public NativeMemoryChunk(int i) {
        sex0.a(Boolean.valueOf(i > 0));
        this.c = i;
        this.b = nativeAllocate(i);
        this.d = false;
    }

    @zsn
    private static native long nativeAllocate(int i);

    @zsn
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @zsn
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @zsn
    private static native void nativeFree(long j);

    @zsn
    private static native void nativeMemcpy(long j, long j2, int i);

    @zsn
    private static native byte nativeReadByte(long j);

    @Override // xsna.s220
    public final ByteBuffer D() {
        return null;
    }

    @Override // xsna.s220
    public final synchronized byte F(int i) {
        boolean z = true;
        sex0.f(!isClosed());
        if (!(i >= 0)) {
            throw new IllegalArgumentException();
        }
        if (i >= this.c) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException();
        }
        return nativeReadByte(this.b + i);
    }

    @Override // xsna.s220
    public final synchronized int a(int i, int i2, int i3, byte[] bArr) {
        int i4;
        sex0.f(!isClosed());
        i4 = d02.i(i, i3, this.c);
        d02.m(i, bArr.length, i2, i4, this.c);
        nativeCopyToByteArray(this.b + i, bArr, i2, i4);
        return i4;
    }

    @Override // xsna.s220
    public final void b(s220 s220Var, int i) {
        s220Var.getClass();
        if (s220Var.m() == this.b) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(s220Var));
            Long.toHexString(this.b);
            sex0.a(Boolean.FALSE);
        }
        if (s220Var.m() < this.b) {
            synchronized (s220Var) {
                synchronized (this) {
                    h(s220Var, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (s220Var) {
                    h(s220Var, i);
                }
            }
        }
    }

    @Override // xsna.s220
    public final synchronized int c(int i, int i2, int i3, byte[] bArr) {
        int i4;
        sex0.f(!isClosed());
        i4 = d02.i(i, i3, this.c);
        d02.m(i, bArr.length, i2, i4, this.c);
        nativeCopyFromByteArray(this.b + i, bArr, i2, i4);
        return i4;
    }

    @Override // xsna.s220, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.d) {
            this.d = true;
            nativeFree(this.b);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // xsna.s220
    public final long getNativePtr() {
        return this.b;
    }

    @Override // xsna.s220
    public final int getSize() {
        return this.c;
    }

    public final void h(s220 s220Var, int i) {
        if (!(s220Var instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        sex0.f(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) s220Var;
        sex0.f(!nativeMemoryChunk.isClosed());
        d02.m(0, nativeMemoryChunk.c, 0, i, this.c);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.b + j, this.b + j, i);
    }

    @Override // xsna.s220
    public final synchronized boolean isClosed() {
        return this.d;
    }

    @Override // xsna.s220
    public final long m() {
        return this.b;
    }

    public NativeMemoryChunk() {
        this.c = 0;
        this.b = 0L;
        this.d = true;
    }
}

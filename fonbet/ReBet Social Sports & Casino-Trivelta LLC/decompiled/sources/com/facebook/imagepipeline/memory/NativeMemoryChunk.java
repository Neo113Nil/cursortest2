package com.facebook.imagepipeline.memory;

import D6.d;
import D6.k;
import K7.A;
import K7.C;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import x8.AbstractC6803a;

@d
/* loaded from: classes2.dex */
public class NativeMemoryChunk implements A, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final long f30581a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30582b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30583c;

    static {
        AbstractC6803a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i10) {
        k.b(Boolean.valueOf(i10 > 0));
        this.f30582b = i10;
        this.f30581a = nativeAllocate(i10);
        this.f30583c = false;
    }

    private void B(int i10, A a10, int i11, int i12) {
        if (!(a10 instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        k.i(!isClosed());
        k.i(!a10.isClosed());
        C.b(i10, a10.getSize(), i11, i12, this.f30582b);
        nativeMemcpy(a10.u() + i11, this.f30581a + i10, i12);
    }

    @d
    private static native long nativeAllocate(int i10);

    @d
    private static native void nativeCopyFromByteArray(long j10, byte[] bArr, int i10, int i11);

    @d
    private static native void nativeCopyToByteArray(long j10, byte[] bArr, int i10, int i11);

    @d
    private static native void nativeFree(long j10);

    @d
    private static native void nativeMemcpy(long j10, long j11, int i10);

    @d
    private static native byte nativeReadByte(long j10);

    @Override // K7.A, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f30583c) {
            this.f30583c = true;
            nativeFree(this.f30581a);
        }
    }

    @Override // K7.A
    public long d() {
        return this.f30581a;
    }

    public void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // K7.A
    public int getSize() {
        return this.f30582b;
    }

    @Override // K7.A
    public synchronized int i(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        a10 = C.a(i10, i12, this.f30582b);
        C.b(i10, bArr.length, i11, a10, this.f30582b);
        nativeCopyToByteArray(this.f30581a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public synchronized boolean isClosed() {
        return this.f30583c;
    }

    @Override // K7.A
    public ByteBuffer j() {
        return null;
    }

    @Override // K7.A
    public synchronized int k(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        k.g(bArr);
        k.i(!isClosed());
        a10 = C.a(i10, i12, this.f30582b);
        C.b(i10, bArr.length, i11, a10, this.f30582b);
        nativeCopyFromByteArray(this.f30581a + i10, bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public void r(int i10, A a10, int i11, int i12) {
        k.g(a10);
        if (a10.d() == d()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(a10)) + " which share the same address " + Long.toHexString(this.f30581a));
            k.b(Boolean.FALSE);
        }
        if (a10.d() < d()) {
            synchronized (a10) {
                synchronized (this) {
                    B(i10, a10, i11, i12);
                }
            }
        } else {
            synchronized (this) {
                synchronized (a10) {
                    B(i10, a10, i11, i12);
                }
            }
        }
    }

    @Override // K7.A
    public synchronized byte s(int i10) {
        boolean z10 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f30582b) {
            z10 = false;
        }
        k.b(Boolean.valueOf(z10));
        return nativeReadByte(this.f30581a + i10);
    }

    @Override // K7.A
    public long u() {
        return this.f30581a;
    }

    public NativeMemoryChunk() {
        this.f30582b = 0;
        this.f30581a = 0L;
        this.f30583c = true;
    }
}

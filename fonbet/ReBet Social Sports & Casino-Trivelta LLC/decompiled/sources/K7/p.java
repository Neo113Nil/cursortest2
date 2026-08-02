package K7;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class p implements A, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public ByteBuffer f6339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6340b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6341c = System.identityHashCode(this);

    public p(int i10) {
        this.f6339a = ByteBuffer.allocateDirect(i10);
        this.f6340b = i10;
    }

    private void B(int i10, A a10, int i11, int i12) {
        if (!(a10 instanceof p)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        D6.k.i(!isClosed());
        D6.k.i(!a10.isClosed());
        D6.k.g(this.f6339a);
        C.b(i10, a10.getSize(), i11, i12, this.f6340b);
        this.f6339a.position(i10);
        ByteBuffer byteBuffer = (ByteBuffer) D6.k.g(a10.j());
        byteBuffer.position(i11);
        byte[] bArr = new byte[i12];
        this.f6339a.get(bArr, 0, i12);
        byteBuffer.put(bArr, 0, i12);
    }

    @Override // K7.A, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f6339a = null;
    }

    @Override // K7.A
    public long d() {
        return this.f6341c;
    }

    @Override // K7.A
    public int getSize() {
        return this.f6340b;
    }

    @Override // K7.A
    public synchronized int i(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        D6.k.g(bArr);
        D6.k.i(!isClosed());
        D6.k.g(this.f6339a);
        a10 = C.a(i10, i12, this.f6340b);
        C.b(i10, bArr.length, i11, a10, this.f6340b);
        this.f6339a.position(i10);
        this.f6339a.get(bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public synchronized boolean isClosed() {
        return this.f6339a == null;
    }

    @Override // K7.A
    public synchronized ByteBuffer j() {
        return this.f6339a;
    }

    @Override // K7.A
    public synchronized int k(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        D6.k.g(bArr);
        D6.k.i(!isClosed());
        D6.k.g(this.f6339a);
        a10 = C.a(i10, i12, this.f6340b);
        C.b(i10, bArr.length, i11, a10, this.f6340b);
        this.f6339a.position(i10);
        this.f6339a.put(bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public void r(int i10, A a10, int i11, int i12) {
        D6.k.g(a10);
        if (a10.d() == d()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(d()) + " to BufferMemoryChunk " + Long.toHexString(a10.d()) + " which are the same ");
            D6.k.b(Boolean.FALSE);
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
        D6.k.i(!isClosed());
        D6.k.b(Boolean.valueOf(i10 >= 0));
        if (i10 >= this.f6340b) {
            z10 = false;
        }
        D6.k.b(Boolean.valueOf(z10));
        D6.k.g(this.f6339a);
        return this.f6339a.get(i10);
    }

    @Override // K7.A
    public long u() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }
}

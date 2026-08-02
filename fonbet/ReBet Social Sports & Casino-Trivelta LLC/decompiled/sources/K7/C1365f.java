package K7;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: K7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1365f implements A, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public SharedMemory f6301a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f6302b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6303c;

    public C1365f(int i10) {
        SharedMemory create;
        ByteBuffer mapReadWrite;
        D6.k.b(Boolean.valueOf(i10 > 0));
        try {
            create = SharedMemory.create("AshmemMemoryChunk", i10);
            this.f6301a = create;
            mapReadWrite = create.mapReadWrite();
            this.f6302b = mapReadWrite;
            this.f6303c = System.identityHashCode(this);
        } catch (ErrnoException e10) {
            throw new RuntimeException("Fail to create AshmemMemory", e10);
        }
    }

    public final void B(int i10, A a10, int i11, int i12) {
        if (!(a10 instanceof C1365f)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        D6.k.i(!isClosed());
        D6.k.i(!a10.isClosed());
        D6.k.g(this.f6302b);
        D6.k.g(a10.j());
        C.b(i10, a10.getSize(), i11, i12, getSize());
        this.f6302b.position(i10);
        a10.j().position(i11);
        byte[] bArr = new byte[i12];
        this.f6302b.get(bArr, 0, i12);
        a10.j().put(bArr, 0, i12);
    }

    @Override // K7.A, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.f6301a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.f6302b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.f6302b = null;
                this.f6301a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // K7.A
    public long d() {
        return this.f6303c;
    }

    @Override // K7.A
    public int getSize() {
        int size;
        D6.k.g(this.f6301a);
        size = this.f6301a.getSize();
        return size;
    }

    @Override // K7.A
    public synchronized int i(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        D6.k.g(bArr);
        D6.k.g(this.f6302b);
        a10 = C.a(i10, i12, getSize());
        C.b(i10, bArr.length, i11, a10, getSize());
        this.f6302b.position(i10);
        this.f6302b.get(bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public synchronized boolean isClosed() {
        boolean z10;
        if (this.f6302b != null) {
            z10 = this.f6301a == null;
        }
        return z10;
    }

    @Override // K7.A
    public ByteBuffer j() {
        return this.f6302b;
    }

    @Override // K7.A
    public synchronized int k(int i10, byte[] bArr, int i11, int i12) {
        int a10;
        D6.k.g(bArr);
        D6.k.g(this.f6302b);
        a10 = C.a(i10, i12, getSize());
        C.b(i10, bArr.length, i11, a10, getSize());
        this.f6302b.position(i10);
        this.f6302b.put(bArr, i11, a10);
        return a10;
    }

    @Override // K7.A
    public void r(int i10, A a10, int i11, int i12) {
        D6.k.g(a10);
        if (a10.d() == d()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(d()) + " to AshmemMemoryChunk " + Long.toHexString(a10.d()) + " which are the same ");
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
        if (i10 >= getSize()) {
            z10 = false;
        }
        D6.k.b(Boolean.valueOf(z10));
        D6.k.g(this.f6302b);
        return this.f6302b.get(i10);
    }

    @Override // K7.A
    public long u() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }
}

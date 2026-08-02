package p6;

import androidx.annotation.NonNull;
import c6.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
public final class d extends InputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final ArrayDeque f80261c;

    /* renamed from: a, reason: collision with root package name */
    private y f80262a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f80263b;

    static {
        int i11 = l.f80283d;
        f80261c = new ArrayDeque(0);
    }

    d() {
    }

    @NonNull
    public static d d(@NonNull y yVar) {
        d dVar;
        ArrayDeque arrayDeque = f80261c;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        dVar.f80262a = yVar;
        return dVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        return this.f80262a.available();
    }

    public final IOException c() {
        return this.f80263b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f80262a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i11) {
        this.f80262a.mark(i11);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f80262a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f80262a.read();
        } catch (IOException e11) {
            this.f80263b = e11;
            throw e11;
        }
    }

    public final void release() {
        this.f80263b = null;
        this.f80262a = null;
        ArrayDeque arrayDeque = f80261c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f80262a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j11) throws IOException {
        try {
            return this.f80262a.skip(j11);
        } catch (IOException e11) {
            this.f80263b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f80262a.read(bArr);
        } catch (IOException e11) {
            this.f80263b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f80262a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f80263b = e11;
            throw e11;
        }
    }
}

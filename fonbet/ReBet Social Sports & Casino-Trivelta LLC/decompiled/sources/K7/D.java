package K7;

import G6.h;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class D implements G6.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6250a;

    /* renamed from: b, reason: collision with root package name */
    public H6.a f6251b;

    public D(H6.a aVar, int i10) {
        D6.k.g(aVar);
        D6.k.b(Boolean.valueOf(i10 >= 0 && i10 <= ((A) aVar.z0()).getSize()));
        this.f6251b = aVar.clone();
        this.f6250a = i10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        H6.a.U(this.f6251b);
        this.f6251b = null;
    }

    public synchronized void d() {
        if (isClosed()) {
            throw new h.a();
        }
    }

    @Override // G6.h
    public synchronized int i(int i10, byte[] bArr, int i11, int i12) {
        d();
        D6.k.b(Boolean.valueOf(i10 + i12 <= this.f6250a));
        D6.k.g(this.f6251b);
        return ((A) this.f6251b.z0()).i(i10, bArr, i11, i12);
    }

    @Override // G6.h
    public synchronized boolean isClosed() {
        return !H6.a.isValid(this.f6251b);
    }

    @Override // G6.h
    public synchronized ByteBuffer j() {
        D6.k.g(this.f6251b);
        return ((A) this.f6251b.z0()).j();
    }

    @Override // G6.h
    public synchronized byte s(int i10) {
        d();
        D6.k.b(Boolean.valueOf(i10 >= 0));
        D6.k.b(Boolean.valueOf(i10 < this.f6250a));
        D6.k.g(this.f6251b);
        return ((A) this.f6251b.z0()).s(i10);
    }

    @Override // G6.h
    public synchronized int size() {
        d();
        return this.f6250a;
    }

    @Override // G6.h
    public synchronized long u() {
        d();
        D6.k.g(this.f6251b);
        return ((A) this.f6251b.z0()).u();
    }
}

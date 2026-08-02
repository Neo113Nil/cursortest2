package h1;

import e1.AbstractC4134a;
import java.io.InputStream;
import kotlin.UByte;

/* renamed from: h1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4416l extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4411g f47549a;

    /* renamed from: b, reason: collision with root package name */
    public final C4418n f47550b;

    /* renamed from: e, reason: collision with root package name */
    public long f47553e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f47551c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f47552d = false;
    private final byte[] singleByteArray = new byte[1];

    public C4416l(InterfaceC4411g interfaceC4411g, C4418n c4418n) {
        this.f47549a = interfaceC4411g;
        this.f47550b = c4418n;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f47552d) {
            return;
        }
        this.f47549a.close();
        this.f47552d = true;
    }

    public final void d() {
        if (this.f47551c) {
            return;
        }
        this.f47549a.b(this.f47550b);
        this.f47551c = true;
    }

    public void k() {
        d();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.singleByteArray) == -1) {
            return -1;
        }
        return this.singleByteArray[0] & UByte.MAX_VALUE;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        AbstractC4134a.g(!this.f47552d);
        d();
        int read = this.f47549a.read(bArr, i10, i11);
        if (read == -1) {
            return -1;
        }
        this.f47553e += read;
        return read;
    }
}

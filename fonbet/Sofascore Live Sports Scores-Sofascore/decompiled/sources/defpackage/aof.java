package defpackage;

import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class aof extends InputStream implements zja {
    public f7 a;

    @Override // java.io.InputStream
    public final int available() {
        return this.a.H();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.h();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.k();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        f7 f7Var = this.a;
        if (f7Var.H() == 0) {
            return -1;
        }
        int min = Math.min(f7Var.H(), i2);
        f7Var.t(bArr, i, min);
        return min;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        f7 f7Var = this.a;
        int min = (int) Math.min(f7Var.H(), j);
        f7Var.M(min);
        return min;
    }

    @Override // java.io.InputStream
    public final int read() {
        f7 f7Var = this.a;
        if (f7Var.H() == 0) {
            return -1;
        }
        return f7Var.C();
    }
}

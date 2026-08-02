package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class sgc extends FilterInputStream {
    public final int a;
    public final uei b;
    public long c;
    public long d;
    public long e;

    public sgc(InputStream inputStream, int i, uei ueiVar) {
        super(inputStream);
        this.e = -1L;
        this.a = i;
        this.b = ueiVar;
    }

    public final void h() {
        long j = this.d;
        long j2 = this.c;
        if (j > j2) {
            long j3 = j - j2;
            for (cy2 cy2Var : this.b.a) {
                cy2Var.f(j3);
            }
            this.c = this.d;
        }
    }

    public final void k() {
        long j = this.d;
        int i = this.a;
        if (j <= i) {
            return;
        }
        throw xei.j.h("Decompressed gRPC message exceeds maximum size " + i).a();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.d++;
        }
        k();
        h();
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.e == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.d += skip;
        k();
        h();
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            this.d += read;
        }
        k();
        h();
        return read;
    }
}

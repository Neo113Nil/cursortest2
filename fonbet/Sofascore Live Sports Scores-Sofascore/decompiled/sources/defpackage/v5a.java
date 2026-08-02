package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class v5a extends InputStream {
    public final InputStream a;
    public final xad b;
    public final Timer c;
    public long e;
    public long d = -1;
    public long f = -1;

    public v5a(InputStream inputStream, xad xadVar, Timer timer) {
        this.c = timer;
        this.a = inputStream;
        this.b = xadVar;
        this.e = xadVar.d.j();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.a.available();
        } catch (IOException e) {
            Timer timer = this.c;
            xad xadVar = this.b;
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        xad xadVar = this.b;
        Timer timer = this.c;
        long a = timer.a();
        if (this.f == -1) {
            this.f = a;
        }
        try {
            this.a.close();
            long j = this.d;
            if (j != -1) {
                xadVar.i(j);
            }
            long j2 = this.e;
            if (j2 != -1) {
                xadVar.d.w(j2);
            }
            xadVar.j(this.f);
            xadVar.b();
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    public final void f(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            this.d = j;
        } else {
            this.d = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        Timer timer = this.c;
        xad xadVar = this.b;
        try {
            int read = this.a.read();
            long a = timer.a();
            if (this.e == -1) {
                this.e = a;
            }
            if (read != -1 || this.f != -1) {
                f(1L);
                xadVar.i(this.d);
                return read;
            }
            this.f = a;
            xadVar.j(a);
            xadVar.b();
            return read;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.a.reset();
        } catch (IOException e) {
            Timer timer = this.c;
            xad xadVar = this.b;
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        Timer timer = this.c;
        xad xadVar = this.b;
        try {
            long skip = this.a.skip(j);
            long a = timer.a();
            if (this.e == -1) {
                this.e = a;
            }
            if (skip == 0 && j != 0 && this.f == -1) {
                this.f = a;
                xadVar.j(a);
                return skip;
            }
            f(skip);
            xadVar.i(this.d);
            return skip;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Timer timer = this.c;
        xad xadVar = this.b;
        try {
            int read = this.a.read(bArr, i, i2);
            long a = timer.a();
            if (this.e == -1) {
                this.e = a;
            }
            if (read == -1 && this.f == -1) {
                this.f = a;
                xadVar.j(a);
                xadVar.b();
                return read;
            }
            f(read);
            xadVar.i(this.d);
            return read;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        Timer timer = this.c;
        xad xadVar = this.b;
        try {
            int read = this.a.read(bArr);
            long a = timer.a();
            if (this.e == -1) {
                this.e = a;
            }
            if (read == -1 && this.f == -1) {
                this.f = a;
                xadVar.j(a);
                xadVar.b();
                return read;
            }
            f(read);
            xadVar.i(this.d);
            return read;
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }
}

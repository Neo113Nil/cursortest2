package defpackage;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class w5a extends OutputStream {
    public final OutputStream a;
    public final Timer b;
    public final xad c;
    public long d = -1;

    public w5a(OutputStream outputStream, xad xadVar, Timer timer) {
        this.a = outputStream;
        this.c = xadVar;
        this.b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.d;
        xad xadVar = this.c;
        if (j != -1) {
            xadVar.f(j);
        }
        Timer timer = this.b;
        xadVar.d.u(timer.a());
        try {
            this.a.close();
        } catch (IOException e) {
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            Timer timer = this.b;
            xad xadVar = this.c;
            fc6.y(timer, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        xad xadVar = this.c;
        try {
            this.a.write(i);
            long j = this.d + 1;
            this.d = j;
            xadVar.f(j);
        } catch (IOException e) {
            fc6.y(this.b, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        xad xadVar = this.c;
        try {
            this.a.write(bArr);
            long length = this.d + bArr.length;
            this.d = length;
            xadVar.f(length);
        } catch (IOException e) {
            fc6.y(this.b, xadVar, xadVar);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        xad xadVar = this.c;
        try {
            this.a.write(bArr, i, i2);
            long j = this.d + i2;
            this.d = j;
            xadVar.f(j);
        } catch (IOException e) {
            fc6.y(this.b, xadVar, xadVar);
            throw e;
        }
    }
}

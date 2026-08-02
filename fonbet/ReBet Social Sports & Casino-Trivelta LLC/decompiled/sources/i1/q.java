package i1;

import e1.AbstractC4134a;
import e1.Z;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class q extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f47998a;

    public q(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f47998a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        if (th != null) {
            Z.y1(th);
        }
    }

    public void d(OutputStream outputStream) {
        AbstractC4134a.g(this.f47998a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f47998a = false;
    }

    public q(OutputStream outputStream, int i10) {
        super(outputStream, i10);
    }
}

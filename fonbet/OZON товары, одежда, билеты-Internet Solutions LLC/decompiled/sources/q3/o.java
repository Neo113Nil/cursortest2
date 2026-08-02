package q3;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import m3.N;

/* loaded from: classes.dex */
final class o extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private boolean f81481a;

    public final void c(OutputStream outputStream) {
        G10.a.h(this.f81481a);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f81481a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f81481a = true;
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
        if (th == null) {
            return;
        }
        int i11 = N.f74289a;
        throw th;
    }
}

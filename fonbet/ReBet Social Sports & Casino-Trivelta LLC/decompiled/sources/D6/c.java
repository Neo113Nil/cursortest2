package D6;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public long f2561a;

    public c(OutputStream outputStream) {
        super(outputStream);
        this.f2561a = 0L;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    public long d() {
        return this.f2561a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        ((FilterOutputStream) this).out.write(bArr, i10, i11);
        this.f2561a += i11;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) {
        ((FilterOutputStream) this).out.write(i10);
        this.f2561a++;
    }
}

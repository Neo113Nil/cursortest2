package g8;

import S7.s;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes9.dex */
final class i extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    boolean f64007a;

    /* renamed from: b, reason: collision with root package name */
    InputStream f64008b;

    /* renamed from: c, reason: collision with root package name */
    InputStream f64009c;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f64010d;

    /* renamed from: e, reason: collision with root package name */
    byte[] f64011e;

    @Override // java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream = this.f64008b;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f64009c.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) != 1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i11, int i12) throws IOException {
        if (i12 == 0) {
            return 0;
        }
        InputStream inputStream = this.f64008b;
        if (inputStream != null) {
            return inputStream.read(bArr, i11, i12);
        }
        if (!this.f64007a) {
            this.f64007a = true;
            Iterator it = this.f64010d.iterator();
            while (it.hasNext()) {
                try {
                    try {
                        InputStream b11 = ((s) it.next()).b(this.f64009c, this.f64011e);
                        int read = b11.read(bArr, i11, i12);
                        if (read != 0) {
                            this.f64008b = b11;
                            this.f64009c.mark(0);
                            return read;
                        }
                        throw new IOException("Could not read bytes from the ciphertext stream");
                    } catch (IOException unused) {
                        this.f64009c.reset();
                    }
                } catch (GeneralSecurityException unused2) {
                    this.f64009c.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
        throw new IOException("No matching key found for the ciphertext in the stream.");
    }
}

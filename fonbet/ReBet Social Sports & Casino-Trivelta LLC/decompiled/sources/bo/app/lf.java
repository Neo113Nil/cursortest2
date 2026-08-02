package bo.app;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class lf implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final FileInputStream f25732a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f25733b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f25734c;

    /* renamed from: d, reason: collision with root package name */
    public int f25735d;

    /* renamed from: e, reason: collision with root package name */
    public int f25736e;

    public lf(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(bh.f25305a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f25732a = fileInputStream;
        this.f25733b = charset;
        this.f25734c = new byte[8192];
    }

    public final String a() {
        int i10;
        synchronized (this.f25732a) {
            try {
                byte[] bArr = this.f25734c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f25735d >= this.f25736e) {
                    int read = this.f25732a.read(bArr, 0, bArr.length);
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.f25735d = 0;
                    this.f25736e = read;
                }
                for (int i11 = this.f25735d; i11 != this.f25736e; i11++) {
                    byte[] bArr2 = this.f25734c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f25735d;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f25733b.name());
                                this.f25735d = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f25733b.name());
                        this.f25735d = i11 + 1;
                        return str2;
                    }
                }
                kf kfVar = new kf(this, (this.f25736e - this.f25735d) + 80);
                while (true) {
                    byte[] bArr3 = this.f25734c;
                    int i13 = this.f25735d;
                    kfVar.write(bArr3, i13, this.f25736e - i13);
                    this.f25736e = -1;
                    FileInputStream fileInputStream = this.f25732a;
                    byte[] bArr4 = this.f25734c;
                    int read2 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (read2 == -1) {
                        throw new EOFException();
                    }
                    this.f25735d = 0;
                    this.f25736e = read2;
                    for (int i14 = 0; i14 != this.f25736e; i14++) {
                        byte[] bArr5 = this.f25734c;
                        if (bArr5[i14] == 10) {
                            int i15 = this.f25735d;
                            if (i14 != i15) {
                                kfVar.write(bArr5, i15, i14 - i15);
                            }
                            this.f25735d = i14 + 1;
                            return kfVar.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f25732a) {
            try {
                if (this.f25734c != null) {
                    this.f25734c = null;
                    this.f25732a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

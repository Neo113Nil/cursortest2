package uf;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: uf.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10055b extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f100693a;

    /* renamed from: b, reason: collision with root package name */
    private int f100694b;

    /* renamed from: c, reason: collision with root package name */
    private int f100695c;

    /* renamed from: d, reason: collision with root package name */
    private final k f100696d;

    public C10055b(InputStream inputStream) throws IOException {
        k kVar = new k();
        this.f100696d = kVar;
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.f100693a = new byte[16384];
        this.f100694b = 0;
        this.f100695c = 0;
        try {
            k.a(kVar, inputStream);
        } catch (c e11) {
            throw new IOException("Brotli decoder initialization failed", e11);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        k kVar = this.f100696d;
        int i11 = kVar.f100744a;
        if (i11 == 0) {
            throw new IllegalStateException("State MUST be initialized");
        }
        if (i11 == 11) {
            return;
        }
        kVar.f100744a = 11;
        C10054a.b(kVar.f100746c);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i11 = this.f100695c;
        int i12 = this.f100694b;
        byte[] bArr = this.f100693a;
        if (i11 >= i12) {
            int read = read(bArr, 0, bArr.length);
            this.f100694b = read;
            this.f100695c = 0;
            if (read == -1) {
                return -1;
            }
        }
        int i13 = this.f100695c;
        this.f100695c = i13 + 1;
        return bArr[i13] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        k kVar = this.f100696d;
        if (i11 < 0) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Bad offset: "));
        }
        if (i12 >= 0) {
            int i13 = i11 + i12;
            if (i13 > bArr.length) {
                StringBuilder f7 = P4.f.f(i13, "Buffer overflow: ", " > ");
                f7.append(bArr.length);
                throw new IllegalArgumentException(f7.toString());
            }
            if (i12 == 0) {
                return 0;
            }
            int max = Math.max(this.f100694b - this.f100695c, 0);
            if (max != 0) {
                max = Math.min(max, i12);
                System.arraycopy(this.f100693a, this.f100695c, bArr, i11, max);
                this.f100695c += max;
                i11 += max;
                i12 -= max;
                if (i12 == 0) {
                    return max;
                }
            }
            try {
                kVar.f100743Y = bArr;
                kVar.f100738T = i11;
                kVar.f100739U = i12;
                kVar.f100740V = 0;
                e.d(kVar);
                int i14 = kVar.f100740V;
                if (i14 == 0) {
                    return -1;
                }
                return i14 + max;
            } catch (c e11) {
                throw new IOException("Brotli stream decoding failed", e11);
            }
        }
        throw new IllegalArgumentException(Ej.b.a(i12, "Bad length: "));
    }
}

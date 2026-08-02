package org.brotli.dec;

import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes5.dex */
public class b extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f62156a;

    /* renamed from: b, reason: collision with root package name */
    public int f62157b;
    private byte[] buffer;

    /* renamed from: c, reason: collision with root package name */
    public final k f62158c;

    public b(InputStream inputStream) {
        this(inputStream, 16384, null);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        k.a(this.f62158c);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f62157b >= this.f62156a) {
            byte[] bArr = this.buffer;
            int read = read(bArr, 0, bArr.length);
            this.f62156a = read;
            this.f62157b = 0;
            if (read == -1) {
                return -1;
            }
        }
        byte[] bArr2 = this.buffer;
        int i10 = this.f62157b;
        this.f62157b = i10 + 1;
        return bArr2[i10] & UByte.MAX_VALUE;
    }

    public b(InputStream inputStream, int i10, byte[] bArr) {
        k kVar = new k();
        this.f62158c = kVar;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Bad buffer size:" + i10);
        }
        if (inputStream == null) {
            throw new IllegalArgumentException("source is null");
        }
        this.buffer = new byte[i10];
        this.f62156a = 0;
        this.f62157b = 0;
        try {
            k.c(kVar, inputStream);
            if (bArr != null) {
                e.s(kVar, bArr);
            }
        } catch (c e10) {
            throw new IOException("Brotli decoder initialization failed", e10);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Bad offset: " + i10);
        }
        if (i11 >= 0) {
            int i12 = i10 + i11;
            if (i12 > bArr.length) {
                throw new IllegalArgumentException("Buffer overflow: " + i12 + " > " + bArr.length);
            }
            if (i11 == 0) {
                return 0;
            }
            int max = Math.max(this.f62156a - this.f62157b, 0);
            if (max != 0) {
                max = Math.min(max, i11);
                System.arraycopy(this.buffer, this.f62157b, bArr, i10, max);
                this.f62157b += max;
                i10 += max;
                i11 -= max;
                if (i11 == 0) {
                    return max;
                }
            }
            try {
                k kVar = this.f62158c;
                kVar.output = bArr;
                kVar.f62169J = i10;
                kVar.f62170K = i11;
                kVar.f62171L = 0;
                e.i(kVar);
                int i13 = this.f62158c.f62171L;
                if (i13 == 0) {
                    return -1;
                }
                return i13 + max;
            } catch (c e10) {
                throw new IOException("Brotli stream decoding failed", e10);
            }
        }
        throw new IllegalArgumentException("Bad length: " + i11);
    }
}

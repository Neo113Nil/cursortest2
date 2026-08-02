package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class c extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public final long f30138a;

    /* renamed from: b, reason: collision with root package name */
    public int f30139b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f30138a = j10;
    }

    public static InputStream k(InputStream inputStream, long j10) {
        return new c(inputStream, j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f30138a - this.f30139b, ((FilterInputStream) this).in.available());
    }

    public final int d(int i10) {
        if (i10 >= 0) {
            this.f30139b += i10;
            return i10;
        }
        if (this.f30138a - this.f30139b <= 0) {
            return i10;
        }
        throw new IOException("Failed to read all expected data, expected: " + this.f30138a + ", but read: " + this.f30139b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        d(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        return d(super.read(bArr, i10, i11));
    }
}

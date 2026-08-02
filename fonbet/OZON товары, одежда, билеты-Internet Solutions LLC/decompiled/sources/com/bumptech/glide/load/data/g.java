package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public final class g extends FilterInputStream {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f57630c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: d, reason: collision with root package name */
    private static final int f57631d = 31;

    /* renamed from: a, reason: collision with root package name */
    private final byte f57632a;

    /* renamed from: b, reason: collision with root package name */
    private int f57633b;

    public g(InputStream inputStream, int i11) {
        super(inputStream);
        if (i11 < -1 || i11 > 8) {
            throw new IllegalArgumentException(Ej.b.a(i11, "Cannot add invalid orientation: "));
        }
        this.f57632a = (byte) i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i11;
        int i12 = this.f57633b;
        int read = (i12 < 2 || i12 > (i11 = f57631d)) ? super.read() : i12 == i11 ? this.f57632a : f57630c[i12 - 2] & 255;
        if (read != -1) {
            this.f57633b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j11) throws IOException {
        long skip = super.skip(j11);
        if (skip > 0) {
            this.f57633b = (int) (this.f57633b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13;
        int i14 = this.f57633b;
        int i15 = f57631d;
        if (i14 > i15) {
            i13 = super.read(bArr, i11, i12);
        } else if (i14 == i15) {
            bArr[i11] = this.f57632a;
            i13 = 1;
        } else if (i14 < 2) {
            i13 = super.read(bArr, i11, 2 - i14);
        } else {
            int min = Math.min(i15 - i14, i12);
            System.arraycopy(f57630c, this.f57633b - 2, bArr, i11, min);
            i13 = min;
        }
        if (i13 > 0) {
            this.f57633b += i13;
        }
        return i13;
    }
}

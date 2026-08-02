package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.InputStream;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class g extends FilterInputStream {
    private static final byte[] EXIF_SEGMENT;

    /* renamed from: c, reason: collision with root package name */
    public static final int f29674c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f29675d;

    /* renamed from: a, reason: collision with root package name */
    public final byte f29676a;

    /* renamed from: b, reason: collision with root package name */
    public int f29677b;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        EXIF_SEGMENT = bArr;
        int length = bArr.length;
        f29674c = length;
        f29675d = length + 2;
    }

    public g(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 >= -1 && i10 <= 8) {
            this.f29676a = (byte) i10;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i10;
        int i11 = this.f29677b;
        int read = (i11 < 2 || i11 > (i10 = f29675d)) ? super.read() : i11 == i10 ? this.f29676a : EXIF_SEGMENT[i11 - 2] & UByte.MAX_VALUE;
        if (read != -1) {
            this.f29677b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long skip = super.skip(j10);
        if (skip > 0) {
            this.f29677b = (int) (this.f29677b + skip);
        }
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13 = this.f29677b;
        int i14 = f29675d;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f29676a;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int min = Math.min(i14 - i13, i11);
            System.arraycopy(EXIF_SEGMENT, this.f29677b - 2, bArr, i10, min);
            i12 = min;
        }
        if (i12 > 0) {
            this.f29677b += i12;
        }
        return i12;
    }
}

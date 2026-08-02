package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class i extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f30154a;

    public i(InputStream inputStream) {
        super(inputStream);
        this.f30154a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i10 = this.f30154a;
        return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
    }

    public final long d(long j10) {
        int i10 = this.f30154a;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    public final void k(long j10) {
        int i10 = this.f30154a;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f30154a = (int) (i10 - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f30154a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (d(1L) == -1) {
            return -1;
        }
        int read = super.read();
        k(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f30154a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) {
        long d10 = d(j10);
        if (d10 == -1) {
            return 0L;
        }
        long skip = super.skip(d10);
        k(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int d10 = (int) d(i11);
        if (d10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i10, d10);
        k(read);
        return read;
    }
}

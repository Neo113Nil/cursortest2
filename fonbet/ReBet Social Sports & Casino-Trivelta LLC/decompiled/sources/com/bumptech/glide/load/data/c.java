package com.bumptech.glide.load.data;

import java.io.OutputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public final class c extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f29668a;

    /* renamed from: b, reason: collision with root package name */
    public com.bumptech.glide.load.engine.bitmap_recycle.b f29669b;
    private byte[] buffer;

    /* renamed from: c, reason: collision with root package name */
    public int f29670c;

    public c(OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this(outputStream, bVar, PKIFailureInfo.notAuthorized);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f29668a.close();
            r();
        } catch (Throwable th2) {
            this.f29668a.close();
            throw th2;
        }
    }

    public final void d() {
        int i10 = this.f29670c;
        if (i10 > 0) {
            this.f29668a.write(this.buffer, 0, i10);
            this.f29670c = 0;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        d();
        this.f29668a.flush();
    }

    public final void k() {
        if (this.f29670c == this.buffer.length) {
            d();
        }
    }

    public final void r() {
        byte[] bArr = this.buffer;
        if (bArr != null) {
            this.f29669b.put(bArr);
            this.buffer = null;
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        byte[] bArr = this.buffer;
        int i11 = this.f29670c;
        this.f29670c = i11 + 1;
        bArr[i11] = (byte) i10;
        k();
    }

    public c(OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar, int i10) {
        this.f29668a = outputStream;
        this.f29669b = bVar;
        this.buffer = (byte[]) bVar.c(i10, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f29670c;
            if (i15 == 0 && i13 >= this.buffer.length) {
                this.f29668a.write(bArr, i14, i13);
                return;
            }
            int min = Math.min(i13, this.buffer.length - i15);
            System.arraycopy(bArr, i14, this.buffer, this.f29670c, min);
            this.f29670c += min;
            i12 += min;
            k();
        } while (i12 < i11);
    }
}

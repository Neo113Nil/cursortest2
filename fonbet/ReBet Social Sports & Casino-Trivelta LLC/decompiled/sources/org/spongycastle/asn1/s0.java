package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class s0 extends x0 {
    private static final byte[] EMPTY_BYTES = new byte[0];

    /* renamed from: c, reason: collision with root package name */
    public final int f62269c;

    /* renamed from: d, reason: collision with root package name */
    public int f62270d;

    public s0(InputStream inputStream, int i10) {
        super(inputStream, i10);
        if (i10 < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.f62269c = i10;
        this.f62270d = i10;
        if (i10 == 0) {
            k(true);
        }
    }

    @Override // org.spongycastle.asn1.x0
    public int d() {
        return this.f62270d;
    }

    public byte[] r() {
        int i10 = this.f62270d;
        if (i10 == 0) {
            return EMPTY_BYTES;
        }
        byte[] bArr = new byte[i10];
        int c10 = i10 - Bj.a.c(this.f62283a, bArr);
        this.f62270d = c10;
        if (c10 == 0) {
            k(true);
            return bArr;
        }
        throw new EOFException("DEF length " + this.f62269c + " object truncated by " + this.f62270d);
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f62270d == 0) {
            return -1;
        }
        int read = this.f62283a.read();
        if (read >= 0) {
            int i10 = this.f62270d - 1;
            this.f62270d = i10;
            if (i10 == 0) {
                k(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f62269c + " object truncated by " + this.f62270d);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f62270d;
        if (i12 == 0) {
            return -1;
        }
        int read = this.f62283a.read(bArr, i10, Math.min(i11, i12));
        if (read >= 0) {
            int i13 = this.f62270d - read;
            this.f62270d = i13;
            if (i13 == 0) {
                k(true);
            }
            return read;
        }
        throw new EOFException("DEF length " + this.f62269c + " object truncated by " + this.f62270d);
    }
}

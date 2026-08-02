package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class P implements org.spongycastle.crypto.e {

    /* renamed from: a, reason: collision with root package name */
    public int f62510a;

    /* renamed from: b, reason: collision with root package name */
    public int f62511b;

    /* renamed from: c, reason: collision with root package name */
    public int f62512c;

    /* renamed from: d, reason: collision with root package name */
    public int f62513d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62514e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f62515f;

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        int i12 = -957401312;
        for (int i13 = 0; i13 != 32; i13++) {
            b11 -= (((b10 << 4) + this.f62512c) ^ (b10 + i12)) ^ ((b10 >>> 5) + this.f62513d);
            b10 -= (((b11 << 4) + this.f62510a) ^ (b11 + i12)) ^ ((b11 >>> 5) + this.f62511b);
            i12 += 1640531527;
        }
        f(b10, bArr2, i11);
        f(b11, bArr2, i11 + 4);
        return 8;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int b10 = b(bArr, i10);
        int b11 = b(bArr, i10 + 4);
        int i12 = b10;
        int i13 = 0;
        for (int i14 = 0; i14 != 32; i14++) {
            i13 -= 1640531527;
            i12 += (((b11 << 4) + this.f62510a) ^ (b11 + i13)) ^ ((b11 >>> 5) + this.f62511b);
            b11 += (((i12 << 4) + this.f62512c) ^ (i12 + i13)) ^ ((i12 >>> 5) + this.f62513d);
        }
        f(i12, bArr2, i11);
        f(b11, bArr2, i11 + 4);
        return 8;
    }

    private void e(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        this.f62510a = b(bArr, 0);
        this.f62511b = b(bArr, 4);
        this.f62512c = b(bArr, 8);
        this.f62513d = b(bArr, 12);
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (jVar instanceof org.spongycastle.crypto.params.w) {
            this.f62515f = z10;
            this.f62514e = true;
            e(((org.spongycastle.crypto.params.w) jVar).a());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to TEA init - " + jVar.getClass().getName());
        }
    }

    public final int b(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | (bArr[i10] << 24);
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | i11 | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }

    public final void f(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        if (!this.f62514e) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + 8 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i11 + 8 <= bArr2.length) {
            return this.f62515f ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
        }
        throw new org.spongycastle.crypto.x("output buffer too short");
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}

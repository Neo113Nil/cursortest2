package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class z implements org.spongycastle.crypto.e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f62617b;

    /* renamed from: a, reason: collision with root package name */
    public int f62616a = 12;
    private long[] _S = null;

    private long b(byte[] bArr, int i10) {
        long j10 = 0;
        for (int i11 = 7; i11 >= 0; i11--) {
            j10 = (j10 << 8) + (bArr[i11 + i10] & UByte.MAX_VALUE);
        }
        return j10;
    }

    private int c(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long b10 = b(bArr, i10);
        long b11 = b(bArr, i10 + 8);
        for (int i12 = this.f62616a; i12 >= 1; i12--) {
            int i13 = i12 * 2;
            b11 = f(b11 - this._S[i13 + 1], b10) ^ b10;
            b10 = f(b10 - this._S[i13], b11) ^ b11;
        }
        h(b10 - this._S[0], bArr2, i11);
        h(b11 - this._S[1], bArr2, i11 + 8);
        return 16;
    }

    private int d(byte[] bArr, int i10, byte[] bArr2, int i11) {
        long b10 = b(bArr, i10) + this._S[0];
        long b11 = b(bArr, i10 + 8) + this._S[1];
        for (int i12 = 1; i12 <= this.f62616a; i12++) {
            int i13 = i12 * 2;
            b10 = e(b10 ^ b11, b11) + this._S[i13];
            b11 = e(b11 ^ b10, b10) + this._S[i13 + 1];
        }
        h(b10, bArr2, i11);
        h(b11, bArr2, i11 + 8);
        return 16;
    }

    private void g(byte[] bArr) {
        long[] jArr;
        int length = (bArr.length + 7) / 8;
        long[] jArr2 = new long[length];
        for (int i10 = 0; i10 != bArr.length; i10++) {
            int i11 = i10 / 8;
            jArr2[i11] = jArr2[i11] + ((bArr[i10] & UByte.MAX_VALUE) << ((i10 % 8) * 8));
        }
        long[] jArr3 = new long[(this.f62616a + 1) * 2];
        this._S = jArr3;
        jArr3[0] = -5196783011329398165L;
        int i12 = 1;
        while (true) {
            jArr = this._S;
            if (i12 >= jArr.length) {
                break;
            }
            jArr[i12] = jArr[i12 - 1] - 7046029254386353131L;
            i12++;
        }
        int length2 = length > jArr.length ? length * 3 : jArr.length * 3;
        long j10 = 0;
        long j11 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length2; i15++) {
            long[] jArr4 = this._S;
            j10 = e(jArr4[i13] + j10 + j11, 3L);
            jArr4[i13] = j10;
            j11 = e(jArr2[i14] + j10 + j11, j11 + j10);
            jArr2[i14] = j11;
            i13 = (i13 + 1) % this._S.length;
            i14 = (i14 + 1) % length;
        }
    }

    private void h(long j10, byte[] bArr, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr[i11 + i10] = (byte) j10;
            j10 >>>= 8;
        }
    }

    @Override // org.spongycastle.crypto.e
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.D)) {
            throw new IllegalArgumentException("invalid parameter passed to RC564 init - " + jVar.getClass().getName());
        }
        org.spongycastle.crypto.params.D d10 = (org.spongycastle.crypto.params.D) jVar;
        this.f62617b = z10;
        this.f62616a = d10.b();
        g(d10.a());
    }

    public final long e(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 >>> ((int) (64 - j12))) | (j10 << ((int) j12));
    }

    public final long f(long j10, long j11) {
        long j12 = j11 & 63;
        return (j10 << ((int) (64 - j12))) | (j10 >>> ((int) j12));
    }

    @Override // org.spongycastle.crypto.e
    public String getAlgorithmName() {
        return "RC5-64";
    }

    @Override // org.spongycastle.crypto.e
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.e
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        return this.f62617b ? d(bArr, i10, bArr2, i11) : c(bArr, i10, bArr2, i11);
    }

    @Override // org.spongycastle.crypto.e
    public void reset() {
    }
}

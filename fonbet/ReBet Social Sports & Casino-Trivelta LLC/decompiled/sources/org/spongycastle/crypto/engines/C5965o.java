package org.spongycastle.crypto.engines;

import kotlin.UByte;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: org.spongycastle.crypto.engines.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5965o implements org.spongycastle.crypto.B {

    /* renamed from: a, reason: collision with root package name */
    public int f62576a;

    /* renamed from: b, reason: collision with root package name */
    public int f62577b = 4;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62578c = false;
    private int[] lfsr;
    private int[] nfsr;
    private byte[] out;
    private byte[] workingIV;
    private byte[] workingKey;

    private void h(byte[] bArr, byte[] bArr2) {
        bArr2[12] = -1;
        bArr2[13] = -1;
        bArr2[14] = -1;
        bArr2[15] = -1;
        this.workingKey = bArr;
        this.workingIV = bArr2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.nfsr;
            if (i10 >= iArr.length) {
                return;
            }
            byte[] bArr3 = this.workingKey;
            int i12 = i11 + 3;
            int i13 = i11 + 2;
            int i14 = i11 + 1;
            iArr[i10] = (bArr3[i11] & UByte.MAX_VALUE) | (bArr3[i12] << 24) | ((bArr3[i13] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr3[i14] << 8) & 65280);
            int[] iArr2 = this.lfsr;
            byte[] bArr4 = this.workingIV;
            iArr2[i10] = (bArr4[i11] & UByte.MAX_VALUE) | (bArr4[i12] << 24) | ((bArr4[i13] << Tnaf.POW_2_WIDTH) & 16711680) | ((bArr4[i14] << 8) & 65280);
            i11 += 4;
            i10++;
        }
    }

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.z)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include an IV");
        }
        org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
        byte[] a10 = zVar.a();
        if (a10 == null || a10.length != 12) {
            throw new IllegalArgumentException("Grain-128  requires exactly 12 bytes of IV");
        }
        if (!(zVar.b() instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("Grain-128 Init parameters must include a key");
        }
        org.spongycastle.crypto.params.w wVar = (org.spongycastle.crypto.params.w) zVar.b();
        this.workingIV = new byte[wVar.a().length];
        this.workingKey = new byte[wVar.a().length];
        this.lfsr = new int[4];
        this.nfsr = new int[4];
        this.out = new byte[4];
        System.arraycopy(a10, 0, this.workingIV, 0, a10.length);
        System.arraycopy(wVar.a(), 0, this.workingKey, 0, wVar.a().length);
        reset();
    }

    public final byte b() {
        if (this.f62577b > 3) {
            g();
            this.f62577b = 0;
        }
        byte[] bArr = this.out;
        int i10 = this.f62577b;
        this.f62577b = i10 + 1;
        return bArr[i10];
    }

    public final int c() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 2) | (i11 << 30);
        int i13 = (i10 >>> 12) | (i11 << 20);
        int i14 = (i10 >>> 15) | (i11 << 17);
        int i15 = iArr[2];
        int i16 = (i11 >>> 4) | (i15 << 28);
        int i17 = (i11 >>> 13) | (i15 << 19);
        int i18 = iArr[3];
        int i19 = (i15 >>> 9) | (i18 << 23);
        int i20 = (i15 >>> 25) | (i18 << 7);
        int i21 = (i18 << 1) | (i15 >>> 31);
        int[] iArr2 = this.lfsr;
        int i22 = iArr2[0];
        int i23 = iArr2[1];
        int i24 = (i22 >>> 8) | (i23 << 24);
        int i25 = (i22 >>> 13) | (i23 << 19);
        int i26 = (i22 >>> 20) | (i23 << 12);
        int i27 = iArr2[2];
        int i28 = iArr2[3];
        int i29 = i25 & i26;
        return ((((((((((i21 & i13) & ((i28 << 1) | (i27 >>> 31))) ^ (((i29 ^ (i13 & i24)) ^ (i21 & ((i23 >>> 10) | (i27 << 22)))) ^ (((i23 >>> 28) | (i27 << 4)) & ((i27 >>> 15) | (i28 << 17))))) ^ ((i27 >>> 29) | (i28 << 3))) ^ i12) ^ i14) ^ i16) ^ i17) ^ i15) ^ i19) ^ i20;
    }

    public final int d() {
        int[] iArr = this.lfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 7) | (i11 << 25);
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = (i13 >>> 6) | (i14 << 26);
        return i14 ^ ((((i10 ^ i12) ^ ((i11 >>> 6) | (i13 << 26))) ^ i15) ^ ((i13 >>> 17) | (i14 << 15)));
    }

    public final int e() {
        int[] iArr = this.nfsr;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = (i10 >>> 3) | (i11 << 29);
        int i13 = (i10 >>> 11) | (i11 << 21);
        int i14 = (i10 >>> 13) | (i11 << 19);
        int i15 = (i10 >>> 17) | (i11 << 15);
        int i16 = (i10 >>> 18) | (i11 << 14);
        int i17 = (i10 >>> 26) | (i11 << 6);
        int i18 = (i10 >>> 27) | (i11 << 5);
        int i19 = iArr[2];
        int i20 = (i11 >>> 8) | (i19 << 24);
        int i21 = (i11 >>> 16) | (i19 << 16);
        int i22 = (i11 >>> 24) | (i19 << 8);
        int i23 = (i11 >>> 27) | (i19 << 5);
        int i24 = (i11 >>> 29) | (i19 << 3);
        int i25 = iArr[3];
        return (((((((i25 ^ (((i10 ^ i17) ^ i22) ^ ((i19 >>> 27) | (i25 << 5)))) ^ (i12 & ((i19 >>> 3) | (i25 << 29)))) ^ (i13 & i14)) ^ (i15 & i16)) ^ (i18 & i23)) ^ (i20 & i21)) ^ (i24 & ((i19 >>> 1) | (i25 << 31)))) ^ (((i19 >>> 4) | (i25 << 28)) & ((i19 >>> 20) | (i25 << 12)));
    }

    public final void f() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f62576a = c();
            this.nfsr = i(this.nfsr, (e() ^ this.lfsr[0]) ^ this.f62576a);
            this.lfsr = i(this.lfsr, d() ^ this.f62576a);
        }
        this.f62578c = true;
    }

    public final void g() {
        int c10 = c();
        this.f62576a = c10;
        byte[] bArr = this.out;
        bArr[0] = (byte) c10;
        bArr[1] = (byte) (c10 >> 8);
        bArr[2] = (byte) (c10 >> 16);
        bArr[3] = (byte) (c10 >> 24);
        this.nfsr = i(this.nfsr, e() ^ this.lfsr[0]);
        this.lfsr = i(this.lfsr, d());
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "Grain-128";
    }

    public final int[] i(int[] iArr, int i10) {
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i10;
        return iArr;
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f62578c) {
            throw new IllegalStateException(getAlgorithmName() + " not initialised");
        }
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            bArr2[i12 + i13] = (byte) (bArr[i10 + i13] ^ b());
        }
        return i11;
    }

    @Override // org.spongycastle.crypto.B
    public void reset() {
        this.f62577b = 4;
        h(this.workingKey, this.workingIV);
        f();
    }
}

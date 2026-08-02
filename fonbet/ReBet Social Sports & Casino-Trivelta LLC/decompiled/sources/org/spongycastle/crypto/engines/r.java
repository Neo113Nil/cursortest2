package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class r implements org.spongycastle.crypto.B {

    /* renamed from: b, reason: collision with root package name */
    public boolean f62588b;
    private byte[] iv;
    private byte[] key;

    /* renamed from: p, reason: collision with root package name */
    private int[] f62590p = new int[1024];

    /* renamed from: q, reason: collision with root package name */
    private int[] f62591q = new int[1024];

    /* renamed from: a, reason: collision with root package name */
    public int f62587a = 0;
    private byte[] buf = new byte[4];

    /* renamed from: c, reason: collision with root package name */
    public int f62589c = 0;

    private byte b() {
        if (this.f62589c == 0) {
            int e10 = e();
            byte[] bArr = this.buf;
            bArr[0] = (byte) (e10 & 255);
            bArr[1] = (byte) ((e10 >> 8) & 255);
            bArr[2] = (byte) ((e10 >> 16) & 255);
            bArr[3] = (byte) ((e10 >> 24) & 255);
        }
        byte[] bArr2 = this.buf;
        int i10 = this.f62589c;
        byte b10 = bArr2[i10];
        this.f62589c = 3 & (i10 + 1);
        return b10;
    }

    private void c() {
        byte[] bArr = this.key;
        if (bArr.length != 32 && bArr.length != 16) {
            throw new IllegalArgumentException("The key must be 128/256 bits long");
        }
        if (this.iv.length < 16) {
            throw new IllegalArgumentException("The IV must be at least 128 bits long");
        }
        if (bArr.length != 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            byte[] bArr3 = this.key;
            System.arraycopy(bArr3, 0, bArr2, 16, bArr3.length);
            this.key = bArr2;
        }
        byte[] bArr4 = this.iv;
        if (bArr4.length < 32) {
            byte[] bArr5 = new byte[32];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            byte[] bArr6 = this.iv;
            System.arraycopy(bArr6, 0, bArr5, bArr6.length, 32 - bArr6.length);
            this.iv = bArr5;
        }
        this.f62589c = 0;
        this.f62587a = 0;
        int[] iArr = new int[2560];
        for (int i10 = 0; i10 < 32; i10++) {
            int i11 = i10 >> 2;
            iArr[i11] = iArr[i11] | ((this.key[i10] & UByte.MAX_VALUE) << ((i10 & 3) * 8));
        }
        for (int i12 = 0; i12 < 32; i12++) {
            int i13 = (i12 >> 2) + 8;
            iArr[i13] = iArr[i13] | ((this.iv[i12] & UByte.MAX_VALUE) << ((i12 & 3) * 8));
        }
        for (int i14 = 16; i14 < 2560; i14++) {
            int i15 = iArr[i14 - 2];
            int i16 = iArr[i14 - 15];
            iArr[i14] = ((i15 >>> 10) ^ (d(i15, 17) ^ d(i15, 19))) + iArr[i14 - 7] + ((i16 >>> 3) ^ (d(i16, 7) ^ d(i16, 18))) + iArr[i14 - 16] + i14;
        }
        System.arraycopy(iArr, 512, this.f62590p, 0, 1024);
        System.arraycopy(iArr, 1536, this.f62591q, 0, 1024);
        for (int i17 = 0; i17 < 4096; i17++) {
            e();
        }
        this.f62587a = 0;
    }

    private static int d(int i10, int i11) {
        return (i10 << (-i11)) | (i10 >>> i11);
    }

    private int e() {
        int i10;
        int i11;
        int i12 = this.f62587a;
        int i13 = i12 & 1023;
        if (i12 < 1024) {
            int[] iArr = this.f62590p;
            int i14 = iArr[(i13 - 3) & 1023];
            int i15 = iArr[(i13 - 1023) & 1023];
            int i16 = iArr[i13];
            int d10 = iArr[(i13 - 10) & 1023] + (d(i15, 23) ^ d(i14, 10));
            int[] iArr2 = this.f62591q;
            iArr[i13] = i16 + d10 + iArr2[(i14 ^ i15) & 1023];
            int[] iArr3 = this.f62590p;
            int i17 = iArr3[(i13 - 12) & 1023];
            i10 = iArr2[i17 & 255] + iArr2[((i17 >> 8) & 255) + 256] + iArr2[((i17 >> 16) & 255) + 512] + iArr2[((i17 >> 24) & 255) + 768];
            i11 = iArr3[i13];
        } else {
            int[] iArr4 = this.f62591q;
            int i18 = iArr4[(i13 - 3) & 1023];
            int i19 = iArr4[(i13 - 1023) & 1023];
            int i20 = iArr4[i13];
            int d11 = iArr4[(i13 - 10) & 1023] + (d(i19, 23) ^ d(i18, 10));
            int[] iArr5 = this.f62590p;
            iArr4[i13] = i20 + d11 + iArr5[(i18 ^ i19) & 1023];
            int[] iArr6 = this.f62591q;
            int i21 = iArr6[(i13 - 12) & 1023];
            i10 = iArr5[i21 & 255] + iArr5[((i21 >> 8) & 255) + 256] + iArr5[((i21 >> 16) & 255) + 512] + iArr5[((i21 >> 24) & 255) + 768];
            i11 = iArr6[i13];
        }
        int i22 = i11 ^ i10;
        this.f62587a = (this.f62587a + 1) & 2047;
        return i22;
    }

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        org.spongycastle.crypto.j jVar2;
        if (jVar instanceof org.spongycastle.crypto.params.z) {
            org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
            this.iv = zVar.a();
            jVar2 = zVar.b();
        } else {
            this.iv = new byte[0];
            jVar2 = jVar;
        }
        if (jVar2 instanceof org.spongycastle.crypto.params.w) {
            this.key = ((org.spongycastle.crypto.params.w) jVar2).a();
            c();
            this.f62588b = true;
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to HC256 init - " + jVar.getClass().getName());
        }
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "HC-256";
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (!this.f62588b) {
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
        c();
    }
}

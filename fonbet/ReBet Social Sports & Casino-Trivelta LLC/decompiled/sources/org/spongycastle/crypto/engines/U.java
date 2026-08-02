package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class U implements org.spongycastle.crypto.B {
    protected byte[] workingIV;
    protected byte[] workingKey;

    /* renamed from: a, reason: collision with root package name */
    public byte f62526a = 0;

    /* renamed from: P, reason: collision with root package name */
    protected byte[] f62525P = null;

    /* renamed from: b, reason: collision with root package name */
    public byte f62527b = 0;

    @Override // org.spongycastle.crypto.B
    public void a(boolean z10, org.spongycastle.crypto.j jVar) {
        if (!(jVar instanceof org.spongycastle.crypto.params.z)) {
            throw new IllegalArgumentException("VMPC init parameters must include an IV");
        }
        org.spongycastle.crypto.params.z zVar = (org.spongycastle.crypto.params.z) jVar;
        if (!(zVar.b() instanceof org.spongycastle.crypto.params.w)) {
            throw new IllegalArgumentException("VMPC init parameters must include a key");
        }
        org.spongycastle.crypto.params.w wVar = (org.spongycastle.crypto.params.w) zVar.b();
        byte[] a10 = zVar.a();
        this.workingIV = a10;
        if (a10 == null || a10.length < 1 || a10.length > 768) {
            throw new IllegalArgumentException("VMPC requires 1 to 768 bytes of IV");
        }
        byte[] a11 = wVar.a();
        this.workingKey = a11;
        b(a11, this.workingIV);
    }

    public void b(byte[] bArr, byte[] bArr2) {
        this.f62527b = (byte) 0;
        this.f62525P = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f62525P[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f62525P;
            byte b10 = this.f62527b;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f62527b = b12;
            bArr3[i12] = bArr3[b12 & UByte.MAX_VALUE];
            bArr3[b12 & UByte.MAX_VALUE] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f62525P;
            byte b13 = this.f62527b;
            int i14 = i13 & 255;
            byte b14 = bArr4[i14];
            byte b15 = bArr4[(b13 + b14 + bArr2[i13 % bArr2.length]) & 255];
            this.f62527b = b15;
            bArr4[i14] = bArr4[b15 & UByte.MAX_VALUE];
            bArr4[b15 & UByte.MAX_VALUE] = b14;
        }
        this.f62526a = (byte) 0;
    }

    @Override // org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "VMPC";
    }

    @Override // org.spongycastle.crypto.B
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new org.spongycastle.crypto.l("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new org.spongycastle.crypto.x("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr3 = this.f62525P;
            byte b10 = this.f62527b;
            byte b11 = this.f62526a;
            byte b12 = bArr3[(b10 + bArr3[b11 & UByte.MAX_VALUE]) & 255];
            this.f62527b = b12;
            byte b13 = bArr3[(bArr3[bArr3[b12 & UByte.MAX_VALUE] & UByte.MAX_VALUE] + 1) & 255];
            byte b14 = bArr3[b11 & UByte.MAX_VALUE];
            bArr3[b11 & UByte.MAX_VALUE] = bArr3[b12 & UByte.MAX_VALUE];
            bArr3[b12 & UByte.MAX_VALUE] = b14;
            this.f62526a = (byte) ((b11 + 1) & 255);
            bArr2[i13 + i12] = (byte) (bArr[i13 + i10] ^ b13);
        }
        return i11;
    }

    @Override // org.spongycastle.crypto.B
    public void reset() {
        b(this.workingKey, this.workingIV);
    }
}

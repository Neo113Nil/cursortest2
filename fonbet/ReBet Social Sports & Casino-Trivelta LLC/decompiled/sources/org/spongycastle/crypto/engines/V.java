package org.spongycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class V extends U {
    @Override // org.spongycastle.crypto.engines.U
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
        for (int i15 = 0; i15 < 768; i15++) {
            byte[] bArr5 = this.f62525P;
            byte b16 = this.f62527b;
            int i16 = i15 & 255;
            byte b17 = bArr5[i16];
            byte b18 = bArr5[(b16 + b17 + bArr[i15 % bArr.length]) & 255];
            this.f62527b = b18;
            bArr5[i16] = bArr5[b18 & UByte.MAX_VALUE];
            bArr5[b18 & UByte.MAX_VALUE] = b17;
        }
        this.f62526a = (byte) 0;
    }

    @Override // org.spongycastle.crypto.engines.U, org.spongycastle.crypto.B
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }
}

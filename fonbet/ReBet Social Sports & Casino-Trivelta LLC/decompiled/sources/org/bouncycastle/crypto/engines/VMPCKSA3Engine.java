package org.bouncycastle.crypto.engines;

import kotlin.UByte;

/* loaded from: classes5.dex */
public class VMPCKSA3Engine extends VMPCEngine {
    @Override // org.bouncycastle.crypto.engines.VMPCEngine, org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "VMPC-KSA3";
    }

    @Override // org.bouncycastle.crypto.engines.VMPCEngine
    public void initKey(byte[] bArr, byte[] bArr2) {
        this.f61660s = (byte) 0;
        this.f61658P = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            this.f61658P[i10] = (byte) i10;
        }
        for (int i11 = 0; i11 < 768; i11++) {
            byte[] bArr3 = this.f61658P;
            byte b10 = this.f61660s;
            int i12 = i11 & 255;
            byte b11 = bArr3[i12];
            byte b12 = bArr3[(b10 + b11 + bArr[i11 % bArr.length]) & 255];
            this.f61660s = b12;
            bArr3[i12] = bArr3[b12 & UByte.MAX_VALUE];
            bArr3[b12 & UByte.MAX_VALUE] = b11;
        }
        for (int i13 = 0; i13 < 768; i13++) {
            byte[] bArr4 = this.f61658P;
            byte b13 = this.f61660s;
            int i14 = i13 & 255;
            byte b14 = bArr4[i14];
            byte b15 = bArr4[(b13 + b14 + bArr2[i13 % bArr2.length]) & 255];
            this.f61660s = b15;
            bArr4[i14] = bArr4[b15 & UByte.MAX_VALUE];
            bArr4[b15 & UByte.MAX_VALUE] = b14;
        }
        for (int i15 = 0; i15 < 768; i15++) {
            byte[] bArr5 = this.f61658P;
            byte b16 = this.f61660s;
            int i16 = i15 & 255;
            byte b17 = bArr5[i16];
            byte b18 = bArr5[(b16 + b17 + bArr[i15 % bArr.length]) & 255];
            this.f61660s = b18;
            bArr5[i16] = bArr5[b18 & UByte.MAX_VALUE];
            bArr5[b18 & UByte.MAX_VALUE] = b17;
        }
        this.f61659n = (byte) 0;
    }
}

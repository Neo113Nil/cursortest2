package org.bouncycastle.crypto.engines;

import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;

/* loaded from: classes5.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* renamed from: x, reason: collision with root package name */
    private int f61640x = 0;

    /* renamed from: y, reason: collision with root package name */
    private int f61641y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f61640x = 0;
        this.f61641y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i10 = 0; i10 < 256; i10++) {
            this.engineState[i10] = (byte) i10;
        }
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < 256; i13++) {
            int i14 = bArr[i11] & UByte.MAX_VALUE;
            byte[] bArr2 = this.engineState;
            byte b10 = bArr2[i13];
            i12 = (i14 + b10 + i12) & 255;
            bArr2[i13] = bArr2[i12];
            bArr2[i12] = b10;
            i11 = (i11 + 1) % bArr.length;
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = key;
            setKey(key);
        } else {
            throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
        }
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        if (i10 + i11 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i12 + i11 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.f61640x + 1) & 255;
            this.f61640x = i14;
            byte[] bArr3 = this.engineState;
            byte b10 = bArr3[i14];
            int i15 = (this.f61641y + b10) & 255;
            this.f61641y = i15;
            bArr3[i14] = bArr3[i15];
            bArr3[i15] = b10;
            bArr2[i13 + i12] = (byte) (bArr3[(bArr3[i14] + b10) & 255] ^ bArr[i13 + i10]);
        }
        return i11;
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.bouncycastle.crypto.StreamCipher
    public byte returnByte(byte b10) {
        int i10 = (this.f61640x + 1) & 255;
        this.f61640x = i10;
        byte[] bArr = this.engineState;
        byte b11 = bArr[i10];
        int i11 = (this.f61641y + b11) & 255;
        this.f61641y = i11;
        bArr[i10] = bArr[i11];
        bArr[i11] = b11;
        return (byte) (b10 ^ bArr[(bArr[i10] + b11) & 255]);
    }
}

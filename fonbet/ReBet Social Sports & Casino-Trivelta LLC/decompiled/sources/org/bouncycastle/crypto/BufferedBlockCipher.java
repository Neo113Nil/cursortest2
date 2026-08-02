package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public class BufferedBlockCipher {
    protected byte[] buf;
    protected int bufOff;
    protected BlockCipher cipher;
    protected boolean forEncryption;
    protected boolean partialBlockOkay;
    protected boolean pgpCFB;

    public BufferedBlockCipher() {
    }

    public int doFinal(byte[] bArr, int i10) {
        try {
            int i11 = this.bufOff;
            if (i10 + i11 > bArr.length) {
                throw new OutputLengthException("output buffer too short for doFinal()");
            }
            int i12 = 0;
            if (i11 != 0) {
                if (!this.partialBlockOkay) {
                    throw new DataLengthException("data not block size aligned");
                }
                BlockCipher blockCipher = this.cipher;
                byte[] bArr2 = this.buf;
                blockCipher.processBlock(bArr2, 0, bArr2, 0);
                int i13 = this.bufOff;
                this.bufOff = 0;
                System.arraycopy(this.buf, 0, bArr, i10, i13);
                i12 = i13;
            }
            reset();
            return i12;
        } catch (Throwable th2) {
            reset();
            throw th2;
        }
    }

    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public int getOutputSize(int i10) {
        return i10 + this.bufOff;
    }

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    public int getUpdateOutputSize(int i10) {
        int length;
        int i11;
        int i12 = i10 + this.bufOff;
        if (!this.pgpCFB) {
            length = this.buf.length;
        } else {
            if (this.forEncryption) {
                i11 = (i12 % this.buf.length) - (this.cipher.getBlockSize() + 2);
                return i12 - i11;
            }
            length = this.buf.length;
        }
        i11 = i12 % length;
        return i12 - i11;
    }

    public void init(boolean z10, CipherParameters cipherParameters) {
        this.forEncryption = z10;
        reset();
        this.cipher.init(z10, cipherParameters);
    }

    public int processByte(byte b10, byte[] bArr, int i10) {
        byte[] bArr2 = this.buf;
        int i11 = this.bufOff;
        int i12 = i11 + 1;
        this.bufOff = i12;
        bArr2[i11] = b10;
        if (i12 != bArr2.length) {
            return 0;
        }
        int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i10);
        this.bufOff = 0;
        return processBlock;
    }

    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13;
        if (i11 < 0) {
            throw new IllegalArgumentException("Can't have a negative input length!");
        }
        int blockSize = getBlockSize();
        int updateOutputSize = getUpdateOutputSize(i11);
        if (updateOutputSize > 0 && updateOutputSize + i12 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        byte[] bArr3 = this.buf;
        int length = bArr3.length;
        int i14 = this.bufOff;
        int i15 = length - i14;
        if (i11 > i15) {
            System.arraycopy(bArr, i10, bArr3, i14, i15);
            i13 = this.cipher.processBlock(this.buf, 0, bArr2, i12);
            this.bufOff = 0;
            i11 -= i15;
            i10 += i15;
            while (i11 > this.buf.length) {
                i13 += this.cipher.processBlock(bArr, i10, bArr2, i12 + i13);
                i11 -= blockSize;
                i10 += blockSize;
            }
        } else {
            i13 = 0;
        }
        System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
        int i16 = this.bufOff + i11;
        this.bufOff = i16;
        byte[] bArr4 = this.buf;
        if (i16 != bArr4.length) {
            return i13;
        }
        int processBlock = i13 + this.cipher.processBlock(bArr4, 0, bArr2, i12 + i13);
        this.bufOff = 0;
        return processBlock;
    }

    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i10 >= bArr.length) {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            } else {
                bArr[i10] = 0;
                i10++;
            }
        }
    }

    public BufferedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        boolean z10 = false;
        this.bufOff = 0;
        String algorithmName = blockCipher.getAlgorithmName();
        int indexOf = algorithmName.indexOf(47) + 1;
        boolean z11 = indexOf > 0 && algorithmName.startsWith("PGP", indexOf);
        this.pgpCFB = z11;
        if (z11 || (blockCipher instanceof StreamCipher)) {
            this.partialBlockOkay = true;
            return;
        }
        if (indexOf > 0 && algorithmName.startsWith("OpenPGP", indexOf)) {
            z10 = true;
        }
        this.partialBlockOkay = z10;
    }
}

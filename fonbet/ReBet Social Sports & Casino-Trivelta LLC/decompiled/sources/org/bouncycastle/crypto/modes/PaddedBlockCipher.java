package org.bouncycastle.crypto.modes;

import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* loaded from: classes5.dex */
public class PaddedBlockCipher extends BufferedBlockCipher {
    public PaddedBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
        this.buf = new byte[blockCipher.getBlockSize()];
        this.bufOff = 0;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int doFinal(byte[] bArr, int i10) {
        int i11;
        int i12;
        int blockSize = this.cipher.getBlockSize();
        if (this.forEncryption) {
            if (this.bufOff != blockSize) {
                i12 = 0;
            } else {
                if ((blockSize * 2) + i10 > bArr.length) {
                    throw new OutputLengthException("output buffer too short");
                }
                i12 = this.cipher.processBlock(this.buf, 0, bArr, i10);
                this.bufOff = 0;
            }
            byte b10 = (byte) (blockSize - this.bufOff);
            while (true) {
                int i13 = this.bufOff;
                if (i13 >= blockSize) {
                    break;
                }
                this.buf[i13] = b10;
                this.bufOff = i13 + 1;
            }
            i11 = i12 + this.cipher.processBlock(this.buf, 0, bArr, i10 + i12);
        } else {
            if (this.bufOff != blockSize) {
                throw new DataLengthException("last block incomplete in decryption");
            }
            BlockCipher blockCipher = this.cipher;
            byte[] bArr2 = this.buf;
            int processBlock = blockCipher.processBlock(bArr2, 0, bArr2, 0);
            this.bufOff = 0;
            byte[] bArr3 = this.buf;
            int i14 = bArr3[blockSize - 1] & UByte.MAX_VALUE;
            if (i14 > blockSize) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            i11 = processBlock - i14;
            System.arraycopy(bArr3, 0, bArr, i10, i11);
        }
        reset();
        return i11;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        if (length != 0) {
            i11 -= length;
        } else if (!this.forEncryption) {
            return i11;
        }
        return i11 + bArr.length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int getUpdateOutputSize(int i10) {
        int i11 = i10 + this.bufOff;
        byte[] bArr = this.buf;
        int length = i11 % bArr.length;
        return length == 0 ? i11 - bArr.length : i11 - length;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processByte(byte b10, byte[] bArr, int i10) {
        int i11 = this.bufOff;
        byte[] bArr2 = this.buf;
        int i12 = 0;
        if (i11 == bArr2.length) {
            int processBlock = this.cipher.processBlock(bArr2, 0, bArr, i10);
            this.bufOff = 0;
            i12 = processBlock;
        }
        byte[] bArr3 = this.buf;
        int i13 = this.bufOff;
        this.bufOff = i13 + 1;
        bArr3[i13] = b10;
        return i12;
    }

    @Override // org.bouncycastle.crypto.BufferedBlockCipher
    public int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
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
        int i13 = this.bufOff;
        int i14 = length - i13;
        int i15 = 0;
        if (i11 > i14) {
            System.arraycopy(bArr, i10, bArr3, i13, i14);
            int processBlock = this.cipher.processBlock(this.buf, 0, bArr2, i12);
            this.bufOff = 0;
            i11 -= i14;
            i10 += i14;
            i15 = processBlock;
            while (i11 > this.buf.length) {
                i15 += this.cipher.processBlock(bArr, i10, bArr2, i12 + i15);
                i11 -= blockSize;
                i10 += blockSize;
            }
        }
        System.arraycopy(bArr, i10, this.buf, this.bufOff, i11);
        this.bufOff += i11;
        return i15;
    }
}

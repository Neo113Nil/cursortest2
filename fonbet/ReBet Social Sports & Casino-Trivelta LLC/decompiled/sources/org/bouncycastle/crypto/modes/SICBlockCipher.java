package org.bouncycastle.crypto.modes;

import kotlin.UByte;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.SkippingStreamCipher;
import org.bouncycastle.crypto.StreamBlockCipher;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes5.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j10) {
        int i10 = 5;
        if (j10 >= 0) {
            long j11 = (this.byteCount + j10) / this.blockSize;
            long j12 = j11;
            if (j11 > 255) {
                while (i10 >= 1) {
                    long j13 = 1 << (i10 * 8);
                    while (j12 >= j13) {
                        incrementCounterAt(i10);
                        j12 -= j13;
                    }
                    i10--;
                }
            }
            incrementCounter((int) j12);
            this.byteCount = (int) ((j10 + this.byteCount) - (this.blockSize * j11));
            return;
        }
        long j14 = ((-j10) - this.byteCount) / this.blockSize;
        long j15 = j14;
        if (j14 > 255) {
            while (i10 >= 1) {
                long j16 = 1 << (i10 * 8);
                while (j15 > j16) {
                    decrementCounterAt(i10);
                    j15 -= j16;
                }
                i10--;
            }
        }
        for (long j17 = 0; j17 != j15; j17++) {
            decrementCounterAt(0);
        }
        int i11 = (int) (this.byteCount + j10 + (this.blockSize * j14));
        if (i11 >= 0) {
            this.byteCount = 0;
        } else {
            decrementCounterAt(0);
            this.byteCount = this.blockSize + i11;
        }
    }

    private void checkCounter() {
        if (this.IV.length >= this.blockSize) {
            return;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.IV;
            if (i10 == bArr.length) {
                return;
            }
            if (this.counter[i10] != bArr[i10]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i10++;
        }
    }

    private void decrementCounterAt(int i10) {
        byte b10;
        int length = this.counter.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b10 = (byte) (r1[length] - 1);
            this.counter[length] = b10;
        } while (b10 == -1);
    }

    private void incrementCounter(int i10) {
        byte[] bArr = this.counter;
        byte b10 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i10);
        if (b10 == 0 || bArr[bArr.length - 1] >= b10) {
            return;
        }
        incrementCounterAt(1);
    }

    private void incrementCounterAt(int i10) {
        byte b10;
        int length = this.counter.length - i10;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
        } while (b10 == 0);
    }

    @Override // org.bouncycastle.crypto.StreamBlockCipher
    public byte calculateByte(byte b10) {
        int i10 = this.byteCount;
        if (i10 == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i11 = this.byteCount;
            this.byteCount = i11 + 1;
            return (byte) (b10 ^ bArr[i11]);
        }
        byte[] bArr2 = this.counterOut;
        int i12 = i10 + 1;
        this.byteCount = i12;
        byte b11 = (byte) (b10 ^ bArr2[i10]);
        if (i12 == this.counter.length) {
            this.byteCount = 0;
            incrementCounterAt(0);
            checkCounter();
        }
        return b11;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long getPosition() {
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        int i10 = length - 1;
        while (i10 >= 1) {
            byte[] bArr3 = this.IV;
            int i11 = i10 < bArr3.length ? (bArr2[i10] & UByte.MAX_VALUE) - (bArr3[i10] & UByte.MAX_VALUE) : bArr2[i10] & UByte.MAX_VALUE;
            if (i11 < 0) {
                int i12 = i10 - 1;
                bArr2[i12] = (byte) (bArr2[i12] - 1);
                i11 += 256;
            }
            bArr2[i10] = (byte) i11;
            i10--;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z10, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof ParametersWithIV)) {
            throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
        }
        ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
        byte[] clone = Arrays.clone(parametersWithIV.getIV());
        this.IV = clone;
        int i10 = this.blockSize;
        if (i10 < clone.length) {
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        int i11 = 8 > i10 / 2 ? i10 / 2 : 8;
        if (i10 - clone.length <= i11) {
            if (parametersWithIV.getParameters() != null) {
                this.cipher.init(true, parametersWithIV.getParameters());
            }
            reset();
        } else {
            throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i11) + " bytes.");
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.blockSize, bArr2, i11);
        return this.blockSize;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long seekTo(long j10) {
        reset();
        return skip(j10);
    }

    @Override // org.bouncycastle.crypto.SkippingCipher
    public long skip(long j10) {
        adjustCounter(j10);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j10;
    }
}

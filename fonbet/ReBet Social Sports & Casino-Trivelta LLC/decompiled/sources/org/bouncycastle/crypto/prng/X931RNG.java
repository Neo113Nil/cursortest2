package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.BlockCipher;

/* loaded from: classes5.dex */
public class X931RNG {
    private static final int BLOCK128_MAX_BITS_REQUEST = 262144;
    private static final long BLOCK128_RESEED_MAX = 8388608;
    private static final int BLOCK64_MAX_BITS_REQUEST = 4096;
    private static final long BLOCK64_RESEED_MAX = 32768;
    private final byte[] DT;

    /* renamed from: I, reason: collision with root package name */
    private final byte[] f61815I;

    /* renamed from: R, reason: collision with root package name */
    private final byte[] f61816R;

    /* renamed from: V, reason: collision with root package name */
    private byte[] f61817V;
    private final BlockCipher engine;
    private final EntropySource entropySource;
    private long reseedCounter = 1;

    public X931RNG(BlockCipher blockCipher, byte[] bArr, EntropySource entropySource) {
        this.engine = blockCipher;
        this.entropySource = entropySource;
        byte[] bArr2 = new byte[blockCipher.getBlockSize()];
        this.DT = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f61815I = new byte[blockCipher.getBlockSize()];
        this.f61816R = new byte[blockCipher.getBlockSize()];
    }

    private void increment(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b10 = (byte) (bArr[length] + 1);
            bArr[length] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }

    private static boolean isTooLarge(byte[] bArr, int i10) {
        return bArr != null && bArr.length > i10;
    }

    private void process(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i10 = 0; i10 != bArr.length; i10++) {
            bArr[i10] = (byte) (bArr2[i10] ^ bArr3[i10]);
        }
        this.engine.processBlock(bArr, 0, bArr, 0);
    }

    public int generate(byte[] bArr, boolean z10) {
        if (this.f61816R.length == 8) {
            if (this.reseedCounter > BLOCK64_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else {
            if (this.reseedCounter > BLOCK128_RESEED_MAX) {
                return -1;
            }
            if (isTooLarge(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z10 || this.f61817V == null) {
            byte[] entropy = this.entropySource.getEntropy();
            this.f61817V = entropy;
            if (entropy.length != this.engine.getBlockSize()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / this.f61816R.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.engine.processBlock(this.DT, 0, this.f61815I, 0);
            process(this.f61816R, this.f61815I, this.f61817V);
            process(this.f61817V, this.f61816R, this.f61815I);
            byte[] bArr2 = this.f61816R;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i10, bArr2.length);
            increment(this.DT);
        }
        int length2 = bArr.length - (this.f61816R.length * length);
        if (length2 > 0) {
            this.engine.processBlock(this.DT, 0, this.f61815I, 0);
            process(this.f61816R, this.f61815I, this.f61817V);
            process(this.f61817V, this.f61816R, this.f61815I);
            byte[] bArr3 = this.f61816R;
            System.arraycopy(bArr3, 0, bArr, length * bArr3.length, length2);
            increment(this.DT);
        }
        this.reseedCounter++;
        return bArr.length;
    }

    public EntropySource getEntropySource() {
        return this.entropySource;
    }

    public void reseed() {
        byte[] entropy = this.entropySource.getEntropy();
        this.f61817V = entropy;
        if (entropy.length != this.engine.getBlockSize()) {
            throw new IllegalStateException("Insufficient entropy returned");
        }
        this.reseedCounter = 1L;
    }
}

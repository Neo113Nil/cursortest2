package org.bouncycastle.crypto;

/* loaded from: classes5.dex */
public interface BlockCipher {
    String getAlgorithmName();

    int getBlockSize();

    void init(boolean z10, CipherParameters cipherParameters);

    int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11);

    void reset();
}

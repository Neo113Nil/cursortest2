package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public interface e {
    void a(boolean z10, j jVar);

    String getAlgorithmName();

    int getBlockSize();

    int processBlock(byte[] bArr, int i10, byte[] bArr2, int i11);

    void reset();
}

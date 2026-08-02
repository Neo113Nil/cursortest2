package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public interface B {
    void a(boolean z10, j jVar);

    String getAlgorithmName();

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);

    void reset();
}

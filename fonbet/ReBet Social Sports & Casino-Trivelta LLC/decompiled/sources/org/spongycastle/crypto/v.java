package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public interface v {
    void a(j jVar);

    int doFinal(byte[] bArr, int i10);

    String getAlgorithmName();

    int getMacSize();

    void reset();

    void update(byte b10);

    void update(byte[] bArr, int i10, int i11);
}

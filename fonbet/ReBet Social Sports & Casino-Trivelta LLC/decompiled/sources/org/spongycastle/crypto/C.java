package org.spongycastle.crypto;

/* loaded from: classes5.dex */
public interface C {
    void a(boolean z10, j jVar);

    String getAlgorithmName();

    byte[] unwrap(byte[] bArr, int i10, int i11);

    byte[] wrap(byte[] bArr, int i10, int i11);
}

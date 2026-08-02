package Zi;

/* loaded from: classes5.dex */
public interface a {
    void a(boolean z10, org.spongycastle.crypto.j jVar);

    int doFinal(byte[] bArr, int i10);

    byte[] getMac();

    int getOutputSize(int i10);

    org.spongycastle.crypto.e getUnderlyingCipher();

    int getUpdateOutputSize(int i10);

    void processAADBytes(byte[] bArr, int i10, int i11);

    int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12);
}

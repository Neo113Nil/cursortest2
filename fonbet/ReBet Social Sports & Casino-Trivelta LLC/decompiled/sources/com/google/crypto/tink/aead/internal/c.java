package com.google.crypto.tink.aead.internal;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class c extends d {
    public c(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // com.google.crypto.tink.aead.internal.d
    public int[] b(int[] iArr, int i10) {
        if (iArr.length != e() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        a.c(iArr2, this.key);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // com.google.crypto.tink.aead.internal.d
    public /* bridge */ /* synthetic */ byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        return super.c(bArr, byteBuffer);
    }

    @Override // com.google.crypto.tink.aead.internal.d
    public /* bridge */ /* synthetic */ void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        super.d(byteBuffer, bArr, bArr2);
    }

    @Override // com.google.crypto.tink.aead.internal.d
    public int e() {
        return 12;
    }
}

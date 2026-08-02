package org.bouncycastle.crypto.agreement.kdf;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes5.dex */
public class GSKKDFParameters implements DerivationParameters {
    private final byte[] nonce;
    private final int startCounter;

    /* renamed from: z, reason: collision with root package name */
    private final byte[] f61403z;

    public GSKKDFParameters(byte[] bArr, int i10) {
        this(bArr, i10, null);
    }

    public byte[] getNonce() {
        return this.nonce;
    }

    public int getStartCounter() {
        return this.startCounter;
    }

    public byte[] getZ() {
        return this.f61403z;
    }

    public GSKKDFParameters(byte[] bArr, int i10, byte[] bArr2) {
        this.f61403z = bArr;
        this.startCounter = i10;
        this.nonce = bArr2;
    }
}

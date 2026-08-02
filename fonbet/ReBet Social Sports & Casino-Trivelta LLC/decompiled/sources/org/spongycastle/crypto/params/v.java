package org.spongycastle.crypto.params;

/* loaded from: classes5.dex */
public class v implements org.spongycastle.crypto.n {
    byte[] iv;
    byte[] shared;

    public v(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.iv = bArr2;
    }

    public byte[] a() {
        return this.iv;
    }

    public byte[] b() {
        return this.shared;
    }
}

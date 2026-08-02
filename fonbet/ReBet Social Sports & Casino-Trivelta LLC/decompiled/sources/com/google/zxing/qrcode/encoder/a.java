package com.google.zxing.qrcode.encoder;

/* loaded from: classes3.dex */
public final class a {
    private final byte[] dataBytes;
    private final byte[] errorCorrectionBytes;

    public a(byte[] bArr, byte[] bArr2) {
        this.dataBytes = bArr;
        this.errorCorrectionBytes = bArr2;
    }

    public byte[] a() {
        return this.dataBytes;
    }

    public byte[] b() {
        return this.errorCorrectionBytes;
    }
}

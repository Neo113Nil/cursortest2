package com.google.zxing.pdf417.encoder;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f38431a = 0;
    private final byte[] row;

    public b(int i10) {
        this.row = new byte[i10];
    }

    public void a(boolean z10, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f38431a;
            this.f38431a = i12 + 1;
            c(i12, z10);
        }
    }

    public byte[] b(int i10) {
        int length = this.row.length * i10;
        byte[] bArr = new byte[length];
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = this.row[i11 / i10];
        }
        return bArr;
    }

    public final void c(int i10, boolean z10) {
        this.row[i10] = z10 ? (byte) 1 : (byte) 0;
    }
}

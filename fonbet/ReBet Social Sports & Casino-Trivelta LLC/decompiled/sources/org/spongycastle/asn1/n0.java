package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class n0 extends AbstractC5924b {
    public n0(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public void e(C5939q c5939q) {
        byte[] bArr = this.data;
        int length = bArr.length;
        byte[] bArr2 = new byte[length + 1];
        bArr2[0] = (byte) o();
        System.arraycopy(bArr, 0, bArr2, 1, length);
        c5939q.g(3, bArr2);
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public int f() {
        return z0.a(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // org.spongycastle.asn1.AbstractC5940s
    public boolean h() {
        return false;
    }
}

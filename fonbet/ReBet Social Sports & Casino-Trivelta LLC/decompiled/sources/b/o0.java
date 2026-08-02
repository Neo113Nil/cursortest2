package b;

import kotlin.UByte;

/* loaded from: classes.dex */
public final class o0 extends AbstractC2311h {
    public o0(byte[] bArr) {
        super(bArr);
    }

    @Override // b.w0
    public final int a(boolean z10) {
        return q0.a(z10, this.f24114a.length);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        byte[] bArr = this.f24114a;
        int i10 = bArr[0] & UByte.MAX_VALUE;
        int length = bArr.length;
        int i11 = length - 1;
        byte b10 = bArr[i11];
        byte b11 = (byte) ((255 << i10) & b10);
        if (b10 == b11) {
            q0Var.f(z10, 3, bArr);
            return;
        }
        q0Var.k(z10, 3);
        q0Var.c(length);
        q0Var.f24140a.write(bArr, 0, i11);
        q0Var.f24140a.write(b11);
    }

    @Override // b.w0
    public final boolean f() {
        return false;
    }

    @Override // b.AbstractC2311h, b.w0
    public final w0 h() {
        return this;
    }

    @Override // b.AbstractC2311h, b.w0
    public final w0 i() {
        return this;
    }
}

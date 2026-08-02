package b;

/* renamed from: b.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2327x extends AbstractC2311h {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2311h[] f24152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24153f;

    public C2327x(byte[] bArr, int i10) {
        super(bArr, i10);
        this.f24152e = null;
        this.f24153f = 1000;
    }

    public static byte[] k(AbstractC2311h[] abstractC2311hArr) {
        int length = abstractC2311hArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return abstractC2311hArr[0].f24114a;
        }
        int i10 = length - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            byte[] bArr = abstractC2311hArr[i12].f24114a;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException("only the last nested bitstring can have padding");
            }
            i11 += bArr.length - 1;
        }
        byte[] bArr2 = abstractC2311hArr[i10].f24114a;
        byte b10 = bArr2[0];
        byte[] bArr3 = new byte[i11 + bArr2.length];
        bArr3[0] = b10;
        int i13 = 1;
        for (AbstractC2311h abstractC2311h : abstractC2311hArr) {
            byte[] bArr4 = abstractC2311h.f24114a;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i13, length2);
            i13 += length2;
        }
        return bArr3;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        if (!f()) {
            return q0.a(z10, this.f24114a.length);
        }
        int i10 = z10 ? 4 : 3;
        if (this.f24152e == null) {
            byte[] bArr = this.f24114a;
            if (bArr.length < 2) {
                return i10;
            }
            int length = bArr.length - 2;
            int i11 = this.f24153f;
            int i12 = length / (i11 - 1);
            return q0.a(true, this.f24114a.length - ((this.f24153f - 1) * i12)) + (q0.a(true, i11) * i12) + i10;
        }
        int i13 = 0;
        while (true) {
            AbstractC2311h[] abstractC2311hArr = this.f24152e;
            if (i13 >= abstractC2311hArr.length) {
                return i10;
            }
            i10 += abstractC2311hArr[i13].a(true);
            i13++;
        }
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        if (!f()) {
            byte[] bArr = this.f24114a;
            int length = bArr.length;
            q0Var.k(z10, 3);
            q0Var.c(length);
            q0Var.f24140a.write(bArr, 0, length);
            return;
        }
        q0Var.k(z10, 35);
        q0Var.f24140a.write(128);
        AbstractC2311h[] abstractC2311hArr = this.f24152e;
        if (abstractC2311hArr != null) {
            q0Var.i(abstractC2311hArr);
        } else {
            byte[] bArr2 = this.f24114a;
            if (bArr2.length >= 2) {
                byte b10 = bArr2[0];
                int length2 = bArr2.length;
                int i10 = length2 - 1;
                int i11 = this.f24153f;
                int i12 = i11 - 1;
                while (i10 > i12) {
                    q0Var.k(true, 3);
                    q0Var.c(i11);
                    q0Var.f24140a.write(0);
                    q0Var.f24140a.write(this.f24114a, length2 - i10, i12);
                    i10 -= i12;
                }
                q0Var.k(true, 3);
                q0Var.c(i10 + 1);
                q0Var.f24140a.write(b10);
                q0Var.f24140a.write(this.f24114a, length2 - i10, i10);
            }
        }
        q0Var.f24140a.write(0);
        q0Var.f24140a.write(0);
    }

    @Override // b.w0
    public final boolean f() {
        return this.f24152e != null || this.f24114a.length > this.f24153f;
    }

    public C2327x(AbstractC2311h[] abstractC2311hArr) {
        super(k(abstractC2311hArr));
        this.f24152e = abstractC2311hArr;
        this.f24153f = 1000;
    }
}

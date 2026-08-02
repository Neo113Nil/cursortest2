package b;

/* renamed from: b.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2279G extends k0 {

    /* renamed from: e, reason: collision with root package name */
    public final k0[] f24068e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24069f;

    public C2279G(byte[] bArr, k0[] k0VarArr) {
        super(bArr);
        this.f24068e = k0VarArr;
        this.f24069f = 1000;
    }

    public static byte[] l(k0[] k0VarArr) {
        int length = k0VarArr.length;
        if (length == 0) {
            return k0.f24129c;
        }
        if (length == 1) {
            return k0VarArr[0].f24131a;
        }
        int i10 = 0;
        for (k0 k0Var : k0VarArr) {
            i10 += k0Var.f24131a.length;
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (k0 k0Var2 : k0VarArr) {
            byte[] bArr2 = k0Var2.f24131a;
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return bArr;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        int i10 = z10 ? 4 : 3;
        if (this.f24068e == null) {
            int length = this.f24131a.length;
            int i11 = this.f24069f;
            int i12 = length / i11;
            int a10 = (q0.a(true, i11) * i12) + i10;
            int length2 = this.f24131a.length - (i12 * this.f24069f);
            return length2 > 0 ? q0.a(true, length2) + a10 : a10;
        }
        int i13 = 0;
        while (true) {
            k0[] k0VarArr = this.f24068e;
            if (i13 >= k0VarArr.length) {
                return i10;
            }
            i10 += k0VarArr[i13].a(true);
            i13++;
        }
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 36);
        q0Var.f24140a.write(128);
        k0[] k0VarArr = this.f24068e;
        if (k0VarArr == null) {
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f24131a;
                if (i10 >= bArr.length) {
                    break;
                }
                int min = Math.min(bArr.length - i10, this.f24069f);
                byte[] bArr2 = this.f24131a;
                q0Var.k(true, 4);
                q0Var.c(min);
                q0Var.f24140a.write(bArr2, i10, min);
                i10 += min;
            }
        } else {
            q0Var.i(k0VarArr);
        }
        q0Var.f24140a.write(0);
        q0Var.f24140a.write(0);
    }

    @Override // b.w0
    public final boolean f() {
        return true;
    }
}

package b;

/* renamed from: b.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2277E extends AbstractC2298a {

    /* renamed from: d, reason: collision with root package name */
    public int f24060d;

    public C2277E(InterfaceC2323t[] interfaceC2323tArr) {
        super(true, interfaceC2323tArr);
        this.f24060d = -1;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        if (this.f24060d < 0) {
            int length = this.f24085a.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f24085a[i11].d().h().a(true);
            }
            this.f24060d = i10;
        }
        return q0.a(z10, this.f24060d);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 49);
        C2325v b10 = q0Var.b();
        InterfaceC2323t[] interfaceC2323tArr = this.f24085a;
        int length = interfaceC2323tArr.length;
        int i10 = this.f24060d;
        int i11 = 0;
        if (i10 >= 0 || length > 16) {
            if (i10 < 0) {
                int length2 = interfaceC2323tArr.length;
                int i12 = 0;
                for (int i13 = 0; i13 < length2; i13++) {
                    i12 += this.f24085a[i13].d().h().a(true);
                }
                this.f24060d = i12;
            }
            q0Var.c(this.f24060d);
            while (i11 < length) {
                this.f24085a[i11].d().h().b(b10, true);
                i11++;
            }
            return;
        }
        w0[] w0VarArr = new w0[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            w0 h10 = this.f24085a[i15].d().h();
            w0VarArr[i15] = h10;
            i14 += h10.a(true);
        }
        this.f24060d = i14;
        q0Var.c(i14);
        while (i11 < length) {
            w0VarArr[i11].b(b10, true);
            i11++;
        }
    }

    @Override // b.AbstractC2298a, b.w0
    public final w0 h() {
        return this.f24086b != null ? this : super.h();
    }

    @Override // b.AbstractC2298a, b.w0
    public final w0 i() {
        return this;
    }
}

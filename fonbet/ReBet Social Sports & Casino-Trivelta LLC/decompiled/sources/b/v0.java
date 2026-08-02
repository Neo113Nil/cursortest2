package b;

/* loaded from: classes.dex */
public final class v0 extends AbstractC2298a {

    /* renamed from: d, reason: collision with root package name */
    public int f24147d;

    public v0() {
        this.f24147d = -1;
    }

    @Override // b.w0
    public final int a(boolean z10) {
        if (this.f24147d < 0) {
            int length = this.f24085a.length;
            int i10 = 0;
            for (int i11 = 0; i11 < length; i11++) {
                i10 += this.f24085a[i11].d().i().a(true);
            }
            this.f24147d = i10;
        }
        return q0.a(z10, this.f24147d);
    }

    @Override // b.w0
    public final void b(q0 q0Var, boolean z10) {
        q0Var.k(z10, 49);
        m0 j10 = q0Var.j();
        InterfaceC2323t[] interfaceC2323tArr = this.f24085a;
        int length = interfaceC2323tArr.length;
        int i10 = this.f24147d;
        int i11 = 0;
        if (i10 >= 0 || length > 16) {
            if (i10 < 0) {
                int length2 = interfaceC2323tArr.length;
                int i12 = 0;
                for (int i13 = 0; i13 < length2; i13++) {
                    i12 += this.f24085a[i13].d().i().a(true);
                }
                this.f24147d = i12;
            }
            q0Var.c(this.f24147d);
            while (i11 < length) {
                j10.e(this.f24085a[i11].d());
                i11++;
            }
            return;
        }
        w0[] w0VarArr = new w0[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            w0 i16 = this.f24085a[i15].d().i();
            w0VarArr[i15] = i16;
            i14 += i16.a(true);
        }
        this.f24147d = i14;
        q0Var.c(i14);
        while (i11 < length) {
            j10.e(w0VarArr[i11]);
            i11++;
        }
    }

    public v0(C2326w c2326w) {
        super(c2326w);
        this.f24147d = -1;
    }

    public v0(InterfaceC2323t[] interfaceC2323tArr, InterfaceC2323t[] interfaceC2323tArr2) {
        super(interfaceC2323tArr, interfaceC2323tArr2);
        this.f24147d = -1;
    }

    @Override // b.AbstractC2298a, b.w0
    public final w0 i() {
        return this;
    }
}

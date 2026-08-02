package x;

import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: s0, reason: collision with root package name */
    public int f25265s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f25266t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f25267u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f25268v0;

    @Override // x.d
    public final boolean A() {
        return this.f25268v0;
    }

    @Override // x.d
    public final boolean B() {
        return this.f25268v0;
    }

    public final boolean T() {
        int i5;
        int i10;
        int i11;
        boolean z5 = true;
        int i12 = 0;
        while (true) {
            i5 = this.f25369r0;
            if (i12 >= i5) {
                break;
            }
            d dVar = this.f25368q0[i12];
            if ((this.f25266t0 || dVar.c()) && ((((i10 = this.f25265s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f25265s0) == 2 || i11 == 3) && !dVar.B()))) {
                z5 = false;
            }
            i12++;
        }
        if (!z5 || i5 <= 0) {
            return false;
        }
        int i13 = 0;
        boolean z7 = false;
        for (int i14 = 0; i14 < this.f25369r0; i14++) {
            d dVar2 = this.f25368q0[i14];
            if (this.f25266t0 || dVar2.c()) {
                if (!z7) {
                    int i15 = this.f25265s0;
                    if (i15 == 0) {
                        i13 = dVar2.i(2).d();
                    } else if (i15 == 1) {
                        i13 = dVar2.i(4).d();
                    } else if (i15 == 2) {
                        i13 = dVar2.i(3).d();
                    } else if (i15 == 3) {
                        i13 = dVar2.i(5).d();
                    }
                    z7 = true;
                }
                int i16 = this.f25265s0;
                if (i16 == 0) {
                    i13 = Math.min(i13, dVar2.i(2).d());
                } else if (i16 == 1) {
                    i13 = Math.max(i13, dVar2.i(4).d());
                } else if (i16 == 2) {
                    i13 = Math.min(i13, dVar2.i(3).d());
                } else if (i16 == 3) {
                    i13 = Math.max(i13, dVar2.i(5).d());
                }
            }
        }
        int i17 = i13 + this.f25267u0;
        int i18 = this.f25265s0;
        if (i18 == 0 || i18 == 1) {
            J(i17, i17);
        } else {
            K(i17, i17);
        }
        this.f25268v0 = true;
        return true;
    }

    public final int U() {
        int i5 = this.f25265s0;
        if (i5 == 0 || i5 == 1) {
            return 0;
        }
        return (i5 == 2 || i5 == 3) ? 1 : -1;
    }

    @Override // x.d
    public final void b(v.c cVar, boolean z5) {
        boolean z7;
        int i5;
        int i10;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f25292i = cVar.k(cVar6);
        }
        int i12 = this.f25265s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.f25268v0) {
            T();
        }
        if (this.f25268v0) {
            this.f25268v0 = false;
            int i13 = this.f25265s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.f25292i, this.Y);
                cVar.d(cVar4.f25292i, this.Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.f25292i, this.Z);
                    cVar.d(cVar5.f25292i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i14 = 0; i14 < this.f25369r0; i14++) {
            d dVar = this.f25368q0[i14];
            if ((this.f25266t0 || dVar.c()) && ((((i10 = this.f25265s0) == 0 || i10 == 1) && dVar.f25320p0[0] == 3 && dVar.I.f25289f != null && dVar.K.f25289f != null) || ((i10 == 2 || i10 == 3) && dVar.f25320p0[1] == 3 && dVar.J.f25289f != null && dVar.L.f25289f != null))) {
                z7 = true;
                break;
            }
        }
        z7 = false;
        boolean z10 = cVar2.g() || cVar4.g();
        boolean z11 = cVar3.g() || cVar5.g();
        int i15 = !(!z7 && (((i5 = this.f25265s0) == 0 && z10) || ((i5 == 2 && z11) || ((i5 == 1 && z10) || (i5 == 3 && z11))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f25369r0) {
            d dVar2 = this.f25368q0[i16];
            if (this.f25266t0 || dVar2.c()) {
                v.g k6 = cVar.k(dVar2.Q[this.f25265s0]);
                c[] cVarArr2 = dVar2.Q;
                int i17 = this.f25265s0;
                c cVar8 = cVarArr2[i17];
                cVar8.f25292i = k6;
                c cVar9 = cVar8.f25289f;
                int i18 = (cVar9 == null || cVar9.f25287d != this) ? 0 : cVar8.f25290g;
                if (i17 == 0 || i17 == i11) {
                    v.g gVar = cVar7.f25292i;
                    int i19 = this.f25267u0 - i18;
                    v.b l6 = cVar.l();
                    v.g m6 = cVar.m();
                    m6.f24371d = 0;
                    l6.c(gVar, k6, m6, i19);
                    cVar.c(l6);
                } else {
                    v.g gVar2 = cVar7.f25292i;
                    int i20 = this.f25267u0 + i18;
                    v.b l10 = cVar.l();
                    v.g m10 = cVar.m();
                    m10.f24371d = 0;
                    l10.b(gVar2, k6, m10, i20);
                    cVar.c(l10);
                }
                cVar.e(cVar7.f25292i, k6, this.f25267u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f25265s0;
        if (i21 == 0) {
            cVar.e(cVar4.f25292i, cVar2.f25292i, 0, 8);
            cVar.e(cVar2.f25292i, this.T.K.f25292i, 0, 4);
            cVar.e(cVar2.f25292i, this.T.I.f25292i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.f25292i, cVar4.f25292i, 0, 8);
            cVar.e(cVar2.f25292i, this.T.I.f25292i, 0, 4);
            cVar.e(cVar2.f25292i, this.T.K.f25292i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.f25292i, cVar3.f25292i, 0, 8);
            cVar.e(cVar3.f25292i, this.T.L.f25292i, 0, 4);
            cVar.e(cVar3.f25292i, this.T.J.f25292i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.f25292i, cVar5.f25292i, 0, 8);
            cVar.e(cVar3.f25292i, this.T.J.f25292i, 0, 4);
            cVar.e(cVar3.f25292i, this.T.L.f25292i, 0, 0);
        }
    }

    @Override // x.d
    public final boolean c() {
        return true;
    }

    @Override // x.d
    public final String toString() {
        String l6 = d9.e.l(new StringBuilder("[Barrier] "), this.f25307h0, " {");
        for (int i5 = 0; i5 < this.f25369r0; i5++) {
            d dVar = this.f25368q0[i5];
            if (i5 > 0) {
                l6 = k.l(l6, ", ");
            }
            StringBuilder b10 = v.f.b(l6);
            b10.append(dVar.f25307h0);
            l6 = b10.toString();
        }
        return k.l(l6, "}");
    }
}

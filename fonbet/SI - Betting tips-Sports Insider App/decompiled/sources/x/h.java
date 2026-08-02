package x;

import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: q0, reason: collision with root package name */
    public float f25362q0 = -1.0f;

    /* renamed from: r0, reason: collision with root package name */
    public int f25363r0 = -1;

    /* renamed from: s0, reason: collision with root package name */
    public int f25364s0 = -1;

    /* renamed from: t0, reason: collision with root package name */
    public c f25365t0 = this.J;

    /* renamed from: u0, reason: collision with root package name */
    public int f25366u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f25367v0;

    public h() {
        this.R.clear();
        this.R.add(this.f25365t0);
        int length = this.Q.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.Q[i5] = this.f25365t0;
        }
    }

    @Override // x.d
    public final boolean A() {
        return this.f25367v0;
    }

    @Override // x.d
    public final boolean B() {
        return this.f25367v0;
    }

    @Override // x.d
    public final void Q(v.c cVar, boolean z5) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f25365t0;
        cVar.getClass();
        int n9 = v.c.n(cVar2);
        if (this.f25366u0 == 1) {
            this.Y = n9;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n9;
        O(this.T.q());
        L(0);
    }

    public final void R(int i5) {
        this.f25365t0.l(i5);
        this.f25367v0 = true;
    }

    public final void S(int i5) {
        if (this.f25366u0 == i5) {
            return;
        }
        this.f25366u0 = i5;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f25366u0 == 1) {
            this.f25365t0 = this.I;
        } else {
            this.f25365t0 = this.J;
        }
        arrayList.add(this.f25365t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f25365t0;
        }
    }

    @Override // x.d
    public final void b(v.c cVar, boolean z5) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object i5 = eVar.i(2);
        Object i10 = eVar.i(4);
        d dVar = this.T;
        boolean z7 = dVar != null && dVar.f25320p0[0] == 2;
        if (this.f25366u0 == 0) {
            i5 = eVar.i(3);
            i10 = eVar.i(5);
            d dVar2 = this.T;
            z7 = dVar2 != null && dVar2.f25320p0[1] == 2;
        }
        if (this.f25367v0) {
            c cVar2 = this.f25365t0;
            if (cVar2.f25286c) {
                v.g k6 = cVar.k(cVar2);
                cVar.d(k6, this.f25365t0.d());
                if (this.f25363r0 != -1) {
                    if (z7) {
                        cVar.f(cVar.k(i10), k6, 0, 5);
                    }
                } else if (this.f25364s0 != -1 && z7) {
                    v.g k9 = cVar.k(i10);
                    cVar.f(k6, cVar.k(i5), 0, 5);
                    cVar.f(k9, k6, 0, 5);
                }
                this.f25367v0 = false;
                return;
            }
        }
        if (this.f25363r0 != -1) {
            v.g k10 = cVar.k(this.f25365t0);
            cVar.e(k10, cVar.k(i5), this.f25363r0, 8);
            if (z7) {
                cVar.f(cVar.k(i10), k10, 0, 5);
                return;
            }
            return;
        }
        if (this.f25364s0 != -1) {
            v.g k11 = cVar.k(this.f25365t0);
            v.g k12 = cVar.k(i10);
            cVar.e(k11, k12, -this.f25364s0, 8);
            if (z7) {
                cVar.f(k11, cVar.k(i5), 0, 5);
                cVar.f(k12, k11, 0, 5);
                return;
            }
            return;
        }
        if (this.f25362q0 != -1.0f) {
            v.g k13 = cVar.k(this.f25365t0);
            v.g k14 = cVar.k(i10);
            float f6 = this.f25362q0;
            v.b l6 = cVar.l();
            l6.f24346d.g(k13, -1.0f);
            l6.f24346d.g(k14, f6);
            cVar.c(l6);
        }
    }

    @Override // x.d
    public final boolean c() {
        return true;
    }

    @Override // x.d
    public final c i(int i5) {
        int d10 = v.f.d(i5);
        if (d10 != 1) {
            if (d10 != 2) {
                if (d10 != 3) {
                    if (d10 != 4) {
                        return null;
                    }
                }
            }
            if (this.f25366u0 == 0) {
                return this.f25365t0;
            }
            return null;
        }
        if (this.f25366u0 == 1) {
            return this.f25365t0;
        }
        return null;
    }
}

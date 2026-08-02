package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final s.n f2559a = new s.n(0);

    /* renamed from: b, reason: collision with root package name */
    public final s.j f2560b = new s.j();

    public final void a(d2 d2Var, e1 e1Var) {
        s.n nVar = this.f2559a;
        r2 r2Var = (r2) nVar.get(d2Var);
        if (r2Var == null) {
            r2Var = r2.a();
            nVar.put(d2Var, r2Var);
        }
        r2Var.f2542c = e1Var;
        r2Var.f2540a |= 8;
    }

    public final e1 b(d2 d2Var, int i5) {
        r2 r2Var;
        e1 e1Var;
        s.n nVar = this.f2559a;
        int e7 = nVar.e(d2Var);
        if (e7 >= 0 && (r2Var = (r2) nVar.j(e7)) != null) {
            int i10 = r2Var.f2540a;
            if ((i10 & i5) != 0) {
                int i11 = i10 & (~i5);
                r2Var.f2540a = i11;
                if (i5 == 4) {
                    e1Var = r2Var.f2541b;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    e1Var = r2Var.f2542c;
                }
                if ((i11 & 12) == 0) {
                    nVar.h(e7);
                    r2Var.f2540a = 0;
                    r2Var.f2541b = null;
                    r2Var.f2542c = null;
                    r2.f2539d.a(r2Var);
                }
                return e1Var;
            }
        }
        return null;
    }

    public final void c(d2 d2Var) {
        r2 r2Var = (r2) this.f2559a.get(d2Var);
        if (r2Var == null) {
            return;
        }
        r2Var.f2540a &= -2;
    }

    public final void d(d2 d2Var) {
        s.j jVar = this.f2560b;
        int i5 = jVar.i() - 1;
        while (true) {
            if (i5 < 0) {
                break;
            }
            if (d2Var == jVar.j(i5)) {
                Object[] objArr = jVar.f22562c;
                Object obj = objArr[i5];
                Object obj2 = s.k.f22564a;
                if (obj != obj2) {
                    objArr[i5] = obj2;
                    jVar.f22560a = true;
                }
            } else {
                i5--;
            }
        }
        r2 r2Var = (r2) this.f2559a.remove(d2Var);
        if (r2Var != null) {
            r2Var.f2540a = 0;
            r2Var.f2541b = null;
            r2Var.f2542c = null;
            r2.f2539d.a(r2Var);
        }
    }
}

package y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class n implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f25513a;

    /* renamed from: b, reason: collision with root package name */
    public x.d f25514b;

    /* renamed from: c, reason: collision with root package name */
    public k f25515c;

    /* renamed from: d, reason: collision with root package name */
    public int f25516d;

    /* renamed from: e, reason: collision with root package name */
    public final f f25517e = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public int f25518f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25519g = false;

    /* renamed from: h, reason: collision with root package name */
    public final e f25520h = new e(this);

    /* renamed from: i, reason: collision with root package name */
    public final e f25521i = new e(this);
    public int j = 1;

    public n(x.d dVar) {
        this.f25514b = dVar;
    }

    public static void b(e eVar, e eVar2, int i5) {
        eVar.f25499l.add(eVar2);
        eVar.f25494f = i5;
        eVar2.f25498k.add(eVar);
    }

    public static e h(x.c cVar) {
        x.c cVar2 = cVar.f25289f;
        if (cVar2 == null) {
            return null;
        }
        x.d dVar = cVar2.f25287d;
        int d10 = v.f.d(cVar2.f25288e);
        if (d10 == 1) {
            return dVar.f25299d.f25520h;
        }
        if (d10 == 2) {
            return dVar.f25301e.f25520h;
        }
        if (d10 == 3) {
            return dVar.f25299d.f25521i;
        }
        if (d10 == 4) {
            return dVar.f25301e.f25521i;
        }
        if (d10 != 5) {
            return null;
        }
        return dVar.f25301e.f25505k;
    }

    public static e i(x.c cVar, int i5) {
        x.c cVar2 = cVar.f25289f;
        if (cVar2 == null) {
            return null;
        }
        x.d dVar = cVar2.f25287d;
        n nVar = i5 == 0 ? dVar.f25299d : dVar.f25301e;
        int d10 = v.f.d(cVar2.f25288e);
        if (d10 == 1 || d10 == 2) {
            return nVar.f25520h;
        }
        if (d10 == 3 || d10 == 4) {
            return nVar.f25521i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i5, f fVar) {
        eVar.f25499l.add(eVar2);
        eVar.f25499l.add(this.f25517e);
        eVar.f25496h = i5;
        eVar.f25497i = fVar;
        eVar2.f25498k.add(eVar);
        fVar.f25498k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i5, int i10) {
        if (i10 == 0) {
            x.d dVar = this.f25514b;
            int i11 = dVar.f25325v;
            int max = Math.max(dVar.f25324u, i5);
            if (i11 > 0) {
                max = Math.min(i11, i5);
            }
            if (max != i5) {
                return max;
            }
        } else {
            x.d dVar2 = this.f25514b;
            int i12 = dVar2.f25328y;
            int max2 = Math.max(dVar2.f25327x, i5);
            if (i12 > 0) {
                max2 = Math.min(i12, i5);
            }
            if (max2 != i5) {
                return max2;
            }
        }
        return i5;
    }

    public long j() {
        if (this.f25517e.j) {
            return r0.f25495g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f25513a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(x.c cVar, x.c cVar2, int i5) {
        e h10 = h(cVar);
        e h11 = h(cVar2);
        if (h10.j && h11.j) {
            int e7 = cVar.e() + h10.f25495g;
            int e9 = h11.f25495g - cVar2.e();
            int i10 = e9 - e7;
            f fVar = this.f25517e;
            if (!fVar.j && this.f25516d == 3) {
                int i11 = this.f25513a;
                if (i11 == 0) {
                    fVar.d(g(i10, i5));
                } else if (i11 == 1) {
                    fVar.d(Math.min(g(fVar.f25500m, i5), i10));
                } else if (i11 == 2) {
                    x.d dVar = this.f25514b;
                    x.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        if ((i5 == 0 ? dVar2.f25299d : dVar2.f25301e).f25517e.j) {
                            fVar.d(g((int) ((r6.f25495g * (i5 == 0 ? dVar.f25326w : dVar.f25329z)) + 0.5f), i5));
                        }
                    }
                } else if (i11 == 3) {
                    x.d dVar3 = this.f25514b;
                    n nVar = dVar3.f25299d;
                    if (nVar.f25516d == 3 && nVar.f25513a == 3) {
                        l lVar = dVar3.f25301e;
                        if (lVar.f25516d == 3) {
                        }
                    }
                    if (i5 == 0) {
                        nVar = dVar3.f25301e;
                    }
                    if (nVar.f25517e.j) {
                        float f6 = dVar3.W;
                        fVar.d(i5 == 1 ? (int) ((r6.f25495g / f6) + 0.5f) : (int) ((f6 * r6.f25495g) + 0.5f));
                    }
                }
            }
            if (fVar.j) {
                int i12 = fVar.f25495g;
                e eVar = this.f25521i;
                e eVar2 = this.f25520h;
                if (i12 == i10) {
                    eVar2.d(e7);
                    eVar.d(e9);
                    return;
                }
                float f10 = i5 == 0 ? this.f25514b.f25300d0 : this.f25514b.e0;
                if (h10 == h11) {
                    e7 = h10.f25495g;
                    e9 = h11.f25495g;
                    f10 = 0.5f;
                }
                eVar2.d((int) ((((e9 - e7) - i12) * f10) + e7 + 0.5f));
                eVar.d(eVar2.f25495g + fVar.f25495g);
            }
        }
    }
}

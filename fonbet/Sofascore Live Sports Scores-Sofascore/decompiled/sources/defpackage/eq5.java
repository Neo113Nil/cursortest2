package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class eq5 implements d0g, rzf {
    public final Object a;
    public final d0g b;
    public volatile rzf c;
    public volatile rzf d;
    public int e = 3;
    public int f = 3;

    public eq5(Object obj, d0g d0gVar) {
        this.a = obj;
        this.b = d0gVar;
    }

    @Override // defpackage.d0g, defpackage.rzf
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.d0g
    public final boolean b(rzf rzfVar) {
        boolean z;
        synchronized (this.a) {
            d0g d0gVar = this.b;
            z = (d0gVar == null || d0gVar.b(this)) && rzfVar.equals(this.c);
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 3 && this.f == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final void clear() {
        synchronized (this.a) {
            try {
                this.e = 3;
                this.c.clear();
                if (this.f != 3) {
                    this.f = 3;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rzf
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.e == 4 || this.f == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean e(rzf rzfVar) {
        if (rzfVar instanceof eq5) {
            eq5 eq5Var = (eq5) rzfVar;
            if (this.c.e(eq5Var.c) && this.d.e(eq5Var.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.d0g
    public final void f(rzf rzfVar) {
        synchronized (this.a) {
            try {
                if (rzfVar.equals(this.d)) {
                    this.f = 5;
                    d0g d0gVar = this.b;
                    if (d0gVar != null) {
                        d0gVar.f(this);
                    }
                    return;
                }
                this.e = 5;
                if (this.f != 1) {
                    this.f = 1;
                    this.d.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d0g
    public final void g(rzf rzfVar) {
        synchronized (this.a) {
            try {
                if (rzfVar.equals(this.c)) {
                    this.e = 4;
                } else if (rzfVar.equals(this.d)) {
                    this.f = 4;
                }
                d0g d0gVar = this.b;
                if (d0gVar != null) {
                    d0gVar.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [d0g] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.d0g
    public final d0g getRoot() {
        ?? r2;
        synchronized (this.a) {
            try {
                d0g d0gVar = this.b;
                this = this;
                if (d0gVar != null) {
                    r2 = d0gVar.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r2;
    }

    @Override // defpackage.d0g
    public final boolean h(rzf rzfVar) {
        boolean z;
        int i;
        synchronized (this.a) {
            d0g d0gVar = this.b;
            z = false;
            if (d0gVar == null || d0gVar.h(this)) {
                if (this.e != 5 ? rzfVar.equals(this.c) : rzfVar.equals(this.d) && ((i = this.f) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.d0g
    public final boolean i(rzf rzfVar) {
        boolean z;
        synchronized (this.a) {
            d0g d0gVar = this.b;
            z = d0gVar == null || d0gVar.i(this);
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                z = true;
                if (this.e != 1 && this.f != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final void j() {
        synchronized (this.a) {
            try {
                if (this.e != 1) {
                    this.e = 1;
                    this.c.j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rzf
    public final void pause() {
        synchronized (this.a) {
            try {
                if (this.e == 1) {
                    this.e = 2;
                    this.c.pause();
                }
                if (this.f == 1) {
                    this.f = 2;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

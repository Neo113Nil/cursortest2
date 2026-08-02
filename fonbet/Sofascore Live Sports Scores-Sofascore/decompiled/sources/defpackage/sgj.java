package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sgj implements d0g, rzf {
    public final d0g a;
    public final Object b;
    public volatile hih c;
    public volatile rzf d;
    public int e = 3;
    public int f = 3;
    public boolean g;

    public sgj(Object obj, d0g d0gVar) {
        this.b = obj;
        this.a = d0gVar;
    }

    @Override // defpackage.d0g, defpackage.rzf
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.d0g
    public final boolean b(rzf rzfVar) {
        boolean z;
        synchronized (this.b) {
            try {
                d0g d0gVar = this.a;
                z = (d0gVar == null || d0gVar.b(this)) && rzfVar.equals(this.c) && this.e != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 3;
        }
        return z;
    }

    @Override // defpackage.rzf
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            this.e = 3;
            this.f = 3;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // defpackage.rzf
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.e == 4;
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean e(rzf rzfVar) {
        if (!(rzfVar instanceof sgj)) {
            return false;
        }
        sgj sgjVar = (sgj) rzfVar;
        if (this.c == null) {
            if (sgjVar.c != null) {
                return false;
            }
        } else if (!this.c.e(sgjVar.c)) {
            return false;
        }
        return this.d == null ? sgjVar.d == null : this.d.e(sgjVar.d);
    }

    @Override // defpackage.d0g
    public final void f(rzf rzfVar) {
        synchronized (this.b) {
            try {
                if (!rzfVar.equals(this.c)) {
                    this.f = 5;
                    return;
                }
                this.e = 5;
                d0g d0gVar = this.a;
                if (d0gVar != null) {
                    d0gVar.f(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.d0g
    public final void g(rzf rzfVar) {
        synchronized (this.b) {
            try {
                if (rzfVar.equals(this.d)) {
                    this.f = 4;
                    return;
                }
                this.e = 4;
                d0g d0gVar = this.a;
                if (d0gVar != null) {
                    d0gVar.g(this);
                }
                if (!vxd.a(this.f)) {
                    this.d.clear();
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
        synchronized (this.b) {
            try {
                d0g d0gVar = this.a;
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
        synchronized (this.b) {
            try {
                d0g d0gVar = this.a;
                z = (d0gVar == null || d0gVar.h(this)) && rzfVar.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.d0g
    public final boolean i(rzf rzfVar) {
        boolean z;
        synchronized (this.b) {
            try {
                d0g d0gVar = this.a;
                z = (d0gVar == null || d0gVar.i(this)) && (rzfVar.equals(this.c) || this.e != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = true;
            if (this.e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.rzf
    public final void j() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != 4 && this.f != 1) {
                        this.f = 1;
                        this.d.j();
                    }
                    if (this.g && this.e != 1) {
                        this.e = 1;
                        this.c.j();
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.rzf
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!vxd.a(this.f)) {
                    this.f = 2;
                    this.d.pause();
                }
                if (!vxd.a(this.e)) {
                    this.e = 2;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

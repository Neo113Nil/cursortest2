package L4;

import L4.e;

/* loaded from: classes2.dex */
public final class b implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f6991a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6992b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f6993c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f6994d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f6995e;

    /* renamed from: f, reason: collision with root package name */
    public e.a f6996f;

    public b(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f6995e = aVar;
        this.f6996f = aVar;
        this.f6991a = obj;
        this.f6992b = eVar;
    }

    @Override // L4.e, L4.d
    public boolean a() {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                z10 = this.f6993c.a() || this.f6994d.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.e
    public void b(d dVar) {
        synchronized (this.f6991a) {
            try {
                if (dVar.equals(this.f6994d)) {
                    this.f6996f = e.a.FAILED;
                    e eVar = this.f6992b;
                    if (eVar != null) {
                        eVar.b(this);
                    }
                    return;
                }
                this.f6995e = e.a.FAILED;
                e.a aVar = this.f6996f;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f6996f = aVar2;
                    this.f6994d.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.e
    public boolean c(d dVar) {
        boolean m10;
        synchronized (this.f6991a) {
            m10 = m();
        }
        return m10;
    }

    @Override // L4.d
    public void clear() {
        synchronized (this.f6991a) {
            try {
                e.a aVar = e.a.CLEARED;
                this.f6995e = aVar;
                this.f6993c.clear();
                if (this.f6996f != aVar) {
                    this.f6996f = aVar;
                    this.f6994d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.e
    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                z10 = l() && j(dVar);
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.d
    public boolean e() {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                e.a aVar = this.f6995e;
                e.a aVar2 = e.a.CLEARED;
                z10 = aVar == aVar2 && this.f6996f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.e
    public boolean f(d dVar) {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                z10 = k() && dVar.equals(this.f6993c);
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.e
    public void g(d dVar) {
        synchronized (this.f6991a) {
            try {
                if (dVar.equals(this.f6993c)) {
                    this.f6995e = e.a.SUCCESS;
                } else if (dVar.equals(this.f6994d)) {
                    this.f6996f = e.a.SUCCESS;
                }
                e eVar = this.f6992b;
                if (eVar != null) {
                    eVar.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.e
    public e getRoot() {
        e root;
        synchronized (this.f6991a) {
            try {
                e eVar = this.f6992b;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // L4.d
    public void h() {
        synchronized (this.f6991a) {
            try {
                e.a aVar = this.f6995e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar != aVar2) {
                    this.f6995e = aVar2;
                    this.f6993c.h();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.d
    public boolean i(d dVar) {
        if (dVar instanceof b) {
            b bVar = (b) dVar;
            if (this.f6993c.i(bVar.f6993c) && this.f6994d.i(bVar.f6994d)) {
                return true;
            }
        }
        return false;
    }

    @Override // L4.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                e.a aVar = this.f6995e;
                e.a aVar2 = e.a.SUCCESS;
                z10 = aVar == aVar2 || this.f6996f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f6991a) {
            try {
                e.a aVar = this.f6995e;
                e.a aVar2 = e.a.RUNNING;
                z10 = aVar == aVar2 || this.f6996f == aVar2;
            } finally {
            }
        }
        return z10;
    }

    public final boolean j(d dVar) {
        e.a aVar = this.f6995e;
        e.a aVar2 = e.a.FAILED;
        if (aVar != aVar2) {
            return dVar.equals(this.f6993c);
        }
        if (!dVar.equals(this.f6994d)) {
            return false;
        }
        e.a aVar3 = this.f6996f;
        return aVar3 == e.a.SUCCESS || aVar3 == aVar2;
    }

    public final boolean k() {
        e eVar = this.f6992b;
        return eVar == null || eVar.f(this);
    }

    public final boolean l() {
        e eVar = this.f6992b;
        return eVar == null || eVar.d(this);
    }

    public final boolean m() {
        e eVar = this.f6992b;
        return eVar == null || eVar.c(this);
    }

    public void n(d dVar, d dVar2) {
        this.f6993c = dVar;
        this.f6994d = dVar2;
    }

    @Override // L4.d
    public void pause() {
        synchronized (this.f6991a) {
            try {
                e.a aVar = this.f6995e;
                e.a aVar2 = e.a.RUNNING;
                if (aVar == aVar2) {
                    this.f6995e = e.a.PAUSED;
                    this.f6993c.pause();
                }
                if (this.f6996f == aVar2) {
                    this.f6996f = e.a.PAUSED;
                    this.f6994d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

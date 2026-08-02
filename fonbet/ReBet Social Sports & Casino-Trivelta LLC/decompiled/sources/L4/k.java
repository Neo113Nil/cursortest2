package L4;

import L4.e;

/* loaded from: classes2.dex */
public class k implements e, d {

    /* renamed from: a, reason: collision with root package name */
    public final e f7053a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7054b;

    /* renamed from: c, reason: collision with root package name */
    public volatile d f7055c;

    /* renamed from: d, reason: collision with root package name */
    public volatile d f7056d;

    /* renamed from: e, reason: collision with root package name */
    public e.a f7057e;

    /* renamed from: f, reason: collision with root package name */
    public e.a f7058f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7059g;

    public k(Object obj, e eVar) {
        e.a aVar = e.a.CLEARED;
        this.f7057e = aVar;
        this.f7058f = aVar;
        this.f7054b = obj;
        this.f7053a = eVar;
    }

    private boolean j() {
        e eVar = this.f7053a;
        return eVar == null || eVar.f(this);
    }

    private boolean k() {
        e eVar = this.f7053a;
        return eVar == null || eVar.d(this);
    }

    private boolean l() {
        e eVar = this.f7053a;
        return eVar == null || eVar.c(this);
    }

    @Override // L4.e, L4.d
    public boolean a() {
        boolean z10;
        synchronized (this.f7054b) {
            try {
                z10 = this.f7056d.a() || this.f7055c.a();
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.e
    public void b(d dVar) {
        synchronized (this.f7054b) {
            try {
                if (!dVar.equals(this.f7055c)) {
                    this.f7058f = e.a.FAILED;
                    return;
                }
                this.f7057e = e.a.FAILED;
                e eVar = this.f7053a;
                if (eVar != null) {
                    eVar.b(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.e
    public boolean c(d dVar) {
        boolean z10;
        synchronized (this.f7054b) {
            try {
                z10 = l() && (dVar.equals(this.f7055c) || this.f7057e != e.a.SUCCESS);
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.d
    public void clear() {
        synchronized (this.f7054b) {
            this.f7059g = false;
            e.a aVar = e.a.CLEARED;
            this.f7057e = aVar;
            this.f7058f = aVar;
            this.f7056d.clear();
            this.f7055c.clear();
        }
    }

    @Override // L4.e
    public boolean d(d dVar) {
        boolean z10;
        synchronized (this.f7054b) {
            try {
                z10 = k() && dVar.equals(this.f7055c) && !a();
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.d
    public boolean e() {
        boolean z10;
        synchronized (this.f7054b) {
            z10 = this.f7057e == e.a.CLEARED;
        }
        return z10;
    }

    @Override // L4.e
    public boolean f(d dVar) {
        boolean z10;
        synchronized (this.f7054b) {
            try {
                z10 = j() && dVar.equals(this.f7055c) && this.f7057e != e.a.PAUSED;
            } finally {
            }
        }
        return z10;
    }

    @Override // L4.e
    public void g(d dVar) {
        synchronized (this.f7054b) {
            try {
                if (dVar.equals(this.f7056d)) {
                    this.f7058f = e.a.SUCCESS;
                    return;
                }
                this.f7057e = e.a.SUCCESS;
                e eVar = this.f7053a;
                if (eVar != null) {
                    eVar.g(this);
                }
                if (!this.f7058f.b()) {
                    this.f7056d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // L4.e
    public e getRoot() {
        e root;
        synchronized (this.f7054b) {
            try {
                e eVar = this.f7053a;
                root = eVar != null ? eVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // L4.d
    public void h() {
        synchronized (this.f7054b) {
            try {
                this.f7059g = true;
                try {
                    if (this.f7057e != e.a.SUCCESS) {
                        e.a aVar = this.f7058f;
                        e.a aVar2 = e.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f7058f = aVar2;
                            this.f7056d.h();
                        }
                    }
                    if (this.f7059g) {
                        e.a aVar3 = this.f7057e;
                        e.a aVar4 = e.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f7057e = aVar4;
                            this.f7055c.h();
                        }
                    }
                    this.f7059g = false;
                } catch (Throwable th2) {
                    this.f7059g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // L4.d
    public boolean i(d dVar) {
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            if (this.f7055c != null ? this.f7055c.i(kVar.f7055c) : kVar.f7055c == null) {
                if (this.f7056d == null) {
                    if (kVar.f7056d == null) {
                        return true;
                    }
                } else if (this.f7056d.i(kVar.f7056d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // L4.d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f7054b) {
            z10 = this.f7057e == e.a.SUCCESS;
        }
        return z10;
    }

    @Override // L4.d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f7054b) {
            z10 = this.f7057e == e.a.RUNNING;
        }
        return z10;
    }

    public void m(d dVar, d dVar2) {
        this.f7055c = dVar;
        this.f7056d = dVar2;
    }

    @Override // L4.d
    public void pause() {
        synchronized (this.f7054b) {
            try {
                if (!this.f7058f.b()) {
                    this.f7058f = e.a.PAUSED;
                    this.f7056d.pause();
                }
                if (!this.f7057e.b()) {
                    this.f7057e = e.a.PAUSED;
                    this.f7055c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

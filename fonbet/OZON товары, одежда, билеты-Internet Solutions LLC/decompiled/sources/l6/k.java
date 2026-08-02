package l6;

import l6.f;

/* loaded from: classes8.dex */
public final class k implements f, InterfaceC7882e {

    /* renamed from: a, reason: collision with root package name */
    private final f f72900a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f72901b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC7882e f72902c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC7882e f72903d;

    /* renamed from: e, reason: collision with root package name */
    private f.a f72904e;

    /* renamed from: f, reason: collision with root package name */
    private f.a f72905f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f72906g;

    public k(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f72904e = aVar;
        this.f72905f = aVar;
        this.f72901b = obj;
        this.f72900a = fVar;
    }

    @Override // l6.f, l6.InterfaceC7882e
    public final boolean a() {
        boolean z11;
        synchronized (this.f72901b) {
            try {
                z11 = this.f72903d.a() || this.f72902c.a();
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean b(InterfaceC7882e interfaceC7882e) {
        if (interfaceC7882e instanceof k) {
            k kVar = (k) interfaceC7882e;
            if (this.f72902c != null ? this.f72902c.b(kVar.f72902c) : kVar.f72902c == null) {
                if (this.f72903d == null) {
                    if (kVar.f72903d == null) {
                        return true;
                    }
                } else if (this.f72903d.b(kVar.f72903d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // l6.f
    public final void c(InterfaceC7882e interfaceC7882e) {
        synchronized (this.f72901b) {
            try {
                if (interfaceC7882e.equals(this.f72903d)) {
                    this.f72905f = f.a.SUCCESS;
                    return;
                }
                this.f72904e = f.a.SUCCESS;
                f fVar = this.f72900a;
                if (fVar != null) {
                    fVar.c(this);
                }
                if (!this.f72905f.a()) {
                    this.f72903d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.InterfaceC7882e
    public final void clear() {
        synchronized (this.f72901b) {
            this.f72906g = false;
            f.a aVar = f.a.CLEARED;
            this.f72904e = aVar;
            this.f72905f = aVar;
            this.f72903d.clear();
            this.f72902c.clear();
        }
    }

    @Override // l6.InterfaceC7882e
    public final boolean d() {
        boolean z11;
        synchronized (this.f72901b) {
            z11 = this.f72904e == f.a.CLEARED;
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean e() {
        boolean z11;
        synchronized (this.f72901b) {
            z11 = this.f72904e == f.a.SUCCESS;
        }
        return z11;
    }

    @Override // l6.f
    public final boolean f(InterfaceC7882e interfaceC7882e) {
        boolean z11;
        synchronized (this.f72901b) {
            try {
                f fVar = this.f72900a;
                z11 = (fVar == null || fVar.f(this)) && interfaceC7882e.equals(this.f72902c) && this.f72904e != f.a.PAUSED;
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.f
    public final void g(InterfaceC7882e interfaceC7882e) {
        synchronized (this.f72901b) {
            try {
                if (!interfaceC7882e.equals(this.f72902c)) {
                    this.f72905f = f.a.FAILED;
                    return;
                }
                this.f72904e = f.a.FAILED;
                f fVar = this.f72900a;
                if (fVar != null) {
                    fVar.g(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.f
    public final f getRoot() {
        f root;
        synchronized (this.f72901b) {
            try {
                f fVar = this.f72900a;
                root = fVar != null ? fVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // l6.f
    public final boolean h(InterfaceC7882e interfaceC7882e) {
        boolean z11;
        synchronized (this.f72901b) {
            try {
                f fVar = this.f72900a;
                z11 = (fVar == null || fVar.h(this)) && (interfaceC7882e.equals(this.f72902c) || this.f72904e != f.a.SUCCESS);
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.f
    public final boolean i(InterfaceC7882e interfaceC7882e) {
        boolean z11;
        synchronized (this.f72901b) {
            try {
                f fVar = this.f72900a;
                z11 = (fVar == null || fVar.i(this)) && interfaceC7882e.equals(this.f72902c) && !a();
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f72901b) {
            z11 = this.f72904e == f.a.RUNNING;
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final void j() {
        synchronized (this.f72901b) {
            try {
                this.f72906g = true;
                try {
                    if (this.f72904e != f.a.SUCCESS) {
                        f.a aVar = this.f72905f;
                        f.a aVar2 = f.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f72905f = aVar2;
                            this.f72903d.j();
                        }
                    }
                    if (this.f72906g) {
                        f.a aVar3 = this.f72904e;
                        f.a aVar4 = f.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f72904e = aVar4;
                            this.f72902c.j();
                        }
                    }
                    this.f72906g = false;
                } catch (Throwable th2) {
                    this.f72906g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void k(InterfaceC7882e interfaceC7882e, InterfaceC7882e interfaceC7882e2) {
        this.f72902c = interfaceC7882e;
        this.f72903d = interfaceC7882e2;
    }

    @Override // l6.InterfaceC7882e
    public final void pause() {
        synchronized (this.f72901b) {
            try {
                if (!this.f72905f.a()) {
                    this.f72905f = f.a.PAUSED;
                    this.f72903d.pause();
                }
                if (!this.f72904e.a()) {
                    this.f72904e = f.a.PAUSED;
                    this.f72902c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

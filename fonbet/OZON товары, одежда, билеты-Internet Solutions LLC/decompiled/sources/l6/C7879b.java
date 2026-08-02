package l6;

import l6.f;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7879b implements f, InterfaceC7882e {

    /* renamed from: a, reason: collision with root package name */
    private final Object f72854a;

    /* renamed from: b, reason: collision with root package name */
    private final f f72855b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InterfaceC7882e f72856c;

    /* renamed from: d, reason: collision with root package name */
    private volatile InterfaceC7882e f72857d;

    /* renamed from: e, reason: collision with root package name */
    private f.a f72858e;

    /* renamed from: f, reason: collision with root package name */
    private f.a f72859f;

    public C7879b(Object obj, f fVar) {
        f.a aVar = f.a.CLEARED;
        this.f72858e = aVar;
        this.f72859f = aVar;
        this.f72854a = obj;
        this.f72855b = fVar;
    }

    @Override // l6.f, l6.InterfaceC7882e
    public final boolean a() {
        boolean z11;
        synchronized (this.f72854a) {
            try {
                z11 = this.f72856c.a() || this.f72857d.a();
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean b(InterfaceC7882e interfaceC7882e) {
        if (interfaceC7882e instanceof C7879b) {
            C7879b c7879b = (C7879b) interfaceC7882e;
            if (this.f72856c.b(c7879b.f72856c) && this.f72857d.b(c7879b.f72857d)) {
                return true;
            }
        }
        return false;
    }

    @Override // l6.f
    public final void c(InterfaceC7882e interfaceC7882e) {
        synchronized (this.f72854a) {
            try {
                if (interfaceC7882e.equals(this.f72856c)) {
                    this.f72858e = f.a.SUCCESS;
                } else if (interfaceC7882e.equals(this.f72857d)) {
                    this.f72859f = f.a.SUCCESS;
                }
                f fVar = this.f72855b;
                if (fVar != null) {
                    fVar.c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.InterfaceC7882e
    public final void clear() {
        synchronized (this.f72854a) {
            try {
                f.a aVar = f.a.CLEARED;
                this.f72858e = aVar;
                this.f72856c.clear();
                if (this.f72859f != aVar) {
                    this.f72859f = aVar;
                    this.f72857d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.InterfaceC7882e
    public final boolean d() {
        boolean z11;
        synchronized (this.f72854a) {
            try {
                f.a aVar = this.f72858e;
                f.a aVar2 = f.a.CLEARED;
                z11 = aVar == aVar2 && this.f72859f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean e() {
        boolean z11;
        synchronized (this.f72854a) {
            try {
                f.a aVar = this.f72858e;
                f.a aVar2 = f.a.SUCCESS;
                z11 = aVar == aVar2 || this.f72859f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.f
    public final boolean f(InterfaceC7882e interfaceC7882e) {
        boolean z11;
        synchronized (this.f72854a) {
            f fVar = this.f72855b;
            z11 = (fVar == null || fVar.f(this)) && interfaceC7882e.equals(this.f72856c);
        }
        return z11;
    }

    @Override // l6.f
    public final void g(InterfaceC7882e interfaceC7882e) {
        synchronized (this.f72854a) {
            try {
                if (interfaceC7882e.equals(this.f72857d)) {
                    this.f72859f = f.a.FAILED;
                    f fVar = this.f72855b;
                    if (fVar != null) {
                        fVar.g(this);
                    }
                    return;
                }
                this.f72858e = f.a.FAILED;
                f.a aVar = this.f72859f;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f72859f = aVar2;
                    this.f72857d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l6.f
    public final f getRoot() {
        f root;
        synchronized (this.f72854a) {
            try {
                f fVar = this.f72855b;
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
        synchronized (this.f72854a) {
            f fVar = this.f72855b;
            z11 = fVar == null || fVar.h(this);
        }
        return z11;
    }

    @Override // l6.f
    public final boolean i(InterfaceC7882e interfaceC7882e) {
        boolean z11;
        f.a aVar;
        synchronized (this.f72854a) {
            f fVar = this.f72855b;
            z11 = false;
            if (fVar == null || fVar.i(this)) {
                f.a aVar2 = this.f72858e;
                f.a aVar3 = f.a.FAILED;
                if (aVar2 != aVar3 ? interfaceC7882e.equals(this.f72856c) : interfaceC7882e.equals(this.f72857d) && ((aVar = this.f72859f) == f.a.SUCCESS || aVar == aVar3)) {
                    z11 = true;
                }
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final boolean isRunning() {
        boolean z11;
        synchronized (this.f72854a) {
            try {
                f.a aVar = this.f72858e;
                f.a aVar2 = f.a.RUNNING;
                z11 = aVar == aVar2 || this.f72859f == aVar2;
            } finally {
            }
        }
        return z11;
    }

    @Override // l6.InterfaceC7882e
    public final void j() {
        synchronized (this.f72854a) {
            try {
                f.a aVar = this.f72858e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar != aVar2) {
                    this.f72858e = aVar2;
                    this.f72856c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void k(InterfaceC7882e interfaceC7882e, InterfaceC7882e interfaceC7882e2) {
        this.f72856c = interfaceC7882e;
        this.f72857d = interfaceC7882e2;
    }

    @Override // l6.InterfaceC7882e
    public final void pause() {
        synchronized (this.f72854a) {
            try {
                f.a aVar = this.f72858e;
                f.a aVar2 = f.a.RUNNING;
                if (aVar == aVar2) {
                    this.f72858e = f.a.PAUSED;
                    this.f72856c.pause();
                }
                if (this.f72859f == aVar2) {
                    this.f72859f = f.a.PAUSED;
                    this.f72857d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class h8d {
    public l8d a;
    public List b;
    public List c;
    public r8d d;
    public boolean e;
    public boolean f;
    public f8d g;

    public h8d(l8d l8dVar, boolean z, int i) {
        l8dVar.getClass();
        this.a = l8dVar;
        km5 km5Var = km5.a;
        this.b = km5Var;
        this.c = km5Var;
        this.d = p8d.a;
        this.e = z;
        this.f = false;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(e8d e8dVar);

    public abstract void d(e8d e8dVar);

    public final void f() {
        f8d f8dVar = this.g;
        if (f8dVar == null || !f8dVar.c.h(this)) {
            return;
        }
        n8d n8dVar = f8dVar.b;
        if (equals(n8dVar.f)) {
            int i = n8dVar.g;
            p8d p8dVar = p8d.a;
            if (i == -1) {
                this.d = p8dVar;
                a();
            } else if (i == 1) {
                this.d = p8dVar;
                e();
            }
            n8dVar.f = null;
            n8dVar.g = 0;
            n8dVar.h = null;
        }
        n8dVar.d.remove(this);
        n8dVar.e.remove(this);
        this.g = null;
        n8dVar.b();
    }

    public final void g(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        f8d f8dVar = this.g;
        if (f8dVar != null) {
            f8dVar.b.b();
        }
    }

    public void e() {
    }
}

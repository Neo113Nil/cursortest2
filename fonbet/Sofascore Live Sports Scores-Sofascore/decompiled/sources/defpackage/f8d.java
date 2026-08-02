package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class f8d {
    public final kr9 a;
    public final n8d b = new n8d();
    public final m0d c;
    public final m0d d;

    public f8d(kr9 kr9Var) {
        this.a = kr9Var;
        awd.a();
        this.c = awd.a();
        this.d = awd.a();
    }

    public static void a(f8d f8dVar, h8d h8dVar) {
        f8dVar.getClass();
        h8dVar.getClass();
        if (f8dVar.c.a(h8dVar)) {
            n8d n8dVar = f8dVar.b;
            if (h8dVar.g != null) {
                pvd.A(h8dVar, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            n8dVar.e.addFirst(h8dVar);
            h8dVar.g = f8dVar;
            n8dVar.b();
        }
    }

    public final void b(m8d m8dVar) {
        if (this.d.a(m8dVar)) {
            this.b.a(this, m8dVar, -1);
        }
    }

    public final void c(npd npdVar, int i) {
        if (i != 1 && i != 0) {
            ogj.h(ljg.j(i, "Unsupported priority value: "));
        } else if (this.d.a(npdVar)) {
            this.b.a(this, npdVar, i);
        }
    }

    public final void d(m8d m8dVar, e8d e8dVar) {
        n8d n8dVar = this.b;
        if (n8dVar.g != 0) {
            return;
        }
        h8d c = n8dVar.c(-1);
        n8dVar.f = c;
        n8dVar.g = -1;
        n8dVar.h = m8dVar;
        if (e8dVar != null) {
            if (c != null) {
                c.d = new q8d(e8dVar, -1);
                c.d(e8dVar);
            }
            n8dVar.a.m(null, new q8d(e8dVar, -1));
        }
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class m8d {
    public f8d a;
    public boolean b;

    public final void a() {
        f8d f8dVar = this.a;
        if (f8dVar == null) {
            a70.r("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            f8dVar.d(this, null);
        }
        n8d n8dVar = f8dVar.b;
        kr9 kr9Var = f8dVar.a;
        if (equals(n8dVar.h) && -1 == n8dVar.g) {
            h8d h8dVar = n8dVar.f;
            if (h8dVar == null) {
                h8dVar = n8dVar.c(-1);
            }
            n8dVar.f = null;
            n8dVar.g = 0;
            n8dVar.h = null;
            p8d p8dVar = p8d.a;
            if (h8dVar == null) {
                ((upd) kr9Var.b).a.run();
            } else {
                h8dVar.d = p8dVar;
                h8dVar.b();
            }
            n8dVar.a.m(null, p8dVar);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}

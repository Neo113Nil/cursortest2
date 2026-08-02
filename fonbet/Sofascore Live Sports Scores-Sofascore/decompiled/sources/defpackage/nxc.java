package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nxc {
    public final oxc a;
    public final v19 b;
    public final jge c;
    public rk3 d;
    public dfb e;
    public boolean f = false;
    public final /* synthetic */ j7g g;

    public nxc(j7g j7gVar, oxc oxcVar, jge jgeVar, cge cgeVar) {
        this.g = j7gVar;
        this.a = oxcVar;
        this.c = jgeVar;
        this.e = cgeVar;
        v19 v19Var = new v19(new z89(this, 1));
        this.b = v19Var;
        this.d = rk3.a;
        v19Var.C(jgeVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address = ");
        sb.append(this.a);
        sb.append(", state = ");
        sb.append(this.d);
        sb.append(", picker type: ");
        sb.append(this.e.getClass());
        sb.append(", lb: ");
        sb.append(this.b.A().getClass());
        sb.append(this.f ? ", deactivated" : "");
        return sb.toString();
    }
}

package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class lpg implements swf {
    public uqg a;
    public spg b;
    public String c;
    public Object d;
    public Object[] e;
    public rpg f;
    public final e6g g = new e6g(this, 5);

    public lpg(uqg uqgVar, spg spgVar, String str, Object obj, Object[] objArr) {
        this.a = uqgVar;
        this.b = spgVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // defpackage.swf
    public final void a() {
        c();
    }

    @Override // defpackage.swf
    public final void b() {
        rpg rpgVar = this.f;
        if (rpgVar != null) {
            ((x6k) rpgVar).z();
        }
    }

    public final void c() {
        String s;
        spg spgVar = this.b;
        if (this.f != null) {
            pvd.A(this.f, ") is not null", "entry(");
            return;
        }
        if (spgVar != null) {
            e6g e6gVar = this.g;
            Object invoke = e6gVar.invoke();
            if (invoke == null || spgVar.d(invoke)) {
                this.f = spgVar.a(this.c, e6gVar);
                return;
            }
            if (invoke instanceof coh) {
                coh cohVar = (coh) invoke;
                if (cohVar.b() == f7a.k || cohVar.b() == wib.i || cohVar.b() == p4h.g) {
                    s = "MutableState containing " + cohVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    s = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                s = o3a.s(invoke);
            }
            throw new IllegalArgumentException(s);
        }
    }

    @Override // defpackage.swf
    public final void d() {
        rpg rpgVar = this.f;
        if (rpgVar != null) {
            ((x6k) rpgVar).z();
        }
    }
}

package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class jb3 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public ec3 f;
    public final HashSet g;

    public jb3(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(oif.a(cls));
        for (Class cls2 : clsArr) {
            d2a.r(cls2, "Null interface");
            this.b.add(oif.a(cls2));
        }
    }

    public final void a(qx4 qx4Var) {
        if (this.b.contains(qx4Var.a)) {
            a70.p("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(qx4Var);
        }
    }

    public final kb3 b() {
        if (this.f != null) {
            return new kb3(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        a70.r("Missing required property: factory.");
        return null;
    }

    public final void c(int i) {
        if (this.d == 0) {
            this.d = i;
        } else {
            a70.r("Instantiation type has already been set.");
        }
    }

    public jb3(oif oifVar, oif... oifVarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(oifVar);
        for (oif oifVar2 : oifVarArr) {
            d2a.r(oifVar2, "Null interface");
        }
        Collections.addAll(this.b, oifVarArr);
    }
}

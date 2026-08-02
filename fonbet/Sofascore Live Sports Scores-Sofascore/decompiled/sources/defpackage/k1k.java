package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class k1k implements fo3, k41 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final z78 d;
    public final z78 e;
    public final z78 f;

    public k1k(p41 p41Var, ybh ybhVar) {
        this.a = ybhVar.e;
        this.c = ybhVar.a;
        z78 g = ybhVar.b.g();
        this.d = g;
        z78 g2 = ybhVar.c.g();
        this.e = g2;
        z78 g3 = ybhVar.d.g();
        this.f = g3;
        p41Var.f(g);
        p41Var.f(g2);
        p41Var.f(g3);
        g.a(this);
        g2.a(this);
        g3.a(this);
    }

    @Override // defpackage.k41
    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((k41) arrayList.get(i)).a();
            i++;
        }
    }

    public final void c(k41 k41Var) {
        this.b.add(k41Var);
    }

    @Override // defpackage.fo3
    public final void b(List list, List list2) {
    }
}

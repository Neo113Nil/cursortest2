package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qcl {
    public final k6g a;
    public final yxk b = new yxk(4);
    public final v8c c = new v8c(10);

    public qcl(k6g k6gVar) {
        this.a = k6gVar;
    }

    public final void a(glg glgVar, dh0 dh0Var) {
        ah0 ah0Var = (ah0) dh0Var.keySet();
        dh0 dh0Var2 = ah0Var.a;
        if (dh0Var2.isEmpty()) {
            return;
        }
        if (dh0Var.c > 999) {
            d2a.C(dh0Var, new ocl(this, glgVar, 0));
            return;
        }
        StringBuilder q = fc6.q("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        pea.m(dh0Var2.c, q);
        q.append(")");
        nlg V0 = glgVar.V0(q.toString());
        Iterator it = ah0Var.iterator();
        int i = 1;
        while (true) {
            zg0 zg0Var = (zg0) it;
            if (!zg0Var.hasNext()) {
                try {
                    break;
                } finally {
                    V0.close();
                }
            } else {
                V0.L(i, (String) zg0Var.next());
                i++;
            }
        }
        V0.getClass();
        int F = z1a.F(V0, "work_spec_id");
        if (F == -1) {
            return;
        }
        while (V0.U0()) {
            List list = (List) dh0Var.get(V0.F0(F));
            if (list != null) {
                byte[] blob = V0.getBlob(0);
                md4 md4Var = md4.b;
                list.add(ww9.y(blob));
            }
        }
    }

    public final void b(glg glgVar, dh0 dh0Var) {
        ah0 ah0Var = (ah0) dh0Var.keySet();
        dh0 dh0Var2 = ah0Var.a;
        if (dh0Var2.isEmpty()) {
            return;
        }
        if (dh0Var.c > 999) {
            d2a.C(dh0Var, new ocl(this, glgVar, 1));
            return;
        }
        StringBuilder q = fc6.q("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        pea.m(dh0Var2.c, q);
        q.append(")");
        nlg V0 = glgVar.V0(q.toString());
        Iterator it = ah0Var.iterator();
        int i = 1;
        while (true) {
            zg0 zg0Var = (zg0) it;
            if (!zg0Var.hasNext()) {
                try {
                    break;
                } finally {
                    V0.close();
                }
            } else {
                V0.L(i, (String) zg0Var.next());
                i++;
            }
        }
        V0.getClass();
        int F = z1a.F(V0, "work_spec_id");
        if (F == -1) {
            return;
        }
        while (V0.U0()) {
            List list = (List) dh0Var.get(V0.F0(F));
            if (list != null) {
                list.add(V0.F0(0));
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        gz8.S(this.a, false, true, new cfi(str, 18));
    }

    public final sbl d(String str) {
        str.getClass();
        return (sbl) gz8.S(this.a, true, false, new cfi(str, 11));
    }

    public final lcl e(String str) {
        str.getClass();
        return (lcl) gz8.S(this.a, true, false, new cfi(str, 10));
    }

    public final List f(String str) {
        str.getClass();
        return (List) gz8.S(this.a, true, false, new cfi(str, 19));
    }

    public final void g(long j, String str) {
        str.getClass();
        ((Number) gz8.S(this.a, false, true, new mcl(0, j, str))).intValue();
    }

    public final void h(int i, String str) {
        str.getClass();
        gz8.S(this.a, false, true, new pu9(str, i, 4));
    }

    public final void i(long j, String str) {
        str.getClass();
        gz8.S(this.a, false, true, new mcl(1, j, str));
    }

    public final void j(sbl sblVar, String str) {
        str.getClass();
        ((Number) gz8.S(this.a, false, true, new bcl(3, sblVar, str))).intValue();
    }

    public final void k(int i, String str) {
        str.getClass();
        gz8.S(this.a, false, true, new pu9(i, str, 5));
    }
}

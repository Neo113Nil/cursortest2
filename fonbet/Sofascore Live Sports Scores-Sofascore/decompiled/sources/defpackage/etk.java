package defpackage;

import androidx.recyclerview.widget.u;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class etk {
    public final fhh a = new fhh(0);
    public final nkb b = new nkb((Object) null);

    public final void a(u uVar, drf drfVar) {
        fhh fhhVar = this.a;
        ctk ctkVar = (ctk) fhhVar.get(uVar);
        if (ctkVar == null) {
            ctkVar = ctk.a();
            fhhVar.put(uVar, ctkVar);
        }
        ctkVar.c = drfVar;
        ctkVar.a |= 8;
    }

    public final drf b(u uVar, int i) {
        ctk ctkVar;
        drf drfVar;
        fhh fhhVar = this.a;
        int e = fhhVar.e(uVar);
        if (e >= 0 && (ctkVar = (ctk) fhhVar.k(e)) != null) {
            int i2 = ctkVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                ctkVar.a = i3;
                if (i == 4) {
                    drfVar = ctkVar.b;
                } else if (i == 8) {
                    drfVar = ctkVar.c;
                } else {
                    a70.p("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    fhhVar.i(e);
                    ctkVar.a = 0;
                    ctkVar.b = null;
                    ctkVar.c = null;
                    ctk.d.b(ctkVar);
                }
                return drfVar;
            }
        }
        return null;
    }

    public final void c(u uVar) {
        ctk ctkVar = (ctk) this.a.get(uVar);
        if (ctkVar == null) {
            return;
        }
        ctkVar.a &= -2;
    }

    public final void d(u uVar) {
        nkb nkbVar = this.b;
        int i = nkbVar.i() - 1;
        while (true) {
            if (i < 0) {
                break;
            }
            if (uVar == nkbVar.j(i)) {
                Object[] objArr = nkbVar.c;
                Object obj = objArr[i];
                Object obj2 = tol.e;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    nkbVar.a = true;
                }
            } else {
                i--;
            }
        }
        ctk ctkVar = (ctk) this.a.remove(uVar);
        if (ctkVar != null) {
            ctkVar.a = 0;
            ctkVar.b = null;
            ctkVar.c = null;
            ctk.d.b(ctkVar);
        }
    }
}

package n2;

import java.util.ArrayList;
import m2.e;

/* loaded from: classes.dex */
public final class i {
    public static o a(m2.e eVar, int i11, ArrayList<o> arrayList, o oVar) {
        int i12;
        int i13 = i11 == 0 ? eVar.f74159t0 : eVar.f74161u0;
        if (i13 != -1 && (oVar == null || i13 != oVar.c())) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i14);
                if (oVar2.c() == i13) {
                    if (oVar != null) {
                        oVar.f(i11, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i14++;
                }
            }
        } else if (i13 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if (eVar instanceof m2.j) {
                m2.j jVar = (m2.j) eVar;
                int i15 = 0;
                while (true) {
                    if (i15 >= jVar.f74240w0) {
                        i12 = -1;
                        break;
                    }
                    m2.e eVar2 = jVar.f74239v0[i15];
                    if ((i11 == 0 && (i12 = eVar2.f74159t0) != -1) || (i11 == 1 && (i12 = eVar2.f74161u0) != -1)) {
                        break;
                    }
                    i15++;
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        o oVar3 = arrayList.get(i16);
                        if (oVar3.c() == i12) {
                            oVar = oVar3;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i11);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof m2.h) {
                m2.h hVar = (m2.h) eVar;
                hVar.Z0().c(hVar.a1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i11 == 0) {
                eVar.f74159t0 = oVar.c();
                eVar.f74104K.c(i11, arrayList, oVar);
                eVar.f74106M.c(i11, arrayList, oVar);
            } else {
                eVar.f74161u0 = oVar.c();
                eVar.f74105L.c(i11, arrayList, oVar);
                eVar.f74108O.c(i11, arrayList, oVar);
                eVar.f74107N.c(i11, arrayList, oVar);
            }
            eVar.f74111R.c(i11, arrayList, oVar);
        }
        return oVar;
    }

    public static boolean b(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}

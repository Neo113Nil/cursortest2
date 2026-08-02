package m2;

import f2.C6404d;
import m2.e;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    static boolean[] f74241a = new boolean[3];

    static void a(f fVar, C6404d c6404d, e eVar) {
        eVar.f74150p = -1;
        eVar.f74152q = -1;
        e.b bVar = fVar.f74115V[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f74115V[0] == e.b.MATCH_PARENT) {
            d dVar = eVar.f74104K;
            int i11 = dVar.f74091g;
            int N11 = fVar.N();
            d dVar2 = eVar.f74106M;
            int i12 = N11 - dVar2.f74091g;
            dVar.f74093i = c6404d.k(dVar);
            dVar2.f74093i = c6404d.k(dVar2);
            c6404d.d(dVar.f74093i, i11);
            c6404d.d(dVar2.f74093i, i12);
            eVar.f74150p = 2;
            eVar.f74123b0 = i11;
            int i13 = i12 - i11;
            eVar.f74117X = i13;
            int i14 = eVar.f74129e0;
            if (i13 < i14) {
                eVar.f74117X = i14;
            }
        }
        if (fVar.f74115V[1] == bVar2 || eVar.f74115V[1] != e.b.MATCH_PARENT) {
            return;
        }
        d dVar3 = eVar.f74105L;
        int i15 = dVar3.f74091g;
        int v11 = fVar.v();
        d dVar4 = eVar.f74107N;
        int i16 = v11 - dVar4.f74091g;
        dVar3.f74093i = c6404d.k(dVar3);
        dVar4.f74093i = c6404d.k(dVar4);
        c6404d.d(dVar3.f74093i, i15);
        c6404d.d(dVar4.f74093i, i16);
        if (eVar.f74127d0 > 0 || eVar.M() == 8) {
            d dVar5 = eVar.f74108O;
            dVar5.f74093i = c6404d.k(dVar5);
            c6404d.d(dVar5.f74093i, eVar.f74127d0 + i15);
        }
        eVar.f74152q = 2;
        eVar.f74125c0 = i15;
        int i17 = i16 - i15;
        eVar.f74118Y = i17;
        int i18 = eVar.f74131f0;
        if (i17 < i18) {
            eVar.f74118Y = i18;
        }
    }

    public static final boolean b(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}

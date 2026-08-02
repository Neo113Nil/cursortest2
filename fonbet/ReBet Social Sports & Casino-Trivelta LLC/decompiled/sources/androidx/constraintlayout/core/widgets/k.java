package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.e;

/* loaded from: classes.dex */
public abstract class k {
    static boolean[] sFlags = new boolean[3];

    public static void a(f fVar, androidx.constraintlayout.core.d dVar, e eVar) {
        eVar.f17981r = -1;
        eVar.f17983s = -1;
        e.b bVar = fVar.mListDimensionBehaviors[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.mListDimensionBehaviors[0] == e.b.MATCH_PARENT) {
            int i10 = eVar.f17931K.f17908g;
            int W10 = fVar.W() - eVar.f17933M.f17908g;
            d dVar2 = eVar.f17931K;
            dVar2.f17910i = dVar.q(dVar2);
            d dVar3 = eVar.f17933M;
            dVar3.f17910i = dVar.q(dVar3);
            dVar.f(eVar.f17931K.f17910i, i10);
            dVar.f(eVar.f17933M.f17910i, W10);
            eVar.f17981r = 2;
            eVar.P0(i10, W10);
        }
        if (fVar.mListDimensionBehaviors[1] == bVar2 || eVar.mListDimensionBehaviors[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i11 = eVar.f17932L.f17908g;
        int x10 = fVar.x() - eVar.f17934N.f17908g;
        d dVar4 = eVar.f17932L;
        dVar4.f17910i = dVar.q(dVar4);
        d dVar5 = eVar.f17934N;
        dVar5.f17910i = dVar.q(dVar5);
        dVar.f(eVar.f17932L.f17910i, i11);
        dVar.f(eVar.f17934N.f17910i, x10);
        if (eVar.f17956e0 > 0 || eVar.V() == 8) {
            d dVar6 = eVar.f17935O;
            dVar6.f17910i = dVar.q(dVar6);
            dVar.f(eVar.f17935O.f17910i, eVar.f17956e0 + i11);
        }
        eVar.f17983s = 2;
        eVar.g1(i11, x10);
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ykb extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ zkb j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ykb(zkb zkbVar, int i) {
        super(0);
        this.i = i;
        this.j = zkbVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        vkb c1;
        int i = this.i;
        zkb zkbVar = this.j;
        switch (i) {
            case 0:
                ana anaVar = zkbVar.f;
                anaVar.h = 0;
                i1d z = anaVar.a.z();
                Object[] objArr = z.a;
                int i2 = z.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    zkb zkbVar2 = ((wma) objArr[i3]).G.q;
                    zkbVar2.getClass();
                    zkbVar2.h = zkbVar2.i;
                    zkbVar2.i = Integer.MAX_VALUE;
                    if (zkbVar2.j == uma.b) {
                        zkbVar2.j = uma.c;
                    }
                }
                wma wmaVar = anaVar.a;
                wma wmaVar2 = anaVar.a;
                i1d z2 = wmaVar.z();
                Object[] objArr2 = z2.a;
                int i4 = z2.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    zkb zkbVar3 = ((wma) objArr2[i5]).G.q;
                    zkbVar3.getClass();
                    zkbVar3.s.d = false;
                    Unit unit = Unit.a;
                }
                y3a y3aVar = zkbVar.y().T;
                if (y3aVar != null) {
                    boolean z3 = y3aVar.k;
                    j0d j0dVar = (j0d) wmaVar2.o();
                    int i6 = ((i1d) j0dVar.b).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        vkb c12 = ((wdd) ((wma) j0dVar.get(i7)).F.e).c1();
                        if (c12 != null) {
                            c12.k = z3;
                        }
                    }
                }
                y3a y3aVar2 = zkbVar.y().T;
                y3aVar2.getClass();
                y3aVar2.z0().b();
                if (zkbVar.y().T != null) {
                    j0d j0dVar2 = (j0d) wmaVar2.o();
                    int i8 = ((i1d) j0dVar2.b).c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        vkb c13 = ((wdd) ((wma) j0dVar2.get(i9)).F.e).c1();
                        if (c13 != null) {
                            c13.k = false;
                        }
                    }
                }
                i1d z4 = wmaVar2.z();
                Object[] objArr3 = z4.a;
                int i10 = z4.c;
                for (int i11 = 0; i11 < i10; i11++) {
                    zkb zkbVar4 = ((wma) objArr3[i11]).G.q;
                    zkbVar4.getClass();
                    int i12 = zkbVar4.h;
                    int i13 = zkbVar4.i;
                    if (i12 != i13 && i13 == Integer.MAX_VALUE) {
                        zkbVar4.p0(true);
                    }
                }
                i1d z5 = wmaVar2.z();
                Object[] objArr4 = z5.a;
                int i14 = z5.c;
                for (int i15 = 0; i15 < i14; i15++) {
                    zkb zkbVar5 = ((wma) objArr4[i15]).G.q;
                    zkbVar5.getClass();
                    xma xmaVar = zkbVar5.s;
                    xmaVar.e = xmaVar.d;
                    Unit unit2 = Unit.a;
                }
                break;
            case 1:
                ana anaVar2 = zkbVar.f;
                phe pheVar = null;
                if (d7a.C(anaVar2.a) || anaVar2.c) {
                    wdd wddVar = anaVar2.a().q;
                    if (wddVar != null) {
                        pheVar = wddVar.l;
                    }
                } else {
                    wdd wddVar2 = anaVar2.a().q;
                    if (wddVar2 != null && (c1 = wddVar2.c1()) != null) {
                        pheVar = c1.l;
                    }
                }
                if (pheVar == null) {
                    pheVar = ((xy) zma.a(anaVar2.a)).getPlacementScope();
                }
                vkb c14 = anaVar2.a().c1();
                c14.getClass();
                phe.g(pheVar, c14, zkbVar.o);
                break;
            default:
                vkb c15 = zkbVar.f.a().c1();
                c15.getClass();
                c15.J(zkbVar.z);
                break;
        }
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i1c extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ j1c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i1c(j1c j1cVar, int i) {
        super(0);
        this.i = i;
        this.j = j1cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        j1c j1cVar = this.j;
        switch (i) {
            case 0:
                ana anaVar = j1cVar.f;
                anaVar.i = 0;
                i1d z = anaVar.a.z();
                Object[] objArr = z.a;
                int i2 = z.c;
                for (int i3 = 0; i3 < i2; i3++) {
                    j1c j1cVar2 = ((wma) objArr[i3]).G.p;
                    j1cVar2.h = j1cVar2.i;
                    j1cVar2.i = Integer.MAX_VALUE;
                    j1cVar2.u = false;
                    if (j1cVar2.l == uma.b) {
                        j1cVar2.l = uma.c;
                    }
                }
                wma wmaVar = anaVar.a;
                wma wmaVar2 = anaVar.a;
                i1d z2 = wmaVar.z();
                Object[] objArr2 = z2.a;
                int i4 = z2.c;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((wma) objArr2[i5]).G.p.y.d = false;
                    Unit unit = Unit.a;
                }
                if (j1cVar.y().k) {
                    j0d j0dVar = (j0d) wmaVar2.o();
                    int i6 = ((i1d) j0dVar.b).c;
                    for (int i7 = 0; i7 < i6; i7++) {
                        ((wdd) ((wma) j0dVar.get(i7)).F.e).k = true;
                    }
                }
                j1cVar.y().z0().b();
                if (j1cVar.y().k) {
                    j0d j0dVar2 = (j0d) wmaVar2.o();
                    int i8 = ((i1d) j0dVar2.b).c;
                    for (int i9 = 0; i9 < i8; i9++) {
                        ((wdd) ((wma) j0dVar2.get(i9)).F.e).k = false;
                    }
                }
                i1d z3 = wmaVar2.z();
                Object[] objArr3 = z3.a;
                int i10 = z3.c;
                for (int i11 = 0; i11 < i10; i11++) {
                    wma wmaVar3 = (wma) objArr3[i11];
                    ana anaVar2 = wmaVar3.G;
                    if (anaVar2.p.h != wmaVar3.w()) {
                        wmaVar2.O();
                        wmaVar2.C();
                        if (wmaVar3.w() == Integer.MAX_VALUE) {
                            if (anaVar2.c || d7a.C(wmaVar3)) {
                                zkb zkbVar = anaVar2.q;
                                zkbVar.getClass();
                                zkbVar.p0(false);
                            }
                            anaVar2.p.q0();
                        }
                    }
                }
                i1d z4 = wmaVar2.z();
                Object[] objArr4 = z4.a;
                int i12 = z4.c;
                for (int i13 = 0; i13 < i12; i13++) {
                    xma xmaVar = ((wma) objArr4[i13]).G.p.y;
                    xmaVar.e = xmaVar.d;
                    Unit unit2 = Unit.a;
                }
                break;
            case 1:
                j1cVar.f.a().J(j1cVar.C);
                break;
            default:
                ana anaVar3 = j1cVar.f;
                wdd wddVar = anaVar3.a().q;
                phe placementScope = wddVar != null ? wddVar.l : ((xy) zma.a(anaVar3.a)).getPlacementScope();
                Function1 function1 = j1cVar.H;
                n29 n29Var = j1cVar.I;
                if (n29Var != null) {
                    wdd a = anaVar3.a();
                    long j = j1cVar.J;
                    float f = j1cVar.K;
                    placementScope.d(a);
                    a.a0(f, r6a.d(j, a.e), n29Var);
                } else if (function1 == null) {
                    wdd a2 = anaVar3.a();
                    long j2 = j1cVar.J;
                    float f2 = j1cVar.K;
                    placementScope.d(a2);
                    a2.b0(r6a.d(j2, a2.e), f2, null);
                } else {
                    wdd a3 = anaVar3.a();
                    long j3 = j1cVar.J;
                    float f3 = j1cVar.K;
                    placementScope.d(a3);
                    a3.b0(r6a.d(j3, a3.e), f3, function1);
                }
                break;
        }
        return Unit.a;
    }
}

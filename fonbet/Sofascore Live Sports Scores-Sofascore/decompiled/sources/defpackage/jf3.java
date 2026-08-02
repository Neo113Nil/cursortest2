package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jf3 extends xka implements Function2 {
    public final /* synthetic */ int i = 1;
    public final /* synthetic */ lf3 j;
    public final /* synthetic */ xy k;
    public final /* synthetic */ tc3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf3(xy xyVar, lf3 lf3Var, tc3 tc3Var) {
        super(2);
        this.k = xyVar;
        this.j = lf3Var;
        this.l = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        tc3 tc3Var = this.l;
        xy xyVar = this.k;
        lf3 lf3Var = this.j;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    av8Var.d0(866651995);
                    dh3.a(xyVar, lf3Var.k, tc3Var, av8Var, 0);
                    av8Var.s(false);
                } else {
                    av8Var.W();
                }
                break;
            default:
                ((Number) obj2).intValue();
                lf3Var.a(xyVar, tc3Var, (of3) obj, aba.K(1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf3(lf3 lf3Var, xy xyVar, tc3 tc3Var, int i) {
        super(2);
        this.j = lf3Var;
        this.k = xyVar;
        this.l = tc3Var;
    }
}

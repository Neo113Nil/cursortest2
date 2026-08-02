package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e60 extends xka implements ct8 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e60(Object obj, int i) {
        super(3);
        this.i = i;
        this.j = obj;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.i;
        Object obj4 = this.j;
        switch (i) {
            case 0:
                qhe J = ((g1c) obj2).J(((an3) obj3).a);
                return m1c.G0((m1c) obj, J.a, J.b, new i20(6, J, (pp3) obj4));
            case 1:
                ((Number) obj3).intValue();
                av8 av8Var = (av8) ((of3) obj2);
                av8Var.d0(955869654);
                j38 j38Var = (j38) obj4;
                av8Var.s(false);
                return j38Var;
            case 2:
                of3 of3Var = ((zkh) obj).a;
                of3 of3Var2 = (of3) obj2;
                ((Number) obj3).intValue();
                int hashCode = Integer.hashCode(z8e.G(of3Var2));
                xtc xtcVar = (xtc) obj4;
                if (xtcVar != utc.a) {
                    xtcVar = fqj.C(of3Var2, new xg3(((av8) of3Var2).m()).z(xtcVar));
                }
                av8 av8Var2 = (av8) of3Var;
                av8Var2.e0(509942095);
                if3.k7.getClass();
                waa.K(av8Var2, xtcVar, hf3.d);
                waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
                av8Var2.s(false);
                return Unit.a;
            default:
                ((Number) obj3).intValue();
                av8 av8Var3 = (av8) ((of3) obj2);
                av8Var3.d0(374375707);
                Object O = av8Var3.O();
                if (O == nf3.a) {
                    O = new tze();
                    av8Var3.n0(O);
                }
                tze tzeVar = (tze) O;
                tzeVar.a = (Function1) obj4;
                oi oiVar = tzeVar.b;
                if (oiVar != null) {
                    oiVar.b = null;
                }
                tzeVar.b = null;
                av8Var3.s(false);
                return tzeVar;
        }
    }
}

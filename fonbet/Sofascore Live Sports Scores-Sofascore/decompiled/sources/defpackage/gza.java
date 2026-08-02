package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class gza implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hza b;
    public final /* synthetic */ vua c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ gza(hza hzaVar, vua vuaVar, boolean z, int i) {
        this.a = i;
        this.b = hzaVar;
        this.c = vuaVar;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        vua vuaVar = this.c;
        hza hzaVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(767152283, av8Var, new gza(hzaVar, vuaVar, this.d, i2)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    gv9 gv9Var = (gv9) ((eoh) hzaVar.e).getValue();
                    sza szaVar = (sza) ((eoh) hzaVar.f).getValue();
                    int h = hzaVar.g.h();
                    boolean g = av8Var2.g(vuaVar);
                    Object O = av8Var2.O();
                    a99 a99Var = nf3.a;
                    if (g || O == a99Var) {
                        O = new ida(vuaVar, 14);
                        av8Var2.n0(O);
                    }
                    Function1 function1 = (Function1) O;
                    boolean i3 = av8Var2.i(hzaVar);
                    Object O2 = av8Var2.O();
                    if (i3 || O2 == a99Var) {
                        O2 = new faa(hzaVar, 12);
                        av8Var2.n0(O2);
                    }
                    g7a.b(gv9Var, function1, (Function2) O2, h, this.d, szaVar, null, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}

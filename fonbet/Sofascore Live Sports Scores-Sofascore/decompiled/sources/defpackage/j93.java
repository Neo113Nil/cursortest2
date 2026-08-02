package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class j93 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ tc3 d;

    public /* synthetic */ j93(String str, xtc xtcVar, tc3 tc3Var, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = xtcVar;
        this.d = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        tc3 tc3Var = this.d;
        xtc xtcVar = this.c;
        String str = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                l93.a(str, xtcVar, tc3Var, of3Var, aba.K(385));
                break;
            case 1:
                hkg.o(str, xtcVar, tc3Var, of3Var, aba.K(385));
                break;
            default:
                m77.a(str, xtcVar, tc3Var, of3Var, aba.K(433));
                break;
        }
        return Unit.a;
    }
}

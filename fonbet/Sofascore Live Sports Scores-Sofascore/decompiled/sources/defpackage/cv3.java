package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv3 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xtc d;

    public /* synthetic */ cv3(String str, String str2, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        xtc xtcVar = this.d;
        String str = this.c;
        String str2 = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                z8e.c(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            case 1:
                yso.b(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            case 2:
                rd0.e(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            case 3:
                v9g.t(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            case 4:
                td4.x(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            case 5:
                l4a.c(str2, str, xtcVar, of3Var, aba.K(1));
                break;
            default:
                w3a.b(str2, str, xtcVar, of3Var, aba.K(1));
                break;
        }
        return Unit.a;
    }
}

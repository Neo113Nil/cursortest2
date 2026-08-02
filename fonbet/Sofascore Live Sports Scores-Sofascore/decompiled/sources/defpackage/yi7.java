package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class yi7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ yi7(String str, int i, xtc xtcVar, int i2) {
        this.a = 0;
        this.b = str;
        this.d = i;
        this.c = xtcVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        xtc xtcVar = this.c;
        String str = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                yso.i(i2, aba.K(385), of3Var, xtcVar, str);
                break;
            case 1:
                td4.L(aba.K(i2 | 1), of3Var, xtcVar, str);
                break;
            case 2:
                b9b.i(aba.K(i2 | 1), of3Var, xtcVar, str);
                break;
            case 3:
                k53.S(aba.K(i2 | 1), of3Var, xtcVar, str);
                break;
            default:
                z5l.c(aba.K(i2 | 1), of3Var, xtcVar, str);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ yi7(String str, xtc xtcVar, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = xtcVar;
        this.d = i;
    }
}

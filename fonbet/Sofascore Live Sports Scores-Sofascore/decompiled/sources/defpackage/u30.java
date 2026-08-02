package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class u30 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ tc3 c;
    public final /* synthetic */ int d;

    public /* synthetic */ u30(xtc xtcVar, tc3 tc3Var, int i, int i2) {
        this.a = i2;
        this.b = xtcVar;
        this.c = tc3Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        tc3 tc3Var = this.c;
        xtc xtcVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k53.Q(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                k53.R(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            case 2:
                ft4.d(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            case 3:
                tz9.i(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            case 4:
                tz9.h(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            case 5:
                n4o.n(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            default:
                n4o.m(xtcVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}

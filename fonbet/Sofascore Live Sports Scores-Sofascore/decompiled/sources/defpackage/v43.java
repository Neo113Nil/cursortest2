package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class v43 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tbj b;
    public final /* synthetic */ tc3 c;
    public final /* synthetic */ int d;

    public /* synthetic */ v43(tbj tbjVar, tc3 tc3Var, int i, int i2) {
        this.a = i2;
        this.b = tbjVar;
        this.c = tc3Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        tc3 tc3Var = this.c;
        tbj tbjVar = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                o02.f(tbjVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
            default:
                lz.e(tbjVar, tc3Var, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}

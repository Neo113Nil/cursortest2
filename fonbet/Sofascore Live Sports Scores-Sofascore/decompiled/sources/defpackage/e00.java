package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e00 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e00(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.i = i2;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.j;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.k;
        of3 of3Var = (of3) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                oyn.b((Function0) obj5, (z15) obj4, (tc3) obj3, of3Var, aba.K(i2 | 1));
                break;
            case 1:
                gvd.b((xtc) obj5, (zj0) obj4, (op3) obj3, of3Var, i2 | 1);
                break;
            case 2:
                jaa.a((ot9) obj5, (xtc) obj4, (op3) obj3, of3Var, i2 | 1);
                break;
            default:
                rz8.s((xji) obj5, (xtc) obj4, (Function2) obj3, of3Var, aba.K(i2 | 1));
                break;
        }
        return Unit.a;
    }
}

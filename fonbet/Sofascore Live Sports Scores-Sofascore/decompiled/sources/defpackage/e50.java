package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e50 extends xka implements Function2 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(vy8 vy8Var, ho hoVar, tc3 tc3Var, int i, int i2) {
        super(2);
        this.l = vy8Var;
        this.m = hoVar;
        this.n = tc3Var;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.j;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                td4.a((Function1) obj5, (xtc) obj3, (Function1) obj4, (of3) obj, aba.K(i2 | 1), this.k);
                break;
            default:
                ((Number) obj2).intValue();
                lz.c((vy8) obj5, (ho) obj4, (tc3) obj3, (of3) obj, i2 | 1, this.k);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(Function1 function1, xtc xtcVar, Function1 function12, int i, int i2) {
        super(2);
        this.l = function1;
        this.n = xtcVar;
        this.m = function12;
        this.j = i;
        this.k = i2;
    }
}

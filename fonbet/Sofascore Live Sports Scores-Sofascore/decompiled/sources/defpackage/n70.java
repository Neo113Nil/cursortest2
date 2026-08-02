package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class n70 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ xtc k;
    public final /* synthetic */ zo5 l;
    public final /* synthetic */ of6 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ ct8 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n70(boolean z, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, ct8 ct8Var, int i, int i2, int i3) {
        super(2);
        this.i = i3;
        this.j = z;
        this.k = xtcVar;
        this.l = zo5Var;
        this.m = of6Var;
        this.n = str;
        this.q = ct8Var;
        this.o = i;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        int i2 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                fz8.e(this.j, this.k, this.l, this.m, this.n, this.q, (of3) obj, aba.K(i2 | 1), this.p);
                break;
            default:
                ((Number) obj2).intValue();
                tc3 tc3Var = (tc3) this.q;
                fz8.d(this.j, this.k, this.l, this.m, this.n, tc3Var, (of3) obj, aba.K(i2 | 1), this.p);
                break;
        }
        return Unit.a;
    }
}

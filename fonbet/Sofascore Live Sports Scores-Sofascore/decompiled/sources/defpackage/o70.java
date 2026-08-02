package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o70 extends xka implements Function2 {
    public final /* synthetic */ v23 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ xtc k;
    public final /* synthetic */ zo5 l;
    public final /* synthetic */ of6 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ tc3 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o70(v23 v23Var, boolean z, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, tc3 tc3Var, int i, int i2) {
        super(2);
        this.i = v23Var;
        this.j = z;
        this.k = xtcVar;
        this.l = zo5Var;
        this.m = of6Var;
        this.n = str;
        this.o = tc3Var;
        this.p = i;
        this.q = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fz8.b(this.i, this.j, this.k, this.l, this.m, this.n, this.o, (of3) obj, aba.K(this.p | 1), this.q);
        return Unit.a;
    }
}

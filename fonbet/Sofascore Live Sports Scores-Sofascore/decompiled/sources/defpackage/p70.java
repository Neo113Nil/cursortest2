package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p70 extends xka implements Function2 {
    public final /* synthetic */ h1d i;
    public final /* synthetic */ xtc j;
    public final /* synthetic */ zo5 k;
    public final /* synthetic */ of6 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ tc3 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p70(h1d h1dVar, xtc xtcVar, zo5 zo5Var, of6 of6Var, String str, tc3 tc3Var, int i, int i2) {
        super(2);
        this.i = h1dVar;
        this.j = xtcVar;
        this.k = zo5Var;
        this.l = of6Var;
        this.m = str;
        this.n = tc3Var;
        this.o = i;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fz8.c(this.i, this.j, this.k, this.l, this.m, this.n, (of3) obj, aba.K(this.o | 1), this.p);
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l20 extends xka implements Function2 {
    public final /* synthetic */ mv1 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ Function0 k;
    public final /* synthetic */ g2f l;
    public final /* synthetic */ tc3 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l20(mv1 mv1Var, long j, Function0 function0, g2f g2fVar, tc3 tc3Var, int i, int i2) {
        super(2);
        this.i = mv1Var;
        this.j = j;
        this.k = function0;
        this.l = g2fVar;
        this.m = tc3Var;
        this.n = i;
        this.o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t20.b(this.i, this.j, this.k, this.l, this.m, (of3) obj, aba.K(this.n | 1), this.o);
        return Unit.a;
    }
}

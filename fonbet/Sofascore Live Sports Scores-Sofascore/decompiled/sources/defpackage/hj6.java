package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hj6 implements Function2 {
    public final /* synthetic */ jj6 a;
    public final /* synthetic */ xtc b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h1d d;
    public final /* synthetic */ e1d e;
    public final /* synthetic */ qug f;
    public final /* synthetic */ uah g;
    public final /* synthetic */ long h;
    public final /* synthetic */ float i;
    public final /* synthetic */ tc3 j;

    public hj6(jj6 jj6Var, xtc xtcVar, boolean z, h1d h1dVar, e1d e1dVar, qug qugVar, uah uahVar, long j, float f, tc3 tc3Var) {
        this.a = jj6Var;
        this.b = xtcVar;
        this.c = z;
        this.d = h1dVar;
        this.e = e1dVar;
        this.f = qugVar;
        this.g = uahVar;
        this.h = j;
        this.i = f;
        this.j = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        int i = 2;
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            jj6 jj6Var = this.a;
            pea.b(s9a.A(this.b, new l4b(this.c, jj6Var.j, jj6Var.k, i)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, av8Var, 384);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

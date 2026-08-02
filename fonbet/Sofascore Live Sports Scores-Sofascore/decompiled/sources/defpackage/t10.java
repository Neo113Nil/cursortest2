package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class t10 implements Function2 {
    public final /* synthetic */ xtc a;
    public final /* synthetic */ h1d b;
    public final /* synthetic */ e1d c;
    public final /* synthetic */ qug d;
    public final /* synthetic */ uah e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ tc3 h;

    public t10(xtc xtcVar, h1d h1dVar, e1d e1dVar, qug qugVar, uah uahVar, long j, float f, tc3 tc3Var) {
        this.a = xtcVar;
        this.b = h1dVar;
        this.c = e1dVar;
        this.d = qugVar;
        this.e = uahVar;
        this.f = j;
        this.g = f;
        this.h = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            pea.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, av8Var, 384);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

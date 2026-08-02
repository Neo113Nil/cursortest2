package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class txd implements ct8 {
    public final /* synthetic */ wcj a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jwk d;
    public final /* synthetic */ wzc e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ n9j j;
    public final /* synthetic */ uah k;

    public txd(wcj wcjVar, boolean z, boolean z2, jwk jwkVar, wzc wzcVar, boolean z3, Function2 function2, Function2 function22, Function2 function23, n9j n9jVar, uah uahVar) {
        this.a = wcjVar;
        this.b = z;
        this.c = z2;
        this.d = jwkVar;
        this.e = wzcVar;
        this.f = z3;
        this.g = function2;
        this.h = function22;
        this.i = function23;
        this.j = n9jVar;
        this.k = uahVar;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Function2 function2 = (Function2) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).i(function2) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            a99 a99Var = a99.f;
            String str = this.a.a.b;
            uah uahVar = this.k;
            boolean z = this.b;
            boolean z2 = this.f;
            wzc wzcVar = this.e;
            n9j n9jVar = this.j;
            a99Var.r(str, function2, z, this.c, this.d, wzcVar, z2, this.g, this.h, null, null, this.i, n9jVar, null, yqo.H(1409265477, av8Var, new sxd(z, z2, wzcVar, n9jVar, uahVar)), av8Var, (intValue << 3) & 112);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qxd implements ct8 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ jwk d;
    public final /* synthetic */ wzc e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ n9j i;
    public final /* synthetic */ uah j;

    public qxd(String str, boolean z, boolean z2, jwk jwkVar, wzc wzcVar, Function2 function2, Function2 function22, Function2 function23, n9j n9jVar, uah uahVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = jwkVar;
        this.e = wzcVar;
        this.f = function2;
        this.g = function22;
        this.h = function23;
        this.i = n9jVar;
        this.j = uahVar;
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
            uah uahVar = this.j;
            int i = intValue;
            boolean z = this.b;
            wzc wzcVar = this.e;
            n9j n9jVar = this.i;
            a99Var.r(this.a, function2, z, this.c, this.d, wzcVar, false, this.f, null, this.g, this.h, null, n9jVar, null, yqo.H(-656940872, av8Var, new mfc(z, wzcVar, n9jVar, uahVar)), av8Var, (i << 3) & 112);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

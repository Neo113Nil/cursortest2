package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class erg implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ tc3 c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ l1d f;
    public final /* synthetic */ Function2 g;

    public erg(int i, Function2 function2, tc3 tc3Var, Function2 function22, Function2 function23, l1d l1dVar, Function2 function24) {
        this.a = i;
        this.b = function2;
        this.c = tc3Var;
        this.d = function22;
        this.e = function23;
        this.f = l1dVar;
        this.g = function24;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        int intValue = ((Number) obj2).intValue();
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
            q5a.q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, av8Var, 0);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

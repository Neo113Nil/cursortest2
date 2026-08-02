package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qzj implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ h4d c;
    public final /* synthetic */ wla d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ cdi f;

    public qzj(List list, Function1 function1, h4d h4dVar, wla wlaVar, Function2 function2, cdi cdiVar) {
        this.a = list;
        this.b = function1;
        this.c = h4dVar;
        this.d = wlaVar;
        this.e = function2;
        this.f = cdiVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            w8g w8gVar = (w8g) this.a.get(intValue);
            av8Var.d0(-1298647357);
            if (w8gVar instanceof v8g) {
                av8Var.d0(-1843006310);
                szj.h((v8g) w8gVar, this.b, av8Var, 0);
                av8Var.s(false);
            } else {
                boolean z = w8gVar instanceof t8g;
                h4d h4dVar = this.c;
                cdi cdiVar = this.f;
                if (z) {
                    av8Var.d0(-1843000845);
                    szj.c((t8g) w8gVar, (tee) cdiVar.getValue(), h4dVar, this.d, this.b, this.e, av8Var, 0);
                    av8Var.s(false);
                } else if (w8gVar instanceof u8g) {
                    av8Var.d0(-1842989579);
                    szj.d((u8g) w8gVar, (tee) cdiVar.getValue(), h4dVar, this.d, this.b, this.e, av8Var, 0);
                    av8Var.s(false);
                } else {
                    if (!(w8gVar instanceof s8g)) {
                        throw dmi.h(av8Var, -1843007168, false);
                    }
                    av8Var.d0(-1842978449);
                    szj.a((s8g) w8gVar, (tee) cdiVar.getValue(), h4dVar, this.d, this.b, this.e, av8Var, 0);
                    av8Var.s(false);
                }
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

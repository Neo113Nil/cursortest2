package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d7l extends xka implements et8 {
    public final /* synthetic */ List i;
    public final /* synthetic */ y7l j;
    public final /* synthetic */ Context k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7l(List list, y7l y7lVar, Context context) {
        super(4);
        this.i = list;
        this.j = y7lVar;
        this.k = context;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xra xraVar = (xra) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            int i2 = intValue2 & 8;
            i = (((av8) of3Var).g(xraVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        v6l v6lVar = (v6l) this.i.get(intValue);
        av8 av8Var2 = (av8) of3Var;
        av8Var2.d0(-990952233);
        boolean z = v6lVar instanceof r6l;
        y7l y7lVar = this.j;
        if (z) {
            av8Var2.d0(1214962769);
            jaa.o(y7lVar, s9a.J(((r6l) v6lVar).a, this.k, false, false, null, 30), null, av8Var2, 0);
            av8Var2.s(false);
        } else {
            if (!(v6lVar instanceof u6l)) {
                throw dmi.h(av8Var2, 1214959788, false);
            }
            av8Var2.d0(1214973809);
            uaa.j(y7lVar, i2a.J(this.k, ((u6l) v6lVar).a), null, av8Var2, 0);
            av8Var2.s(false);
        }
        av8Var2.s(false);
        return Unit.a;
    }
}

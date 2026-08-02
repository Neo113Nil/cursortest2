package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yra extends xka implements ct8 {
    public final /* synthetic */ tc3 i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yra(tc3 tc3Var, int i) {
        super(3);
        this.i = tc3Var;
        this.j = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xra xraVar = (xra) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            int i = intValue & 8;
            intValue |= ((av8) of3Var).g(xraVar) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        this.i.invoke(xraVar, Integer.valueOf(this.j), of3Var, Integer.valueOf(intValue & 14));
        return Unit.a;
    }
}

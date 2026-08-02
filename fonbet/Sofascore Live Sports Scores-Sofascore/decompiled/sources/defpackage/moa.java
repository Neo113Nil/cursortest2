package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class moa implements ct8 {
    public final /* synthetic */ sz0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public moa(sz0 sz0Var, int i, int i2) {
        this.a = sz0Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        xpa xpaVar = (xpa) obj;
        of3 of3Var = (of3) obj2;
        int intValue = ((Number) obj3).intValue();
        xpaVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((av8) of3Var).g(xpaVar) ? 4 : 2;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(intValue & 1, (intValue & 19) != 18)) {
            rz0.a(this.a, xpa.a(xpaVar, utc.a, 7), this.b, this.c, false, av8Var, 0, 16);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}

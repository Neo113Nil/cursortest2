package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class mra implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ora b;

    public /* synthetic */ mra(ora oraVar, int i) {
        this.a = i;
        this.b = oraVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ora oraVar = this.b;
        switch (i) {
            case 0:
                uqa uqaVar = (uqa) oraVar.o.invoke();
                int itemCount = uqaVar.getItemCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= itemCount) {
                        i2 = -1;
                    } else if (!uqaVar.d(i2).equals(obj)) {
                        i2++;
                    }
                }
                return Integer.valueOf(i2);
            default:
                int intValue = ((Integer) obj).intValue();
                uqa uqaVar2 = (uqa) oraVar.o.invoke();
                if (intValue < 0 || intValue >= uqaVar2.getItemCount()) {
                    StringBuilder t = lnb.t(intValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    t.append(uqaVar2.getItemCount());
                    t.append(')');
                    u3a.a(t.toString());
                }
                xw3.L(oraVar.Y0(), null, null, new qu1(oraVar, intValue, (rq3) null, 15), 3);
                return Boolean.TRUE;
        }
    }
}

package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class uge implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y93 b;
    public final /* synthetic */ z02 c;
    public final /* synthetic */ int d;

    public /* synthetic */ uge(y93 y93Var, z02 z02Var, int i, int i2) {
        this.a = i2;
        this.b = y93Var;
        this.c = z02Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        z02 z02Var = this.c;
        y93 y93Var = this.b;
        int i3 = 1;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    haa.f(yqo.H(-1876123429, av8Var, new uge(y93Var, z02Var, i2, i3)), av8Var, 6);
                } else {
                    av8Var.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = y93Var.d;
                    ArrayList arrayList = y93Var.c;
                    boolean z2 = arrayList.size() > 1;
                    boolean isEmpty = arrayList.isEmpty();
                    int size = arrayList.size();
                    ox1 ox1Var = (ox1) z02Var.e;
                    boolean i4 = av8Var2.i(z02Var) | av8Var2.e(i2) | av8Var2.i(y93Var);
                    Object O = av8Var2.O();
                    if (i4 || O == nf3.a) {
                        O = new hp5(z02Var, i2, y93Var, 9);
                        av8Var2.n0(O);
                    }
                    mha.d(z, z2, isEmpty, size, ox1Var, (Function0) O, av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
        }
        return Unit.a;
    }
}

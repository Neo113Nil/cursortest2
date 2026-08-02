package defpackage;

import com.facebook.w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wd0 extends xka implements Function2 {
    public final /* synthetic */ int i;
    public final /* synthetic */ List j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd0(List list, int i) {
        super(2);
        this.i = i;
        this.j = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.i;
        List list = this.j;
        switch (i) {
            case 0:
                try {
                    w.c().execute(new r0(10, (Integer) obj2, list));
                } catch (Exception unused) {
                }
                break;
            default:
                of3 of3Var = (of3) obj;
                int intValue = ((Number) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Function2 function2 = (Function2) list.get(i2);
                        int hashCode = Long.hashCode(av8Var.T);
                        if3.k7.getClass();
                        gf3 gf3Var = hf3.c;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.l(gf3Var);
                        } else {
                            av8Var.q0();
                        }
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        function2.invoke(av8Var, 0);
                        av8Var.s(true);
                    }
                } else {
                    av8Var.W();
                }
                break;
        }
        return Unit.a;
    }
}

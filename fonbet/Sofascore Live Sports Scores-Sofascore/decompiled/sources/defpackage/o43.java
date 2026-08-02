package defpackage;

import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class o43 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ o43(List list, int i) {
        this.a = i;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    f5p.a(l6g.W(list), ((kx4) av8Var.k(dh3.h)).H0(5.0f), lz.D(R.color.n_lv_4, av8Var), lz.D(R.color.value, av8Var), null, av8Var, 0, 16);
                } else {
                    av8Var.W();
                }
                return Unit.a;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Pair) it.next()).b);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        xtc l = bkh.l(utc.a, 14.0f);
                        yf8 yf8Var = xth.a;
                        udj.c(str, l, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.c(), av8Var2, 48, 0, 130040);
                    }
                } else {
                    av8Var2.W();
                }
                return Unit.a;
            default:
                int intValue3 = ((Integer) obj).intValue();
                ((l83) obj2).getClass();
                return list.get(intValue3);
        }
    }
}

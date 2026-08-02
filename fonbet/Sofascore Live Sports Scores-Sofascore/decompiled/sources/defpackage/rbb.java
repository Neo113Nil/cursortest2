package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rbb implements k1c {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rbb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        switch (this.a) {
            case 0:
                return m1c.G0(m1cVar, an3.h(j), an3.g(j), new uf8(27, list, this));
            default:
                list.getClass();
                int size = list.size();
                gv9 gv9Var = (gv9) this.b;
                Integer num = null;
                if (size != gv9Var.size()) {
                    a70.p("Number of children must match number of positions");
                    return null;
                }
                int e0 = m1cVar.e0(14.0f);
                ArrayList arrayList = new ArrayList(k13.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    long j2 = j;
                    arrayList.add(((g1c) it.next()).J(an3.a(j2, e0, e0, 0, 0, 12)));
                    j = j2;
                }
                long j3 = j;
                int h = an3.h(j3) - e0;
                ArrayList arrayList2 = new ArrayList(k13.r(gv9Var, 10));
                Iterator<E> it2 = gv9Var.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(wzb.b(h * ((Number) it2.next()).floatValue())));
                }
                int size2 = gv9Var.size();
                ArrayList arrayList3 = new ArrayList(size2);
                for (int i = 0; i < size2; i++) {
                    arrayList3.add(Boolean.TRUE);
                }
                int size3 = gv9Var.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    int intValue = ((Number) arrayList2.get(i2)).intValue();
                    int i3 = i2 - 1;
                    Integer num2 = (Integer) CollectionsKt.a0(i3, arrayList2);
                    if (num2 != null && num2.intValue() + e0 > intValue) {
                        if (i2 != gv9Var.size() - 1) {
                            i3 = i2;
                        }
                        arrayList3.set(i3, Boolean.FALSE);
                    }
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Integer valueOf = Integer.valueOf(((qhe) it3.next()).b);
                    while (true) {
                        num = valueOf;
                        while (it3.hasNext()) {
                            valueOf = Integer.valueOf(((qhe) it3.next()).b);
                            if (num.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                return m1c.G0(m1cVar, an3.h(j3), num != null ? num.intValue() : 0, new vsc(11, arrayList, arrayList3, arrayList2));
        }
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q20 implements k1c {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ q20(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.k1c
    public final l1c d(m1c m1cVar, List list, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Pair pair;
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b2f) obj).setParentLayoutDirection((ema) obj2);
                return m1c.G0(m1cVar, 0, 0, ry.p);
            default:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (!(((g1c) obj3).h() instanceof qej)) {
                        arrayList3.add(obj3);
                    }
                }
                List list2 = (List) ((Function0) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList4 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        oqf oqfVar = (oqf) list2.get(i3);
                        if (oqfVar != null) {
                            float f = oqfVar.b;
                            float f2 = oqfVar.a;
                            arrayList2 = arrayList4;
                            qhe J = ((g1c) arrayList3.get(i3)).J(cn3.b(0, (int) Math.floor(oqfVar.c - f2), 0, (int) Math.floor(oqfVar.d - f), 5));
                            int round = Math.round(f2);
                            pair = new Pair(J, new r6a((Math.round(f) & 4294967295L) | (round << 32)));
                        } else {
                            arrayList2 = arrayList4;
                            pair = null;
                        }
                        ArrayList arrayList5 = arrayList2;
                        if (pair != null) {
                            arrayList5.add(pair);
                        }
                        i3++;
                        arrayList4 = arrayList5;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj4 = list.get(i4);
                    if (((g1c) obj4).h() instanceof qej) {
                        arrayList6.add(obj4);
                    }
                }
                return m1c.G0(m1cVar, an3.h(j), an3.g(j), new dvi(18, arrayList, iz8.x(arrayList6, (Function0) obj)));
        }
    }
}

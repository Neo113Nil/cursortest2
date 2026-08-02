package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class l38 {
    public final vff a;
    public final String b;
    public Integer c = null;

    public l38(vff vffVar, String str) {
        this.a = vffVar;
        this.b = str;
    }

    public static boolean b(ArrayList arrayList, b9 b9Var) {
        String str = b9Var.a;
        String str2 = b9Var.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b9 b9Var2 = (b9) it.next();
            if (b9Var2.a.equals(str) && b9Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void a(ArrayList arrayList) {
        vff vffVar = this.a;
        iu iuVar = (iu) vffVar.get();
        String str = this.b;
        ArrayDeque arrayDeque = new ArrayDeque(iuVar.d(str));
        Integer num = this.c;
        if (num == null) {
            num = Integer.valueOf(((iu) vffVar.get()).h(str));
            this.c = num;
        }
        int intValue = num.intValue();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b9 b9Var = (b9) it.next();
            while (arrayDeque.size() >= intValue) {
                ((iu) vffVar.get()).c(((hu) arrayDeque.pollFirst()).b);
            }
            hu b = b9Var.b(str);
            ((iu) vffVar.get()).a(b);
            arrayDeque.offer(b);
        }
    }

    public final void c(ArrayList arrayList) {
        d();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(b9.a((Map) it.next()));
        }
        boolean isEmpty = arrayList2.isEmpty();
        String str = this.b;
        vff vffVar = this.a;
        if (isEmpty) {
            d();
            Iterator it2 = ((iu) vffVar.get()).d(str).iterator();
            while (it2.hasNext()) {
                ((iu) vffVar.get()).c(((hu) it2.next()).b);
            }
            return;
        }
        d();
        List<hu> d = ((iu) vffVar.get()).d(str);
        ArrayList arrayList3 = new ArrayList();
        for (hu huVar : d) {
            String[] strArr = b9.g;
            String str2 = huVar.d;
            if (str2 == null) {
                str2 = "";
            }
            arrayList3.add(new b9(huVar.b, String.valueOf(huVar.c), str2, new Date(huVar.m), huVar.e, huVar.j));
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            b9 b9Var = (b9) it3.next();
            if (!b(arrayList2, b9Var)) {
                arrayList4.add(b9Var.b(str));
            }
        }
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((iu) vffVar.get()).c(((hu) it4.next()).b);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList2.iterator();
        while (it5.hasNext()) {
            b9 b9Var2 = (b9) it5.next();
            if (!b(arrayList3, b9Var2)) {
                arrayList5.add(b9Var2);
            }
        }
        a(arrayList5);
    }

    public final void d() {
        if (this.a.get() == null) {
            throw new a9("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}

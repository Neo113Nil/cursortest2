package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ajd implements u9e {
    public final List a;
    public final int b;
    public final boolean c;

    public ajd(List list) {
        boolean z;
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer b = ((vid) it.next()).b();
            if (b != null) {
                i3 = b.intValue();
            }
            i2 += i3;
        }
        this.b = i2;
        List list2 = this.a;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((vid) it2.next()).b() == null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.c = z;
        List list3 = this.a;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Integer b2 = ((vid) it3.next()).b();
                if ((b2 != null ? b2.intValue() : Integer.MAX_VALUE) <= 0) {
                    a70.p("Failed requirement.");
                    throw null;
                }
            }
        }
        List list4 = this.a;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                if (((vid) it4.next()).b() == null && (i = i + 1) < 0) {
                    b.p();
                    throw null;
                }
            }
        }
        if (i <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((vid) obj).b() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((vid) it5.next()).b);
        }
        pvd.A(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    @Override // defpackage.u9e
    public final Object a(bt3 bt3Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        int i2 = this.b;
        if (i + i2 > charSequence.length()) {
            return new l9e(i, new xxb(this, 16));
        }
        dsf dsfVar = new dsf();
        while (dsfVar.a + i < charSequence.length() && vha.z(charSequence.charAt(dsfVar.a + i))) {
            dsfVar.a++;
        }
        if (dsfVar.a < i2) {
            return new l9e(i, new ixa(23, dsfVar, this));
        }
        List list = this.a;
        int size = list.size();
        int i3 = 0;
        while (i3 < size) {
            Integer b = ((vid) list.get(i3)).b();
            int intValue = (b != null ? b.intValue() : (dsfVar.a - i2) + 1) + i;
            xid a = ((vid) list.get(i3)).a(bt3Var, charSequence, i, intValue);
            if (a != null) {
                return new l9e(i, new im1(charSequence.subSequence(i, intValue).toString(), this, i3, a, 6));
            }
            i3++;
            i = intValue;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        List<vid> list = this.a;
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (vid vidVar : list) {
            Integer b = vidVar.b();
            arrayList.add((b == null ? "at least one digit" : b + " digits") + " for " + vidVar.b);
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}

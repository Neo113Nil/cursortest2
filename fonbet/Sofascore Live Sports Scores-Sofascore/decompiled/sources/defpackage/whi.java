package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class whi implements u9e {
    public final e3c a;
    public final String b;
    public final vhi c;

    public whi(Collection collection, e3c e3cVar, String str) {
        int i;
        collection.getClass();
        this.a = e3cVar;
        this.b = str;
        this.c = new vhi();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() <= 0) {
                ogj.h("Found an empty string in ".concat(this.b));
                throw null;
            }
            vhi vhiVar = this.c;
            int length = str2.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str2.charAt(i2);
                List list = vhiVar.a;
                String valueOf = String.valueOf(charAt);
                int size = list.size();
                b.n(list.size(), size);
                int i3 = size - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i = -(i4 + 1);
                        break;
                    }
                    i = (i4 + i3) >>> 1;
                    int b = o93.b((String) ((Pair) list.get(i)).a, valueOf);
                    if (b < 0) {
                        i4 = i + 1;
                    } else if (b <= 0) {
                        break;
                    } else {
                        i3 = i - 1;
                    }
                }
                if (i < 0) {
                    vhi vhiVar2 = new vhi();
                    list.add((-i) - 1, new Pair(String.valueOf(charAt), vhiVar2));
                    vhiVar = vhiVar2;
                } else {
                    vhiVar = (vhi) ((Pair) list.get(i)).b;
                }
            }
            if (vhiVar.b) {
                ogj.h(lnb.o("The string '", str2, "' was passed several times"));
                throw null;
            }
            vhiVar.b = true;
        }
        b(this.c);
    }

    public static final void b(vhi vhiVar) {
        List<Pair> list = vhiVar.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b((vhi) ((Pair) it.next()).b);
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            String str = (String) pair.a;
            vhi vhiVar2 = (vhi) pair.b;
            boolean z = vhiVar2.b;
            List list2 = vhiVar2.a;
            if (z || list2.size() != 1) {
                arrayList.add(new Pair(str, vhiVar2));
            } else {
                Pair pair2 = (Pair) CollectionsKt.D0(list2);
                String str2 = (String) pair2.a;
                arrayList.add(new Pair(dmi.y(str, str2), (vhi) pair2.b));
            }
        }
        list.clear();
        list.addAll(CollectionsKt.H0(arrayList, new q6i(3)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r4.a = r3.length() + r4.a;
        r0 = r2;
     */
    @Override // defpackage.u9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bt3 bt3Var, CharSequence charSequence, int i) {
        charSequence.getClass();
        dsf dsfVar = new dsf();
        dsfVar.a = i;
        vhi vhiVar = this.c;
        Integer num = null;
        loop0: while (dsfVar.a <= charSequence.length()) {
            if (vhiVar.b) {
                num = Integer.valueOf(dsfVar.a);
            }
            for (Pair pair : vhiVar.a) {
                String str = (String) pair.a;
                vhi vhiVar2 = (vhi) pair.b;
                if (StringsKt.a0(dsfVar.a, charSequence, str, false)) {
                    break;
                }
            }
        }
        if (num == null) {
            return new l9e(i, new im1(this, charSequence, i, dsfVar, 7));
        }
        String obj = charSequence.subSequence(i, num.intValue()).toString();
        e3c e3cVar = this.a;
        Object i2 = e3cVar.i(bt3Var, obj);
        return i2 == null ? num : new l9e(i, new l97(20, i2, obj, e3cVar));
    }
}

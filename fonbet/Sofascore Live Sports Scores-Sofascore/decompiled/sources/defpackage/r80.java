package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class r80 {
    public static final q80 a = new q80("");

    public static final List a(q80 q80Var, int i, int i2, dt dtVar) {
        List list;
        if (i == i2 || (list = q80Var.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= q80Var.b.length()) {
            if (dtVar == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) dtVar.invoke(((p80) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            p80 p80Var = (p80) list.get(i3);
            if (dtVar != null ? ((Boolean) dtVar.invoke(p80Var.a)).booleanValue() : true) {
                int i4 = p80Var.b;
                int i5 = p80Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new p80((m80) p80Var.a, p80Var.d, llf.c(p80Var.b, i, i2) - i, llf.c(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return ((i < i4) & (i3 < i2)) | (((i == i2) | (i3 == i4)) & (i == i3));
    }
}

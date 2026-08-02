package defpackage;

import com.ironsource.C4427z5;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class be2 {
    public final int a;
    public final String b;
    public ArrayList c = null;
    public ArrayList d = null;

    public be2(int i, String str) {
        this.a = 0;
        this.b = null;
        this.a = i == 0 ? 1 : i;
        this.b = str;
    }

    public final void a(int i, String str, String str2) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.c = arrayList;
        }
        arrayList.add(new pd2(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.a;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.b;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                pd2 pd2Var = (pd2) it.next();
                sb.append('[');
                String str2 = pd2Var.a;
                String str3 = pd2Var.c;
                sb.append(str2);
                int C = wt3.C(pd2Var.b);
                if (C == 1) {
                    sb.append(C4427z5.U);
                    sb.append(str3);
                } else if (C == 2) {
                    sb.append("~=");
                    sb.append(str3);
                } else if (C == 3) {
                    sb.append("|=");
                    sb.append(str3);
                }
                sb.append(']');
            }
        }
        ArrayList arrayList2 = this.d;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                sd2 sd2Var = (sd2) it2.next();
                sb.append(':');
                sb.append(sd2Var);
            }
        }
        return sb.toString();
    }
}

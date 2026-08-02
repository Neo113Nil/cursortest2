package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sh0 {
    public final char a;
    public final List b;
    public final ArrayList c;

    public sh0(char c, List list, ArrayList arrayList) {
        list.getClass();
        this.a = c;
        this.b = list;
        this.c = arrayList;
        sh0[] sh0VarArr = new sh0[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i = 0; i < 256; i++) {
            Iterator it = this.c.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((sh0) next).a == i) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            sh0VarArr[i] = obj;
        }
    }
}

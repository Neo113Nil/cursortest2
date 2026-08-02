package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class tj3 implements l3f {
    public final ArrayList a;

    public tj3(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.l3f
    public final boolean test(Object obj) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((l3f) it.next()).test(obj)) {
                return false;
            }
        }
        return true;
    }
}

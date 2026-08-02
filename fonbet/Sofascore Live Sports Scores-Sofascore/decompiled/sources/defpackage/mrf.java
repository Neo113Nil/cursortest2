package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mrf {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    public final Set c = Collections.newSetFromMap(new IdentityHashMap());

    public final lrf a(int i) {
        SparseArray sparseArray = this.a;
        lrf lrfVar = (lrf) sparseArray.get(i);
        if (lrfVar != null) {
            return lrfVar;
        }
        lrf lrfVar2 = new lrf();
        sparseArray.put(i, lrfVar2);
        return lrfVar2;
    }
}

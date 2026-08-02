package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class m7f {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(i7f.a, 0);
        hashMap.put(i7f.b, 1);
        hashMap.put(i7f.c, 2);
        for (i7f i7fVar : hashMap.keySet()) {
            a.append(((Integer) b.get(i7fVar)).intValue(), i7fVar);
        }
    }

    public static int a(i7f i7fVar) {
        Integer num = (Integer) b.get(i7fVar);
        if (num != null) {
            return num.intValue();
        }
        yhk.r(i7fVar, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static i7f b(int i) {
        i7f i7fVar = (i7f) a.get(i);
        if (i7fVar != null) {
            return i7fVar;
        }
        a70.p(ljg.j(i, "Unknown Priority for value "));
        return null;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.CharsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class stk {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map p = tub.p(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = p.values().iterator();
        while (it.hasNext()) {
            ((ltk) it.next()).c();
        }
    }

    public final String toString() {
        String simpleName = duf.a.getOrCreateKotlinClass(stk.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "ViewModelStore";
        }
        String num = Integer.toString(hashCode(), CharsKt.checkRadix(16));
        num.getClass();
        return simpleName + "@" + num + "(keys=" + CollectionsKt.W0(this.a.keySet()) + ")";
    }
}

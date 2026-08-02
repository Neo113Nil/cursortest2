package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class zhi implements xhi {
    public final Map c;

    public zhi(Map map) {
        rl2 rl2Var = new rl2();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add((String) list.get(i));
            }
            rl2Var.put(str, arrayList);
        }
        this.c = rl2Var;
    }

    @Override // defpackage.xhi
    public final Set c() {
        Set entrySet = this.c.entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.xhi
    public final void d(Function2 function2) {
        for (Map.Entry entry : this.c.entrySet()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // defpackage.xhi
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhi)) {
            return false;
        }
        xhi xhiVar = (xhi) obj;
        if (true != xhiVar.e()) {
            return false;
        }
        return c().equals(xhiVar.c());
    }

    @Override // defpackage.xhi
    public final String get(String str) {
        List list = (List) this.c.get(str);
        if (list != null) {
            return (String) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public final int hashCode() {
        Set c = c();
        return c.hashCode() + (Boolean.hashCode(true) * 961);
    }

    @Override // defpackage.xhi
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }
}

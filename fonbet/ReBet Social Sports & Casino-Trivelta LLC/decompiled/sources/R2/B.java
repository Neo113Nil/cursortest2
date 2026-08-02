package R2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class B implements A {

    /* renamed from: b, reason: collision with root package name */
    public final Map f9927b = new LinkedHashMap();

    @Override // R2.A
    public boolean a(X2.h id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return this.f9927b.containsKey(id2);
    }

    @Override // R2.A
    public C1549z b(X2.h id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        return (C1549z) this.f9927b.remove(id2);
    }

    @Override // R2.A
    public C1549z e(X2.h id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Map map = this.f9927b;
        Object obj = map.get(id2);
        if (obj == null) {
            obj = new C1549z(id2);
            map.put(id2, obj);
        }
        return (C1549z) obj;
    }

    @Override // R2.A
    public List remove(String workSpecId) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Map map = this.f9927b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (Intrinsics.areEqual(((X2.h) entry.getKey()).b(), workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            this.f9927b.remove((X2.h) it.next());
        }
        return CollectionsKt.toList(linkedHashMap.values());
    }
}

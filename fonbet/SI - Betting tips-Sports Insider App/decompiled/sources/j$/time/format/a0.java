package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17374a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17375b;

    public a0(Map map) {
        this.f17374a = map;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l6 = (Long) entry2.getKey();
                ConcurrentHashMap concurrentHashMap = b0.f17377a;
                hashMap2.put(str, new AbstractMap.SimpleImmutableEntry(str2, l6));
            }
            ArrayList arrayList2 = new ArrayList(hashMap2.values());
            Collections.sort(arrayList2, b0.f17378b);
            hashMap.put((g0) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            hashMap.put(null, arrayList);
        }
        Collections.sort(arrayList, b0.f17378b);
        this.f17375b = hashMap;
    }

    public final String a(long j, g0 g0Var) {
        Map map = (Map) this.f17374a.get(g0Var);
        if (map != null) {
            return (String) map.get(Long.valueOf(j));
        }
        return null;
    }
}

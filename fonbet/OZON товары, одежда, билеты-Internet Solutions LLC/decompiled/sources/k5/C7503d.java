package k5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C7503d {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, Long> f70724a = new HashMap<>();

    protected final void a(String str) {
        HashMap<String, Long> hashMap = this.f70724a;
        hashMap.put(str, Long.valueOf(1 << hashMap.size()));
    }

    final Long b(List<String> list) {
        Long l11 = 0L;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                l11 = Long.valueOf(l11.longValue() | this.f70724a.get(it.next()).longValue());
            } catch (NullPointerException unused) {
            }
        }
        return l11;
    }

    final LinkedList c() {
        return new LinkedList(this.f70724a.keySet());
    }
}

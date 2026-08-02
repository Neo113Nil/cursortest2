package O8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class c extends b {

    /* renamed from: b, reason: collision with root package name */
    public final long f8360b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8361c = new HashMap();

    public c(long j10) {
        this.f8360b = j10;
    }

    public Object b(Object obj) {
        c();
        return a().get(obj);
    }

    public final void c() {
        HashMap hashMap = this.f8361c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (System.nanoTime() - ((Number) entry.getValue()).longValue() > TimeUnit.MILLISECONDS.toNanos(this.f8360b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            a().remove(entry2.getKey());
            this.f8361c.remove(entry2.getKey());
        }
    }

    public void d(Object obj, Object obj2) {
        c();
        this.f8361c.put(obj, Long.valueOf(System.nanoTime()));
        a().put(obj, obj2);
    }
}

package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17653a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17654b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f17655c;

    public i(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f17653a = obj;
        this.f17654b = obj2;
        this.f17655c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17653a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17654b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17653a.hashCode() ^ this.f17654b.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.V(this.f17653a, this.f17654b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f17653a;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f17654b;
        return value == obj3 || value.equals(obj3);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f17654b;
        this.f17654b = obj;
        this.f17655c.put(this.f17653a, obj);
        return obj2;
    }
}

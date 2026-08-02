package j$.util.concurrent;

import java.util.Map;

/* loaded from: classes2.dex */
public class j implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final int f17656a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f17657b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f17658c;

    /* renamed from: d, reason: collision with root package name */
    public volatile j f17659d;

    public j(int i5, Object obj, Object obj2) {
        this.f17656a = i5;
        this.f17657b = obj;
        this.f17658c = obj2;
    }

    public j(int i5, Object obj, Object obj2, j jVar) {
        this(i5, obj, obj2);
        this.f17659d = jVar;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f17657b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f17658c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f17657b.hashCode() ^ this.f17658c.hashCode();
    }

    public final String toString() {
        return j$.com.android.tools.r8.a.V(this.f17657b, this.f17658c);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        if (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (value = entry.getValue()) == null) {
            return false;
        }
        Object obj2 = this.f17657b;
        if (key != obj2 && !key.equals(obj2)) {
            return false;
        }
        Object obj3 = this.f17658c;
        return value == obj3 || value.equals(obj3);
    }

    public j a(int i5, Object obj) {
        Object obj2;
        j jVar = this;
        do {
            if (jVar.f17656a == i5 && ((obj2 = jVar.f17657b) == obj || (obj2 != null && obj.equals(obj2)))) {
                return jVar;
            }
            jVar = jVar.f17659d;
        } while (jVar != null);
        return null;
    }
}

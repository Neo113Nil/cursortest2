package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class b5 implements Map, eia {

    @NotNull
    public static final x4 c = new x4(null);
    public volatile z4 a;
    public volatile a5 b;

    public abstract Set a();

    public Set c() {
        if (this.a == null) {
            this.a = new z4(this);
        }
        z4 z4Var = this.a;
        z4Var.getClass();
        return z4Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return f(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set a = a();
        if (a.isEmpty()) {
            return false;
        }
        Iterator it = a.iterator();
        while (it.hasNext()) {
            if (Intrinsics.c(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public int d() {
        return a().size();
    }

    public Collection e() {
        if (this.b == null) {
            this.b = new a5(this, 0);
        }
        a5 a5Var = this.b;
        a5Var.getClass();
        return a5Var;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (d() != map.size()) {
            return false;
        }
        Set<Map.Entry> entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : entrySet) {
            if (entry == null) {
                return false;
            }
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object obj2 = get(key);
            if (!Intrinsics.c(value, obj2)) {
                return false;
            }
            if (obj2 == null && !containsKey(key)) {
                return false;
            }
        }
        return true;
    }

    public final Map.Entry f(Object obj) {
        Object obj2;
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (Intrinsics.c(((Map.Entry) obj2).getKey(), obj)) {
                break;
            }
        }
        return (Map.Entry) obj2;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Map.Entry f = f(obj);
        if (f != null) {
            return f.getValue();
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return a().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return d() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return c();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return d();
    }

    public final String toString() {
        return CollectionsKt.f0(a(), ", ", "{", "}", new u2(this, 2), 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return e();
    }
}

package com.google.android.gms.internal.play_billing;

import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f0 implements Map, Serializable, j$.util.Map {

    /* renamed from: a, reason: collision with root package name */
    public transient u0 f5443a;

    /* renamed from: b, reason: collision with root package name */
    public transient v0 f5444b;

    /* renamed from: c, reason: collision with root package name */
    public transient w0 f5445c;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        w0 w0Var = this.f5445c;
        if (w0Var == null) {
            x0 x0Var = (x0) this;
            w0 w0Var2 = new w0(1, x0Var.f5633f, x0Var.f5632e);
            this.f5445c = w0Var2;
            w0Var = w0Var2;
        }
        return w0Var.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        u0 u0Var = this.f5443a;
        if (u0Var != null) {
            return u0Var;
        }
        x0 x0Var = (x0) this;
        u0 u0Var2 = new u0(x0Var, x0Var.f5632e, x0Var.f5633f);
        this.f5443a = u0Var2;
        return u0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        u0 u0Var = this.f5443a;
        if (u0Var == null) {
            x0 x0Var = (x0) this;
            u0 u0Var2 = new u0(x0Var, x0Var.f5632e, x0Var.f5633f);
            this.f5443a = u0Var2;
            u0Var = u0Var2;
        }
        Iterator it = u0Var.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i5 += next != null ? next.hashCode() : 0;
        }
        return i5;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((x0) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        v0 v0Var = this.f5444b;
        if (v0Var != null) {
            return v0Var;
        }
        x0 x0Var = (x0) this;
        v0 v0Var2 = new v0(x0Var, new w0(0, x0Var.f5633f, x0Var.f5632e));
        this.f5444b = v0Var2;
        return v0Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int i5 = ((x0) this).f5633f;
        d3.i(i5, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(i5 * 8, 1073741824L));
        sb2.append('{');
        Iterator it = ((u0) entrySet()).iterator();
        boolean z5 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!z5) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
            z5 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        w0 w0Var = this.f5445c;
        if (w0Var != null) {
            return w0Var;
        }
        x0 x0Var = (x0) this;
        w0 w0Var2 = new w0(1, x0Var.f5633f, x0Var.f5632e);
        this.f5445c = w0Var2;
        return w0Var2;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}

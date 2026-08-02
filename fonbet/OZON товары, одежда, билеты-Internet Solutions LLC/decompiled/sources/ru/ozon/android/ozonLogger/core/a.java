package ru.ozon.android.ozonLogger.core;

import Ej.p;
import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.C7714v;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import ma.C8120a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class a implements Map<String, Object>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final TreeMap f92035a;

    public a(@NotNull Map<String, ? extends Object> fields) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        TreeMap treeMap = new TreeMap(fields);
        Iterator it = e0.g(xj.c.f105596a.getAllFields(), "isLocal").iterator();
        while (it.hasNext()) {
            treeMap.remove((String) it.next());
        }
        Set<String> keySet = fields.keySet();
        Set keySet2 = treeMap.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet2, "<get-keys>(...)");
        Set d11 = e0.d(keySet, keySet2);
        if (!d11.isEmpty()) {
            p.a(new IllegalArgumentException(), "Custom fields " + d11 + " clash with standard fields! Exclude them!");
        }
        this.f92035a = treeMap;
    }

    @NotNull
    public final void b(@NotNull JSONObject jsonObj) {
        Intrinsics.checkNotNullParameter(jsonObj, "jsonObj");
        for (Map.Entry entry : this.f92035a.entrySet()) {
            jsonObj.put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92035a.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f92035a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, Object>> entrySet() {
        return this.f92035a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.android.ozonLogger.core.CustomFields");
        return Intrinsics.d(this.f92035a, ((a) obj).f92035a);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f92035a.get(key);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f92035a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f92035a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f92035a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object putIfAbsent(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object replace(String str, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f92035a.size();
    }

    @NotNull
    public final String toString() {
        return C7714v.V(this.f92035a.entrySet(), null, "CustomFields[", "]", new C8120a(1), 25);
    }

    @Override // java.util.Map
    public final Collection<Object> values() {
        return this.f92035a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

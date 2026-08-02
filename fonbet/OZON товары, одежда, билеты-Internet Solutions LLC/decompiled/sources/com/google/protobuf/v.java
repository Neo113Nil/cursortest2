package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class v<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final v<?, ?> f60239b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f60240a = true;

    static {
        v<?, ?> vVar = new v<>();
        f60239b = vVar;
        ((v) vVar).f60240a = false;
    }

    private v() {
    }

    private static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Internal.a) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Internal.f60126b;
        int length = bArr.length;
        for (byte b11 : bArr) {
            length = (length * 31) + b11;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static <K, V> v<K, V> e() {
        return (v<K, V>) f60239b;
    }

    private void h() {
        if (!this.f60240a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z11;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return true;
                }
            }
            z11 = true;
            if (!z11) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i11 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i11;
    }

    public final boolean i() {
        return this.f60240a;
    }

    public final void j() {
        this.f60240a = false;
    }

    public final void l(v<K, V> vVar) {
        h();
        if (vVar.isEmpty()) {
            return;
        }
        putAll(vVar);
    }

    public final v<K, V> m() {
        if (isEmpty()) {
            return new v<>();
        }
        v<K, V> vVar = new v<>(this);
        vVar.f60240a = true;
        return vVar;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        h();
        byte[] bArr = Internal.f60126b;
        k11.getClass();
        v11.getClass();
        return (V) super.put(k11, v11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        h();
        for (K k11 : map.keySet()) {
            byte[] bArr = Internal.f60126b;
            k11.getClass();
            map.get(k11).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        h();
        return (V) super.remove(obj);
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C5919z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public final class L<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final L<?, ?> f59318b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f59319a = true;

    static {
        L<?, ?> l11 = new L<>();
        f59318b = l11;
        ((L) l11).f59319a = false;
    }

    private L() {
    }

    private static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof C5919z.a) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C5919z.f59481b;
        int length = bArr.length;
        for (byte b11 : bArr) {
            length = (length * 31) + b11;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static <K, V> L<K, V> e() {
        return (L<K, V>) f59318b;
    }

    private void h() {
        if (!this.f59319a) {
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
        return this.f59319a;
    }

    public final void j() {
        this.f59319a = false;
    }

    public final void l(L<K, V> l11) {
        h();
        if (l11.isEmpty()) {
            return;
        }
        putAll(l11);
    }

    public final L<K, V> m() {
        if (isEmpty()) {
            return new L<>();
        }
        L<K, V> l11 = new L<>(this);
        l11.f59319a = true;
        return l11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        h();
        byte[] bArr = C5919z.f59481b;
        k11.getClass();
        v11.getClass();
        return (V) super.put(k11, v11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        h();
        for (K k11 : map.keySet()) {
            byte[] bArr = C5919z.f59481b;
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

package com.google.common.collect;

import java.util.Map;

/* renamed from: com.google.common.collect.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC5862f<K, V> implements Map.Entry<K, V> {
    AbstractC5862f() {
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (O7.h.b(getKey(), entry.getKey()) && O7.h.b(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K key = getKey();
        V value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

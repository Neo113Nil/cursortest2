package com.google.common.collect;

import java.io.Serializable;

/* renamed from: com.google.common.collect.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C5879x<K, V> extends AbstractC5862f<K, V> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final K f59139a;

    /* renamed from: b, reason: collision with root package name */
    final V f59140b;

    C5879x(K k11, V v11) {
        this.f59139a = k11;
        this.f59140b = v11;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f59139a;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f59140b;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v11) {
        throw new UnsupportedOperationException();
    }
}

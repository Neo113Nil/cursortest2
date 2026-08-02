package com.google.common.collect;

import com.google.common.collect.M;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
final class L extends M.c<Object> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator f59025a;

    L(Comparator comparator) {
        this.f59025a = comparator;
    }

    @Override // com.google.common.collect.M.c
    final <K, V> Map<K, Collection<V>> b() {
        return new TreeMap(this.f59025a);
    }
}

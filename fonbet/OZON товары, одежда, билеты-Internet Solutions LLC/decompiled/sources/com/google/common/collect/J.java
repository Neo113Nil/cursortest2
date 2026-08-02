package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public interface J<K, V> {
    Map<K, Collection<V>> b();

    void clear();

    boolean put(K k11, V v11);

    int size();

    Collection<V> values();
}

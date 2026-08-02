package com.vk.core.util;

import java.util.HashMap;
import xsna.ci3;
import xsna.izs;

/* compiled from: DefaultHashMap.kt */
/* loaded from: classes17.dex */
public final class DefaultHashMap<K, V> extends HashMap<K, V> {
    private final izs<K, V> defaultValueProducer;

    public DefaultHashMap(ci3 ci3Var) {
        this.defaultValueProducer = ci3Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        V v = (V) super.get(obj);
        V invoke = this.defaultValueProducer.invoke(obj);
        if (v == null) {
            put(obj, invoke);
        }
        return v == null ? invoke : v;
    }
}

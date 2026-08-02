package com.facebook.common.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public class ImmutableMap<K, V> extends HashMap<K, V> {
    public ImmutableMap() {
        throw null;
    }

    public static Map a(String str, String str2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return Collections.unmodifiableMap(hashMap);
    }
}

package io.ably.lib.util;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        HashMap hashMap = new HashMap(map.size());
        hashMap.putAll(map);
        return hashMap;
    }
}

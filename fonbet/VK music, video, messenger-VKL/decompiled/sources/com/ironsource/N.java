package com.ironsource;

import java.util.HashMap;

/* loaded from: classes13.dex */
public final class N {
    public static final N a = new N();
    private static final HashMap<String, Long> b = new HashMap<>();

    private N() {
    }

    public final HashMap<String, Long> a() {
        return b;
    }

    public final long b(String str) {
        Long l = b.get(str);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(String str) {
        Long l = b.get(str);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    public final boolean a(String str, long j) {
        if (str.length() == 0) {
            return false;
        }
        HashMap<String, Long> hashMap = b;
        if (hashMap.containsKey(str)) {
            return false;
        }
        hashMap.put(str, Long.valueOf(j));
        return true;
    }

    public final boolean a(String str) {
        HashMap<String, Long> hashMap = b;
        if (hashMap.get(str) == null) {
            return false;
        }
        hashMap.remove(str);
        return true;
    }
}

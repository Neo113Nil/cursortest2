package com.ironsource;

import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class N {

    @NotNull
    public static final N a = new N();

    @NotNull
    private static final HashMap<String, Long> b = new HashMap<>();

    private N() {
    }

    public final boolean a(@NotNull String str, long j) {
        str.getClass();
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

    public final long b(@NotNull String str) {
        str.getClass();
        Long l = b.get(str);
        if (l != null) {
            return System.currentTimeMillis() - l.longValue();
        }
        return -1L;
    }

    public final long c(@NotNull String str) {
        str.getClass();
        Long l = b.get(str);
        if (l != null) {
            return l.longValue();
        }
        return -1L;
    }

    @NotNull
    public final HashMap<String, Long> a() {
        return b;
    }

    public final boolean a(@NotNull String str) {
        str.getClass();
        HashMap<String, Long> hashMap = b;
        if (hashMap.get(str) == null) {
            return false;
        }
        hashMap.remove(str);
        return true;
    }
}

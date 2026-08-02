package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public final class Zc implements J7 {
    private final B3 a;
    private ConcurrentHashMap<String, Long> b = new ConcurrentHashMap<>();

    public Zc(B3 b3) {
        this.a = b3;
    }

    @Override // com.ironsource.J7
    public Long a(String str) {
        Long l = this.b.get(str);
        if (l != null) {
            return l;
        }
        Long b = this.a.b(str);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(str, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.J7
    public void a(long j, String str) {
        this.b.put(str, Long.valueOf(j));
        this.a.a(str, j);
    }
}

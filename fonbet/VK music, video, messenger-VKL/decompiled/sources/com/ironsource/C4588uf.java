package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4588uf implements Q8 {
    private final B3 a;
    private ConcurrentHashMap<String, Integer> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Long> c = new ConcurrentHashMap<>();

    public C4588uf(B3 b3) {
        this.a = b3;
    }

    @Override // com.ironsource.Q8
    public void a(int i, String str) {
        this.b.put(str, Integer.valueOf(i));
        this.a.a(str, i);
    }

    @Override // com.ironsource.Q8
    public Long b(String str) {
        Long l = this.c.get(str);
        if (l != null) {
            return l;
        }
        Long a = this.a.a(str);
        if (a == null) {
            return null;
        }
        long longValue = a.longValue();
        this.c.put(str, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.Q8
    public int a(String str) {
        Integer num = this.b.get(str);
        if (num != null) {
            return num.intValue();
        }
        Integer c = this.a.c(str);
        if (c != null) {
            int intValue = c.intValue();
            this.b.put(str, Integer.valueOf(intValue));
            return intValue;
        }
        this.b.put(str, 0);
        return 0;
    }

    @Override // com.ironsource.Q8
    public void a(long j, String str) {
        this.c.put(str, Long.valueOf(j));
        this.a.b(str, j);
    }
}

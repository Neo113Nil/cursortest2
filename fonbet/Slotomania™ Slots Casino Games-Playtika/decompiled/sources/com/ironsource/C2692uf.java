package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2692uf implements P8 {
    private final B3 a;
    private ConcurrentHashMap<String, Integer> b;
    private ConcurrentHashMap<String, Long> c;

    public C2692uf(B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.P8
    public void a(int i, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Integer.valueOf(i));
        this.a.a(identifier, i);
    }

    @Override // com.ironsource.P8
    public Long b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.c.get(identifier);
        if (l != null) {
            return l;
        }
        Long a = this.a.a(identifier);
        if (a == null) {
            return null;
        }
        long longValue = a.longValue();
        this.c.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.P8
    public int a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Integer num = this.b.get(identifier);
        if (num != null) {
            return num.intValue();
        }
        Integer c = this.a.c(identifier);
        if (c != null) {
            int intValue = c.intValue();
            this.b.put(identifier, Integer.valueOf(intValue));
            return intValue;
        }
        this.b.put(identifier, 0);
        return 0;
    }

    @Override // com.ironsource.P8
    public void a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.c.put(identifier, Long.valueOf(j));
        this.a.b(identifier, j);
    }
}

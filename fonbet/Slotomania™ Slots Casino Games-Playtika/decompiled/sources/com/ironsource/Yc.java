package com.ironsource;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class Yc implements I7 {
    private final B3 a;
    private ConcurrentHashMap<String, Long> b;

    public Yc(B3 storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.a = storage;
        this.b = new ConcurrentHashMap<>();
    }

    @Override // com.ironsource.I7
    public Long a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Long l = this.b.get(identifier);
        if (l != null) {
            return l;
        }
        Long b = this.a.b(identifier);
        if (b == null) {
            return null;
        }
        long longValue = b.longValue();
        this.b.put(identifier, Long.valueOf(longValue));
        return Long.valueOf(longValue);
    }

    @Override // com.ironsource.I7
    public void a(long j, String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.b.put(identifier, Long.valueOf(j));
        this.a.a(identifier, j);
    }
}

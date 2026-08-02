package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.ironsource.n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4447n extends E5 {
    private final IronSource.a a;
    private final UUID b;
    private final String c;

    public C4447n(IronSource.a aVar, UUID uuid, String str) {
        this.a = aVar;
        this.b = uuid;
        this.c = str;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        return a(new C4341h0(this.a, this.b, this.c, null, null, null, 56, null));
    }
}

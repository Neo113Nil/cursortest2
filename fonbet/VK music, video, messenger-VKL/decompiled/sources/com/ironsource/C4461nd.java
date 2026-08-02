package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4461nd implements E0 {
    private final String a;

    public C4461nd(String str) {
        this.a = str;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.a);
        return hashMap;
    }
}

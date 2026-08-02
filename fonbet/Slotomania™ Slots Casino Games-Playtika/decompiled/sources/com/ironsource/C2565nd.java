package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.nd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2565nd implements E0 {
    private final String a;

    public C2565nd(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.a = placementName;
    }

    @Override // com.ironsource.E0
    public Map<String, Object> a(C0 c0) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.a);
        return hashMap;
    }
}

package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.r8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4527r8 {
    private HashMap<String, Object> a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.a;
    }

    public C4527r8 a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}

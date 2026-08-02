package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* renamed from: com.ironsource.q8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2614q8 {
    private HashMap<String, Object> a = new HashMap<>();

    public HashMap<String, Object> a() {
        return this.a;
    }

    public C2614q8 a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }
}

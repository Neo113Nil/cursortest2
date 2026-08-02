package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.o8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4233o8 {
    private HashMap<String, Object> a = new HashMap<>();

    public C4233o8 a(String str, Object obj) {
        if (obj != null) {
            this.a.put(str, SDKUtils.encodeString(obj.toString()));
        }
        return this;
    }

    public HashMap<String, Object> a() {
        return this.a;
    }
}

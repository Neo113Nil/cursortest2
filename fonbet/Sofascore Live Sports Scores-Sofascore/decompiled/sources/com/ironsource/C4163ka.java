package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.ka, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4163ka {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4157k4.d().a(e);
            }
        }
        return hashMap;
    }
}

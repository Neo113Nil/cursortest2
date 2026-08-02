package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4422la {
    public static Map<String, Object> a(Object[][] objArr) {
        HashMap hashMap = new HashMap();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    hashMap.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4452n4.d().a(e);
            }
        }
        return hashMap;
    }
}

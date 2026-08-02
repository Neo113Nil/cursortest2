package com.inmobi.media;

import java.util.Calendar;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class H8 {
    public static HashMap a() {
        String str;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", AbstractC3450gj.a());
            C3872x1 c3872x1 = Yk.a;
            Boolean bool = c3872x1 != null ? c3872x1.c : null;
            if (bool != null) {
                hashMap.put("u-id-adt", bool.booleanValue() ? "1" : "0");
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C3605mj.a.getClass();
            HashMap hashMap2 = new HashMap();
            if (C3605mj.e && (str = C3605mj.d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
            return hashMap;
        } catch (Exception e) {
            e.getMessage();
            return hashMap;
        }
    }
}

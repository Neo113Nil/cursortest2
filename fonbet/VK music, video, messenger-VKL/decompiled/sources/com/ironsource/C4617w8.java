package com.ironsource;

import com.ironsource.C4355he;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.w8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4617w8 {
    private static C4617w8 b;
    private J5 a;

    private C4617w8() {
    }

    private static C4617w8 a() {
        if (b == null) {
            b = new C4617w8();
        }
        return b;
    }

    public static void a(D5 d5, C4581u8 c4581u8) {
        if (d5 != null) {
            try {
                a().a = new J5(d5, c4581u8);
            } catch (Exception e) {
                C4452n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(C4355he.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4355he.a aVar, Map<String, Object> map) {
        J5 j5 = a().a;
        if (j5 == null) {
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        j5.a(aVar.a, map);
    }
}

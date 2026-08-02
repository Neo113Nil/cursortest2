package com.ironsource;

import com.ironsource.C4096ge;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t8, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4322t8 {
    private static C4322t8 b;
    private H5 a;

    private C4322t8() {
    }

    public static void a(B5 b5, C4286r8 c4286r8) {
        if (b5 != null) {
            try {
                a().a = new H5(b5, c4286r8);
            } catch (Exception e) {
                C4157k4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    private static C4322t8 a() {
        C4322t8 c4322t8 = b;
        if (c4322t8 != null) {
            return c4322t8;
        }
        C4322t8 c4322t82 = new C4322t8();
        b = c4322t82;
        return c4322t82;
    }

    public static void a(C4096ge.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C4096ge.a aVar, Map<String, Object> map) {
        H5 h5 = a().a;
        if (h5 == null) {
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        h5.a(aVar.a, map);
    }
}

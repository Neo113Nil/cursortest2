package com.ironsource;

import android.util.Log;
import com.ironsource.C2459he;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2703v8 {
    private static C2703v8 b;
    private J5 a;

    private C2703v8() {
    }

    private static C2703v8 a() {
        if (b == null) {
            b = new C2703v8();
        }
        return b;
    }

    public static void a(D5 d5, C2667t8 c2667t8) {
        if (d5 != null) {
            try {
                a().a = new J5(d5, c2667t8);
            } catch (Exception e) {
                C2556n4.d().a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
    }

    public static void a(C2459he.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C2459he.a aVar, Map<String, Object> map) {
        J5 j5 = a().a;
        if (j5 == null) {
            Log.d(B5.a, B5.V);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.b));
        }
        j5.a(aVar.a, map);
    }
}

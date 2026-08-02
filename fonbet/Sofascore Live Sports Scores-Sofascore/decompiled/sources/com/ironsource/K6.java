package com.ironsource;

import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class K6 {
    public static String a(String str) {
        try {
            return new String(Base64.decode(str, 0), com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
        } catch (Exception e) {
            C4157k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    public static String b(String str) {
        return Base64.encodeToString(str.getBytes(), 10);
    }
}

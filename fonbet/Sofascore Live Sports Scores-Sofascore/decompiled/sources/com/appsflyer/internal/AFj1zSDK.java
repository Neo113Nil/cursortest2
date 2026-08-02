package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.ironsource.C4427z5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFj1zSDK {
    public static Map<String, String> AFKeystoreWrapper(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), C4427z5.O), URLEncoder.encode(entry.getValue(), C4427z5.O));
            } catch (UnsupportedEncodingException e) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Failed to encode map to UTF-8", e, false, false);
            }
        }
        return hashMap;
    }
}

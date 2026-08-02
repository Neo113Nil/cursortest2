package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class AFj1jSDK {
    public static Map<String, String> AFAdRevenueData(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                hashMap.put(URLEncoder.encode(entry.getKey(), B5.O), URLEncoder.encode(entry.getValue(), B5.O));
            } catch (UnsupportedEncodingException e) {
                AFLogger.afErrorLogForExcManagerOnly("failed to encode map", e);
            }
        }
        return hashMap;
    }
}

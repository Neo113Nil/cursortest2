package com.google.android.gms.common.util;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.wt3;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class MapUtils {
    public static void a(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
            }
            String str2 = (String) hashMap.get(str);
            wt3.A("\"", str, sb, "\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                wt3.A("\"", str2, sb, "\"");
            }
            z = false;
        }
        sb.append("}");
    }
}

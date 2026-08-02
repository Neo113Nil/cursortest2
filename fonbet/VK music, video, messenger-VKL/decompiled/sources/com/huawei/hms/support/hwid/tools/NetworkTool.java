package com.huawei.hms.support.hwid.tools;

import android.text.TextUtils;
import com.unity3d.services.core.network.model.HttpRequest;
import xsna.r11;
import xsna.tdj;

/* loaded from: classes13.dex */
public final class NetworkTool {
    private static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static String buildNetworkCookie(String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, Long l) {
        StringBuilder c = r11.c(str, "=");
        if (!TextUtils.isEmpty(str2)) {
            c.append(str2);
        }
        if (a(bool)) {
            c.append(";HttpOnly");
        }
        if (a(bool2)) {
            c.append(";Secure");
        }
        if (!TextUtils.isEmpty(str3)) {
            c.append(";Domain=");
            c.append(str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            c.append(";Path=");
            c.append(str4);
        }
        if (l != null && l.longValue() > 0) {
            c.append(";Max-Age=");
            c.append(l);
        }
        return c.toString();
    }

    public static String buildNetworkUrl(String str, Boolean bool) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        String str2 = a(bool) ? HttpRequest.DEFAULT_SCHEME : "http";
        return tdj.a(new StringBuilder(String.valueOf(str).length() + str2.length() + 3), str2, "://", str);
    }
}

package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        Object[] array = parse.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + parse.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        String queryParameter = parse.getQueryParameter(String.valueOf(array[0]));
        String queryParameter2 = array.length > 1 ? parse.getQueryParameter(String.valueOf(array[1])) : "";
        StringBuilder sb = new StringBuilder("javascript:window.WindVane.");
        sb.append(parse.getHost());
        sb.append("(");
        sb.append(queryParameter);
        sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        return mz1.o(sb, queryParameter2, ");");
    }
}

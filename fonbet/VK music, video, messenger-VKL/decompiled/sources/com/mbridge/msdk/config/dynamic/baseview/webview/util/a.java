package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.i5s;

/* compiled from: MBHybridUtil.java */
/* loaded from: classes13.dex */
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
        sb.append(StringUtils.COMMA);
        return i5s.a(sb, queryParameter2, ");");
    }
}

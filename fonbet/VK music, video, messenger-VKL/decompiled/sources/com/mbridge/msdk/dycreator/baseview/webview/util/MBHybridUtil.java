package com.mbridge.msdk.dycreator.baseview.webview.util;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class MBHybridUtil {
    public static String convert2Unicode(String str) {
        char[] cArr = {'\'', '\\'};
        StringBuilder sb = new StringBuilder(1000);
        sb.setLength(0);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 255) {
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        sb.append(charAt);
                        break;
                    }
                    if (cArr[i2] == charAt) {
                        sb.append("\\" + charAt);
                        break;
                    }
                    i2++;
                }
            } else {
                sb.append("\\u");
                String upperCase = Integer.toHexString(charAt >>> '\b').toUpperCase();
                if (upperCase.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase);
                String upperCase2 = Integer.toHexString(charAt & 255).toUpperCase();
                if (upperCase2.length() == 1) {
                    sb.append("0");
                }
                sb.append(upperCase2);
            }
        }
        return new String(sb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        if (r4.equals("jpg") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getImageMimeType(String str) {
        int lastIndexOf;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String path = Uri.parse(str).getPath();
        char c = 1;
        String substring = (path == null || (lastIndexOf = path.lastIndexOf(".")) == -1) ? "" : path.substring(lastIndexOf + 1);
        substring.getClass();
        switch (substring.hashCode()) {
            case 102340:
                if (substring.equals("gif")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 105441:
                break;
            case 111145:
                if (substring.equals("png")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3268712:
                if (substring.equals("jpeg")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3645340:
                if (substring.equals("webp")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
        }
        return "";
    }

    public static Set<String> getQueryParameterNames(Uri uri) {
        if (uri == null) {
            return null;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        com.mbridge.msdk.foundation.tools.q0.b("MBHybridUtil", r7.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getQueryParameters(Uri uri) {
        String encodedQuery;
        if (uri == null || (encodedQuery = uri.getEncodedQuery()) == null) {
            return null;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        JSONObject jSONObject = new JSONObject();
        for (String str : linkedHashSet) {
            jSONObject.put(str, uri.getQueryParameter(str));
        }
        return jSONObject.toString();
    }
}

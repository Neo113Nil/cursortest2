package com.zendesk.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static Map f42387a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f42388b;

    static {
        HashMap hashMap = new HashMap();
        f42387a = hashMap;
        hashMap.put('\'', "\\'");
        f42387a.put(Character.valueOf(Typography.quote), "\\\"");
        f42387a.put('\\', "\\\\");
        f42387a.put('/', "\\/");
        f42387a.put('\b', "\\b");
        f42387a.put('\n', "\\n");
        f42387a.put('\t', "\\t");
        f42387a.put('\f', "\\f");
        f42387a.put('\r', "\\r");
        f42388b = System.getProperty("line.separator");
    }

    public static boolean a(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static boolean b(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        for (String str : strArr) {
            if (c(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean c(String str) {
        return !a(str);
    }

    public static boolean d(String str) {
        if (c(str)) {
            return false;
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static String e(List list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (a((String) list.get(i10))) {
                sb2.append((String) list.get(i10));
                if (i10 < list.size() - 1) {
                    sb2.append(",");
                }
            }
        }
        return sb2.toString();
    }
}

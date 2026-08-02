package com.mbridge.msdk.config.component.common.express;

import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.tools.q0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String... strArr) {
        Object obj;
        if (strArr.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            String[] split = str.replace("$", "").split("\\.");
            if (split.length != 0) {
                if (aVar.a((Object) split[0])) {
                    obj = aVar;
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put(split[0], aVar);
                    obj = hashMap;
                }
                int length = split.length;
                int i = 0;
                Object obj2 = obj;
                while (i < length) {
                    String str2 = split[i];
                    i++;
                    obj2 = obj2 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a ? a((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj2, str2) : a(obj2, str2);
                }
                if (strArr.length == 1) {
                    return obj2;
                }
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static Object a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("$") && !str.startsWith(U3.j.d)) {
            return str;
        }
        if (str.startsWith(U3.j.d)) {
            String replaceAll = str.replaceAll("[\\[\\]]", "");
            if (replaceAll.split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR).length == 0) {
                return null;
            }
            return a(aVar, replaceAll);
        }
        if (str.startsWith("$")) {
            return a(aVar, str);
        }
        return null;
    }

    private static Object a(com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        try {
            if (aVar.a((Object) str)) {
                return aVar.b((Object) str);
            }
            return null;
        } catch (Exception e) {
            q0.b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }

    private static Object a(Object obj, String str) {
        try {
            if (obj instanceof Map) {
                return ((Map) obj).get(str);
            }
            if (obj == null) {
                return null;
            }
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Exception e) {
            q0.b("ExpressionExecutor", e.getMessage(), e);
            return null;
        }
    }
}

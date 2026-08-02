package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static Map<String, String> pcc(Map<String, List<String>> map, String str) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if (key != null && value != null && !value.isEmpty()) {
                    if (key.equalsIgnoreCase("set-cookie")) {
                        arrayList.addAll(value);
                    } else {
                        hashMap.put(key, pcc(value));
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                pcc(arrayList, str);
            }
        }
        return hashMap;
    }

    private static String pcc(List<String> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                return list.get(0);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(list.get(i));
            }
            return sb.toString();
        }
        return "";
    }

    private static void pcc(List<String> list, String str) {
        CookieManager cookieManager = CookieManager.getInstance();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            try {
                cookieManager.setCookie("https://".concat(String.valueOf(str)), it.next());
                cookieManager.flush();
            } catch (Exception unused) {
            }
        }
    }
}

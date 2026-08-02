package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.touch.a;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class f {
    public static void a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> a;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        com.mbridge.msdk.config.dynamic.baseview.touch.a touchEventData = xMLView.getTouchEventData();
        HashMap hashMap = new HashMap();
        if (touchEventData != null && (a = touchEventData.a()) != null) {
            a.C1238a b = touchEventData.b();
            if (b != null) {
                a.put("click_x", String.valueOf(b.b));
                a.put("click_y", String.valueOf(b.c));
            }
            a.put("click_time", String.valueOf(System.currentTimeMillis()));
            hashMap.putAll(a);
        }
        if (map != null) {
            hashMap.putAll(map);
        }
        xMLView.getXmlViewActionListener().a(String.valueOf(obj), hashMap);
    }
}

package com.bytedance.adsdk.pcc;

import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb implements ork {
    @Override // com.bytedance.adsdk.pcc.ork
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public Number pcc(JSONObject jSONObject, Object[] objArr) {
        Object obj;
        if (objArr == null || objArr.length == 0 || (obj = objArr[0]) == null) {
            return null;
        }
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (!(obj instanceof String)) {
            return null;
        }
        try {
            String trim = ((String) obj).trim();
            if (!trim.equalsIgnoreCase("true") && !trim.equalsIgnoreCase("false")) {
                return trim.contains(".") ? Double.valueOf(Double.parseDouble(trim)) : Long.valueOf(Long.parseLong(trim));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}

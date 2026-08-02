package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class xig extends ijg {
    public final String a;
    public final int b;
    public final String c;
    public final Map d;
    public final JSONObject e;

    public xig(String str, int i, String str2, int i2, int i3, String str3, Map map) {
        str.getClass();
        this.a = str;
        this.b = i3;
        this.c = str3;
        this.d = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("siteId", 415167);
        linkedHashMap.put("formatId", Integer.valueOf(i));
        if (str2 != null) {
            linkedHashMap.put("target", str2);
        }
        linkedHashMap.put("templateFormatType", Integer.valueOf(i2));
        try {
            linkedHashMap.put("pageId", Integer.valueOf(Integer.parseInt(str)));
        } catch (NumberFormatException unused) {
            linkedHashMap.put("pageName", this.a);
        }
        linkedHashMap.put("networkId", Integer.valueOf(this.b));
        linkedHashMap.put("insertionId", this.c);
        linkedHashMap.put("channelType", 1);
        try {
            Map map2 = this.d;
            if (map2 != null) {
                Object obj = map2.get("insertionId");
                String str4 = obj instanceof String ? (String) obj : null;
                if (str4 != null && this.c.equals("0")) {
                    linkedHashMap.put("insertionId", str4);
                }
                Object obj2 = map2.get("templateId");
                String str5 = obj2 instanceof String ? (String) obj2 : null;
                if (str5 != null) {
                    linkedHashMap.put("templateId", str5);
                }
                Object obj3 = map2.get("rtb");
                Map map3 = obj3 instanceof Map ? (Map) obj3 : null;
                if (map3 != null) {
                    linkedHashMap.put("rtb", new JSONObject(map3));
                    linkedHashMap.put("channelType", 2);
                }
            }
            JSONObject f0 = hkg.f0(linkedHashMap);
            if (f0.length() > 0) {
                this.e = f0;
            }
        } catch (JSONException unused2) {
            fjg.c().f(1);
        }
    }

    @Override // defpackage.ijg
    public final JSONObject a() {
        return this.e;
    }

    @Override // defpackage.ijg
    public final String b() {
        return "smart";
    }
}

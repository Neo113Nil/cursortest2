package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class br4 {
    public static JSONObject a(h6c h6cVar) {
        v5c v5cVar = h6cVar.b;
        v5cVar.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mediaId", h6cVar.a);
        jSONObject.put("title", h6cVar.d.a);
        jSONObject.put("uri", v5cVar.a.toString());
        jSONObject.put("mimeType", v5cVar.b);
        q5c q5cVar = v5cVar.c;
        if (q5cVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uuid", q5cVar.a);
            jSONObject2.put("licenseUri", q5cVar.b);
            jSONObject2.put("requestHeaders", new JSONObject(q5cVar.c));
            jSONObject.put("drmConfiguration", jSONObject2);
        }
        return jSONObject;
    }

    public static JSONObject b(h6c h6cVar) {
        q5c q5cVar;
        String str;
        v5c v5cVar = h6cVar.b;
        if (v5cVar == null || (q5cVar = v5cVar.c) == null) {
            return null;
        }
        UUID uuid = q5cVar.a;
        UUID uuid2 = yc2.d;
        lv9 lv9Var = q5cVar.c;
        if (uuid2.equals(uuid)) {
            str = "widevine";
        } else {
            if (!yc2.e.equals(uuid)) {
                return null;
            }
            str = "playready";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("withCredentials", false);
        jSONObject.put("protectionSystem", str);
        Uri uri = q5cVar.b;
        if (uri != null) {
            jSONObject.put("licenseUrl", uri);
        }
        if (!lv9Var.isEmpty()) {
            jSONObject.put("headers", new JSONObject(lv9Var));
        }
        return jSONObject;
    }

    public static void c(JSONObject jSONObject, h5c h5cVar) {
        UUID fromString = UUID.fromString(jSONObject.getString("uuid"));
        p5c p5cVar = new p5c(0);
        p5cVar.b = fromString;
        String string = jSONObject.getString("licenseUri");
        p5cVar.c = string == null ? null : Uri.parse(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("requestHeaders");
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        p5cVar.d = lv9.f(hashMap);
        h5cVar.e = new q5c(p5cVar).a();
    }
}

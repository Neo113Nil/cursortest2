package com.inmobi.media;

import android.content.ContentValues;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Gg {
    public static final C3473hg a(ContentValues contentValues) {
        Bi bi;
        String str;
        String str2;
        contentValues.getClass();
        String asString = contentValues.getAsString("id");
        String asString2 = contentValues.getAsString("url");
        JSONObject jSONObject = new JSONObject(contentValues.getAsString("headers"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        while (true) {
            String str3 = "";
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            String string = jSONObject.getString(next);
            if (string != null) {
                str3 = string;
            }
            linkedHashMap.put(next, str3);
        }
        boolean parseBoolean = Boolean.parseBoolean(contentValues.getAsString("allow_redirects"));
        String asString3 = contentValues.getAsString(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
        boolean parseBoolean2 = Boolean.parseBoolean(contentValues.getAsString("ack_required"));
        Integer asInteger = contentValues.getAsInteger("retry_count");
        int intValue = asInteger != null ? asInteger.intValue() : 0;
        String asString4 = contentValues.getAsString("owner");
        if (asString4 == null) {
            asString4 = "unknown";
        }
        String str4 = asString4;
        Long asLong = contentValues.getAsLong("retryAfter");
        Long asLong2 = contentValues.getAsLong("time_created");
        asString2.getClass();
        asString.getClass();
        asString3.getClass();
        asLong2.getClass();
        long longValue = asLong2.longValue();
        String asString5 = contentValues.getAsString("telemetry_metadata");
        if (asString5 != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(asString5);
                String string2 = jSONObject2.getString("adType");
                string2.getClass();
                C3793u0 c3793u0 = new C3793u0(string2);
                str = asString2;
                str2 = asString;
                try {
                    c3793u0.b = jSONObject2.getLong("plId");
                    C3845w0 a = c3793u0.a();
                    String string3 = jSONObject2.getString("markupType");
                    string3.getClass();
                    String string4 = jSONObject2.getString("impressionId");
                    string4.getClass();
                    String optString = jSONObject2.optString("metadataBlob", "");
                    optString.getClass();
                    String string5 = jSONObject2.getString("creativeType");
                    string5.getClass();
                    String string6 = jSONObject2.getString("creativeId");
                    string6.getClass();
                    bi = new Bi(a, string3, string4, optString, 0, string5, string6, jSONObject2.getBoolean("isRewarded"), jSONObject2.getInt("adPosition"), null, null, null, null);
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
            }
            return new C3473hg(str, str2, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str4, longValue, asLong, bi);
        }
        str = asString2;
        str2 = asString;
        bi = null;
        return new C3473hg(str, str2, linkedHashMap, parseBoolean, asString3, parseBoolean2, intValue, str4, longValue, asLong, bi);
    }

    public static final ContentValues a(C3473hg c3473hg) {
        c3473hg.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c3473hg.b);
        contentValues.put("url", c3473hg.a);
        Map map = c3473hg.c;
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), (String) entry.getValue());
        }
        contentValues.put("headers", jSONObject.toString());
        contentValues.put("allow_redirects", String.valueOf(c3473hg.d));
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, c3473hg.e);
        contentValues.put("ack_required", String.valueOf(c3473hg.f));
        contentValues.put("time_created", Long.valueOf(c3473hg.i));
        contentValues.put("retry_count", Integer.valueOf(c3473hg.g));
        contentValues.put("owner", c3473hg.h);
        Long l = c3473hg.j;
        contentValues.put("retryAfter", Long.valueOf(l != null ? l.longValue() : 0L));
        Bi bi = c3473hg.k;
        if (bi != null) {
            String jSONObject2 = new JSONObject().put("plType", bi.a.f).put("plId", bi.a.a).put("adType", bi.a.e).put("markupType", bi.b).put("networkType", F5.g()).put("creativeType", bi.f).put("creativeId", bi.g).put("isRewarded", bi.h).put("adPosition", bi.i).put("metadataBlob", bi.d).put("impressionId", bi.c).toString();
            jSONObject2.getClass();
            contentValues.put("telemetry_metadata", jSONObject2);
        }
        return contentValues;
    }
}

package com.mbridge.msdk.videocommon.entity;

import android.text.TextUtils;
import defpackage.wv8;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private String a;
    private int b;

    public c(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static Map<String, c> a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                hashMap.put(optJSONObject.optString("id"), new c(optJSONObject.optString("name"), optJSONObject.optInt("amount")));
            }
            return hashMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static c b() {
        return new c("Virtual Item", 1);
    }

    public String c() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Reward{name='");
        sb.append(this.a);
        sb.append("', amount=");
        return wv8.j(sb, this.b, '}');
    }

    public void b(String str) {
        this.a = str;
    }

    public void a(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:3:0x0001, B:5:0x000f, B:8:0x002c, B:14:0x0019, B:16:0x001f), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c a(String str) {
        c cVar;
        c cVar2 = null;
        try {
            com.mbridge.msdk.videocommon.setting.a c = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (TextUtils.isEmpty(str)) {
                cVar = b();
            } else {
                if (c != null && c.g() != null) {
                    cVar = c.g().get(str);
                }
                return cVar2 != null ? b() : cVar2;
            }
            cVar2 = cVar;
            if (cVar2 != null) {
            }
        } catch (Exception e) {
            e.printStackTrace();
            return cVar2;
        }
    }

    public int a() {
        return this.b;
    }

    public static c a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            String optString = jSONObject.optString("name");
            int optInt = jSONObject.optInt("amount");
            jSONObject.optString("id");
            return new c(optString, optInt);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

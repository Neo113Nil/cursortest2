package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﾍ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1183 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final HashMap f3752;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final HashMap f3753;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final ArrayList f3754;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final ArrayList f3755;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f3756;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3757;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f3758;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f3759;

    static {
        StringFog.decrypt("CbeX+zCOy5cGsYrpPIc=\n", "Rd7kj1XgruU=\n");
        StringFog.decrypt("GLDuFvk=\n", "a8Wec4sDfhw=\n");
        StringFog.decrypt("hkqS6VcR1k0=\n", "5yjhnSVwtTk=\n");
        StringFog.decrypt("xxdy7ZORzw==\n", "qnIfj/bjvOI=\n");
        StringFog.decrypt("3RB3H7w=\n", "rnUDasz2AIw=\n");
        StringFog.decrypt("IYGF+/1S\n", "RPfglYkhoxE=\n");
        StringFog.decrypt("eV4jS4cjZw==\n", "FDtXI+hHFNc=\n");
    }

    public C1183(String str, String str2, JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        this.f3759 = AbstractC1088.m645(str2);
        this.f3758 = AbstractC1088.m645(str);
        this.f3757 = AbstractC1088.m645(jSONObject.optString(StringFog.decrypt("BHmMzPk=\n", "dwz8qYtwU18=\n")));
        this.f3756 = jSONObject.optBoolean(StringFog.decrypt("97S9UWVg9vM=\n", "ltbOJRcBlYc=\n"));
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("6hYYISRL9Q==\n", "h3N1Q0E5hu8=\n"));
        HashMap hashMap2 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String m645 = AbstractC1088.m645(optJSONArray.optString(i));
                if (m645 != null) {
                    arrayList.add(m645);
                }
            }
        } else {
            arrayList = null;
        }
        this.f3755 = arrayList == null ? new ArrayList() : arrayList;
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("XUBwms4=\n", "LiUE776ts14=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new C1182(optJSONArray2.optJSONObject(i2)));
            }
        } else {
            arrayList2 = null;
        }
        this.f3754 = arrayList2 == null ? new ArrayList() : arrayList2;
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("Wn5biz+d\n", "Pwg+5UvuPx0=\n"));
        if (optJSONObject != null) {
            hashMap = new HashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, new C0352(optJSONObject.optJSONObject(next)));
            }
        } else {
            hashMap = null;
        }
        this.f3753 = hashMap == null ? new HashMap() : hashMap;
        C0499[] c0499Arr = {null};
        JSONObject optJSONObject2 = jSONObject.optJSONObject(StringFog.decrypt("tuGA/SSCgA==\n", "24T0lUvm8yM=\n"));
        if (optJSONObject2 != null) {
            hashMap2 = new HashMap();
            Iterator<String> keys2 = optJSONObject2.keys();
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                C0499 c0499 = new C0499(this, next2, optJSONObject2.optJSONObject(next2), c0499Arr[0]);
                c0499Arr[0] = c0499;
                hashMap2.put(next2, c0499);
            }
        }
        this.f3752 = hashMap2 == null ? new HashMap() : hashMap2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f3752.values());
        Collections.sort(arrayList, new C0200());
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append(((C0499) it.next()).toString());
            sb.append("\n\n");
        }
        return sb.toString();
    }
}

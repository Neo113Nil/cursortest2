package com.bytedance.sdk.openadsdk.tmg.pcc;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.pcc.gm;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.yt;
import com.ironsource.C4094gc;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.bf3;
import defpackage.wv8;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb extends com.bytedance.sdk.component.pcc.gm<JSONObject, JSONObject> {
    private final WeakReference<mu> pcc;

    public gbb(mu muVar) {
        this.pcc = new WeakReference<>(muVar);
    }

    private Pair<Boolean, JSONObject> sf(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (!jSONObject.has("cypher") || !jSONObject.has(PglCryptUtils.KEY_MESSAGE)) {
            return new Pair<>(Boolean.FALSE, jSONObject);
        }
        String pcc = yt.pcc(jSONObject.optInt("cypher", -1), jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
        if (!TextUtils.isEmpty(pcc)) {
            try {
                JSONObject jSONObject2 = new JSONObject(pcc);
                z = true;
                jSONObject = jSONObject2;
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, -3, "decryptBody error" + e.getMessage(), null, null);
            }
            return new Pair<>(Boolean.valueOf(z), jSONObject);
        }
        z = false;
        return new Pair<>(Boolean.valueOf(z), jSONObject);
    }

    public void pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        com.bytedance.sdk.openadsdk.hc.wh whVar2;
        Exception exc;
        com.bytedance.sdk.openadsdk.hc.wh whVar3;
        JSONArray optJSONArray;
        String str;
        try {
            String optString = jSONObject.optString("url");
            String optString2 = jSONObject.optString("method");
            Object opt = jSONObject.opt("bodyParams");
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            Boolean bool = Boolean.TRUE;
            if (optJSONObject != null) {
                try {
                    optJSONArray = optJSONObject.optJSONArray("fallbackUrls");
                    if (optJSONObject.has("encrypt")) {
                        bool = Boolean.valueOf(optJSONObject.optBoolean("encrypt"));
                    }
                } catch (Exception e) {
                    exc = e;
                    whVar3 = whVar;
                    try {
                        whVar3.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                    } catch (JSONException e2) {
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e2.getMessage(), null, null);
                        return;
                    }
                }
            } else {
                optJSONArray = null;
            }
            Boolean bool2 = bool;
            Map<String, String> pcc = pcc(optJSONObject2, bool2.booleanValue());
            List<String> arrayList = new ArrayList<>();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                arrayList = pcc(optJSONArray);
            }
            List<String> list = arrayList;
            try {
                str = new URL(optString).getPath();
            } catch (Exception unused) {
                str = "param is null";
            }
            String str2 = str;
            try {
                if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
                    com.bytedance.sdk.openadsdk.hc.wh whVar4 = whVar;
                    whVar4.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method");
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "null url or method", str2, list);
                    whVar2 = whVar4;
                } else {
                    if (bool2.booleanValue() && opt != null && !(opt instanceof JSONObject)) {
                        whVar.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true");
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "bodyParams must be JSONObject when encrypt is true", str2, list);
                        return;
                    }
                    if (!HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(sf(optString))) {
                        whVar.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed");
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "non-https url is not allowed", str2, list);
                        return;
                    }
                    if (C4094gc.a.equalsIgnoreCase(optString2)) {
                        com.bytedance.sdk.openadsdk.hc.wh whVar5 = whVar;
                        pcc(optString, pcc, list, str2, bool2, whVar5);
                        whVar2 = whVar5;
                    } else {
                        com.bytedance.sdk.openadsdk.hc.wh whVar6 = whVar;
                        if (C4094gc.b.equalsIgnoreCase(optString2)) {
                            String str3 = str2;
                            try {
                                pcc(optString, pcc, list, opt, bool2, str3, whVar6);
                                whVar2 = str3;
                            } catch (Exception e3) {
                                e = e3;
                                whVar2 = whVar6;
                                exc = e;
                                whVar3 = whVar2;
                                whVar3.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                            }
                        } else {
                            String concat = "unsupported method: ".concat(String.valueOf(optString2));
                            whVar6.pcc(0, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, concat);
                            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", optString, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, concat, str2, list);
                            whVar2 = whVar6;
                        }
                    }
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            whVar2 = whVar;
        }
    }

    public String sf(String str) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme != null) {
                return scheme.toLowerCase();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, final mu muVar) {
        jrVar.pcc("request", new gm.sf() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.1
            @Override // com.bytedance.sdk.component.pcc.gm.sf
            public com.bytedance.sdk.component.pcc.gm pcc() {
                return new gbb(mu.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.pcc.gm
    public void pcc(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu muVar = this.pcc.get();
        final JSONObject jSONObject2 = new JSONObject();
        if (muVar == null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject3.put(NotificationCompat.CATEGORY_MESSAGE, "ttAndroidObject is null");
            jSONObject2.put("code", 0);
            jSONObject2.put("data", jSONObject3);
            pcc((gbb) jSONObject2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "ttAndroidObject is null", null, null);
            return;
        }
        if (jSONObject == null) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
            jSONObject4.put(NotificationCompat.CATEGORY_MESSAGE, "params is null");
            jSONObject2.put("code", 0);
            jSONObject2.put("data", jSONObject4);
            pcc((gbb) jSONObject2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "params is null", null, null);
            return;
        }
        if (jSONObject.has("url") && jSONObject.has("method")) {
            pcc(jSONObject, new com.bytedance.sdk.openadsdk.hc.wh() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.3
                @Override // com.bytedance.sdk.openadsdk.hc.wh
                public void pcc(int i, int i2, String str, JSONObject jSONObject5, Object obj, int i3) {
                    try {
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("net_code", i2);
                        if (str != null && !str.isEmpty()) {
                            jSONObject6.put(NotificationCompat.CATEGORY_MESSAGE, str);
                        }
                        jSONObject6.put("header", jSONObject5);
                        if (obj != null) {
                            jSONObject6.put("response", obj);
                            jSONObject6.put("decode", i3);
                        }
                        jSONObject2.put("code", i);
                        jSONObject2.put("data", jSONObject6);
                        gbb.this.pcc((gbb) jSONObject2);
                        Objects.toString(obj);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.hc.wh
                public void pcc(int i, int i2, String str) {
                    try {
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put("net_code", i2);
                        jSONObject5.put(NotificationCompat.CATEGORY_MESSAGE, str);
                        jSONObject2.put("code", i);
                        jSONObject2.put("data", jSONObject5);
                        gbb.this.pcc((gbb) jSONObject2);
                    } catch (Exception unused) {
                    }
                }
            });
            return;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("net_code", Sdk.SDKError.Reason.AD_NO_FILL_VALUE);
        jSONObject5.put(NotificationCompat.CATEGORY_MESSAGE, "url or method is empty");
        jSONObject2.put("code", 0);
        jSONObject2.put("data", jSONObject5);
        pcc((gbb) jSONObject2);
        com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "url or method is empty", null, null);
    }

    private Map<String, String> pcc(JSONObject jSONObject, boolean z) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    String optString = jSONObject.optString(next, "");
                    if (!TextUtils.isEmpty(optString)) {
                        hashMap.put(next, optString);
                    }
                }
            }
        }
        if (z && !hashMap.containsKey("x-pgli18n")) {
            hashMap.put("x-pgli18n", "4");
        }
        return hashMap;
    }

    private List<String> pcc(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(sf(jSONArray.optString(i)))) {
                    arrayList.add(jSONArray.optString(i));
                }
            }
        }
        return arrayList;
    }

    private JSONObject pcc(JSONObject jSONObject) {
        return yt.pcc(PangleEncryptConstant.CryptDataScene.JSB_REQUEST, jSONObject);
    }

    private void pcc(final String str, Map<String, String> map, final List<String> list, final String str2, final Boolean bool, final com.bytedance.sdk.openadsdk.hc.wh whVar) {
        com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
        pcc(gm, "jsb_request", str2);
        gm.gm(str);
        if (map != null && !map.isEmpty()) {
            gm.oo(map);
        }
        if (com.bytedance.sdk.openadsdk.utils.sf.gm() && !list.isEmpty()) {
            gm.pcc(list);
            gm.pcc(60L, TimeUnit.SECONDS);
        }
        gm.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.4
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                gbb.this.pcc(iOException.getMessage(), str2, whVar);
                com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str, iOException.hashCode(), iOException.getMessage(), str2, list);
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                gbb.this.pcc(sfVar, str2, bool, whVar);
            }
        });
    }

    private void pcc(String str, Map<String, String> map, List<String> list, Object obj, final Boolean bool, String str2, final com.bytedance.sdk.openadsdk.hc.wh whVar) {
        final List<String> list2;
        final String str3;
        final String str4;
        Exception exc;
        com.bytedance.sdk.component.qf.sf.oo sf;
        JSONObject jSONObject;
        try {
            sf = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
            pcc(sf, "jsb_request", str2);
            sf.gm(str);
            if (map != null) {
                try {
                    if (!map.isEmpty()) {
                        sf.oo(map);
                    }
                } catch (Exception e) {
                    exc = e;
                    list2 = list;
                    str3 = str2;
                    str4 = str;
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str4, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, bf3.j(exc, new StringBuilder("executePostRequest error")), str3, list2);
                }
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    if (bool.booleanValue()) {
                        jSONObject = pcc((JSONObject) obj);
                    } else {
                        jSONObject = (JSONObject) obj;
                    }
                    sf.pcc(jSONObject);
                } else {
                    sf.pcc(new JSONObject(obj.toString()));
                }
            } else {
                sf.pcc(new JSONObject());
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm() && !list.isEmpty()) {
                sf.pcc(list);
                sf.pcc(60L, TimeUnit.SECONDS);
            }
            list2 = list;
            str3 = str2;
            str4 = str;
        } catch (Exception e2) {
            e = e2;
            list2 = list;
            str3 = str2;
            str4 = str;
        }
        try {
            sf.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.5
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    gbb.this.pcc(iOException.getMessage(), str3, whVar);
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str4, iOException.hashCode(), iOException.getMessage(), str3, list2);
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    gbb.this.pcc(sfVar, str3, bool, whVar);
                }
            });
        } catch (Exception e3) {
            e = e3;
            exc = e;
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", str4, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, bf3.j(exc, new StringBuilder("executePostRequest error")), str3, list2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a2 A[Catch: Exception -> 0x0041, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0041, blocks: (B:69:0x0019, B:70:0x0021, B:72:0x0027, B:77:0x003d, B:20:0x004e, B:24:0x0063, B:27:0x0069, B:29:0x006e, B:31:0x007c, B:33:0x0080, B:39:0x008f, B:48:0x00a2), top: B:68:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(com.bytedance.sdk.component.qf.sf sfVar, final String str, Boolean bool, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        Exception exc;
        com.bytedance.sdk.openadsdk.hc.wh whVar2;
        Object obj;
        try {
            if (sfVar != null) {
                try {
                    if (sfVar.wh()) {
                        int pcc = sfVar.pcc();
                        Map<String, String> gm = sfVar.gm();
                        JSONObject jSONObject = new JSONObject();
                        if (gm != null) {
                            try {
                                for (Map.Entry<String, String> entry : gm.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (key != null && value != null) {
                                        jSONObject.put(key, value);
                                    }
                                }
                            } catch (Exception e) {
                                exc = e;
                                whVar2 = whVar;
                                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                                }
                                try {
                                    whVar2.pcc(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                                    return;
                                } catch (JSONException e2) {
                                    com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e2.getMessage(), null, null);
                                    return;
                                }
                            }
                        }
                        String str2 = "";
                        String oo = sfVar.oo() != null ? sfVar.oo() : "";
                        JSONObject jSONObject2 = null;
                        new Pair(Boolean.FALSE, null);
                        int i = -1;
                        if (!TextUtils.isEmpty(oo) && bool.booleanValue()) {
                            try {
                                JSONObject jSONObject3 = new JSONObject(oo);
                                try {
                                    Pair<Boolean, JSONObject> sf = sf(jSONObject3);
                                    if (!((Boolean) sf.first).booleanValue() || (obj = sf.second) == null) {
                                        jSONObject2 = jSONObject3;
                                    } else {
                                        i = 4;
                                        jSONObject2 = (JSONObject) obj;
                                        r2 = 1;
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    jSONObject2 = jSONObject3;
                                    e.getMessage();
                                    str2 = "body is not valid JSON";
                                    int i2 = i;
                                    JSONObject jSONObject4 = jSONObject2;
                                    String str3 = str2;
                                    if (r2 != 0) {
                                    }
                                    if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                                    }
                                    whVar.pcc(1, pcc, str3, jSONObject, r8, i2);
                                    return;
                                }
                            } catch (JSONException e4) {
                                e = e4;
                            }
                        }
                        int i22 = i;
                        JSONObject jSONObject42 = jSONObject2;
                        String str32 = str2;
                        Object obj2 = (r2 != 0 || jSONObject42 == null) ? oo : jSONObject42;
                        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.6
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc e5 = wv8.e("jsb_request");
                                    if (!TextUtils.isEmpty(str)) {
                                        e5.qf(str);
                                    }
                                    return e5;
                                }
                            });
                        }
                        whVar.pcc(1, pcc, str32, jSONObject, obj2, i22);
                        return;
                    }
                } catch (Exception e5) {
                    e = e5;
                    whVar2 = whVar;
                    exc = e;
                    if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.8
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc e6 = wv8.e("jsb_request");
                                if (!TextUtils.isEmpty(str)) {
                                    e6.qf(str);
                                }
                                return e6;
                            }
                        });
                    }
                    whVar2.pcc(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, exc.getMessage());
                    return;
                }
            }
            if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.7
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc e6 = wv8.e("jsb_request");
                        if (!TextUtils.isEmpty(str)) {
                            e6.qf(str);
                        }
                        return e6;
                    }
                });
            }
            whVar.pcc(1, sfVar != null ? sfVar.pcc() : 0, "HTTP error : response is empty");
        } catch (Exception e6) {
            e = e6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(String str, final String str2, com.bytedance.sdk.openadsdk.hc.wh whVar) {
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.9
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc e = wv8.e("jsb_request");
                    if (!TextUtils.isEmpty(str2)) {
                        e.qf(str2);
                    }
                    return e;
                }
            });
        }
        try {
            whVar.pcc(1, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, str);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.dax.pcc.vj.sf("jsb_request", null, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "JSONException: " + e.getMessage(), null, null);
        }
    }

    private void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, final String str, final String str2) {
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.10
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(str);
                    if (!TextUtils.isEmpty(str2)) {
                        pccVar.qf(str2);
                    }
                    return pccVar;
                }
            });
        } else {
            gmVar.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.tmg.pcc.gbb.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(str);
                    if (!TextUtils.isEmpty(str2)) {
                        pccVar.qf(str2);
                    }
                    return pccVar;
                }
            });
        }
    }
}

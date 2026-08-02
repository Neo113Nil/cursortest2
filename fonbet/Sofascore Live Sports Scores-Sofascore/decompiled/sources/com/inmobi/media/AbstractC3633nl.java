package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.dii;
import defpackage.tub;
import defpackage.xw3;
import defpackage.zol;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.nl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3633nl {
    /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3659ol a() {
        Hh hh = AbstractC3890xj.a;
        boolean enabled = ((SignalsConfig) AbstractC3435g4.a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().getEnabled();
        if (!enabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!enabled) {
            return new C3659ol();
        }
        if (c()) {
            return new C3659ol();
        }
        HashMap hashMap = new HashMap();
        JSONObject a = Q9.a();
        Iterator<String> keys = a != null ? a.keys() : null;
        if (keys != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", a.get(next));
                    hashMap.put(next, jSONObject);
                } catch (JSONException e) {
                    dii.d(" Error in looping through publisher provided unif id " + e.getMessage() + "\n                                        " + a.get(next) + "\n                    ");
                }
            }
        }
        JSONObject b = Q9.b();
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    JSONArray jSONArray = b.getJSONArray("ufids");
                    int length = jSONArray.length();
                    boolean z2 = false;
                    boolean z3 = false;
                    while (i < length) {
                        try {
                            String string = jSONArray.getJSONObject(i).has("src") ? jSONArray.getJSONObject(i).getString("src") : null;
                            String string2 = jSONArray.getJSONObject(i).has("envelope") ? jSONArray.getJSONObject(i).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray.getJSONObject(i).getLong("expiry")) {
                                z2 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                hashMap.put(string, jSONObject2);
                                z3 = true;
                            }
                            i++;
                            z2 = z2;
                        } catch (JSONException e2) {
                            e = e2;
                            z = z3;
                            e.getMessage();
                            b.toString();
                            if (!hashMap.isEmpty()) {
                            }
                        }
                    }
                    if (z2) {
                        xw3.L(L9.c, null, null, new C3607ml(null), 3);
                    }
                    z = z3;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        if (!hashMap.isEmpty()) {
            return new C3659ol();
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object obj : hashMap.values()) {
            obj.getClass();
            jSONArray2.put((JSONObject) obj);
        }
        return new C3659ol(jSONArray2.toString(), z);
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject b = Q9.b();
        if (b != null) {
            try {
                if (b.has("ufids")) {
                    JSONArray jSONArray2 = b.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        String string = jSONArray2.getJSONObject(i).has("src") ? jSONArray2.getJSONObject(i).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z = System.currentTimeMillis() > jSONArray2.getJSONObject(i).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                b.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z;
        jSONObject.getClass();
        try {
            if (jSONObject.has("ufids")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ufids");
                int length = jSONArray.length();
                z = true;
                for (int i = 0; i < length; i++) {
                    try {
                        z &= System.currentTimeMillis() <= jSONArray.getJSONObject(i).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(jSONObject);
                        return !z;
                    }
                }
            } else {
                z = true;
            }
        } catch (JSONException unused2) {
            z = true;
        }
        return !z;
    }

    public static boolean c() {
        C3872x1 c3872x1 = Yk.a;
        Boolean bool = c3872x1 != null ? c3872x1.c : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        if (booleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return booleanValue;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static boolean b(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return true;
        }
        try {
            jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
        } catch (JSONException unused) {
        }
        return jSONArray == null || jSONArray.length() == 0;
    }

    public static void a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        short s;
        String message = error != null ? error.getMessage() : null;
        if (Intrinsics.c(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s = 93;
        } else {
            s = Intrinsics.c(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s >= 0) {
            LinkedHashMap i = tub.i(new Pair(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s)));
            C3839vk c3839vk = C3839vk.a;
            C3839vk.b("FetchCallbackFailure", i, EnumC3943zk.SDK);
        }
        AbstractC3632nk.a(new zol(9, inMobiUnifiedIdInterface, jSONObject, error));
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        hashMap.put(jSONArray2.getJSONObject(i).getString("src"), jSONArray2.getJSONObject(i));
                    }
                }
            } catch (JSONException e) {
                e.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                hashMap.put(jSONArray3.getJSONObject(i2).getString("src"), jSONArray3.getJSONObject(i2));
            }
        }
        Collection values = hashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}

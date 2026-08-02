package com.unity3d.ads.core.extensions;

import com.google.android.gms.ads.AdError;
import defpackage.e5h;
import defpackage.ml3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toBuiltInMap", "", "", "", "Lorg/json/JSONObject;", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JSONObjectExtensionsKt {
    @NotNull
    public static final Map<String, Object> toBuiltInMap(@NotNull JSONObject jSONObject) {
        jSONObject.getClass();
        Iterator<String> keys = jSONObject.keys();
        keys.getClass();
        ml3 b = e5h.b(keys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object opt = jSONObject.opt((String) next);
            if (opt == null || String.valueOf(opt).equals(AdError.UNDEFINED_DOMAIN) || String.valueOf(opt).equals("null")) {
                opt = null;
            }
            linkedHashMap.put(next, opt);
        }
        return linkedHashMap;
    }
}

package com.ironsource;

import com.ironsource.X3;
import com.ironsource.sdk.utils.SDKUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.j5g;
import xsna.j9x;
import xsna.k9x;
import xsna.swe0;

/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4653y8 {
    public static final C4653y8 a = new C4653y8();

    private C4653y8() {
    }

    public static final String a() {
        JSONObject optJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(X3.a.c);
        Object opt = optJSONObject != null ? optJSONObject.opt(B5.K) : null;
        if (opt == null || !(opt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) opt;
        k9x q = swe0.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        j9x it = q.iterator();
        while (it.d) {
            Object opt2 = jSONArray.opt(it.nextInt());
            if (opt2 != null) {
                arrayList.add(opt2);
            }
        }
        return j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62);
    }
}

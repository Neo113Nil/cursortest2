package com.ironsource;

import com.ironsource.X3;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.x8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2739x8 {
    public static final C2739x8 a = new C2739x8();

    private C2739x8() {
    }

    @JvmStatic
    public static final String a() {
        JSONObject optJSONObject = SDKUtils.getControllerConfigAsJSONObject().optJSONObject(X3.a.c);
        Object opt = optJSONObject != null ? optJSONObject.opt(B5.K) : null;
        if (opt == null || !(opt instanceof JSONArray)) {
            return null;
        }
        JSONArray jSONArray = (JSONArray) opt;
        IntRange until = RangesKt.until(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            Object opt2 = jSONArray.opt(((IntIterator) it).nextInt());
            if (opt2 != null) {
                arrayList.add(opt2);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}

package com.unity3d.ads.core.extensions;

import defpackage.k13;
import defpackage.l6a;
import defpackage.llf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u001a\u001d\u0010\u0000\u001a\u0010\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u00020\u0001*\u00020\u0004¢\u0006\u0002\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007*\u00020\u0004¨\u0006\n"}, d2 = {"toTypedArray", "", "", "kotlin.jvm.PlatformType", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)[Ljava/lang/Object;", "getHeadersMap", "", "", "", "unity-ads_defaultRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JSONArrayExtensionsKt {
    @NotNull
    public static final Map<String, List<String>> getHeadersMap(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            obj.getClass();
            JSONArray jSONArray2 = (JSONArray) obj;
            List list = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (list == null) {
                list = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            string.getClass();
            list.add(string);
            linkedHashMap.put(jSONArray2.getString(0), list);
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Object[] toTypedArray(@NotNull JSONArray jSONArray) {
        jSONArray.getClass();
        IntRange j = llf.j(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(k13.r(j, 10));
        Iterator it = j.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((l6a) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}

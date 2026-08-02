package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    public static Map<Integer, b<String, List<Campaign>>> a = new HashMap();

    public static b<String, List<Campaign>> a(int i) {
        if (a.containsKey(Integer.valueOf(i))) {
            return a.get(Integer.valueOf(i));
        }
        a aVar = new a(i);
        a.put(Integer.valueOf(i), aVar);
        return aVar;
    }
}

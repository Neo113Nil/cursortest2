package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import defpackage.a70;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class fum {
    private static final Map<Integer, pcc<?, ?>> pcc = new ConcurrentHashMap();

    public static pcc<?, ?> pcc(Context context, int i) {
        pcc<?, ?> pccVar;
        Map<Integer, pcc<?, ?>> map = pcc;
        pcc<?, ?> pccVar2 = map.get(Integer.valueOf(i));
        if (pccVar2 != null) {
            return pccVar2;
        }
        synchronized (fum.class) {
            try {
                pccVar = map.get(Integer.valueOf(i));
                if (pccVar == null) {
                    pccVar = sf(context, i);
                    map.put(Integer.valueOf(i), pccVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pccVar;
    }

    private static pcc<?, ?> sf(Context context, int i) {
        if (i == 7) {
            return new lu(context);
        }
        if (i == 8) {
            return new qf(context);
        }
        a70.p("Unsupported ad type: ".concat(String.valueOf(i)));
        return null;
    }
}

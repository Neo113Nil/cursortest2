package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Pa {
    public static Qa a(Context context, String str) {
        context.getClass();
        str.getClass();
        String a = a(str);
        ConcurrentHashMap concurrentHashMap = Qa.b;
        Qa qa = (Qa) concurrentHashMap.get(a);
        if (qa == null) {
            qa = new Qa(context, a);
            Qa qa2 = (Qa) concurrentHashMap.putIfAbsent(a, qa);
            if (qa2 != null) {
                return qa2;
            }
        }
        return qa;
    }

    public static String a(String str) {
        return com.appsflyer.internal.i.h(str, "com.im.keyValueStore.", str);
    }
}

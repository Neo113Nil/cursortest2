package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Ak {
    public static final Qa a;
    public static int b;
    public static Integer c;

    static {
        Qa qa;
        Context context = AbstractC3424fj.a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Qa.b;
            qa = Pa.a(context, "imtelemetrydboverflow");
        } else {
            qa = null;
        }
        a = qa;
        b = -1;
    }

    public static int a() {
        int i = b;
        if (i != -1) {
            return i;
        }
        Qa qa = a;
        int i2 = qa != null ? qa.a.getInt("count", 0) : 0;
        b = i2;
        return i2;
    }
}

package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.da, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3364da {
    public static Qa a;

    public static final Qa a() {
        Qa qa = a;
        if (qa == null) {
            Context context = AbstractC3424fj.a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Qa.b;
                qa = Pa.a(context, "CrashSession-store");
            } else {
                qa = null;
            }
            a = qa;
        }
        return qa;
    }
}

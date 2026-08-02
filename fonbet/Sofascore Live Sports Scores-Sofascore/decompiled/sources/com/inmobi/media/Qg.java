package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Qg {
    public final Qa a;

    public Qg(Context context, String str) {
        context.getClass();
        str.getClass();
        ConcurrentHashMap concurrentHashMap = Qa.b;
        this.a = Pa.a(context, str);
    }

    public final String a(String str) {
        str.getClass();
        Qa qa = this.a;
        qa.getClass();
        str.getClass();
        return qa.a.getString(str, null);
    }
}

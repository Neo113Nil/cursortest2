package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class m {
    private static volatile p a;
    private static volatile Handler b;

    public static p a() {
        if (a == null) {
            b();
        }
        return a;
    }

    private static HandlerThread b() {
        if (a == null) {
            synchronized (m.class) {
                try {
                    if (a == null) {
                        p pVar = new p("default_npth_thread");
                        a = pVar;
                        pVar.b();
                    }
                } finally {
                }
            }
        }
        return a.c();
    }
}

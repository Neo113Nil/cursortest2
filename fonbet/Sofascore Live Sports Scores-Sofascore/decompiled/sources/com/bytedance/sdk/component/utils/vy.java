package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {
    private static volatile Handler pcc;

    public static Handler pcc() {
        return com.bytedance.sdk.component.kj.pcc.pcc.pcc().sf();
    }

    public static Handler sf() {
        if (pcc == null) {
            synchronized (vy.class) {
                try {
                    if (pcc == null) {
                        pcc = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }
}

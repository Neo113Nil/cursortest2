package com.bytedance.sdk.openadsdk.qy.pcc;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.kj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private static Handler pcc;
    private static HandlerThread sf;

    public static Handler pcc() {
        HandlerThread handlerThread;
        try {
            handlerThread = sf;
        } catch (Throwable unused) {
        }
        if (handlerThread != null && handlerThread.isAlive()) {
            if (pcc == null) {
                synchronized (pcc.class) {
                    try {
                        if (pcc == null) {
                            pcc = new Handler(sf.getLooper());
                        }
                    } finally {
                    }
                }
            }
            return pcc;
        }
        synchronized (pcc.class) {
            try {
                HandlerThread handlerThread2 = sf;
                if (handlerThread2 != null) {
                    if (!handlerThread2.isAlive()) {
                    }
                }
                sf = kj.pcc("pag_ev");
                pcc = new Handler(sf.getLooper());
            } finally {
            }
        }
        return pcc;
    }
}

package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    public static volatile boolean pcc;
    private static HandlerThread sf;

    public static HandlerThread pcc(String str, int i) {
        if (pcc) {
            return sf;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.kj.1
                boolean pcc = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.pcc) {
                        return;
                    }
                    this.pcc = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            lo.pcc("HandlerThreadUtils", "new handlerThread error", th);
            return sf;
        }
    }

    public static HandlerThread pcc(String str) {
        return pcc(str, 0);
    }

    public static void pcc(HandlerThread handlerThread) {
        sf = handlerThread;
    }
}

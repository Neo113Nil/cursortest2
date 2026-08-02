package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.component.utils.lo;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    private static final AtomicInteger pcc = new AtomicInteger(1);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(int i) {
        boolean z = true;
        if (i == 1 || i == 2) {
            try {
                AtomicInteger atomicInteger = pcc;
                if (atomicInteger.get() != i) {
                    try {
                        atomicInteger.set(i);
                    } catch (Throwable th) {
                        th = th;
                        lo.gm("SdkSwitch", th.getMessage());
                        if (z) {
                        }
                    }
                } else {
                    z = false;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
            if (z) {
                return;
            }
            pcc();
            if (pcc()) {
                com.bytedance.sdk.openadsdk.oo.pcc.sf.sf();
            } else {
                com.bytedance.sdk.openadsdk.oo.pcc.sf.gm();
            }
        }
    }

    public static boolean pcc() {
        return pcc.get() == 1;
    }
}

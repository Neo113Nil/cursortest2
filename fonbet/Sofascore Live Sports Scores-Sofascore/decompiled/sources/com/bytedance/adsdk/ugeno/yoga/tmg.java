package com.bytedance.adsdk.ugeno.yoga;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg extends YogaNodeJNIBase {
    public void finalize() throws Throwable {
        try {
            hc();
        } finally {
            super.finalize();
        }
    }

    public void hc() {
        long j = this.pcc;
        if (j != 0) {
            this.pcc = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j);
        }
    }
}

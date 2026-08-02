package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends qf {
    private static volatile wh pcc;

    private wh(Context context) {
        super(context);
    }

    public static wh pcc(Context context) {
        if (pcc == null) {
            synchronized (wh.class) {
                try {
                    if (pcc == null) {
                        pcc = new wh(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qf
    public /* bridge */ /* synthetic */ qf.gm pcc() {
        return super.pcc();
    }
}

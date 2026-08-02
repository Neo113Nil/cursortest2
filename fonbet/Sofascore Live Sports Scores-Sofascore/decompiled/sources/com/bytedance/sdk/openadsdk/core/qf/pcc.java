package com.bytedance.sdk.openadsdk.core.qf;

import android.content.Context;
import com.bytedance.sdk.openadsdk.core.qf.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm {
    private static volatile pcc pcc;

    private pcc(Context context) {
        super(context);
    }

    public static pcc pcc(Context context) {
        if (pcc == null) {
            synchronized (pcc.class) {
                try {
                    if (pcc == null) {
                        pcc = new pcc(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.qf.gm
    public /* bridge */ /* synthetic */ gm.C0095gm pcc() {
        return super.pcc();
    }
}

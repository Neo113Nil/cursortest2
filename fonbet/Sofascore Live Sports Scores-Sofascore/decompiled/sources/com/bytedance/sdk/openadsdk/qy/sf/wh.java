package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.nn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    public static boolean pcc(View view, boolean z, int i) {
        if (view == null) {
            return false;
        }
        return nn.pcc(view, z ? 30 : 50, i, false);
    }

    public static boolean pcc(View view, int i) {
        return pcc(view, false, i);
    }
}

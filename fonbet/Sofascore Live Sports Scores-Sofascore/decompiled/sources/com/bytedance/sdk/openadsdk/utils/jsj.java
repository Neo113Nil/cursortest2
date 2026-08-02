package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.ironsource.Q3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class jsj {
    public static String pcc(Context context) {
        int pcc = com.bytedance.sdk.component.utils.jsj.pcc(context, 0L);
        return pcc != 2 ? pcc != 3 ? pcc != 4 ? pcc != 5 ? pcc != 6 ? "mobile" : "5g" : "4g" : Q3.b : Q3.a : "2g";
    }
}

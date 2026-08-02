package com.bytedance.sdk.component.adexpress.dynamic.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.oo.qf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    public static int pcc(qf qfVar) {
        if (qfVar == null) {
            return 0;
        }
        String rnn = qfVar.rnn();
        String yt = qfVar.yt();
        if (TextUtils.isEmpty(yt) || TextUtils.isEmpty(rnn) || !yt.equals("creative")) {
            return 0;
        }
        if (rnn.equals("shake")) {
            return 2;
        }
        if (rnn.equals("twist")) {
            return 3;
        }
        return rnn.equals("slide") ? 1 : 0;
    }
}

package com.bytedance.sdk.openadsdk.core.hc.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.tz;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.adsdk.ugeno.vy.wh.sf {
    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vy.wh.sf
    public void gbb(String str) {
        super.gbb(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String format = String.format(tz.pcc(this.sf, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.vy.wh.pcc) this.vj).setText("(" + format + ")");
        } catch (Exception unused) {
        }
    }
}

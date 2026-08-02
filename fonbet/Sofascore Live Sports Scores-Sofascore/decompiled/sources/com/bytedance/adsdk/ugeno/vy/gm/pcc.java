package com.bytedance.adsdk.ugeno.vy.gm;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.vy.oo.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc extends gm {
    private int gga;

    public pcc(Context context) {
        super(context);
        this.gga = -16777216;
    }

    private String jr(String str) {
        String hc = hc(str);
        return TextUtils.isEmpty(hc) ? "" : "local://".concat(String.valueOf(hc));
    }

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm
    public String gm() {
        return "drawable";
    }

    public abstract String hc(String str);

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm, com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.getClass();
        if (str.equals("textColor")) {
            this.gga = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vy.oo.gm, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        ((gm) this).pcc = jr(((gm) this).pcc);
        super.sf();
        ((com.bytedance.adsdk.ugeno.vy.oo.pcc) this.vj).setColorFilter(this.gga);
        ((com.bytedance.adsdk.ugeno.vy.oo.pcc) this.vj).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}

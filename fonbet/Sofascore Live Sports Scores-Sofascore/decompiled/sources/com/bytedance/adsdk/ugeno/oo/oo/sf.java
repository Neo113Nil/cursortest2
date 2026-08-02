package com.bytedance.adsdk.ugeno.oo.oo;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm implements com.bytedance.adsdk.ugeno.pcc.sf {
    private String vh;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Object obj;
        com.bytedance.adsdk.ugeno.sf.gm kj;
        com.bytedance.adsdk.ugeno.pcc.pcc tmg;
        Map<String, Object> map = this.vj;
        if (map == null || map.size() <= 0 || (obj = this.vj.get("name")) == null) {
            return false;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf)) {
            return false;
        }
        Object obj2 = this.vj.get("state");
        if (obj2 != null) {
            this.vh = String.valueOf(obj2);
        }
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.sf;
        com.bytedance.adsdk.ugeno.sf.gm sf = gmVar.sf(gmVar);
        if (sf != null && (kj = sf.kj(valueOf)) != null && (tmg = kj.tmg(valueOf)) != null) {
            tmg.pcc(this);
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf
    public void sf() {
        com.bytedance.adsdk.ugeno.oo.vh vhVar;
        if ((TextUtils.equals(this.vh, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE) || TextUtils.isEmpty(this.vh)) && (vhVar = this.pcc) != null) {
            vhVar.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.pcc.sf
    public void pcc() {
        com.bytedance.adsdk.ugeno.oo.vh vhVar;
        if ((TextUtils.equals(this.vh, "start") || TextUtils.isEmpty(this.vh)) && (vhVar = this.pcc) != null) {
            vhVar.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
        }
    }
}

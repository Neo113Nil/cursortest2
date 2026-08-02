package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.content.Context;
import com.bytedance.adsdk.ugeno.oo.vh;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean vh;

    public oo(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Map<String, Object> map = this.vj;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long longValue = ((Long) objArr[0]).longValue() / 1000;
        long longValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (longValue <= 0) {
            this.vh = false;
        }
        boolean containsKey = this.vj.containsKey("percent");
        Map<String, Object> map2 = this.vj;
        if (containsKey) {
            Object obj = map2.get("percent");
            float pcc = obj != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj), -1.0f) : -1.0f;
            if (pcc >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && longValue >= (pcc / 100.0f) * longValue2 && !this.vh) {
                this.vh = true;
                vh vhVar = this.pcc;
                if (vhVar != null) {
                    vhVar.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        } else {
            if (longValue >= (map2.get("interval") != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(r9), -1) : -1) && !this.vh) {
                this.vh = true;
                vh vhVar2 = this.pcc;
                if (vhVar2 != null) {
                    vhVar2.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                }
            }
        }
        return true;
    }
}

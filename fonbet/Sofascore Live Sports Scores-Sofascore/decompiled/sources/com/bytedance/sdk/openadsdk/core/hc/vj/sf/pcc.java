package com.bytedance.sdk.openadsdk.core.hc.vj.sf;

import android.content.Context;
import com.bytedance.adsdk.ugeno.oo.vh;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends com.bytedance.adsdk.ugeno.oo.oo.gm {
    private boolean vh;

    public pcc(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.oo.oo.gm
    public boolean pcc(Object... objArr) {
        Map<String, Object> map = this.vj;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(obj.toString(), -1);
                if (this.vj.containsKey("remainingSeconds")) {
                    Object obj2 = this.vj.get("remainingSeconds");
                    int pcc2 = obj2 != null ? com.bytedance.adsdk.ugeno.qf.gm.pcc(String.valueOf(obj2), -1) : -1;
                    if ((pcc == 0 || (pcc2 >= 0 && pcc == pcc2)) && !this.vh) {
                        this.vh = true;
                        vh vhVar = this.pcc;
                        if (vhVar != null) {
                            vhVar.pcc(this.sf, this.wh, this.gm.sf(), this.gm);
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}

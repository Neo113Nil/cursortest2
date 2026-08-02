package com.bytedance.sdk.component.vj.sf.sf;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dax;
import com.bytedance.sdk.component.vj.gpj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements wh {
    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public boolean pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar, gpj gpjVar, com.bytedance.sdk.component.vj.sf.gm.pcc pccVar) {
        if (TextUtils.isEmpty(gmVar.kj())) {
            String pcc = pcc(gmVar);
            gmVar.sf(pcc);
            gmVar.pcc(pcc);
        }
        gmVar.pcc();
        return true;
    }

    @Override // com.bytedance.sdk.component.vj.sf.sf.wh
    public String pcc() {
        return "generate_key";
    }

    private String pcc(com.bytedance.sdk.component.vj.sf.gm.gm gmVar) {
        return dax.pcc(gmVar.pcc());
    }
}

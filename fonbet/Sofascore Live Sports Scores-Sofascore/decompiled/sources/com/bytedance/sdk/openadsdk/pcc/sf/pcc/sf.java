package com.bytedance.sdk.openadsdk.pcc.sf.pcc;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm {
    public sf(@NonNull Context context, of ofVar, AdSlot adSlot) {
        super(context, ofVar, adSlot);
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm
    public void pcc() {
        lo loVar = new lo(((gm) this).kj, this.sf, ((gm) this).vy, this.vh, false);
        this.ork = loVar;
        this.pcc.pcc(loVar.getVideoController());
        gm();
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc sf() {
        fum fumVar = this.ork;
        if (fumVar != null) {
            return ((lo) fumVar).getVideoModel();
        }
        return null;
    }
}

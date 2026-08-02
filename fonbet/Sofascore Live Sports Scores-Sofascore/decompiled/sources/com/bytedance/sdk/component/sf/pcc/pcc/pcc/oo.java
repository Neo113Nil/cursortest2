package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.sf.pcc.vh;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo extends vh {
    public pcc ork;
    public wh vy;

    public oo(vh.pcc pccVar) {
        super(pccVar);
        wh whVar = new wh();
        this.vy = whVar;
        this.ork = new pcc(whVar.sf());
    }

    @Override // com.bytedance.sdk.component.sf.pcc.vh
    public com.bytedance.sdk.component.sf.pcc.sf pcc(tmg tmgVar) {
        tmgVar.pcc(this);
        if (tmgVar.oo() == null || tmgVar.oo().pcc() == null || TextUtils.isEmpty(tmgVar.oo().pcc().toString())) {
            return null;
        }
        if (pcc.pcc == null || !pcc.pcc.sf() || !this.ork.vj() || "setting".equals(tmgVar.kj())) {
            sf sfVar = new sf(tmgVar, this.vy);
            this.vy.gm().add(sfVar);
            return sfVar;
        }
        sf sfVar2 = new sf(tmgVar, this.ork);
        this.ork.gm().add(sfVar2);
        return sfVar2;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.vh
    public com.bytedance.sdk.component.sf.pcc.oo sf() {
        return this.vy;
    }
}

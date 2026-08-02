package com.bytedance.sdk.openadsdk.core.hc.gm;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.nac;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.ork.dax;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private of gm;
    private com.bytedance.sdk.openadsdk.core.hc.gm.pcc oo;
    private gm pcc;
    private Context sf;
    private final boolean vj;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        public static gm pcc(Context context, of ofVar, boolean z) {
            if (nac.pcc(ofVar, z)) {
                return new oo(context, ofVar, z);
            }
            return null;
        }
    }

    public sf(Context context, of ofVar, boolean z) {
        this.sf = context;
        this.gm = ofVar;
        this.vj = z;
    }

    public View gm() {
        gm gmVar = this.pcc;
        if (gmVar != null) {
            return gmVar.oo();
        }
        return null;
    }

    public void oo() {
        gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.gm();
        }
    }

    public void pcc(int i) {
        mu vj;
        gm gmVar = this.pcc;
        if (!(gmVar instanceof oo) || (vj = ((oo) gmVar).vj()) == null || vj.pcc() == null) {
            return;
        }
        vj.pcc().pcc(i);
    }

    public void sf() {
        gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.sf();
        }
    }

    public sf(Context context, of ofVar) {
        this(context, ofVar, false);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.gm.pcc pccVar) {
        this.oo = pccVar;
        gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.pcc(pccVar);
        }
    }

    public void pcc(dax daxVar) {
        gm pcc2 = pcc.pcc(this.sf, this.gm, this.vj);
        this.pcc = pcc2;
        if (pcc2 != null) {
            pcc2.pcc();
            this.pcc.pcc(daxVar);
        }
    }

    public gm pcc() {
        return this.pcc;
    }
}

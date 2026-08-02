package com.bytedance.adsdk.ugeno;

import android.content.Context;
import com.bytedance.adsdk.ugeno.oo.kj;
import com.bytedance.adsdk.ugeno.oo.ork;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private static volatile vj pcc;
    private com.bytedance.adsdk.ugeno.core.gm gm;
    private pcc oo;
    private com.bytedance.adsdk.ugeno.core.pcc.pcc qf;
    private List<com.bytedance.adsdk.ugeno.core.sf> sf;
    private com.bytedance.adsdk.ugeno.gm.pcc vj;
    private com.bytedance.adsdk.ugeno.core.sf.oo wh;

    private vj() {
    }

    public static vj pcc() {
        if (pcc == null) {
            synchronized (vj.class) {
                try {
                    if (pcc == null) {
                        pcc = new vj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pcc;
    }

    private void wh() {
        ArrayList arrayList = new ArrayList();
        this.sf = arrayList;
        com.bytedance.adsdk.ugeno.core.gm gmVar = this.gm;
        if (gmVar != null) {
            arrayList.addAll(gmVar.pcc());
        }
        com.bytedance.adsdk.ugeno.core.oo.pcc(this.sf);
    }

    public com.bytedance.adsdk.ugeno.gm.pcc gm() {
        return this.vj;
    }

    public com.bytedance.adsdk.ugeno.core.sf.oo oo() {
        return this.wh;
    }

    public pcc sf() {
        return this.oo;
    }

    public com.bytedance.adsdk.ugeno.core.pcc.pcc vj() {
        return this.qf;
    }

    public void pcc(Context context, com.bytedance.adsdk.ugeno.core.gm gmVar, pcc pccVar) {
        this.gm = gmVar;
        this.oo = pccVar;
        wh();
    }

    public void pcc(com.bytedance.adsdk.ugeno.gm.pcc pccVar) {
        this.vj = pccVar;
    }

    public void pcc(kj kjVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.oo.pcc().pcc());
        if (kjVar != null) {
            arrayList.addAll(kjVar.pcc());
        }
        ork.pcc(arrayList);
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo.gm gmVar) {
        ArrayList arrayList = new ArrayList(new com.bytedance.adsdk.ugeno.oo.vj().pcc());
        if (gmVar != null) {
            arrayList.addAll(gmVar.pcc());
        }
        com.bytedance.adsdk.ugeno.oo.oo.pcc(arrayList);
    }
}

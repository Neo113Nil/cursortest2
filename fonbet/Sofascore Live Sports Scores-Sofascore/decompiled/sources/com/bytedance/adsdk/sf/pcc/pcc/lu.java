package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu implements hc, pcc.InterfaceC0027pcc {
    private final boolean gm;
    private final com.bytedance.adsdk.sf.vy oo;
    private final Path pcc = new Path();
    private final sf qf = new sf();
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.hc vj;
    private boolean wh;

    public lu(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.nac nacVar) {
        this.sf = nacVar.pcc();
        this.gm = nacVar.gm();
        this.oo = vyVar;
        com.bytedance.adsdk.sf.pcc.sf.hc pcc = nacVar.sf().pcc();
        this.vj = pcc;
        pccVar.pcc(pcc);
        pcc.pcc(this);
    }

    private void sf() {
        this.wh = false;
        this.oo.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        boolean z = this.wh;
        Path path = this.pcc;
        if (z) {
            return path;
        }
        path.reset();
        if (this.gm) {
            this.wh = true;
            return this.pcc;
        }
        Path qf = this.vj.qf();
        Path path2 = this.pcc;
        if (qf == null) {
            return path2;
        }
        path2.set(qf);
        this.pcc.setFillType(Path.FillType.EVEN_ODD);
        this.qf.pcc(this.pcc);
        this.wh = true;
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.qf.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
            if (gmVar instanceof gpj) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((gpj) gmVar);
            }
        }
        this.vj.pcc((List<gpj>) arrayList);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        sf();
    }
}

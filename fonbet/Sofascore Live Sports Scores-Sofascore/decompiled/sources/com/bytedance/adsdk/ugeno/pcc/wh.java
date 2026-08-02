package com.bytedance.adsdk.ugeno.pcc;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh {
    private Context gm;
    private com.bytedance.adsdk.ugeno.sf.gm oo;
    private List<gm> pcc;
    private List<pcc> sf;

    public wh(Context context, com.bytedance.adsdk.ugeno.sf.gm gmVar, List<gm> list) {
        this.oo = gmVar;
        this.gm = context;
        this.pcc = list;
        oo();
    }

    private void oo() {
        this.sf = new ArrayList();
        List<gm> list = this.pcc;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.pcc.size(); i++) {
            gm gmVar = this.pcc.get(i);
            if (gmVar != null) {
                this.sf.add(new pcc(this.gm, this.oo, gmVar));
            }
        }
    }

    public void gm() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.gm();
            }
        }
    }

    public pcc pcc(String str) {
        List<pcc> list = this.sf;
        if (list != null && !list.isEmpty()) {
            for (pcc pccVar : this.sf) {
                if (pccVar != null && TextUtils.equals(pccVar.vj(), str)) {
                    return pccVar;
                }
            }
        }
        return null;
    }

    public void sf() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc();
            }
        }
    }

    public void sf(Canvas canvas) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.sf(canvas);
            }
        }
    }

    public void pcc(Canvas canvas) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc(canvas);
            }
        }
    }

    public void pcc(int i, int i2) {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.pcc(i, i2);
            }
        }
    }

    public void pcc() {
        List<pcc> list = this.sf;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (pcc pccVar : this.sf) {
            if (pccVar != null) {
                pccVar.oo();
            }
        }
    }
}

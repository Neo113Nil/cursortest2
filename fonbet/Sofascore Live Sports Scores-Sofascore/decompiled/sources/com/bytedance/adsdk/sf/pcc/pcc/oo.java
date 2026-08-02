package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements hc, vj, pcc.InterfaceC0027pcc {
    private final Matrix gm;
    private final List<gm> kj;
    private final Path oo;
    private List<hc> ork;
    private final Paint pcc;
    private final boolean qf;
    private final RectF sf;
    private com.bytedance.adsdk.sf.pcc.sf.dax vh;
    private final RectF vj;
    private final com.bytedance.adsdk.sf.vy vy;
    private final String wh;

    public oo(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, String str, boolean z, List<gm> list, com.bytedance.adsdk.sf.gm.pcc.tmg tmgVar) {
        this.pcc = new com.bytedance.adsdk.sf.pcc.pcc();
        this.sf = new RectF();
        this.gm = new Matrix();
        this.oo = new Path();
        this.vj = new RectF();
        this.wh = str;
        this.vy = vyVar;
        this.qf = z;
        this.kj = list;
        if (tmgVar != null) {
            com.bytedance.adsdk.sf.pcc.sf.dax ork = tmgVar.ork();
            this.vh = ork;
            ork.pcc(pccVar);
            this.vh.pcc(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            gm gmVar = list.get(size);
            if (gmVar instanceof ork) {
                arrayList.add((ork) gmVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((ork) arrayList.get(size2)).pcc(list.listIterator(list.size()));
        }
    }

    private boolean vj() {
        int i = 0;
        for (int i2 = 0; i2 < this.kj.size(); i2++) {
            if ((this.kj.get(i2) instanceof vj) && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    public Matrix gm() {
        com.bytedance.adsdk.sf.pcc.sf.dax daxVar = this.vh;
        if (daxVar != null) {
            return daxVar.oo();
        }
        this.gm.reset();
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        this.gm.reset();
        com.bytedance.adsdk.sf.pcc.sf.dax daxVar = this.vh;
        if (daxVar != null) {
            this.gm.set(daxVar.oo());
        }
        this.oo.reset();
        if (this.qf) {
            return this.oo;
        }
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            gm gmVar = this.kj.get(size);
            if (gmVar instanceof hc) {
                this.oo.addPath(((hc) gmVar).oo(), this.gm);
            }
        }
        return this.oo;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        if (this.qf) {
            return;
        }
        this.gm.set(matrix);
        com.bytedance.adsdk.sf.pcc.sf.dax daxVar = this.vh;
        if (daxVar != null) {
            this.gm.preConcat(daxVar.oo());
            i = (int) (((((this.vh.pcc() == null ? 100 : this.vh.pcc().qf().intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        boolean z = this.vy.vy() && vj() && i != 255;
        if (z) {
            this.sf.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            pcc(this.sf, this.gm, true);
            this.pcc.setAlpha(i);
            com.bytedance.adsdk.sf.wh.wh.pcc(canvas, this.sf, this.pcc);
        }
        if (z) {
            i = 255;
        }
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            gm gmVar = this.kj.get(size);
            if (gmVar instanceof vj) {
                ((vj) gmVar).pcc(canvas, this.gm, i);
            }
        }
        if (z) {
            canvas.restore();
        }
    }

    public List<hc> sf() {
        if (this.ork == null) {
            this.ork = new ArrayList();
            for (int i = 0; i < this.kj.size(); i++) {
                gm gmVar = this.kj.get(i);
                if (gmVar instanceof hc) {
                    this.ork.add((hc) gmVar);
                }
            }
        }
        return this.ork;
    }

    public oo(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.dax daxVar, com.bytedance.adsdk.sf.qf qfVar) {
        this(vyVar, pccVar, daxVar.pcc(), daxVar.gm(), pcc(vyVar, qfVar, pccVar, daxVar.sf()), pcc(daxVar.sf()));
    }

    public static com.bytedance.adsdk.sf.gm.pcc.tmg pcc(List<com.bytedance.adsdk.sf.gm.sf.gm> list) {
        for (int i = 0; i < list.size(); i++) {
            com.bytedance.adsdk.sf.gm.sf.gm gmVar = list.get(i);
            if (gmVar instanceof com.bytedance.adsdk.sf.gm.pcc.tmg) {
                return (com.bytedance.adsdk.sf.gm.pcc.tmg) gmVar;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.vy.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        ArrayList arrayList = new ArrayList(this.kj.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            gm gmVar = this.kj.get(size);
            gmVar.pcc(arrayList, this.kj.subList(0, size));
            arrayList.add(gmVar);
        }
    }

    private static List<gm> pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, List<com.bytedance.adsdk.sf.gm.sf.gm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            gm pcc = list.get(i).pcc(vyVar, qfVar, pccVar);
            if (pcc != null) {
                arrayList.add(pcc);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        this.gm.set(matrix);
        com.bytedance.adsdk.sf.pcc.sf.dax daxVar = this.vh;
        if (daxVar != null) {
            this.gm.preConcat(daxVar.oo());
        }
        this.vj.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        for (int size = this.kj.size() - 1; size >= 0; size--) {
            gm gmVar = this.kj.get(size);
            if (gmVar instanceof vj) {
                ((vj) gmVar).pcc(this.vj, this.gm, z);
                rectF.union(this.vj);
            }
        }
    }
}

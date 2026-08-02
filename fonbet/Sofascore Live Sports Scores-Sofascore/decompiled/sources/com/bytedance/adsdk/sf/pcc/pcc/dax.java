package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements hc, ork, vh, vj, pcc.InterfaceC0027pcc {
    private final com.bytedance.adsdk.sf.vy gm;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> kj;
    private final com.bytedance.adsdk.sf.gm.gm.pcc oo;
    private oo ork;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> qf;
    private final String vj;
    private final com.bytedance.adsdk.sf.pcc.sf.dax vy;
    private final boolean wh;
    private final Matrix pcc = new Matrix();
    private final Path sf = new Path();

    public dax(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.tmg tmgVar) {
        this.gm = vyVar;
        this.oo = pccVar;
        this.vj = tmgVar.pcc();
        this.wh = tmgVar.vj();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = tmgVar.sf().pcc();
        this.qf = pcc;
        pccVar.pcc(pcc);
        pcc.pcc(this);
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc2 = tmgVar.gm().pcc();
        this.kj = pcc2;
        pccVar.pcc(pcc2);
        pcc2.pcc(this);
        com.bytedance.adsdk.sf.pcc.sf.dax ork = tmgVar.oo().ork();
        this.vy = ork;
        ork.pcc(pccVar);
        ork.pcc(this);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        Path oo = this.ork.oo();
        this.sf.reset();
        float floatValue = this.qf.qf().floatValue();
        float floatValue2 = this.kj.qf().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.pcc.set(this.vy.sf(i + floatValue2));
            this.sf.addPath(oo, this.pcc);
        }
        return this.sf;
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.qf.qf().floatValue();
        float floatValue2 = this.kj.qf().floatValue();
        float floatValue3 = this.vy.sf().qf().floatValue() / 100.0f;
        float floatValue4 = this.vy.gm().qf().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.pcc.set(matrix);
            float f = i2;
            this.pcc.preConcat(this.vy.sf(f + floatValue2));
            this.ork.pcc(canvas, this.pcc, (int) (com.bytedance.adsdk.sf.wh.vj.pcc(floatValue3, floatValue4, f / floatValue) * i));
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        this.ork.pcc(list, list2);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.ork
    public void pcc(ListIterator<gm> listIterator) {
        if (this.ork != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.ork = new oo(this.gm, this.oo, "Repeater", this.wh, arrayList, null);
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.vj
    public void pcc(RectF rectF, Matrix matrix, boolean z) {
        this.ork.pcc(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.gm.invalidateSelf();
    }
}

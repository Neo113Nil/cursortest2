package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Color;
import android.graphics.Paint;
import com.bytedance.adsdk.sf.pcc.sf.pcc;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements pcc.InterfaceC0027pcc {
    private final pcc<Float, Float> gm;
    private final pcc<Float, Float> oo;
    private final pcc.InterfaceC0027pcc pcc;
    private boolean qf = true;
    private final pcc<Integer, Integer> sf;
    private final pcc<Float, Float> vj;
    private final pcc<Float, Float> wh;

    public gm(pcc.InterfaceC0027pcc interfaceC0027pcc, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.vj.ork orkVar) {
        this.pcc = interfaceC0027pcc;
        pcc<Integer, Integer> pcc = orkVar.pcc().pcc();
        this.sf = pcc;
        pcc.pcc(this);
        pccVar.pcc(pcc);
        pcc<Float, Float> pcc2 = orkVar.sf().pcc();
        this.gm = pcc2;
        pcc2.pcc(this);
        pccVar.pcc(pcc2);
        pcc<Float, Float> pcc3 = orkVar.gm().pcc();
        this.oo = pcc3;
        pcc3.pcc(this);
        pccVar.pcc(pcc3);
        pcc<Float, Float> pcc4 = orkVar.oo().pcc();
        this.vj = pcc4;
        pcc4.pcc(this);
        pccVar.pcc(pcc4);
        pcc<Float, Float> pcc5 = orkVar.vj().pcc();
        this.wh = pcc5;
        pcc5.pcc(this);
        pccVar.pcc(pcc5);
    }

    public void pcc(Paint paint) {
        if (this.qf) {
            this.qf = false;
            double floatValue = this.oo.qf().floatValue() * 0.017453292519943295d;
            float floatValue2 = this.vj.qf().floatValue();
            float sin = ((float) Math.sin(floatValue)) * floatValue2;
            float cos = ((float) Math.cos(floatValue + 3.141592653589793d)) * floatValue2;
            int intValue = this.sf.qf().intValue();
            paint.setShadowLayer(this.wh.qf().floatValue(), sin, cos, Color.argb(Math.round(this.gm.qf().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0027pcc
    public void pcc() {
        this.qf = true;
        this.pcc.pcc();
    }
}

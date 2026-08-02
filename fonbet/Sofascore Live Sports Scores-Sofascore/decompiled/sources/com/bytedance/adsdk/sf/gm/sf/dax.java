package com.bytedance.adsdk.sf.gm.sf;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class dax implements gm {
    private final boolean gm;
    private final String pcc;
    private final List<gm> sf;

    public dax(String str, List<gm> list, boolean z) {
        this.pcc = str;
        this.sf = list;
        this.gm = z;
    }

    public boolean gm() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.oo(vyVar, pccVar, this, qfVar);
    }

    public List<gm> sf() {
        return this.sf;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.pcc + "' Shapes: " + Arrays.toString(this.sf.toArray()) + '}';
    }

    public String pcc() {
        return this.pcc;
    }
}

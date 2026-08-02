package com.bytedance.adsdk.sf.gm.sf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy implements gm {
    private final boolean gm;
    private final String pcc;
    private final pcc sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static pcc pcc(int i) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public vy(String str, pcc pccVar, boolean z) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = z;
    }

    public boolean gm() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.tmg(this);
    }

    public pcc sf() {
        return this.sf;
    }

    public String toString() {
        return "MergePaths{mode=" + this.sf + '}';
    }

    public String pcc() {
        return this.pcc;
    }
}

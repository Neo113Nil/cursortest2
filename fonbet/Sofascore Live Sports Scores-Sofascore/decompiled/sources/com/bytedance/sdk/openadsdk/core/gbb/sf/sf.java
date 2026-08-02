package com.bytedance.sdk.openadsdk.core.gbb.sf;

import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm implements Comparable<sf> {
    private final float pcc;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc {
        private gm.EnumC0072gm gm = gm.EnumC0072gm.TRACKING_URL;
        private boolean oo = false;
        private final String pcc;
        private final float sf;

        public pcc(String str, float f) {
            this.pcc = str;
            this.sf = f;
        }

        public sf pcc() {
            return new sf(this.sf, this.pcc, this.gm, Boolean.valueOf(this.oo));
        }
    }

    private sf(float f, String str, gm.EnumC0072gm enumC0072gm, Boolean bool) {
        super(str, enumC0072gm, bool);
        this.pcc = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.gbb.sf.gm
    public void l_() {
        super.l_();
    }

    @Override // java.lang.Comparable
    /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
    public int compareTo(sf sfVar) {
        if (sfVar == null) {
            return 1;
        }
        float f = this.pcc;
        float f2 = sfVar.pcc;
        if (f > f2) {
            return 1;
        }
        return f < f2 ? -1 : 0;
    }

    public String toString() {
        return super.toString();
    }

    public boolean pcc(float f) {
        return this.pcc <= f && !oo();
    }
}

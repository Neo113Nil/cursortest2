package com.bytedance.adsdk.sf.gm.pcc;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
abstract class gbb<V, O> implements hc<V, O> {
    final List<com.bytedance.adsdk.sf.qf.pcc<V>> pcc;

    public gbb(List<com.bytedance.adsdk.sf.qf.pcc<V>> list) {
        this.pcc = list;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public List<com.bytedance.adsdk.sf.qf.pcc<V>> gm() {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public boolean sf() {
        return this.pcc.isEmpty() || (this.pcc.size() == 1 && this.pcc.get(0).vj());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.pcc.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.pcc.toArray()));
        }
        return sb.toString();
    }
}

package com.bytedance.sdk.component.sf.pcc.pcc.pcc;

import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.kj;
import com.bytedance.sdk.component.sf.pcc.tmg;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm implements kj.pcc {
    int gm = 0;
    List<com.bytedance.sdk.component.sf.pcc.kj> pcc;
    tmg sf;

    public gm(List<com.bytedance.sdk.component.sf.pcc.kj> list, tmg tmgVar) {
        this.pcc = list;
        this.sf = tmgVar;
    }

    @Override // com.bytedance.sdk.component.sf.pcc.kj.pcc
    public gbb pcc(tmg tmgVar) throws IOException {
        this.sf = tmgVar;
        int i = this.gm + 1;
        this.gm = i;
        if (i >= this.pcc.size()) {
            return null;
        }
        return this.pcc.get(this.gm).pcc(this);
    }

    @Override // com.bytedance.sdk.component.sf.pcc.kj.pcc
    public tmg pcc() {
        return this.sf;
    }
}

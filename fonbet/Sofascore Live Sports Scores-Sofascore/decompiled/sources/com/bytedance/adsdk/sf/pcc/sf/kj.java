package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class kj {
    private final List<com.bytedance.adsdk.sf.gm.sf.kj> gm;
    private final List<pcc<com.bytedance.adsdk.sf.gm.sf.gbb, Path>> pcc;
    private final List<pcc<Integer, Integer>> sf;

    public kj(List<com.bytedance.adsdk.sf.gm.sf.kj> list) {
        this.gm = list;
        this.pcc = new ArrayList(list.size());
        this.sf = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.pcc.add(list.get(i).sf().pcc());
            this.sf.add(list.get(i).gm().pcc());
        }
    }

    public List<pcc<Integer, Integer>> gm() {
        return this.sf;
    }

    public List<com.bytedance.adsdk.sf.gm.sf.kj> pcc() {
        return this.gm;
    }

    public List<pcc<com.bytedance.adsdk.sf.gm.sf.gbb, Path>> sf() {
        return this.pcc;
    }
}

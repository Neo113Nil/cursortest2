package com.bytedance.adsdk.ugeno.oo.pcc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements gm {
    private List<oo> pcc = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.oo.pcc.gm
    public void pcc(String str) {
        if (this.pcc.isEmpty()) {
            return;
        }
        Iterator<oo> it = this.pcc.iterator();
        while (it.hasNext()) {
            it.next().pcc(str);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oo.pcc.gm
    public void pcc(oo ooVar) {
        this.pcc.add(ooVar);
    }
}

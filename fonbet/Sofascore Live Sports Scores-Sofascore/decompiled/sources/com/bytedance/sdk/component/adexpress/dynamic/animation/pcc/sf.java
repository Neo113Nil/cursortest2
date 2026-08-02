package com.bytedance.sdk.component.adexpress.dynamic.animation.pcc;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf implements mu {
    List<oo> pcc = new ArrayList();

    public sf(View view, List<com.bytedance.sdk.component.adexpress.dynamic.oo.pcc> list) {
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.oo.pcc> it = list.iterator();
        while (it.hasNext()) {
            oo pcc = gm.pcc().pcc(view, it.next());
            if (pcc != null) {
                this.pcc.add(pcc);
            }
        }
    }

    public void pcc() {
        Iterator<oo> it = this.pcc.iterator();
        while (it.hasNext()) {
            try {
                it.next().gm();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.mu
    public void sf() {
        Iterator<oo> it = this.pcc.iterator();
        while (it.hasNext()) {
            try {
                it.next().sf();
            } catch (Exception unused) {
            }
        }
    }
}

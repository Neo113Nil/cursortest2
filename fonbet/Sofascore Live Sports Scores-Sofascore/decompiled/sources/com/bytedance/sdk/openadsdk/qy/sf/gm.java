package com.bytedance.sdk.openadsdk.qy.sf;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends sf {
    private int oo;

    public gm(Integer num, View view, of ofVar, vj.pcc pccVar) {
        super(num, view, ofVar, 1000, pccVar);
        this.oo = -1;
        sf(view);
    }

    private void sf(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.oo = width * height >= 242500 ? 1 : 0;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public boolean gm() {
        WeakReference<View> weakReference = this.pcc;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.pcc.get();
        if (this.oo == -1) {
            sf(view);
        }
        return wh.pcc(view, this.oo == 1, this.sf.tqg());
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public void oo() {
        super.oo();
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public int wh() {
        of ofVar = this.sf;
        return (ofVar != null && ofVar.xb() && this.sf.hh() == 1) ? 1000 : 100;
    }

    @Override // com.bytedance.sdk.openadsdk.qy.sf.sf
    public void sf(int i) {
    }
}

package com.bytedance.sdk.openadsdk.core.kj.pcc;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.dax;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc extends gm implements com.bytedance.sdk.component.adexpress.dynamic.wh.pcc {
    protected WeakReference<View> pcc;
    private vh sf;

    private void pcc(View view, int i, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray) {
        if (this.sf != null) {
            String str = "";
            try {
                int i2 = com.bytedance.sdk.component.adexpress.dynamic.pcc.fum;
                if (view.getTag(i2) != null) {
                    str = String.valueOf(view.getTag(i2));
                }
            } catch (Exception unused) {
            }
            this.sf.pcc(view, i, new dax.pcc().oo(f).gm(f2).sf(f3).pcc(f4).sf(this.yt).pcc(this.qy).pcc(sparseArray).pcc(this.ye).pcc(str).pcc());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wh.pcc
    public void pcc(View view) {
        this.pcc = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.gm
    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
        pcc(view, ((Integer) view.getTag()).intValue(), f, f2, f3, f4, sparseArray);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.wh.pcc
    public void pcc(vh vhVar) {
        this.sf = vhVar;
    }
}

package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class ork extends com.bytedance.sdk.openadsdk.core.gm.sf {
    public ork(@NonNull Context context, @NonNull com.bytedance.sdk.openadsdk.core.model.of ofVar, @NonNull String str, int i) {
        super(context, ofVar, str, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    @Override // com.bytedance.sdk.openadsdk.core.gm.sf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.sdk.openadsdk.core.model.tmg pcc(float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, long j, long j2, View view, String str, float f5, int i, float f6, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        float f7;
        float f8;
        float f9;
        com.bytedance.sdk.openadsdk.core.model.dax daxVar;
        long j3;
        long j4;
        int[] pcc = rj.pcc(view);
        if (pcc != null && pcc.length == 2) {
            int i3 = pcc[0];
            int i4 = pcc[1];
            if (this.gpj == 0) {
                f = (rj.sf(((com.bytedance.sdk.openadsdk.core.gm.sf) this).oo, f) + i3) - 0.5f;
                f7 = (rj.sf(((com.bytedance.sdk.openadsdk.core.gm.sf) this).oo, f2) + i4) - 0.5f;
                f8 = (rj.sf(((com.bytedance.sdk.openadsdk.core.gm.sf) this).oo, f3) + i3) - 0.5f;
                f9 = (rj.sf(((com.bytedance.sdk.openadsdk.core.gm.sf) this).oo, f4) + i4) - 0.5f;
                daxVar = ((com.bytedance.sdk.openadsdk.core.gm.sf) this).vj;
                if (daxVar == null) {
                    j3 = daxVar.vj;
                    j4 = daxVar.wh;
                } else {
                    j3 = j;
                    j4 = j2;
                }
                this.gpj = 0;
                return new tmg.pcc().wh(f).vj(f7).oo(f8).gm(f9).sf(j3).pcc(j4).pcc(pcc).sf(rj.gm(view)).oo(this.jsj).vj(this.tsz).wh(this.mk).sf(com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2).pcc(sparseArray).pcc(str).pcc(i2).pcc(jSONObject).sf(jSONObject2).pcc();
            }
        }
        f7 = f2;
        f8 = f3;
        f9 = f4;
        daxVar = ((com.bytedance.sdk.openadsdk.core.gm.sf) this).vj;
        if (daxVar == null) {
        }
        this.gpj = 0;
        return new tmg.pcc().wh(f).vj(f7).oo(f8).gm(f9).sf(j3).pcc(j4).pcc(pcc).sf(rj.gm(view)).oo(this.jsj).vj(this.tsz).wh(this.mk).sf(com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2).pcc(sparseArray).pcc(str).pcc(i2).pcc(jSONObject).sf(jSONObject2).pcc();
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.dax daxVar) {
        ((com.bytedance.sdk.openadsdk.core.gm.sf) this).vj = daxVar;
    }
}

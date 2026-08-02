package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vj {
    private final String gm;
    private final Context oo;
    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc;
    private final of sf;
    private final Activity vj;
    private boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3);

        void pcc(String str, JSONObject jSONObject);
    }

    public vj(of ofVar, String str, Context context, Activity activity) {
        this.sf = ofVar;
        this.gm = str;
        this.oo = context;
        this.vj = activity;
    }

    private void oo() {
        if (this.sf.az() == 4) {
            this.pcc = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.oo, this.gm);
        }
        if (this.pcc == null) {
            this.pcc = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.vj, this.gm);
        }
    }

    public com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gm() {
        return this.pcc;
    }

    public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, pcc pccVar) {
        if (this.pcc == null) {
            pccVar.pcc(view, f, f2, f3, f4, sparseArray, i, i2, i3);
            return;
        }
        int id = view.getId();
        if (id == com.bytedance.sdk.openadsdk.utils.nac.qf) {
            pccVar.pcc("click_play_star_level", null);
            return;
        }
        if (id == com.bytedance.sdk.openadsdk.utils.nac.wh) {
            pccVar.pcc("click_play_star_nums", null);
        } else if (id == com.bytedance.sdk.openadsdk.utils.nac.vj) {
            pccVar.pcc("click_play_source", null);
        } else if (id == com.bytedance.sdk.openadsdk.utils.nac.oo) {
            pccVar.pcc("click_play_logo", null);
        }
    }

    public void sf() {
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar = this.pcc;
        if (gmVar != null) {
            gmVar.pcc(this.sf);
        }
    }

    public void pcc() {
        if (this.wh) {
            return;
        }
        this.wh = true;
        oo();
    }
}

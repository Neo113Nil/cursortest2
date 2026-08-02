package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.component.reward.gm.vy;
import com.bytedance.sdk.openadsdk.core.model.of;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf implements vy {
    private of pcc;
    private com.bytedance.sdk.openadsdk.core.gbb.wh sf;

    public qf(of ofVar) {
        this.pcc = ofVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.vy
    public void pcc(int i, JSONObject jSONObject) {
        of ofVar;
        boolean z;
        long j;
        long j2;
        JSONObject optJSONObject;
        if (this.sf == null || (ofVar = this.pcc) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = ofVar.gto();
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc = gto != null ? gto.pcc() : null;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("params")) == null) {
            z = false;
            j = 0;
            j2 = 0;
        } else {
            long optLong = optJSONObject.optLong("video_duration", 0L);
            z = optJSONObject.optBoolean("is_mute", false);
            j2 = optLong;
            j = optJSONObject.optLong("current_position", 0L);
        }
        if (i != 3) {
            switch (i) {
                case 15:
                    int tqg = this.pcc.tqg();
                    of ofVar2 = this.pcc;
                    int quq = tqg == 7 ? ofVar2.quq() : ofVar2.bm();
                    com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.sf;
                    if (whVar != null) {
                        whVar.pcc(quq > 0, quq / 1000);
                        break;
                    }
                    break;
                case 16:
                    com.bytedance.sdk.openadsdk.core.gbb.wh whVar2 = this.sf;
                    if (whVar2 != null) {
                        whVar2.pcc(j2, z);
                        break;
                    }
                    break;
                case 17:
                    com.bytedance.sdk.openadsdk.core.gbb.wh whVar3 = this.sf;
                    if (whVar3 != null) {
                        whVar3.oo();
                        break;
                    }
                    break;
                default:
                    com.bytedance.sdk.openadsdk.core.gbb.wh whVar4 = this.sf;
                    if (whVar4 != null) {
                        whVar4.pcc(i);
                        break;
                    }
                    break;
            }
        } else {
            com.bytedance.sdk.openadsdk.core.gbb.wh whVar5 = this.sf;
            if (whVar5 != null) {
                whVar5.gm();
            }
        }
        pcc(i, pcc, j, j2, z);
    }

    public void pcc(ViewGroup viewGroup) {
        if (!this.pcc.ixc() || viewGroup == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.sf;
        if (whVar == null) {
            whVar = com.bytedance.sdk.openadsdk.core.gbb.wh.pcc();
            this.sf = whVar;
        }
        whVar.pcc(viewGroup, this.pcc);
    }

    private void pcc(int i, com.bytedance.sdk.openadsdk.core.gbb.oo ooVar, long j, long j2, boolean z) {
        if (ooVar == null) {
            return;
        }
        switch (i) {
            case 0:
                ooVar.sf(j);
                break;
            case 1:
                ooVar.gm(j);
                break;
            case 2:
                ooVar.wh(j);
                ooVar.vj(j);
                break;
            case 3:
                ooVar.pcc(j);
                break;
            case 6:
            case 7:
            case 8:
            case 15:
                ooVar.pcc(i, j, j2);
                break;
            case 9:
                ooVar.oo(j);
                break;
            case 12:
                if (z) {
                    ooVar.kj(j);
                    break;
                } else {
                    ooVar.vy(j);
                    break;
                }
            case 13:
                ooVar.qf(j);
                break;
            case 14:
                ooVar.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
                break;
        }
    }
}

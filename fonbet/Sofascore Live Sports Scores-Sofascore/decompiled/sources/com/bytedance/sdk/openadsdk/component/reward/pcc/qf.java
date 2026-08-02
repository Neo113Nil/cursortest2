package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {

    @NonNull
    private sf pcc;
    private boolean sf;

    public qf(sf sfVar) {
        this.pcc = sfVar;
    }

    private void sf() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        sf sfVar = this.pcc;
        Activity activity = sfVar.rnn;
        of ofVar = sfVar.sf;
        String str = sfVar.vj;
        com.bytedance.sdk.openadsdk.core.ork.ork orkVar = new com.bytedance.sdk.openadsdk.core.ork.ork(activity, ofVar, str, kun.pcc(str)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        orkVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.4
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                qf.this.pcc.tsx.pq();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        sf sfVar2 = this.pcc;
        if (sfVar2.gdh && (kjVar = sfVar2.ywp) != null) {
            int i = kjVar.vh + 1;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i);
                hashMap.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
        }
        orkVar.pcc(hashMap);
        sf sfVar3 = this.pcc;
        Activity activity2 = sfVar3.rnn;
        of ofVar2 = sfVar3.sf;
        String str2 = sfVar3.vj;
        com.bytedance.sdk.openadsdk.core.ork.vy vyVar = new com.bytedance.sdk.openadsdk.core.ork.vy(activity2, ofVar2, str2, kun.pcc(str2)) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.5
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(qf.this.pcc.fum.hc()));
                if (qf.this.pcc.ywp != null) {
                    qf.this.pcc.ywp.pcc(hashMap2, f, f2);
                }
                pcc(hashMap2);
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
                qf.this.pcc.fum.iv();
            }
        };
        vyVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i2) {
                qf.this.pcc.tsx.pq();
            }
        });
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click_scence", 1);
        vyVar.pcc(hashMap2);
        this.pcc.yt.pcc(orkVar, vyVar);
    }

    public void pcc(float[] fArr) {
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar;
        this.sf = true;
        Arrays.toString(fArr);
        AdSlot build = new AdSlot.Builder().setCodeId(String.valueOf(this.pcc.sf.kot())).setExpressViewAcceptedSize(fArr[0], fArr[1]).build();
        sf sfVar = this.pcc;
        sfVar.yt.pcc(build, sfVar.mu.dax);
        sf sfVar2 = this.pcc;
        hc hcVar = sfVar2.zti;
        if (hcVar != null && (vyVar = sfVar2.yt) != null) {
            hcVar.pcc(vyVar.pcc());
        }
        this.pcc.yt.pcc(new com.bytedance.sdk.openadsdk.core.ork.dax() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public long gm() {
                return qf.this.pcc.fum.gbb();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public long oo() {
                return qf.this.pcc.fum.pcc();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc(int i) {
                if (i != 1) {
                    if (i == 2) {
                        qf.this.pcc.fum.nn();
                        return;
                    }
                    if (i == 3) {
                        qf.this.pcc.fum.pcc(qf.this.pcc.tsx);
                        return;
                    } else if (i == 4) {
                        qf.this.pcc.fum.gpj();
                        return;
                    } else if (i != 5) {
                        return;
                    }
                }
                if (qf.this.pcc.fum.wh() || qf.this.pcc.fum.vy()) {
                    return;
                }
                qf.this.pcc.tsx.pcc(0L, false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void sf() {
                if (qf.this.pcc.mu == null || qf.this.pcc.mu.ork() == null) {
                    return;
                }
                qf.this.pcc.mu.ork().performClick();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public int vj() {
                if (qf.this.pcc.yt.gm()) {
                    return 4;
                }
                if (qf.this.pcc.yt.oo()) {
                    return 5;
                }
                if (qf.this.pcc.fum.ork()) {
                    return 1;
                }
                if (qf.this.pcc.fum.wh()) {
                    return 2;
                }
                qf.this.pcc.fum.vy();
                return 3;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void wh() {
                qf.this.pcc.mk.pcc(qf.this.pcc.ew);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public boolean sf(JSONObject jSONObject) {
                return com.bytedance.sdk.openadsdk.component.reward.sf.pcc(qf.this.pcc);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void sf(int i) {
                qf.this.pcc.hpk = i;
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc() {
                qf.this.pcc.zti.oo();
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc(String str, JSONObject jSONObject) {
                if (qf.this.pcc == null || qf.this.pcc.tsx == null) {
                    return;
                }
                qf.this.pcc.tsx.pcc(str, jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public boolean pcc(JSONObject jSONObject) {
                if (qf.this.pcc == null || qf.this.pcc.fum == null) {
                    return false;
                }
                return qf.this.pcc.fum.pcc(jSONObject);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc(boolean z, String str) {
                if (qf.this.pcc.xb != z) {
                    qf.this.pcc.zti.pcc(str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc(int i, String str) {
                qf.this.pcc.fum.pcc(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.ork.dax
            public void pcc(int i, com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
                qf.this.pcc.mu.pcc(i, gbbVar);
            }
        });
        this.pcc.yt.pcc(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.2
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
                if (qf.this.pcc == null || qf.this.pcc.sf == null || !qf.this.pcc.sf.uxz()) {
                    return;
                }
                qf.this.pcc.tsx.pq();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                boolean z = -1024 == i;
                qf.this.pcc.pcc(i, str, z ? 1002 : 1001);
                qf.this.pcc.jsj.pcc();
                if (z) {
                    return;
                }
                if (!qf.this.pcc.sf.nmd()) {
                    qf.this.pcc.ye.pcc(true);
                    qf.this.pcc.ye.vj();
                }
                qf.this.pcc.yt.vj().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.qf.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        qf.this.pcc.ew.pcc(false, false, false, 90);
                    }
                });
                qf.this.pcc.mu.gbb();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                lo loVar;
                if (!qf.this.pcc.sf.nmd()) {
                    boolean vy = qf.this.pcc.yt.vy();
                    qf qfVar = qf.this;
                    if (vy) {
                        qfVar.pcc.ew.pcc(true);
                        qf.this.pcc.fum.oo(false);
                    } else {
                        qfVar.pcc.fum.oo(true);
                    }
                    qf.this.pcc.mu.pcc(8);
                    qf.this.pcc.ye.pcc(true);
                    qf.this.pcc.ye.vj();
                    boolean vy2 = qf.this.pcc.yt.vy();
                    qf qfVar2 = qf.this;
                    if (vy2) {
                        qfVar2.pcc.yt.sf().setBackgroundColor(-16777216);
                        qf.this.pcc.ew.pcc(qf.this.pcc.mu.wh());
                    } else if (qfVar2.pcc.sf.kez() != null && qf.this.pcc.ew.pcc()) {
                        qf.this.pcc.fmh = true;
                    }
                }
                qf.this.pcc.ew.of();
                if (lo.gm(qf.this.pcc.sf) && (loVar = qf.this.pcc.mu.dax) != null) {
                    loVar.gm();
                }
                qf.this.pcc.mu.gbb();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }
        });
        sf();
        FrameLayout.LayoutParams layoutParams = this.pcc.sf.nmd() ? new FrameLayout.LayoutParams(-1, -1) : com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.pcc.sf.rt()) ? new FrameLayout.LayoutParams(-1, -1) : lo.gm(this.pcc.sf) ? new FrameLayout.LayoutParams(-1, -1) : new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.pcc.mu.wh().addView(this.pcc.yt.pcc(), layoutParams);
        if (!this.pcc.yt.vy()) {
            this.pcc.ew.pcc(false);
        }
        this.pcc.yt.gbb();
    }

    public void pcc(of ofVar) {
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = this.pcc.yt;
        if (vyVar != null) {
            com.bytedance.sdk.openadsdk.component.reward.view.gm pcc = vyVar.pcc();
            ViewParent parent = pcc.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(pcc);
            }
            this.pcc.mu.wh().addView(pcc);
            if (!this.pcc.yt.vy()) {
                this.pcc.ew.pcc(false);
            }
            this.pcc.yt.pcc(ofVar);
            sf();
        }
    }

    public boolean pcc() {
        return this.sf;
    }

    public void pcc(@NonNull sf sfVar) {
        this.pcc = sfVar;
    }
}

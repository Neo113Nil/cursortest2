package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo {
    private TTAdDislikeToast gm;
    private final sf pcc;
    private com.bytedance.sdk.openadsdk.common.nac sf;

    public oo(sf sfVar) {
        this.pcc = sfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    private void sf(final com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (this.sf == null) {
            sf sfVar2 = this.pcc;
            com.bytedance.sdk.openadsdk.common.nac nacVar = new com.bytedance.sdk.openadsdk.common.nac(sfVar2.rnn, sfVar2.sf);
            this.sf = nacVar;
            nacVar.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.oo.1
                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(View view) {
                    oo.this.pcc.ork.set(true);
                    String str = "landing_page";
                    if (!lo.sf(oo.this.pcc.sf) && !lo.oo(oo.this.pcc.sf) && !lo.qf(oo.this.pcc.sf) && !lo.kj(oo.this.pcc.sf)) {
                        if (!oo.this.pcc.vy.get()) {
                            str = "video_player";
                        } else if (atb.sf(oo.this.pcc.sf)) {
                            str = "playable";
                        } else if (!oo.this.pcc.sf.fy()) {
                            str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                        }
                    }
                    oo.this.sf.setDislikeSource(str);
                    if (oo.this.pcc.fum.vj) {
                        if (oo.this.pcc.yt != null) {
                            oo.this.pcc.yt.pcc(8, false);
                            return;
                        }
                        return;
                    }
                    sfVar.gbb();
                    if (oo.this.pcc.fum.wh()) {
                        oo.this.pcc.fum.tz();
                    }
                    if (oo.this.gm()) {
                        oo.this.pcc.ywp.rj().sf(oo.this.pcc.ywp, 2);
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(oo.this.pcc.sf, 8);
                    oo.this.pcc.of.wh();
                    oo.this.pcc.of.kj();
                    if (oo.this.pcc.gh != null) {
                        oo.this.pcc.gh.sf();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void sf(View view) {
                    oo.this.pcc.ork.set(false);
                    boolean z = oo.this.pcc.fum.vj;
                    oo ooVar = oo.this;
                    if (z) {
                        if (ooVar.pcc.yt != null) {
                            oo.this.pcc.yt.pcc(0, true);
                            return;
                        }
                        return;
                    }
                    ooVar.pcc.fum.pcc(sfVar);
                    if (oo.this.pcc.fum.vy()) {
                        oo.this.pcc.fum.fum();
                    }
                    if (oo.this.gm()) {
                        oo.this.pcc.ywp.rj().sf(oo.this.pcc.ywp, 1);
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(oo.this.pcc.sf, 4);
                    oo.this.pcc.of.pcc(0);
                    oo.this.pcc.of.vj();
                    if (oo.this.pcc.gh != null) {
                        oo.this.pcc.gh.pcc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(FilterWord filterWord) {
                    if (oo.this.pcc.vh.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    oo.this.pcc.vh.set(true);
                    if (oo.this.pcc.ywp != null) {
                        oo.this.pcc.ywp.rj().gm(true);
                    }
                    oo.this.oo();
                }
            });
            ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.sf);
        }
        if (this.gm == null) {
            this.gm = new TTAdDislikeToast(this.pcc.rnn);
            ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.gm);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        if (this.pcc.rnn.isFinishing()) {
            return;
        }
        sf sfVar2 = this.pcc;
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar2 = sfVar2.ywp;
        boolean z = (kjVar2 instanceof com.bytedance.sdk.openadsdk.activity.single.vj) && ((com.bytedance.sdk.openadsdk.activity.single.vj) kjVar2).pcc;
        if (sfVar2.vh.get() || !((kjVar = this.pcc.ywp) == null || !kjVar.rj().tsz() || z)) {
            if (this.gm == null) {
                this.gm = new TTAdDislikeToast(this.pcc.rnn);
                ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.gm);
            }
            this.gm.show(TTAdDislikeToast.getDislikeTip());
            this.pcc.vh.set(true);
            return;
        }
        if (this.sf == null) {
            try {
                sf(sfVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.nac nacVar = this.sf;
        if (nacVar != null) {
            nacVar.pcc();
        }
        sf sfVar3 = this.pcc;
        com.bytedance.sdk.openadsdk.component.reward.view.vy vyVar = sfVar3.yt;
        if (vyVar != null) {
            com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(sfVar3.sf, vyVar.vh());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gm() {
        return this.pcc.bbd;
    }

    public void sf() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    public void pcc() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }
}

package com.bytedance.sdk.openadsdk.pcc.sf.pcc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.core.hc.vj;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.pcc.sf.kj;
import com.bytedance.sdk.openadsdk.utils.rj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends kj {
    protected final Context kj;
    protected fum ork;
    private boolean tmg;
    protected String vh;
    protected AdSlot vy;

    public gm(@NonNull Context context, of ofVar, AdSlot adSlot) {
        super(context, ofVar, 5, true);
        this.vh = "embeded_ad";
        this.tmg = false;
        this.sf.lo(1);
        this.oo.pcc(this);
        this.kj = context;
        this.vy = adSlot;
        pcc();
        sf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(float f, float f2) {
        fum fumVar = this.ork;
        if (fumVar != null && vj.pcc(fumVar.getDynamicShowType())) {
            ViewGroup.LayoutParams layoutParams = this.ork.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -1;
            }
            this.ork.setLayoutParams(layoutParams);
            return;
        }
        int sf = rj.sf(this.kj, f);
        int sf2 = rj.sf(this.kj, f2);
        ViewGroup.LayoutParams layoutParams2 = this.ork.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new ViewGroup.LayoutParams(sf, sf2);
        } else {
            layoutParams2.width = sf;
            layoutParams2.height = sf2;
        }
        this.ork.setLayoutParams(layoutParams2);
    }

    private void sf() {
        fum fumVar = this.ork;
        if (fumVar != null) {
            fumVar.setBackupListener(new com.bytedance.sdk.component.adexpress.sf.gm() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm.1
                @Override // com.bytedance.sdk.component.adexpress.sf.gm
                public boolean pcc(ViewGroup viewGroup, int i) {
                    pcc pccVar = new pcc(gm.this.ork.getContext());
                    pccVar.setExtraFuncationHelper(((kj) gm.this).oo);
                    pccVar.pcc(gm.this.ork);
                    return true;
                }
            });
        }
    }

    public void gm() {
        fum fumVar = this.ork;
        if (fumVar != null) {
            fumVar.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderSuccess(View view, float f, float f2) {
                    boolean of = gm.this.ork.of();
                    gm gmVar = gm.this;
                    if (!of) {
                        gmVar.pcc(f, f2);
                        if (gm.this.tmg) {
                            gm.this.ork.gpj();
                            return;
                        }
                        return;
                    }
                    Context context = gmVar.kj;
                    of ofVar = ((kj) gmVar).sf;
                    gm gmVar2 = gm.this;
                    com.bytedance.sdk.openadsdk.pcc.sf.sf sfVar = new com.bytedance.sdk.openadsdk.pcc.sf.sf(context, ofVar, 5, gmVar2.vy, ((kj) gmVar2).oo, ((kj) gm.this).pcc);
                    gm gmVar3 = gm.this;
                    if (gmVar3 instanceof sf) {
                        sfVar.pcc(((lo) gmVar3.oo()).getVideoAdListener());
                    }
                    ((kj) gm.this).oo.pcc((com.bytedance.sdk.openadsdk.core.gm.pcc) gm.this.ork.getClickCreativeListener());
                    PAGMediaView vy = ((kj) gm.this).oo.vy();
                    if (vy == null) {
                        vy = new PAGMediaView(gm.this.kj);
                    }
                    gm.this.ork.addView(vy);
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
                public void onAdClicked() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdDismissed() {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onAdShow(View view, int i) {
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
                public void onRenderFail(View view, String str, int i) {
                }
            });
        }
    }

    public void vj() {
        fum fumVar = this.ork;
        if (fumVar != null) {
            fumVar.fum();
        }
    }

    public fum oo() {
        return this.ork;
    }

    public void pcc() {
        this.ork = new fum(this.kj, this.sf, this.vy, this.vh);
        gm();
    }

    public void pcc(boolean z) {
        this.tmg = z;
    }
}

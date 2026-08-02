package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.qy.sf.vj;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends oo {
    private com.bytedance.sdk.openadsdk.pcc.pcc.sf kj;
    private int ork;
    private int vy;

    public gm(@NonNull Context context, of ofVar, AdSlot adSlot, boolean z) {
        super(context, ofVar, adSlot, z);
        this.vy = 1;
        this.ork = -1;
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc getVideoModel() {
        fum fumVar = this.sf;
        if (fumVar != null) {
            return ((lo) fumVar).getVideoModel();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.oo.oo
    public void gm() {
        lo loVar = new lo(this.pcc, this.gm, this.oo, this.wh, this.qf) { // from class: com.bytedance.sdk.openadsdk.core.oo.gm.1
            @Override // com.bytedance.sdk.openadsdk.core.ork.fum
            public vj.pcc gm(int i) {
                return gm.this.pcc(super.gm(i));
            }
        };
        this.sf = loVar;
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController = loVar.getVideoController();
        if (videoController != null) {
            videoController.oo(this.vy);
        }
        addView(this.sf, new ViewGroup.LayoutParams(-1, -1));
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.vj;
        if (pAGBannerAdWrapperListener != null) {
            setExpressInteractionListener(pAGBannerAdWrapperListener);
        }
        fum fumVar = this.sf;
        if (fumVar != null) {
            ((lo) fumVar).setVideoAdListener(new com.bytedance.sdk.openadsdk.pcc.sf.gm() { // from class: com.bytedance.sdk.openadsdk.core.oo.gm.2
                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void gm(PAGNativeAd pAGNativeAd) {
                    if (gm.this.kj != null) {
                        gm.this.kj.pcc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void pcc(PAGNativeAd pAGNativeAd) {
                    int i = gm.this.ork;
                    gm gmVar = gm.this;
                    if (i == 3) {
                        gmVar.pcc(gmVar.kj);
                    } else if (gmVar.ork == 2) {
                        gm.this.pcc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void sf(PAGNativeAd pAGNativeAd) {
                }

                @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
                public void pcc(int i, int i2) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.oo.oo
    public void oo() {
        com.bytedance.sdk.openadsdk.core.jr.sf.gm videoController;
        fum fumVar = this.sf;
        if ((fumVar instanceof lo) && (videoController = ((lo) fumVar).getVideoController()) != null) {
            this.vy = videoController.tsx();
        }
        super.oo();
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.pcc.sf sfVar) {
        fum fumVar = this.sf;
        if (fumVar != null) {
            ((lo) fumVar).nac();
            this.kj = sfVar;
            this.ork = 3;
        }
    }

    public void sf() {
        fum fumVar = this.sf;
        if (fumVar != null) {
            ((lo) fumVar).lu();
        }
    }

    public void pcc() {
        fum fumVar = this.sf;
        if (fumVar != null) {
            ((lo) fumVar).dax();
            this.ork = 2;
        }
    }
}

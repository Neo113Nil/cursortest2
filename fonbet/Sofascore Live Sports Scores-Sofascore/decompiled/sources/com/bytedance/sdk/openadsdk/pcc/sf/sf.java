package com.bytedance.sdk.openadsdk.pcc.sf;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.nac;
import com.bytedance.sdk.openadsdk.gpj.gm.pcc;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import defpackage.cem;
import defpackage.zdm;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends kj implements zdm, cem, pcc.InterfaceC0111pcc {
    private long hc;
    private gm kj;
    private boolean ork;
    private AdSlot tmg;
    private boolean vh;
    private final com.bytedance.sdk.openadsdk.gpj.gm.pcc vy;

    public sf(@NonNull Context context, @NonNull of ofVar, int i, AdSlot adSlot, pcc pccVar, nac nacVar) {
        super(context, ofVar, i, false);
        this.ork = false;
        this.vh = true;
        this.oo = pccVar;
        this.pcc = nacVar;
        this.vj = i;
        this.tmg = adSlot;
        this.vy = new com.bytedance.sdk.openadsdk.gpj.gm.pcc();
        pcc(this.wh);
        pcc("embeded_ad");
        pccVar.pcc(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (com.bytedance.sdk.openadsdk.utils.kun.wh(r0) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(int i) {
        int sf = lu.oo().sf(i);
        int gm = com.bytedance.sdk.component.utils.lu.gm(lu.pcc());
        if (3 == sf) {
            this.ork = false;
            this.vh = false;
        } else {
            if (1 == sf && kun.oo(gm)) {
                this.ork = false;
            } else if (2 == sf) {
                if (kun.vj(gm) || kun.oo(gm) || kun.wh(gm)) {
                    this.ork = false;
                }
            } else if (4 == sf) {
                this.ork = true;
            } else if (5 == sf) {
                if (!kun.oo(gm)) {
                }
            }
            this.vh = true;
        }
        pcc pccVar = this.oo;
        if (pccVar != null) {
            pccVar.pcc(this.ork);
        }
    }

    @Override // defpackage.zdm
    public void g_() {
        gm gmVar = this.kj;
        if (gmVar != null) {
            gmVar.pcc(this);
        }
    }

    @Override // defpackage.zdm
    public void h_() {
        gm gmVar = this.kj;
        if (gmVar != null) {
            gmVar.sf(this);
        }
    }

    @Override // defpackage.zdm
    public void j_() {
        gm gmVar = this.kj;
        if (gmVar != null) {
            gmVar.gm(this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.kj, com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd
    public void showPrivacyActivity() {
        pcc pccVar = this.oo;
        if (pccVar != null) {
            pccVar.tmg();
        }
    }

    public View vj() {
        com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar;
        of ofVar = this.sf;
        if (ofVar != null && this.gm != null) {
            if (of.vj(ofVar)) {
                try {
                    whVar = new com.bytedance.sdk.openadsdk.core.jr.sf.wh(this.gm, this.sf, this.pcc.pcc());
                    of ofVar2 = this.sf;
                    if (ofVar2 != null && ofVar2.on()) {
                        com.bytedance.sdk.openadsdk.core.gbb.wh pcc = whVar.pcc((List<Pair<View, FriendlyObstructionPurpose>>) null);
                        pcc pccVar = this.oo;
                        if (pccVar != null) {
                            pccVar.pcc(pcc);
                        }
                    }
                    this.pcc.pcc(whVar.getNativeVideoController());
                    pcc pccVar2 = this.oo;
                    if (pccVar2 != null) {
                        pccVar2.pcc(whVar);
                    }
                    whVar.setVideoAdClickListenerTTNativeAd(this);
                    whVar.setAdCreativeClickListener(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.sf.1
                        @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
                        public void pcc(View view, int i) {
                            nac nacVar = sf.this.pcc;
                            if (nacVar != null) {
                                nacVar.pcc(view, i);
                            }
                        }
                    });
                    whVar.setControllerStatusCallBack(new wh.sf() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.sf.2
                        @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.sf
                        public void pcc(boolean z, long j, long j2, long j3, boolean z2) {
                            sf.this.vy.pcc = z;
                            sf.this.vy.vj = j;
                            sf.this.vy.wh = j2;
                            sf.this.vy.qf = j3;
                            sf.this.vy.oo = z2;
                        }
                    });
                    whVar.setVideoAdLoadListener(this);
                    whVar.setVideoAdInteractionListener(this);
                    if (5 == this.vj) {
                        whVar.setIsAutoPlay(this.ork ? this.tmg.isAutoPlay() : this.vh);
                    } else {
                        whVar.setIsAutoPlay(this.vh);
                    }
                    whVar.pcc(lu.oo().gm(String.valueOf(this.wh)), "feedGetAdView");
                } catch (Exception e) {
                    ApmHelper.reportCustomError("", "getAdView null", e);
                }
                if (!of.vj(this.sf) && whVar != null && whVar.pcc(0L, true, false)) {
                    return whVar;
                }
                ApmHelper.reportCustomError(this.sf.ct() + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + whVar, "getAdView null", new RuntimeException());
            }
            whVar = null;
            if (!of.vj(this.sf)) {
            }
            ApmHelper.reportCustomError(this.sf.ct() + BlazeDataSourcePersonalizedType.STRING_SEPARATOR + whVar, "getAdView null", new RuntimeException());
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.gpj.gm.pcc.InterfaceC0111pcc
    public com.bytedance.sdk.openadsdk.gpj.gm.pcc wh() {
        return this.vy;
    }

    @Override // defpackage.zdm
    public void i_() {
    }

    public sf(@NonNull Context context, @NonNull of ofVar, int i, AdSlot adSlot) {
        super(context, ofVar, i, true);
        this.ork = false;
        this.vh = true;
        this.vj = i;
        this.tmg = adSlot;
        this.vy = new com.bytedance.sdk.openadsdk.gpj.gm.pcc();
        pcc(this.wh);
        pcc("embeded_ad");
        this.oo.pcc(this);
    }

    public void pcc(gm gmVar) {
        this.kj = gmVar;
    }

    @Override // defpackage.cem
    public void pcc(int i, int i2) {
        gm gmVar = this.kj;
        if (gmVar != null) {
            gmVar.pcc(i, i2);
        }
    }

    @Override // defpackage.zdm
    public void pcc(long j, long j2) {
        this.hc = j;
    }

    @Override // com.bytedance.sdk.openadsdk.pcc.sf.kj
    public void pcc(String str) {
        super.pcc(str);
    }
}

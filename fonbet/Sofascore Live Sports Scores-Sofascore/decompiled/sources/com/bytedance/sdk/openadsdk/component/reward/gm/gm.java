package com.bytedance.sdk.openadsdk.component.reward.gm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.activity.TTFullWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTFullScreenExpressVideoActivity;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm extends sf {
    private static com.bytedance.sdk.openadsdk.pcc.gm.sf gpj;
    private long lo;
    private com.bytedance.sdk.openadsdk.pcc.gm.sf lu;

    public gm(Activity activity, Context context, of ofVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, ofVar, str, viewGroup, str2);
        this.lo = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lu() {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        of ofVar = this.vj;
        if (ofVar == null || (oo = ofVar.oo()) == null) {
            return;
        }
        List<of> vj = oo.vj();
        if (vj != null) {
            Iterator<of> it = vj.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.sf(this.hc, it.next());
            }
        }
        of ofVar2 = this.vj;
        if (ofVar2 == null || (ofVar2.kez() == null && this.vj.by() == null)) {
            ork.pcc(this.vj, "show_ad_fail", this.wh, "video_or_image_empty");
            return;
        }
        this.vj.gpj(1);
        ork.pcc(this.vj, "show_start", this.wh, (String) null);
        Context context = this.oo;
        if (context == null) {
            context = this.hc;
        }
        if (context == null) {
            context = lu.pcc();
        }
        Intent intent = new Intent(context, (Class<?>) TTFullScreenExpressVideoActivity.class);
        if (lo.vj(this.vj)) {
            this.vj.pcc(7, 8);
            if (this.vj.kez() != null) {
                this.vj.kez().h = "";
            }
            intent.putExtra("extra_conversion_link", 5);
        }
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.dax);
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, this.oo, this.gm, oo, this.pcc);
        if (this.dax) {
            atb.pcc().pcc(this.pcc, (String) this.lu);
        } else {
            atb.pcc().pcc(this.lu);
        }
        this.lu = null;
        intent.putExtra("back_up", true);
        final boolean z = com.bytedance.sdk.openadsdk.yt.vj.pcc("start_activity_async", 0) == 1;
        if (z) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("start_activity");
                    pccVar.oo("fullscreen_interstitial_ad");
                    return pccVar;
                }
            });
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, new sf.InterfaceC0055sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.3
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc() {
                if (z) {
                    com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.3.1
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("start_activity");
                            pccVar.oo("fullscreen_interstitial_ad");
                            return pccVar;
                        }
                    });
                    final long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    com.bytedance.sdk.openadsdk.dax.oo.pcc("start_activity_action", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.3.2
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(IronSourceConstants.EVENTS_DURATION, elapsedRealtime2);
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("start_activity_action").sf(jSONObject.toString());
                        }
                    });
                }
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0055sf
            public void pcc(Throwable th) {
                gm gmVar = gm.this;
                ork.pcc(gmVar.vj, "show_ad_fail", gmVar.wh, "activity_start_fail");
                if (z) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.3.3
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("start_activity");
                            pccVar.oo("fullscreen_interstitial_ad");
                            return pccVar;
                        }
                    });
                }
            }
        }, true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void dax() {
        toString();
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.lu;
        if (sfVar != null) {
            sfVar.sf();
        } else {
            ork.pcc(this.vj, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, 0);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.dax) {
            return;
        }
        gpj = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void gm(Bundle bundle) {
        super.gm(bundle);
        if (this.dax) {
            this.lu = (com.bytedance.sdk.openadsdk.pcc.gm.sf) atb.pcc().pcc(this.pcc, com.bytedance.sdk.openadsdk.pcc.gm.sf.class);
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.gm.sf gm = atb.pcc().gm();
        this.lu = gm;
        if (gm != null || bundle == null) {
            return;
        }
        this.lu = gpj;
        gpj = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void hc() {
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.lu;
        if (sfVar != null) {
            sfVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void kj() {
        super.kj();
        if (this.gbb.get()) {
            nac();
        }
        pcc(this.oo.isFinishing(), this.oo.isChangingConfigurations());
        if (this.dax) {
            return;
        }
        this.lu = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
        super.onRenderFail(view, str, i);
        jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.gm.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = gm.this.ork;
                if (pccVar != null) {
                    pccVar.vj();
                }
                gm.this.lu();
                Activity activity = gm.this.oo;
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                Activity activity2 = gm.this.oo;
                if (activity2 instanceof TTFullWebActivity) {
                    ((TTFullWebActivity) activity2).sf();
                }
            }
        });
    }

    public void pcc(boolean z, boolean z2) {
        if (!TextUtils.isEmpty(this.pcc)) {
            atb.pcc().pcc(this.pcc, z, z2);
        }
        if (!this.dax || TextUtils.isEmpty(this.pcc)) {
            return;
        }
        atb.pcc().pcc(this.pcc, z, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void sf(Bundle bundle) {
        if (!this.dax) {
            gpj = this.lu;
        }
        super.sf(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void tmg() {
        com.bytedance.sdk.openadsdk.pcc.gm.sf sfVar = this.lu;
        if (sfVar != null) {
            sfVar.pcc();
        } else {
            ork.pcc(this.vj, "show", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void pcc(boolean z, int i, String str, int i2, String str2, int i3) {
    }
}

package com.bytedance.sdk.openadsdk.component.reward.gm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.jr;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.yt;
import com.bytedance.sdk.openadsdk.utils.dax;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.UnityAdsConstants;
import defpackage.ljg;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class sf implements tsz.pcc, PAGExpressAdWrapperListener, pcc, com.bytedance.sdk.openadsdk.component.reward.gm.pcc.vj {
    protected boolean dax;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc fum;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj gpj;
    protected Context hc;
    protected long jr;
    protected com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo kj;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.qf lo;
    protected boolean nac;
    protected Activity oo;
    protected com.bytedance.sdk.openadsdk.component.reward.pcc.pcc ork;
    protected String pcc;
    public jr qf;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm qy;
    public boolean sf;
    private com.bytedance.sdk.openadsdk.core.wh.gm tz;
    protected com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm vh;
    protected of vj;
    protected tmg vy;
    protected String wh;
    private ViewGroup yt;
    private final AtomicBoolean lu = new AtomicBoolean(false);
    protected boolean gm = false;
    private boolean of = false;
    protected final tsz tmg = new tsz(Looper.getMainLooper(), this);
    protected AtomicBoolean gbb = new AtomicBoolean(false);
    private AtomicBoolean jsj = new AtomicBoolean(false);
    private AtomicBoolean tsz = new AtomicBoolean(false);

    public sf(Activity activity, Context context, of ofVar, String str, ViewGroup viewGroup, String str2) {
        this.oo = activity;
        this.vj = ofVar;
        this.wh = str;
        this.hc = context;
        this.yt = viewGroup;
        this.kj = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo(this, activity, ofVar, str);
        this.qf = new jr(viewGroup, ofVar, str, activity, activity.getApplicationContext(), this);
        this.vy = new tmg(activity, ofVar, ofVar.ial(), com.bytedance.sdk.openadsdk.utils.sf.pcc(), this.sf, null);
        this.gpj = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj(this, activity, ofVar);
        this.lo = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.qf(ofVar);
        this.fum = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc(viewGroup, activity);
        this.ork = new com.bytedance.sdk.openadsdk.component.reward.pcc.pcc(activity, ofVar, ofVar.ial(), str);
        this.pcc = str2;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(activity);
        this.tz = gmVar;
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar2 = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm(activity, ofVar, gmVar, viewGroup, this.qf);
        this.vh = gmVar2;
        gmVar2.pcc(this);
        this.kj.pcc(this);
        this.qf.pcc((PAGExpressAdWrapperListener) this);
        this.ork.pcc(pcc(ofVar));
        this.vy.pcc(ofVar.gqd().getDurationSlotType() == 7);
    }

    private void gpj() {
        if (this.kj != null) {
            JSONObject jSONObject = new JSONObject();
            jr jrVar = this.qf;
            if (jrVar != null && jrVar.sf() != null) {
                jSONObject = this.qf.sf().pcc(jSONObject, this.vj);
            }
            this.jr = System.currentTimeMillis();
            this.kj.pcc(jSONObject);
        }
    }

    private void lo() {
        lo.pcc("BaseManagerBundle", "removeLoadingPage: ");
        try {
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
            if (pccVar != null) {
                pccVar.oo();
            }
        } catch (Throwable th) {
            lo.pcc("BaseManagerBundle", "removeLoadingPage: ", th);
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar2 = this.ork;
            if (pccVar2 == null || pccVar2.wh() == null) {
                return;
            }
            this.ork.wh().setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void lu() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
        if (pccVar == null) {
            return;
        }
        pccVar.pcc();
        if (this.ork.wh() != null) {
            this.yt.addView(this.ork.wh(), new FrameLayout.LayoutParams(-1, -1));
            this.ork.gm();
        }
    }

    public abstract void dax();

    public void gm(Bundle bundle) {
        if (bundle != null) {
            this.dax = bundle.getBoolean("enable_new_arch", false);
            return;
        }
        Activity activity = this.oo;
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        this.dax = this.oo.getIntent().getBooleanExtra("enable_new_arch", false);
    }

    public abstract void hc();

    public boolean jr() {
        return this.gm;
    }

    public void kj() {
        lo();
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo ooVar = this.kj;
        if (ooVar != null && ooVar.pcc() && this.kj.sf() > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.kj.sf());
            jr jrVar = this.qf;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, this.vj, this.wh, (jrVar == null || jrVar.sf() == null) ? null : this.qf.sf().getAdShowTime());
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj vjVar = this.gpj;
        if (vjVar != null) {
            vjVar.pcc();
        }
        jr jrVar2 = this.qf;
        if (jrVar2 != null) {
            jrVar2.qf();
        }
        dax.pcc();
    }

    public void nac() {
        Activity activity;
        if (com.bytedance.sdk.openadsdk.yt.vj.vy() && (activity = this.oo) != null && activity.isChangingConfigurations()) {
            lo.pcc("BVA", "callback close is invoke by config change.");
            return;
        }
        if (this.nac) {
            lo.pcc("BVA", "invoke callback onAdClose has already been called ");
            return;
        }
        this.nac = true;
        of ofVar = this.vj;
        if (ofVar != null && !ofVar.iv()) {
            long vy = this.vj.vy();
            if (vy > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                if (elapsedRealtime > 0) {
                    this.vj.sf(elapsedRealtime);
                }
            }
            if (this.kj != null) {
                JSONObject jSONObject = new JSONObject();
                jr jrVar = this.qf;
                if (jrVar != null && jrVar.sf() != null) {
                    jSONObject = this.qf.sf().pcc(jSONObject, this.vj);
                }
                this.jr = System.currentTimeMillis();
                this.kj.pcc(jSONObject);
            }
        }
        dax();
    }

    public void onRenderFail(View view, String str, int i) {
        this.gbb.set(false);
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f, float f2) {
        this.gbb.set(true);
        if (!com.bytedance.sdk.openadsdk.core.model.lo.vj(this.vj)) {
            gpj();
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
            if (pccVar != null) {
                pccVar.vj();
                this.ork.oo();
            }
        } else if (!this.tsz.get() || this.jsj.get()) {
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar2 = this.ork;
            if (pccVar2 != null) {
                pccVar2.sf();
            }
        } else {
            this.jsj.set(true);
            gpj();
            com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
            if (gmVar != null) {
                gmVar.pcc();
            }
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar3 = this.ork;
            if (pccVar3 != null) {
                pccVar3.vj();
                this.ork.oo();
            }
        }
        if (this.fum == null || !kj.qf()) {
            return;
        }
        this.fum.pcc();
        this.fum.pcc(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                sf sfVar = sf.this;
                if (sfVar.oo != null) {
                    jr jrVar = sfVar.qf;
                    if (jrVar != null && jrVar.sf() != null) {
                        sf.this.qf.sf().setDirectDestroyWebView(true);
                    }
                    sf.this.gbb();
                    sf.this.oo.finish();
                }
            }
        });
        this.fum.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf.pcc
            public void pcc(sf.EnumC0069sf enumC0069sf) {
                lo.pcc("BaseManagerBundle", "onHeartbeatStatusChanged: ".concat(String.valueOf(enumC0069sf)));
                if (enumC0069sf == sf.EnumC0069sf.TIMEOUT) {
                    sf.this.fum.sf();
                    sf.this.fum.pcc(sf.this.vj);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf.pcc
            public void pcc() {
                jr jrVar = sf.this.qf;
                if (jrVar != null) {
                    jrVar.pcc();
                    lo.pcc("BaseManagerBundle", "onSendHeartbeat: ");
                }
            }
        });
        this.qf.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.oo
            public void pcc() {
                if (sf.this.fum != null) {
                    sf.this.fum.oo();
                    lo.pcc("BaseManagerBundle", "responseHeartBeat: ");
                }
            }
        });
    }

    public void oo() {
        if (this.of || this.vj == null) {
            return;
        }
        this.of = true;
        this.oo.getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.1
            @Override // java.lang.Runnable
            public void run() {
                int ial = sf.this.vj.ial();
                sf sfVar = sf.this;
                float[] pcc = tmg.pcc(ial, sfVar.oo, sfVar.vj, com.bytedance.sdk.openadsdk.utils.sf.pcc());
                lo.pcc("BaseManagerBundle", "show loading page");
                jr jrVar = sf.this.qf;
                if (jrVar != null) {
                    jrVar.pcc(pcc);
                    sf sfVar2 = sf.this;
                    sfVar2.qf.pcc(sfVar2.vh);
                    sf.this.qf.gm();
                    sf.this.vj();
                    sf.this.qf.wh();
                    sf.this.qf.pcc(new com.bytedance.sdk.openadsdk.core.ork.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.ork.vj
                        public void pcc(String str) {
                            if (sf.this.gpj != null) {
                                sf.this.gpj.pcc(str);
                            }
                        }
                    });
                }
            }
        });
    }

    public void ork() {
        lo.pcc("BaseManagerBundle", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        hc();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc.vj
    public void pcc(String str, int i, int i2) {
        jr jrVar = this.qf;
        if (jrVar != null) {
            jrVar.pcc(str, i, i2);
            if (i == 2 || i == 3) {
                System.currentTimeMillis();
                this.tsz.set(true);
                if (!this.gbb.get() || !com.bytedance.sdk.openadsdk.core.model.lo.vj(this.vj) || this.jsj.get()) {
                    com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.tz;
                    if (gmVar != null) {
                        gmVar.setVisibility(0);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar2 = this.vh;
                    if (gmVar2 == null || i != 2) {
                        return;
                    }
                    gmVar2.pcc();
                    return;
                }
                this.jsj.set(true);
                gpj();
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = this.tz;
                if (gmVar3 != null) {
                    gmVar3.setVisibility(0);
                }
                com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar4 = this.vh;
                if (gmVar4 != null && i == 2) {
                    gmVar4.pcc();
                }
                com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
                if (pccVar != null) {
                    pccVar.oo();
                    this.ork.vj();
                }
            }
        }
    }

    public abstract void pcc(boolean z, int i, String str, int i2, String str2, int i3);

    public void qf() {
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
        if (gmVar != null) {
            gmVar.gm();
        }
    }

    public void sf(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo ooVar = this.kj;
        if (ooVar != null && ooVar.pcc()) {
            this.vj.ork(true);
        }
        if (this.lu.get()) {
            this.vj.kj(true);
        }
    }

    public abstract void tmg();

    public void vh() {
        tmg();
        jr jrVar = this.qf;
        if (jrVar == null || jrVar.sf() == null) {
            return;
        }
        this.qf.sf().gpj();
    }

    public void vj() {
        jr jrVar = this.qf;
        if (jrVar == null) {
            return;
        }
        yt sf = jrVar.sf();
        this.qf.pcc((pcc) this);
        if (sf != null) {
            this.lo.pcc(sf.getWebView());
            this.qf.pcc(this.lo);
            sf.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.vj
                public void pcc() {
                    sf.this.ork();
                }
            });
        }
    }

    public void vy() {
        tmg tmgVar = this.vy;
        if (tmgVar != null) {
            tmgVar.pcc();
        }
    }

    public void wh() {
        lo.pcc("BaseManagerBundle", "onPause: ");
        jr jrVar = this.qf;
        if (jrVar != null) {
            jrVar.vj();
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc pccVar = this.fum;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    public void gbb() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc
    public void sf() {
        if (this.lu.compareAndSet(false, true)) {
            lo.pcc("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            vh();
        }
    }

    public void sf(boolean z) {
        this.gm = z;
    }

    public void gm() {
        oo();
        tmg tmgVar = this.vy;
        if (tmgVar != null) {
            tmgVar.pcc(this.tmg);
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
        if (gmVar != null) {
            gmVar.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
    }

    public void pcc(@Nullable Bundle bundle) {
        dax.pcc(this.vj, this.hc, this.wh, this);
        lu();
        if (com.bytedance.sdk.openadsdk.core.model.lo.vj(this.vj)) {
            this.ork.sf();
        }
        this.yt.addView(this.tz, new ViewGroup.LayoutParams(-1, -1));
        this.tz.setVisibility(8);
    }

    public void pcc(boolean z) {
        if (this.kj != null) {
            jr jrVar = this.qf;
            this.kj.pcc(z, (jrVar == null || jrVar.sf() == null) ? null : this.qf.sf().getAdShowTime());
            this.kj.pcc(z, this.vj, this.wh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc
    public void pcc() {
        ork();
        this.vj.hu();
        this.vj.oo(true);
        if (of.vj(this.vj)) {
            of ofVar = this.vj;
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.wh, ofVar.zex());
        }
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj pcc(of ofVar) {
        if (this.qy == null) {
            this.qy = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.oo, this.wh);
        }
        Activity activity = this.oo;
        String str = this.wh;
        com.bytedance.sdk.openadsdk.core.gm.vj vjVar = new com.bytedance.sdk.openadsdk.core.gm.vj(activity, ofVar, str, TextUtils.equals(str, "rewarded_video") ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.vj
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z) {
                HashMap hashMap = new HashMap();
                ljg.s(0, 1, IronSourceConstants.EVENTS_DURATION, "click_scence", hashMap);
                pcc(hashMap);
                sf.this.ork();
            }
        };
        vjVar.pcc(this.qy);
        return vjVar;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
    }
}

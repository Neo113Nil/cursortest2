package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.dax;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements dax, jr, com.bytedance.sdk.component.adexpress.dynamic.oo, com.bytedance.sdk.component.adexpress.sf.oo<View> {
    protected static int fum = 24;
    protected float dax;
    protected float gbb;
    protected com.bytedance.adsdk.ugeno.sf.gm<View> gm;
    protected long gpj;
    protected com.bytedance.adsdk.ugeno.sf.gm hc;
    protected float jr;
    private boolean jsj;
    protected com.bytedance.sdk.component.adexpress.sf.kj kj;
    protected long lu;
    protected float nac;
    protected JSONObject oo;
    protected gbb ork;
    protected tmg pcc;
    private fum pq;
    protected FrameLayout qf;
    private com.bytedance.sdk.component.adexpress.sf.qf qy;
    protected Context sf;
    protected com.bytedance.adsdk.ugeno.sf.gm tmg;
    protected String tz;
    protected of vj;
    protected com.bytedance.sdk.openadsdk.core.ork.dax vy;
    protected pcc wh;
    protected JSONObject yt;
    private vj zti;
    protected boolean lo = true;
    private long tsz = 0;
    private float mk = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float atb = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float ye = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    private float lq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public SparseArray<gm.pcc> of = new SparseArray<>();
    private String mu = "";
    private final com.bytedance.sdk.component.kj.sf.gm nn = new com.bytedance.sdk.component.kj.sf.gm("ugen_render_template") { // from class: com.bytedance.sdk.openadsdk.core.hc.wh.oo.1
        @Override // java.lang.Runnable
        public void run() {
            oo ooVar = oo.this;
            ooVar.oo = ooVar.pcc();
            oo ooVar2 = oo.this;
            ooVar2.yt = ooVar2.sf();
            oo ooVar3 = oo.this;
            ooVar3.zti = new vj(ooVar3.sf, ooVar3.vj, ooVar3.tz, ooVar3.yt);
            fum fumVar = oo.this.pq;
            oo ooVar4 = oo.this;
            if (fumVar != null) {
                ooVar4.mu = ooVar4.pq.getUgenTemplateErrorReason();
            } else {
                ooVar4.mu = "expressView is null";
            }
            com.bytedance.sdk.openadsdk.core.jr.gm().post(oo.this.rnn);
        }
    };
    private final Runnable rnn = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.wh.oo.2
        @Override // java.lang.Runnable
        public void run() {
            if (oo.this.qy != null) {
                oo ooVar = oo.this;
                ooVar.sf(ooVar.qy);
            }
        }
    };
    private boolean tsx = false;
    protected AtomicBoolean vh = new AtomicBoolean(false);

    static {
        if (lu.pcc() != null) {
            fum = lu.sf();
        }
    }

    public oo(Context context, of ofVar, boolean z, pcc pccVar, ViewGroup viewGroup) {
        this.sf = context;
        this.jsj = z;
        this.pcc = new tmg(context);
        this.vj = ofVar;
        this.wh = pccVar;
        this.qf = new FrameLayout(context);
        if (viewGroup instanceof fum) {
            this.pq = (fum) viewGroup;
        }
        this.tz = pccVar.oo();
    }

    private void pcc(hc hcVar) {
        int i;
        JSONObject jSONObject;
        boolean z;
        int i2;
        String str;
        vj vjVar;
        vj vjVar2;
        vj vjVar3;
        if (this.kj == null) {
            return;
        }
        String optString = hcVar.gm().optString("type");
        if ("swiperLeft".equals(optString) && (vjVar3 = this.zti) != null) {
            vjVar3.sf();
            return;
        }
        if ("swiperRight".equals(optString) && (vjVar2 = this.zti) != null) {
            vjVar2.gm();
            return;
        }
        i = 2;
        if (!"swiperClick".equals(optString) || (vjVar = this.zti) == null) {
            jSONObject = null;
            z = false;
            i2 = 0;
        } else {
            z = vjVar.pcc(hcVar);
            jSONObject = this.zti.oo();
            i2 = 2;
        }
        optString.getClass();
        switch (optString) {
            case "privacy":
                i = 7;
                break;
            case "feedback":
                i = 3;
                break;
            case "mute":
                i = 5;
                break;
            case "skip":
                i = 6;
                break;
            case "video":
                i = 4;
                break;
            case "creative":
                break;
            default:
                i = i2;
                break;
        }
        com.bytedance.adsdk.ugeno.sf.gm pcc = hcVar.pcc();
        dax.pcc pcc2 = new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).pcc(this.of).pcc(hcVar.sf() != 1 || this.lo);
        if (pcc == null) {
            str = "";
        } else {
            str = pcc.mu() + "_" + pcc.pq();
        }
        this.kj.pcc(hcVar.pcc().vh(), i, pcc2.pcc(str).sf(z).sf(jSONObject).pcc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        boolean z = this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh;
        pcc pccVar = this.wh;
        if (z) {
            pccVar.vj().qf(1);
        } else {
            pccVar.pq().pcc();
        }
        if (this.oo == null) {
            qfVar.pcc(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen template is null real reason is " + this.mu);
            return;
        }
        if (this.yt == null) {
            qfVar.pcc(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "ugen data is null");
            return;
        }
        int oo = oo();
        if (this.pcc.pcc()) {
            List<String> sf = this.pcc.sf();
            if (sf == null) {
                qfVar.pcc(138, "unknow widget");
                return;
            }
            qfVar.pcc(138, "unknow widget;" + sf.toString());
            return;
        }
        if (oo != 0) {
            qfVar.pcc(oo, "ugen render fail");
            return;
        }
        if (this.gm == null) {
            qfVar.pcc(138, "ugen render error");
            return;
        }
        sf sfVar = new sf();
        this.ork = sfVar;
        sfVar.pcc(true);
        this.ork.pcc(gm());
        setSoundMute(this.jsj);
        vy();
        com.bytedance.adsdk.ugeno.sf.gm kj = kj();
        this.tmg = kj;
        if (kj != null && (kj instanceof com.bytedance.sdk.openadsdk.core.hc.sf.wh.sf)) {
            ((sf) this.ork).pcc((FrameLayout) ((com.bytedance.sdk.openadsdk.core.hc.sf.wh.sf) kj).oo());
        }
        vj vjVar = this.zti;
        if (vjVar != null) {
            vjVar.pcc();
        }
        com.bytedance.adsdk.ugeno.sf.gm wh = wh();
        this.hc = wh;
        if (wh != null && (wh instanceof com.bytedance.adsdk.ugeno.vy.sf.sf)) {
            ((sf) this.ork).sf((FrameLayout) wh.vh());
        }
        if (atb.gm(this.vj)) {
            com.bytedance.adsdk.ugeno.sf.gm qf = qf();
            if (qf instanceof com.bytedance.sdk.openadsdk.core.hc.sf.gm.sf) {
                ((sf) this.ork).gm(((com.bytedance.sdk.openadsdk.core.hc.sf.gm.sf) qf).oo());
            }
        }
        int nn = this.gm.nn();
        int rnn = this.gm.rnn();
        this.qf.removeAllViews();
        this.qf.addView(this.gm.vh(), new FrameLayout.LayoutParams(nn, rnn));
        float ye = this.wh.ye();
        float lq = this.wh.lq();
        float sf2 = rj.sf(this.sf, ye);
        float sf3 = rj.sf(this.sf, lq);
        if (gm() == 7) {
            FrameLayout frameLayout = this.qf;
            if (lq <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams((int) sf2, -2));
            } else {
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams((int) sf2, (int) sf3));
            }
        } else {
            this.qf.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        if (lq <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ye <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.qf.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int gm = rj.gm(this.sf, this.qf.getMeasuredWidth());
            int gm2 = rj.gm(this.sf, this.qf.getMeasuredHeight());
            this.ork.pcc(gm);
            this.ork.sf(gm2);
        } else {
            this.ork.pcc(ye);
            this.ork.sf(lq);
        }
        if (this.vh.get()) {
            qfVar.pcc(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE, "ugen render timeout");
        } else {
            this.pcc.pcc(this.gm, "renderDidFinish", new Object[0]);
            qfVar.pcc(this.qf, this.ork);
        }
    }

    private void vy() {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj;
        if (this.gm == null) {
            return;
        }
        if (this.vj.qte() && (vj = this.gm.vj("tvskip")) != null) {
            vj.gm(8);
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> vj2 = this.gm.vj("skip");
        if (vj2 != null && (vj2 instanceof com.bytedance.adsdk.ugeno.vy.oo.gm)) {
            if (!vh.sf().jr(String.valueOf(this.vj.kot())) || this.vj.bg() == 5 || this.vj.bg() == 6 || this.vj.tqg() == 3) {
                ((com.bytedance.adsdk.ugeno.vy.oo.gm) vj2).gbb("local://tt_close_btn");
                vj2.sf();
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public int gm() {
        return this.vj.rt();
    }

    public com.bytedance.adsdk.ugeno.sf.gm kj() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return null;
        }
        return gmVar.vj("video");
    }

    public int oo() {
        this.pcc.pcc((jr) this);
        this.pcc.pcc((com.bytedance.adsdk.ugeno.core.dax) this);
        com.bytedance.adsdk.ugeno.sf.gm<View> pcc = this.pcc.pcc(this.oo);
        this.gm = pcc;
        vj vjVar = this.zti;
        if (vjVar != null && pcc != null) {
            vjVar.pcc(pcc);
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
            this.wh.pq().sf();
            this.wh.pq().gm();
        }
        this.pcc.sf(this.yt);
        return 0;
    }

    public com.bytedance.adsdk.ugeno.sf.gm qf() {
        return null;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setSoundMute(boolean z) {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj;
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null || (vj = gmVar.vj(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) == null) {
            return;
        }
        if (z) {
            ((com.bytedance.adsdk.ugeno.vy.oo.gm) vj).gbb("local://tt_reward_full_mute");
        } else {
            ((com.bytedance.adsdk.ugeno.vy.oo.gm) vj).gbb("local://tt_reward_full_unmute");
        }
        vj.sf();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.gm == null) {
            return;
        }
        boolean z2 = i == 1;
        pcc(charSequence, z2, i2, z);
        sf(charSequence, z2, i2, z);
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public View vj() {
        return this.qf;
    }

    public com.bytedance.adsdk.ugeno.sf.gm wh() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return null;
        }
        return gmVar.wh("PlayableComponent");
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void onvideoComplate() {
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTimeUpdate(int i) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
    }

    public void pcc(of ofVar, boolean z, pcc pccVar, ViewGroup viewGroup) {
        this.vj = ofVar;
        this.wh = pccVar;
        this.tz = pccVar.oo();
        if (viewGroup instanceof fum) {
            this.pq = (fum) viewGroup;
        }
        this.jsj = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        this.qy = qfVar;
        rnn.gm((Runnable) this.nn);
    }

    public JSONObject pcc() {
        return this.wh.gm();
    }

    public void pcc(boolean z) {
        this.vh.set(z);
    }

    public void pcc(com.bytedance.sdk.component.adexpress.sf.kj kjVar) {
        this.kj = kjVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.ork.dax daxVar) {
        this.vy = daxVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        vj vjVar2 = this.zti;
        if (vjVar2 != null) {
            vjVar2.pcc(vjVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(hc hcVar, jr.sf sfVar, jr.pcc pccVar) {
        if (hcVar == null) {
            return;
        }
        if (hcVar.sf() == 1 || hcVar.sf() == 4) {
            pcc(hcVar);
        }
        if (hcVar.sf() == 10) {
            pcc(hcVar.gm());
        }
        if (sfVar == null || hcVar.oo() == null) {
            return;
        }
        sfVar.pcc(hcVar.oo());
    }

    private void pcc(JSONObject jSONObject) {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj;
        if (this.gm == null || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("nodeId");
        if (TextUtils.isEmpty(optString2) || (vj = this.gm.vj(optString2)) == null) {
            return;
        }
        if (TextUtils.equals(optString, "onShow")) {
            vj.gm(0);
        } else if (TextUtils.equals(optString, "onDismiss")) {
            vj.gm(8);
        }
    }

    public void pcc(long j, long j2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r9.lq <= r3) goto L15;
     */
    @Override // com.bytedance.adsdk.ugeno.core.dax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        int i2 = 0;
        int i3 = 1;
        if (action != 0) {
            if (action == 1) {
                this.dax = motionEvent.getRawX();
                this.nac = motionEvent.getRawY();
                if (Math.abs(this.dax - this.gbb) >= fum || Math.abs(this.nac - this.jr) >= fum) {
                    this.lo = false;
                }
                this.gpj = System.currentTimeMillis();
            } else if (action == 2) {
                this.ye = Math.abs(motionEvent.getX() - this.mk) + this.ye;
                this.lq = Math.abs(motionEvent.getY() - this.atb) + this.lq;
                this.mk = motionEvent.getX();
                this.atb = motionEvent.getY();
                if (System.currentTimeMillis() - this.tsz > 200) {
                    float f = this.ye;
                    int i4 = fum;
                    if (f <= i4) {
                    }
                    if (Math.abs(motionEvent.getRawX() - this.gbb) < fum || Math.abs(motionEvent.getRawY() - this.jr) >= fum) {
                        this.lo = false;
                    }
                    i = i3;
                    this.of.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                }
                i3 = 2;
                if (Math.abs(motionEvent.getRawX() - this.gbb) < fum) {
                }
                this.lo = false;
                i = i3;
                this.of.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
            }
            i2 = -1;
        } else {
            this.lu = System.currentTimeMillis();
            this.gbb = motionEvent.getRawX();
            this.jr = motionEvent.getRawY();
            this.lo = true;
            this.ye = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.lq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.tsz = System.currentTimeMillis();
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(motionEvent);
            this.mk = motionEvent.getX();
            this.atb = motionEvent.getY();
        }
        i = i2;
        this.of.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }

    private void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj;
        int i2;
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null || (vj = gmVar.vj("countdown")) == null) {
            return;
        }
        View vh = vj.vh();
        if (vh instanceof TextView) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                lo.gm("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            if (!z2 && i2 > 0 && !this.tsx) {
                vh.setVisibility(0);
                if (!z && this.wh.pcc() && com.bytedance.sdk.component.adexpress.oo.wh.sf(this.wh.oo())) {
                    ((TextView) vh).setText(String.format(tz.pcc(com.bytedance.sdk.component.adexpress.oo.pcc(), "tt_reward_full_skip"), Integer.valueOf(i)));
                    return;
                }
                if (!"open_ad".equals(this.wh.oo()) && this.wh.pcc()) {
                    this.tsx = true;
                    vh.setVisibility(8);
                    return;
                } else {
                    ((TextView) vh).setText(((Object) charSequence) + "s");
                    return;
                }
            }
            vh.setVisibility(8);
        }
    }

    public JSONObject sf() {
        return this.wh.zti();
    }

    private void sf(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm<View> vj;
        View vh;
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null || (vj = gmVar.vj("skip")) == null || (vh = vj.vh()) == null) {
            return;
        }
        int i2 = 0;
        if (!z && !z2) {
            i2 = 8;
        }
        vh.setVisibility(i2);
    }
}

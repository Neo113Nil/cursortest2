package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends oo {
    private float atb;
    private com.bytedance.adsdk.ugeno.sf.gm jsj;
    private float lq;
    private com.bytedance.sdk.openadsdk.core.widget.vj mk;
    private float pq;
    private com.bytedance.adsdk.ugeno.sf.gm qy;
    private com.bytedance.adsdk.ugeno.sf.gm tsz;
    private boolean ye;
    private boolean zti;

    public qf(Context context, of ofVar, boolean z, pcc pccVar, ViewGroup viewGroup) {
        super(context, ofVar, z, pccVar, viewGroup);
        this.ye = false;
        this.zti = true;
        if (TextUtils.equals(this.tz, "fullscreen_interstitial_ad")) {
            this.atb = this.vj.bm();
        } else if (TextUtils.equals(this.tz, "rewarded_video")) {
            this.atb = this.vj.quq();
        }
    }

    private boolean dax() {
        of ofVar = this.vj;
        return ofVar != null && ofVar.vd() == 1;
    }

    private int gbb() {
        hc();
        try {
            this.pcc.pcc(this.yt, this.gm);
            if (this.gm != null) {
                jr();
                tmg();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh) {
                return 0;
            }
            this.wh.pq().sf();
            this.wh.pq().gm();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return 139;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void gm(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.jsj;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.wh)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            gmVar.gm(i2);
        }
    }

    private void hc() {
        vh vhVar = new vh();
        HashMap hashMap = new HashMap();
        hashMap.put("image_info", this.wh.vh());
        hashMap.put("cache_dir", this.wh.gbb());
        vhVar.pcc(hashMap);
        vhVar.pcc(this.sf);
        vhVar.pcc(this.oo);
        vhVar.sf(this.yt);
        this.pcc.pcc("ad", vhVar);
    }

    private void jr() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> wh = gmVar.wh("RVCountdown");
        this.qy = wh;
        if (wh == null) {
            wh = this.gm.wh("FVCountdown");
            this.qy = wh;
        }
        if (wh == null) {
            this.qy = this.gm.wh("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> wh2 = this.gm.wh("RVSkipView");
        this.jsj = wh2;
        if (wh2 == null) {
            wh2 = this.gm.wh("FVSkipView");
            this.jsj = wh2;
        }
        if (wh2 == null) {
            this.jsj = this.gm.wh("AOSkipView");
        }
    }

    private void sf(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.tsz;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm)) {
            try {
                int parseInt = Integer.parseInt((String) charSequence);
                if (this.zti) {
                    this.lq = i;
                    this.zti = false;
                }
                float f = (float) (((0.5d / this.lq) * 100.0d) + this.pq);
                this.pq = f;
                this.pcc.pcc(this.gm, "ProgressBar://progress", Float.valueOf(f), Float.valueOf(this.atb));
                if (!z2 && parseInt > 0 && !z) {
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).qf(500);
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).pcc((int) this.pq);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).gm(8);
            } catch (Throwable th) {
                lo.gm("UGenRender", th.getMessage());
            }
        }
    }

    private void tmg() {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.qy;
        if (gmVar != null) {
            gmVar.gm(8);
        }
        com.bytedance.adsdk.ugeno.sf.gm gmVar2 = this.jsj;
        if (gmVar2 != null) {
            gmVar2.gm(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public com.bytedance.adsdk.ugeno.sf.gm kj() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return null;
        }
        return gmVar.wh("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public int oo() {
        if (!this.wh.mu()) {
            return vy();
        }
        lo.pcc("UGenRender", "renderWidget: only update data");
        return gbb();
    }

    public void ork() {
        tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.pcc(this.gm, "videoFail", new Object[0]);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0137  */
    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.adsdk.ugeno.core.jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        char c;
        String mu;
        if (this.kj == null || pccVar == null) {
            return;
        }
        String sf = pccVar.sf();
        sf.getClass();
        int i = 7;
        int i2 = 6;
        int i3 = -1;
        switch (sf.hashCode()) {
            case -1882810668:
                if (sf.equals("sendLogExtra")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1439599355:
                if (sf.equals("sendAdExtra")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (sf.equals("openPrivacy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -55818203:
                if (sf.equals("pauseVideo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3532159:
                if (sf.equals("skip")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 72484600:
                if (sf.equals("openPlayable")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 804386914:
                if (sf.equals("videoControl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 951590323:
                if (sf.equals("convert")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (sf.equals(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1528469391:
                if (sf.equals("openLinks")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1603466254:
                if (sf.equals("speedVideoOrTimer")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1671642405:
                if (sf.equals("dislike")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                new kj().pcc("sendLogExtra", this.vj, this.tz, pccVar.gm());
                break;
            case 1:
                new kj().pcc("sendAdExtra", this.vj, this.tz, pccVar.gm());
                break;
            case 2:
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu) && "VideoV3".equals(mu)) {
                    mu = "Video";
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case 3:
            case 6:
                i = 4;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                    mu = "Video";
                    break;
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case 4:
                i = i2;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case 5:
                com.bytedance.sdk.openadsdk.core.ork.dax daxVar = this.vy;
                if (daxVar != null) {
                    daxVar.sf((JSONObject) null);
                    break;
                }
                break;
            case 7:
                i = 2;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case '\b':
                i = 5;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case '\t':
                new wh().pcc(pcc(gmVar.vh()), this.sf instanceof Activity, this.vj, this.tz, pccVar.gm(), this.mk);
                break;
            case '\n':
                lo.sf("UGenRender", "onUGenEvent: " + pccVar.gm());
                i2 = 13;
                if (pccVar.gm() != null && !pccVar.gm().isEmpty()) {
                    try {
                        i3 = Integer.parseInt(String.valueOf(pccVar.gm().get("switch")));
                    } catch (Throwable th) {
                        lo.gm("UGenRender", th);
                    }
                }
                i = i2;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            case 11:
                i = 3;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
            default:
                i = 0;
                mu = gmVar.mu();
                if (!TextUtils.isEmpty(mu)) {
                }
                this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i3).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public com.bytedance.adsdk.ugeno.sf.gm qf() {
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = this.gm;
        if (gmVar == null) {
            return null;
        }
        return gmVar.wh("Playable");
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        tmg tmgVar;
        if (this.gm == null) {
            return;
        }
        boolean z2 = i == 1;
        if (TextUtils.equals(this.tz, "open_ad") && (tmgVar = this.pcc) != null) {
            tmgVar.pcc(this.gm, "countdown", charSequence);
        }
        sf(charSequence, z2, i2, z);
        pcc(charSequence, z2, i2, z);
        gm(charSequence, z2, i2, z);
    }

    public void vh() {
        tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.pcc(this.gm, "show", new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0062 A[Catch: all -> 0x0076, NoClassDefFoundError -> 0x0079, UnsatisfiedLinkError -> 0x007c, TRY_LEAVE, TryCatch #2 {NoClassDefFoundError -> 0x0079, UnsatisfiedLinkError -> 0x007c, all -> 0x0076, blocks: (B:20:0x0025, B:23:0x002e, B:8:0x004e, B:9:0x005e, B:11:0x0062, B:6:0x003c), top: B:19:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e A[Catch: all -> 0x0076, NoClassDefFoundError -> 0x0079, UnsatisfiedLinkError -> 0x007c, TryCatch #2 {NoClassDefFoundError -> 0x0079, UnsatisfiedLinkError -> 0x007c, all -> 0x0076, blocks: (B:20:0x0025, B:23:0x002e, B:8:0x004e, B:9:0x005e, B:11:0x0062, B:6:0x003c), top: B:19:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int vy() {
        com.bytedance.adsdk.ugeno.sf.gm<View> pcc;
        hc();
        this.pcc.pcc((jr) this);
        this.pcc.pcc((com.bytedance.adsdk.ugeno.core.dax) this);
        if (dax()) {
            this.pcc.pcc(new gm());
        }
        zti uae = this.vj.uae();
        if (uae == null) {
            try {
                if (!com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(this.tz)) {
                    pcc = this.pcc.pcc(this.oo, this.yt, (JSONObject) null);
                    this.gm = pcc;
                    if (pcc != null) {
                        jr();
                        this.tsz = this.gm.wh("ProgressBar");
                        tmg();
                    }
                    if (!(this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
                        return 0;
                    }
                    this.wh.pq().sf();
                    this.wh.pq().gm();
                    return 0;
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return 139;
            } catch (Throwable unused3) {
                return 141;
            }
        }
        pcc = this.pcc.pcc(this.oo, this.yt, pcc(uae));
        this.gm = pcc;
        if (pcc != null) {
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setSoundMute(boolean z) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public JSONObject sf() {
        return this.wh.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public void pcc(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        this.mk = vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public JSONObject pcc() {
        JSONObject gm = this.wh.gm();
        if (gm != null) {
            return gm.optJSONObject("xTemplate");
        }
        return null;
    }

    private void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.qy;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                lo.gm("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            com.bytedance.sdk.openadsdk.core.hc.sf.sf sfVar = (com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy;
            if (!z2 && i2 > 0 && !this.ye && !pcc(sfVar)) {
                this.qy.gm(0);
                if (!z && this.wh.pcc() && com.bytedance.sdk.component.adexpress.oo.wh.sf(this.wh.oo())) {
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy).gbb(String.valueOf(i));
                    return;
                } else if (!"open_ad".equals(this.wh.oo()) && this.wh.pcc()) {
                    this.ye = true;
                    this.qy.gm(8);
                    return;
                } else {
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy).gbb(String.valueOf(charSequence));
                    return;
                }
            }
            this.qy.gm(8);
        }
    }

    private Context pcc(View view) {
        Activity pcc = view != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
        return pcc == null ? this.sf : pcc;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public void pcc(long j, long j2) {
        super.pcc(j, j2);
        tmg tmgVar = this.pcc;
        if (tmgVar != null) {
            tmgVar.pcc(this.gm, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.core.hc.sf.sf sfVar) {
        if (sfVar == null) {
            return true;
        }
        if (TextUtils.equals(this.tz, "open_ad")) {
            return sfVar.oo() == 8 || sfVar.oo() == 4;
        }
        return false;
    }

    public JSONObject pcc(zti ztiVar) {
        if (ztiVar != null) {
            return ztiVar.vj();
        }
        return null;
    }
}

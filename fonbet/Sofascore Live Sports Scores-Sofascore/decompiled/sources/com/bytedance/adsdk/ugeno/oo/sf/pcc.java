package com.bytedance.adsdk.ugeno.oo.sf;

import android.text.TextUtils;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class pcc {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "skip", "videoControl", "pauseVideo", "resumeVideo", FyberMediationAdapter.KEY_MUTE_VIDEO, "preventEvent"));
    protected com.bytedance.adsdk.ugeno.sf.gm gm;
    protected String kj;
    protected String oo;
    protected String qf;
    protected wh.pcc sf;
    protected String vj;
    protected Map<String, Object> wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.oo.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0031pcc {
        public static pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
            if (pccVar == null) {
                return null;
            }
            com.bytedance.adsdk.ugeno.oo.sf pcc = com.bytedance.adsdk.ugeno.oo.oo.pcc(pccVar.sf());
            if (pcc == null && (TextUtils.isEmpty(pccVar.pcc()) || !TextUtils.equals(pccVar.pcc(), "global"))) {
                pcc = com.bytedance.adsdk.ugeno.oo.oo.pcc(pccVar.vj());
            }
            if (pcc == null) {
                return new gm(gmVar, str, pccVar);
            }
            pcc pcc2 = pcc.pcc(gmVar, str, pccVar);
            return pcc2 == null ? new gm(gmVar, str, pccVar) : pcc2;
        }
    }

    public pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        this.gm = gmVar;
        this.sf = pccVar;
        this.qf = str;
        vj();
    }

    private void vj() {
        wh.pcc pccVar = this.sf;
        if (pccVar == null) {
            return;
        }
        this.oo = pccVar.pcc();
        this.vj = this.sf.sf();
        Map<String, Object> gm = this.sf.gm();
        this.wh = gm;
        if (gm == null || gm.isEmpty() || !this.wh.containsKey("emitCustomEvent") || !(this.wh.get("emitCustomEvent") instanceof String)) {
            return;
        }
        this.kj = (String) this.wh.get("emitCustomEvent");
    }

    public void gm() {
        if (oo()) {
            wh.pcc pccVar = new wh.pcc();
            pccVar.pcc(Payload.CUSTOM);
            pccVar.sf("emit");
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.kj);
            pccVar.pcc(hashMap);
            new sf(this.gm, this.vj, pccVar).pcc();
        }
    }

    public boolean oo() {
        return !TextUtils.isEmpty(this.kj);
    }

    public abstract void pcc();

    public void sf() {
        gm();
    }
}

package com.bytedance.sdk.openadsdk.core.tmg;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.dax.pcc.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.mbridge.msdk.MBridgeConstans;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class pcc {
    private volatile boolean gm = true;
    private volatile boolean oo = false;
    private PglSSManager pcc;
    private volatile boolean sf;

    public pcc() {
        pcc();
    }

    private void gm(final String str) {
        if (this.oo || TextUtils.isEmpty(str)) {
            return;
        }
        lu.vj().pcc(new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                return oo.sf().pcc("secsdk_init_error").sf(str);
            }
        }, false);
        this.oo = true;
    }

    private boolean kj() {
        if (!this.sf && this.gm) {
            pcc();
        }
        return this.sf;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class ork() {
        try {
            this.gm = true;
            return PglSSManager.class;
        } catch (Throwable unused) {
            this.gm = false;
            return PglSSManager.class;
        }
    }

    private void vy() {
        if (this.pcc == null) {
            this.pcc = PglSSManager.getInstance();
        }
    }

    public String oo() {
        String sf = com.bytedance.sdk.openadsdk.core.gm.pcc().sf("sec_token", "");
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                String token = pglSSManager.getToken();
                if (!TextUtils.isEmpty(token) && !TextUtils.equals(sf, token)) {
                    com.bytedance.sdk.openadsdk.core.gm.pcc().pcc("sec_token", token);
                }
                return token;
            }
        }
        return sf;
    }

    public synchronized void pcc() {
        Context pcc;
        String oo;
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        if (!this.sf) {
            try {
                pcc = lu.pcc();
                oo = ork.sf().oo();
                if (TextUtils.isEmpty(oo)) {
                    oo = ork.pcc(MBridgeConstans.APP_ID, Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                ork();
                this.sf = false;
            }
            if (TextUtils.isEmpty(oo)) {
                return;
            }
            String pcc2 = hc.pcc(pcc);
            String sf = com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf();
            PglSSConfig build = PglSSConfig.builder().setAppId(oo).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(sf2)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, sf2);
            }
            Set<String> vd = vh.sf().vd();
            if (vd != null && !vd.isEmpty()) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, vd);
            }
            String lu = kun.lu();
            if (!TextUtils.isEmpty(lu)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, lu);
            }
            if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                Set<String> gga = vh.sf().gga();
                if (gga == null || gga.isEmpty()) {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
                } else {
                    hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, gga);
                }
            } else {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_ADS_URL_BACKUP, new HashSet());
            }
            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, vh.sf().rc());
            String pcc3 = vj.pcc(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(pcc3)) {
                hashMap.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, pcc3);
            }
            build.setCustomInfo(hashMap);
            build.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(str, false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.1.1
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        @Nullable
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            return oo.sf().pcc(str).sf(str2);
                        }
                    });
                }
            });
            PglSSManager.init(pcc, build, null, null, pcc2, sf);
            vy();
            this.sf = true;
            try {
                if (this.gm) {
                    gm(PglSSManager.getLoadError());
                }
            } catch (Throwable th) {
                lo.gm("mssdk", th.getMessage());
            }
        }
    }

    public int qf() {
        if (this.gm) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void sf(String str) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public String vj() {
        if (!kj()) {
            return "";
        }
        vy();
        PglSSManager pglSSManager = this.pcc;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public long wh() {
        if (!kj()) {
            return 0L;
        }
        vy();
        PglSSManager pglSSManager = this.pcc;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public boolean sf() {
        return this.sf;
    }

    public void gm() {
        if (kj()) {
            vy();
            if (this.pcc != null) {
                jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap hashMap = new HashMap();
                            hashMap.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, lu.oo().fum());
                            pcc.this.pcc.setCustomInfo(hashMap);
                        } catch (Throwable th) {
                            lo.gm("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void pcc(String str) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void pcc(final Map<String, Object> map) {
        if (kj()) {
            vy();
            if (this.pcc != null) {
                jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.tmg.pcc.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            pcc.this.pcc.setCustomInfo(map);
                        } catch (Throwable th) {
                            lo.gm("MSSdkImpl", "setCustomInfo", th.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void pcc(String str, Map<String, Object> map) {
        if (kj()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void pcc(MotionEvent motionEvent) {
        if (sf()) {
            vy();
            PglSSManager pglSSManager = this.pcc;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> pcc(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!kj() || (featureHash = this.pcc.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}

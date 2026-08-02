package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.oo.vy;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends com.bytedance.adsdk.ugeno.sf.pcc<com.bytedance.adsdk.ugeno.wh.sf> implements com.bytedance.adsdk.ugeno.wh.gm {
    private float az;
    private int bgf;
    private boolean bq;
    private String by;
    private boolean dp;
    private JSONArray eko;
    private boolean esn;
    private float gga;
    private float gmh;
    private String gpa;
    private float gr;
    private boolean gye;
    private float jmx;
    private float kez;
    private int lc;
    private float ln;
    private String ofe;
    private float oyx;
    private float pzh;
    private float rc;
    private int rv;
    private boolean uae;
    private int vd;
    private boolean xf;
    private int xfm;
    private int xy;
    private boolean zk;
    private float zpi;

    public sf(Context context) {
        super(context);
        this.vd = 0;
        this.xf = true;
        this.uae = true;
        this.gga = 500.0f;
        this.rc = -1.0f;
        this.kez = 2000.0f;
        this.ofe = "slide";
        this.gpa = "dot";
        this.az = 8.0f;
        this.gr = 8.0f;
        this.zpi = 50.0f;
        this.jmx = 90.0f;
        this.zk = false;
        this.rv = Color.parseColor("#666666");
        this.xy = Color.parseColor("#ffffff");
        this.by = "row";
        this.ln = 1.0f;
        this.oyx = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.pzh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gmh = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.lc = 0;
        this.bgf = 0;
        this.dp = true;
        this.esn = false;
        this.bq = true;
        float pcc = kj.pcc(this.sf, 8.0f);
        this.az = pcc;
        this.gr = pcc;
    }

    private int hoh() {
        if (this.lc == 1) {
            List<com.bytedance.adsdk.ugeno.sf.gm<View>> list = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
        JSONArray jSONArray = this.eko;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private void kj(int i) {
        vy vyVar = this.jy;
        if (vyVar == null) {
            return;
        }
        vyVar.pcc("SwiperView://slide", Integer.valueOf(this.xfm), Integer.valueOf(i), Integer.valueOf(!this.gye ? 1 : 0));
    }

    private void ptr() {
        for (int i = 0; i < ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.size(); i++) {
            com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.get(i);
            if (gmVar != null) {
                tmg tmgVar = new tmg(this.sf);
                pcc(tmgVar);
                tmgVar.pcc(this.fvk);
                ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).pcc((com.bytedance.adsdk.ugeno.wh.sf) tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
            }
        }
    }

    private void qf(int i) {
        if (this.jy == null) {
            return;
        }
        if (this.xfm == 0 && i == hoh() - 1) {
            this.jy.pcc("SwiperView://reloop", 1);
        }
        if (this.xfm == hoh() - 1 && i == 0) {
            this.jy.pcc("SwiperView://reloop", 0);
        }
    }

    private void se() {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> list = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc;
        if (list == null || list.isEmpty()) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> gmVar = ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.get(0);
        if (this.eko == null) {
            return;
        }
        for (int i = 0; i < this.eko.length(); i++) {
            tmg tmgVar = new tmg(this.sf);
            pcc(tmgVar);
            tmgVar.pcc(this.fvk);
            try {
                JSONObject optJSONObject = this.eko.optJSONObject(i);
                if (optJSONObject != null) {
                    boolean has = optJSONObject.has("$chunk");
                    JSONObject jSONObject = this.oo;
                    if (has) {
                        jSONObject.put("$item", optJSONObject.optJSONArray("$chunk"));
                    } else {
                        jSONObject.put("$item", optJSONObject);
                    }
                    ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).pcc((com.bytedance.adsdk.ugeno.wh.sf) tmgVar.pcc(gmVar.ye(), this.oo, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void gm() {
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gbb(((com.bytedance.adsdk.ugeno.wh.sf) this.vj).getCurrentItem() + 1);
    }

    public void oo() {
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gbb(((com.bytedance.adsdk.ugeno.wh.sf) this.vj).getCurrentItem() - 1);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "startDelay":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "startIndex":
                this.bgf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "indicatorColor":
                this.rv = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2, this.rv);
                break;
            case "indicatorStyle":
                this.gpa = str2;
                break;
            case "indicatorWidth":
                this.az = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 8.0f));
                break;
            case "indicatorHeight":
                this.gr = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 8.0f));
                break;
            case "nextMargin":
                this.gmh = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "driveMode":
                this.lc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "effect":
                this.ofe = str2;
                break;
            case "direction":
                if (!TextUtils.equals(str2, "vertical")) {
                    this.vd = 0;
                    break;
                } else {
                    this.vd = 1;
                    break;
                }
            case "disableOnInteraction":
                this.esn = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "indicator":
                this.zk = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "indicatorX":
                this.zpi = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 50.0f);
                break;
            case "indicatorY":
                this.jmx = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 90.0f);
                break;
            case "previousMargin":
                this.pzh = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "loop":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "delay":
                this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 2000.0f);
                break;
            case "speed":
                this.gga = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 500.0f);
                break;
            case "indicatorDirection":
                this.by = str2;
                break;
            case "allowTouchMove":
                this.dp = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "pageCount":
                this.ln = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "pageMargin":
                this.oyx = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "indicatorSelectedColor":
                this.xy = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2, this.xy);
                break;
            case "autoplay":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
            case "dataList":
                this.eko = com.bytedance.adsdk.ugeno.qf.sf.pcc(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gm((int) this.gga).vj(this.esn).pcc(this.gpa).pcc(this.az).sf(this.gr).gm(this.zpi).oo(this.jmx).sf(this.by).pcc(this.vd).sf().oo(this.xf).pcc(this.uae).sf((int) this.gga).oo((int) this.kez).vj((int) this.rc).sf(this.dp).gm(this.zk).qf(this.rv).wh(this.xy).vy((int) this.pzh).ork((int) this.gmh).kj((int) this.oyx).vj(this.ln).gm(this.ofe).gbb(this.bgf);
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).setOnPageChangeListener(this);
        if (this.lc == 1) {
            ptr();
        } else {
            se();
        }
        ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gm();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public View pcc() {
        com.bytedance.adsdk.ugeno.wh.sf sfVar = new com.bytedance.adsdk.ugeno.wh.sf(this.sf);
        this.vj = sfVar;
        sfVar.pcc((oo) this);
        return this.vj;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (gmVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.add(gmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, ViewGroup.LayoutParams layoutParams) {
        if (gmVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.sf.pcc) this).pcc.add(gmVar);
    }

    public void pcc(int i) {
        if (((com.bytedance.adsdk.ugeno.wh.sf) this.vj).getCurrentItem() != i) {
            ((com.bytedance.adsdk.ugeno.wh.sf) this.vj).gbb(i);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wh.gm
    public void pcc(boolean z, int i, float f, int i2) {
        pcc(z, i, f);
    }

    @Override // com.bytedance.adsdk.ugeno.wh.gm
    public void pcc(boolean z, int i, int i2, boolean z2, boolean z3) {
        if (this.xfm != i) {
            qf(i);
            kj(i);
            this.xfm = i;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wh.gm
    public void pcc(boolean z, int i) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.gye = true;
        } else {
            if (!z) {
                this.bq = true;
            }
            this.gye = false;
        }
    }

    private void pcc(boolean z, int i, float f) {
        if (this.jy != null && !z && i == hoh() - 1 && f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.bq) {
            this.jy.pcc("SwiperView://finish", new Object[0]);
            this.bq = false;
        }
    }

    private void pcc(tmg tmgVar) {
        if (this.esn) {
            tmgVar.pcc(new com.bytedance.adsdk.ugeno.core.vj() { // from class: com.bytedance.adsdk.ugeno.sf.1
                @Override // com.bytedance.adsdk.ugeno.core.vj
                public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, List<wh.pcc> list) {
                    if ((TextUtils.equals(str, "tap") || TextUtils.equals(str, "slide") || TextUtils.equals(str, "touchStart") || TextUtils.equals(str, "touchEnd")) && ((com.bytedance.adsdk.ugeno.sf.gm) sf.this).vj != null) {
                        ((com.bytedance.adsdk.ugeno.wh.sf) ((com.bytedance.adsdk.ugeno.sf.gm) sf.this).vj).wh();
                    }
                }
            });
        }
    }
}

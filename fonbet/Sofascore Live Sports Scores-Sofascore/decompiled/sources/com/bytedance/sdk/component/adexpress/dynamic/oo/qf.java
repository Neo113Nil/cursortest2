package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.graphics.Color;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.bytedance.sdk.component.adexpress.dynamic.vj.vh;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {
    public JSONObject gm;
    private wh oo;
    public int pcc;
    public String sf;
    private vj vj;
    private String wh;

    public qf(vj vjVar) {
        this.vj = vjVar;
        this.pcc = vjVar.pcc();
        this.sf = vjVar.gm();
        this.gm = vjVar.vj().gdh();
        this.wh = vjVar.oo();
        if (com.bytedance.sdk.component.adexpress.oo.gm() == 1) {
            this.oo = vjVar.qf();
        } else {
            this.oo = vjVar.vj();
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            this.oo = vjVar.vj();
        }
    }

    private boolean bbd() {
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.sf) && this.sf.contains("adx:")) || vh.sf();
    }

    public static int pcc(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return -16777216;
        }
        if (str.equals(U3.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return -16777216;
    }

    public static float[] sf(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        return (split == null || split.length != 4) ? new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT} : new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    private boolean wax() {
        return (com.bytedance.sdk.component.adexpress.oo.sf() && (this.vj.sf().contains("logo-union") || this.vj.sf().contains("logounion") || this.vj.sf().contains("logoad"))) || "logo-union".equals(this.vj.sf()) || "logounion".equals(this.vj.sf()) || "logoad".equals(this.vj.sf());
    }

    public double atb() {
        return this.oo.kj();
    }

    public int bg() {
        return this.oo.zti();
    }

    public int dax() {
        return pcc(this.oo.jsj());
    }

    public boolean ei() {
        return this.oo.mua();
    }

    public String erj() {
        return this.oo.atb();
    }

    public double ew() {
        return this.oo.mu();
    }

    public int fmh() {
        return this.oo.jy();
    }

    public String fum() {
        return this.oo.yt();
    }

    public double gbb() {
        return this.oo.gpj();
    }

    public boolean gd() {
        return this.oo.vd();
    }

    public String gdh() {
        return this.oo.ln();
    }

    public int gh() {
        return this.oo.uae();
    }

    public int gm() {
        return (int) this.oo.jr();
    }

    public int gpj() {
        return this.oo.gr();
    }

    public double hc() {
        if (this.pcc == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.oo.sf() ? (int) r0 : Double.parseDouble(this.sf);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public boolean hoh() {
        return this.oo.hc();
    }

    public int hpk() {
        return this.oo.zk();
    }

    public boolean iv() {
        return this.oo.kx();
    }

    public float jr() {
        return this.oo.vh();
    }

    public long jsj() {
        return this.oo.gmh();
    }

    public int kj() {
        String fum = this.oo.fum();
        if ("left".equals(fum)) {
            return 17;
        }
        if (TtmlNode.CENTER.equals(fum)) {
            return 4;
        }
        return "right".equals(fum) ? 3 : 2;
    }

    public int kun() {
        return this.oo.ywp();
    }

    public int kz() {
        return this.oo.pq();
    }

    public boolean lo() {
        return this.oo.az();
    }

    public int lq() {
        return this.oo.sf();
    }

    public String lrr() {
        return this.oo.rnn();
    }

    public int lu() {
        return this.oo.gpa();
    }

    public int mk() {
        return pcc(this.oo.of());
    }

    public int mu() {
        return this.oo.vy();
    }

    public float nac() {
        return this.oo.tmg();
    }

    public String nn() {
        return this.oo.ork();
    }

    public int of() {
        return this.oo.xb();
    }

    public int oo() {
        return (int) this.oo.dax();
    }

    public String ork() {
        int i = this.pcc;
        return (i == 2 || i == 13) ? this.sf : "";
    }

    public String otd() {
        return this.oo.fvk();
    }

    public int pq() {
        return this.oo.oo();
    }

    public String ptr() {
        return this.oo.rv();
    }

    public String qc() {
        return this.oo.qy();
    }

    public boolean qcw() {
        return this.oo.lq();
    }

    public int qf() {
        return pcc(this.oo.tz());
    }

    public String qy() {
        return this.oo.pzh();
    }

    public int ra() {
        return this.oo.vo();
    }

    public int ri() {
        return this.oo.ofe();
    }

    public int rj() {
        return this.oo.vgx();
    }

    public String rnn() {
        return this.oo.kun();
    }

    public boolean rt() {
        return this.oo.vd();
    }

    public String se() {
        return this.oo.xf();
    }

    public String tmg() {
        return this.wh;
    }

    public double tmh() {
        return this.oo.nn();
    }

    public boolean tsx() {
        return this.oo.ei();
    }

    public int tsz() {
        String tsx = this.oo.tsx();
        if ("skip-with-time-skip-btn".equals(this.vj.sf()) || "skip".equals(this.vj.sf()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.vj.sf())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.vj.sf()) && !"skip-with-time".equals(this.vj.sf())) {
            if (this.pcc == 10 && TextUtils.equals(this.oo.kun(), "click")) {
                return 5;
            }
            if (wax() && bbd()) {
                return 0;
            }
            if (wax()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.vj.sf())) {
                return 3;
            }
            if (!TextUtils.isEmpty(tsx) && !tsx.equals("none")) {
                if (tsx.equals("video") || (this.vj.pcc() == 7 && TextUtils.equals(tsx, "normal"))) {
                    return (com.bytedance.sdk.component.adexpress.oo.sf() && this.vj.vj() != null && this.vj.vj().jmx()) ? 11 : 4;
                }
                if (tsx.equals("normal")) {
                    return 1;
                }
                return (tsx.equals("creative") || "slide".equals(this.oo.kun())) ? 2 : 0;
            }
        }
        return 0;
    }

    public boolean tz() {
        return this.oo.iv();
    }

    public int vgx() {
        return this.oo.bxz();
    }

    public String vh() {
        return this.pcc == 1 ? this.sf : "";
    }

    public float vj() {
        return this.oo.lu();
    }

    public String vr() {
        return this.oo.ye();
    }

    public int vy() {
        int kj = kj();
        if (kj == 4) {
            return 17;
        }
        return kj == 3 ? 8388613 : 8388611;
    }

    public String wh() {
        return this.pcc == 0 ? !TextUtils.isEmpty(this.sf) ? this.sf : this.gm.optString(com.bytedance.sdk.component.adexpress.oo.qf.gm(com.bytedance.sdk.component.adexpress.oo.pcc())) : "";
    }

    public int xb() {
        return this.oo.qf();
    }

    public int ye() {
        return this.oo.gm();
    }

    public String yt() {
        return this.oo.tsx();
    }

    public int ywp() {
        return this.oo.fy();
    }

    public int zsj() {
        return this.oo.gqd();
    }

    public int zti() {
        return this.oo.vj();
    }

    public int sf() {
        return (int) this.oo.nac();
    }

    public void pcc(float f) {
        this.oo.pcc(f);
    }

    public int pcc() {
        return (int) this.oo.gbb();
    }
}

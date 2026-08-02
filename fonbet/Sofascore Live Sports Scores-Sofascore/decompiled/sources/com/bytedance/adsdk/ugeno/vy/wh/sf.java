package com.bytedance.adsdk.ugeno.vy.wh;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf extends gm<pcc> {

    @Deprecated
    private TextUtils.TruncateAt az;

    @Deprecated
    private float by;
    private float eko;
    private int gga;
    private int gpa;
    private TextUtils.TruncateAt gr;
    private float jmx;
    private int kez;
    private float ln;
    private int ofe;
    private float oyx;
    protected String pcc;
    private float pzh;
    private int rc;
    private boolean rv;
    private float uae;
    protected int vd;
    private float xf;

    @Deprecated
    private float xy;
    private int zk;
    private float zpi;

    public sf(Context context) {
        super(context);
        this.vd = -16777216;
        this.xf = 12.0f;
        this.uae = -1.0f;
        this.rc = Integer.MAX_VALUE;
        this.ofe = 8388611;
        this.gr = TextUtils.TruncateAt.END;
        this.zpi = -1.0f;
        this.jmx = 400.0f;
    }

    private int dax(String str) {
        int hashCode = str.hashCode();
        if (hashCode == -1178781136) {
            return str.equals(TtmlNode.ITALIC) ? 2 : 0;
        }
        if (hashCode != -1039745817) {
            return (hashCode == 3029637 && str.equals(TtmlNode.BOLD)) ? 1 : 0;
        }
        str.equals("normal");
        return 0;
    }

    private TextUtils.TruncateAt hc(String str) {
        str.getClass();
        switch (str) {
            case "center":
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MIDDLE;
                this.az = truncateAt;
                return truncateAt;
            case "end":
                TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
                this.az = truncateAt2;
                return truncateAt2;
            case "start":
                TextUtils.TruncateAt truncateAt3 = TextUtils.TruncateAt.START;
                this.az = truncateAt3;
                return truncateAt3;
            default:
                this.az = null;
                return null;
        }
    }

    private TextUtils.TruncateAt jr(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int lu(String str) {
        str.getClass();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }

    private int nac(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 17;
            case "center_vertical":
                return 16;
            case "left":
                return 3;
            case "right":
                return 5;
            case "center_horizontal":
                return 1;
            default:
                return 3;
        }
    }

    private void oo() {
        ((pcc) this.vj).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.zpi);
    }

    private void vy() {
        float f = this.zpi;
        if (f <= 3.0f) {
            ((pcc) this.vj).setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(kj.pcc(this.sf, (f - (this.xf * 1.2f)) / 2.0f));
            int paddingTop = ((pcc) this.vj).getPaddingTop() + round;
            int paddingBottom = ((pcc) this.vj).getPaddingBottom() + round;
            T t = this.vj;
            ((pcc) t).setPadding(((pcc) t).getPaddingLeft(), paddingTop, ((pcc) this.vj).getPaddingRight(), paddingBottom);
            ((pcc) this.vj).setLineHeight(Math.round(kj.pcc(this.sf, this.zpi)));
        }
    }

    public void gbb(String str) {
        this.pcc = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.pcc = "";
        }
        ((pcc) this.vj).setText(this.pcc);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.oyx = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowColor":
                this.zk = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                this.rv = true;
                break;
            case "shadowOffsetX":
                this.ln = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.eko = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.ofe = nac(str2);
                break;
            case "textColor":
                this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "textStyle":
                this.gga = dax(str2);
                break;
            case "textSize":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.gpa = lu(str2);
                break;
            case "shadowDx":
                this.xy = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "shadowDy":
                this.by = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "fontWeight":
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                this.jmx = pcc;
                if (pcc < 1.0f || pcc > 1000.0f) {
                    this.jmx = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.zpi = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "text":
                this.pcc = str2;
                break;
            case "lines":
                this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "ellipsis":
                this.gr = jr(str2);
                break;
            case "minTextSize":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "maxLines":
                int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, Integer.MAX_VALUE);
                this.rc = pcc2 > 0 ? pcc2 : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.az = hc(str2);
                break;
            case "letterSpacing":
                this.pzh = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        if (TextUtils.equals("null", this.pcc)) {
            this.pcc = "";
        }
        gbb(this.pcc);
        ((pcc) this.vj).setTextSize(1, this.xf);
        ((pcc) this.vj).setTextColor(this.vd);
        ((pcc) this.vj).setLines(this.kez);
        ((pcc) this.vj).setMaxLines(this.rc);
        ((pcc) this.vj).setGravity(this.ofe);
        ((pcc) this.vj).setIncludeFontPadding(false);
        ((pcc) this.vj).setMinTextSize(kj.pcc(this.sf, this.uae));
        pcc(this.gpa);
        if (lq()) {
            pcc(this.gr);
        } else {
            pcc(this.az);
        }
        if (this.zpi > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (lq()) {
                vy();
            } else {
                oo();
            }
        }
        ((pcc) this.vj).setBreakStrategy(0);
        if (!lq()) {
            ((pcc) this.vj).setShadowLayer(this.oyx, this.xy, this.by, this.zk);
        } else if (this.rv) {
            float f = this.oyx;
            if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                f = 1.0E-5f;
                this.oyx = 1.0E-5f;
            }
            ((pcc) this.vj).setShadowLayer(f, this.ln, this.eko, this.zk);
        }
        int i = this.gga;
        if (i == 1) {
            ((pcc) this.vj).setTypeface(Typeface.DEFAULT, i);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ((pcc) this.vj).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.jmx, i == 2));
        } else if (this.jmx >= 500.0f) {
            ((pcc) this.vj).setTypeface(Typeface.DEFAULT, 1);
        }
        if (kj.pcc(this.sf, this.xf) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ((pcc) this.vj).setLetterSpacing(this.pzh / kj.pcc(this.sf, this.xf));
        }
    }

    public void pcc(int i) {
        this.gpa = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((pcc) this.vj).setPaintFlags(i);
    }

    public void pcc(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((pcc) this.vj).setEllipsize(truncateAt);
    }
}

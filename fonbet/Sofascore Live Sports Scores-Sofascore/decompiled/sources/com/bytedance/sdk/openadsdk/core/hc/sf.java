package com.bytedance.sdk.openadsdk.core.hc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class sf {
    private float dax;
    private boolean gbb;
    private Context gpj;
    private int hc;
    private float jr;
    private boolean lo;
    private float lu;
    private float nac;
    private TextUtils.TruncateAt ork;
    protected String pcc;
    private int qf;
    private float tmg;
    private float vh;
    private int vj;
    private int vy;
    protected int sf = -16777216;
    private float gm = 12.0f;
    private float oo = -1.0f;
    private int wh = Integer.MAX_VALUE;
    private int kj = 8388611;

    public sf(Context context, boolean z) {
        this.gpj = context;
        this.lo = z;
    }

    private void gm(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        float f = this.vh;
        if (f <= 3.0f) {
            pccVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(kj.pcc(this.gpj, (f - (this.gm * 1.2f)) / 2.0f));
            pccVar.setPadding(pccVar.getPaddingLeft(), pccVar.getPaddingTop() + round, pccVar.getPaddingRight(), pccVar.getPaddingBottom() + round);
            pccVar.setLineHeight(Math.round(kj.pcc(this.gpj, this.vh)));
        }
    }

    private int oo(String str) {
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

    private int sf(String str) {
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

    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "shadowColor":
                this.hc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                this.gbb = true;
                break;
            case "shadowOffsetX":
                this.jr = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "shadowOffsetY":
                this.dax = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
            case "textAlign":
                this.kj = pcc(str2);
                break;
            case "textColor":
                this.sf = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "textStyle":
                this.vj = sf(str2);
                break;
            case "shadowBlur":
                this.nac = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textSize":
                this.gm = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "textDecoration":
                this.vy = oo(str2);
                break;
            case "fontWeight":
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                this.tmg = pcc;
                if (pcc < 1.0f || pcc > 1000.0f) {
                    this.tmg = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "text":
                this.pcc = str2;
                break;
            case "lines":
                this.qf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "ellipsis":
                this.ork = gm(str2);
                break;
            case "minTextSize":
                this.oo = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "maxLines":
                int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, Integer.MAX_VALUE);
                this.wh = pcc2 > 0 ? pcc2 : Integer.MAX_VALUE;
                break;
            case "letterSpacing":
                this.lu = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                break;
        }
    }

    private void sf(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        pccVar.setLineSpacing(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this.vh);
    }

    private void oo(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        if (this.lo) {
            if (this.gbb) {
                float f = this.nac;
                if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 1.0E-5f;
                }
                pccVar.setShadowLayer(f, this.jr, this.dax, this.hc);
                return;
            }
            return;
        }
        pccVar.setShadowLayer(this.nac, this.jr, this.dax, this.hc);
    }

    private TextUtils.TruncateAt gm(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    public void pcc(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.pcc)) {
            pccVar.setText(TextUtils.equals("null", this.pcc) ? "" : this.pcc);
        }
        pccVar.setTextSize(1, this.gm);
        pccVar.setMinTextSize(kj.pcc(this.gpj, this.oo));
        pccVar.setTextColor(this.sf);
        pccVar.setGravity(this.kj);
        pccVar.setLines(this.qf);
        pccVar.setMaxLines(this.wh);
        int i = this.vy;
        if (i != Integer.MAX_VALUE) {
            pccVar.setPaintFlags(i);
        }
        pccVar.setEllipsize(this.ork);
        if (this.vh > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (this.lo) {
                gm(pccVar);
            } else {
                sf(pccVar);
            }
        }
        pccVar.setTypeface(pcc((int) this.tmg));
        oo(pccVar);
        float pcc = kj.pcc(this.gpj, this.gm);
        if (pcc > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            pccVar.setLetterSpacing(this.lu / pcc);
        }
        pccVar.setIncludeFontPadding(false);
    }

    private int pcc(String str) {
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

    private Typeface pcc(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
        return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }
}

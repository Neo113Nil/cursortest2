package com.bytedance.adsdk.ugeno.vj;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.bytedance.adsdk.ugeno.vj.vj;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends com.bytedance.adsdk.ugeno.sf.pcc<vj> {
    private int gga;
    private int rc;
    private int uae;
    private int vd;
    private int xf;

    public wh(Context context) {
        super(context);
    }

    private int dax(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 4;
            case -1720785339:
                return str.equals("baseline") ? 3 : 4;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 4;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 4;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 4;
            default:
                return 4;
        }
    }

    private int gbb(String str) {
        str.getClass();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int jr(String str) {
        str.getClass();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    private int nac(String str) {
        switch (str.hashCode()) {
            case -1881872635:
                str.equals("stretch");
                return 5;
            case -1364013995:
                return str.equals(TtmlNode.CENTER) ? 2 : 5;
            case -932331738:
                return str.equals("space_around") ? 4 : 5;
            case 1384876188:
                return str.equals("flex_start") ? 0 : 5;
            case 1682480591:
                return str.equals("space_between") ? 3 : 5;
            case 1744442261:
                return str.equals("flex_end") ? 1 : 5;
            default:
                return 5;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public vj pcc() {
        vj vjVar = new vj(this.sf);
        vjVar.pcc(this);
        return vjVar;
    }

    public int hc(String str) {
        str.getClass();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public pcc.C0035pcc ork() {
        return new pcc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.pcc(str, str2);
        str.getClass();
        switch (str) {
            case "alignItems":
                this.gga = dax(str2);
                break;
            case "flexDirection":
                this.vd = hc(str2);
                break;
            case "alignContent":
                this.rc = nac(str2);
                break;
            case "flexWrap":
                this.xf = gbb(str2);
                break;
            case "justifyContent":
                this.uae = jr(str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((vj) this.vj).setFlexDirection(this.vd);
        ((vj) this.vj).setFlexWrap(this.xf);
        ((vj) this.vj).setJustifyContent(this.uae);
        ((vj) this.vj).setAlignItems(this.gga);
        ((vj) this.vj).setAlignContent(this.rc);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends pcc.C0035pcc {
        public int atb;
        public int jsj;
        public int lq;
        public float mk;
        public int mu;
        public int pq;
        public float tsz;
        public float ye;
        public int zti;

        public pcc(com.bytedance.adsdk.ugeno.sf.pcc pccVar) {
            super(pccVar);
            this.jsj = 1;
            this.tsz = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.mk = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.atb = -1;
            this.ye = -1.0f;
            this.lq = -1;
            this.zti = -1;
            this.pq = 16777215;
            this.mu = 16777215;
        }

        private float gm(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private float oo(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int vj(String str) {
            boolean z;
            str.getClass();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -1364013995:
                    if (str.equals(TtmlNode.CENTER)) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    return 4;
                case true:
                    return 3;
                case true:
                    return 2;
                case true:
                    return 0;
                case true:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0035pcc
        public void pcc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.pcc(context, str, str2);
            str.getClass();
            switch (str) {
                case "flexBasisPercent":
                    this.ye = oo(str2);
                    break;
                case "order":
                    this.jsj = pcc(str2);
                    break;
                case "flexShrink":
                    this.mk = gm(str2);
                    break;
                case "flexGrow":
                    this.tsz = sf(str2);
                    break;
                case "alignSelf":
                    this.atb = vj(str2);
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0035pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public vj.pcc pcc() {
            vj.pcc pccVar = new vj.pcc((int) this.pcc, (int) this.sf);
            ((ViewGroup.MarginLayoutParams) pccVar).leftMargin = (int) this.wh;
            ((ViewGroup.MarginLayoutParams) pccVar).rightMargin = (int) this.qf;
            ((ViewGroup.MarginLayoutParams) pccVar).topMargin = (int) this.kj;
            ((ViewGroup.MarginLayoutParams) pccVar).bottomMargin = (int) this.vy;
            pccVar.gm(this.jsj);
            pccVar.oo(this.atb);
            pccVar.pcc(this.tsz);
            pccVar.sf(this.mk);
            pccVar.gm(this.ye);
            return pccVar;
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0035pcc
        public String toString() {
            return "LayoutParams{mWidth=" + this.pcc + ", mHeight=" + this.sf + ", mMargin=" + this.vj + ", mMarginLeft=" + this.wh + ", mMarginRight=" + this.qf + ", mMarginTop=" + this.kj + ", mMarginBottom=" + this.vy + ", mParams=" + this.yt + ", mOrder=" + this.jsj + ", mFlexGrow=" + this.tsz + ", mFlexShrink=" + this.mk + ", mAlignSelf=" + this.atb + ", mFlexBasisPercent=" + this.ye + ", mMinWidth=" + this.lq + ", mMinHeight=" + this.zti + ", mMaxWidth=" + this.pq + ", mMaxHeight=" + this.mu + "} " + super.toString();
        }

        private float sf(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }

        private int pcc(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
    }
}

package com.bytedance.adsdk.ugeno.sf;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc<E extends ViewGroup> extends gm {
    protected List<gm<View>> pcc;

    public pcc(Context context, pcc pccVar) {
        super(context, pccVar);
        this.pcc = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public gm gm(String str) {
        gm<View> qf;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.tmg) && this.bg == 0) {
            return this;
        }
        if (this.bg != 0) {
            return null;
        }
        for (gm<View> gmVar : this.pcc) {
            if (gmVar != null && (qf = gmVar.qf(str)) != null) {
                return qf;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public gm oo(String str) {
        gm<View> kj;
        if (!TextUtils.isEmpty(str) && tmg(str) != null) {
            return this;
        }
        for (gm<View> gmVar : this.pcc) {
            if (gmVar != null && (kj = gmVar.kj(str)) != null) {
                return kj;
            }
        }
        return null;
    }

    public C0035pcc ork() {
        return new C0035pcc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public gm pcc(String str) {
        gm<View> vj;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.vh)) {
            return this;
        }
        for (gm<View> gmVar : this.pcc) {
            if (gmVar != null && (vj = gmVar.vj(str)) != null) {
                return vj;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public gm sf(String str) {
        gm<View> wh;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.tmg)) {
            return this;
        }
        for (gm<View> gmVar : this.pcc) {
            if (gmVar != null && (wh = gmVar.wh(str)) != null) {
                return wh;
            }
        }
        return null;
    }

    public List<gm<View>> vy() {
        return this.pcc;
    }

    public pcc(Context context) {
        this(context, null);
    }

    public void pcc(gm gmVar, ViewGroup.LayoutParams layoutParams) {
        if (gmVar == null) {
            return;
        }
        this.pcc.add(gmVar);
        View vh = gmVar.vh();
        if (vh != null) {
            ((ViewGroup) this.vj).addView(vh, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
    }

    public void pcc(gm gmVar) {
        if (gmVar == null) {
            return;
        }
        this.pcc.add(gmVar);
        View vh = gmVar.vh();
        if (vh != null) {
            ((ViewGroup) this.vj).addView(vh);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.adsdk.ugeno.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0035pcc {
        protected boolean dax;
        protected boolean fum;
        protected float gbb;
        protected boolean gpj;
        protected float hc;
        protected boolean jr;
        protected float kj;
        protected boolean lo;
        protected boolean lu;
        protected boolean nac;
        protected boolean of;
        protected float ork;
        protected float qf;
        protected pcc qy;
        protected float tmg;
        protected boolean tz;
        protected float vh;
        protected float vj;
        protected float vy;
        protected float wh;
        protected ViewGroup.LayoutParams yt;
        protected float pcc = -2.0f;
        protected float sf = -2.0f;
        protected float gm = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        protected float oo = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

        public C0035pcc(pcc pccVar) {
            this.qy = pccVar;
        }

        public void pcc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            str.getClass();
            switch (str) {
                case "paddingLeft":
                    this.vh = kj.pcc(context, str2);
                    this.dax = true;
                    break;
                case "minWidth":
                    this.gm = kj.pcc(context, str2);
                    break;
                case "height":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.sf = kj.pcc(context, str2);
                            break;
                        } else {
                            this.sf = -2.0f;
                            break;
                        }
                    } else {
                        this.sf = -1.0f;
                        break;
                    }
                case "margin":
                    this.vj = kj.pcc(context, str2);
                    break;
                case "marginTop":
                    this.kj = kj.pcc(context, str2);
                    this.tz = true;
                    break;
                case "padding":
                    this.ork = kj.pcc(context, str2);
                    this.jr = true;
                    break;
                case "marginBottom":
                    this.vy = kj.pcc(context, str2);
                    this.of = true;
                    break;
                case "minHeight":
                    this.oo = kj.pcc(context, str2);
                    break;
                case "paddingTop":
                    this.tmg = kj.pcc(context, str2);
                    this.lu = true;
                    break;
                case "width":
                    if (!TextUtils.equals(str2, "match_parent")) {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.pcc = kj.pcc(context, str2);
                            break;
                        } else {
                            this.pcc = -2.0f;
                            break;
                        }
                    } else {
                        this.pcc = -1.0f;
                        break;
                    }
                case "paddingBottom":
                    this.gbb = kj.pcc(context, str2);
                    this.gpj = true;
                    break;
                case "paddingRight":
                    this.hc = kj.pcc(context, str2);
                    this.nac = true;
                    break;
                case "marginRight":
                    this.qf = kj.pcc(context, str2);
                    this.fum = true;
                    break;
                case "marginLeft":
                    this.wh = kj.pcc(context, str2);
                    this.lo = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.pcc + ", mHeight=" + this.sf + ", mMargin=" + this.vj + ", mMarginLeft=" + this.wh + ", mMarginRight=" + this.qf + ", mMarginTop=" + this.kj + ", mMarginBottom=" + this.vy + ", mParams=" + this.yt + '}';
        }

        public ViewGroup.LayoutParams pcc() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.pcc, (int) this.sf);
            marginLayoutParams.leftMargin = (int) (this.lo ? this.wh : this.vj);
            marginLayoutParams.rightMargin = (int) (this.fum ? this.qf : this.vj);
            marginLayoutParams.topMargin = (int) (this.tz ? this.kj : this.vj);
            marginLayoutParams.bottomMargin = (int) (this.of ? this.vy : this.vj);
            return marginLayoutParams;
        }
    }
}

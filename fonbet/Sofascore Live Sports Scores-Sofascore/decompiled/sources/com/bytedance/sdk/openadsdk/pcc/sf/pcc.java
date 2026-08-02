package com.bytedance.sdk.openadsdk.pcc.sf;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private WeakReference<com.bytedance.sdk.openadsdk.core.gbb.wh> gbb;
    private final String gm;
    private boolean hc = false;
    private PAGMediaView kj;
    private boolean oo;
    private PAGMediaView ork;
    protected final of pcc;
    private com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm qf;
    private final Context sf;
    private com.bytedance.sdk.openadsdk.core.gm.sf tmg;
    private com.bytedance.sdk.openadsdk.core.gm.pcc vh;
    private WeakReference<com.bytedance.sdk.openadsdk.core.jr.sf.wh> vj;
    private fum vy;
    private sf wh;

    public pcc(Context context, of ofVar, String str) {
        this.sf = context;
        this.pcc = ofVar;
        this.gm = str;
    }

    private PAGMediaView gbb() {
        boolean vj = of.vj(this.pcc);
        com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar = this.qf;
        if (!vj) {
            if (gmVar == null) {
                return null;
            }
            fum oo = gmVar.oo();
            oo.setTag(520093762, Boolean.TRUE);
            if (!this.hc) {
                this.qf.vj();
            }
            this.hc = true;
            return pcc(oo);
        }
        if (gmVar == null || !(gmVar instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf)) {
            return null;
        }
        lo loVar = (lo) gmVar.oo();
        loVar.setTag(520093762, Boolean.TRUE);
        if (!this.hc) {
            this.qf.vj();
        }
        this.hc = true;
        return pcc(loVar);
    }

    private PAGMediaView pcc(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        fum fumVar = this.vy;
        if (fumVar != null) {
            fumVar.setClickListener(null);
            this.vy.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.tmg;
        if (sfVar != null && (sfVar instanceof ork) && (view instanceof fum)) {
            ((fum) view).setClickListener((ork) sfVar);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.vh;
        if (pccVar != null && (pccVar instanceof vy) && (view instanceof fum)) {
            ((fum) view).setClickCreativeListener((vy) pccVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.sf) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.3
            private void pcc(boolean z) {
                Integer num = this.pcc;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(num), z ? 4 : 8);
                }
                of ofVar = pcc.this.pcc;
                if (ofVar != null) {
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(ofVar, z);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.oo.pcc(this, pcc.this.pcc);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof fum) {
                    return;
                }
                pcc(z);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                pcc.this.pcc(pAGVideoAdListener);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof fum) {
            this.vy = (fum) view;
        }
        return pAGMediaView;
    }

    private String sf(of ofVar) {
        return !TextUtils.isEmpty(ofVar.gmh()) ? ofVar.gmh() : !TextUtils.isEmpty(ofVar.lc()) ? ofVar.lc() : "";
    }

    public PAGImageItem gm() {
        of ofVar = this.pcc;
        if (ofVar == null || ofVar.zk() == null) {
            return null;
        }
        return new PAGImageItem(this.pcc.zk().gm(), this.pcc.zk().sf(), this.pcc.zk().pcc(), (float) this.pcc.zk().oo());
    }

    public void hc() {
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.gbb.wh> weakReference = this.gbb;
        if (weakReference == null || (whVar = weakReference.get()) == null) {
            return;
        }
        whVar.pcc(13);
    }

    public PAGMediaView kj() {
        return this.ork;
    }

    public String oo() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return pcc(ofVar);
        }
        return null;
    }

    public View ork() {
        if (lu.pcc() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(lu.pcc()) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.4
            int pcc = 0;
            int sf = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                try {
                    Object parent = getParent();
                    if (parent == null || this.pcc == 0 || this.sf == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i5 = this.pcc;
                    if (width < i5 || height < this.sf) {
                        float min = Math.min(height / this.sf, width / i5);
                        int i6 = (width - this.pcc) / 2;
                        if (min != 1.0f) {
                            setScaleX(min);
                            setScaleY(min);
                            setTranslationX(i6);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i, int i2) {
                int i3 = this.pcc;
                if (i3 == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE), i2);
                    i3 = getMeasuredWidth();
                    this.pcc = i3;
                    this.sf = this.containerHeight;
                }
                setMeasuredDimension(i3, this.sf);
            }
        };
        pAGLogoView.initData(this.pcc);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pcc.this.tmg();
            }
        });
        return pAGLogoView;
    }

    public PAGMediaView qf() {
        PAGMediaView vy;
        com.bytedance.sdk.openadsdk.utils.sf.pcc(this.pcc);
        if (this.pcc.ei() == 2) {
            vy = gbb();
            pcc(vy);
        } else {
            vy = vy();
        }
        if (vy != null) {
            vy.setMrcTrackerKey(com.bytedance.sdk.openadsdk.qy.sf.vj.sf(this.pcc));
        } else {
            vy = new PAGMediaView(this.sf) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.oo.pcc(this, pcc.this.pcc);
                }
            };
        }
        if (vy instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) vy).setMaterialMeta(this.pcc);
        }
        this.ork = vy;
        return vy;
    }

    public void tmg() {
        if (this.sf != null) {
            if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                IABLandingPageActivity.pcc(this.sf, this.pcc, this.gm);
            } else {
                TTWebsiteActivity.pcc(this.sf, this.pcc, this.gm);
            }
        }
    }

    public View vh() {
        of ofVar;
        if (lu.pcc() == null || (ofVar = this.pcc) == null || !ofVar.on() || !this.pcc.of()) {
            return null;
        }
        ImageView imageView = new ImageView(lu.pcc());
        com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(lu.pcc(), 14.0f, true), imageView, this.pcc);
        return imageView;
    }

    public String vj() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return sf(ofVar);
        }
        return null;
    }

    public PAGMediaView vy() {
        if (!of.vj(this.pcc)) {
            List<com.bytedance.sdk.openadsdk.core.model.lu> by = this.pcc.by();
            if (by == null || by.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.sf);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.openadsdk.core.model.lu luVar = by.get(0);
            if (luVar != null) {
                com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(this.pcc, luVar.pcc(), imageView));
            }
            PAGMediaView pcc = pcc(imageView);
            if (this.vh == null || !vh.sf().oo(String.valueOf(this.pcc.kot()))) {
                pcc.setOnClickListener(null);
                pcc.setOnTouchListener(null);
            } else {
                pcc.setOnClickListener(this.vh);
                pcc.setOnTouchListener(this.vh);
            }
            pcc.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.kj;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.kj.setOnTouchListener(null);
            }
            this.kj = pcc;
            return pcc;
        }
        sf sfVar = this.wh;
        if (sfVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View vj = sfVar.vj();
        if (vj == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (vj.getParent() instanceof ViewGroup) {
            ((ViewGroup) vj.getParent()).removeView(vj);
        }
        PAGMediaView pAGMediaView2 = this.kj;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.kj.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.sf, vj, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.vh == null || !vh.sf().oo(String.valueOf(this.pcc.kot()))) {
            com.bytedance.sdk.openadsdk.core.gm.gm gmVar = new com.bytedance.sdk.openadsdk.core.gm.gm() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.2
                @Override // com.bytedance.sdk.openadsdk.core.gm.gm
                public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(gmVar);
            pAGVideoMediaView.setOnTouchListener(gmVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.vh);
            pAGVideoMediaView.setOnTouchListener(this.vh);
        }
        this.kj = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    public String wh() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return ofVar.bgf();
        }
        return null;
    }

    public fum sf() {
        return this.vy;
    }

    private gm sf(final PAGVideoAdListener pAGVideoAdListener) {
        return new gm() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.6
            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void gm(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void pcc(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void sf(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void pcc(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar) {
        this.qf = gmVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar) {
        this.vj = new WeakReference<>(whVar);
    }

    public void pcc(boolean z) {
        this.oo = z;
    }

    public PAGMediaView pcc() {
        return this.kj;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.vh = pccVar;
    }

    private String pcc(of ofVar) {
        if (ofVar.xfm() != null && !TextUtils.isEmpty(ofVar.xfm().sf())) {
            return ofVar.xfm().sf();
        }
        if (!TextUtils.isEmpty(ofVar.ofe())) {
            return ofVar.ofe();
        }
        if (!TextUtils.isEmpty(ofVar.gmh())) {
            return ofVar.gmh();
        }
        return "";
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar) {
        this.tmg = sfVar;
    }

    private void pcc(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    public void pcc(sf sfVar) {
        this.wh = sfVar;
    }

    public void pcc(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar;
        if (this.pcc.ei() == 2 && of.vj(this.pcc) && (gmVar = this.qf) != null && (gmVar instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf)) {
            lo loVar = (lo) gmVar.oo();
            if (loVar != null) {
                loVar.setVideoAdListener(sf(pAGVideoAdListener));
                return;
            }
            return;
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            sfVar.pcc(sf(pAGVideoAdListener));
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.wh whVar) {
        this.gbb = new WeakReference<>(whVar);
    }
}

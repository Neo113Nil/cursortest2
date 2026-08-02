package com.bytedance.sdk.openadsdk.core.hc.gm;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.adexpress.sf.vh;
import com.bytedance.sdk.component.adexpress.vj.vj;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.nac;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.ork.dax;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.utils.lo;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class oo implements vh, gm<qf> {
    private qf gm;
    private final boolean kj;
    private mu oo;
    private pcc ork;
    private Context pcc;
    private int qf;
    private of sf;
    private String vj;
    private boolean vy = false;
    private com.bytedance.sdk.openadsdk.core.hc.gm.pcc wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface pcc {
        void qf();
    }

    public oo(Context context, of ofVar, boolean z) {
        this.qf = 1;
        this.pcc = context;
        this.sf = ofVar;
        this.qf = ofVar.ial();
        this.kj = z;
        of ofVar2 = this.sf;
        if (z) {
            this.vj = nac.sf(ofVar2).pcc(this.qf == 1);
        } else {
            this.vj = nac.gm(ofVar2).pcc(this.qf == 1);
        }
    }

    private void kj() {
        mu muVar = new mu(this.pcc);
        this.oo = muVar;
        muVar.sf(this.gm).pcc(this.sf).gm(this.sf.esn()).oo(this.sf.hl()).vj(this.sf.ray()).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, this.sf, null, null)).pcc(this).pcc(this.gm);
    }

    private void pcc(qf qfVar) {
        if (qfVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.pcc).pcc(false).pcc(qfVar.getWebView());
            qfVar.setVerticalScrollBarEnabled(false);
            qfVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(qfVar);
            qfVar.hc();
            qfVar.setUserAgentString(lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
            qfVar.setMixedContentMode(0);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setDatabaseEnabled(true);
            qfVar.setAllowFileAccess(false);
            qfVar.setSupportZoom(true);
            qfVar.setBuiltInZoomControls(true);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            qfVar.setUseWideViewPort(true);
            qfVar.setCacheMode(-1);
        } catch (Exception unused) {
        }
    }

    private void qf() {
        oo ooVar;
        this.gm.setBackgroundColor(0);
        this.gm.setBackgroundResource(R.color.transparent);
        this.gm.setVisibility(8);
        pcc(this.gm);
        if (this.sf != null) {
            ooVar = this;
            this.gm.setWebViewClient(new wh(this.pcc, this.oo, this.sf.esn(), null, false) { // from class: com.bytedance.sdk.openadsdk.core.hc.gm.oo.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (oo.this.ork != null) {
                        oo.this.ork.qf();
                    }
                }
            });
        } else {
            ooVar = this;
        }
        vj.pcc().pcc(ooVar.gm, ooVar.oo);
        ooVar.gm.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(ooVar.oo));
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void gm() {
        mu muVar = this.oo;
        if (muVar != null) {
            muVar.gm();
        }
        this.oo = null;
        try {
            qf qfVar = this.gm;
            if (qfVar != null) {
                ViewGroup viewGroup = (ViewGroup) qfVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.gm);
                }
                this.gm.jr();
            }
        } catch (Throwable unused) {
        }
        if (this.ork != null) {
            this.ork = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void sf() {
        boolean isEmpty = TextUtils.isEmpty(this.vj);
        qf qfVar = this.gm;
        if (isEmpty) {
            qfVar.setVisibility(8);
        } else {
            qfVar.a_(this.vj);
        }
    }

    public mu vj() {
        return this.oo;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    /* renamed from: wh, reason: merged with bridge method [inline-methods] */
    public qf oo() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc() {
        this.gm = new qf(this.pcc, qf.gm.EASY_PLAYABLE);
        qf();
        kj();
        if (this.kj) {
            return;
        }
        lrr.pcc(this.gm, false, this.sf.tqg(), false, new lrr.sf() { // from class: com.bytedance.sdk.openadsdk.core.hc.gm.oo.1
            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc() {
                oo.this.pcc(true);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void sf() {
                oo.this.pcc(false);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(boolean z) {
                oo.this.pcc(z);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
            public void pcc(View view, boolean z) {
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc(com.bytedance.sdk.openadsdk.core.hc.gm.pcc pccVar) {
        this.wh = pccVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(gbb gbbVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.gm.gm
    public void pcc(dax daxVar) {
        mu muVar = this.oo;
        if (muVar != null) {
            muVar.pcc(daxVar);
        }
    }

    public void pcc(boolean z) {
        if (z == this.vy) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", !z ? 1 : 0);
        } catch (Exception e) {
            e.getMessage();
        }
        this.oo.pcc("visibleStateChange", jSONObject);
        this.vy = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(View view, int i, com.bytedance.sdk.component.adexpress.gm gmVar) {
        com.bytedance.sdk.openadsdk.core.hc.gm.pcc pccVar = this.wh;
        if (pccVar != null) {
            pccVar.pcc(view, i, gmVar);
        }
    }

    public void pcc(pcc pccVar) {
        this.ork = pccVar;
    }
}

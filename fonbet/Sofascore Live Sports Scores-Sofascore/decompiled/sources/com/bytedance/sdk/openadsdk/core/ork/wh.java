package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.ork.gm;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class wh extends com.bytedance.sdk.component.vy.qf implements gm.InterfaceC0092gm {
    private long dax;
    private sf gbb;
    private List<String> hc;
    private int jr;
    private jsj kj;
    protected boolean oo;
    private com.bytedance.sdk.openadsdk.core.model.of ork;
    AtomicBoolean qf;
    private int tmg;
    private String vh;
    protected boolean vj;
    private gm vy;
    AtomicBoolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        View pcc();

        void pcc(int i, int i2);

        void pcc(View view, int i);

        void sf();
    }

    public wh(Context context) {
        super(context, qf.gm.DSP);
        this.oo = false;
        this.vj = false;
        this.wh = new AtomicBoolean(false);
        this.qf = new AtomicBoolean(false);
        this.tmg = 0;
    }

    private void lo() {
        if (this.hc == null) {
            com.bytedance.sdk.openadsdk.oo.gm.sf(this.ork, this.vh, "dsp_html_success_url", (JSONObject) null);
        } else {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("dsp_html_error_url") { // from class: com.bytedance.sdk.openadsdk.core.ork.wh.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (wh.this.hc != null && wh.this.qf.compareAndSet(false, true)) {
                            JSONObject jSONObject = new JSONObject();
                            JSONArray jSONArray = new JSONArray();
                            Iterator it = wh.this.hc.iterator();
                            while (it.hasNext()) {
                                jSONArray.put((String) it.next());
                            }
                            jSONObject.put("url", jSONArray);
                            com.bytedance.sdk.openadsdk.oo.gm.sf(wh.this.ork, wh.this.vh, "dsp_html_error_url", jSONObject);
                            wh.this.hc = null;
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public void gpj() {
        this.wh.set(false);
        String zgt = this.ork.zgt();
        if (TextUtils.isEmpty(zgt)) {
            return;
        }
        String pcc2 = com.bytedance.sdk.openadsdk.core.gbb.vj.pcc(zgt);
        String str = TextUtils.isEmpty(pcc2) ? zgt : pcc2;
        this.tmg = 0;
        pcc(null, str, "text/html", C.UTF8_NAME, null);
        this.dax = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.component.vy.qf
    public void jr() {
        this.vy.sf();
        super.jr();
    }

    public void lu() {
        sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.sf();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.dax);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.ork, this.vh, "render_html_success", jSONObject);
    }

    @Override // com.bytedance.sdk.component.vy.qf, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.oo) {
            this.vy.pcc(getWebView());
        }
    }

    @Override // com.bytedance.sdk.component.vy.qf, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.vy.pcc();
        super.onDetachedFromWindow();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rate", this.jr / 100.0f);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.ork, this.vh, "load_rate", jSONObject);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        this.vj = z;
        this.vy.pcc(z);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.gm.InterfaceC0092gm
    public void pcc(String str) {
        boolean z;
        if (TextUtils.isEmpty(str) || this.ork == null || !this.kj.sf()) {
            return;
        }
        int pcc2 = kun.pcc(this.vh);
        View view = null;
        if (!com.bytedance.sdk.component.utils.lu.pcc(str) && (this.ork.dt() == null || TextUtils.isEmpty(this.ork.dt().pcc()))) {
            com.bytedance.sdk.openadsdk.core.model.hc hcVar = new com.bytedance.sdk.openadsdk.core.model.hc();
            hcVar.pcc(str);
            this.ork.pcc(hcVar);
            str = null;
        }
        this.ork.oo(true);
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.ork;
        if (ofVar == null || ofVar.dt() == null || TextUtils.isEmpty(this.ork.dt().pcc())) {
            z = false;
        } else {
            z = rnn.pcc(getContext(), this.ork, pcc2, this.vh, true, (Map<String, Object>) null);
            if (!z && !TextUtils.isEmpty(this.ork.dt().sf())) {
                str = this.ork.dt().sf();
                com.bytedance.sdk.openadsdk.oo.gm.pcc(this.ork, this.vh, "open_fallback_url", (Map<String, Object>) null);
            }
        }
        String str2 = str;
        if (!z) {
            if (TextUtils.isEmpty(str2)) {
                return;
            } else {
                rnn.pcc(getContext(), this.ork, pcc2, (PAGNativeAd) null, (com.bytedance.sdk.openadsdk.core.oo.pcc) null, this.vh, true, str2);
            }
        }
        if (this.kj != null) {
            sf sfVar = this.gbb;
            if (sfVar != null) {
                view = sfVar.pcc();
                this.gbb.pcc(this, 2);
            }
            com.bytedance.sdk.openadsdk.core.model.tmg pcc3 = this.kj.pcc(getContext(), view);
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", this.ork, pcc3, this.vh, true, (Map<String, Object>) hashMap, this.kj.sf() ? 1 : 2);
        }
        jsj jsjVar = this.kj;
        if (jsjVar != null) {
            jsjVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.gm.InterfaceC0092gm
    public void sf(String str) {
        List list = this.hc;
        if (list == null) {
            list = new ArrayList();
            this.hc = list;
        }
        list.add(str);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends qf.pcc {
        public static final Set<String> pcc = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.ork.wh.pcc.1
            {
                add(".jpeg");
                add(".png");
                add(".bmp");
                add(".gif");
                add(".jpg");
                add(".webp");
            }
        };
        gm.InterfaceC0092gm sf;

        public pcc(gm.InterfaceC0092gm interfaceC0092gm) {
            this.sf = interfaceC0092gm;
        }

        private void pcc(String str) {
            int lastIndexOf;
            gm.InterfaceC0092gm interfaceC0092gm;
            if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(".")) > 0) {
                if (!pcc.contains(str.substring(lastIndexOf).toLowerCase()) || (interfaceC0092gm = this.sf) == null) {
                    return;
                }
                interfaceC0092gm.sf(str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            gm.InterfaceC0092gm interfaceC0092gm = this.sf;
            if (interfaceC0092gm != null) {
                interfaceC0092gm.pcc();
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                return;
            }
            pcc(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest == null || webResourceResponse == null || webResourceRequest.getUrl() == null) {
                return;
            }
            if (webResourceRequest.isForMainFrame()) {
                pcc(webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode(), "");
            }
            pcc(webResourceRequest.getUrl().toString());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            this.sf.pcc(str);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        private void pcc(String str, int i, String str2) {
            gm.InterfaceC0092gm interfaceC0092gm = this.sf;
            if (interfaceC0092gm != null) {
                interfaceC0092gm.pcc(106, i);
            }
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class gm {
        protected int pcc = 0;
        private com.bytedance.sdk.openadsdk.core.gbb.wh sf = com.bytedance.sdk.openadsdk.core.gbb.wh.pcc();

        public void pcc(WebView webView) {
            if (webView != null && this.pcc == 0) {
                com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.sf;
                if (whVar == null) {
                    whVar = com.bytedance.sdk.openadsdk.core.gbb.wh.pcc();
                    this.sf = whVar;
                }
                whVar.pcc(webView);
                this.sf.sf();
                this.pcc = 1;
            }
        }

        public void sf() {
            pcc();
        }

        public void pcc(boolean z) {
            com.bytedance.sdk.openadsdk.core.gbb.wh whVar;
            if (this.pcc == 1 && z && (whVar = this.sf) != null) {
                whVar.gm();
                this.pcc = 3;
            }
        }

        public void pcc(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
            com.bytedance.sdk.openadsdk.core.gbb.wh whVar = this.sf;
            if (whVar != null) {
                whVar.pcc(view, friendlyObstructionPurpose);
            }
        }

        public void pcc() {
            com.bytedance.sdk.openadsdk.core.gbb.wh whVar;
            int i = this.pcc;
            if (i != 0 && i != 4 && (whVar = this.sf) != null) {
                whVar.oo();
            }
            this.pcc = 4;
            this.sf = null;
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, sf sfVar, String str) {
        this.gbb = sfVar;
        this.ork = ofVar;
        this.vh = str;
        this.vy = new gm();
        this.kj = new jsj(getContext());
        setWebViewClient(new pcc(this));
        setWebChromeClient(new WebChromeClient() { // from class: com.bytedance.sdk.openadsdk.core.ork.wh.1
            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                wh.this.jr = i;
                super.onProgressChanged(webView, i);
                if (i >= 100) {
                    wh.this.pcc();
                }
            }
        });
        com.bytedance.sdk.component.utils.vy.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.wh.2
            @Override // java.lang.Runnable
            public void run() {
                WebView webView = wh.this.getWebView();
                if (webView != null) {
                    webView.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.ork.wh.2.1
                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            wh.this.kj.onTouchEvent(motionEvent);
                            return false;
                        }
                    });
                }
            }
        });
    }

    public void pcc(@Nullable View view, @Nullable FriendlyObstructionPurpose friendlyObstructionPurpose) {
        this.vy.pcc(view, friendlyObstructionPurpose);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.gm.InterfaceC0092gm
    public void pcc(int i, int i2) {
        sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.pcc(i, i2);
        }
        this.tmg = i2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", i2);
            jSONObject.put("render_duration", SystemClock.elapsedRealtime() - this.dax);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(this.ork, this.vh, "render_html_fail", jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.gm.InterfaceC0092gm
    public void pcc() {
        if (this.wh.compareAndSet(false, true)) {
            this.oo = true;
            this.vy.pcc(getWebView());
            this.vy.pcc(this.vj);
            lu();
            lo();
        }
    }
}

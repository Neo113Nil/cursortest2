package com.bytedance.sdk.openadsdk.tz.pcc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.pcc.jr;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.ork;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.core.widget.vy;
import com.bytedance.sdk.openadsdk.oo.gpj;
import com.bytedance.sdk.openadsdk.tz.kj;
import com.bytedance.sdk.openadsdk.tz.qf;
import com.bytedance.sdk.openadsdk.tz.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class pcc {
    private AtomicBoolean dax;
    private boolean fum;
    private volatile boolean gbb;
    private final of gm;
    private com.bytedance.sdk.openadsdk.core.gm.pcc gpj;
    private volatile boolean hc;
    private int jr;
    private InterfaceC0129pcc jsj;
    private String kj;
    private sf lo;
    private vy lu;
    private AtomicBoolean nac;
    private int of;
    private final int oo;
    private kj ork;
    protected qf pcc;
    private mu qf;
    private StringBuilder qy;
    private final Context sf;
    private boolean tmg;
    private int tz;

    @Nullable
    private com.bytedance.sdk.openadsdk.hc.qf vh;
    private final FrameLayout vj;
    private final String vy;

    @Nullable
    private ork wh;
    private long yt;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.openadsdk.tz.pcc.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0129pcc {
        void pcc(int i);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc();
    }

    public pcc(Context context, of ofVar, int i, boolean z, FrameLayout frameLayout, boolean z2, int i2) {
        this.tmg = true;
        this.dax = new AtomicBoolean(false);
        this.nac = new AtomicBoolean(false);
        this.of = 0;
        this.yt = 0L;
        this.sf = context;
        this.gm = ofVar;
        this.tz = i2;
        if (ofVar != null && ofVar.oo() != null && ofVar.oo().vj() != null) {
            this.of = ofVar.oo().vj().size();
        }
        this.oo = i;
        String gm = kun.gm(ofVar.gqd().getDurationSlotType());
        this.kj = gm;
        int pcc = kun.pcc(gm);
        this.fum = z2;
        if (z2) {
            this.kj = kun.sf(pcc);
        }
        this.vy = atb.tmg(ofVar);
        this.vj = frameLayout;
        pcc(frameLayout);
        pcc(pcc);
        gm(z);
        kj();
    }

    private void gm(boolean z) {
        jr sf2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(BidResponsedEx.KEY_CID, this.gm.esn());
            jSONObject.put("log_extra", this.gm.hl());
        } catch (Throwable unused) {
        }
        if (com.bytedance.sdk.openadsdk.core.ork.sf().jr()) {
            com.bytedance.sdk.openadsdk.tz.qf.pcc(new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.1
            });
        }
        kj pcc = kj.pcc(lu.pcc(), this.pcc.getWebView(), new com.bytedance.sdk.openadsdk.tz.gm() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.2
            @Override // com.bytedance.sdk.openadsdk.tz.gm
            public void pcc(String str, JSONObject jSONObject2) {
                if (pcc.this.qf != null) {
                    pcc.this.qf.pcc(str, jSONObject2);
                }
            }
        }, new com.bytedance.sdk.openadsdk.tz.pcc() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.3
            @Override // com.bytedance.sdk.openadsdk.tz.pcc
            public void gm() {
                if (pcc.this.qf.gbb() != null) {
                    pcc.this.qf.gbb().pcc(true);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tz.pcc
            public com.bytedance.sdk.openadsdk.tz.oo pcc() {
                String kj = com.bytedance.sdk.openadsdk.common.gm.kj();
                kj.getClass();
                switch (kj) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.tz.oo.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tz.pcc
            public void sf() {
                pcc.this.qf.oo(true);
                if (pcc.this.vh != null) {
                    pcc.this.vh.pcc();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.tz.pcc
            public void pcc(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pcc.this.gm, pcc.this.kj, "playable_track", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.3.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject gm() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (pcc.this.gm.afj()) {
                                jSONObject3.put("is_pre_render", 1);
                            }
                            return jSONObject3;
                        } catch (JSONException e) {
                            lo.gm("PlayableManager", e.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.tz.pcc
            public void pcc(int i, String str) {
                pcc.this.tmg = false;
                if (i != 2 && i != 3 && i != 4) {
                    pcc pccVar = pcc.this;
                    if (i == 5) {
                        pccVar.pcc(3, i);
                        return;
                    } else {
                        pccVar.pcc(1, 0);
                        return;
                    }
                }
                pcc.this.pcc(2, i);
            }
        });
        this.ork = pcc;
        pcc.qf(this.vy).vj(com.bytedance.sdk.openadsdk.common.gm.pcc(lu.pcc())).sf(com.bytedance.sdk.openadsdk.common.gm.qf()).pcc(com.bytedance.sdk.openadsdk.common.gm.pcc()).oo(com.bytedance.sdk.openadsdk.common.gm.wh()).gm(jSONObject).gm(atb.ork(this.gm)).oo(true).pcc(z).gm(false).pcc(atb.nac(this.gm)).sf(atb.nac(this.gm)).pcc("sdkEdition", com.bytedance.sdk.openadsdk.common.gm.gm()).vj(atb.wh(this.gm)).wh(this.kj);
        this.ork.pcc(vj.sf(this.sf));
        Set<String> vh = this.ork.vh();
        final WeakReference weakReference = new WeakReference(this.ork);
        for (String str : vh) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (sf2 = this.qf.sf()) != null) {
                sf2.pcc(str, new com.bytedance.sdk.component.pcc.oo<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.4
                    @Override // com.bytedance.sdk.component.pcc.oo
                    public JSONObject pcc(String str2, @NonNull JSONObject jSONObject2, @NonNull com.bytedance.sdk.component.pcc.vj vjVar) {
                        try {
                            kj kjVar = (kj) weakReference.get();
                            if (kjVar == null) {
                                return null;
                            }
                            return kjVar.oo(pcc(), jSONObject2);
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    private void kj() {
        wh whVar = new wh(lu.pcc(), this.qf, this.gm.esn(), null, true) { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (pcc.this.ork != null) {
                    pcc.this.ork.vy(str);
                }
                if (pcc.this.tmg) {
                    pcc.this.pcc(0, 0);
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pcc.this.gm, pcc.this.kj, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    pcc.this.tmg = false;
                    if (pcc.this.ork == null || webResourceError == null) {
                        return;
                    }
                    pcc.this.ork.wh(com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pcc.this.gm));
                    pcc.this.ork.pcc(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    pcc.this.tmg = false;
                    if (pcc.this.ork != null) {
                        pcc.this.ork.wh(com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pcc.this.gm));
                        pcc.this.ork.pcc(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (pcc.this.gm.kez() != null && !TextUtils.isEmpty(pcc.this.gm.kez().i)) {
                        if (pcc.this.ork != null) {
                            pcc.this.ork.ork(str);
                        }
                        String tmg = atb.tmg(pcc.this.gm);
                        WebResourceResponse pcc = com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pcc.this.gm.kez().i, tmg, str);
                        if (pcc == null) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        if (pcc.this.ork != null) {
                            pcc.this.ork.vh(str);
                        }
                        return pcc;
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                pcc.this.tmg = false;
                if (pcc.this.ork != null) {
                    pcc.this.ork.wh(com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pcc.this.gm));
                    pcc.this.ork.pcc(i, str, str2);
                }
            }
        };
        whVar.pcc(this.gm);
        this.pcc.setWebViewClient(whVar);
        this.pcc.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.qf) { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (pcc.this.wh == null || pcc.this.wh.getVisibility() != 0) {
                    return;
                }
                pcc.this.wh.setProgress(i);
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.sf).pcc(false).sf(false).pcc(this.pcc.getWebView());
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        qfVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
        this.pcc.setMixedContentMode(0);
    }

    private void pcc(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 3);
        this.qf = new mu(this.sf);
        String ray = this.gm.ray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", this.gm.xb());
            jSONObject.put("currentIndex", this.tz);
            jSONObject.put("totalAdCount", this.of);
        } catch (JSONException unused) {
        }
        this.qf.sf(this.pcc).pcc(this.gm).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.gm, true, jSONObject)).gm(this.gm.esn()).oo(this.gm.hl()).sf(i).vj(ray).pcc(this.pcc).sf(this.kj).pcc(hashMap).pcc(new gpj(3, this.kj, this.gm));
    }

    public void oo() {
        kj kjVar = this.ork;
        if (kjVar != null) {
            kjVar.nn();
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            qfVar.jr();
        }
        mu muVar = this.qf;
        if (muVar != null) {
            muVar.tmg();
        }
        this.yt = System.currentTimeMillis();
        this.qy = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb = this.qy;
                sb.append(stackTraceElement);
                sb.append("\n");
            }
        } catch (Throwable th) {
            lo.pcc("PlayableManager", "onDestroy() error", th);
        }
        this.pcc = null;
    }

    public void sf() {
        kj kjVar;
        if (!this.dax.get() || (kjVar = this.ork) == null) {
            return;
        }
        kjVar.gm(true);
    }

    public boolean wh() {
        mu muVar = this.qf;
        if (muVar != null) {
            return muVar.wh();
        }
        return false;
    }

    public mu qf() {
        return this.qf;
    }

    public boolean vj() {
        return this.hc;
    }

    public void sf(boolean z) {
        kj kjVar = this.ork;
        if (kjVar != null) {
            kjVar.vj(z);
        }
    }

    public pcc(Context context, of ofVar, int i, boolean z, FrameLayout frameLayout, boolean z2) {
        this(context, ofVar, i, z, frameLayout, z2, 0);
    }

    public pcc(Context context, of ofVar, int i, boolean z, FrameLayout frameLayout) {
        this(context, ofVar, i, z, frameLayout, false);
    }

    public void pcc(InterfaceC0129pcc interfaceC0129pcc) {
        this.jsj = interfaceC0129pcc;
    }

    private void pcc(FrameLayout frameLayout) {
        com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(this.sf, true, qf.gm.PLAYABLE);
        this.pcc = qfVar;
        qfVar.vj();
        this.pcc.setLayerType(2, null);
        this.pcc.setVisibility(4);
        this.pcc.setBackgroundColor(-16777216);
        this.pcc.setEnabled(true);
        this.pcc.setTag(this.kj);
        this.pcc.setMaterialMeta(this.gm.lr());
        this.pcc.setLandingPage(true);
        frameLayout.addView(this.pcc, new FrameLayout.LayoutParams(-1, -1));
        vy vyVar = new vy(this.sf);
        this.lu = vyVar;
        vyVar.pcc(this.gm, this.kj, this.gpj, this.fum);
        frameLayout.addView(this.lu, new FrameLayout.LayoutParams(-1, -1));
        if (this.gm.irz()) {
            ork orkVar = new ork(this.sf);
            this.wh = orkVar;
            orkVar.sf();
            frameLayout.addView(this.wh, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.hc.qf qfVar) {
        this.vh = qfVar;
        this.ork.sf(z);
        com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().sf(this.gm);
        this.pcc.a_(this.vy);
        kj kjVar = this.ork;
        if (kjVar != null) {
            kjVar.wh(com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(this.gm));
            this.ork.kj(this.vy);
        }
    }

    public void pcc() {
        ork orkVar;
        final boolean z = true;
        if (this.dax.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.vj;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.gbb && (orkVar = this.wh) != null) {
            orkVar.sf(this.gm, this.oo);
            kj kjVar = this.ork;
            if (kjVar != null) {
                kjVar.ye();
            }
        } else {
            this.ork.gm(true);
            mu muVar = this.qf;
            if (muVar != null && muVar.gbb() != null) {
                this.qf.gbb().vj();
            }
            InterfaceC0129pcc interfaceC0129pcc = this.jsj;
            if (interfaceC0129pcc != null) {
                interfaceC0129pcc.pcc(this.jr);
            }
            z = false;
        }
        if (this.ork != null) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), this.gm, this.kj, "playable_track", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.7
                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject gm() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                public JSONObject pcc() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", pcc.this.ork.kun());
                        jSONObject.put("has_loading", z);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.ork.wh(com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(this.gm));
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.pcc;
        if (qfVar != null) {
            qfVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.dax.oo.pcc("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.8
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    if (pcc.this.qy != null) {
                        jSONObject.put("destroy_stack_trace", pcc.this.qy.toString());
                    }
                    jSONObject.put("destroy_ts", pcc.this.yt);
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("plb_npe_crash").sf(jSONObject.toString());
                }
            });
        }
    }

    public void pcc(final int i, final int i2) {
        InterfaceC0129pcc interfaceC0129pcc;
        kj kjVar;
        sf sfVar;
        if (this.gbb) {
            return;
        }
        this.gbb = true;
        this.jr = i;
        if (i == 2) {
            this.hc = true;
            this.ork.pcc(3);
        } else if (i == 1) {
            this.hc = true;
            this.ork.pcc(2);
        } else if (i == 3) {
            this.hc = true;
            this.ork.pcc(4);
        } else if (i == 0) {
            this.ork.pcc(1);
        }
        if (this.hc && (sfVar = this.lo) != null) {
            sfVar.pcc();
        }
        if (this.dax.get() && (kjVar = this.ork) != null) {
            kjVar.gm(true);
        }
        mu muVar = this.qf;
        if (muVar != null && muVar.gbb() != null) {
            this.qf.gbb().vj();
        }
        if (!this.hc && (interfaceC0129pcc = this.jsj) != null) {
            interfaceC0129pcc.pcc(i);
        }
        ork orkVar = this.wh;
        if (orkVar != null) {
            orkVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.9
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.hc) {
                        pcc.this.lu.setVisibility(0);
                        if (pcc.this.jsj != null) {
                            pcc.this.jsj.pcc(i);
                        }
                        pcc.this.pcc(true);
                    }
                    pcc.this.ork.qf(pcc.this.hc);
                    pcc.this.wh.gm();
                    if (pcc.this.dax.get()) {
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pcc.this.gm, pcc.this.kj, "playable_track", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.tz.pcc.pcc.9.1
                            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                            public JSONObject gm() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                            public JSONObject pcc() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i);
                                    jSONObject.put("remove_loading_page_reason", i2);
                                    jSONObject.put("playable_url", pcc.this.vy);
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, pcc.this.wh.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public void pcc(boolean z) {
        kj kjVar = this.ork;
        if (kjVar != null) {
            kjVar.pcc(z);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.gpj = pccVar;
        ork orkVar = this.wh;
        if (orkVar != null && orkVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.wh.kj downloadButton = this.wh.getDownloadButton();
            downloadButton.setOnClickListener(pccVar);
            downloadButton.setOnTouchListener(pccVar);
        }
        vy vyVar = this.lu;
        if (vyVar != null) {
            vyVar.setClickListener(pccVar);
        }
    }

    public void pcc(sf sfVar) {
        this.lo = sfVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        mu muVar = this.qf;
        if (muVar != null) {
            muVar.pcc(sfVar);
        }
    }

    public void gm() {
        kj kjVar;
        if (!this.dax.get() || (kjVar = this.ork) == null) {
            return;
        }
        kjVar.gm(false);
    }
}

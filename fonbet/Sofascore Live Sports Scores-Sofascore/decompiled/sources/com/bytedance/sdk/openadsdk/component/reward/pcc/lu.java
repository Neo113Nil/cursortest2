package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.mz1;
import defpackage.swm;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class lu implements com.bytedance.sdk.openadsdk.hc.vy {
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf atb;
    private qf.pcc erj;
    private View fum;
    private int gbb;
    private boolean gd;
    protected String gm;
    private boolean gpj;
    private int hc;
    private boolean hoh;
    private com.bytedance.sdk.component.vy.qf jr;
    private long kun;
    private View lo;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh lq;
    private int lrr;
    private boolean lu;
    private boolean mu;
    private boolean nn;
    private float of;
    com.bytedance.sdk.openadsdk.oo.hc oo;
    private final String ork;
    mu pcc;
    private boolean pq;
    private com.bytedance.sdk.openadsdk.gbb.oo ptr;
    private boolean qcw;
    protected com.bytedance.sdk.openadsdk.oo.oo.vj qf;
    private ILoader ri;
    private boolean rnn;
    private com.bytedance.sdk.openadsdk.common.vj se;
    private final boolean tmg;
    private float tz;
    private int vh;
    private String xb;
    private long yt;
    protected boolean sf = true;
    private boolean dax = false;
    private final AtomicBoolean nac = new AtomicBoolean(true);
    int vj = 0;
    String wh = "";
    boolean kj = false;
    private SparseArray<gm.pcc> qy = new SparseArray<>();
    private boolean jsj = true;
    private float tsz = -1.0f;
    private float mk = -1.0f;
    private boolean ye = false;
    private long zti = 0;
    private long tsx = -1;
    private volatile int rj = 0;
    private int iv = -1;
    private volatile int hpk = 0;
    private volatile int fmh = 0;
    private long zsj = 0;
    public boolean vy = false;
    private int vr = -1;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
        void pcc(WebView webView, String str);
    }

    public lu(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.atb = sfVar;
        this.ork = sfVar.vj;
        this.tmg = sfVar.oo;
    }

    public static /* synthetic */ int gbb(lu luVar) {
        int i = luVar.rj;
        luVar.rj = i + 1;
        return i;
    }

    public static /* synthetic */ int hc(lu luVar) {
        int i = luVar.fmh;
        luVar.fmh = i + 1;
        return i;
    }

    private com.bytedance.sdk.openadsdk.oo.oo.vj mu() {
        return new com.bytedance.sdk.openadsdk.oo.gpj(2, this.tmg ? "rewarded_video" : "fullscreen_interstitial_ad", this.atb.sf);
    }

    private void pcc(String str, final sf sfVar) {
        com.bytedance.sdk.component.vy.qf qfVar;
        final of ofVar = this.atb.sf;
        com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
        if (qfVar2 != null && qfVar2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.oo.hc sf2 = new com.bytedance.sdk.openadsdk.oo.hc(ofVar, this.jr.getWebView(), new com.bytedance.sdk.openadsdk.oo.tmg() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.11
                @Override // com.bytedance.sdk.openadsdk.oo.tmg
                public void pcc(int i) {
                    if (TextUtils.isEmpty(lu.this.xb)) {
                        return;
                    }
                    gm.pcc.pcc(lu.this.lrr, lu.this.rj, lu.this.fmh, lu.this.hpk - lu.this.fmh, ofVar, "landingpage_endcard", i);
                }
            }, this.iv).sf(true);
            this.oo = sf2;
            this.erj = sf2.pcc;
            sf2.pcc(tmg() ? "landingpage_endcard" : str);
            this.oo.sf(this.ork);
            this.oo.gm(true);
            this.jr.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.12
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    com.bytedance.sdk.openadsdk.oo.hc hcVar = lu.this.oo;
                    if (hcVar != null) {
                        hcVar.sf(i2);
                    }
                }
            });
            vy vyVar = this.atb.of;
            if (vyVar != null) {
                this.oo.pcc(vyVar.pcc());
            }
            com.bytedance.sdk.openadsdk.common.vj pcc2 = kun.pcc(ofVar, this.jr, this.atb.rnn, this.ork);
            this.se = pcc2;
            if (pcc2 != null) {
                pcc2.pcc(tmg() ? "landingpage_endcard" : str);
            }
            if (tmg()) {
                kun.pcc(ofVar, this.jr);
            }
            this.ptr = new com.bytedance.sdk.openadsdk.gbb.oo(this.oo);
            com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(com.bytedance.sdk.openadsdk.core.lu.pcc(), this.pcc, ofVar.esn(), this.se, this.oo, ofVar.fy()) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    lu.this.hoh = false;
                    lu.this.lu = true;
                    lu luVar = lu.this;
                    luVar.pcc(100, luVar.atb.tsx);
                    if (lu.this.atb.ye.lo()) {
                        View ork = lu.this.atb.mu.ork();
                        if (ork instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) ork).setImageResource(tz.oo(lu.this.atb.kun, "tt_skip_btn"));
                        }
                    }
                    DeviceUtils.AudioInfoReceiver.pcc(lu.this);
                    lu.this.vr = DeviceUtils.qf();
                    com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = lu.this.qf;
                    if (vjVar != null) {
                        vjVar.vj();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                    sf sfVar2 = sfVar;
                    if (sfVar2 != null) {
                        sfVar2.pcc(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = lu.this.qf;
                    if (vjVar != null) {
                        vjVar.oo();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Objects.toString(webResourceError.getDescription());
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !lu.this.pcc(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                            webResourceError.getErrorCode();
                            String.valueOf(webResourceError.getDescription());
                            String.valueOf(webResourceRequest.getUrl());
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            lu.this.nac.set(false);
                            lu.this.hoh = false;
                            lu.this.pcc(webResourceError != null ? webResourceError.getErrorCode() : -1, lu.this.atb.tsx);
                        }
                        if (lu.this.qf != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceError.getDescription());
                                }
                                lu.this.qf.pcc(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        if (webResourceError != null) {
                            lu.this.vj = webResourceError.getErrorCode();
                            lu.this.wh = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                    webResourceRequest.isForMainFrame();
                    webResourceRequest.getUrl();
                    webResourceResponse.getStatusCode();
                    if (webResourceRequest.getUrl() != null) {
                        webResourceRequest.getUrl().toString();
                    }
                    if (webResourceRequest.isForMainFrame()) {
                        lu.this.nac.set(false);
                        lu.this.hoh = false;
                        lu.this.vj = webResourceResponse.getStatusCode();
                        lu luVar = lu.this;
                        luVar.wh = "onReceivedHttpError";
                        luVar.pcc(luVar.vj, luVar.atb.tsx);
                    }
                    if (lu.this.qf != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("code", webResourceResponse.getStatusCode());
                            jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, webResourceResponse.getReasonPhrase());
                            lu.this.qf.pcc(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    try {
                        if (TextUtils.isEmpty(lu.this.xb)) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                        lu.vh(lu.this);
                        WebResourceResponseModel pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(lu.this.ri, lu.this.xb, str2);
                        if (pcc3 != null && pcc3.getWebResourceResponse() != null) {
                            lu.hc(lu.this);
                            return pcc3.getWebResourceResponse();
                        }
                        if (pcc3 != null && pcc3.getMsg() == 2) {
                            lu.gbb(lu.this);
                        }
                        return super.shouldInterceptRequest(webView, str2);
                    } catch (Throwable th) {
                        lo.pcc("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        lo.pcc("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) {
                    super.onReceivedError(webView, i, str2, str3);
                }
            };
            this.lq = whVar;
            this.jr.setWebViewClient(whVar);
            this.lq.pcc(ofVar);
            this.lq.pcc(this.tmg ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (ofVar.fy() && (qfVar = this.jr) != null && qfVar.getWebView() != null) {
                this.jr.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.3
                    private final int gm = com.bytedance.sdk.openadsdk.core.lu.sf();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i;
                        com.bytedance.sdk.openadsdk.oo.hc hcVar = lu.this.oo;
                        if (hcVar != null) {
                            hcVar.pcc(motionEvent);
                        }
                        if (lu.this.se != null) {
                            lu.this.se.pcc(motionEvent);
                        }
                        if (lu.this.ptr != null) {
                            lu.this.ptr.pcc();
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 0) {
                                int i2 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        i2 = actionMasked != 3 ? -1 : 4;
                                    } else {
                                        float rawX = motionEvent.getRawX();
                                        float rawY = motionEvent.getRawY();
                                        if (Math.abs(rawX - lu.this.tz) >= this.gm || Math.abs(rawY - lu.this.of) >= this.gm) {
                                            lu.this.jsj = false;
                                        }
                                        lu.this.tsz += Math.abs(motionEvent.getX() - lu.this.tz);
                                        lu.this.mk += Math.abs(motionEvent.getY() - lu.this.of);
                                        i = (System.currentTimeMillis() - lu.this.yt <= 200 || (lu.this.tsz <= 8.0f && lu.this.mk <= 8.0f)) ? 2 : 1;
                                    }
                                }
                                i = i2;
                            } else {
                                lu.this.jsj = true;
                                lu.this.qy = new SparseArray();
                                lu.this.tz = motionEvent.getRawX();
                                lu.this.of = motionEvent.getRawY();
                                lu.this.yt = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = lu.this.jr.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < lu.this.yt) {
                                        lu.this.yt = landingPageClickBegin;
                                        lu.this.jr.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                lu.this.tsz = -1.0f;
                                lu.this.mk = -1.0f;
                                i = 0;
                            }
                            lu.this.qy.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && com.bytedance.sdk.openadsdk.core.model.lo.qf(lu.this.atb.sf) && lu.this.atb.tsx != null) {
                                lu.this.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        lu.this.atb.tsx.hoh();
                                    }
                                });
                            }
                            if (motionEvent.getAction() == 1 && view.getVisibility() == 0 && Float.valueOf(view.getAlpha()).intValue() == 1 && ((!lu.this.dax || com.bytedance.sdk.openadsdk.core.model.lo.vh(ofVar)) && lu.this.jsj)) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("down_x", lu.this.tz);
                                jSONObject.put("down_y", lu.this.of);
                                jSONObject.put("down_time", lu.this.yt);
                                jSONObject.put("up_x", motionEvent.getRawX());
                                jSONObject.put("up_y", motionEvent.getRawY());
                                long currentTimeMillis = System.currentTimeMillis();
                                try {
                                    long landingPageClickEnd = lu.this.jr.getLandingPageClickEnd();
                                    if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                        try {
                                            lu.this.jr.setLandingPageClickEnd(-1L);
                                        } catch (Exception unused2) {
                                        }
                                        currentTimeMillis = landingPageClickEnd;
                                    }
                                } catch (Exception unused3) {
                                }
                                jSONObject.put("up_time", currentTimeMillis);
                                int[] iArr = new int[2];
                                lu luVar = lu.this;
                                luVar.fum = luVar.atb.nn.findViewById(520093713);
                                if (lu.this.fum != null) {
                                    lu.this.fum.getLocationOnScreen(iArr);
                                    jSONObject.put("button_x", iArr[0]);
                                    jSONObject.put("button_y", iArr[1]);
                                    jSONObject.put("button_width", lu.this.fum.getWidth());
                                    jSONObject.put("button_height", lu.this.fum.getHeight());
                                }
                                if (lu.this.lo != null) {
                                    int[] iArr2 = new int[2];
                                    lu.this.lo.getLocationOnScreen(iArr2);
                                    jSONObject.put("ad_x", iArr2[0]);
                                    jSONObject.put("ad_y", iArr2[1]);
                                    jSONObject.put("width", lu.this.lo.getWidth());
                                    jSONObject.put("height", lu.this.lo.getHeight());
                                }
                                jSONObject.put("toolType", motionEvent.getToolType(0));
                                jSONObject.put("deviceId", motionEvent.getDeviceId());
                                jSONObject.put("source", motionEvent.getSource());
                                jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.tmg.pcc(lu.this.qy, com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2));
                                jSONObject.put("user_behavior_type", lu.this.jsj ? 1 : 2);
                                jSONObject.put("click_scence", 2);
                                if (lu.this.lq != null) {
                                    lu.this.lq.pcc(jSONObject);
                                }
                                if (!lu.this.dax && !com.bytedance.sdk.openadsdk.core.model.lo.ork(ofVar)) {
                                    boolean z = lu.this.tmg;
                                    of ofVar2 = ofVar;
                                    if (z) {
                                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2, "rewarded_video", "click", jSONObject);
                                    } else {
                                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2, "fullscreen_interstitial_ad", "click", jSONObject);
                                    }
                                    lu.this.dax = true;
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                        return false;
                    }
                });
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.jr;
            if (qfVar3 != null) {
                qfVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.pcc, this.oo, this.se) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                    }
                });
            }
            pcc(this.jr);
            this.jr.setLayerType(1, null);
            this.jr.setBackgroundColor(-1);
            this.jr.setDisplayZoomControls(false);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.ptr;
        if (ooVar != null) {
            this.lq.pcc(ooVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pq() {
        this.pq = true;
        this.qcw = false;
        this.atb.rj.removeMessages(600);
        this.atb.rj.removeMessages(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
        this.atb.rj.removeMessages(900);
        this.atb.zti.oo(false);
        this.atb.dax.set(true);
        this.atb.ew.hc();
        of ofVar = this.atb.sf;
        ofVar.qap();
        if (ofVar.qap() || !kun.kj(atb.pcc(ofVar))) {
            return;
        }
        View ork = this.atb.mu.ork();
        View.OnClickListener onClickListener = (View.OnClickListener) ork.getTag(ork.getId());
        if (onClickListener != null) {
            pcc pccVar = new pcc(this.atb, ork, onClickListener);
            ork.setOnClickListener(pccVar);
            ork.setOnTouchListener(pccVar);
        }
    }

    public boolean atb() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        return qfVar == null || qfVar.getWebView() == null;
    }

    public void dax() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            qfVar.gbb();
        }
        if (this.tsx > 0) {
            this.kun = (SystemClock.elapsedRealtime() - this.tsx) + this.kun;
            this.tsx = 0L;
        }
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.sf(false);
            sf(this.pcc, false);
            pcc(this.pcc, true, false);
        }
    }

    public void fum() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.qf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.hc.vy
    public void gm(int i) {
        int i2 = this.vr;
        if (i2 <= 0 && i > 0) {
            oo(false);
        } else if (i2 > 0 && i == 0) {
            oo(true);
        }
        this.vr = i;
    }

    public void jr() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.kj();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    public boolean jsj() {
        mu muVar = this.pcc;
        if (muVar == null) {
            return false;
        }
        return muVar.vy();
    }

    public boolean lo() {
        boolean gm = of.gm(this.atb.sf);
        boolean z = this.mu;
        return gm ? z && !this.nn && this.atb.lq.tmg() : z && !this.nn && this.nac.get() && this.lu;
    }

    public boolean lq() {
        return this.pq;
    }

    public void nac() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            qfVar.tmg();
        }
        if (this.tsx == 0) {
            this.tsx = SystemClock.elapsedRealtime();
        }
        of ofVar = this.atb.sf;
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.vh();
            com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
            if (qfVar2 != null) {
                int visibility = qfVar2.getVisibility();
                mu muVar2 = this.pcc;
                if (visibility == 0) {
                    muVar2.sf(true);
                    sf(this.pcc, true);
                    pcc(this.pcc, false, true);
                    if (atb.kj(ofVar) && !this.pq && this.atb.sf.qap()) {
                        qf();
                    }
                } else {
                    muVar2.sf(false);
                    sf(this.pcc, false);
                    pcc(this.pcc, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.qf();
        }
    }

    public void of() {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.pcc(System.currentTimeMillis());
        }
    }

    public void oo(boolean z) {
        if (atb.sf(this.atb.sf)) {
            return;
        }
        vj(z);
    }

    public void ork() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        of ofVar = this.atb.sf;
        String kj = ofVar.kj();
        if (!TextUtils.isEmpty(kj) && (kjVar = this.atb.ywp) != null && (kjVar.rnn() || this.atb.ywp.rj().jsj())) {
            this.gm = kj;
        } else if (atb.vj(ofVar)) {
            swm kez = ofVar.kez();
            if (kez != null) {
                this.gm = kez.h;
            }
        } else {
            this.gm = atb.tmg(ofVar);
        }
        String pcc2 = pcc(this.gm, ofVar, this.vh, this.gbb, this.hc);
        this.gm = pcc2;
        if (TextUtils.isEmpty(pcc2)) {
            return;
        }
        this.mu = this.gm.contains("use_second_endcard=1");
    }

    public void qf() {
        this.pcc.pcc("showPlayableEndCardOverlay", (JSONObject) null);
        this.atb.rj.sendEmptyMessageDelayed(600, 1000L);
        this.atb.rj.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.10
            @Override // java.lang.Runnable
            public void run() {
                lu.this.pq();
            }
        }, 1000L);
    }

    public void qy() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.vy();
        }
    }

    public void sf() {
        this.lo = this.atb.rnn.findViewById(R.id.content);
        com.bytedance.sdk.component.vy.qf qfVar = (com.bytedance.sdk.component.vy.qf) this.atb.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.dax);
        this.jr = qfVar;
        if (qfVar == null || !of.sf(this.atb.sf)) {
            rj.pcc((View) this.jr, 8);
        } else {
            this.jr.vj();
        }
        com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
        if (qfVar2 != null) {
            qfVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (lu.this.jr == null || lu.this.jr.getViewTreeObserver() == null) {
                        return;
                    }
                    lu.this.jr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = lu.this.jr.getMeasuredWidth();
                    int measuredHeight = lu.this.jr.getMeasuredHeight();
                    if (lu.this.jr.getVisibility() == 0) {
                        lu.this.pcc(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public boolean tmg() {
        String str = this.gm;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean tsz() {
        this.nac.get();
        return this.lu && this.nac.get();
    }

    public void tz() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.wh();
        }
    }

    public void vh() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            mk.pcc(qfVar);
        }
        of ofVar = this.atb.sf;
        long j = this.kun;
        if (j > 0) {
            if (this.tsx > 0) {
                this.kun = (SystemClock.elapsedRealtime() - this.tsx) + j;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", of.gm(ofVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.atb.sf, this.ork, "second_endcard_duration", jSONObject, this.kun);
        }
        this.jr = null;
        if (this.qf != null && !com.bytedance.sdk.openadsdk.core.model.lo.oo(ofVar) && !com.bytedance.sdk.openadsdk.core.model.lo.kj(ofVar) && !of.gm(ofVar)) {
            this.qf.pcc(true);
            this.qf.vh();
        }
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.tmg();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.oo(ofVar.fy());
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.ptr;
        if (ooVar != null) {
            ooVar.gm();
        }
        DeviceUtils.AudioInfoReceiver.sf(this);
    }

    public void vj() {
        if (atb.vj(this.atb.sf) && this.atb.rt) {
            return;
        }
        wh();
    }

    public void wh() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.atb;
        of ofVar = sfVar.sf;
        if (TextUtils.isEmpty(of.pcc(sfVar.kun, ofVar))) {
            if (ofVar != null && !ofVar.mu() && this.ri == null && tmg()) {
                this.xb = ofVar.cz();
                this.ri = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
                int pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.ri, this.xb);
                this.lrr = pcc2;
                this.iv = pcc2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.xb)) {
                    com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
                    if (hcVar != null) {
                        hcVar.pcc(this.iv);
                    }
                    gm.pcc.pcc(this.zsj, ofVar, "landingpage_endcard", this.ri, this.xb);
                }
            }
            if ((!TextUtils.isEmpty(this.gm) && this.gm.contains("play.google.com/store")) || ((ofVar != null && !ofVar.xb() && com.bytedance.sdk.openadsdk.core.model.lo.vy(ofVar)) || com.bytedance.sdk.openadsdk.core.model.lo.kj(ofVar))) {
                this.kj = true;
                return;
            }
            if (this.sf) {
                boolean z = this.atb.ei;
                if (this.jr == null || ((!z && TextUtils.isEmpty(this.gm)) || !of.sf(ofVar))) {
                    if (of.gm(ofVar)) {
                        this.atb.lq.gm();
                    }
                } else {
                    if (this.hoh) {
                        return;
                    }
                    String o = mz1.o(new StringBuilder(), this.gm, "&is_pre_render=1");
                    com.bytedance.sdk.openadsdk.oo.hc hcVar2 = this.oo;
                    if (hcVar2 != null) {
                        hcVar2.oo();
                    }
                    com.bytedance.sdk.openadsdk.utils.of.pcc(this.jr, o);
                    this.hoh = true;
                }
            }
        }
    }

    public void ye() {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.vj();
        }
    }

    public boolean zti() {
        return this.vy;
    }

    public String gpj() {
        return this.wh;
    }

    public com.bytedance.sdk.component.vy.qf kj() {
        return this.jr;
    }

    public int lu() {
        return this.vj;
    }

    public boolean mk() {
        return this.qcw;
    }

    public mu vy() {
        return this.pcc;
    }

    public boolean yt() {
        return this.kj;
    }

    public boolean gbb() {
        return this.lu;
    }

    public boolean hc() {
        return this.nac.get();
    }

    public boolean oo() {
        return this.nn;
    }

    public void vj(boolean z) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        this.pcc.qf(z);
    }

    public boolean gm() {
        return this.rnn;
    }

    public void gm(boolean z) {
        sf(this.pcc, z);
    }

    public void qf(boolean z) {
        this.qcw = z;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends com.bytedance.sdk.openadsdk.core.gm.pcc implements sf.pcc {
        private final View.OnClickListener gm;
        private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
        private final View sf;

        public pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view, View.OnClickListener onClickListener) {
            super(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5);
            this.pcc = sfVar;
            this.sf = view;
            this.gm = onClickListener;
            HashMap hashMap = new HashMap();
            hashMap.put("close_auto_click", Boolean.TRUE);
            hashMap.put("click_scence", 2);
            pcc(hashMap);
            pcc(sfVar.tz.gm());
            pcc(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
        public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
            if (!this.pcc.sf.qap()) {
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
                this.pcc.tsx.pq();
            } else {
                this.gm.onClick(view);
                this.sf.setOnTouchListener(null);
                this.sf.setOnClickListener(this.gm);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
        public void pcc(View view, int i) {
            this.sf.setOnTouchListener(null);
            this.sf.setOnClickListener(this.gm);
        }
    }

    public void sf(boolean z) {
        pcc(this.pcc, z);
    }

    public void sf(mu muVar, boolean z) {
        try {
            muVar.kj(z);
        } catch (Exception unused) {
        }
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc(i);
            this.qf.gm();
        }
    }

    public static /* synthetic */ int vh(lu luVar) {
        int i = luVar.hpk;
        luVar.hpk = i + 1;
        return i;
    }

    public void wh(boolean z) {
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.atb;
        com.bytedance.sdk.openadsdk.utils.gbb gbbVar = sfVar.gh;
        if (gbbVar != null) {
            gbbVar.pcc(sfVar, 5000L);
        }
        this.nn = true;
        JSONObject jSONObject = new JSONObject();
        of ofVar = this.atb.sf;
        try {
            jSONObject.put("endcard_overlay_render_type", of.gm(ofVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.ork, "use_second_endcard", jSONObject);
        this.tsx = SystemClock.elapsedRealtime();
        try {
            if (!of.gm(ofVar)) {
                this.pcc.pcc("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.atb.lq.kj();
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.ork, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
    }

    public void pcc() {
        if (this.gpj) {
            return;
        }
        this.gpj = true;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.atb;
        this.vh = sfVar.zsj;
        this.hc = sfVar.erj;
        this.gbb = sfVar.se;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sf();
        this.zsj = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    public void pcc(String str, final com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        pcc(str, new sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.lu.sf
            public void pcc(WebView webView, String str2) {
                if (lu.this.atb.rnn.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                lu.this.hc();
            }
        });
        pcc(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                lu.this.atb.tz.sf();
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = sfVar;
                if (sfVar2 != null) {
                    sfVar2.qcw();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.atb.lo.get();
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar2 = this.atb;
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar2.ywp;
        if (kjVar == null || !kjVar.tmg || sfVar2.lo.get()) {
            return;
        }
        this.atb.lo.set(true);
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar3 = this.atb;
        if (sfVar3.gdh && com.bytedance.sdk.openadsdk.core.model.lo.gbb(sfVar3.sf) && sfVar != null) {
            sfVar.vj();
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.hc.qf qfVar, String str, final com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        if (this.jr == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        final of ofVar = this.atb.sf;
        hashMap.put("click_scence", 2);
        this.qf = mu();
        mu muVar = new mu(this.atb.rnn);
        this.pcc = muVar;
        muVar.pcc(this.atb.tsx);
        mu pcc2 = this.pcc.sf(this.jr).pcc(ofVar).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(ofVar)).gm(ofVar.esn()).oo(ofVar.hl()).sf(ofVar.tuy() ? 7 : 5).pcc(new com.bytedance.sdk.openadsdk.core.ork.pcc.gm(this.jr)).vj(ofVar.ray()).pcc(this.jr);
        if (tmg()) {
            str = "landingpage_endcard";
        }
        pcc2.sf(str).pcc(hashMap).pcc(this.qf).pcc(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                if (lu.this.lq != null) {
                    lu.this.lq.gm();
                }
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = sfVar;
                if (sfVar2 != null) {
                    sfVar2.qcw();
                }
            }
        }).pcc(new mu.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.7
            @Override // com.bytedance.sdk.openadsdk.core.mu.pcc
            public void pcc() {
                lu.this.pq();
            }
        });
        this.pcc.pcc(new com.bytedance.sdk.openadsdk.core.ork.pcc.oo(this.jr));
        this.pcc.pcc(this.atb.mu.ork()).pcc(this.atb.of.gm()).pcc(new com.bytedance.sdk.openadsdk.hc.gm() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.9
            @Override // com.bytedance.sdk.openadsdk.hc.gm
            public void pcc(boolean z, int i, String str2) {
                if (z) {
                    lu luVar = lu.this;
                    luVar.vy = true;
                    if (luVar.gd) {
                        lu.this.gd = false;
                        lu luVar2 = lu.this;
                        luVar2.pcc(luVar2.atb.xb, true);
                    }
                }
                if (of.oo(ofVar)) {
                    lu.this.pcc(z, i, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hc.gm
            public void pcc() {
                lu.this.rnn = true;
                lu.this.atb.mu.ork().performClick();
            }
        });
        this.pcc.wh(this.mu);
    }

    public void pcc(int i, int i2) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        this.pcc.pcc(i, i2);
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    private static String pcc(String str, of ofVar, int i, int i2, int i3) {
        String concat;
        String concat2;
        float zx = ofVar.zx();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    concat2 = str.concat(U3.j.c);
                } else {
                    concat2 = str.concat("?");
                }
                str = concat2.concat("orientation=portrait");
            }
            if (str.contains("?")) {
                concat = str.concat(U3.j.c);
            } else {
                concat = str.concat("?");
            }
            str = concat + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + zx;
        }
        return !atb.sf(ofVar) ? com.bytedance.sdk.openadsdk.utils.wh.pcc(str) : str;
    }

    public void pcc(int i) {
        if (this.lu || !this.nac.get()) {
            pcc(0, this.atb.tsx);
        }
        rj.pcc((View) this.jr, i);
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            rj.pcc((View) qfVar.getWebView(), i);
        }
        of ofVar = this.atb.sf;
        if (this.jr == null || !ofVar.fy()) {
            return;
        }
        this.jr.setLandingPage(true);
        this.jr.setTag("landingpage_endcard");
        this.jr.setMaterialMeta(ofVar.lr());
    }

    public void pcc(float f) {
        rj.pcc(this.jr, f);
    }

    public void pcc(mu muVar, boolean z) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        muVar.sf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.atb.sf.fy() && str.endsWith(".mp4");
    }

    public void pcc(DownloadListener downloadListener) {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar == null || downloadListener == null) {
            return;
        }
        qfVar.setDownloadListener(downloadListener);
    }

    public void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.atb.rnn).pcc(false).sf(false).pcc(qfVar.getWebView());
        qfVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
        qfVar.setMixedContentMode(0);
    }

    public void pcc(boolean z, boolean z2) {
        pcc(this.pcc, z, z2);
    }

    public void pcc(mu muVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.atb.ywp;
            String str = TtmlNode.END;
            if (kjVar != null) {
                jSONObject.put("multi_ads_show", kjVar.rj().ork());
                if (!kjVar.nac) {
                    str = PlayerKt.E_SPORTS_MID;
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", TtmlNode.END);
            }
            muVar.pcc("endcard_control_event", jSONObject);
            if (z2) {
                if (this.lu) {
                    return;
                }
                this.gd = true;
                return;
            }
            this.gd = false;
        } catch (Exception unused) {
        }
    }

    public void pcc(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar == null) {
            return;
        }
        if (z) {
            vjVar.sf();
        } else {
            vjVar.pcc(i, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.zti < 100) {
            return false;
        }
        this.zti = currentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}

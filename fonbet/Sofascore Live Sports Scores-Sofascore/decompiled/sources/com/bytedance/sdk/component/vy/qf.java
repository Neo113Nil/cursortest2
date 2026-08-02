package com.bytedance.sdk.component.vy;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.yt;
import com.bytedance.sdk.component.vy.pcc;
import com.ironsource.L6;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.b;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf extends FrameLayout {
    private static oo lrr;
    private float atb;
    private pcc.InterfaceC0057pcc dax;
    private boolean fum;
    private volatile WebView gbb;
    public int gm;
    private com.bytedance.sdk.component.vy.oo gpj;
    private boolean hc;
    private long iv;
    private View jr;
    private gm jsj;
    private float kj;
    private AtomicBoolean kun;
    private boolean lo;
    private int lq;
    private List<String> lu;
    private float mk;
    private AttributeSet mu;
    private com.bytedance.sdk.component.vy.pcc nac;
    private Context nn;
    private boolean of;
    private com.bytedance.sdk.component.vy.sf.pcc oo;
    private long ork;
    public int pcc;
    private yt pq;
    private boolean qf;
    private WebViewClient qy;
    private vj rj;
    private AtomicBoolean rnn;
    public int sf;
    private long tmg;
    private AtomicBoolean tsx;
    private com.bytedance.sdk.component.vy.vj tsz;
    private boolean tz;
    private long vh;
    private String vj;
    private float vy;
    private JSONObject wh;
    private long xb;
    private float ye;
    private boolean yt;
    private sf zti;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum gm {
        ADS(b.JSON_KEY_ADS),
        ADS_V3("ads_v3"),
        ADS_V4("ads_v4"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(L6.d0),
        PLAYABLE("playable"),
        DSP("dsp"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_LOADING("lp_loading"),
        LANDING_PAGE_PRE_RENDER("lp_pre_render");

        public final String gbb;

        gm(String str) {
            this.gbb = str;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface oo {
        WebView pcc(Context context, AttributeSet attributeSet, int i, gm gmVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class pcc extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (webView == null) {
                return true;
            }
            webView.post(new Runnable() { // from class: com.bytedance.sdk.component.vy.qf.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView);
                        }
                        webView.destroy();
                    } catch (Exception unused) {
                    }
                }
            });
            return true;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface sf {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface vj {
    }

    public qf(Context context, boolean z, gm gmVar) {
        super(pcc(context));
        this.kj = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.vy = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ork = 0L;
        this.vh = 0L;
        this.tmg = 0L;
        this.hc = false;
        this.mk = 20.0f;
        this.ye = 50.0f;
        this.rnn = new AtomicBoolean();
        this.tsx = new AtomicBoolean();
        this.kun = new AtomicBoolean();
        this.nn = context;
        this.jsj = gmVar;
        if (z) {
            return;
        }
        try {
            this.gbb = pcc((AttributeSet) null, 0);
            wh();
        } catch (Throwable unused) {
        }
        sf(pcc(context));
    }

    private static boolean gm(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    private void gpj() {
        try {
            WebSettings settings = this.gbb.getSettings();
            if (settings != null) {
                settings.setSavePassword(false);
            }
        } catch (Throwable unused) {
        }
    }

    private void lo() {
        if (this.pq == null) {
            this.kun.set(false);
            this.pq = new yt(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.vy.qf.1
        };
        this.kun.set(true);
    }

    private void lu() {
        if (this.gbb == null) {
            return;
        }
        try {
            this.gbb.removeJavascriptInterface("searchBoxJavaBridge_");
            this.gbb.removeJavascriptInterface("accessibility");
            this.gbb.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable unused) {
        }
    }

    private void pcc(MotionEvent motionEvent) {
        if (!this.qf || this.oo == null) {
            return;
        }
        if ((this.vj == null && this.wh == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.kj = motionEvent.getRawX();
                this.vy = motionEvent.getRawY();
                this.ork = System.currentTimeMillis();
                this.wh = new JSONObject();
                if (this.gbb != null) {
                    this.iv = this.ork;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.wh.put("start_x", String.valueOf(this.kj));
                this.wh.put("start_y", String.valueOf(this.vy));
                this.wh.put("offset_x", String.valueOf(motionEvent.getRawX() - this.kj));
                this.wh.put("offset_y", String.valueOf(motionEvent.getRawY() - this.vy));
                this.wh.put("url", String.valueOf(getUrl()));
                this.wh.put("tag", "");
                this.vh = System.currentTimeMillis();
                if (this.gbb != null) {
                    this.xb = this.vh;
                }
                this.wh.put("down_time", this.ork);
                this.wh.put("up_time", this.vh);
                if (com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf() != null) {
                    long j = this.tmg;
                    long j2 = this.ork;
                    if (j != j2) {
                        this.tmg = j2;
                        com.bytedance.sdk.component.vy.pcc.pcc.pcc().sf().pcc(this.oo, this.vj, "in_web_click", this.wh, this.vh - this.ork);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (!TextUtils.isEmpty(str) && (settings = this.gbb.getSettings()) != null) {
                if (Uri.parse(str).getScheme().equalsIgnoreCase(U3.i.b)) {
                    settings.setJavaScriptEnabled(false);
                } else {
                    settings.setJavaScriptEnabled(true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void setWebViewProvider(oo ooVar) {
        lrr = ooVar;
    }

    private static boolean sf(View view) {
        try {
            Class<?> loadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (loadClass != null) {
                if (loadClass.isInstance(view)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            Class<?> loadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            if (loadClass2 != null) {
                return loadClass2.isInstance(view);
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    public void a_(String str) {
        try {
            setJavaScriptEnabled(str);
            this.gbb.loadUrl(str);
        } catch (Throwable unused) {
        }
    }

    public void b_(String str) {
        try {
            this.gbb.removeJavascriptInterface(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.gbb == null) {
            return;
        }
        try {
            this.gbb.computeScroll();
        } catch (Throwable unused) {
        }
    }

    public void dax() {
        try {
            this.gbb.clearView();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void gbb() {
        if (this.gbb == null) {
            return;
        }
        try {
            this.gbb.onPause();
        } catch (Throwable unused) {
        }
    }

    public View getArbitrageLoadingView() {
        return this.jr;
    }

    public int getContentHeight() {
        if (this.gbb == null) {
            return 0;
        }
        try {
            return this.gbb.getContentHeight();
        } catch (Throwable unused) {
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.iv;
    }

    public long getLandingPageClickEnd() {
        return this.xb;
    }

    public com.bytedance.sdk.component.vy.sf.pcc getMaterialMeta() {
        return this.oo;
    }

    public String getOriginalUrl() {
        String url;
        if (this.gbb == null) {
            return null;
        }
        try {
            String originalUrl = this.gbb.getOriginalUrl();
            if (originalUrl != null && originalUrl.startsWith("data:text/html") && (url = this.gbb.getUrl()) != null) {
                if (url.startsWith("file://")) {
                    return url;
                }
            }
            return originalUrl;
        } catch (Throwable unused) {
            return null;
        }
    }

    public int getProgress() {
        if (this.gbb == null) {
            return 0;
        }
        try {
            return this.gbb.getProgress();
        } catch (Throwable unused) {
            return 100;
        }
    }

    public gm getScene() {
        return this.jsj;
    }

    public String getUrl() {
        if (this.gbb == null) {
            return null;
        }
        try {
            return this.gbb.getUrl();
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.gbb == null) {
            return "";
        }
        try {
            return this.gbb.getSettings().getUserAgentString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public WebView getWebView() {
        return this.gbb;
    }

    public WebViewClient getWebViewClient() {
        return this.qy;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    public void hc() {
        try {
            this.gbb.clearHistory();
        } catch (Throwable unused) {
        }
    }

    public void jr() {
        if (this.gbb == null) {
            return;
        }
        gm gmVar = this.jsj;
        if (gmVar != gm.ADS && gmVar != gm.ADS_V3 && gmVar != gm.ADS_V4) {
            mk.pcc(this);
        } else {
            try {
                this.gbb.destroy();
            } catch (Throwable unused) {
            }
        }
    }

    public boolean k_() {
        return this.lo;
    }

    public boolean kj() {
        if (this.gbb == null) {
            return false;
        }
        try {
            return this.gbb.canGoBack();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void nac() {
        try {
            this.gbb.pauseTimers();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.rnn.set(true);
        if (!this.tsx.get() || this.kun.get()) {
            return;
        }
        lo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.rnn.set(false);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent pcc2;
        try {
            pcc(motionEvent);
            boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if ((motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) && this.hc && (pcc2 = pcc(this)) != null) {
                pcc2.requestDisallowInterceptTouchEvent(true);
            }
            return onInterceptTouchEvent;
        } catch (Throwable unused) {
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public boolean oo() {
        return this.of;
    }

    public boolean ork() {
        if (this.gbb == null) {
            return false;
        }
        try {
            return this.gbb.canGoForward();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void qf() {
        try {
            this.gbb.stopLoading();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.gbb.removeAllViews();
        } catch (Throwable unused) {
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.gbb.getSettings().setAllowFileAccess(z);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.gbb.setAlpha(f);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.gbb.setBackgroundColor(i);
        } catch (Throwable unused) {
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.gbb.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setCacheMode(int i) {
        try {
            this.gbb.getSettings().setCacheMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setCalculationMethod(int i) {
        this.lq = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.gbb.getSettings().setDatabaseEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDeepShakeValue(float f) {
        this.atb = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.gbb.getSettings().setDefaultFontSize(i);
        } catch (Throwable unused) {
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.gbb.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable unused) {
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.gbb.getSettings().setDisplayZoomControls(z);
        } catch (Throwable unused) {
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.gbb.getSettings().setDomStorageEnabled(z);
        } catch (Throwable unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.gbb.setDownloadListener(downloadListener);
        } catch (Throwable unused) {
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.hc = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.gbb.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable unused) {
        }
    }

    public void setLandingPage(boolean z) {
        this.qf = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.iv = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.xb = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            if (this.gbb != null) {
                this.gbb.setLayerType(i, paint);
            }
        } catch (Throwable unused) {
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.gbb.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable unused) {
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.gbb.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable unused) {
        }
    }

    public void setLpPreRender(boolean z) {
        this.lo = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.vy.sf.pcc pccVar) {
        this.oo = pccVar;
    }

    public void setMixedContentMode(int i) {
        try {
            this.gbb.getSettings().setMixedContentMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.gbb.setNetworkAvailable(z);
        } catch (Throwable unused) {
        }
    }

    public void setOnShakeListener(sf sfVar) {
        this.zti = sfVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            if (this.gbb != null) {
                this.gbb.setOverScrollMode(i);
            }
            super.setOverScrollMode(i);
        } catch (Throwable unused) {
        }
    }

    public void setPreError(boolean z) {
        this.yt = z;
    }

    public void setPreFinish(boolean z) {
        this.tz = z;
    }

    public void setPreProgressHundred(boolean z) {
        this.of = z;
    }

    public void setPreStart(boolean z) {
        this.fum = z;
    }

    public void setRecycler(boolean z) {
        if (this.gbb == null || !(this.gbb instanceof wh)) {
            return;
        }
        ((wh) this.gbb).setRecycler(z);
    }

    public void setShakeValue(float f) {
        this.mk = f;
    }

    public void setSupportZoom(boolean z) {
        try {
            this.gbb.getSettings().setSupportZoom(z);
        } catch (Throwable unused) {
        }
    }

    public void setTag(String str) {
        this.vj = str;
        com.bytedance.sdk.component.vy.pcc pccVar = this.nac;
        if (pccVar != null) {
            pccVar.pcc(str);
        }
        com.bytedance.sdk.component.vy.oo ooVar = this.gpj;
        if (ooVar != null) {
            ooVar.pcc(str);
        }
    }

    public void setTouchStateListener(vj vjVar) {
        this.rj = vjVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.gbb.getSettings().setUseWideViewPort(z);
        } catch (Throwable unused) {
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.gbb.getSettings().setUserAgentString(str);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            if (this.gbb != null) {
                this.gbb.setVisibility(i);
            }
        } catch (Throwable unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.gbb.setWebChromeClient(webChromeClient);
        } catch (Throwable unused) {
        }
    }

    public void setWebTouchProxy(com.bytedance.sdk.component.vy.vj vjVar) {
        this.tsz = vjVar;
        if (this.gbb instanceof wh) {
            ((wh) this.gbb).setWebEventProxy(vjVar);
        }
    }

    public void setWebView(WebView webView) {
        this.gbb = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof vj) {
                setTouchStateListener((vj) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new pcc();
            }
            this.qy = webViewClient;
            this.gbb.setWebViewClient(new kj(this.dax, webViewClient, this.lu));
        } catch (Throwable unused) {
        }
    }

    public void setWriggleValue(float f) {
        this.ye = f;
    }

    public void tmg() {
        if (this.gbb != null) {
            this.gbb.onResume();
        }
    }

    public void vh() {
        try {
            this.gbb.goForward();
        } catch (Throwable unused) {
        }
    }

    public void vj() {
        try {
            if (this.gbb == null) {
                this.gbb = pcc(this.mu, 0);
            }
            wh();
            sf(pcc(this.nn));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void vy() {
        try {
            this.gbb.goBack();
        } catch (Throwable unused) {
        }
    }

    public void wh() {
        if (this.gbb != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.gbb.setId(520093704);
            } catch (Throwable unused) {
            }
            addView(this.gbb, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.vj;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.gbb.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable unused) {
        }
    }

    private void sf(Context context) {
        gm(context);
        gpj();
        lu();
    }

    public boolean gm() {
        return this.tz;
    }

    private static void gm(Context context) {
    }

    public boolean sf() {
        return this.fum;
    }

    public qf(Context context, gm gmVar) {
        this(pcc(context), false, gmVar);
    }

    public void pcc(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.gbb != null && (this.gbb instanceof wh)) {
            this.nac = new com.bytedance.sdk.component.vy.pcc(this.nn, i, i2, list, i3);
            this.lu = list2;
            if (!TextUtils.isEmpty(this.vj)) {
                this.nac.pcc(this.vj);
            }
            ((wh) this.gbb).setTouchListenerProxy(this.nac);
            this.dax = this.nac.pcc();
        }
    }

    public void pcc(int i, long j) {
        if (this.gbb == null || !(this.gbb instanceof wh)) {
            return;
        }
        this.gpj = new com.bytedance.sdk.component.vy.oo(this.nn, this.nac, i, j, this);
        if (!TextUtils.isEmpty(this.vj)) {
            this.gpj.pcc(this.vj);
        }
        ((wh) this.gbb).setTouchListenerProxy(this.gpj);
    }

    public void pcc(boolean z, View view) {
        if (z) {
            this.jr = view;
            view.setVisibility(8);
            View view2 = this.jr;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.jr, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView pcc(AttributeSet attributeSet, int i) {
        oo ooVar = lrr;
        if (ooVar != null) {
            return ooVar.pcc(getContext(), attributeSet, i, this.jsj);
        }
        if (attributeSet == null) {
            return new WebView(pcc(this.nn));
        }
        return new WebView(pcc(this.nn), attributeSet);
    }

    public void pcc(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            this.gbb.loadUrl(str, map);
        } catch (Throwable unused) {
        }
    }

    public void pcc(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            this.gbb.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Throwable unused) {
        }
    }

    public void pcc(boolean z) {
        try {
            this.gbb.clearCache(z);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent pcc(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof AbsListView) && !(parent instanceof ScrollView) && !(parent instanceof HorizontalScrollView) && (parent instanceof View)) {
            View view2 = (View) parent;
            if (!sf(view2) && !gm(view2)) {
                return pcc(view2);
            }
        }
        return parent;
    }

    public void pcc(Object obj, String str) {
        try {
            this.gbb.addJavascriptInterface(obj, str);
        } catch (Throwable unused) {
        }
    }

    private static Context pcc(Context context) {
        return context;
    }
}

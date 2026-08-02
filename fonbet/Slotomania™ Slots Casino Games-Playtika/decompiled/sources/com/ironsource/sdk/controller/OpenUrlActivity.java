package com.ironsource.sdk.controller;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.C2365ca;
import com.ironsource.C2556n4;
import com.ironsource.C2586og;
import com.ironsource.InterfaceC2444h;
import com.ironsource.J3;
import com.ironsource.O9;
import com.ironsource.Pe;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.Logger;

/* loaded from: classes4.dex */
public class OpenUrlActivity extends Activity {
    private static final String j = "OpenUrlActivity";
    private static final int k = SDKUtils.generateViewId();
    private static final int l = SDKUtils.generateViewId();
    private v b;
    private ProgressBar c;
    boolean d;
    private RelativeLayout e;
    private String f;
    private WebView a = null;
    private final Handler g = new Handler(Looper.getMainLooper());
    private boolean h = false;
    private final Runnable i = new b();

    class a implements View.OnSystemUiVisibilityChangeListener {
        a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.g.removeCallbacks(openUrlActivity.i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.g.postDelayed(openUrlActivity2.i, 500L);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.h));
        }
    }

    private class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
            safedk_OpenUrlActivity$c_onPageStarted_c4b32d45bcee73f84e3034882f9b4fe5(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
            safedk_OpenUrlActivity$c_onReceivedError_bd764cf9b7792911f2a6b9a9b2c60c80(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public void safedk_OpenUrlActivity$c_onPageStarted_c4b32d45bcee73f84e3034882f9b4fe5(WebView p0, String p1, Bitmap p2) {
            super.onPageStarted(p0, p1, p2);
            OpenUrlActivity.this.c.setVisibility(0);
        }

        public void safedk_OpenUrlActivity$c_onReceivedError_bd764cf9b7792911f2a6b9a9b2c60c80(WebView p0, int p1, String p2, String p3) {
            v vVar;
            super.onReceivedError(p0, p1, p2, p3);
            try {
                J3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.b) != null) {
                        vVar.d(p2, p3);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C2556n4.d().a(th);
            }
        }

        public boolean safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(WebView p0, String p1) {
            if (!new Pe(p1, C2365ca.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(p0, p1);
            }
            try {
                C2586og.a(OpenUrlActivity.this, p1);
                OpenUrlActivity.this.b.A();
            } catch (Exception e) {
                C2556n4.d().a(e);
                StringBuilder sb = new StringBuilder();
                if (e instanceof ActivityNotFoundException) {
                    sb.append(X3.c.x);
                } else {
                    sb.append(X3.c.y);
                }
                v vVar = OpenUrlActivity.this.b;
                if (vVar != null) {
                    vVar.d(sb.toString(), p1);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df = safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df);
            return safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df;
        }
    }

    static class d {
        static final String a = "is_store";
        static final String b = "external_url";
        static final String c = "secondary_web_view";
        static final String d = "immersive";
        static final String e = "no activity to handle url";
        static final String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    public static class e {
        private final InterfaceC2444h a;
        private int b;
        private String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        public e(InterfaceC2444h interfaceC2444h) {
            this.a = interfaceC2444h;
        }

        e a(int i) {
            this.b = i;
            return this;
        }

        public e b(boolean z) {
            this.d = z;
            return this;
        }

        public e c(boolean z) {
            this.e = z;
            return this;
        }

        public e a(String str) {
            this.c = str;
            return this;
        }

        e a(boolean z) {
            this.f = z;
            return this;
        }

        public Intent a(Context context) {
            Intent a = this.a.a(context);
            a.putExtra("external_url", this.c);
            a.putExtra("secondary_web_view", this.d);
            a.putExtra("is_store", this.e);
            a.putExtra(X3.i.v, this.f);
            if (!(context instanceof Activity)) {
                a.setFlags(this.b);
            }
            return a;
        }
    }

    private void a() {
        if (this.c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.c.setLayoutParams(layoutParams);
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    private void b() {
        if (this.a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.a = webView;
            webView.setId(k);
            this.a.getSettings().setJavaScriptEnabled(true);
            this.a.setWebViewClient(new c());
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(true, X3.i.Y);
        }
    }

    private void c() {
        WebView webView = this.a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void e() {
        requestWindowFeature(1);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(false, X3.i.Y);
            if (this.e == null || (viewGroup = (ViewGroup) this.a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(X3.i.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.a.stopLoading();
        this.a.clearHistory();
        try {
            IronSourceNetworkBridge.webviewLoadUrl(this.a, str);
        } catch (Throwable th) {
            C2556n4.d().a(th);
            com.ironsource.sdk.utils.Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.a.canGoBack()) {
            this.a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(j, "onCreate()");
        try {
            this.b = (v) O9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(X3.i.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            C2556n4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}

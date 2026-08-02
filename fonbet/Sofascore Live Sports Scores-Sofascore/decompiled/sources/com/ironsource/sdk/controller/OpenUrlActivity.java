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
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.C4020ca;
import com.ironsource.C4157k4;
import com.ironsource.C4294rg;
import com.ironsource.G3;
import com.ironsource.InterfaceC4099h;
import com.ironsource.Ne;
import com.ironsource.O9;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import defpackage.w1l;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.h));
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class d {
        static final String a = "is_store";
        static final String b = "external_url";
        static final String c = "secondary_web_view";
        static final String d = "immersive";
        static final String e = "no activity to handle url";
        static final String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    private void a() {
        if (this.c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            this.c.setLayoutParams(w1l.c(-2, -2, 13));
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
            this.a.setWebViewClient(new c(this, 0));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(true, U3.i.Y);
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
            vVar.b(false, U3.i.Y);
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

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(U3.i.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.a.stopLoading();
        this.a.clearHistory();
        try {
            this.a.loadUrl(str);
        } catch (Throwable th) {
            C4157k4.d().a(th);
            Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
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
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(j, "onCreate()");
        try {
            this.b = (v) O9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(U3.i.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            C4157k4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
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
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
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

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public class c extends WebViewClient {
        private c() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.c.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.c.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            v vVar;
            super.onReceivedError(webView, i, str, str2);
            try {
                G3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.b) != null) {
                        vVar.d(str, str2);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C4157k4.d().a(th);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e(OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!new Ne(str, C4020ca.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            try {
                C4294rg.a(OpenUrlActivity.this, str);
                OpenUrlActivity.this.b.A();
            } catch (Exception e) {
                C4157k4.d().a(e);
                StringBuilder sb = new StringBuilder();
                if (e instanceof ActivityNotFoundException) {
                    sb.append(U3.c.x);
                } else {
                    sb.append(U3.c.y);
                }
                v vVar = OpenUrlActivity.this.b;
                if (vVar != null) {
                    vVar.d(sb.toString(), str);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        public /* synthetic */ c(OpenUrlActivity openUrlActivity, int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class e {
        private final InterfaceC4099h a;
        private int b;
        private String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        public e(InterfaceC4099h interfaceC4099h) {
            this.a = interfaceC4099h;
        }

        public Intent a(Context context) {
            Intent a = this.a.a(context);
            a.putExtra("external_url", this.c);
            a.putExtra("secondary_web_view", this.d);
            a.putExtra("is_store", this.e);
            a.putExtra(U3.i.v, this.f);
            if (!(context instanceof Activity)) {
                a.setFlags(this.b);
            }
            return a;
        }

        @NotNull
        public e b(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public e c(boolean z) {
            this.e = z;
            return this;
        }

        @NotNull
        public e a(String str) {
            this.c = str;
            return this;
        }

        @NotNull
        public e a(boolean z) {
            this.f = z;
            return this;
        }

        @NotNull
        public e a(int i) {
            this.b = i;
            return this;
        }
    }
}

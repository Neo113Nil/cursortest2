package com.vk.api.sdk.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.vk.api.sdk.auth.VKScope;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.collections.EmptySet;
import ru.ok.android.sdk.SharedKt;
import xsna.arm0;
import xsna.brm0;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.h9r0;
import xsna.j5g;
import xsna.k6r0;
import xsna.n7r0;
import xsna.xhr0;
import xsna.yhr0;

/* compiled from: VKWebViewAuthActivity.kt */
/* loaded from: classes15.dex */
public class VKWebViewAuthActivity extends Activity {
    public static final /* synthetic */ int e = 0;
    public WebView b;
    public ProgressBar c;
    public h9r0 d;

    /* compiled from: VKWebViewAuthActivity.kt */
    public final class a extends WebViewClient {
        public boolean a;

        public a() {
        }

        public final boolean a(String str) {
            String str2;
            Integer m;
            int i = 0;
            if (str != null) {
                int i2 = VKWebViewAuthActivity.e;
                VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
                if (vKWebViewAuthActivity.a()) {
                    Uri parse = Uri.parse(brm0.y(str, "#", "?"));
                    if (parse.getQueryParameter("success") != null) {
                        if (parse.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN) != null) {
                            String queryParameter = parse.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN);
                            String queryParameter2 = parse.getQueryParameter("secret");
                            String queryParameter3 = parse.getQueryParameter("user_id");
                            UserId userId = queryParameter3 != null ? new UserId(Long.parseLong(queryParameter3)) : null;
                            String queryParameter4 = parse.getQueryParameter(SharedKt.PARAM_EXPIRES_IN);
                            new n7r0.d((queryParameter4 == null || (m = arm0.m(10, queryParameter4)) == null) ? 0 : m.intValue(), System.currentTimeMillis(), userId, queryParameter2, queryParameter);
                        } else {
                            n7r0.d dVar = n7r0.d.g;
                        }
                        yhr0.b();
                        vKWebViewAuthActivity.finish();
                        return false;
                    }
                    if (parse.getQueryParameter("cancel") != null) {
                        yhr0.b();
                        vKWebViewAuthActivity.finish();
                        return false;
                    }
                } else {
                    if (vKWebViewAuthActivity.a()) {
                        str2 = vKWebViewAuthActivity.getIntent().getStringExtra("vk_validation_url");
                    } else {
                        h9r0 h9r0Var = vKWebViewAuthActivity.d;
                        str2 = (h9r0Var != null ? h9r0Var : null).b;
                    }
                    if (str2 == null || brm0.B(str, str2, false)) {
                        Intent intent = new Intent("com.vk.auth-token");
                        String substring = str.substring(drm0.K(0, 6, str, "#", false) + 1);
                        intent.putExtra("extra-token-data", substring);
                        HashMap a = xhr0.a(substring);
                        if (a == null || (!a.containsKey("error") && !a.containsKey("cancel"))) {
                            i = -1;
                        }
                        vKWebViewAuthActivity.setResult(i, intent);
                        yhr0.b();
                        vKWebViewAuthActivity.finish();
                        return true;
                    }
                }
            }
            return false;
        }

        public final void b(int i) {
            this.a = true;
            Intent intent = new Intent();
            intent.putExtra("vw_login_error", i);
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            vKWebViewAuthActivity.setResult(0, intent);
            vKWebViewAuthActivity.finish();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.a) {
                return;
            }
            VKWebViewAuthActivity vKWebViewAuthActivity = VKWebViewAuthActivity.this;
            ProgressBar progressBar = vKWebViewAuthActivity.c;
            if (progressBar == null) {
                progressBar = null;
            }
            progressBar.setVisibility(8);
            WebView webView2 = vKWebViewAuthActivity.b;
            (webView2 != null ? webView2 : null).setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int i;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            String uri = webResourceRequest.getUrl().toString();
            if (webResourceError != null) {
                webResourceError.getDescription().toString();
                i = webResourceError.getErrorCode();
            } else {
                i = -1;
            }
            WebView webView2 = VKWebViewAuthActivity.this.b;
            if (webView2 == null) {
                webView2 = null;
            }
            if (epx.f(webView2.getUrl(), uri)) {
                b(i);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            String url = sslError != null ? sslError.getUrl() : null;
            if (url == null) {
                url = "";
            }
            WebView webView2 = VKWebViewAuthActivity.this.b;
            if (epx.f((webView2 != null ? webView2 : null).getUrl(), url)) {
                b(-11);
            }
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(str);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WebView webView2 = VKWebViewAuthActivity.this.b;
            if (webView2 == null) {
                webView2 = null;
            }
            if (epx.f(webView2.getUrl(), str2)) {
                b(i);
            }
        }
    }

    public final boolean a() {
        return getIntent().getStringExtra("vk_validation_url") != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptySet] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        ?? r3;
        h9r0 h9r0Var;
        super.onCreate(bundle);
        setContentView(R.layout.vk_webview_auth_dialog);
        this.b = (WebView) findViewById(R.id.webView);
        this.c = (ProgressBar) findViewById(R.id.progress);
        String str = h9r0.d;
        Bundle bundleExtra = getIntent().getBundleExtra("vk_auth_params");
        WebView webView = null;
        if (bundleExtra == null) {
            h9r0Var = null;
        } else {
            int i = bundleExtra.getInt("vk_app_id");
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("vk_app_scope");
            if (stringArrayList != null) {
                r3 = new ArrayList(c5g.u(stringArrayList, 10));
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    r3.add(VKScope.valueOf((String) it.next()));
                }
            } else {
                r3 = EmptySet.b;
            }
            h9r0Var = new h9r0(i, bundleExtra.getString("vk_app_redirect_url", h9r0.d), r3);
        }
        if (h9r0Var != null) {
            this.d = h9r0Var;
        } else if (!a()) {
            finish();
        }
        WebView webView2 = this.b;
        if (webView2 == null) {
            webView2 = null;
        }
        webView2.setWebViewClient(new a());
        webView2.setVerticalScrollBarEnabled(false);
        webView2.setVisibility(4);
        webView2.setOverScrollMode(2);
        WebView webView3 = this.b;
        if (webView3 == null) {
            webView3 = null;
        }
        webView3.getSettings().setJavaScriptEnabled(true);
        try {
            if (a()) {
                String stringExtra = getIntent().getStringExtra("vk_validation_url");
                if (stringExtra == null) {
                    throw new IllegalStateException("There is no vk_validation_url key inside");
                }
                WebView webView4 = this.b;
                if (webView4 != null) {
                    webView = webView4;
                }
                webView.loadUrl(stringExtra);
                return;
            }
            Uri.parse("https://api.vk.com/oauth/authorize").buildUpon();
            h9r0 h9r0Var2 = this.d;
            if (h9r0Var2 == null) {
                h9r0Var2 = null;
            }
            String.valueOf(h9r0Var2.a);
            h9r0 h9r0Var3 = this.d;
            if (h9r0Var3 == null) {
                h9r0Var3 = null;
            }
            j5g.g0(h9r0Var3.c, StringUtils.COMMA, null, null, 0, null, 62);
            h9r0 h9r0Var4 = this.d;
            if (h9r0Var4 == null) {
                h9r0Var4 = null;
            }
            String str2 = h9r0Var4.b;
            int i2 = k6r0.a;
            throw null;
        } catch (Exception e2) {
            e2.printStackTrace();
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.b;
        if (webView == null) {
            webView = null;
        }
        webView.destroy();
        yhr0.b();
        super.onDestroy();
    }
}

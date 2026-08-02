package com.vk.id.captcha.web;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.ironsource.X3;
import com.vkontakte.android.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import xsna.bpn0;
import xsna.cbr0;
import xsna.drm0;
import xsna.fiy0;
import xsna.gzs;
import xsna.hiy0;
import xsna.hvy0;
import xsna.izs;
import xsna.j9y0;
import xsna.o9y0;
import xsna.ozl;
import xsna.poy0;
import xsna.s3q0;
import xsna.s8y0;
import xsna.sey0;
import xsna.var0;
import xsna.vk9;
import xsna.xar0;
import xsna.yh9;
import xsna.yty0;

/* compiled from: VKCaptchaWebViewActivity.kt */
/* loaded from: classes2.dex */
public final class VKCaptchaWebViewActivity extends Activity {
    public static final /* synthetic */ int m = 0;
    public WebView b;
    public ProgressBar c;
    public final bpn0 d = new bpn0(new a());
    public final Handler e = new Handler(((poy0) hvy0.a.getValue()).a().getLooper());
    public final Handler f = s8y0.d.a().d;
    public final ThreadPoolExecutor g = (ThreadPoolExecutor) s8y0.d.a().f.getValue();
    public final bpn0 h = new bpn0(e.i);
    public final bpn0 i = new bpn0(new c());
    public final bpn0 j = new bpn0(new d());
    public final bpn0 k = new bpn0(b.i);
    public final bpn0 l = new bpn0(f.i);

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class a extends Lambda implements gzs<fiy0> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final fiy0 invoke() {
            return new fiy0(VKCaptchaWebViewActivity.this.getResources().getConfiguration());
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class b extends Lambda implements gzs<Boolean> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(s8y0.d.a().g);
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class c extends Lambda implements gzs<String> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final String invoke() {
            return VKCaptchaWebViewActivity.this.getIntent().getStringExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY");
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class d extends Lambda implements gzs<Boolean> {
        public d() {
            super(0);
        }

        @Override // xsna.gzs
        public final Boolean invoke() {
            VKCaptchaWebViewActivity vKCaptchaWebViewActivity = VKCaptchaWebViewActivity.this;
            int i = VKCaptchaWebViewActivity.m;
            return Boolean.valueOf(((String) vKCaptchaWebViewActivity.i.getValue()) != null);
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class e extends Lambda implements gzs<sey0> {
        public static final e i = new e(0);

        @Override // xsna.gzs
        public final sey0 invoke() {
            return (sey0) s8y0.d.a().c.getValue();
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class f extends Lambda implements gzs<hiy0> {
        public static final f i = new f(0);

        @Override // xsna.gzs
        public final hiy0 invoke() {
            return new hiy0();
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class g extends Lambda implements gzs<s3q0> {
        public g() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKCaptchaWebViewActivity vKCaptchaWebViewActivity = VKCaptchaWebViewActivity.this;
            int i = VKCaptchaWebViewActivity.m;
            vKCaptchaWebViewActivity.a();
            return s3q0.a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class h extends Lambda implements gzs<s3q0> {
        public h() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKCaptchaWebViewActivity vKCaptchaWebViewActivity = VKCaptchaWebViewActivity.this;
            int i = VKCaptchaWebViewActivity.m;
            vKCaptchaWebViewActivity.a();
            return s3q0.a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class i extends Lambda implements gzs<s3q0> {
        public i() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            VKCaptchaWebViewActivity vKCaptchaWebViewActivity = VKCaptchaWebViewActivity.this;
            int i = VKCaptchaWebViewActivity.m;
            vKCaptchaWebViewActivity.f.post(new yh9(vKCaptchaWebViewActivity, 13));
            return s3q0.a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public static final class j extends Lambda implements gzs<s3q0> {
        public j() {
            super(0);
        }

        @Override // xsna.gzs
        public final s3q0 invoke() {
            ProgressBar progressBar = VKCaptchaWebViewActivity.this.c;
            if (progressBar == null) {
                progressBar = null;
            }
            progressBar.setVisibility(8);
            WebView webView = VKCaptchaWebViewActivity.this.b;
            (webView != null ? webView : null).setVisibility(0);
            return s3q0.a;
        }
    }

    /* compiled from: VKCaptchaWebViewActivity.kt */
    public /* synthetic */ class k extends FunctionReferenceImpl implements izs<List<? extends o9y0>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends o9y0> list) {
            VKCaptchaWebViewActivity vKCaptchaWebViewActivity = (VKCaptchaWebViewActivity) this.receiver;
            int i = VKCaptchaWebViewActivity.m;
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            for (o9y0 o9y0Var : list) {
                jSONObject2.put(o9y0Var.a(), o9y0Var.b());
            }
            jSONObject.put("detail", jSONObject2);
            WebView webView = vKCaptchaWebViewActivity.b;
            if (webView == null) {
                webView = null;
            }
            webView.loadUrl("javascript:window.dispatchEvent(new CustomEvent('VKCaptchaListenSensorsChanged', " + jSONObject + "))");
            return s3q0.a;
        }
    }

    public final void a() {
        finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R.anim.fade_in, R.anim.fade_out);
        } else {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    @Override // android.app.Activity
    @ozl
    public final void onBackPressed() {
        WebView webView = this.b;
        if (webView == null) {
            webView = null;
        }
        if (webView.canGoBack()) {
            WebView webView2 = this.b;
            (webView2 != null ? webView2 : null).goBack();
            return;
        }
        WebView webView3 = this.b;
        (webView3 != null ? webView3 : null).evaluateJavascript("javascript:window.dispatchEvent(new CustomEvent('VKCaptchaUserClose', null))", new cbr0());
        var0.a.getClass();
        var0.a(j9y0.a.a);
        a();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && !((Boolean) this.k.getValue()).booleanValue()) {
            finish();
        }
        try {
            setContentView(R.layout.vkcaptcha_activity);
        } catch (RuntimeException e2) {
            String message = e2.getMessage();
            if (message != null && drm0.D(message.toLowerCase(Locale.ROOT), X3.i.K, false)) {
                var0 var0Var = var0.a;
                j9y0.b bVar = new j9y0.b(new xar0.b(), (String) this.i.getValue());
                var0Var.getClass();
                var0.a(bVar);
                a();
                return;
            }
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        this.b = (WebView) findViewById(R.id.webview);
        this.c = (ProgressBar) findViewById(R.id.progress_bar);
        this.g.execute(new vk9(this, 13));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        WebView webView = this.b;
        if (webView != null) {
            webView.removeJavascriptInterface("AndroidBridge");
        }
        ((yty0) s8y0.d.a().b.getValue()).a();
        WebView webView2 = this.b;
        if (webView2 != null) {
            webView2.destroy();
        }
        super.onDestroy();
    }
}

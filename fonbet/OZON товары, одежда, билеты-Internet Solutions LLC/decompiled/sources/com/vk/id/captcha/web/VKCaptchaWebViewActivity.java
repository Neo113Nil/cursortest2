package com.vk.id.captcha.web;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.common.internal.ImagesContract;
import com.vk.id.captcha.R$anim;
import com.vk.id.captcha.R$id;
import com.vk.id.captcha.R$layout;
import com.vk.id.captcha.a;
import com.vk.id.captcha.api.VKCaptcha;
import com.vk.id.captcha.api.data.VKCaptchaError;
import com.vk.id.captcha.b.a;
import da.C6133a;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00062\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00140\u0013j\u0002`\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u000eR\u001b\u0010\u001f\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010#\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u000eR\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/vk/id/captcha/web/VKCaptchaWebViewActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onDestroy", "finishActivity", "", "isInternetAvailable", "()Z", "", ImagesContract.URL, "prepareUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "Lcom/vk/id/captcha/sensors/model/SensorData;", "Lcom/vk/id/captcha/sensors/model/SensorsData;", "data", "sendVKCaptchaListenSensorsChangedEvent", "(Ljava/util/List;)V", "setupWebView", "(Ljava/lang/String;)V", "wasProcessRecreated", "captchaCreatedFromUserRequest$delegate", "LSc/j;", "getCaptchaCreatedFromUserRequest", "captchaCreatedFromUserRequest", "domain$delegate", "getDomain", "()Ljava/lang/String;", "domain", "isHitmanChallenge$delegate", "isHitmanChallenge", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "Lcom/vk/id/captcha/web/UrlDecorator;", "urlDecorator$delegate", "getUrlDecorator", "()Lcom/vk/id/captcha/web/UrlDecorator;", "urlDecorator", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/os/Handler;", "webViewHandler", "Landroid/os/Handler;", "captcha_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class VKCaptchaWebViewActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private WebView f60574a;

    /* renamed from: b, reason: collision with root package name */
    private ProgressBar f60575b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60576c = k.b(new AnonymousClass7());

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Handler f60577d = new Handler(f.a().a().getLooper());

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60578e = k.b(new AnonymousClass2());

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60579f = k.b(new AnonymousClass3());

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60580g = k.b(AnonymousClass1.f60581a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f60581a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
            return Boolean.valueOf(a.Companion.a().getB());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function0<String> {
        AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return VKCaptchaWebViewActivity.this.getIntent().getStringExtra("VK_CAPTCHA_CHALLENGE_DOMAIN_URL_KEY");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$3, reason: invalid class name */
    static final class AnonymousClass3 extends AbstractC7737t implements Function0<Boolean> {
        AnonymousClass3() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(VKCaptchaWebViewActivity.this.a() != null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$4, reason: invalid class name */
    static final class AnonymousClass4 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass4() {
            super(0);
        }

        public final void a() {
            VKCaptchaWebViewActivity.this.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            a();
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$5, reason: invalid class name */
    static final class AnonymousClass5 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass5() {
            super(0);
        }

        public final void a() {
            VKCaptchaWebViewActivity.this.b();
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            a();
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$6, reason: invalid class name */
    static final class AnonymousClass6 extends AbstractC7737t implements Function0<Unit> {
        AnonymousClass6() {
            super(0);
        }

        public final void a() {
            ProgressBar progressBar = VKCaptchaWebViewActivity.this.f60575b;
            if (progressBar == null) {
                Intrinsics.n("");
                throw null;
            }
            progressBar.setVisibility(8);
            WebView webView = VKCaptchaWebViewActivity.this.f60574a;
            if (webView != null) {
                webView.setVisibility(0);
            } else {
                Intrinsics.n("");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Unit invoke() {
            a();
            return Unit.f71690a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/web/c;", "a", "()Lcom/vk/id/captcha/web/c;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.VKCaptchaWebViewActivity$7, reason: invalid class name */
    static final class AnonymousClass7 extends AbstractC7737t implements Function0<c> {
        AnonymousClass7() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            Configuration configuration = VKCaptchaWebViewActivity.this.getResources().getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "");
            return new c(configuration);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends C7735q implements Function1<List<? extends com.vk.id.captcha.sensors.a.a>, Unit> {
        a(VKCaptchaWebViewActivity vKCaptchaWebViewActivity) {
            super(1, vKCaptchaWebViewActivity, VKCaptchaWebViewActivity.class, "sendVKCaptchaListenSensorsChangedEvent", "sendVKCaptchaListenSensorsChangedEvent(Ljava/util/List;)V", 0);
        }

        public final void a(@NotNull List<? extends com.vk.id.captcha.sensors.a.a> list) {
            Intrinsics.checkNotNullParameter(list, "");
            VKCaptchaWebViewActivity.a((VKCaptchaWebViewActivity) this.receiver, list);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(List<? extends com.vk.id.captcha.sensors.a.a> list) {
            a(list);
            return Unit.f71690a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(String str) {
    }

    @Override // android.app.Activity
    @InterfaceC3999a
    public final void onBackPressed() {
        WebView webView = this.f60574a;
        if (webView == null) {
            Intrinsics.n("");
            throw null;
        }
        if (webView.canGoBack()) {
            WebView webView2 = this.f60574a;
            if (webView2 != null) {
                webView2.goBack();
                return;
            } else {
                Intrinsics.n("");
                throw null;
            }
        }
        WebView webView3 = this.f60574a;
        if (webView3 == null) {
            Intrinsics.n("");
            throw null;
        }
        webView3.evaluateJavascript("javascript:window.dispatchEvent(new CustomEvent('VKCaptchaUserClose', null))", new C6133a());
        VKCaptcha.INSTANCE.closeCaptcha();
        b();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && !((Boolean) this.f60580g.getValue()).booleanValue()) {
            finish();
        }
        try {
            setContentView(R$layout.vkcaptcha_activity);
        } catch (RuntimeException e11) {
            String message = e11.getMessage();
            if (message != null) {
                String lowerCase = message.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null && h.t(lowerCase, "webview", false)) {
                    VKCaptcha.INSTANCE.closeCaptcha$captcha_release(new a.b(new VKCaptchaError.WebviewIsUpdatingError("Webview is being updated", e11), a()));
                    b();
                    return;
                }
            }
        }
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        View findViewById = findViewById(R$id.webview);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f60574a = (WebView) findViewById;
        View findViewById2 = findViewById(R$id.progress_bar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.f60575b = (ProgressBar) findViewById2;
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        if (a.Companion.a().b().a()) {
            String stringExtra = getIntent().getStringExtra("VK_CAPTCHA_URL_KEY");
            Intrinsics.f(stringExtra);
            WebView webView = this.f60574a;
            if (webView == null) {
                Intrinsics.n("");
                throw null;
            }
            webView.getSettings().setJavaScriptEnabled(true);
            webView.addJavascriptInterface(new VKCaptchaJSInterface(this.f60577d, new AnonymousClass4(), new a(this), a.Companion.a().a(), a()), "AndroidBridge");
            webView.setBackgroundColor(0);
            WebView webView2 = this.f60574a;
            if (webView2 == null) {
                Intrinsics.n("");
                throw null;
            }
            webView.setWebViewClient(new g(webView2, new AnonymousClass5(), new AnonymousClass6(), ((Boolean) this.f60579f.getValue()).booleanValue(), stringExtra, a()));
            String a11 = ((c) this.f60576c.getValue()).a(stringExtra);
            WebView webView3 = this.f60574a;
            if (webView3 == null) {
                Intrinsics.n("");
                throw null;
            }
            webView3.loadUrl(a11);
        } else {
            new com.vk.id.captcha.web.a.b().show(getFragmentManager(), "tag");
        }
        WebView webView4 = this.f60574a;
        if (webView4 != null) {
            webView4.getSettings().setCacheMode(2);
        } else {
            Intrinsics.n("");
            throw null;
        }
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        WebView webView = this.f60574a;
        if (webView == null) {
            Intrinsics.n("");
            throw null;
        }
        webView.removeJavascriptInterface("AndroidBridge");
        a.Companion companion = com.vk.id.captcha.b.a.INSTANCE;
        a.Companion.a().a().a();
        WebView webView2 = this.f60574a;
        if (webView2 == null) {
            Intrinsics.n("");
            throw null;
        }
        webView2.destroy();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() {
        return (String) this.f60578e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R$anim.fade_in, R$anim.fade_out);
        } else {
            overridePendingTransition(R$anim.fade_in, R$anim.fade_out);
        }
    }

    public static final /* synthetic */ void a(VKCaptchaWebViewActivity vKCaptchaWebViewActivity, List list) {
        JSONObject jSONObject = new JSONObject();
        Intrinsics.checkNotNullParameter(list, "");
        JSONObject jSONObject2 = new JSONObject();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.vk.id.captcha.sensors.a.a aVar = (com.vk.id.captcha.sensors.a.a) it.next();
            jSONObject2.put(aVar.getD(), aVar.b());
        }
        jSONObject.put(ProductAction.ACTION_DETAIL, jSONObject2);
        WebView webView = vKCaptchaWebViewActivity.f60574a;
        if (webView == null) {
            Intrinsics.n("");
            throw null;
        }
        webView.loadUrl("javascript:window.dispatchEvent(new CustomEvent('VKCaptchaListenSensorsChanged', " + jSONObject + "))");
    }
}

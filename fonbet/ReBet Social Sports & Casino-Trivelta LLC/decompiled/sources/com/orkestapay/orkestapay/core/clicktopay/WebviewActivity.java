package com.orkestapay.orkestapay.core.clicktopay;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.activity.F;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.F0;
import androidx.core.view.J;
import com.orkestapay.R;
import com.orkestapay.orkestapay.client.enums.ClickToPayError;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPay;
import com.orkestapay.orkestapay.client.model.clicktopay.ClickToPayStyle;
import com.orkestapay.orkestapay.core.networking.NetworkUtils;
import com.twilio.voice.EventKeys;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import m.AbstractActivityC5481c;
import m.AbstractC5479a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0014¢\u0006\u0004\b \u0010\u0003R\"\u0010\"\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010)\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00100\u001a\u00020/8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00107R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/orkestapay/orkestapay/core/clicktopay/WebviewActivity;", "Lm/c;", "<init>", "()V", "", EventKeys.URL, "name", EventKeys.VALUE_KEY, "addQueryParam", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "addQueryParamFromList", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "Ljava/io/Serializable;", "T", "Landroid/app/Activity;", "activity", "Ljava/lang/Class;", "clazz", "getSerializable", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Class;)Ljava/io/Serializable;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "loadCheckout", "Landroid/view/MenuItem;", "item", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onStop", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "getWebView", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "Landroid/widget/ProgressBar;", "loader", "Landroid/widget/ProgressBar;", "getLoader", "()Landroid/widget/ProgressBar;", "setLoader", "(Landroid/widget/ProgressBar;)V", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "merchantId", "Ljava/lang/String;", "publicKey", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "clickToPay", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPay;", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPayStyle;", "style", "Lcom/orkestapay/orkestapay/client/model/clicktopay/ClickToPayStyle;", "hasParam", "Z", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "getCallback", "()Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "callback", "Companion", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebviewActivity.kt\ncom/orkestapay/orkestapay/core/clicktopay/WebviewActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,264:1\n1#2:265\n1855#3,2:266\n*S KotlinDebug\n*F\n+ 1 WebviewActivity.kt\ncom/orkestapay/orkestapay/core/clicktopay/WebviewActivity\n*L\n192#1:266,2\n*E\n"})
/* loaded from: classes3.dex */
public final class WebviewActivity extends AbstractActivityC5481c {

    @NotNull
    public static final String CLICK_TO_PAY = "CLICK_TO_PAY";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String MERCHANT_ID = "MERCHANT_ID";

    @NotNull
    public static final String PUBLIC_KEY = "PUBLIC_KEY";

    @NotNull
    public static final String STYLE = "STYLE";

    @NotNull
    public static final String URL = "URL";

    @Nullable
    private static ClickToPayListener listener;
    private ClickToPay clickToPay;
    private boolean hasParam;
    public ProgressBar loader;
    private String merchantId;
    private String publicKey;

    @Nullable
    private ClickToPayStyle style;
    public Toolbar toolbar;
    private String url;
    public WebView webView;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/orkestapay/orkestapay/core/clicktopay/WebviewActivity$Companion;", "", "()V", WebviewActivity.CLICK_TO_PAY, "", "MERCHANT_ID", WebviewActivity.PUBLIC_KEY, WebviewActivity.STYLE, WebviewActivity.URL, "listener", "Lcom/orkestapay/orkestapay/core/clicktopay/ClickToPayListener;", "setListener", "", "callback", "Orkestapay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void setListener(@NotNull ClickToPayListener callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            WebviewActivity.listener = callback;
        }

        private Companion() {
        }
    }

    private final String addQueryParam(String url, String name, String value) {
        if (value == null || value.length() == 0) {
            return url;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(url);
        sb2.append(this.hasParam ? "&" : "?");
        String str = sb2.toString() + name + '=' + URLEncoder.encode(value, "UTF-8");
        this.hasParam = true;
        return str;
    }

    private final String addQueryParamFromList(String url, String name, List<String> value) {
        Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            url = url + Typography.amp + name + '=' + ((String) it.next());
        }
        return url;
    }

    private final <T extends Serializable> T getSerializable(Activity activity, String name, Class<T> clazz) {
        Serializable serializableExtra;
        if (Build.VERSION.SDK_INT < 33) {
            return (T) activity.getIntent().getSerializableExtra(name);
        }
        serializableExtra = activity.getIntent().getSerializableExtra(name, clazz);
        T t10 = (T) serializableExtra;
        Intrinsics.checkNotNull(t10);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F0 onCreate$lambda$2(View v10, F0 insets) {
        Intrinsics.checkNotNullParameter(v10, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        e f10 = insets.f(F0.p.g());
        Intrinsics.checkNotNullExpressionValue(f10, "getInsets(...)");
        v10.setPadding(f10.f19098a, f10.f19099b, f10.f19100c, f10.f19101d);
        return insets;
    }

    @Nullable
    public final ClickToPayListener getCallback() {
        return listener;
    }

    @NotNull
    public final ProgressBar getLoader() {
        ProgressBar progressBar = this.loader;
        if (progressBar != null) {
            return progressBar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loader");
        return null;
    }

    @NotNull
    public final Toolbar getToolbar() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            return toolbar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("toolbar");
        return null;
    }

    @NotNull
    public final WebView getWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            return webView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("webView");
        return null;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void loadCheckout() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.url;
        ClickToPay clickToPay = null;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException(EventKeys.URL);
            str = null;
        }
        sb2.append(str);
        sb2.append("/integrations/click2pay/#/checkout/");
        String str2 = this.merchantId;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantId");
            str2 = null;
        }
        sb2.append(str2);
        sb2.append('/');
        String str3 = this.publicKey;
        if (str3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("publicKey");
            str3 = null;
        }
        sb2.append(str3);
        String sb3 = sb2.toString();
        ClickToPay clickToPay2 = this.clickToPay;
        if (clickToPay2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay2 = null;
        }
        String currency = clickToPay2.getCurrency();
        if (currency != null && currency.length() != 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            sb4.append('/');
            ClickToPay clickToPay3 = this.clickToPay;
            if (clickToPay3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
                clickToPay3 = null;
            }
            sb4.append(clickToPay3.getCurrency());
            sb3 = sb4.toString();
        }
        ClickToPay clickToPay4 = this.clickToPay;
        if (clickToPay4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay4 = null;
        }
        String totalAmount = clickToPay4.getTotalAmount();
        if (totalAmount != null && totalAmount.length() != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb3);
            sb5.append('/');
            ClickToPay clickToPay5 = this.clickToPay;
            if (clickToPay5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
                clickToPay5 = null;
            }
            sb5.append(clickToPay5.getTotalAmount());
            sb3 = sb5.toString();
        }
        ClickToPay clickToPay6 = this.clickToPay;
        if (clickToPay6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay6 = null;
        }
        String addQueryParam = addQueryParam(sb3, "email", clickToPay6.getEmail());
        ClickToPay clickToPay7 = this.clickToPay;
        if (clickToPay7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay7 = null;
        }
        String addQueryParam2 = addQueryParam(addQueryParam, "phoneCountryCode", clickToPay7.getPhoneCountryCode());
        ClickToPay clickToPay8 = this.clickToPay;
        if (clickToPay8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay8 = null;
        }
        String addQueryParam3 = addQueryParam(addQueryParam2, "phoneNumber", clickToPay8.getPhoneNumber());
        ClickToPay clickToPay9 = this.clickToPay;
        if (clickToPay9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay9 = null;
        }
        String addQueryParam4 = addQueryParam(addQueryParam3, "firstName", clickToPay9.getFirstName());
        ClickToPay clickToPay10 = this.clickToPay;
        if (clickToPay10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay10 = null;
        }
        String addQueryParam5 = addQueryParam(addQueryParam4, "lastName", clickToPay10.getLastName());
        ClickToPay clickToPay11 = this.clickToPay;
        if (clickToPay11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
            clickToPay11 = null;
        }
        String addQueryParam6 = addQueryParam(addQueryParam5, "isCscRequired", String.valueOf(clickToPay11.isCscRequired()));
        ClickToPay clickToPay12 = this.clickToPay;
        if (clickToPay12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("clickToPay");
        } else {
            clickToPay = clickToPay12;
        }
        String addQueryParam7 = addQueryParam(addQueryParam6, "isSandbox", String.valueOf(clickToPay.isSandbox()));
        WebSettings settings = getWebView().getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setSupportMultipleWindows(true);
        WebView webView = getWebView();
        webView.clearCache(true);
        webView.clearHistory();
        CookieManager cookieManager = CookieManager.getInstance();
        Intrinsics.checkNotNullExpressionValue(cookieManager, "getInstance(...)");
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(getWebView(), true);
        ClickToPayListener callback = getCallback();
        if (callback != null) {
            getWebView().addJavascriptInterface(new JsInterface(callback, this), "androidListener");
        }
        getWebView().setWebViewClient(new WebViewClient() { // from class: com.orkestapay.orkestapay.core.clicktopay.WebviewActivity$loadCheckout$4
            @Override // android.webkit.WebViewClient
            public void onPageFinished(@Nullable WebView view, @Nullable String url) {
                super.onPageFinished(view, url);
                WebviewActivity.this.getLoader().setVisibility(8);
                if (view == null) {
                    return;
                }
                view.setVisibility(0);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(@Nullable WebView view, @Nullable WebResourceRequest request, @Nullable WebResourceError error) {
                super.onReceivedError(view, request, error);
                if (error != null) {
                    error.toString();
                }
            }
        });
        getWebView().loadUrl(addQueryParam7);
    }

    @Override // androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ClickToPayListener callback;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        View findViewById = findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        setToolbar((Toolbar) findViewById);
        setSupportActionBar(getToolbar());
        if (getIntent().hasExtra(STYLE)) {
            this.style = (ClickToPayStyle) getSerializable(this, STYLE, ClickToPayStyle.class);
        }
        try {
            ClickToPayStyle clickToPayStyle = this.style;
            if (clickToPayStyle != null) {
                getToolbar().setBackgroundColor(clickToPayStyle.getColor());
                AbstractC5479a supportActionBar = getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.D(clickToPayStyle.getTitle());
                }
            }
        } catch (Exception e10) {
            e10.toString();
        }
        AbstractC5479a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
            supportActionBar2.u(true);
        }
        AbstractC2082d0.x0(findViewById(R.id.main), new J() { // from class: com.orkestapay.orkestapay.core.clicktopay.b
            @Override // androidx.core.view.J
            public final F0 f(View view, F0 f02) {
                F0 onCreate$lambda$2;
                onCreate$lambda$2 = WebviewActivity.onCreate$lambda$2(view, f02);
                return onCreate$lambda$2;
            }
        });
        this.clickToPay = (ClickToPay) getSerializable(this, CLICK_TO_PAY, ClickToPay.class);
        String stringExtra = getIntent().getStringExtra("MERCHANT_ID");
        Intrinsics.checkNotNull(stringExtra);
        this.merchantId = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(PUBLIC_KEY);
        Intrinsics.checkNotNull(stringExtra2);
        this.publicKey = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra(URL);
        Intrinsics.checkNotNull(stringExtra3);
        this.url = stringExtra3;
        if (!new NetworkUtils(this).getHasInternet() && (callback = getCallback()) != null) {
            callback.onError(ClickToPayError.NO_INTERNET_CONNECTION.getMessage());
        }
        getOnBackPressedDispatcher().i(this, new F() { // from class: com.orkestapay.orkestapay.core.clicktopay.WebviewActivity$onCreate$4
            {
                super(true);
            }

            @Override // androidx.activity.F
            public void handleOnBackPressed() {
                ClickToPayListener callback2 = WebviewActivity.this.getCallback();
                if (callback2 != null) {
                    callback2.onClosed();
                }
                WebviewActivity.this.finish();
            }
        });
        View findViewById2 = findViewById(R.id.click_to_pay_web_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        setWebView((WebView) findViewById2);
        View findViewById3 = findViewById(R.id.loader);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        setLoader((ProgressBar) findViewById3);
        loadCheckout();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() != 16908332) {
            return super.onOptionsItemSelected(item);
        }
        ClickToPayListener callback = getCallback();
        if (callback != null) {
            callback.onClosed();
        }
        finish();
        return true;
    }

    @Override // m.AbstractActivityC5481c, androidx.fragment.app.AbstractActivityC2168s, android.app.Activity
    public void onStop() {
        CookieManager.getInstance().flush();
        super.onStop();
    }

    public final void setLoader(@NotNull ProgressBar progressBar) {
        Intrinsics.checkNotNullParameter(progressBar, "<set-?>");
        this.loader = progressBar;
    }

    public final void setToolbar(@NotNull Toolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "<set-?>");
        this.toolbar = toolbar;
    }

    public final void setWebView(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "<set-?>");
        this.webView = webView;
    }
}

package ru.ozon.app.android.web.webview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.feature.common.web.R$string;
import ru.ozon.app.android.session.deleteAccount.data.DeleteAccountApiResponse;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H&J\u0006\u0010\u001c\u001a\u00020\u001aJ\u0006\u0010\u001d\u001a\u00020\u001aJ\u0006\u0010\u001e\u001a\u00020\u001aJ\b\u0010\u001f\u001a\u00020\u001aH$J\b\u0010 \u001a\u00020\u001aH\u0004J\b\u0010!\u001a\u00020\u001aH\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\"\u001a\u00020\u001aH\u0002J\b\u0010#\u001a\u00020\u001aH\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\u0018\u0010%\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010&\u001a\u00020'H\u0002R\"\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/web/webview/OzonWebViewContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Landroid/webkit/WebView;", "webView", "getWebView", "()Landroid/webkit/WebView;", "lastUrl", "", "getLastUrl", "()Ljava/lang/String;", "setLastUrl", "(Ljava/lang/String;)V", "screenState", "Lru/ozon/app/android/uikit/screenstate/ScreenStateViewWidget;", "getScreenState", "()Lru/ozon/app/android/uikit/screenstate/ScreenStateViewWidget;", "loadUrl", "", ImagesContract.URL, "reCreateWebView", "loadLastUrl", DeleteAccountApiResponse.Error.TYPE_RELOAD, "initWebView", "onDestroyWebView", "createAndAddWebView", "onWebViewNotInstalled", "removeWebView", "requireMainThread", "recoverLocale", "oldConfiguration", "Landroid/content/res/Configuration;", "isLocaleChanged", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OzonWebViewContainer extends FrameLayout {
    private String lastUrl;

    @NotNull
    private final ScreenStateViewWidget screenState;
    private WebView webView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OzonWebViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void createAndAddWebView() {
        Configuration configuration = getContext().getResources().getConfiguration();
        try {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            createAndAddWebView(context);
        } catch (Resources.NotFoundException unused) {
            Context createConfigurationContext = getContext().createConfigurationContext(new Configuration());
            Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
            createAndAddWebView(createConfigurationContext);
        } catch (Exception e11) {
            if (e11.getMessage() != null) {
                String message = e11.getMessage();
                Intrinsics.f(message);
                if (h.t(message, "No WebView installed", false)) {
                    onWebViewNotInstalled();
                }
            }
            throw e11;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Intrinsics.f(configuration);
        recoverLocale(context2, configuration);
        Context applicationContext = getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        recoverLocale(applicationContext, configuration);
    }

    private final boolean isLocaleChanged(Context context, Configuration oldConfiguration) {
        Configuration configuration = context.getResources().getConfiguration();
        return (Intrinsics.d(configuration.locale, oldConfiguration.locale) && Intrinsics.d(configuration.getLocales(), oldConfiguration.getLocales())) ? false : true;
    }

    private final void onWebViewNotInstalled() {
        this.screenState.showState(new ScreenState.Custom(Integer.valueOf(R$drawable.ic_errors_state), StringProvider.getString(R$string.error_ozonwebview_webview_not_installed_title), StringProvider.getString(R$string.error_ozonwebview_webview_not_installed), null, null, null, null, null, 248, null));
    }

    private final void recoverLocale(Context context, Configuration oldConfiguration) {
        if (isLocaleChanged(context, oldConfiguration)) {
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocales(oldConfiguration.getLocales());
            context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
        }
    }

    private final void removeWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            removeView(webView);
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.destroy();
        }
        this.webView = null;
    }

    private final void requireMainThread() {
        if (!Looper.getMainLooper().isCurrentThread()) {
            throw new IllegalStateException("Only main thread inflation supported");
        }
    }

    protected final String getLastUrl() {
        return this.lastUrl;
    }

    @NotNull
    protected final ScreenStateViewWidget getScreenState() {
        return this.screenState;
    }

    public final WebView getWebView() {
        return this.webView;
    }

    protected abstract void initWebView();

    public final void loadLastUrl() {
        String str = this.lastUrl;
        if (str != null) {
            loadUrl(str);
        }
    }

    public abstract void loadUrl(@NotNull String url);

    protected final void onDestroyWebView() {
        removeWebView();
    }

    public final void reCreateWebView() {
        removeWebView();
        createAndAddWebView();
        initWebView();
    }

    public final void reload() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }

    protected final void setLastUrl(String str) {
        this.lastUrl = str;
    }

    public /* synthetic */ OzonWebViewContainer(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonWebViewContainer(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        ScreenStateViewWidget screenStateViewWidget = new ScreenStateViewWidget(context, null, 0, 6, null);
        screenStateViewWidget.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.screenState = screenStateViewWidget;
    }

    private final void createAndAddWebView(Context context) {
        requireMainThread();
        WebView webView = new WebView(context);
        webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        webView.setRendererPriorityPolicy(2, false);
        this.webView = webView;
        addView(webView, 0);
    }
}

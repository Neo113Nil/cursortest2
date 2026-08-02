package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.core.net.MailTo;
import androidx.core.view.WindowInsetsCompat;
import androidx.webkit.WebSettingsCompat;
import androidx.webkit.WebViewFeature;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.inappmessage.utils.InAppMessageWebViewClient;
import com.braze.ui.support.ViewUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import io.sentry.Session;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.io.files.FileSystemKt;

/* compiled from: InAppMessageHtmlBaseView.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001bH\u0016J\b\u0010\"\u001a\u00020#H&J\u0018\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0012\u0010&\u001a\u00020\u001b2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001e\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,H\u0017R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView;", "Landroid/widget/RelativeLayout;", "Lcom/braze/ui/inappmessage/views/IInAppMessageView;", "context", "Landroid/content/Context;", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "configuredMessageWebView", "Landroid/webkit/WebView;", "hasAppliedWindowInsets", "", "getHasAppliedWindowInsets", "()Z", "setHasAppliedWindowInsets", "(Z)V", "inAppMessageWebViewClient", "Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "isFinished", "messageClickableView", "Landroid/view/View;", "getMessageClickableView", "()Landroid/view/View;", "messageWebView", "getMessageWebView", "()Landroid/webkit/WebView;", "applyWindowInsets", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "finishWebViewDisplay", "getWebViewViewId", "", "onKeyDown", "keyCode", "setHtmlPageFinishedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "setInAppMessageWebViewClient", "setWebViewContent", "htmlBody", "", "assetDirectoryUrl", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class InAppMessageHtmlBaseView extends RelativeLayout implements IInAppMessageView {
    public static final String BRAZE_BRIDGE_PREFIX = "brazeInternalBridge";
    private static final String FILE_URI_SCHEME_PREFIX = "file://";
    private static final String FINISHED_WEBVIEW_URL = "about:blank";
    private static final String HTML_ENCODING = "utf-8";
    private static final String HTML_MIME_TYPE = "text/html";
    private WebView configuredMessageWebView;
    private boolean hasAppliedWindowInsets;
    private InAppMessageWebViewClient inAppMessageWebViewClient;
    private boolean isFinished;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("com.appboy", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract int getWebViewViewId();

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public final void setWebViewContent(String str) {
        setWebViewContent$default(this, str, null, 2, null);
    }

    public InAppMessageHtmlBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return this;
    }

    public WebView getMessageWebView() {
        if (this.isFinished) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot return the WebView for an already finished message";
                }
            }, 2, (Object) null);
            return null;
        }
        final int webViewViewId = getWebViewViewId();
        if (webViewViewId == 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Cannot find WebView. getWebViewViewId() returned 0.";
                }
            }, 3, (Object) null);
            return null;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            return webView;
        }
        WebView webView2 = (WebView) findViewById(webViewViewId);
        if (webView2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "findViewById for " + webViewViewId + " returned null. Returning null for WebView.";
                }
            }, 3, (Object) null);
            return null;
        }
        WebSettings settings = webView2.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(true);
        webView2.setLayerType(2, null);
        webView2.setBackgroundColor(0);
        try {
            if (WebViewFeature.isFeatureSupported("FORCE_DARK")) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                if (ViewUtils.isDeviceInNightMode(context)) {
                    WebSettingsCompat.setForceDark(settings, 2);
                }
            }
            if (WebViewFeature.isFeatureSupported(WebViewFeature.FORCE_DARK_STRATEGY)) {
                WebSettingsCompat.setForceDarkStrategy(settings, 1);
            }
        } catch (Throwable th) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, th, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$4
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to set dark mode WebView settings";
                }
            });
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "this.context");
        final boolean isHtmlInAppMessageHtmlLinkTargetEnabled = new BrazeConfigurationProvider(context2).isHtmlInAppMessageHtmlLinkTargetEnabled();
        if (isHtmlInAppMessageHtmlLinkTargetEnabled) {
            webView2.getSettings().setSupportMultipleWindows(true);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$5
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget enabled";
                }
            }, 2, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "HtmlInAppMessageHtmlLinkTarget not enabled";
                }
            }, 2, (Object) null);
        }
        webView2.setWebChromeClient(new WebChromeClient() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7
            public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
                Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
                if (p1 == null) {
                    return;
                }
                BrandSafetyUtils.detectAdClick(p1, "com.appboy");
                p0.startActivity(p1);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
                Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$7;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z");
                boolean safedk_InAppMessageHtmlBaseView$messageWebView$7_onCreateWindow_f66b9196fa7f2aaf4cf996855dffa522 = safedk_InAppMessageHtmlBaseView$messageWebView$7_onCreateWindow_f66b9196fa7f2aaf4cf996855dffa522(view, isDialog, isUserGesture, resultMsg);
                BrandSafetyUtils.onWebChromeClientCreateWindow("com.appboy", view, resultMsg, safedk_InAppMessageHtmlBaseView$messageWebView$7_onCreateWindow_f66b9196fa7f2aaf4cf996855dffa522);
                return safedk_InAppMessageHtmlBaseView$messageWebView$7_onCreateWindow_f66b9196fa7f2aaf4cf996855dffa522;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(final ConsoleMessage cm) {
                Intrinsics.checkNotNullParameter(cm, "cm");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, InAppMessageHtmlBaseView.this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onConsoleMessage$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Braze HTML In-app Message log. Line: " + cm.lineNumber() + ". SourceId: " + ((Object) cm.sourceId()) + ". Log Level: " + cm.messageLevel() + ". Message: " + ((Object) cm.message());
                    }
                }, 3, (Object) null);
                return true;
            }

            public boolean safedk_InAppMessageHtmlBaseView$messageWebView$7_onCreateWindow_f66b9196fa7f2aaf4cf996855dffa522(WebView p0, boolean p1, boolean p2, Message p3) {
                if (!isHtmlInAppMessageHtmlLinkTargetEnabled) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$1
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
                        }
                    }, 2, (Object) null);
                    return super.onCreateWindow(p0, p1, p2, p3);
                }
                if (p0 == null) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$2
                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "onCreateWindow webView is null, not opening link";
                        }
                    }, 2, (Object) null);
                    return false;
                }
                final WebView.HitTestResult hitTestResult = p0.getHitTestResult();
                Intrinsics.checkNotNullExpressionValue(hitTestResult, "view.hitTestResult");
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("onCreateWindow HitTestResult is ", hitTestResult);
                    }
                }, 2, (Object) null);
                int type = hitTestResult.getType();
                if (type == 2) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(InAppMessageHtmlBaseView.this.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus("tel:", hitTestResult.getExtra()))));
                } else if (type == 4) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(InAppMessageHtmlBaseView.this.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(Intrinsics.stringPlus(MailTo.MAILTO_SCHEME, hitTestResult.getExtra()))));
                } else if (type == 7) {
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(InAppMessageHtmlBaseView.this.getContext(), new Intent("android.intent.action.VIEW", Uri.parse(hitTestResult.getExtra())));
                } else {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$7$onCreateWindow$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            return "onCreateWindow: hitTestResult type was " + hitTestResult.getType() + ". Not doing anything.";
                        }
                    }, 2, (Object) null);
                }
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
                return createBitmap;
            }
        });
        this.configuredMessageWebView = webView2;
        return webView2;
    }

    public void finishWebViewDisplay() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$finishWebViewDisplay$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Finishing WebView display";
            }
        }, 3, (Object) null);
        this.isFinished = true;
        WebView webView = this.configuredMessageWebView;
        if (webView == null) {
            return;
        }
        webView.loadUrl("about:blank");
        webView.onPause();
        webView.removeAllViews();
        this.configuredMessageWebView = null;
    }

    public static /* synthetic */ void setWebViewContent$default(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setWebViewContent");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        inAppMessageHtmlBaseView.setWebViewContent(str, str2);
    }

    public void setWebViewContent(String htmlBody, String assetDirectoryUrl) {
        if (htmlBody != null) {
            WebView messageWebView = getMessageWebView();
            if (messageWebView == null) {
                return;
            }
            messageWebView.loadDataWithBaseURL("file://" + ((Object) assetDirectoryUrl) + FileSystemKt.UnixPathSeparator, htmlBody, HTML_MIME_TYPE, "utf-8", null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$setWebViewContent$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cannot load WebView. htmlBody was null.";
            }
        }, 3, (Object) null);
    }

    public void setInAppMessageWebViewClient(InAppMessageWebViewClient inAppMessageWebViewClient) {
        Intrinsics.checkNotNullParameter(inAppMessageWebViewClient, "inAppMessageWebViewClient");
        WebView messageWebView = getMessageWebView();
        if (messageWebView != null) {
            messageWebView.setWebViewClient(inAppMessageWebViewClient);
        }
        this.inAppMessageWebViewClient = inAppMessageWebViewClient;
    }

    public void setHtmlPageFinishedListener(IWebViewClientStateListener listener) {
        InAppMessageWebViewClient inAppMessageWebViewClient = this.inAppMessageWebViewClient;
        if (inAppMessageWebViewClient == null) {
            return;
        }
        inAppMessageWebViewClient.setWebViewClientStateListener(listener);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        WebView webView = this.configuredMessageWebView;
        if (webView != null) {
            ViewUtils.setFocusableInTouchModeAndRequestFocus(webView);
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isInTouchMode() && event.getKeyCode() == 4 && BrazeInAppMessageManager.INSTANCE.getInstance().getDoesBackButtonDismissInAppMessageViewField()) {
            InAppMessageViewUtils.closeInAppMessageOnKeycodeBack();
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageView
    public void applyWindowInsets(WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        setHasAppliedWindowInsets(true);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "this.context");
        if (new BrazeConfigurationProvider(context).isHtmlInAppMessageApplyWindowInsetsEnabled() && getLayoutParams() != null && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(ViewUtils.getMaxSafeLeftInset(insets) + marginLayoutParams.leftMargin, ViewUtils.getMaxSafeTopInset(insets) + marginLayoutParams.topMargin, ViewUtils.getMaxSafeRightInset(insets) + marginLayoutParams.rightMargin, ViewUtils.getMaxSafeBottomInset(insets) + marginLayoutParams.bottomMargin);
        }
    }
}

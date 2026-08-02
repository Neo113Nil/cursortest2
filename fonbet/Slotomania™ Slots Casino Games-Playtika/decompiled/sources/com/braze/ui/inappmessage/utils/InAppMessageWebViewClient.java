package com.braze.ui.inappmessage.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* compiled from: InAppMessageWebViewClient.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0014H\u0002J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u0012J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0017J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;)V", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "hasPageFinishedLoading", "", "markPageFinishedJob", "Lkotlinx/coroutines/Job;", "maxOnPageFinishedWaitTimeMs", "", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "appendBridgeJavascript", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "handleUrlOverride", "url", "", "markPageFinished", "onPageFinished", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "setWebViewClientStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "shouldOverrideUrlLoading", "request", "Landroid/webkit/WebResourceRequest;", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public class InAppMessageWebViewClient extends WebViewClient {
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String AUTHORITY_NAME_NEWSFEED = "feed";
    private static final String BRAZE_INAPP_MESSAGE_SCHEME = "appboy";
    private static final String BRIDGE_JS_FILE = "braze-html-in-app-message-bridge.js";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private Job markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private IWebViewClientStateListener webViewClientStateListener;

    @JvmStatic
    public static final Bundle getBundleFromUrl(String str) {
        return INSTANCE.getBundleFromUrl(str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded("com.appboy", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted("com.appboy", view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        super.onReceivedError(view, errorCode, description, failingUrl);
        BrandSafetyUtils.onWebViewReceivedError("com.appboy", view, errorCode, description, failingUrl);
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders("com.appboy", view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_895616a7655f880c1311ce2468eb9d7f = safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_895616a7655f880c1311ce2468eb9d7f(view, request);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.appboy", view, request, safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_895616a7655f880c1311ce2468eb9d7f);
        return safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_895616a7655f880c1311ce2468eb9d7f;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Logger.d("Braze|SafeDK: Execution> Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_cb65142b1e5052202abe2b94f411d5b6 = safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_cb65142b1e5052202abe2b94f411d5b6(view, url);
        BrandSafetyUtils.onShouldOverrideUrlLoading("com.appboy", view, url, safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_cb65142b1e5052202abe2b94f411d5b6);
        return safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_cb65142b1e5052202abe2b94f411d5b6;
    }

    public InAppMessageWebViewClient(Context context, IInAppMessage inAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        this.context = context;
        this.inAppMessage = inAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = new BrazeConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        InAppMessageWebViewClient inAppMessageWebViewClient;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            inAppMessageWebViewClient = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, inAppMessageWebViewClient, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onPageFinished$1$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Page has finished loading. Calling onPageFinished on listener";
                }
            }, 2, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        } else {
            inAppMessageWebViewClient = this;
        }
        inAppMessageWebViewClient.hasPageFinishedLoading = true;
        Job job = inAppMessageWebViewClient.markPageFinishedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        inAppMessageWebViewClient.markPageFinishedJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener != null && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$markPageFinished$1$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
                }
            }, 2, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
    }

    private final void appendBridgeJavascript(WebView view) {
        try {
            AssetManager assets = this.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "context.assets");
            view.loadUrl(Intrinsics.stringPlus("javascript:", BrazeFileUtils.getAssetFileStringContents(assets, BRIDGE_JS_FILE)));
        } catch (Exception e) {
            BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$appendBridgeJavascript$javascriptString$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to get HTML in-app message javascript additions";
                }
            });
        }
    }

    public boolean safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_895616a7655f880c1311ce2468eb9d7f(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "request.url.toString()");
        return handleUrlOverride(uri);
    }

    public boolean safedk_InAppMessageWebViewClient_shouldOverrideUrlLoading_cb65142b1e5052202abe2b94f411d5b6(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return handleUrlOverride(url);
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener listener) {
        if (listener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            listener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new InAppMessageWebViewClient$setWebViewClientStateListener$1(this, null), 2, null);
        }
        this.webViewClientStateListener = listener;
    }

    private final boolean handleUrlOverride(String url) {
        if (this.inAppMessageWebViewClientListener == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$1
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "InAppMessageWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
                }
            }, 2, (Object) null);
            return true;
        }
        if (StringsKt.isBlank(url)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "InAppMessageWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true.";
                }
            }, 2, (Object) null);
            return true;
        }
        final Uri parse = Uri.parse(url);
        Bundle bundleFromUrl = INSTANCE.getBundleFromUrl(url);
        if (parse.getScheme() != null && Intrinsics.areEqual(parse.getScheme(), BRAZE_INAPP_MESSAGE_SCHEME)) {
            String authority = parse.getAuthority();
            if (authority != null) {
                int hashCode = authority.hashCode();
                if (hashCode != -1801488983) {
                    if (hashCode != 3138974) {
                        if (hashCode == 94756344 && authority.equals("close")) {
                            this.inAppMessageWebViewClientListener.onCloseAction(this.inAppMessage, url, bundleFromUrl);
                        }
                    } else if (authority.equals(AUTHORITY_NAME_NEWSFEED)) {
                        this.inAppMessageWebViewClientListener.onNewsfeedAction(this.inAppMessage, url, bundleFromUrl);
                    }
                } else if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                    this.inAppMessageWebViewClientListener.onCustomEventAction(this.inAppMessage, url, bundleFromUrl);
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Uri authority was null. Uri: ", parse);
                    }
                }, 3, (Object) null);
            }
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$handleUrlOverride$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return Intrinsics.stringPlus("Uri scheme was null or not an appboy url. Uri: ", parse);
            }
        }, 3, (Object) null);
        this.inAppMessageWebViewClientListener.onOtherUrlAction(this.inAppMessage, url, bundleFromUrl);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.utils.InAppMessageWebViewClient$onRenderProcessGone$1
            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "The webview rendering process crashed, returning true";
            }
        }, 2, (Object) null);
        return true;
    }

    /* compiled from: InAppMessageWebViewClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/braze/ui/inappmessage/utils/InAppMessageWebViewClient$Companion;", "", "()V", "AUTHORITY_NAME_CLOSE", "", "AUTHORITY_NAME_CUSTOM_EVENT", "AUTHORITY_NAME_NEWSFEED", "BRAZE_INAPP_MESSAGE_SCHEME", "BRIDGE_JS_FILE", "JAVASCRIPT_PREFIX", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_DEEPLINK", "QUERY_NAME_EXTERNAL_OPEN", "getBundleFromUrl", "Landroid/os/Bundle;", "url", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Bundle getBundleFromUrl(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            Bundle bundle = new Bundle();
            if (!StringsKt.isBlank(url)) {
                Uri uri = Uri.parse(url);
                Intrinsics.checkNotNullExpressionValue(uri, "uri");
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(uri).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }
    }
}

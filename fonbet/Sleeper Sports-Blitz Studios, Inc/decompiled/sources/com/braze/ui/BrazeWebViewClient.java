package com.braze.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewAssetLoader;
import com.braze.BrazeInternal;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.models.inappmessage.IInAppMessage;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.support.WebContentUtils;
import com.braze.ui.banners.listeners.IBannerWebViewClientListener;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import com.braze.ui.inappmessage.listeners.IInAppMessageWebViewClientListener;
import com.braze.ui.inappmessage.listeners.IWebViewClientStateListener;
import com.braze.ui.support.UriUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.Job;

/* compiled from: BrazeWebViewClient.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 82\u00020\u0001:\u000278BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\rH\u0016J\u0010\u0010)\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010*\u001a\u00020'H\u0002J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0018\u0010+\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\rH\u0017J\u0010\u0010,\u001a\u00020'2\b\u0010-\u001a\u0004\u0018\u00010\u0015J\u0010\u0010.\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\rH\u0002J \u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020\r2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0002J\u0018\u00104\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#2\u0006\u00105\u001a\u000206H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient;", "Landroid/webkit/WebViewClient;", "context", "Landroid/content/Context;", "type", "Lcom/braze/ui/BrazeWebViewClient$Type;", "inAppMessage", "Lcom/braze/models/inappmessage/IInAppMessage;", "inAppMessageWebViewClientListener", "Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;", "bannerWebViewClientListener", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "assetDirectoryUrl", "", "<init>", "(Landroid/content/Context;Lcom/braze/ui/BrazeWebViewClient$Type;Lcom/braze/models/inappmessage/IInAppMessage;Lcom/braze/ui/inappmessage/listeners/IInAppMessageWebViewClientListener;Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;Ljava/lang/String;)V", "getContext", "()Landroid/content/Context;", "getType", "()Lcom/braze/ui/BrazeWebViewClient$Type;", "webViewClientStateListener", "Lcom/braze/ui/inappmessage/listeners/IWebViewClientStateListener;", "hasPageFinishedLoading", "", "hasCalledPageFinishedOnListener", "Ljava/util/concurrent/atomic/AtomicBoolean;", "markPageFinishedJob", "Lkotlinx/coroutines/Job;", "maxOnPageFinishedWaitTimeMs", "", "assetLoader", "Landroidx/webkit/WebViewAssetLoader;", "shouldInterceptRequest", "Landroid/webkit/WebResourceResponse;", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "onPageFinished", "", "url", "appendBridgeJavascript", "markPageFinished", "shouldOverrideUrlLoading", "setWebViewClientStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handleUrlOverride", "handleQueryAction", "uri", "Landroid/net/Uri;", "queryBundle", "Landroid/os/Bundle;", "onRenderProcessGone", "detail", "Landroid/webkit/RenderProcessGoneDetail;", "Type", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class BrazeWebViewClient extends WebViewClient {
    private static final String AUTHORITY_NAME_CLOSE = "close";
    private static final String AUTHORITY_NAME_CUSTOM_EVENT = "customEvent";
    private static final String BRAZE_CUSTOM_EVENT_NAME_KEY = "name";
    private static final String BRAZE_SCHEME = "appboy";
    public static final String BRIDGE_JS_FILE = "braze-html-bridge.js";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String JAVASCRIPT_PREFIX = "javascript:";
    public static final String QUERY_NAME_BUTTON_ID = "abButtonId";
    public static final String QUERY_NAME_DEEPLINK = "abDeepLink";
    public static final String QUERY_NAME_EXTERNAL_OPEN = "abExternalOpen";
    private final WebViewAssetLoader assetLoader;
    private final IBannerWebViewClientListener bannerWebViewClientListener;
    private final Context context;
    private final AtomicBoolean hasCalledPageFinishedOnListener;
    private boolean hasPageFinishedLoading;
    private final IInAppMessage inAppMessage;
    private final IInAppMessageWebViewClientListener inAppMessageWebViewClientListener;
    private Job markPageFinishedJob;
    private final int maxOnPageFinishedWaitTimeMs;
    private final Type type;
    private IWebViewClientStateListener webViewClientStateListener;

    /* compiled from: BrazeWebViewClient.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.IN_APP_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final Bundle getBundleFromUrl(String str) {
        return INSTANCE.getBundleFromUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$7$lambda$6(String str) {
        return str;
    }

    @JvmStatic
    public static final String parseCustomEventNameFromQueryBundle(Bundle bundle) {
        return INSTANCE.parseCustomEventNameFromQueryBundle(bundle);
    }

    @JvmStatic
    public static final BrazeProperties parsePropertiesFromQueryBundle(Bundle bundle) {
        return INSTANCE.parsePropertiesFromQueryBundle(bundle);
    }

    public /* synthetic */ BrazeWebViewClient(Context context, Type type, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, type, (i & 4) != 0 ? null : iInAppMessage, (i & 8) != 0 ? null : iInAppMessageWebViewClientListener, (i & 16) != 0 ? null : iBannerWebViewClientListener, (i & 32) != 0 ? null : str);
    }

    public final Context getContext() {
        return this.context;
    }

    public final Type getType() {
        return this.type;
    }

    public BrazeWebViewClient(Context context, Type type, IInAppMessage iInAppMessage, IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener, IBannerWebViewClientListener iBannerWebViewClientListener, String str) {
        WebViewAssetLoader build;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        this.context = context;
        this.type = type;
        this.inAppMessage = iInAppMessage;
        this.inAppMessageWebViewClientListener = iInAppMessageWebViewClientListener;
        this.bannerWebViewClientListener = iBannerWebViewClientListener;
        this.hasCalledPageFinishedOnListener = new AtomicBoolean(false);
        this.maxOnPageFinishedWaitTimeMs = BrazeInternal.INSTANCE.getConfigurationProvider(context).getInAppMessageWebViewClientOnPageFinishedMaxWaitMs();
        if (str != null) {
            build = new WebViewAssetLoader.Builder().setDomain(WebContentUtils.ASSET_LOADER_DUMMY_DOMAIN).addPathHandler("/", new WebViewAssetLoader.InternalStoragePathHandler(context, new File(str))).build();
        } else {
            build = new WebViewAssetLoader.Builder().setDomain(WebContentUtils.ASSET_LOADER_DUMMY_DOMAIN).addPathHandler("/ab_triggers/", new WebViewAssetLoader.InternalStoragePathHandler(context, new File(context.getCacheDir(), Constants.TRIGGERS_ASSETS_FOLDER))).build();
        }
        Intrinsics.checkNotNull(build);
        this.assetLoader = build;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BrazeWebViewClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Type;", "", "<init>", "(Ljava/lang/String;I)V", "BANNER", "IN_APP_MESSAGE", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BANNER = new Type("BANNER", 0);
        public static final Type IN_APP_MESSAGE = new Type("IN_APP_MESSAGE", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{BANNER, IN_APP_MESSAGE};
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        private Type(String str, int i) {
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
        if (request != null) {
            return this.assetLoader.shouldInterceptRequest(request.getUrl());
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        BrazeWebViewClient brazeWebViewClient;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        super.onPageFinished(view, url);
        appendBridgeJavascript(view);
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            brazeWebViewClient = this;
        } else {
            brazeWebViewClient = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeWebViewClient, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onPageFinished$lambda$2$lambda$1;
                    onPageFinished$lambda$2$lambda$1 = BrazeWebViewClient.onPageFinished$lambda$2$lambda$1();
                    return onPageFinished$lambda$2$lambda$1;
                }
            }, 6, (Object) null);
            iWebViewClientStateListener.onPageFinished();
        }
        brazeWebViewClient.hasPageFinishedLoading = true;
        Job job = brazeWebViewClient.markPageFinishedJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        brazeWebViewClient.markPageFinishedJob = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPageFinished$lambda$2$lambda$1() {
        return "Page has finished loading. Calling onPageFinished on listener";
    }

    private final void appendBridgeJavascript(WebView view) {
        try {
            AssetManager assets = this.context.getAssets();
            Intrinsics.checkNotNullExpressionValue(assets, "getAssets(...)");
            view.loadUrl(JAVASCRIPT_PREFIX + BrazeFileUtils.getAssetFileStringContents(assets, BRIDGE_JS_FILE));
        } catch (Exception e) {
            if (this.type == Type.IN_APP_MESSAGE) {
                BrazeInAppMessageManager.INSTANCE.getInstance().hideCurrentlyDisplayingInAppMessage(false);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String appendBridgeJavascript$lambda$3;
                    appendBridgeJavascript$lambda$3 = BrazeWebViewClient.appendBridgeJavascript$lambda$3(BrazeWebViewClient.this);
                    return appendBridgeJavascript$lambda$3;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String appendBridgeJavascript$lambda$3(BrazeWebViewClient brazeWebViewClient) {
        return "Failed to get HTML " + brazeWebViewClient.type.name() + " javascript additions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPageFinished() {
        IWebViewClientStateListener iWebViewClientStateListener = this.webViewClientStateListener;
        if (iWebViewClientStateListener == null || !this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String markPageFinished$lambda$5$lambda$4;
                markPageFinished$lambda$5$lambda$4 = BrazeWebViewClient.markPageFinished$lambda$5$lambda$4();
                return markPageFinished$lambda$5$lambda$4;
            }
        }, 6, (Object) null);
        iWebViewClientStateListener.onPageFinished();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markPageFinished$lambda$5$lambda$4() {
        return "Page may not have finished loading, but max wait time has expired. Calling onPageFinished on listener.";
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(request, "request");
        String uri = request.getUrl().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return handleUrlOverride(uri);
    }

    @Override // android.webkit.WebViewClient
    @Deprecated(message = "Deprecated in API 24")
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        return handleUrlOverride(url);
    }

    public final void setWebViewClientStateListener(IWebViewClientStateListener listener) {
        if (listener != null && this.hasPageFinishedLoading && this.hasCalledPageFinishedOnListener.compareAndSet(false, true)) {
            listener.onPageFinished();
        } else {
            this.markPageFinishedJob = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Integer.valueOf(this.maxOnPageFinishedWaitTimeMs), null, new BrazeWebViewClient$setWebViewClientStateListener$1(this, null), 2, null);
        }
        this.webViewClientStateListener = listener;
    }

    private final boolean handleUrlOverride(String url) {
        final String str;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        if (this.type == Type.IN_APP_MESSAGE && this.inAppMessageWebViewClientListener == null) {
            str = "BrazeWebViewClient was given null IInAppMessageWebViewClientListener listener. Returning true.";
        } else if (this.type == Type.BANNER && this.bannerWebViewClientListener == null) {
            str = "BrazeWebViewClient was given null IBannerWebViewClientListener listener. Returning true.";
        } else {
            str = StringsKt.isBlank(url) ? "BrazeWebViewClient.shouldOverrideUrlLoading was given blank url. Returning true." : null;
        }
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleUrlOverride$lambda$7$lambda$6;
                    handleUrlOverride$lambda$7$lambda$6 = BrazeWebViewClient.handleUrlOverride$lambda$7$lambda$6(str);
                    return handleUrlOverride$lambda$7$lambda$6;
                }
            }, 6, (Object) null);
            return true;
        }
        final Uri parse = Uri.parse(url);
        Bundle bundleFromUrl = INSTANCE.getBundleFromUrl(url);
        if (parse.getScheme() != null && Intrinsics.areEqual(parse.getScheme(), BRAZE_SCHEME)) {
            handleQueryAction(url, parse, bundleFromUrl);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String handleUrlOverride$lambda$8;
                handleUrlOverride$lambda$8 = BrazeWebViewClient.handleUrlOverride$lambda$8(parse);
                return handleUrlOverride$lambda$8;
            }
        }, 7, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            IInAppMessage iInAppMessage = this.inAppMessage;
            if (iInAppMessage != null && (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) != null) {
                iInAppMessageWebViewClientListener.onOtherUrlAction(iInAppMessage, url, bundleFromUrl);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            IBannerWebViewClientListener iBannerWebViewClientListener = this.bannerWebViewClientListener;
            if (iBannerWebViewClientListener != null) {
                iBannerWebViewClientListener.onOtherUrlAction(this.context, url, bundleFromUrl);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleUrlOverride$lambda$8(Uri uri) {
        return "Uri scheme was null or not an appboy url. Uri: " + uri;
    }

    private final void handleQueryAction(String url, final Uri uri, Bundle queryBundle) {
        IBannerWebViewClientListener iBannerWebViewClientListener;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener;
        IBannerWebViewClientListener iBannerWebViewClientListener2;
        IInAppMessageWebViewClientListener iInAppMessageWebViewClientListener2;
        String authority = uri.getAuthority();
        if (authority == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String handleQueryAction$lambda$10;
                    handleQueryAction$lambda$10 = BrazeWebViewClient.handleQueryAction$lambda$10(uri);
                    return handleQueryAction$lambda$10;
                }
            }, 7, (Object) null);
            return;
        }
        int hashCode = authority.hashCode();
        if (hashCode == -1801488983) {
            if (authority.equals(AUTHORITY_NAME_CUSTOM_EVENT)) {
                if (this.type == Type.IN_APP_MESSAGE) {
                    IInAppMessage iInAppMessage = this.inAppMessage;
                    if (iInAppMessage == null || (iInAppMessageWebViewClientListener = this.inAppMessageWebViewClientListener) == null) {
                        return;
                    }
                    iInAppMessageWebViewClientListener.onCustomEventAction(iInAppMessage, url, queryBundle);
                    return;
                }
                if (this.type != Type.BANNER || (iBannerWebViewClientListener = this.bannerWebViewClientListener) == null) {
                    return;
                }
                iBannerWebViewClientListener.onCustomEventAction(this.context, url, queryBundle);
                return;
            }
            return;
        }
        if (hashCode == 94756344 && authority.equals("close")) {
            if (this.type == Type.IN_APP_MESSAGE) {
                IInAppMessage iInAppMessage2 = this.inAppMessage;
                if (iInAppMessage2 == null || (iInAppMessageWebViewClientListener2 = this.inAppMessageWebViewClientListener) == null) {
                    return;
                }
                iInAppMessageWebViewClientListener2.onCloseAction(iInAppMessage2, url, queryBundle);
                return;
            }
            if (this.type != Type.BANNER || (iBannerWebViewClientListener2 = this.bannerWebViewClientListener) == null) {
                return;
            }
            iBannerWebViewClientListener2.onCloseAction(this.context, url, queryBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String handleQueryAction$lambda$10(Uri uri) {
        return "Uri authority was null. Uri: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onRenderProcessGone$lambda$13() {
        return "The webview rendering process crashed, returning true";
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail detail) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(detail, "detail");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.BrazeWebViewClient$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onRenderProcessGone$lambda$13;
                onRenderProcessGone$lambda$13 = BrazeWebViewClient.onRenderProcessGone$lambda$13();
                return onRenderProcessGone$lambda$13;
            }
        }, 6, (Object) null);
        return true;
    }

    /* compiled from: BrazeWebViewClient.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/braze/ui/BrazeWebViewClient$Companion;", "", "<init>", "()V", "BRIDGE_JS_FILE", "", "JAVASCRIPT_PREFIX", "BRAZE_SCHEME", "AUTHORITY_NAME_CLOSE", "AUTHORITY_NAME_CUSTOM_EVENT", "BRAZE_CUSTOM_EVENT_NAME_KEY", "QUERY_NAME_BUTTON_ID", "QUERY_NAME_EXTERNAL_OPEN", "QUERY_NAME_DEEPLINK", "getBundleFromUrl", "Landroid/os/Bundle;", "url", "parseCustomEventNameFromQueryBundle", "queryBundle", "parsePropertiesFromQueryBundle", "Lcom/braze/models/outgoing/BrazeProperties;", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                for (Map.Entry<String, String> entry : UriUtils.getQueryParameters(Uri.parse(url)).entrySet()) {
                    bundle.putString(entry.getKey(), entry.getValue());
                }
            }
            return bundle;
        }

        @JvmStatic
        public final String parseCustomEventNameFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            return queryBundle.getString("name");
        }

        @JvmStatic
        public final BrazeProperties parsePropertiesFromQueryBundle(Bundle queryBundle) {
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            BrazeProperties brazeProperties = new BrazeProperties();
            for (String str : queryBundle.keySet()) {
                if (!Intrinsics.areEqual(str, "name")) {
                    String string = queryBundle.getString(str, null);
                    String str2 = string;
                    if (str2 != null && !StringsKt.isBlank(str2)) {
                        Intrinsics.checkNotNull(str);
                        brazeProperties.addProperty(str, string);
                    }
                }
            }
            return brazeProperties;
        }
    }
}

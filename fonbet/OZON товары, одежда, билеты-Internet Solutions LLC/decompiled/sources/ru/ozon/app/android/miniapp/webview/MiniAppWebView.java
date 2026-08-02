package ru.ozon.app.android.miniapp.webview;

import Ob0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.network.whitelist.domain.DomainsInteractor;
import ru.ozon.app.android.uikit.screenstate.ScreenState;
import ru.ozon.app.android.web.webview.OzonWebViewContainer;
import ru.ozon.app.android.web.webview.client.OzonWebViewUrlInterceptor;
import ru.ozon.app.android.web.webview.client.WebViewRendererProcessCrashHandler;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 v2\u00020\u0001:\u0002vwB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u0013\u0010!J\r\u0010\"\u001a\u00020\u000e¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000e¢\u0006\u0004\b%\u0010\u0016J\u0017\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010&\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J!\u00101\u001a\u00020\u000e2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e0/¢\u0006\u0004\b1\u00102J'\u00104\u001a\u0002032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b9\u0010\u0014J\u0019\u0010:\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b:\u0010\u0014J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u0010\u0016J\u0017\u0010?\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010A\u001a\u00020\u001fH\u0002¢\u0006\u0004\bB\u0010CR2\u0010D\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u00102R2\u0010I\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u000e\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010E\u001a\u0004\bJ\u0010G\"\u0004\bK\u00102RB\u0010Q\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0N0M\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u000e\u0018\u00010L8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R:\u0010_\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110^0/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010E\u001a\u0004\b`\u0010G\"\u0004\ba\u00102R\u0018\u0010b\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001b\u0010i\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010f\u001a\u0004\bl\u0010mR\u0014\u0010r\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010t¨\u0006x"}, d2 = {"Lru/ozon/app/android/miniapp/webview/MiniAppWebView;", "Lru/ozon/app/android/web/webview/OzonWebViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", ImagesContract.URL, "loadUrl", "(Ljava/lang/String;)V", "initWebView", "()V", "Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;", "webViewRendererProcessCrashHandler", "Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;", "ozonWebViewUrlInterceptor", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "init", "(Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "", "ignoreErrors", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "refresh", "canGoBack", "()Z", "goBack", "isFullscreen", "setFullscreen", "(Z)Lkotlin/Unit;", "getPageScrollY", "()Ljava/lang/Integer;", "Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;", "domainsInteractor", "setHostsWhiteListChecker", "(Lru/ozon/app/android/network/whitelist/domain/DomainsInteractor;)V", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setGoBackListener", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/miniapp/webview/MiniAppWebViewClient;", "createWebViewClient", "(Lru/ozon/app/android/web/webview/client/WebViewRendererProcessCrashHandler;Lru/ozon/app/android/web/webview/client/OzonWebViewUrlInterceptor;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)Lru/ozon/app/android/miniapp/webview/MiniAppWebViewClient;", "Landroid/webkit/WebChromeClient;", "createChromeClient", "()Landroid/webkit/WebChromeClient;", "onPageStart", "onPageFinished", "Lru/ozon/app/android/uikit/screenstate/ScreenState;", "updateScreenState", "(Lru/ozon/app/android/uikit/screenstate/ScreenState;)V", "hideRefreshAnimation", "updateUrl", "(Ljava/lang/String;)Ljava/lang/String;", "ignore", "setIgnoreErrors", "(Z)V", "onPageStartListener", "Lkotlin/jvm/functions/Function1;", "getOnPageStartListener", "()Lkotlin/jvm/functions/Function1;", "setOnPageStartListener", "onPageFinishedListener", "getOnPageFinishedListener", "setOnPageFinishedListener", "Lkotlin/Function2;", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "Landroid/webkit/WebChromeClient$FileChooserParams;", "onShowFileChooserListener", "Lkotlin/jvm/functions/Function2;", "getOnShowFileChooserListener", "()Lkotlin/jvm/functions/Function2;", "setOnShowFileChooserListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function0;", "onHideRefreshAnimationHandler", "Lkotlin/jvm/functions/Function0;", "getOnHideRefreshAnimationHandler", "()Lkotlin/jvm/functions/Function0;", "setOnHideRefreshAnimationHandler", "(Lkotlin/jvm/functions/Function0;)V", "", "headersProvider", "getHeadersProvider", "setHeadersProvider", "client", "Lru/ozon/app/android/miniapp/webview/MiniAppWebViewClient;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi$delegate", "LSc/j;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "LOb0/a;", "ozonIdAppApi$delegate", "getOzonIdAppApi", "()LOb0/a;", "ozonIdAppApi", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "getFeatureChecker", "()Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "getWebViewLogger", "()Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewLogger", "Companion", "SavedStateWebView", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes12.dex */
public final class MiniAppWebView extends OzonWebViewContainer {
    private MiniAppWebViewClient client;

    @NotNull
    private Function1<? super String, ? extends Map<String, String>> headersProvider;

    /* renamed from: networkComponentApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j networkComponentApi;
    private Function0<Unit> onHideRefreshAnimationHandler;
    private Function1<? super String, Unit> onPageFinishedListener;
    private Function1<? super String, Unit> onPageStartListener;
    private Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener;

    /* renamed from: ozonIdAppApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdAppApi;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0083\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/miniapp/webview/MiniAppWebView$SavedStateWebView;", "Landroid/os/Parcelable;", "child", "Landroid/os/Bundle;", "webView", "<init>", "(Landroid/os/Parcelable;Landroid/os/Bundle;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcelable;", "getChild", "()Landroid/os/Parcelable;", "Landroid/os/Bundle;", "getWebView", "()Landroid/os/Bundle;", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class SavedStateWebView implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SavedStateWebView> CREATOR = new Creator();
        private final Parcelable child;

        @NotNull
        private final Bundle webView;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedStateWebView> {
            @Override // android.os.Parcelable.Creator
            public final SavedStateWebView createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedStateWebView(parcel.readParcelable(SavedStateWebView.class.getClassLoader()), parcel.readBundle(SavedStateWebView.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final SavedStateWebView[] newArray(int i11) {
                return new SavedStateWebView[i11];
            }
        }

        public SavedStateWebView(Parcelable parcelable, @NotNull Bundle webView) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            this.child = parcelable;
            this.webView = webView;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedStateWebView)) {
                return false;
            }
            SavedStateWebView savedStateWebView = (SavedStateWebView) other;
            return Intrinsics.d(this.child, savedStateWebView.child) && Intrinsics.d(this.webView, savedStateWebView.webView);
        }

        public final Parcelable getChild() {
            return this.child;
        }

        @NotNull
        public final Bundle getWebView() {
            return this.webView;
        }

        public int hashCode() {
            Parcelable parcelable = this.child;
            return this.webView.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "SavedStateWebView(child=" + this.child + ", webView=" + this.webView + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.child, flags);
            dest.writeBundle(this.webView);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MiniAppWebView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final WebChromeClient createChromeClient() {
        return new MiniAppChromeWebClient(new MiniAppWebView$createChromeClient$1(this), getWebViewLogger());
    }

    private final MiniAppWebViewClient createWebViewClient(WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler, OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor, WebViewErrorLogger webViewErrorLogger) {
        return new MiniAppWebViewClient(new MiniAppWebView$createWebViewClient$1(this), new MiniAppWebView$createWebViewClient$2(this), new MiniAppWebView$createWebViewClient$3(this), new MiniAppWebView$createWebViewClient$4(this), webViewRendererProcessCrashHandler, ozonWebViewUrlInterceptor, getFeatureChecker(), webViewErrorLogger);
    }

    private final FeatureChecker getFeatureChecker() {
        return getNetworkComponentApi().getFeatureChecker();
    }

    private final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.networkComponentApi.getValue();
    }

    private final a getOzonIdAppApi() {
        return (a) this.ozonIdAppApi.getValue();
    }

    private final WebViewErrorLogger getWebViewLogger() {
        return getNetworkComponentApi().getWebViewErrorLogger();
    }

    private final void hideRefreshAnimation() {
        Function0<Unit> function0 = this.onHideRefreshAnimationHandler;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageFinished(String url) {
        if (!(getScreenState().getLastState() instanceof ScreenState.ServerIssue)) {
            getScreenState().showState(new ScreenState.NoScreen());
            WebView webView = getWebView();
            if (webView != null) {
                ViewExtKt.show(webView);
            }
        }
        Function1<? super String, Unit> function1 = this.onPageFinishedListener;
        if (function1 != null) {
            function1.invoke(url);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPageStart(String url) {
        Function1<? super String, Unit> function1 = this.onPageStartListener;
        if (function1 != null) {
            function1.invoke(url);
        }
    }

    private final void setIgnoreErrors(boolean ignore) {
        MiniAppWebViewClient miniAppWebViewClient = this.client;
        if (miniAppWebViewClient != null) {
            miniAppWebViewClient.setErrorsIgnored(ignore);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScreenState(ScreenState state) {
        getScreenState().showState(state);
    }

    private final String updateUrl(String url) {
        String uri;
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        if (scheme != null && !h.K(scheme)) {
            parse = null;
        }
        return (parse == null || (uri = parse.buildUpon().scheme("https").build().toString()) == null) ? url : uri;
    }

    public final boolean canGoBack() {
        WebView webView = getWebView();
        return webView != null && webView.canGoBack();
    }

    public final Function2<ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Unit> getOnShowFileChooserListener() {
        return this.onShowFileChooserListener;
    }

    public final Integer getPageScrollY() {
        WebView webView = getWebView();
        if (webView != null) {
            return Integer.valueOf(webView.getScrollY());
        }
        return null;
    }

    public final void goBack() {
        WebView webView = getWebView();
        if (webView != null) {
            webView.goBack();
        }
    }

    public final void init(@NotNull WebViewRendererProcessCrashHandler webViewRendererProcessCrashHandler, @NotNull OzonWebViewUrlInterceptor ozonWebViewUrlInterceptor, @NotNull WebViewErrorLogger webViewErrorLogger) {
        Intrinsics.checkNotNullParameter(webViewRendererProcessCrashHandler, "webViewRendererProcessCrashHandler");
        Intrinsics.checkNotNullParameter(ozonWebViewUrlInterceptor, "ozonWebViewUrlInterceptor");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.client = createWebViewClient(webViewRendererProcessCrashHandler, ozonWebViewUrlInterceptor, webViewErrorLogger);
        addView(getScreenState());
        reCreateWebView();
        getScreenState().setListener(new MiniAppWebView$init$1(this));
    }

    @Override // ru.ozon.app.android.web.webview.OzonWebViewContainer
    protected void initWebView() {
        final WebView webView = getWebView();
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setDomStorageEnabled(true);
            settings.setJavaScriptEnabled(true);
            webView.setWebChromeClient(createChromeClient());
            MiniAppWebViewClient miniAppWebViewClient = this.client;
            if (miniAppWebViewClient != null) {
                webView.setWebViewClient(miniAppWebViewClient);
            }
            getOzonIdAppApi().r(new Pb0.a(webView) { // from class: ru.ozon.app.android.miniapp.webview.MiniAppWebView$initWebView$1$3
                private final WebView webView;

                {
                    this.webView = webView;
                }

                @Override // Pb0.a
                public WebView getWebView() {
                    return this.webView;
                }
            });
        }
    }

    @Override // ru.ozon.app.android.web.webview.OzonWebViewContainer
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        loadUrl(url, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (state instanceof SavedStateWebView) {
            WebView webView = getWebView();
            if (webView != null) {
                webView.restoreState(((SavedStateWebView) state).getWebView());
            }
            super.onRestoreInstanceState(((SavedStateWebView) state).getChild());
        }
    }

    @Override // android.view.View
    @NotNull
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        WebView webView = getWebView();
        if (webView != null) {
            webView.saveState(bundle);
        }
        return new SavedStateWebView(onSaveInstanceState, bundle);
    }

    public final void refresh() {
        WebView webView = getWebView();
        setLastUrl(webView != null ? webView.getUrl() : null);
        String lastUrl = getLastUrl();
        if (lastUrl != null) {
            MiniAppWebViewClient miniAppWebViewClient = this.client;
            loadUrl(lastUrl, miniAppWebViewClient != null ? Boolean.valueOf(miniAppWebViewClient.getIsErrorsIgnored()) : null);
        }
        hideRefreshAnimation();
    }

    public final Unit setFullscreen(boolean isFullscreen) {
        ViewGroup.LayoutParams layoutParams;
        WebView webView = getWebView();
        if (webView == null || (layoutParams = webView.getLayoutParams()) == null) {
            return null;
        }
        if (isFullscreen) {
            layoutParams.width = -1;
            layoutParams.height = -1;
        } else {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        return Unit.f71690a;
    }

    public final void setGoBackListener(@NotNull Function1<? super Boolean, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        MiniAppWebViewClient miniAppWebViewClient = this.client;
        if (miniAppWebViewClient != null) {
            miniAppWebViewClient.setCanGoBackListener(listener);
        }
    }

    public final void setHeadersProvider(@NotNull Function1<? super String, ? extends Map<String, String>> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.headersProvider = function1;
    }

    public final void setHostsWhiteListChecker(DomainsInteractor domainsInteractor) {
        MiniAppWebViewClient miniAppWebViewClient = this.client;
        if (miniAppWebViewClient != null) {
            miniAppWebViewClient.setDomainsInteractor(domainsInteractor);
        }
    }

    public final void setOnHideRefreshAnimationHandler(Function0<Unit> function0) {
        this.onHideRefreshAnimationHandler = function0;
    }

    public final void setOnPageFinishedListener(Function1<? super String, Unit> function1) {
        this.onPageFinishedListener = function1;
    }

    public final void setOnPageStartListener(Function1<? super String, Unit> function1) {
        this.onPageStartListener = function1;
    }

    public /* synthetic */ MiniAppWebView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final void loadUrl(@NotNull String url, Boolean ignoreErrors) {
        Intrinsics.checkNotNullParameter(url, "url");
        String updateUrl = updateUrl(url);
        setLastUrl(updateUrl);
        if (ignoreErrors != null) {
            setIgnoreErrors(ignoreErrors.booleanValue());
        }
        WebView webView = getWebView();
        if (webView != null) {
            webView.loadUrl(updateUrl, this.headersProvider.invoke(url));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppWebView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.headersProvider = MiniAppWebView$headersProvider$1.INSTANCE;
        this.networkComponentApi = k.b(new MiniAppWebView$networkComponentApi$2(context));
        this.ozonIdAppApi = k.b(new MiniAppWebView$ozonIdAppApi$2(context));
    }
}

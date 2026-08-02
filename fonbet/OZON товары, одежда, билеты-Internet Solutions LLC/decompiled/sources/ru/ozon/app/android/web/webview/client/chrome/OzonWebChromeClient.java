package ru.ozon.app.android.web.webview.client.chrome;

import B90.RunnableC2599a;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.core.app.b;
import androidx.core.content.a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.logs.WebViewErrorLogger;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.app.android.web.OnReceiveTitleListener;
import ru.ozon.app.android.web.webview.client.OzonLoggerChromeWebViewClient;
import ru.ozon.app.android.web.webview.client.chrome.OzonWebChromeClient;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\nH\u0016¢\u0006\u0004\b(\u0010\fJ3\u0010+\u001a\u00020\n2$\u0010*\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0)¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\n2\u0006\u0010*\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\n¢\u0006\u0004\b0\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u00107\u001a\n 6*\u0004\u0018\u000105058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R6\u0010<\u001a\"\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lru/ozon/app/android/web/webview/client/chrome/OzonWebChromeClient;", "Lru/ozon/app/android/web/webview/client/OzonLoggerChromeWebViewClient;", "Landroid/app/Activity;", "activity", "Landroid/webkit/WebView;", "webView", "Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "webViewErrorLogger", "<init>", "(Landroid/app/Activity;Landroid/webkit/WebView;Lru/ozon/app/android/network/logs/WebViewErrorLogger;)V", "", "addFocusChangeObserver", "()V", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "filePathCallback", "Landroid/webkit/WebChromeClient$FileChooserParams;", "fileChooserParams", "", "onShowFileChooser", "(Landroid/webkit/WebView;Landroid/webkit/ValueCallback;Landroid/webkit/WebChromeClient$FileChooserParams;)Z", "Landroid/webkit/PermissionRequest;", "request", "onPermissionRequest", "(Landroid/webkit/PermissionRequest;)V", "onPermissionRequestCanceled", "Landroid/graphics/Bitmap;", "getDefaultVideoPoster", "()Landroid/graphics/Bitmap;", "view", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/view/View;", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "callback", "onShowCustomView", "(Landroid/view/View;Landroid/webkit/WebChromeClient$CustomViewCallback;)V", "onHideCustomView", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnShowFileChooserListener", "(Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "setOnReceiveTitleListener", "(Lru/ozon/app/android/web/OnReceiveTitleListener;)V", "onDestroyWebView", "Landroid/webkit/WebView;", "Lru/ozon/app/android/web/webview/client/chrome/OzonFullscreenWebChromeClientDelegate;", "fullscreenDelegate", "Lru/ozon/app/android/web/webview/client/chrome/OzonFullscreenWebChromeClientDelegate;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "onFocusChangedListener", "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;", "onShowFileChooserListener", "Lkotlin/jvm/functions/Function2;", "onReceiveTitleListener", "Lru/ozon/app/android/web/OnReceiveTitleListener;", "isWaitingForPermissionResult", "Z", "savedRequest", "Landroid/webkit/PermissionRequest;", "Companion", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonWebChromeClient extends OzonLoggerChromeWebViewClient {
    private final Context context;

    @NotNull
    private final OzonFullscreenWebChromeClientDelegate fullscreenDelegate;
    private boolean isWaitingForPermissionResult;

    @NotNull
    private final ViewTreeObserver.OnWindowFocusChangeListener onFocusChangedListener;
    private OnReceiveTitleListener onReceiveTitleListener;
    private Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> onShowFileChooserListener;
    private PermissionRequest savedRequest;

    @NotNull
    private final WebView webView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonWebChromeClient(@NotNull Activity activity, @NotNull WebView webView, @NotNull WebViewErrorLogger webViewErrorLogger) {
        super(webViewErrorLogger);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(webViewErrorLogger, "webViewErrorLogger");
        this.webView = webView;
        this.fullscreenDelegate = new OzonFullscreenWebChromeClientDelegate(activity, webView);
        this.context = webView.getContext();
        this.onFocusChangedListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: MY.a
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z11) {
                OzonWebChromeClient.onFocusChangedListener$lambda$2(OzonWebChromeClient.this, z11);
            }
        };
        addFocusChangeObserver();
    }

    private final void addFocusChangeObserver() {
        this.webView.getViewTreeObserver().addOnWindowFocusChangeListener(this.onFocusChangedListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangedListener$lambda$2(OzonWebChromeClient ozonWebChromeClient, boolean z11) {
        if (z11 && ozonWebChromeClient.isWaitingForPermissionResult) {
            ozonWebChromeClient.isWaitingForPermissionResult = false;
            if (a.checkSelfPermission(ozonWebChromeClient.context, "android.permission.CAMERA") == 0) {
                PermissionRequest permissionRequest = ozonWebChromeClient.savedRequest;
                if (permissionRequest != null) {
                    permissionRequest.grant(permissionRequest.getResources());
                }
                ozonWebChromeClient.webView.post(new RunnableC2599a(ozonWebChromeClient, 3));
            } else {
                PermissionRequest permissionRequest2 = ozonWebChromeClient.savedRequest;
                if (permissionRequest2 != null) {
                    permissionRequest2.deny();
                }
            }
            ozonWebChromeClient.savedRequest = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFocusChangedListener$lambda$2$lambda$1(OzonWebChromeClient ozonWebChromeClient) {
        ozonWebChromeClient.webView.reload();
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
    }

    public final void onDestroyWebView() {
        this.webView.getViewTreeObserver().removeOnWindowFocusChangeListener(this.onFocusChangedListener);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        this.fullscreenDelegate.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequest(PermissionRequest request) {
        if (request == null) {
            return;
        }
        String[] resources = request.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        if (!C7705l.m(resources, "android.webkit.resource.VIDEO_CAPTURE")) {
            request.deny();
            return;
        }
        if (a.checkSelfPermission(this.context, "android.permission.CAMERA") == 0) {
            request.grant(request.getResources());
            return;
        }
        this.savedRequest = request;
        this.isWaitingForPermissionResult = true;
        Context context = this.context;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            b.e(activity, new String[]{"android.permission.CAMERA"}, 999);
        } else {
            request.deny();
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onPermissionRequestCanceled(PermissionRequest request) {
        super.onPermissionRequestCanceled(request);
        if (Intrinsics.d(this.savedRequest, request)) {
            this.savedRequest = null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        OnReceiveTitleListener onReceiveTitleListener = this.onReceiveTitleListener;
        if (onReceiveTitleListener != null) {
            onReceiveTitleListener.receiveTitle(title);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(@NotNull View view, @NotNull WebChromeClient.CustomViewCallback callback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fullscreenDelegate.onShowCustomView(view);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onShowFileChooser(@NotNull WebView webView, @NotNull ValueCallback<Uri[]> filePathCallback, @NotNull WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        Intrinsics.checkNotNullParameter(fileChooserParams, "fileChooserParams");
        Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> function2 = this.onShowFileChooserListener;
        if (function2 == null) {
            return true;
        }
        function2.invoke(filePathCallback, fileChooserParams);
        return true;
    }

    public final void setOnReceiveTitleListener(@NotNull OnReceiveTitleListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onReceiveTitleListener = listener;
    }

    public final void setOnShowFileChooserListener(@NotNull Function2<? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onShowFileChooserListener = listener;
    }
}

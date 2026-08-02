package com.braze.ui.inappmessage.views;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.views.InAppMessageHtmlBaseView$messageWebView$6;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J,\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6", "Landroid/webkit/WebChromeClient;", "onConsoleMessage", "", "cm", "Landroid/webkit/ConsoleMessage;", "onCreateWindow", "view", "Landroid/webkit/WebView;", "isDialog", "isUserGesture", "resultMsg", "Landroid/os/Message;", "getDefaultVideoPoster", "Landroid/graphics/Bitmap;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInAppMessageHtmlBaseView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InAppMessageHtmlBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,316:1\n29#2:317\n29#2:318\n29#2:319\n84#3,6:320\n*S KotlinDebug\n*F\n+ 1 InAppMessageHtmlBaseView.kt\ncom/braze/ui/inappmessage/views/InAppMessageHtmlBaseView$messageWebView$6\n*L\n119#1:317\n125#1:318\n131#1:319\n152#1:320,6\n*E\n"})
/* loaded from: classes.dex */
public final class InAppMessageHtmlBaseView$messageWebView$6 extends WebChromeClient {
    final /* synthetic */ boolean $isLinkTargetSupported;
    final /* synthetic */ InAppMessageHtmlBaseView this$0;

    public InAppMessageHtmlBaseView$messageWebView$6(InAppMessageHtmlBaseView inAppMessageHtmlBaseView, boolean z10) {
        this.this$0 = inAppMessageHtmlBaseView;
        this.$isLinkTargetSupported = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onConsoleMessage$lambda$0(ConsoleMessage consoleMessage) {
        return "Braze HTML In-app Message log. Line: " + consoleMessage.lineNumber() + ". SourceId: " + consoleMessage.sourceId() + ". Log Level: " + consoleMessage.messageLevel() + ". Message: " + consoleMessage.message();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$1() {
        return "linkTargetSupport not enabled, passing to super.onCreateWindow()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$2() {
        return "onCreateWindow webView is null, not opening link";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$3(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow HitTestResult is " + hitTestResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$4(WebView.HitTestResult hitTestResult) {
        return "onCreateWindow: hitTestResult type was " + hitTestResult.getType() + ". Not doing anything.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCreateWindow$lambda$5(WebView.HitTestResult hitTestResult) {
        return "Failed to open link in new window. " + hitTestResult;
    }

    @Override // android.webkit.WebChromeClient
    public Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(final ConsoleMessage cm) {
        Intrinsics.checkNotNullParameter(cm, "cm");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this.this$0, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: o4.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onConsoleMessage$lambda$0;
                onConsoleMessage$lambda$0 = InAppMessageHtmlBaseView$messageWebView$6.onConsoleMessage$lambda$0(cm);
                return onConsoleMessage$lambda$0;
            }
        }, 7, (Object) null);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public boolean onCreateWindow(WebView view, boolean isDialog, boolean isUserGesture, Message resultMsg) {
        if (!this.$isLinkTargetSupported) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: o4.q
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreateWindow$lambda$1;
                    onCreateWindow$lambda$1 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$1();
                    return onCreateWindow$lambda$1;
                }
            }, 6, (Object) null);
            return super.onCreateWindow(view, isDialog, isUserGesture, resultMsg);
        }
        if (view == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: o4.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreateWindow$lambda$2;
                    onCreateWindow$lambda$2 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$2();
                    return onCreateWindow$lambda$2;
                }
            }, 6, (Object) null);
            return false;
        }
        final WebView.HitTestResult hitTestResult = view.getHitTestResult();
        Intrinsics.checkNotNullExpressionValue(hitTestResult, "getHitTestResult(...)");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: o4.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCreateWindow$lambda$3;
                onCreateWindow$lambda$3 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$3(hitTestResult);
                return onCreateWindow$lambda$3;
            }
        }, 6, (Object) null);
        try {
            int type = hitTestResult.getType();
            if (type == 2) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tel:" + hitTestResult.getExtra())));
            } else if (type == 4) {
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:" + hitTestResult.getExtra())));
            } else if (type != 7) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: o4.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String onCreateWindow$lambda$4;
                        onCreateWindow$lambda$4 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$4(hitTestResult);
                        return onCreateWindow$lambda$4;
                    }
                }, 6, (Object) null);
            } else {
                String extra = hitTestResult.getExtra();
                this.this$0.getContext().startActivity(new Intent("android.intent.action.VIEW", extra != null ? Uri.parse(extra) : null));
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: o4.u
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onCreateWindow$lambda$5;
                    onCreateWindow$lambda$5 = InAppMessageHtmlBaseView$messageWebView$6.onCreateWindow$lambda$5(hitTestResult);
                    return onCreateWindow$lambda$5;
                }
            }, 4, (Object) null);
        }
        return false;
    }
}

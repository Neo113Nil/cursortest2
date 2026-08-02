package com.braze.ui.banners.jsinterface;

import Ph.AbstractC1459k;
import android.content.Context;
import android.webkit.JavascriptInterface;
import com.braze.Braze;
import com.braze.BrazeInternal;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.banners.jsinterface.BannerJavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0007¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/braze/ui/banners/jsinterface/BannerJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "Landroid/content/Context;", "context", "", "placementId", "Lkotlin/Function1;", "", "", "setHeightCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "buttonId", "logButtonClick", "(Ljava/lang/String;)V", "logClick", "()V", "height", "setBannerHeight", "(D)V", "requestPushPermission", "beforeMessageClosed", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "getSetHeightCallback", "()Lkotlin/jvm/functions/Function1;", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "user", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BannerJavascriptInterface extends JavascriptInterfaceBase {

    @NotNull
    private final String placementId;

    @NotNull
    private final Function1<Double, Unit> setHeightCallback;

    @NotNull
    private final BannerUserJavascriptInterface user;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerJavascriptInterface(@NotNull Context context, @NotNull String placementId, @NotNull Function1<? super Double, Unit> setHeightCallback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(setHeightCallback, "setHeightCallback");
        this.placementId = placementId;
        this.setHeightCallback = setHeightCallback;
        this.user = new BannerUserJavascriptInterface(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String beforeMessageClosed$lambda$0(BannerJavascriptInterface bannerJavascriptInterface) {
        return "Banner dismiss triggered from WebView bridge (beforeMessageClosed). placementId=" + bannerJavascriptInterface.placementId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0() {
        return "Banner logButtonClick() called. Logging banner click with button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$0() {
        return "Banner logClick() called. Logging banner click without button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermission$lambda$0() {
        return "Banner requestPushPermission() called. Requesting push permission now.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$0(double d10) {
        return "Banner setBannerHeight(" + d10 + ") called with invalid height. Height must be a finite number, not NaN, and greater or equal to 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$1(double d10) {
        return "Banner setBannerHeight(" + d10 + ") called.";
    }

    @JavascriptInterface
    public final void beforeMessageClosed() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: e4.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String beforeMessageClosed$lambda$0;
                beforeMessageClosed$lambda$0 = BannerJavascriptInterface.beforeMessageClosed$lambda$0(BannerJavascriptInterface.this);
                return beforeMessageClosed$lambda$0;
            }
        }, 6, (Object) null);
        BrazeInternal.INSTANCE.dismissBanner(getContext(), this.placementId);
    }

    @JavascriptInterface
    @NotNull
    public final BannerUserJavascriptInterface getUser() {
        return this.user;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(@Nullable String buttonId) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: e4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logButtonClick$lambda$0;
                logButtonClick$lambda$0 = BannerJavascriptInterface.logButtonClick$lambda$0();
                return logButtonClick$lambda$0;
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, buttonId);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: e4.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String logClick$lambda$0;
                logClick$lambda$0 = BannerJavascriptInterface.logClick$lambda$0();
                return logClick$lambda$0;
            }
        }, 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, null);
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: e4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String requestPushPermission$lambda$0;
                requestPushPermission$lambda$0 = BannerJavascriptInterface.requestPushPermission$lambda$0();
                return requestPushPermission$lambda$0;
            }
        }, 6, (Object) null);
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new BannerJavascriptInterface$requestPushPermission$2(null), 3, null);
    }

    @JavascriptInterface
    public final void setBannerHeight(final double height) {
        if (Double.isInfinite(height) || Double.isNaN(height) || height < 0.0d) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: e4.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bannerHeight$lambda$0;
                    bannerHeight$lambda$0 = BannerJavascriptInterface.setBannerHeight$lambda$0(height);
                    return bannerHeight$lambda$0;
                }
            }, 7, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: e4.f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String bannerHeight$lambda$1;
                    bannerHeight$lambda$1 = BannerJavascriptInterface.setBannerHeight$lambda$1(height);
                    return bannerHeight$lambda$1;
                }
            }, 6, (Object) null);
            this.setHeightCallback.invoke(Double.valueOf(height));
        }
    }
}

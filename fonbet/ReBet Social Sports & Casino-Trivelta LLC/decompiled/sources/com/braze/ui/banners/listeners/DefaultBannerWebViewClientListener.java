package com.braze.ui.banners.listeners;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.braze.Braze;
import com.braze.enums.Channel;
import com.braze.support.BrazeFileUtils;
import com.braze.support.BrazeLogger;
import com.braze.ui.BrazeDeeplinkHandler;
import com.braze.ui.BrazeWebViewClient;
import com.braze.ui.actions.UriAction;
import com.braze.ui.banners.listeners.DefaultBannerWebViewClientListener;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener;", "Lcom/braze/ui/banners/listeners/IBannerWebViewClientListener;", "<init>", "()V", "Landroid/content/Context;", "context", "", EventKeys.URL, "Landroid/os/Bundle;", "queryBundle", "", "onCustomEventAction", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "onOtherUrlAction", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DefaultBannerWebViewClientListener implements IBannerWebViewClientListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/braze/ui/banners/listeners/DefaultBannerWebViewClientListener$Companion;", "", "<init>", "()V", "parseUseWebViewFromQueryBundle", "", "queryBundle", "Landroid/os/Bundle;", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final boolean parseUseWebViewFromQueryBundle(@NotNull Bundle queryBundle) {
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
            if (queryBundle.containsKey("abDeepLink")) {
                z10 = Boolean.parseBoolean(queryBundle.getString("abDeepLink"));
                z11 = true;
            } else {
                z10 = false;
                z11 = false;
            }
            if (queryBundle.containsKey("abExternalOpen")) {
                z12 = Boolean.parseBoolean(queryBundle.getString("abExternalOpen"));
                z11 = true;
            } else {
                z12 = false;
            }
            if (z11) {
                return (z10 || z12) ? false : true;
            }
            return true;
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onCustomEventAction$lambda$0() {
        return "DefaultBannerWebViewClientListener.onCustomEventAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$0() {
        return "DefaultBannerWebViewClientListener.onOtherUrlAction called.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$1(String str) {
        return "UriAction is null. Not passing any URI to BrazeDeeplinkHandler. Url: " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onOtherUrlAction$lambda$2(Uri uri, String str) {
        return "Not passing local uri to BrazeDeeplinkHandler. Got local uri: " + uri + " for url: " + str + ".";
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onCustomEventAction(@NotNull Context context, @NotNull String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: f4.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onCustomEventAction$lambda$0;
                onCustomEventAction$lambda$0 = DefaultBannerWebViewClientListener.onCustomEventAction$lambda$0();
                return onCustomEventAction$lambda$0;
            }
        }, 7, (Object) null);
        BrazeWebViewClient.Companion companion = BrazeWebViewClient.INSTANCE;
        String parseCustomEventNameFromQueryBundle = companion.parseCustomEventNameFromQueryBundle(queryBundle);
        if (parseCustomEventNameFromQueryBundle == null || StringsKt.isBlank(parseCustomEventNameFromQueryBundle)) {
            return;
        }
        Braze.INSTANCE.getInstance(context).logCustomEvent(parseCustomEventNameFromQueryBundle, companion.parsePropertiesFromQueryBundle(queryBundle));
    }

    @Override // com.braze.ui.banners.listeners.IBannerWebViewClientListener
    public void onOtherUrlAction(@NotNull Context context, @NotNull final String url, @NotNull Bundle queryBundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(queryBundle, "queryBundle");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: f4.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String onOtherUrlAction$lambda$0;
                onOtherUrlAction$lambda$0 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$0();
                return onOtherUrlAction$lambda$0;
            }
        }, 7, (Object) null);
        boolean parseUseWebViewFromQueryBundle = INSTANCE.parseUseWebViewFromQueryBundle(queryBundle);
        BrazeDeeplinkHandler.Companion companion = BrazeDeeplinkHandler.INSTANCE;
        UriAction createUriActionFromUrlString = companion.getInstance().createUriActionFromUrlString(url, queryBundle, parseUseWebViewFromQueryBundle, Channel.BANNER);
        if (createUriActionFromUrlString == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: f4.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$1;
                    onOtherUrlAction$lambda$1 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$1(url);
                    return onOtherUrlAction$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        final Uri uri = createUriActionFromUrlString.getUri();
        if (BrazeFileUtils.isLocalUri(uri)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: f4.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String onOtherUrlAction$lambda$2;
                    onOtherUrlAction$lambda$2 = DefaultBannerWebViewClientListener.onOtherUrlAction$lambda$2(uri, url);
                    return onOtherUrlAction$lambda$2;
                }
            }, 6, (Object) null);
        } else {
            companion.getInstance().gotoUri(context, createUriActionFromUrlString);
        }
    }
}

package ru.ozon.app.android.web.webview.jsInterface;

import android.webkit.JavascriptInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.web.webview.WebViewRouter;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/web/webview/jsInterface/OzonAppJsInterface;", "", "webViewRouter", "Lru/ozon/app/android/web/webview/WebViewRouter;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "showNotificationCallback", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "", "<init>", "(Lru/ozon/app/android/web/webview/WebViewRouter;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lkotlin/jvm/functions/Function1;)V", "close", "showNotification", "jsonPayload", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OzonAppJsInterface {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final Function1<NotificationDTO, Unit> showNotificationCallback;

    @NotNull
    private final WebViewRouter webViewRouter;

    /* JADX WARN: Multi-variable type inference failed */
    public OzonAppJsInterface(@NotNull WebViewRouter webViewRouter, @NotNull JsonParser jsonDeserializer, @NotNull Function1<? super NotificationDTO, Unit> showNotificationCallback) {
        Intrinsics.checkNotNullParameter(webViewRouter, "webViewRouter");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(showNotificationCallback, "showNotificationCallback");
        this.webViewRouter = webViewRouter;
        this.jsonDeserializer = jsonDeserializer;
        this.showNotificationCallback = showNotificationCallback;
    }

    @JavascriptInterface
    public final void close() {
        this.webViewRouter.popBackStack();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JavascriptInterface
    public final void showNotification(@NotNull String jsonPayload) {
        Intrinsics.checkNotNullParameter(jsonPayload, "jsonPayload");
        this.showNotificationCallback.invoke(this.jsonDeserializer.fromJson(jsonPayload, NotificationDTO.class));
    }
}

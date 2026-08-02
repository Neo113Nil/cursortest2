package ru.ozon.app.android.web.webview.client;

import B0.C2454a;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.logger.LoggerExtKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/web/webview/client/WebViewUrlChecker;", "", "<init>", "()V", "", ImagesContract.URL, "", "checkUrl", "(Ljava/lang/String;)V", "", "checkScheme", "(Ljava/lang/String;)Z", "HttpSchemeNotAllowedException", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WebViewUrlChecker {

    @NotNull
    public static final WebViewUrlChecker INSTANCE = new WebViewUrlChecker();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/web/webview/client/WebViewUrlChecker$HttpSchemeNotAllowedException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "<init>", "()V", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class HttpSchemeNotAllowedException extends RuntimeException {

        @NotNull
        public static final HttpSchemeNotAllowedException INSTANCE = new HttpSchemeNotAllowedException();

        private HttpSchemeNotAllowedException() {
        }
    }

    private WebViewUrlChecker() {
    }

    public final boolean checkScheme(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return h.e0(url, "https://", false);
    }

    public final void checkUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (h.e0(url, "http://", false)) {
            LoggerExtKt.sendNonFatal$default(HttpSchemeNotAllowedException.INSTANCE, "http_scheme_not_allowed", null, C2454a.b(ImagesContract.URL, url), 4, null);
        }
    }
}

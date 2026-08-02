package ru.ozon.app.android.web.webview;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\tH&¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/web/webview/WebViewRouter;", "", "openDeeplink", "", "deeplink", "", "properties", "", "dismissAndRedirect", "", "popBackStack", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WebViewRouter {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean openDeeplink$default(WebViewRouter webViewRouter, String str, Map map, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDeeplink");
            }
            if ((i11 & 2) != 0) {
                map = U.c();
            }
            return webViewRouter.openDeeplink(str, map);
        }
    }

    void dismissAndRedirect(@NotNull String deeplink);

    boolean openDeeplink(@NotNull String deeplink, @NotNull Map<String, ? extends Object> properties);

    void popBackStack();
}

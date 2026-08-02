package jd0;

import Sc.InterfaceC4008j;
import a5.C4943a;
import a5.C4947e;
import android.webkit.CookieManager;
import dc0.C6171q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<CookieManager> f69821a;

    /* JADX WARN: Multi-variable type inference failed */
    public v(@NotNull InterfaceC4008j<? extends CookieManager> webViewCookieManager) {
        Intrinsics.checkNotNullParameter(webViewCookieManager, "webViewCookieManager");
        this.f69821a = webViewCookieManager;
    }

    public final ArrayList a(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        CookieManager value = this.f69821a.getValue();
        if (value == null || !C4947e.a("GET_COOKIE_INFO")) {
            return null;
        }
        List<String> a11 = C4943a.a(value, url);
        Intrinsics.checkNotNullExpressionValue(a11, "getCookieInfo(...)");
        return C6171q.x(a11);
    }

    public final ArrayList b(@NotNull String url) {
        String cookie;
        Intrinsics.checkNotNullParameter(url, "url");
        CookieManager value = this.f69821a.getValue();
        if (value == null || (cookie = value.getCookie(url)) == null) {
            return null;
        }
        return C6171q.B(cookie);
    }
}

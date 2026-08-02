package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Set;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class v0l {
    public static final /* synthetic */ int a = 0;

    static {
        Uri.parse("*");
        Uri.parse("");
    }

    public static void a(WebView webView, String str, Set set, u0l u0lVar) {
        if (!y0l.f.b()) {
            throw y0l.a();
        }
        b1l b = b(webView);
        int i = 0;
        ((WebViewProviderBoundaryInterface) b.b).addWebMessageListener(str, (String[]) set.toArray(new String[0]), new r02(new j0l(u0lVar, i), i));
    }

    public static b1l b(WebView webView) {
        return new b1l(a1l.a.createWebView(webView), 0);
    }

    public static String c() {
        if (y0l.h.b()) {
            return a1l.a.getStatics().getVariationsHeader();
        }
        throw y0l.a();
    }

    public static void d(WebView webView, String str) {
        if (!y0l.f.b()) {
            throw y0l.a();
        }
        ((WebViewProviderBoundaryInterface) b(webView).b).removeWebMessageListener(str);
    }

    public static void e(WebView webView, boolean z) {
        if (!y0l.j.b()) {
            throw y0l.a();
        }
        ((WebViewProviderBoundaryInterface) b(webView).b).setAudioMuted(z);
    }
}

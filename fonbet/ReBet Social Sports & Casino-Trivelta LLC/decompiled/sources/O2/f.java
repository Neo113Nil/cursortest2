package O2;

import P2.u;
import P2.v;
import P2.w;
import P2.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f8319a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f8320b = Uri.parse("");

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8321c = true;

    /* renamed from: d, reason: collision with root package name */
    public static final WeakHashMap f8322d = new WeakHashMap();

    public interface a {
        void a(WebView webView, b bVar, Uri uri, boolean z10, O2.a aVar);
    }

    public static void a(WebView webView, String str, Set set, a aVar) {
        if (!u.f8744V.c()) {
            throw u.a();
        }
        h(webView).a(str, (String[]) set.toArray(new String[0]), aVar);
    }

    public static WebViewProviderBoundaryInterface b(WebView webView) {
        return e().createWebView(webView);
    }

    public static PackageInfo c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return P2.d.a();
        }
        try {
            return f();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static PackageInfo d(Context context) {
        PackageInfo c10 = c();
        return c10 != null ? c10 : g(context);
    }

    public static x e() {
        return v.d();
    }

    public static PackageInfo f() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    public static PackageInfo g(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static w h(WebView webView) {
        if (!u.f8786s0.c() || !f8321c) {
            return new w(b(webView));
        }
        WeakHashMap weakHashMap = f8322d;
        w wVar = (w) weakHashMap.get(webView);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(b(webView));
        weakHashMap.put(webView, wVar2);
        return wVar2;
    }

    public static boolean i() {
        if (u.f8741S.c()) {
            return e().getStatics().isMultiProcessEnabled();
        }
        throw u.a();
    }
}

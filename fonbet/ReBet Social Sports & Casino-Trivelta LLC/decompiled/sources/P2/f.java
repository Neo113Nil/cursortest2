package P2;

import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class f {
    public static ClassLoader a() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }
}

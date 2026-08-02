package ue;

import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public interface e {
    void e(View view, WebChromeClient.CustomViewCallback customViewCallback);

    boolean h(WebView webView, WebResourceRequest webResourceRequest);

    boolean i(WebView webView, String str);

    void o(int i5);

    void w(String str);

    void z(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams);
}

package defpackage;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class otn extends WebViewClient {
    public final sen a;
    public long b;
    public final /* synthetic */ vdb c;

    public otn(vdb vdbVar, sen senVar) {
        this.c = vdbVar;
        this.a = senVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        pen s = qen.s();
        s.f(this.b);
        s.g(System.currentTimeMillis());
        sen senVar = this.a;
        senVar.b();
        ((uen) senVar.b).v((qen) s.c());
        "Finished loading WebView".concat(String.valueOf(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.b = System.currentTimeMillis();
        "Started loading WebView".concat(String.valueOf(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        int length = String.valueOf(i).length();
        new StringBuilder(length + 8 + String.valueOf(str).length() + 1 + String.valueOf(str2).length());
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        renderProcessGoneDetail.didCrash();
        webView.loadUrl(AndroidWebViewClient.BLANK_PAGE);
        vdb vdbVar = this.c;
        vdbVar.a = true;
        q3p u = q3p.u((Set) vdbVar.i);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            ((bun) u.get(i)).zza();
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean startsWith = str.startsWith("gmsg://");
        vdb vdbVar = this.c;
        if (startsWith) {
            vdbVar.h(str, "0");
            return true;
        }
        q3p u = q3p.u((Set) vdbVar.i);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            ((bun) u.get(i)).zzb(str);
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        return true;
    }
}

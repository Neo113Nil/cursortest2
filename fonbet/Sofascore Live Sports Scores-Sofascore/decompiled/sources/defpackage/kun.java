package defpackage;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfwr;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kun implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebView b;
    public final /* synthetic */ String c;

    public /* synthetic */ kun(Object obj, WebView webView, String str, int i) {
        this.a = i;
        this.b = webView;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        WebView webView = this.b;
        switch (i) {
            case 0:
                nun.b(webView, str);
                break;
            default:
                zzfwr.b(webView, str);
                break;
        }
    }
}

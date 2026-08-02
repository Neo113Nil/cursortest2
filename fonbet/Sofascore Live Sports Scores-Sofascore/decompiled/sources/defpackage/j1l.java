package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class j1l extends WebChromeClient {
    public final /* synthetic */ k1l a;

    public j1l(k1l k1lVar) {
        this.a = k1lVar;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
        createBitmap.getClass();
        return createBitmap;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        super.onHideCustomView();
        this.a.a.b();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        view.getClass();
        customViewCallback.getClass();
        super.onShowCustomView(view, customViewCallback);
        this.a.a.a(view, new ndk(customViewCallback, 4));
    }
}

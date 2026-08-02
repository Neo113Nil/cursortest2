package com.playtika.pras.e;

import android.os.Bundle;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public interface g {
    void a(Bundle bundle);

    void a(WebView webView);

    void b(Bundle bundle);

    void onAfterExternalBrowserClosed();

    void onBeforeExternalBrowserOpened(String str);

    void setOrientation(String str);
}

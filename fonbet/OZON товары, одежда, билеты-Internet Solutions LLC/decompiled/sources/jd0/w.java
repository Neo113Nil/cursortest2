package jd0;

import Kb0.K;
import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w {
    @SuppressLint({"SetJavaScriptEnabled"})
    public static final void a(@NotNull WebView webView, @NotNull q cacheSetting) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(cacheSetting, "cacheSetting");
        webView.setVerticalScrollBarEnabled(true);
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setMixedContentMode(2);
        if (cacheSetting == q.NO_CACHE) {
            settings.setCacheMode(2);
        }
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        k11.t().n().getValue().f(webView);
    }
}

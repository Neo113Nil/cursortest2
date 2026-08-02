package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.webkit.WebView;
import com.ironsource.B5;
import com.safedk.android.internal.partials.MolocoAdsNetworkBridge;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2824e {
    public static final String a = "https://appassets.androidplatform.net";

    public static final void a(WebView webView, String data) {
        Intrinsics.checkNotNullParameter(webView, "<this>");
        Intrinsics.checkNotNullParameter(data, "data");
        MolocoAdsNetworkBridge.webviewLoadDataWithBaseURL(webView, a, data, "text/html", B5.O, null);
    }
}

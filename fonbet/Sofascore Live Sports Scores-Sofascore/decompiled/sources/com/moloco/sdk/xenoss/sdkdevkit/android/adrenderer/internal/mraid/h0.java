package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import defpackage.ddi;
import defpackage.jof;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0 {
    public final i0 b;
    public final jof c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, com.facebook.c0 c0Var) {
        super(context);
        context.getClass();
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        i0 i0Var = new i0(context, c0Var);
        setWebViewClient(i0Var);
        this.b = i0Var;
        this.c = i0Var.f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h0, android.webkit.WebView
    public final void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    @NotNull
    public final ddi getUnrecoverableError() {
        return this.c;
    }
}

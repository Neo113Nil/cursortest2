package com.google.android.gms.ads.h5;

import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzguk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class H5AdsWebViewClient extends zzbre {
    public final zzbrr a;

    public H5AdsWebViewClient(@NonNull Context context, @NonNull WebView webView) {
        this.a = new zzbrr(context, webView);
    }

    @Override // com.google.android.gms.internal.ads.zzbre
    public final WebViewClient a() {
        return this.a;
    }

    public void clearAdObjects() {
        this.a.b.clearAdObjects();
    }

    @Nullable
    public WebViewClient getDelegateWebViewClient() {
        return this.a.a;
    }

    public void setDelegateWebViewClient(@Nullable WebViewClient webViewClient) {
        zzbrr zzbrrVar = this.a;
        zzbrrVar.getClass();
        zzguk.b("Delegate cannot be itself.", webViewClient != zzbrrVar);
        zzbrrVar.a = webViewClient;
    }
}

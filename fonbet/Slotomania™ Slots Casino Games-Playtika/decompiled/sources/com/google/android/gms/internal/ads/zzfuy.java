package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
final class zzfuy implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzfuy(zzfuz zzfuzVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
        Objects.requireNonNull(zzfuzVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfuz.zzk(this.zza, this.zzb);
    }
}

package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.P;
import android.webkit.WebView;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zzfw {

    @NotNull
    private final WebView zza;

    @NotNull
    private final P zzb;

    public zzfw(@NotNull WebView webView, @NotNull P p10) {
        this.zza = webView;
        this.zzb = p10;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        AbstractC1459k.d(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3, null);
    }
}

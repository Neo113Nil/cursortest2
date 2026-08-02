package com.vk.id.captcha.web;

import android.content.res.Configuration;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Configuration f60595a;

    public c(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        this.f60595a = configuration;
    }

    @NotNull
    public final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        int i11 = this.f60595a.uiMode & 48;
        String str2 = "light";
        if (i11 != 16 && i11 == 32) {
            str2 = "dark";
        }
        String uri = buildUpon.appendQueryParameter("scheme", str2).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "");
        return uri;
    }
}

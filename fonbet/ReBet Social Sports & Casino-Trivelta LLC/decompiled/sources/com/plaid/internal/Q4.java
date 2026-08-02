package com.plaid.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.plaid.internal.C3556a6;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class Q4 extends C3774w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q4(@NotNull C3609d4 urlInterceptor) {
        super(urlInterceptor);
        Intrinsics.checkNotNullParameter(urlInterceptor, "urlInterceptor");
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NotNull WebView view, int i10, @NotNull String description, @NotNull String failingUrl) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(failingUrl, "failingUrl");
        super.onReceivedError(view, i10, description, failingUrl);
        if (400 > i10 || i10 >= 500 || i10 == 408 || i10 == 404) {
            C3556a6.a.b(C3556a6.f39823a, new C3709o5(description), "onReceivedError");
        } else {
            C3556a6.a.a(C3556a6.f39823a, new C3709o5(description), "onReceivedError");
        }
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView view, @NotNull String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        Locale ENGLISH = Locale.ENGLISH;
        Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
        String lowerCase = url.toLowerCase(ENGLISH);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) "/favicon.ico", false, 2, (Object) null)) {
            try {
                return new WebResourceResponse(ClipboardModule.MIMETYPE_PNG, null, null);
            } catch (Exception e10) {
                C3556a6.a.a(C3556a6.f39823a, e10, "shouldInterceptRequest");
            }
        }
        return null;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(@NotNull WebView view, @Nullable String str) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (str == null) {
            return false;
        }
        try {
            return this.f41155a.a(str);
        } catch (Exception e10) {
            C3556a6.a.a(C3556a6.f39823a, e10);
            return true;
        }
    }
}

package com.plaid.internal;

import android.webkit.WebResourceError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class B7 {
    @NotNull
    public static final String a(@NotNull WebResourceError webResourceError) {
        Intrinsics.checkNotNullParameter(webResourceError, "<this>");
        return "WebResourceError { Error Code: " + webResourceError.getErrorCode() + " ; Description: " + ((Object) webResourceError.getDescription()) + " }";
    }
}

package com.appsflyer.sdk_base.util;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0004"}, d2 = {"ifNullOrBlank", "", "defaultValue", "Lkotlin/Function0;", "sdk_base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String ifNullOrBlank(@Nullable String str, @NotNull Function0<String> function0) {
        function0.getClass();
        return (str == null || StringsKt.R(str)) ? (String) function0.invoke() : str;
    }
}

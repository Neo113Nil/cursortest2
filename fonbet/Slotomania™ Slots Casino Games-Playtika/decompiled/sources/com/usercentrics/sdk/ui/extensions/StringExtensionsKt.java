package com.usercentrics.sdk.ui.extensions;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StringExtensions.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"addHttpsIfNeeded", "", "usercentrics-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StringExtensionsKt {
    public static final String addHttpsIfNeeded(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String obj = StringsKt.trim((CharSequence) str).toString();
        return !StringsKt.contains$default((CharSequence) obj, (CharSequence) "://", false, 2, (Object) null) ? d.u + obj : obj;
    }
}

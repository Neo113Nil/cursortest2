package com.usercentrics.sdk;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: common.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"forceHttps", "", "usercentrics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CommonKt {
    public static final String forceHttps(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String obj = StringsKt.trim((CharSequence) str).toString();
        String str2 = obj;
        return StringsKt.isBlank(str2) ? obj : StringsKt.contains$default((CharSequence) str2, (CharSequence) "://", false, 2, (Object) null) ? StringsKt.replace$default(obj, d.v, d.u, false, 4, (Object) null) : d.u + obj;
    }
}

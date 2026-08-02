package com.squareup.moshi;

import Sc.InterfaceC3999a;
import com.squareup.moshi.internal.NonNullJsonAdapter;
import com.squareup.moshi.internal.NullSafeJsonAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class E {
    @InterfaceC3999a
    public static final /* synthetic */ JsonAdapter a(Moshi moshi, kotlin.reflect.q ktype) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(ktype, "ktype");
        JsonAdapter d11 = moshi.d(kotlin.reflect.w.e(ktype));
        return ((d11 instanceof NullSafeJsonAdapter) || (d11 instanceof NonNullJsonAdapter)) ? d11 : ktype.l() ? d11.nullSafe() : d11.nonNull();
    }
}

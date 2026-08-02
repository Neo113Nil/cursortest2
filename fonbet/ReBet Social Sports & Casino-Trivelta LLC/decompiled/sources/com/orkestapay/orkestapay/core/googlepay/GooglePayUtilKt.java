package com.orkestapay.orkestapay.core.googlepay;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"centsToString", "", "", "Orkestapay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayUtilKt {
    @NotNull
    public static final String centsToString(long j10) {
        String bigDecimal = new BigDecimal(j10).divide(GooglePayUtil.INSTANCE.getCENTS()).setScale(2, RoundingMode.HALF_EVEN).toString();
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "toString(...)");
        return bigDecimal;
    }
}

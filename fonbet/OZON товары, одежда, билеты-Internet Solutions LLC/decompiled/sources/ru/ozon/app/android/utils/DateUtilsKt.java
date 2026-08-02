package ru.ozon.app.android.utils;

import Ej.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "toTwoDigitString", "(I)Ljava/lang/String;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DateUtilsKt {
    @NotNull
    public static final String toTwoDigitString(int i11) {
        return (i11 < 0 || i11 >= 10) ? i11 < 0 ? "00" : String.valueOf(i11) : b.a(i11, "0");
    }
}

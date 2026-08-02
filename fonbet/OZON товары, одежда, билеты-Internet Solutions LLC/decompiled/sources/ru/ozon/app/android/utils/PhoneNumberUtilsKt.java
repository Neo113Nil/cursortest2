package ru.ozon.app.android.utils;

import M8.e;
import M8.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\"\u001c\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "isValidPhoneNumber", "(Ljava/lang/String;)Z", "isValidTestPhoneNumber", "LM8/e;", "kotlin.jvm.PlatformType", "phoneNumberUtil", "LM8/e;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PhoneNumberUtilsKt {
    private static final e phoneNumberUtil = e.g();

    public static final boolean isValidPhoneNumber(@NotNull String str) {
        Result failure;
        boolean o11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (isValidTestPhoneNumber(str)) {
                o11 = true;
            } else {
                e eVar = phoneNumberUtil;
                eVar.getClass();
                j jVar = new j();
                eVar.v(str, null, jVar);
                o11 = eVar.o(jVar);
            }
            failure = new Result.Success(Boolean.valueOf(o11));
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
        }
        return ((Boolean) ResultKt.getOrDefault(failure, Boolean.FALSE)).booleanValue();
    }

    private static final boolean isValidTestPhoneNumber(String str) {
        String digits = StringExtKt.getDigits(str);
        return h.e0(digits, "9100", false) && digits.length() == 12;
    }
}

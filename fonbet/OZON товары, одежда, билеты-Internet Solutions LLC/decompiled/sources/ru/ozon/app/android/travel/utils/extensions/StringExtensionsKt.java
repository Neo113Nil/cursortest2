package ru.ozon.app.android.travel.utils.extensions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0002\u001a\u0011\u0010\t\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "removeNonDigitSymbols", "(Ljava/lang/String;)Ljava/lang/String;", "", "start", "end", "countSpaces", "(Ljava/lang/String;II)I", "removeLeadingZeroes", "countLeadingZeroes", "(Ljava/lang/String;)I", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringExtensionsKt {
    public static final int countLeadingZeroes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == '0') {
            i11++;
        }
        return i11;
    }

    public static final int countSpaces(@NotNull String str, int i11, int i12) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i13 = 0;
        while (i11 < i12) {
            if (Character.isSpaceChar(str.charAt(i11))) {
                i13++;
            }
            i11++;
        }
        return i13;
    }

    @NotNull
    public static final String removeLeadingZeroes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Integer valueOf = Integer.valueOf(countLeadingZeroes(str));
        String str2 = null;
        if (valueOf.intValue() >= str.length()) {
            valueOf = null;
        }
        if (valueOf != null) {
            str2 = str.substring(valueOf.intValue());
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        }
        return str2 == null ? "" : str2;
    }

    @NotNull
    public static final String removeNonDigitSymbols(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}

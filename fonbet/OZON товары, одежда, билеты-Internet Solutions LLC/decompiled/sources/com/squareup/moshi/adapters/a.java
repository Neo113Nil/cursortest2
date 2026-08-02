package com.squareup.moshi.adapters;

import com.squareup.moshi.k;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final TimeZone f60387a;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(GMT_ID)");
        f60387a = timeZone;
    }

    private static final boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    @NotNull
    public static final String b(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f60387a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        c(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        c(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        c(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        c(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        c(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "formatted.toString()");
        return sb3;
    }

    private static final void c(StringBuilder sb2, int i11, int i12) {
        String valueOf = String.valueOf(i11);
        for (int length = i12 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
    }

    private static final int d(int i11, int i12, String str) {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int digit = Character.digit(str.charAt(i11), 10);
            if (digit < 0) {
                StringBuilder sb2 = new StringBuilder("Invalid number: ");
                String substring = str.substring(i11, i12);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb2.append(substring);
                throw new NumberFormatException(sb2.toString());
            }
            i13 = -digit;
        } else {
            i13 = 0;
            i14 = i11;
        }
        while (i14 < i12) {
            int i15 = i14 + 1;
            int digit2 = Character.digit(str.charAt(i14), 10);
            if (digit2 < 0) {
                StringBuilder sb3 = new StringBuilder("Invalid number: ");
                String substring2 = str.substring(i11, i12);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                sb3.append(substring2);
                throw new NumberFormatException(sb3.toString());
            }
            i13 = (i13 * 10) - digit2;
            i14 = i15;
        }
        return -i13;
    }

    @NotNull
    public static final Date e(@NotNull String str) {
        int i11;
        int i12;
        int i13;
        int i14;
        char charAt;
        int length;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            int d11 = d(0, 4, str);
            int i15 = a(str, 4, '-') ? 5 : 4;
            int i16 = i15 + 2;
            int d12 = d(i15, i16, str);
            if (a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int d13 = d(i16, i17, str);
            boolean a11 = a(str, i17, 'T');
            if (!a11 && str.length() <= i17) {
                Date time = new GregorianCalendar(d11, d12 - 1, d13).getTime();
                Intrinsics.checkNotNullExpressionValue(time, "GregorianCalendar(year, month - 1, day).time");
                return time;
            }
            if (a11) {
                int i18 = i16 + 5;
                int d14 = d(i16 + 3, i18, str);
                if (a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                i14 = d(i18, i19, str);
                if (a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() <= i19 || (charAt = str.charAt(i19)) == 'Z' || charAt == '+' || charAt == '-') {
                    i11 = d14;
                    i17 = i19;
                    i12 = 0;
                    i13 = 0;
                } else {
                    int i21 = i19 + 2;
                    i13 = d(i19, i21, str);
                    if (60 <= i13 && i13 < 63) {
                        i13 = 59;
                    }
                    if (a(str, i21, '.')) {
                        int i22 = i19 + 3;
                        int length2 = str.length();
                        for (int i23 = i19 + 4; i23 < length2; i23++) {
                            char charAt2 = str.charAt(i23);
                            if (Intrinsics.i(charAt2, 48) >= 0 && Intrinsics.i(charAt2, 57) <= 0) {
                            }
                            length = i23;
                            break;
                        }
                        length = str.length();
                        int min = Math.min(length, i19 + 6);
                        i12 = (int) (Math.pow(10.0d, 3 - (min - i22)) * d(i22, min, str));
                        i17 = length;
                        i11 = d14;
                    } else {
                        i11 = d14;
                        i17 = i21;
                        i12 = 0;
                    }
                }
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
                i14 = 0;
            }
            if (str.length() <= i17) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt3 = str.charAt(i17);
            TimeZone timeZone = f60387a;
            if (charAt3 != 'Z') {
                if (charAt3 != '+' && charAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + '\'');
                }
                String substring = str.substring(i17);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                    String str2 = "GMT" + substring;
                    timeZone = TimeZone.getTimeZone(str2);
                    Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(timezoneId)");
                    String act = timeZone.getID();
                    if (!Intrinsics.d(act, str2)) {
                        Intrinsics.checkNotNullExpressionValue(act, "act");
                        if (!Intrinsics.d(h.X(act, ProductContainerDTO.RATIO_DELIMITER, "", false), str2)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                        }
                    }
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, d11);
            gregorianCalendar.set(2, d12 - 1);
            gregorianCalendar.set(5, d13);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i14);
            gregorianCalendar.set(13, i13);
            gregorianCalendar.set(14, i12);
            Date time2 = gregorianCalendar.getTime();
            Intrinsics.checkNotNullExpressionValue(time2, "{\n    var offset = 0\n\n  …pes can convert here.\n  }");
            return time2;
        } catch (IllegalArgumentException e11) {
            throw new k(Nk.a.b("Not an RFC 3339 date: ", str), e11);
        } catch (IndexOutOfBoundsException e12) {
            throw new k(Nk.a.b("Not an RFC 3339 date: ", str), e12);
        }
    }
}

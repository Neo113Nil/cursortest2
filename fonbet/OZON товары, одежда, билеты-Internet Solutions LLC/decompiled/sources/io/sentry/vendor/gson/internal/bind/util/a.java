package io.sentry.vendor.gson.internal.bind.util;

import I0.C3173b;
import Sh.b;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f68625a = TimeZone.getTimeZone("UTC");

    private static boolean a(String str, int i11, char c11) {
        return i11 < str.length() && str.charAt(i11) == c11;
    }

    public static String b(Date date) {
        Locale locale = Locale.US;
        TimeZone timeZone = f68625a;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(23 + (timeZone.getRawOffset() == 0 ? 1 : 6));
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
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i11 = offset / 60000;
            int abs = Math.abs(i11 / 60);
            int abs2 = Math.abs(i11 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            c(sb2, abs, 2);
            sb2.append(':');
            c(sb2, abs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    private static void c(StringBuilder sb2, int i11, int i12) {
        String num = Integer.toString(i11);
        for (int length = i12 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:38:0x009e, B:40:0x00a4, B:44:0x00b1, B:47:0x00bb, B:52:0x00f0, B:54:0x00f6, B:58:0x01a8, B:63:0x0108, B:64:0x0123, B:65:0x0124, B:68:0x0141, B:70:0x014e, B:73:0x0157, B:75:0x0176, B:78:0x0185, B:79:0x01a7, B:80:0x0130, B:81:0x01d9, B:82:0x01e0, B:83:0x00cb, B:84:0x00ce, B:87:0x00b6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d9 A[Catch: IllegalArgumentException -> 0x00d5, NumberFormatException -> 0x00d8, IndexOutOfBoundsException -> 0x00db, TryCatch #2 {IllegalArgumentException -> 0x00d5, IndexOutOfBoundsException -> 0x00db, NumberFormatException -> 0x00d8, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:38:0x009e, B:40:0x00a4, B:44:0x00b1, B:47:0x00bb, B:52:0x00f0, B:54:0x00f6, B:58:0x01a8, B:63:0x0108, B:64:0x0123, B:65:0x0124, B:68:0x0141, B:70:0x014e, B:73:0x0157, B:75:0x0176, B:78:0x0185, B:79:0x01a7, B:80:0x0130, B:81:0x01d9, B:82:0x01e0, B:83:0x00cb, B:84:0x00ce, B:87:0x00b6), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date d(String str, ParsePosition parsePosition) throws ParseException {
        String message;
        int i11;
        int i12;
        int i13;
        int i14;
        int length;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i15 = index + 4;
            int e11 = e(index, i15, str);
            if (a(str, i15, '-')) {
                i15 = index + 5;
            }
            int i16 = i15 + 2;
            int e12 = e(i15, i16, str);
            if (a(str, i16, '-')) {
                i16 = i15 + 3;
            }
            int i17 = i16 + 2;
            int e13 = e(i16, i17, str);
            boolean a11 = a(str, i17, 'T');
            if (!a11 && str.length() <= i17) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(e11, e12 - 1, e13);
                parsePosition.setIndex(i17);
                return gregorianCalendar.getTime();
            }
            if (a11) {
                int i18 = i16 + 5;
                int e14 = e(i16 + 3, i18, str);
                if (a(str, i18, ':')) {
                    i18 = i16 + 6;
                }
                int i19 = i18 + 2;
                int e15 = e(i18, i19, str);
                if (a(str, i19, ':')) {
                    i19 = i18 + 3;
                }
                if (str.length() > i19 && (charAt = str.charAt(i19)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i21 = i19 + 2;
                    i14 = e(i19, i21, str);
                    if (i14 > 59 && i14 < 63) {
                        i14 = 59;
                    }
                    if (a(str, i21, '.')) {
                        int i22 = i19 + 3;
                        int i23 = i19 + 4;
                        while (true) {
                            if (i23 >= str.length()) {
                                i23 = str.length();
                                break;
                            }
                            char charAt2 = str.charAt(i23);
                            if (charAt2 < '0' || charAt2 > '9') {
                                break;
                            }
                            i23++;
                        }
                        int min = Math.min(i23, i19 + 6);
                        i12 = e(i22, min, str);
                        int i24 = min - i22;
                        if (i24 == 1) {
                            i12 *= 100;
                        } else if (i24 == 2) {
                            i12 *= 10;
                        }
                        i11 = e14;
                        i17 = i23;
                        i13 = e15;
                    } else {
                        i11 = e14;
                        i17 = i21;
                        i13 = e15;
                        i12 = 0;
                    }
                    if (str.length() > i17) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i17);
                    TimeZone timeZone = f68625a;
                    if (charAt3 == 'Z') {
                        length = i17 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i17);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i17 + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String str2 = "GMT" + substring;
                            timeZone = TimeZone.getTimeZone(str2);
                            String id2 = timeZone.getID();
                            if (!id2.equals(str2) && !id2.replace(ProductContainerDTO.RATIO_DELIMITER, "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, e11);
                    gregorianCalendar2.set(2, e12 - 1);
                    gregorianCalendar2.set(5, e13);
                    gregorianCalendar2.set(11, i11);
                    gregorianCalendar2.set(12, i13);
                    gregorianCalendar2.set(13, i14);
                    gregorianCalendar2.set(14, i12);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i17 = i19;
                i11 = e14;
                i13 = e15;
                i12 = 0;
            } else {
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            i14 = 0;
            if (str.length() > i17) {
            }
        } catch (IllegalArgumentException e16) {
            e = e16;
            String a12 = str == null ? null : C3173b.a('\"', "\"", str);
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(b.c("Failed to parse date [", a12, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e17) {
            e = e17;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(b.c("Failed to parse date [", a12, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e18) {
            e = e18;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException(b.c("Failed to parse date [", a12, "]: ", message), parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    private static int e(int i11, int i12, String str) throws NumberFormatException {
        int i13;
        int i14;
        if (i11 < 0 || i12 > str.length() || i11 > i12) {
            throw new NumberFormatException(str);
        }
        if (i11 < i12) {
            i14 = i11 + 1;
            int digit = Character.digit(str.charAt(i11), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
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
                throw new NumberFormatException("Invalid number: " + str.substring(i11, i12));
            }
            i13 = (i13 * 10) - digit2;
            i14 = i15;
        }
        return -i13;
    }
}

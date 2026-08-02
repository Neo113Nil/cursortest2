package io.sentry.vendor.gson.internal.bind.util;

import androidx.appcompat.widget.c1;
import d9.e;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f17202a = DesugarTimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i5, char c2) {
        return i5 < str.length() && str.charAt(i5) == c2;
    }

    public static void b(StringBuilder sb2, int i5, int i10) {
        String num = Integer.toString(i5);
        for (int length = i10 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TRY_LEAVE, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:38:0x009e, B:40:0x00a4, B:44:0x00b1, B:48:0x00c5, B:53:0x00f0, B:55:0x00f6, B:59:0x01a8, B:64:0x0108, B:65:0x0123, B:66:0x0124, B:69:0x0141, B:71:0x014e, B:74:0x0157, B:76:0x0176, B:79:0x0185, B:80:0x01a7, B:81:0x0130, B:82:0x01d9, B:83:0x01e0, B:84:0x00d5, B:85:0x00d8, B:88:0x00c1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d9 A[Catch: IllegalArgumentException -> 0x00b8, NumberFormatException -> 0x00bb, IndexOutOfBoundsException -> 0x00be, TryCatch #2 {IllegalArgumentException -> 0x00b8, IndexOutOfBoundsException -> 0x00be, NumberFormatException -> 0x00bb, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0051, B:20:0x0061, B:21:0x0063, B:23:0x006f, B:24:0x0072, B:26:0x0078, B:30:0x0082, B:35:0x0092, B:37:0x009a, B:38:0x009e, B:40:0x00a4, B:44:0x00b1, B:48:0x00c5, B:53:0x00f0, B:55:0x00f6, B:59:0x01a8, B:64:0x0108, B:65:0x0123, B:66:0x0124, B:69:0x0141, B:71:0x014e, B:74:0x0157, B:76:0x0176, B:79:0x0185, B:80:0x01a7, B:81:0x0130, B:82:0x01d9, B:83:0x01e0, B:84:0x00d5, B:85:0x00d8, B:88:0x00c1), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date c(String str, ParsePosition parsePosition) {
        String message;
        int i5;
        int i10;
        int i11;
        int i12;
        int length;
        char charAt;
        int length2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int d10 = d(index, i13, str);
            if (a(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int d11 = d(i13, i14, str);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int d12 = d(i14, i15, str);
            boolean a7 = a(str, i15, 'T');
            if (!a7 && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(d10, d11 - 1, d12);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (a7) {
                int i16 = i14 + 5;
                int d13 = d(i14 + 3, i16, str);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int d14 = d(i16, i17, str);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() > i17 && (charAt = str.charAt(i17)) != 'Z' && charAt != '+' && charAt != '-') {
                    int i18 = i17 + 2;
                    i12 = d(i17, i18, str);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (a(str, i18, '.')) {
                        int i19 = i17 + 3;
                        for (int i20 = i17 + 4; i20 < str.length(); i20++) {
                            char charAt2 = str.charAt(i20);
                            if (charAt2 >= '0' && charAt2 <= '9') {
                            }
                            length2 = i20;
                        }
                        length2 = str.length();
                        int min = Math.min(length2, i17 + 6);
                        i11 = d(i19, min, str);
                        int i21 = min - i19;
                        if (i21 == 1) {
                            i11 *= 100;
                        } else if (i21 == 2) {
                            i11 *= 10;
                        }
                        i5 = d13;
                        i15 = length2;
                        i10 = d14;
                    } else {
                        i5 = d13;
                        i15 = i18;
                        i10 = d14;
                        i11 = 0;
                    }
                    if (str.length() > i15) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    char charAt3 = str.charAt(i15);
                    TimeZone timeZone = f17202a;
                    if (charAt3 == 'Z') {
                        length = i15 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt3 + "'");
                        }
                        String substring = str.substring(i15);
                        if (substring.length() < 5) {
                            substring = substring + "00";
                        }
                        length = i15 + substring.length();
                        if (!"+0000".equals(substring) && !"+00:00".equals(substring)) {
                            String str2 = "GMT" + substring;
                            timeZone = DesugarTimeZone.getTimeZone(str2);
                            String id2 = timeZone.getID();
                            if (!id2.equals(str2) && !id2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, d10);
                    gregorianCalendar2.set(2, d11 - 1);
                    gregorianCalendar2.set(5, d12);
                    gregorianCalendar2.set(11, i5);
                    gregorianCalendar2.set(12, i10);
                    gregorianCalendar2.set(13, i12);
                    gregorianCalendar2.set(14, i11);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i15 = i17;
                i5 = d13;
                i10 = d14;
            } else {
                i5 = 0;
                i10 = 0;
            }
            i11 = 0;
            i12 = 0;
            if (str.length() > i15) {
            }
        } catch (IllegalArgumentException e7) {
            e = e7;
            String e9 = str == null ? null : e.e('\"', "\"", str);
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException(c1.o("Failed to parse date [", e9, "]: ", message), parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException2 = new ParseException(c1.o("Failed to parse date [", e9, "]: ", message), parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e11) {
            e = e11;
            if (str == null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            message = "(" + e.getClass().getName() + ")";
            ParseException parseException22 = new ParseException(c1.o("Failed to parse date [", e9, "]: ", message), parsePosition.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        }
    }

    public static int d(int i5, int i10, String str) {
        int i11;
        int i12;
        if (i5 < 0 || i10 > str.length() || i5 > i10) {
            throw new NumberFormatException(str);
        }
        if (i5 < i10) {
            i12 = i5 + 1;
            int digit = Character.digit(str.charAt(i5), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i10));
            }
            i11 = -digit;
        } else {
            i11 = 0;
            i12 = i5;
        }
        while (i12 < i10) {
            int i13 = i12 + 1;
            int digit2 = Character.digit(str.charAt(i12), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i5, i10));
            }
            i11 = (i11 * 10) - digit2;
            i12 = i13;
        }
        return -i11;
    }
}

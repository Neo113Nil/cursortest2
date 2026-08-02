package defpackage;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class c6n {
    public static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0259  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Date a(String str, ParsePosition parsePosition) {
        ParsePosition parsePosition2;
        String sb;
        String message;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int length;
        char charAt;
        ?? r3 = "Mismatching time zone indicator: ";
        try {
            int index = parsePosition.getIndex();
            int i6 = index + 4;
            int c = c(index, i6, str);
            if (b(str, i6, '-')) {
                i6 = index + 5;
            }
            int i7 = i6 + 2;
            int c2 = c(i6, i7, str);
            if (b(str, i7, '-')) {
                i7 = i6 + 3;
            }
            int i8 = i7 + 2;
            int c3 = c(i7, i8, str);
            boolean b = b(str, i8, 'T');
            if (!b && str.length() <= i8) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(c, c2 - 1, c3);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i8);
                return gregorianCalendar.getTime();
            }
            if (b) {
                int i9 = i7 + 5;
                int c4 = c(i7 + 3, i9, str);
                if (b(str, i9, ':')) {
                    i9 = i7 + 6;
                }
                int i10 = i9 + 2;
                int c5 = c(i9, i10, str);
                int i11 = b(str, i10, ':') ? i9 + 3 : i10;
                if (str.length() <= i11 || (charAt = str.charAt(i11)) == 'Z' || charAt == '+' || charAt == '-') {
                    i8 = i11;
                    i3 = c5;
                    i2 = c4;
                    i4 = 0;
                } else {
                    int i12 = i11 + 2;
                    i4 = c(i11, i12, str);
                    if (i4 > 59 && i4 < 63) {
                        i4 = 59;
                    }
                    if (b(str, i12, '.')) {
                        int i13 = i11 + 3;
                        int i14 = i11 + 4;
                        while (i14 < str.length()) {
                            char charAt2 = str.charAt(i14);
                            int i15 = i14;
                            if (charAt2 >= '0' && charAt2 <= '9') {
                                i14 = i15 + 1;
                            }
                            i8 = i15;
                        }
                        i8 = str.length();
                        int min = Math.min(i8, i11 + 6);
                        i5 = c(i13, min, str);
                        int i16 = min - i13;
                        if (i16 == 1) {
                            i5 *= 100;
                        } else if (i16 == 2) {
                            i5 *= 10;
                        }
                        i3 = c5;
                        i2 = c4;
                        i = c2;
                    } else {
                        i8 = i12;
                        i3 = c5;
                        i2 = c4;
                    }
                }
                i5 = 0;
                i = c2;
            } else {
                i = c2;
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            try {
                if (str.length() <= i8) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                char charAt3 = str.charAt(i8);
                TimeZone timeZone = a;
                try {
                    if (charAt3 == 'Z') {
                        length = i8 + 1;
                    } else {
                        if (charAt3 != '+' && charAt3 != '-') {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(charAt3).length() + 30);
                            sb2.append("Invalid time zone indicator '");
                            sb2.append(charAt3);
                            sb2.append("'");
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                        String substring = str.substring(i8);
                        if (substring.length() < 5) {
                            StringBuilder sb3 = new StringBuilder(substring.length() + 2);
                            sb3.append(substring);
                            sb3.append("00");
                            substring = sb3.toString();
                        }
                        length = i8 + substring.length();
                        if (!substring.equals("+0000") && !substring.equals("+00:00")) {
                            StringBuilder sb4 = new StringBuilder(substring.length() + 3);
                            sb4.append("GMT");
                            sb4.append(substring);
                            String sb5 = sb4.toString();
                            timeZone = TimeZone.getTimeZone(sb5);
                            String id = timeZone.getID();
                            if (!id.equals(sb5) && !id.replace(":", "").equals(sb5)) {
                                String id2 = timeZone.getID();
                                StringBuilder sb6 = new StringBuilder(sb5.length() + 53 + String.valueOf(id2).length());
                                sb6.append("Mismatching time zone indicator: ");
                                sb6.append(sb5);
                                sb6.append(" given, resolves to ");
                                sb6.append(id2);
                                throw new IndexOutOfBoundsException(sb6.toString());
                            }
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, c);
                    gregorianCalendar2.set(2, i - 1);
                    gregorianCalendar2.set(5, c3);
                    gregorianCalendar2.set(11, i2);
                    gregorianCalendar2.set(12, i3);
                    gregorianCalendar2.set(13, i4);
                    gregorianCalendar2.set(14, i5);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                } catch (IllegalArgumentException e) {
                    e = e;
                    parsePosition2 = parsePosition;
                    if (str != null) {
                        sb = null;
                    } else {
                        StringBuilder sb7 = new StringBuilder(str.length() + 2);
                        sb7.append("\"");
                        sb7.append(str);
                        sb7.append("\"");
                        sb = sb7.toString();
                    }
                    message = e.getMessage();
                    if (message != null || message.isEmpty()) {
                        String name = e.getClass().getName();
                        StringBuilder sb8 = new StringBuilder(name.length() + 2);
                        sb8.append("(");
                        sb8.append(name);
                        sb8.append(")");
                        message = sb8.toString();
                    }
                    ParseException parseException = new ParseException(fc6.o(new StringBuilder(message.length() + String.valueOf(sb).length() + 25), "Failed to parse date [", sb, "]: ", message), parsePosition2.getIndex());
                    parseException.initCause(e);
                    throw parseException;
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                    parsePosition2 = parsePosition;
                    if (str != null) {
                    }
                    message = e.getMessage();
                    if (message != null) {
                    }
                    String name2 = e.getClass().getName();
                    StringBuilder sb82 = new StringBuilder(name2.length() + 2);
                    sb82.append("(");
                    sb82.append(name2);
                    sb82.append(")");
                    message = sb82.toString();
                    ParseException parseException2 = new ParseException(fc6.o(new StringBuilder(message.length() + String.valueOf(sb).length() + 25), "Failed to parse date [", sb, "]: ", message), parsePosition2.getIndex());
                    parseException2.initCause(e);
                    throw parseException2;
                }
            } catch (IllegalArgumentException e3) {
                e = e3;
                parsePosition2 = r3;
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
                parsePosition2 = r3;
            }
        } catch (IllegalArgumentException e5) {
            e = e5;
            parsePosition2 = parsePosition;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            String name22 = e.getClass().getName();
            StringBuilder sb822 = new StringBuilder(name22.length() + 2);
            sb822.append("(");
            sb822.append(name22);
            sb822.append(")");
            message = sb822.toString();
            ParseException parseException22 = new ParseException(fc6.o(new StringBuilder(message.length() + String.valueOf(sb).length() + 25), "Failed to parse date [", sb, "]: ", message), parsePosition2.getIndex());
            parseException22.initCause(e);
            throw parseException22;
        } catch (IndexOutOfBoundsException e6) {
            e = e6;
            parsePosition2 = parsePosition;
            if (str != null) {
            }
            message = e.getMessage();
            if (message != null) {
            }
            String name222 = e.getClass().getName();
            StringBuilder sb8222 = new StringBuilder(name222.length() + 2);
            sb8222.append("(");
            sb8222.append(name222);
            sb8222.append(")");
            message = sb8222.toString();
            ParseException parseException222 = new ParseException(fc6.o(new StringBuilder(message.length() + String.valueOf(sb).length() + 25), "Failed to parse date [", sb, "]: ", message), parsePosition2.getIndex());
            parseException222.initCause(e);
            throw parseException222;
        }
    }

    public static boolean b(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static int c(int i, int i2, String str) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(str.substring(i, i2)));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }
}

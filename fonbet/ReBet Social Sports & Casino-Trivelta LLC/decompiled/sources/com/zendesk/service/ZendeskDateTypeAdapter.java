package com.zendesk.service;

import Jb.a;
import Jb.b;
import Jb.c;
import com.google.gson.TypeAdapter;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;
import ld.AbstractC5459a;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes4.dex */
public class ZendeskDateTypeAdapter extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f42384a = TimeZone.getTimeZone("UTC");

    public static int c(String str, int i10) {
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public final boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public final String b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f42384a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(21);
        d(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        d(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        d(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        d(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        d(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        d(sb2, gregorianCalendar.get(13), 2);
        sb2.append(Matrix.MATRIX_TYPE_ZERO);
        return sb2.toString();
    }

    public final void d(StringBuilder sb2, int i10, int i11) {
        String num = Integer.toString(i10);
        for (int length = i11 - num.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(num);
    }

    public final Date e(String str, ParsePosition parsePosition) {
        String str2;
        int i10;
        int i11;
        int i12;
        int i13;
        char charAt;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int f10 = f(str, index, i14);
            if (a(str, i14, '-')) {
                i14 = index + 5;
            }
            int i15 = i14 + 2;
            int f11 = f(str, i14, i15);
            if (a(str, i15, '-')) {
                i15 = i14 + 3;
            }
            int i16 = i15 + 2;
            int f12 = f(str, i15, i16);
            boolean a10 = a(str, i16, 'T');
            if (!a10 && str.length() <= i16) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(f10, f11 - 1, f12);
                parsePosition.setIndex(i16);
                return gregorianCalendar.getTime();
            }
            if (a10) {
                int i17 = i15 + 5;
                int f13 = f(str, i15 + 3, i17);
                if (a(str, i17, ':')) {
                    i17 = i15 + 6;
                }
                int i18 = i17 + 2;
                int f14 = f(str, i17, i18);
                if (a(str, i18, ':')) {
                    i18 = i17 + 3;
                }
                if (str.length() <= i18 || (charAt = str.charAt(i18)) == 'Z' || charAt == '+' || charAt == '-') {
                    i16 = i18;
                    i10 = f13;
                    i12 = 0;
                    i13 = 0;
                } else {
                    int i19 = i18 + 2;
                    i12 = f(str, i18, i19);
                    if (i12 > 59 && i12 < 63) {
                        i12 = 59;
                    }
                    if (a(str, i19, '.')) {
                        int i20 = i18 + 3;
                        int c10 = c(str, i18 + 4);
                        int min = Math.min(c10, i18 + 6);
                        int f15 = f(str, i20, min);
                        int i21 = min - i20;
                        if (i21 == 1) {
                            f15 *= 100;
                        } else if (i21 == 2) {
                            f15 *= 10;
                        }
                        i10 = f13;
                        i16 = c10;
                        i11 = f14;
                        i13 = f15;
                    } else {
                        i10 = f13;
                        i16 = i19;
                        i13 = 0;
                    }
                }
                i11 = f14;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                i13 = 0;
            }
            if (str.length() <= i16) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char charAt2 = str.charAt(i16);
            if (charAt2 != 'Z') {
                throw new IndexOutOfBoundsException("Invalid time zone indicator '" + charAt2 + "'");
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(f42384a);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, f10);
            gregorianCalendar2.set(2, f11 - 1);
            gregorianCalendar2.set(5, f12);
            gregorianCalendar2.set(11, i10);
            gregorianCalendar2.set(12, i11);
            gregorianCalendar2.set(13, i12);
            gregorianCalendar2.set(14, i13);
            parsePosition.setIndex(i16 + 1);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e10) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = Typography.quote + str + "'";
            }
            String message = e10.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e10.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e10);
            throw parseException;
        }
    }

    public final int f(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int digit = Character.digit(str.charAt(i10), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -digit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int digit2 = Character.digit(str.charAt(i13), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - digit2;
            i13 = i14;
        }
        return -i12;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Date read(a aVar) {
        if (aVar.Y1() == b.NULL) {
            aVar.n1();
            return null;
        }
        String M02 = aVar.M0();
        try {
            return e(M02, new ParsePosition(0));
        } catch (ParseException e10) {
            AbstractC5459a.c("ZendeskDateTypeAdapter", String.format(Locale.US, "Failed to parse Date from: %s", M02), e10, new Object[0]);
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void write(c cVar, Date date) {
        if (date == null) {
            cVar.T1();
        } else {
            cVar.k2(b(date));
        }
    }
}

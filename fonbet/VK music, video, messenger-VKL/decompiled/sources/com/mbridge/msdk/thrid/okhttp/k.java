package com.mbridge.msdk.thrid.okhttp;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.B5;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.ok.android.commons.http.Http;
import xsna.urd0;

/* compiled from: Cookie.java */
/* loaded from: classes14.dex */
public final class k {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private k(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.a.equals(this.a) && kVar.b.equals(this.b) && kVar.d.equals(this.d) && kVar.e.equals(this.e) && kVar.c == this.c && kVar.f == this.f && kVar.g == this.g && kVar.h == this.h && kVar.i == this.i;
    }

    public int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(urd0.a(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, this.a), 31, this.b), 31, this.d), 31, this.e);
        long j2 = this.c;
        return ((((((((a + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    public static k a(s sVar, String str) {
        return a(System.currentTimeMillis(), sVar, str);
    }

    public static k a(long j2, s sVar, String str) {
        long j3;
        String str2;
        String str3;
        int length = str.length();
        char c = ';';
        int a = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        int a2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, a, B5.U);
        String str4 = null;
        if (a2 == a) {
            return null;
        }
        String d = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, a2);
        if (d.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(d) != -1) {
            return null;
        }
        String d2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, a2 + 1, a);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(d2) != -1) {
            return null;
        }
        int i = a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long j4 = 253402300799999L;
        long j5 = -1;
        String str5 = null;
        while (i < length) {
            int a3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, length, c);
            int a4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, a3, B5.U);
            String d3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i, a4);
            String d4 = a4 < a3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, a4 + 1, a3) : "";
            if (d3.equalsIgnoreCase("expires")) {
                try {
                    j4 = a(d4, 0, d4.length());
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (d3.equalsIgnoreCase("max-age")) {
                j5 = b(d4);
            } else {
                if (d3.equalsIgnoreCase(X3.j.D)) {
                    str4 = a(d4);
                    z4 = false;
                } else if (d3.equalsIgnoreCase("path")) {
                    str5 = d4;
                } else if (d3.equalsIgnoreCase("secure")) {
                    z2 = true;
                } else if (d3.equalsIgnoreCase("httponly")) {
                    z3 = true;
                }
                i = a3 + 1;
                c = ';';
            }
            z = true;
            i = a3 + 1;
            c = ';';
        }
        if (j5 == Long.MIN_VALUE) {
            j3 = Long.MIN_VALUE;
        } else if (j5 != -1) {
            long j6 = j2 + (j5 <= 9223372036854775L ? j5 * 1000 : Long.MAX_VALUE);
            j3 = (j6 < j2 || j6 > 253402300799999L) ? 253402300799999L : j6;
        } else {
            j3 = j4;
        }
        String g = sVar.g();
        if (str4 == null) {
            str2 = g;
        } else {
            if (!a(g, str4)) {
                return null;
            }
            str2 = str4;
        }
        if (g.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return null;
        }
        if (str5 == null || !str5.startsWith(DomExceptionUtils.SEPARATOR)) {
            String c2 = sVar.c();
            int lastIndexOf = c2.lastIndexOf(47);
            if (lastIndexOf != 0) {
                str5 = c2.substring(0, lastIndexOf);
            } else {
                str3 = DomExceptionUtils.SEPARATOR;
                return new k(d, d2, j3, str2, str3, z2, z3, z4, z);
            }
        }
        str3 = str5;
        return new k(d, d2, j3, str2, str3, z2, z3, z4, z);
    }

    private static long a(String str, int i, int i2) {
        int a = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else {
                if (i6 == -1) {
                    Pattern pattern = k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            a = a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i6 == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        if (i8 >= 0 && i8 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.mbridge.msdk.thrid.okhttp.internal.c.p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String a = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (a != null) {
                return a;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<k> a(s sVar, r rVar) {
        List<String> c = rVar.c(Http.Header.SET_COOKIE);
        int size = c.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            k a = a(sVar, c.get(i));
            if (a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(B5.U);
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}

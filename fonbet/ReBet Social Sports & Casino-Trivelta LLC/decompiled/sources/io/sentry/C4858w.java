package io.sentry;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: io.sentry.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4858w {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f52863g = Pattern.compile("^o(\\d+)\\.");

    /* renamed from: a, reason: collision with root package name */
    public final String f52864a;

    /* renamed from: b, reason: collision with root package name */
    public final String f52865b;

    /* renamed from: c, reason: collision with root package name */
    public final String f52866c;

    /* renamed from: d, reason: collision with root package name */
    public final String f52867d;

    /* renamed from: e, reason: collision with root package name */
    public final URI f52868e;

    /* renamed from: f, reason: collision with root package name */
    public final String f52869f;

    public C4858w(String str) {
        String trim = ((String) io.sentry.util.w.c(str, "The DSN is required.")).trim();
        if (trim.isEmpty()) {
            throw new IllegalArgumentException("The DSN is empty.");
        }
        try {
            int indexOf = trim.indexOf("://");
            if (indexOf < 0) {
                throw new IllegalArgumentException("Invalid DSN: Missing scheme.");
            }
            String substring = trim.substring(0, indexOf);
            if (!"http".equalsIgnoreCase(substring) && !"https".equalsIgnoreCase(substring)) {
                throw new IllegalArgumentException("Invalid DSN: Invalid scheme '" + substring + "'.");
            }
            int i10 = indexOf + 3;
            int indexOf2 = trim.indexOf(64, i10);
            if (indexOf2 < 0) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String substring2 = trim.substring(i10, indexOf2);
            int indexOf3 = substring2.indexOf(58);
            String substring3 = indexOf3 < 0 ? substring2 : substring2.substring(0, indexOf3);
            this.f52867d = substring3;
            this.f52866c = indexOf3 < 0 ? null : substring2.substring(indexOf3 + 1);
            if (substring3.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String j10 = j(trim, indexOf2 + 1);
            int indexOf4 = j10.indexOf(47);
            if (indexOf4 < 0) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String substring4 = j10.substring(0, indexOf4);
            int i11 = i(substring4);
            String substring5 = i11 < 0 ? substring4 : substring4.substring(0, i11);
            int h10 = i11 < 0 ? -1 : h(substring4.substring(i11 + 1));
            String k10 = k(a(j10.substring(indexOf4)));
            int lastIndexOf = k10.lastIndexOf(47) + 1;
            String b10 = b(k10.substring(0, lastIndexOf));
            this.f52865b = b10;
            String substring6 = k10.substring(lastIndexOf);
            this.f52864a = substring6;
            if (substring6.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
            }
            String str2 = substring5;
            this.f52868e = new URI(substring, null, str2, h10, b10 + "api/" + substring6, null, null);
            this.f52869f = c(str2);
        } catch (URISyntaxException e10) {
            throw new IllegalArgumentException("Invalid DSN: " + e10.getMessage(), e10);
        }
    }

    public static String a(String str) {
        if (!str.contains("//")) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        char c10 = 0;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt != '/' || c10 != '/') {
                sb2.append(charAt);
                c10 = charAt;
            }
        }
        return sb2.toString();
    }

    public static String b(String str) {
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    public static String c(String str) {
        Matcher matcher = f52863g.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public static int h(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Invalid DSN: Invalid port '" + str + "'.", e10);
        }
    }

    public static int i(String str) {
        return str.startsWith("[") ? str.indexOf(58, str.indexOf(93)) : str.indexOf(58);
    }

    public static String j(String str, int i10) {
        int indexOf = str.indexOf(63, i10);
        int indexOf2 = str.indexOf(35, i10);
        if (indexOf2 >= 0 && (indexOf < 0 || indexOf2 < indexOf)) {
            indexOf = indexOf2;
        }
        return indexOf < 0 ? str.substring(i10) : str.substring(i10, indexOf);
    }

    public static String k(String str) {
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }

    public String d() {
        return this.f52869f;
    }

    public String e() {
        return this.f52867d;
    }

    public String f() {
        return this.f52866c;
    }

    public URI g() {
        return this.f52868e;
    }
}

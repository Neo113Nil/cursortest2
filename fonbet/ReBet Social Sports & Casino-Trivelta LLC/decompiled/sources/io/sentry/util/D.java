package io.sentry.util;

import io.sentry.EnumC4788n3;
import io.sentry.ILogger;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes3.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f52787a = StandardCharsets.UTF_8;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f52788b = Pattern.compile("[\\W_]+");

    public static String a(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            try {
                return new BigInteger(1, MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(str.getBytes(f52787a))).toString(16);
            } catch (NoSuchAlgorithmException e10) {
                iLogger.b(EnumC4788n3.INFO, "SHA-1 isn't available to calculate the hash.", e10);
            } catch (Throwable th2) {
                iLogger.c(EnumC4788n3.INFO, "string: %s could not calculate its hash", th2, str);
            }
        }
        return null;
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] split = f52788b.split(str, -1);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : split) {
            sb2.append(c(str2));
        }
        return sb2.toString();
    }

    public static String c(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb2.append(substring.toUpperCase(locale));
        sb2.append(str.substring(1).toLowerCase(locale));
        return sb2.toString();
    }

    public static int d(String str, char c10) {
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (str.charAt(i11) == c10) {
                i10++;
            }
        }
        return i10;
    }

    public static String e(String str) {
        return str == null ? "" : str;
    }

    public static String f(String str) {
        int i10;
        if (str == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return (lastIndexOf < 0 || str.length() <= (i10 = lastIndexOf + 1)) ? str : str.substring(i10);
    }

    public static String g(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            sb2.append((CharSequence) it.next());
            while (it.hasNext()) {
                sb2.append(charSequence);
                sb2.append((CharSequence) it.next());
            }
        }
        return sb2.toString();
    }

    public static String h(String str) {
        return str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
    }

    public static String i(String str, String str2) {
        return (str == null || str2 == null || !str.startsWith(str2) || !str.endsWith(str2)) ? str : str.substring(str2.length(), str.length() - str2.length());
    }

    public static String j(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }
}

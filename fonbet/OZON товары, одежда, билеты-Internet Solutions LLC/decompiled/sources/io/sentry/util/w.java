package io.sentry.util;

import io.sentry.I2;
import io.sentry.ILogger;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f68603a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Pattern f68604b = Pattern.compile("[\\W_]+");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f68605c = 0;

    public static String a(String str, @NotNull ILogger iLogger) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new StringBuilder(new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str.getBytes(f68603a))).toString(16)).toString();
        } catch (NoSuchAlgorithmException e11) {
            iLogger.a(I2.INFO, "SHA-1 isn't available to calculate the hash.", e11);
            return null;
        } catch (Throwable th2) {
            iLogger.c(I2.INFO, "string: %s could not calculate its hash", th2, str);
            return null;
        }
    }

    public static String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String[] split = f68604b.split(str, -1);
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

    public static String d(String str) {
        return (str != null && str.startsWith("\"") && str.endsWith("\"")) ? str.substring(1, str.length() - 1) : str;
    }
}

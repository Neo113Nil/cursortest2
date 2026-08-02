package io.sentry.cache;

import io.sentry.I2;
import io.sentry.W2;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f67784a = Charset.forName("UTF-8");

    static void a(@NotNull SentryAndroidOptions sentryAndroidOptions, @NotNull String str, @NotNull String str2) {
        File b11 = b(sentryAndroidOptions, str);
        if (b11 == null) {
            sentryAndroidOptions.getLogger().c(I2.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(b11, str2);
        sentryAndroidOptions.getLogger().c(I2.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        sentryAndroidOptions.getLogger().c(I2.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    static File b(@NotNull W2 w22, @NotNull String str) {
        String cacheDirPath = w22.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    static Object c(@NotNull W2 w22, @NotNull String str, @NotNull String str2, @NotNull Class cls) {
        File b11 = b(w22, str);
        if (b11 == null) {
            w22.getLogger().c(I2.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(b11, str2);
        if (!file.exists()) {
            w22.getLogger().c(I2.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f67784a));
            try {
                Object c11 = w22.getSerializer().c(bufferedReader, cls);
                bufferedReader.close();
                return c11;
            } finally {
            }
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    static <T> void d(@NotNull W2 w22, @NotNull T t2, @NotNull String str, @NotNull String str2) {
        File b11 = b(w22, str);
        if (b11 == null) {
            w22.getLogger().c(I2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b11, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f67784a));
                try {
                    w22.getSerializer().a(bufferedWriter, t2);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}

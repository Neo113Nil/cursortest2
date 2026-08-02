package io.sentry.cache;

import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.InterfaceC4859w0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f51927a = Charset.forName("UTF-8");

    public static void a(F3 f32, String str, String str2) {
        File b10 = b(f32, str);
        if (b10 == null) {
            f32.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(b10, str2);
        f32.getLogger().c(EnumC4788n3.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        f32.getLogger().c(EnumC4788n3.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(F3 f32, String str) {
        String cacheDirPath = f32.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(F3 f32, String str, String str2, Class cls, InterfaceC4859w0 interfaceC4859w0) {
        File b10 = b(f32, str);
        if (b10 == null) {
            f32.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(b10, str2);
        if (file.exists()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f51927a));
                try {
                    Object c10 = interfaceC4859w0 == null ? f32.getSerializer().c(bufferedReader, cls) : f32.getSerializer().e(bufferedReader, cls, interfaceC4859w0);
                    bufferedReader.close();
                    return c10;
                } finally {
                }
            } catch (Throwable th2) {
                f32.getLogger().a(EnumC4788n3.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            }
        } else {
            f32.getLogger().c(EnumC4788n3.DEBUG, "No entry stored for %s", str2);
        }
        return null;
    }

    public static void d(F3 f32, Object obj, String str, String str2) {
        File b10 = b(f32, str);
        if (b10 == null) {
            f32.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b10, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f51927a));
                try {
                    f32.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            f32.getLogger().a(EnumC4788n3.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}

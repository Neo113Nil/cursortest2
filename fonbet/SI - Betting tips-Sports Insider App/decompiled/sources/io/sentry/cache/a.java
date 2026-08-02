package io.sentry.cache;

import io.sentry.b5;
import io.sentry.b6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f16239a = Charset.forName("UTF-8");

    public static void a(b6 b6Var, String str, String str2) {
        File b10 = b(b6Var, str);
        if (b10 == null) {
            b6Var.getLogger().h(b5.INFO, "Cache dir is not set, cannot delete from scope cache", new Object[0]);
            return;
        }
        File file = new File(b10, str2);
        b6Var.getLogger().h(b5.DEBUG, "Deleting %s from scope cache", str2);
        if (file.delete()) {
            return;
        }
        b6Var.getLogger().h(b5.INFO, "Failed to delete: %s", file.getAbsolutePath());
    }

    public static File b(b6 b6Var, String str) {
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        File file = new File(cacheDirPath, str);
        file.mkdirs();
        return file;
    }

    public static Object c(b6 b6Var, String str, String str2, Class cls) {
        File b10 = b(b6Var, str);
        if (b10 == null) {
            b6Var.getLogger().h(b5.INFO, "Cache dir is not set, cannot read from scope cache", new Object[0]);
            return null;
        }
        File file = new File(b10, str2);
        if (!file.exists()) {
            b6Var.getLogger().h(b5.DEBUG, "No entry stored for %s", str2);
            return null;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f16239a));
            try {
                Object c2 = b6Var.getSerializer().c(bufferedReader, cls);
                bufferedReader.close();
                return c2;
            } finally {
            }
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Error reading entity from scope cache: %s", str2);
            return null;
        }
    }

    public static void d(b6 b6Var, Object obj, String str, String str2) {
        File b10 = b(b6Var, str);
        if (b10 == null) {
            b6Var.getLogger().h(b5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(b10, str2));
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f16239a));
                try {
                    b6Var.getSerializer().a(obj, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Error persisting entity: %s", str2);
        }
    }
}

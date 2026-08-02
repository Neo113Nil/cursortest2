package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC7097a0;
import io.sentry.Z0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class V {

    /* renamed from: a, reason: collision with root package name */
    static String f67026a;

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f67027b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    protected static final io.sentry.util.a f67028c = new io.sentry.util.a();

    public static String a(@NotNull Context context) throws RuntimeException {
        InterfaceC7097a0 a11 = f67028c.a();
        try {
            if (f67026a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean exists = file.exists();
                    Charset charset = f67027b;
                    if (!exists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String c11 = Z0.c();
                            fileOutputStream.write(c11.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f67026a = c11;
                            a11.close();
                            return c11;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f67026a = str;
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str2 = f67026a;
            a11.close();
            return str2;
        } catch (Throwable th3) {
            try {
                a11.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}

package io.sentry.android.core;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f15859a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f15860b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final io.sentry.util.a f15861c = new io.sentry.util.a();

    public static String a(Context context) {
        io.sentry.r a7 = f15861c.a();
        try {
            if (f15859a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean exists = file.exists();
                    Charset charset = f15860b;
                    if (!exists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String n9 = io.sentry.config.a.n();
                            fileOutputStream.write(n9.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            f15859a = n9;
                            a7.close();
                            return n9;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        f15859a = str;
                    } finally {
                    }
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str2 = f15859a;
            a7.close();
            return str2;
        } catch (Throwable th3) {
            try {
                a7.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}

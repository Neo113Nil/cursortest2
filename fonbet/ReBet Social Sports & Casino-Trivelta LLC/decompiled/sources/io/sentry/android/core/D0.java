package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC4765j0;
import io.sentry.T3;
import io.sentry.util.C4843a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public abstract class D0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f50677a;

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f50678b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final C4843a f50679c = new C4843a();

    public static String a(Context context) {
        InterfaceC4765j0 d10 = f50679c.d();
        try {
            if (f50677a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    if (!file.exists()) {
                        String c10 = c(file);
                        f50677a = c10;
                        if (d10 != null) {
                            d10.close();
                        }
                        return c10;
                    }
                    f50677a = b(file);
                } catch (Throwable th2) {
                    throw new RuntimeException(th2);
                }
            }
            String str = f50677a;
            if (d10 != null) {
                d10.close();
            }
            return str;
        } catch (Throwable th3) {
            if (d10 != null) {
                try {
                    d10.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static String b(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            byte[] bArr = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr);
            String str = new String(bArr, f50678b);
            randomAccessFile.close();
            return str;
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static String c(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            String a10 = T3.a();
            fileOutputStream.write(a10.getBytes(f50678b));
            fileOutputStream.flush();
            fileOutputStream.close();
            return a10;
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}

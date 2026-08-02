package com.inmobi.media;

import defpackage.fc6;
import defpackage.is8;
import java.io.Closeable;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class Al {
    public static final Charset a = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.ASCII_NAME);
    public static final Charset b = Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);

    public static void a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            is8.e(fc6.k(file, "not a readable directory: "));
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                is8.e(fc6.k(file2, "failed to delete file: "));
                return;
            }
        }
    }

    public static String a(InputStreamReader inputStreamReader) {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    String stringWriter2 = stringWriter.toString();
                    inputStreamReader.close();
                    return stringWriter2;
                }
            }
        } catch (Throwable th) {
            inputStreamReader.close();
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}

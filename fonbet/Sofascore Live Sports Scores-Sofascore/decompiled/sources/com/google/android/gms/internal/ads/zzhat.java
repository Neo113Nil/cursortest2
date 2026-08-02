package com.google.android.gms.internal.ads;

import defpackage.a70;
import defpackage.is8;
import defpackage.kko;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhat {
    public static void a(File file, byte[] bArr) {
        new zzhai();
        file.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file, zzgxw.v(new zzhaq[0]).contains(zzhaq.a));
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        is8.e("Unable to create parent directories of ".concat(file.toString()));
    }

    public static void c(File file, File file2) {
        file.getClass();
        file2.getClass();
        if (file.equals(file2)) {
            a70.p(zzgvb.a("Source %s and destination %s must be different", file, file2));
            return;
        }
        if (file.renameTo(file2)) {
            return;
        }
        if (file.equals(file2)) {
            a70.p(zzgvb.a("Source %s and destination %s must be different", file, file2));
            return;
        }
        kko kkoVar = new kko(file);
        new zzhai();
        zzgxw v = zzgxw.v(new zzhaq[0]);
        zzhap zzhapVar = new zzhap();
        ArrayDeque arrayDeque = zzhapVar.a;
        try {
            FileInputStream fileInputStream = new FileInputStream(kkoVar.a);
            arrayDeque.addFirst(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream(file2, v.contains(zzhaq.a));
            arrayDeque.addFirst(fileOutputStream);
            int i = zzham.a;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            zzhapVar.close();
            if (file.delete()) {
                return;
            }
            if (file2.delete()) {
                is8.e("Unable to delete ".concat(file.toString()));
            } else {
                is8.e("Unable to delete ".concat(file2.toString()));
            }
        } catch (Throwable th) {
            try {
                zzhapVar.b = th;
                Object obj = zzgvg.a;
                if (IOException.class.isInstance(th)) {
                    throw ((Throwable) IOException.class.cast(th));
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (!(th instanceof Error)) {
                    throw new RuntimeException(th);
                }
                throw ((Error) th);
            } catch (Throwable th2) {
                zzhapVar.close();
                throw th2;
            }
        }
    }
}

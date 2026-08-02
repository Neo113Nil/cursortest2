package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzgzg {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgyv zzgyvVar = new zzgyv();
        file.getClass();
        zzgwj zzq = zzgwj.zzq(new zzgzd[0]);
        bArr.getClass();
        FileOutputStream zza = zzgze.zza(file, zzq, zzgyvVar);
        try {
            zza.write(bArr);
            zza.close();
        } catch (Throwable th) {
            try {
                zza.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }

    public static void zzc(File file, File file2) throws IOException {
        file.getClass();
        file2.getClass();
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        if (file.renameTo(file2)) {
            return;
        }
        zzgsw.zzh(!file.equals(file2), "Source %s and destination %s must be different", file, file2);
        zzgzf zzgzfVar = new zzgzf(file, null);
        zzgyv zzgyvVar = new zzgyv();
        zzgwj zzq = zzgwj.zzq(new zzgzd[0]);
        zzgzc zza = zzgzc.zza();
        try {
            InputStream zza2 = zzgzfVar.zza();
            zza.zzb(zza2);
            InputStream inputStream = zza2;
            FileOutputStream zza3 = zzgze.zza(file2, zzq, zzgyvVar);
            zza.zzb(zza3);
            FileOutputStream fileOutputStream = zza3;
            int i = zzgyz.zza;
            byte[] bArr = new byte[8192];
            while (true) {
                int read = zza2.read(bArr);
                if (read == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, read);
                }
            }
            zza.close();
            if (file.delete()) {
                return;
            }
            if (!file2.delete()) {
                throw new IOException("Unable to delete ".concat(file2.toString()));
            }
            throw new IOException("Unable to delete ".concat(file.toString()));
        } catch (Throwable th) {
            try {
                throw zza.zzc(th);
            } catch (Throwable th2) {
                zza.close();
                throw th2;
            }
        }
    }
}

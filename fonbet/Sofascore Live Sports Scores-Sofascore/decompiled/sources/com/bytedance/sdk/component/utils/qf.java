package com.bytedance.sdk.component.utils;

import android.content.Context;
import defpackage.bf3;
import defpackage.dmi;
import defpackage.is8;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.bytedance.sdk.component.utils.qf$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<File> {
        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(File file, File file2) {
            throw null;
        }
    }

    public static void gm(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        gm(file2);
                    } else {
                        try {
                            file2.delete();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            file.delete();
        } catch (Throwable unused2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0044, code lost:
    
        if (r4 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] oo(File file) {
        FileInputStream fileInputStream;
        if (file != null && file.isFile() && file.exists() && file.canRead() && file.length() > 0) {
            try {
                long length = file.length();
                Long valueOf = Long.valueOf(length);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[valueOf.intValue()];
                    if (fileInputStream.read(bArr) == length) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        return bArr;
                    }
                } catch (Throwable unused2) {
                }
            } catch (Throwable unused3) {
                fileInputStream = null;
            }
            try {
                fileInputStream.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    public static File pcc(Context context, String str, String str2) {
        String pcc2 = pcc(context);
        if (!fum.pcc(context)) {
            StringBuilder p = bf3.p(str, "_");
            p.append(fum.gm(context));
            str = p.toString();
        }
        if (pcc2 != null) {
            String str3 = File.separator;
            if (!pcc2.endsWith(str3)) {
                pcc2 = dmi.q(pcc2, str3);
            }
        }
        String y = dmi.y(pcc2, str);
        File file = new File(y);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(y, str2);
    }

    public static void sf(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (file.setLastModified(currentTimeMillis)) {
                return;
            }
            vj(file);
            if (file.lastModified() < currentTimeMillis) {
                new Date(file.lastModified()).toString();
                file.getAbsolutePath();
            }
        }
    }

    private static void vj(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        long j;
        long length = file.length();
        if (length == 0) {
            wh(file);
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(file, "rwd");
            j = length - 1;
        } catch (Throwable unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.seek(j);
            byte readByte = randomAccessFile.readByte();
            randomAccessFile.seek(j);
            randomAccessFile.write(readByte);
            randomAccessFile.close();
        } catch (Throwable unused2) {
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        }
    }

    private static void wh(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        is8.e("Error recreate zero-size file ".concat(String.valueOf(file)));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc implements Comparator<File> {
        private pcc() {
        }

        @Override // java.util.Comparator
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return pcc(file.lastModified(), file2.lastModified());
        }

        public /* synthetic */ pcc(AnonymousClass1 anonymousClass1) {
            this();
        }

        private int pcc(long j, long j2) {
            if (j < j2) {
                return -1;
            }
            return j == j2 ? 0 : 1;
        }
    }

    public static File sf(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = dmi.q(absolutePath, str2);
            }
        }
        File file = new File(dmi.y(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File pcc(Context context, File file, String str) {
        if (file != null) {
            try {
                if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable unused) {
                return new File(file, str);
            }
        }
        if (fum.pcc(context)) {
            return new File(file, str);
        }
        return new File(file, str + "_" + fum.gm(context));
    }

    public static File pcc(Context context, String str) {
        String absolutePath = context.getCacheDir().getAbsolutePath();
        if (!fum.pcc(context)) {
            StringBuilder p = bf3.p(str, "_");
            p.append(fum.gm(context));
            str = p.toString();
        }
        if (absolutePath != null) {
            String str2 = File.separator;
            if (!absolutePath.endsWith(str2)) {
                absolutePath = dmi.q(absolutePath, str2);
            }
        }
        File file = new File(dmi.y(absolutePath, str));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static String pcc(Context context) {
        File cacheDir;
        if (context == null || (cacheDir = context.getCacheDir()) == null) {
            return null;
        }
        return cacheDir.getPath();
    }

    public static List<File> pcc(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return linkedList;
        }
        List<File> asList = Arrays.asList(listFiles);
        Collections.sort(asList, new pcc(null));
        return asList;
    }
}

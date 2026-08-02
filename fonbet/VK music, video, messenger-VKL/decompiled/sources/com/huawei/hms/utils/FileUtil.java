package com.huawei.hms.utils;

import android.content.Context;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes13.dex */
public abstract class FileUtil {
    public static final String LOCAL_REPORT_FILE = "hms/HwMobileServiceReport.txt";
    public static final String LOCAL_REPORT_FILE_CONFIG = "hms/config.txt";
    public static final long LOCAL_REPORT_FILE_MAX_SIZE = 10240;
    private static boolean a = false;
    private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();

    public class a implements Runnable {
        final /* synthetic */ File a;
        final /* synthetic */ long b;
        final /* synthetic */ String c;

        public a(File file, long j, String str) {
            this.a = file;
            this.b = j;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            File parentFile;
            RandomAccessFile randomAccessFile;
            Throwable th;
            File file = this.a;
            if (file == null || (parentFile = file.getParentFile()) == null) {
                return;
            }
            if (parentFile.mkdirs() || parentFile.isDirectory()) {
                RandomAccessFile randomAccessFile2 = null;
                try {
                    long length = this.a.length();
                    if (length > this.b) {
                        String canonicalPath = this.a.getCanonicalPath();
                        this.a.delete();
                        randomAccessFile2 = new RandomAccessFile(new File(canonicalPath), "rw");
                    } else {
                        randomAccessFile = new RandomAccessFile(this.a, "rw");
                        try {
                            randomAccessFile.seek(length);
                            randomAccessFile2 = randomAccessFile;
                        } catch (IOException unused) {
                            randomAccessFile2 = randomAccessFile;
                            IOUtils.closeQuietly(randomAccessFile2);
                        } catch (Throwable th2) {
                            th = th2;
                            IOUtils.closeQuietly(randomAccessFile);
                            throw th;
                        }
                    }
                    randomAccessFile2.writeBytes(this.c + System.getProperty("line.separator"));
                } catch (IOException unused2) {
                    randomAccessFile = randomAccessFile2;
                } catch (Throwable th3) {
                    randomAccessFile = randomAccessFile2;
                    th = th3;
                }
                IOUtils.closeQuietly(randomAccessFile2);
            }
        }
    }

    public static boolean verifyHash(String str, File file) {
        byte[] digest = SHA256.digest(file);
        return digest != null && HEX.encodeHexString(digest, true).equalsIgnoreCase(str);
    }

    public static void writeFile(File file, String str, long j) {
        b.execute(new a(file, j, str));
    }

    public static void writeFileReport(Context context, File file, File file2, String str, long j, int i) {
        if (file != null && file.isFile() && file.exists()) {
            if (!a) {
                if (file2 != null && file2.exists()) {
                    file2.delete();
                }
                a = true;
            }
            writeFile(file2, str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + j + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + i, LOCAL_REPORT_FILE_MAX_SIZE);
        }
    }
}

package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class AFb1kSDK {
    private static String AFInAppEventParameterName;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String AFInAppEventType(File file) {
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        byte[] bArr2 = null;
        randomAccessFile2 = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
            } catch (IOException e11) {
                e = e11;
                bArr = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bArr2 = new byte[(int) randomAccessFile.length()];
            randomAccessFile.readFully(bArr2);
            randomAccessFile.close();
            try {
                randomAccessFile.close();
            } catch (IOException e12) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e12);
            }
        } catch (IOException e13) {
            e = e13;
            bArr = bArr2;
            randomAccessFile2 = randomAccessFile;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e14) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e14);
                }
            }
            bArr2 = bArr;
            if (bArr2 == null) {
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e15) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e15);
                }
            }
            throw th;
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return new String(bArr2, Charset.defaultCharset());
    }

    public static synchronized String AFInAppEventType(AFd1kSDK aFd1kSDK, AFd1tSDK aFd1tSDK) {
        synchronized (AFb1kSDK.class) {
            if (aFd1kSDK.valueOf == null) {
                return AFInAppEventParameterName;
            }
            if (AFInAppEventParameterName == null) {
                String AFKeystoreWrapper = aFd1tSDK.AFKeystoreWrapper("AF_INSTALLATION", (String) null);
                if (AFKeystoreWrapper != null) {
                    AFInAppEventParameterName = AFKeystoreWrapper;
                } else {
                    try {
                        File file = new File(aFd1kSDK.valueOf.getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(currentTimeMillis);
                            sb2.append("-");
                            sb2.append(Math.abs(new SecureRandom().nextLong()));
                            AFInAppEventParameterName = sb2.toString();
                        } else {
                            AFInAppEventParameterName = AFInAppEventType(file);
                            file.delete();
                        }
                        aFd1tSDK.valueOf("AF_INSTALLATION", AFInAppEventParameterName);
                    } catch (Exception e11) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e11);
                    }
                }
                if (AFInAppEventParameterName != null) {
                    AppsFlyerProperties.getInstance().set("uid", AFInAppEventParameterName);
                }
            }
            return AFInAppEventParameterName;
        }
    }
}

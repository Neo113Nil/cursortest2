package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* loaded from: classes6.dex */
public final class AFb1mSDK {
    private static String getMediationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String getMediationNetwork(File file) {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3 = null;
        byte[] bArr = null;
        RandomAccessFile randomAccessFile4 = null;
        try {
            try {
                randomAccessFile2 = new RandomAccessFile(file, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            randomAccessFile = null;
        }
        try {
            bArr = new byte[(int) randomAccessFile2.length()];
            randomAccessFile2.readFully(bArr);
            randomAccessFile2.close();
            try {
                randomAccessFile2.close();
                randomAccessFile3 = bArr;
            } catch (IOException e2) {
                AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e2);
                randomAccessFile3 = bArr;
            }
        } catch (IOException e3) {
            e = e3;
            randomAccessFile = bArr;
            randomAccessFile4 = randomAccessFile2;
            AFLogger.afErrorLog("Exception while reading InstallationFile: ", e);
            if (randomAccessFile4 != null) {
                try {
                    randomAccessFile4.close();
                } catch (IOException e4) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e4);
                }
            }
            randomAccessFile3 = randomAccessFile;
            byte[] bArr2 = randomAccessFile3;
            if (randomAccessFile3 == null) {
            }
            return new String(bArr2, Charset.defaultCharset());
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile3 = randomAccessFile2;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.close();
                } catch (IOException e5) {
                    AFLogger.afErrorLog("Exception while trying to close the InstallationFile", e5);
                }
            }
            throw th;
        }
        byte[] bArr22 = randomAccessFile3;
        if (randomAccessFile3 == null) {
            bArr22 = new byte[0];
        }
        return new String(bArr22, Charset.defaultCharset());
    }

    public static synchronized String getMediationNetwork(AFd1lSDK aFd1lSDK, AFd1pSDK aFd1pSDK) {
        synchronized (AFb1mSDK.class) {
            if (aFd1lSDK.getCurrencyIso4217Code == null) {
                return getMediationNetwork;
            }
            if (getMediationNetwork == null) {
                String AFAdRevenueData = aFd1pSDK.AFAdRevenueData("AF_INSTALLATION", (String) null);
                if (AFAdRevenueData != null) {
                    getMediationNetwork = AFAdRevenueData;
                } else {
                    try {
                        File file = new File(aFd1lSDK.getCurrencyIso4217Code.getFilesDir(), "AF_INSTALLATION");
                        if (file.exists()) {
                            getMediationNetwork = getMediationNetwork(file);
                            file.delete();
                        } else {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            getMediationNetwork = sb.toString();
                        }
                        aFd1pSDK.getMonetizationNetwork("AF_INSTALLATION", getMediationNetwork);
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (getMediationNetwork != null) {
                    AppsFlyerProperties.getInstance().set("uid", getMediationNetwork);
                }
            }
            return getMediationNetwork;
        }
    }
}

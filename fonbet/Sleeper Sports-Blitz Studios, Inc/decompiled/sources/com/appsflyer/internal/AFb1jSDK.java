package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import io.sentry.instrumentation.file.SentryFileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class AFb1jSDK implements AFb1vSDK {
    private final AFd1lSDK getMonetizationNetwork;

    public AFb1jSDK(AFd1lSDK aFd1lSDK) {
        this.getMonetizationNetwork = aFd1lSDK;
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final void getRevenue() {
        try {
            if (new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1vSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getMediationNetwork(AFb1iSDK aFb1iSDK) {
        OutputStreamWriter outputStreamWriter;
        SentryFileWriter sentryFileWriter = 0;
        try {
            try {
                File file = new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return null;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 40) {
                    AFLogger.INSTANCE.i(AFh1xSDK.CACHE, "reached cache limit, not caching request");
                    return null;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK = AFh1xSDK.CACHE;
                StringBuilder sb = new StringBuilder("caching request with URL: ");
                sb.append(aFb1iSDK.AFAdRevenueData);
                aFLogger.i(aFh1xSDK, sb.toString());
                String l = Long.toString(System.currentTimeMillis());
                File file2 = new File(new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache"), l);
                file2.createNewFile();
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFb1iSDK.getMediationNetwork);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFb1iSDK.AFAdRevenueData);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFb1iSDK.getCurrencyIso4217Code(), 2));
                    outputStreamWriter.write(10);
                    AFf1wSDK aFf1wSDK = aFb1iSDK.getRevenue;
                    if (aFf1wSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFf1wSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    AFLogger.INSTANCE.i(AFh1xSDK.CACHE, "done, cacheKey: ".concat(String.valueOf(l)));
                    try {
                        outputStreamWriter.close();
                        return l;
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e);
                        return l;
                    }
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                sentryFileWriter = "AFRequestCache";
                if (sentryFileWriter != 0) {
                    try {
                        sentryFileWriter.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            outputStreamWriter = null;
        } catch (Throwable th2) {
            th = th2;
            if (sentryFileWriter != 0) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final List<AFb1iSDK> AFAdRevenueData() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFh1xSDK aFh1xSDK = AFh1xSDK.CACHE;
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    aFLogger.i(aFh1xSDK, sb.toString());
                    arrayList.add(getRevenue(file2));
                }
            }
            return arrayList;
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e);
            return arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFb1iSDK getRevenue(File file) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1iSDK aFb1iSDK = new AFb1iSDK(cArr);
                    aFb1iSDK.getMonetizationNetwork = file.getName();
                    try {
                        inputStreamReader.close();
                        return aFb1iSDK;
                    } catch (IOException e) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e);
                        return aFb1iSDK;
                    }
                } catch (Exception e2) {
                    e = e2;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e3) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e3);
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e4) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e4);
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStreamReader2 != null) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final boolean getRevenue(String str) {
        File file = new File(new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFh1xSDK aFh1xSDK = AFh1xSDK.CACHE;
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        aFLogger.i(aFh1xSDK, sb.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("CACHE: Could not delete ");
            sb2.append(str);
            sb2.append(" from cache");
            AFLogger.afErrorLog(sb2.toString(), e);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final void getCurrencyIso4217Code() {
        try {
            File file = new File(this.getMonetizationNetwork.getCurrencyIso4217Code.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK = AFh1xSDK.CACHE;
                StringBuilder sb = new StringBuilder("Found cached request");
                sb.append(file2.getName());
                aFLogger.i(aFh1xSDK, sb.toString());
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                AFh1xSDK aFh1xSDK2 = AFh1xSDK.CACHE;
                StringBuilder sb2 = new StringBuilder("Deleting ");
                sb2.append(file2.getName());
                sb2.append(" from cache");
                aFLogger2.i(aFh1xSDK2, sb2.toString());
                file2.delete();
            }
        } catch (Exception e) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e);
        }
    }
}

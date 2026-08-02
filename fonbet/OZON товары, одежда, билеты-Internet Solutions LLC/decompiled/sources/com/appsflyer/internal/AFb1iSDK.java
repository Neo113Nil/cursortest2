package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PipedWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class AFb1iSDK implements AFb1vSDK {
    private final AFd1kSDK AFKeystoreWrapper;

    public AFb1iSDK(AFd1kSDK aFd1kSDK) {
        this.AFKeystoreWrapper = aFd1kSDK;
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final boolean AFInAppEventParameterName(String str) {
        File file = new File(new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache"), str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1gSDK aFg1gSDK = AFg1gSDK.CACHE;
        StringBuilder sb2 = new StringBuilder("Deleting ");
        sb2.append(str);
        sb2.append(" from cache");
        aFLogger.i(aFg1gSDK, sb2.toString());
        if (!file.exists()) {
            return true;
        }
        try {
            return file.delete();
        } catch (Exception e11) {
            StringBuilder sb3 = new StringBuilder("CACHE: Could not delete ");
            sb3.append(str);
            sb3.append(" from cache");
            AFLogger.afErrorLog(sb3.toString(), e11);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    @NonNull
    public final List<AFb1qSDK> AFInAppEventType() {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    AFg1gSDK aFg1gSDK = AFg1gSDK.CACHE;
                    StringBuilder sb2 = new StringBuilder("Found cached request");
                    sb2.append(file2.getName());
                    aFLogger.i(aFg1gSDK, sb2.toString());
                    arrayList.add(AFInAppEventType(file2));
                }
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("CACHE: Could not get cached requests", e11);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.appsflyer.internal.AFb1vSDK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String AFKeystoreWrapper(AFb1qSDK aFb1qSDK) {
        OutputStreamWriter outputStreamWriter;
        PipedWriter pipedWriter = 0;
        try {
            try {
                File file = new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache");
                if (!file.exists()) {
                    file.mkdir();
                    return null;
                }
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 40) {
                    AFLogger.INSTANCE.i(AFg1gSDK.CACHE, "reached cache limit, not caching request");
                    return null;
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1gSDK aFg1gSDK = AFg1gSDK.CACHE;
                StringBuilder sb2 = new StringBuilder("caching request with URL: ");
                sb2.append(aFb1qSDK.AFInAppEventType);
                aFLogger.i(aFg1gSDK, sb2.toString());
                String l11 = Long.toString(System.currentTimeMillis());
                File file2 = new File(new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache"), l11);
                file2.createNewFile();
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2.getPath(), true), Charset.defaultCharset());
                try {
                    outputStreamWriter.write("version=");
                    outputStreamWriter.write(aFb1qSDK.AFKeystoreWrapper);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("url=");
                    outputStreamWriter.write(aFb1qSDK.AFInAppEventType);
                    outputStreamWriter.write(10);
                    outputStreamWriter.write("data=");
                    outputStreamWriter.write(Base64.encodeToString(aFb1qSDK.AFInAppEventParameterName(), 2));
                    outputStreamWriter.write(10);
                    AFf1zSDK aFf1zSDK = aFb1qSDK.values;
                    if (aFf1zSDK != null) {
                        outputStreamWriter.write("type=");
                        outputStreamWriter.write(aFf1zSDK.name());
                        outputStreamWriter.write(10);
                    }
                    outputStreamWriter.flush();
                    aFLogger.i(aFg1gSDK, "done, cacheKey: ".concat(String.valueOf(l11)));
                    try {
                        outputStreamWriter.close();
                        return l11;
                    } catch (IOException e11) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e11);
                        return l11;
                    }
                } catch (Exception e12) {
                    e = e12;
                    AFLogger.afErrorLog("CACHE: Could not cache request", e);
                    if (outputStreamWriter != null) {
                        try {
                            outputStreamWriter.close();
                        } catch (IOException e13) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e13);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                pipedWriter = "AFRequestCache";
                if (pipedWriter != 0) {
                    try {
                        pipedWriter.close();
                    } catch (IOException e14) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close cache writer", e14);
                    }
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            outputStreamWriter = null;
        } catch (Throwable th3) {
            th = th3;
            if (pipedWriter != 0) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final void values() {
        try {
            if (new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache").exists()) {
                return;
            }
            new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache").mkdir();
        } catch (Exception e11) {
            AFLogger.afErrorLog("CACHE: Could not create cache directory", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AFb1qSDK AFInAppEventType(File file) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                try {
                    char[] cArr = new char[(int) file.length()];
                    inputStreamReader.read(cArr);
                    AFb1qSDK aFb1qSDK = new AFb1qSDK(cArr);
                    aFb1qSDK.AFInAppEventParameterName = file.getName();
                    try {
                        inputStreamReader.close();
                        return aFb1qSDK;
                    } catch (IOException e11) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e11);
                        return aFb1qSDK;
                    }
                } catch (Exception e12) {
                    e = e12;
                    AFLogger.afErrorLogForExcManagerOnly("error while loading request from cache", e);
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (IOException e13) {
                            AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e13);
                        }
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader2 = inputStreamReader;
                if (inputStreamReader2 != null) {
                    try {
                        inputStreamReader2.close();
                    } catch (IOException e14) {
                        AFLogger.afErrorLogForExcManagerOnly("could not close load reader", e14);
                    }
                }
                throw th;
            }
        } catch (Exception e15) {
            e = e15;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
            if (inputStreamReader2 != null) {
            }
            throw th;
        }
    }

    @Override // com.appsflyer.internal.AFb1vSDK
    public final void AFKeystoreWrapper() {
        try {
            File file = new File(this.AFKeystoreWrapper.valueOf.getFilesDir(), "AFRequestCache");
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
                AFg1gSDK aFg1gSDK = AFg1gSDK.CACHE;
                StringBuilder sb2 = new StringBuilder("Found cached request");
                sb2.append(file2.getName());
                aFLogger.i(aFg1gSDK, sb2.toString());
                StringBuilder sb3 = new StringBuilder("Deleting ");
                sb3.append(file2.getName());
                sb3.append(" from cache");
                aFLogger.i(aFg1gSDK, sb3.toString());
                file2.delete();
            }
        } catch (Exception e11) {
            AFLogger.afErrorLog("CACHE: Could not cache request", e11);
        }
    }
}

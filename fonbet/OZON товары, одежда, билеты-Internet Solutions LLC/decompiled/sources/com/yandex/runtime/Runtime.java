package com.yandex.runtime;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import g.C6594f;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class Runtime extends RuntimeBase {
    private static final String TAG = "com.yandex.runtime.Runtime";
    private static Context applicationContext;

    public static Context getApplicationContext() {
        Context context = applicationContext;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("init has not been called");
    }

    public static void init(Context context, String str) {
        if (context == null) {
            throw new RuntimeException("null context passed to init");
        }
        if (!isMainProcess(context)) {
            throw new RuntimeException("Runtime could be initialized from the application's main process");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new RuntimeException("Runtime could only be initialized from ui thread");
        }
        if (applicationContext == null) {
            Context applicationContext2 = context.getApplicationContext();
            applicationContext = applicationContext2;
            try {
                String string = applicationContext.getPackageManager().getApplicationInfo(applicationContext2.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData.getString("yandex.maps.runtime.stl.linkage");
                if (string != null && string.equals("dynamic")) {
                    loadLibrary("c++_shared");
                }
                loadLibrary(str);
                initClassloader();
            } catch (PackageManager.NameNotFoundException unused) {
                throw new RuntimeException("Could not find package info");
            }
        }
        initUiThread();
    }

    private static native void initClassloader();

    private static native void initUiThread();

    public static boolean isMainProcess(Context context) {
        BufferedReader bufferedReader;
        Throwable th2;
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (Process.myPid() == runningAppProcessInfo.pid) {
                    return packageName.equals(runningAppProcessInfo.processName);
                }
            }
        }
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            } catch (Throwable th3) {
                bufferedReader = null;
                th2 = th3;
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb2.append((char) read);
                }
                if (packageName.equals(sb2.toString())) {
                    bufferedReader.close();
                    return true;
                }
                bufferedReader.close();
                return false;
            } catch (Throwable th4) {
                th2 = th4;
                if (bufferedReader == null) {
                    throw th2;
                }
                bufferedReader.close();
                throw th2;
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void loadLibrary(String str) {
        try {
            System.loadLibrary(str);
        } catch (RuntimeException e11) {
            StringBuilder b11 = C6594f.b("Couldn't load ", str, ", reason: ");
            b11.append(e11.getMessage());
            throw new UnsatisfiedLinkError(b11.toString());
        }
    }

    public static void init(Context context) {
        init(context, "maps-mobile");
    }

    public static void init(Context context, @NonNull Map<String, String> map) {
        init(context, "maps-mobile", map);
    }

    public static void init(Context context, String str, @NonNull Map<String, String> map) {
        init(context, str);
        RuntimeBase.setPreinitializationOptions(map);
    }
}

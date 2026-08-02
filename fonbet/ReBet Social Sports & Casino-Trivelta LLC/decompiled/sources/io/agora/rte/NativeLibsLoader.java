package io.agora.rte;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import io.agora.base.internal.BuildConfig;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class NativeLibsLoader {
    private static final String TAG = "NativeLibsLoader";
    public static String nativeLibraryName = "agora-rtc-sdk";
    static String nativeLibraryPrefix = "lib";
    static String nativeLibrarySurffix = ".so";
    private static int sLibLoadCount;

    private NativeLibsLoader() {
    }

    public static synchronized void deinitializeNativeLibs() {
        synchronized (NativeLibsLoader.class) {
            int i10 = sLibLoadCount;
            if (i10 > 0) {
                int i11 = i10 - 1;
                sLibLoadCount = i11;
                if (i11 < 0) {
                    sLibLoadCount = 0;
                }
            }
        }
    }

    public static String getNativeLibFullPath(String str, String str2) {
        String str3 = nativeLibraryPrefix + str2 + nativeLibrarySurffix;
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        String str4 = File.separator;
        if (str.endsWith(str4)) {
            return str + str3;
        }
        return str + str4 + str3;
    }

    public static synchronized boolean initializeNativeLibs() {
        boolean initializeNativeLibs;
        synchronized (NativeLibsLoader.class) {
            initializeNativeLibs = initializeNativeLibs(null);
        }
        return initializeNativeLibs;
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private static boolean safeLoadLibrary(String str, String str2) {
        boolean z10 = false;
        try {
            if (TextUtils.isEmpty(str)) {
                System.loadLibrary(str2);
            } else {
                System.load(getNativeLibFullPath(str, str2));
            }
            z10 = true;
        } catch (Exception | UnsatisfiedLinkError unused) {
        }
        if (!z10) {
            Log.i(TAG, "failed to load library " + str2 + " from " + str);
        }
        return z10;
    }

    public static synchronized boolean initializeNativeLibs(String str) {
        synchronized (NativeLibsLoader.class) {
            int i10 = sLibLoadCount;
            boolean z10 = true;
            if (i10 <= 0) {
                int i11 = 0;
                while (true) {
                    List<String> list = BuildConfig.so_list;
                    if (i11 < list.size()) {
                        boolean safeLoadLibrary = safeLoadLibrary(str, list.get(i11));
                        if (!safeLoadLibrary) {
                            return safeLoadLibrary;
                        }
                        i11++;
                    } else {
                        boolean safeLoadLibrary2 = safeLoadLibrary(str, nativeLibraryName);
                        if (safeLoadLibrary2) {
                            sLibLoadCount++;
                        }
                        z10 = safeLoadLibrary2;
                    }
                }
            } else {
                sLibLoadCount = i10 + 1;
            }
            return z10;
        }
    }
}

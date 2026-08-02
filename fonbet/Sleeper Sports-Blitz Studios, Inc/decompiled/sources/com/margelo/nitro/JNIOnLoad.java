package com.margelo.nitro;

import android.util.Log;

/* loaded from: classes8.dex */
public class JNIOnLoad {
    private static final String TAG = "NitroModules";
    private static boolean isInitialized = false;

    public static synchronized void initializeNativeNitro() {
        synchronized (JNIOnLoad.class) {
            if (isInitialized) {
                return;
            }
            try {
                Log.i("NitroModules", "Loading NitroModules C++ library...");
                System.loadLibrary("NitroModules");
                Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
                isInitialized = true;
            } finally {
            }
        }
    }
}

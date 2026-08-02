package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import internal.org.chromium.build.BuildConfig;
import internal.org.jni_zero.JNINamespace;
import java.io.IOException;
import java.util.Arrays;

@JNINamespace("base::android")
/* loaded from: classes10.dex */
public class ApkAssets {
    private static final String TAG = "ApkAssets";
    private static String sLastError;

    public static long[] open(String apkSubpath, String splitName) {
        String maybeAddSuffix = maybeAddSuffix(apkSubpath);
        AssetFileDescriptor assetFileDescriptor = null;
        sLastError = null;
        try {
            try {
                Context applicationContext = ContextUtils.getApplicationContext();
                if (!TextUtils.isEmpty(splitName) && BundleUtils.isIsolatedSplitInstalled(splitName)) {
                    applicationContext = BundleUtils.createIsolatedSplitContext(splitName);
                }
                assetFileDescriptor = applicationContext.getAssets().openNonAssetFd(maybeAddSuffix);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                        return jArr;
                    } catch (IOException e) {
                        Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e);
                    }
                }
                return jArr;
            } catch (Throwable th) {
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e2) {
                        Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e2);
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            sLastError = "Error while loading asset " + maybeAddSuffix + " from " + splitName + ": " + String.valueOf(e3);
            if (!TextUtils.isEmpty(e3.getMessage()) && !e3.getMessage().equals(maybeAddSuffix)) {
                Log.e(TAG, sLastError);
            }
            long[] jArr2 = {-1, -1, -1};
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e4) {
                    Log.e(TAG, "Unable to close AssetFileDescriptor", (Throwable) e4);
                }
            }
            return jArr2;
        }
    }

    private static String maybeAddSuffix(String apkSubpath) {
        if (BuildConfig.APK_ASSETS_SUFFIX == null || Arrays.binarySearch(BuildConfig.APK_ASSETS_SUFFIXED_LIST, apkSubpath) < 0) {
            return apkSubpath;
        }
        return apkSubpath + BuildConfig.APK_ASSETS_SUFFIX;
    }

    public static boolean exists(String apkSubpath) {
        try {
            AssetFileDescriptor openNonAssetFd = ContextUtils.getApplicationContext().getAssets().openNonAssetFd(maybeAddSuffix(apkSubpath));
            if (openNonAssetFd != null) {
                openNonAssetFd.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static String takeLastErrorString() {
        String str = sLastError;
        sLastError = null;
        return str;
    }
}

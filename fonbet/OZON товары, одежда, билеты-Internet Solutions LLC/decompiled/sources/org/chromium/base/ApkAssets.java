package org.chromium.base;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.text.TextUtils;
import internal.org.jni_zero.CalledByNative;
import java.io.IOException;

/* loaded from: classes10.dex */
public final class ApkAssets {

    /* renamed from: a, reason: collision with root package name */
    private static String f78449a;

    @CalledByNative
    public static long[] open(String str, String str2) {
        AssetFileDescriptor assetFileDescriptor = null;
        f78449a = null;
        try {
            try {
                Context b11 = e.b();
                if (!TextUtils.isEmpty(str2) && BundleUtils.e(str2)) {
                    b11 = BundleUtils.a(str2);
                }
                assetFileDescriptor = b11.getAssets().openNonAssetFd(str);
                long[] jArr = {assetFileDescriptor.getParcelFileDescriptor().detachFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength()};
                try {
                    assetFileDescriptor.close();
                    return jArr;
                } catch (IOException e11) {
                    j.b("ApkAssets", "Unable to close AssetFileDescriptor", e11);
                    return jArr;
                }
            } catch (IOException e12) {
                f78449a = "Error while loading asset " + str + " from " + str2 + ": " + String.valueOf(e12);
                if (!TextUtils.isEmpty(e12.getMessage()) && !e12.getMessage().equals(str)) {
                    j.a("ApkAssets", f78449a);
                }
                long[] jArr2 = {-1, -1, -1};
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (IOException e13) {
                        j.b("ApkAssets", "Unable to close AssetFileDescriptor", e13);
                    }
                }
                return jArr2;
            }
        } catch (Throwable th2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e14) {
                    j.b("ApkAssets", "Unable to close AssetFileDescriptor", e14);
                }
            }
            throw th2;
        }
    }

    @CalledByNative
    private static String takeLastErrorString() {
        String str = f78449a;
        f78449a = null;
        return str;
    }
}

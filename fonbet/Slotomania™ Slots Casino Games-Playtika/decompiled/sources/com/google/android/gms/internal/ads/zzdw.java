package com.google.android.gms.internal.ads;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.os.Build;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes5.dex */
public final class zzdw {
    public static boolean zza(Context context) throws zzdv {
        if (Build.VERSION.SDK_INT < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return zzf("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean zzb() throws zzdv {
        return zzf("EGL_KHR_surfaceless_context");
    }

    public static boolean zzc(int i) throws zzdv {
        if (i == 6) {
            return zzd();
        }
        if (i == 7) {
            return zzf("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        return true;
    }

    public static boolean zzd() throws zzdv {
        return Build.VERSION.SDK_INT >= 33 && zzf("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static void zze(boolean z, String str) throws zzdv {
        if (!z) {
            throw new zzdv(str, zzgvz.zzi());
        }
    }

    private static boolean zzf(String str) throws zzdv {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        zze(!eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        zze(EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        String hexString = Integer.toHexString(eglGetError);
        String.valueOf(hexString);
        throw new zzdv("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(hexString)), zzgvz.zzj(Integer.valueOf(eglGetError)));
    }
}

package com.google.android.gms.internal.ads;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import defpackage.mio;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzdy {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        mio mioVar = zzgxm.b;
        throw new zzdx(str, s.e);
    }

    public static boolean b(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            return eglQueryString != null && eglQueryString.contains(str);
        }
        throw new zzdx("Error in getDefaultEglDisplay, error code: 0x".concat(String.valueOf(Integer.toHexString(eglGetError))), zzgxm.t(Integer.valueOf(eglGetError)));
    }
}

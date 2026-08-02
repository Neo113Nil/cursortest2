package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import com.appsflyer.sdk_base.referrer.Payload;
import defpackage.lik;
import defpackage.qx9;
import defpackage.tf5;
import defpackage.yhe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class PlaceholderSurface extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final yhe b;
    public boolean c;

    public PlaceholderSurface(yhe yheVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = yheVar;
        this.a = z;
    }

    public static int a(Context context) {
        String eglQueryString;
        String eglQueryString2;
        int i = lik.a;
        if (i >= 24 && ((i >= 26 || !(Payload.SOURCE_SAMSUNG.equals(lik.c) || "XT1650".equals(lik.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!e) {
                    d = a(context);
                    e = true;
                }
                z = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static PlaceholderSurface c(Context context, boolean z) {
        int i = 0;
        qx9.t(!z || b(context));
        yhe yheVar = new yhe("ExoPlayer:PlaceholderSurface", i);
        int i2 = z ? d : 0;
        yheVar.start();
        Handler handler = new Handler(yheVar.getLooper(), yheVar);
        yheVar.b = handler;
        yheVar.e = new tf5(handler, 0);
        synchronized (yheVar) {
            yheVar.b.obtainMessage(1, i2, 0).sendToTarget();
            while (((PlaceholderSurface) yheVar.f) == null && yheVar.d == null && yheVar.c == null) {
                try {
                    yheVar.wait();
                } catch (InterruptedException unused) {
                    i = 1;
                }
            }
        }
        if (i != 0) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = yheVar.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = yheVar.c;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = (PlaceholderSurface) yheVar.f;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    yhe yheVar = this.b;
                    yheVar.b.getClass();
                    yheVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import defpackage.yhe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzadp extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final yhe b;
    public boolean c;

    public /* synthetic */ zzadp(yhe yheVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = yheVar;
        this.a = z;
    }

    public static synchronized boolean a() {
        int i;
        int i2;
        synchronized (zzadp.class) {
            try {
                if (!e) {
                    try {
                    } catch (zzdx e2) {
                        zzeh.e("Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
                    }
                    if (zzdy.b("EGL_EXT_protected_content")) {
                        i = zzdy.b("EGL_KHR_surfaceless_context") ? 1 : 2;
                        d = i;
                        e = true;
                    }
                    i = 0;
                    d = i;
                    e = true;
                }
                i2 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i2 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        yhe yheVar = this.b;
        synchronized (yheVar) {
            try {
                if (!this.c) {
                    Handler handler = yheVar.b;
                    handler.getClass();
                    handler.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import defpackage.iy8;
import defpackage.tgj;
import defpackage.xw3;
import defpackage.yhe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
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

    public static synchronized boolean a() {
        int i;
        boolean z;
        synchronized (PlaceholderSurface.class) {
            try {
                if (!e) {
                    try {
                    } catch (iy8 e2) {
                        tgj.z("Failed to determine secure mode due to GL error: " + e2.getMessage());
                    }
                    if (xw3.H("EGL_EXT_protected_content")) {
                        i = xw3.H("EGL_KHR_surfaceless_context") ? 1 : 2;
                        d = i;
                        e = true;
                    }
                    i = 0;
                    d = i;
                    e = true;
                }
                z = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
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

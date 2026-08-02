package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mg6 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ vg6 a;

    public mg6(vg6 vg6Var) {
        this.a = vg6Var;
    }

    public final void a(sii siiVar) {
        tf6 tf6Var = new tf6(2, siiVar, 1003);
        int i = vg6.r0;
        this.a.e0(tf6Var);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3 = vg6.r0;
        Surface surface = new Surface(surfaceTexture);
        vg6 vg6Var = this.a;
        vg6Var.c0(surface);
        vg6Var.U = surface;
        vg6Var.X(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        int i = vg6.r0;
        vg6 vg6Var = this.a;
        vg6Var.c0(null);
        vg6Var.X(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3 = vg6.r0;
        this.a.X(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        int i4 = vg6.r0;
        this.a.X(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        vg6 vg6Var = this.a;
        if (vg6Var.X) {
            vg6Var.c0(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        vg6 vg6Var = this.a;
        if (vg6Var.X) {
            vg6Var.c0(null);
        }
        vg6Var.X(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

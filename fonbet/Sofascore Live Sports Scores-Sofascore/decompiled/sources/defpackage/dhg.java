package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.Surface;
import android.view.TextureView;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class dhg implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ fhg a;

    public dhg(fhg fhgVar) {
        this.a = fhgVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
        fhg fhgVar = this.a;
        TextureView textureView = fhgVar.d;
        SurfaceTexture surfaceTexture2 = fhgVar.e;
        if (surfaceTexture2 != null && !fhgVar.g) {
            if (Intrinsics.c(textureView.getSurfaceTexture(), surfaceTexture2)) {
                return;
            }
            textureView.setSurfaceTexture(surfaceTexture2);
        } else {
            fhgVar.e = surfaceTexture;
            ((vg6) fhgVar.b).d0(new Surface(surfaceTexture));
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceTexture.getClass();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        fhg fhgVar = this.a;
        mqi mqiVar = fhgVar.p;
        mqi mqiVar2 = fhgVar.l;
        fhgVar.h = System.currentTimeMillis();
        if (fhgVar.c.e == null || fhgVar.b() <= 0 || fhgVar.a() <= 0) {
            return;
        }
        fhgVar.d.getBitmap((Bitmap) mqiVar2.getValue());
        Object value = fhgVar.o.getValue();
        value.getClass();
        ((Allocation) value).syncAll(1);
        Object value2 = fhgVar.q.getValue();
        value2.getClass();
        Object value3 = mqiVar.getValue();
        value3.getClass();
        ((ScriptIntrinsicBlur) value2).forEach((Allocation) value3);
        Object value4 = mqiVar.getValue();
        value4.getClass();
        ((Allocation) value4).copyTo((Bitmap) mqiVar2.getValue());
        fhgVar.f.invalidate();
    }
}

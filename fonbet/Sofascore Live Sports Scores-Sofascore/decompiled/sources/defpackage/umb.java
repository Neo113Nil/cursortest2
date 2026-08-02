package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class umb implements r2c {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public umb(MediaCodec mediaCodec, umb umbVar) {
        this.a = 1;
        this.b = mediaCodec;
        this.c = umbVar;
        if (Build.VERSION.SDK_INT < 35 || umbVar == null) {
            return;
        }
        umbVar.a(mediaCodec);
    }

    @Override // defpackage.r2c
    public void C(ArrayList arrayList) {
        ((MediaCodec) this.b).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.r2c
    public void D(ArrayList arrayList) {
        ((MediaCodec) this.b).unsubscribeFromVendorParameters(arrayList);
    }

    public void a(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            z1a.E(((HashSet) this.b).add(mediaCodec));
        }
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // defpackage.r2c
    public void c(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override // defpackage.r2c
    public void d(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.r2c
    public MediaFormat e() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.r2c
    public void f(int i, d74 d74Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, d74Var.i, j, i2);
    }

    @Override // defpackage.r2c
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    public void g(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController create = LoudnessCodecController.create(i, f35.a, new tmb(this));
        this.c = create;
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!create.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // defpackage.r2c
    public ByteBuffer h(int i) {
        return ((MediaCodec) this.b).getInputBuffer(i);
    }

    @Override // defpackage.r2c
    public void i(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.r2c
    public void l(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.r2c
    public int m() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.r2c
    public int n(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.r2c
    public ByteBuffer o(int i) {
        return ((MediaCodec) this.b).getOutputBuffer(i);
    }

    @Override // defpackage.r2c
    public final void release() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((HashSet) obj).clear();
                LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
                if (loudnessCodecController != null) {
                    loudnessCodecController.close();
                    return;
                }
                return;
            default:
                umb umbVar = (umb) this.c;
                MediaCodec mediaCodec = (MediaCodec) obj;
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                    }
                    if (i2 >= 35 && umbVar != null) {
                        umbVar.b(mediaCodec);
                    }
                    mediaCodec.release();
                    return;
                } catch (Throwable th) {
                    if (Build.VERSION.SDK_INT >= 35 && umbVar != null) {
                        umbVar.b(mediaCodec);
                    }
                    mediaCodec.release();
                    throw th;
                }
        }
    }

    @Override // defpackage.r2c
    public void s(z3c z3cVar, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new dl0(this, z3cVar, 1), handler);
    }

    @Override // defpackage.r2c
    public void setVideoScalingMode(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.r2c
    public void t() {
        ((MediaCodec) this.b).detachOutputSurface();
    }

    @Override // defpackage.r2c
    public void x(int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, false);
    }

    public umb() {
        this.a = 0;
        this.b = new HashSet();
    }
}

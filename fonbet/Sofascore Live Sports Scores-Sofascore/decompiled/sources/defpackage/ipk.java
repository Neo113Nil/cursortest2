package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ipk extends GLSurfaceView implements lpk {
    public static final /* synthetic */ int b = 0;
    public final hpk a;

    public ipk(Context context) {
        super(context, null);
        hpk hpkVar = new hpk(this);
        this.a = hpkVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(hpkVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(jpk jpkVar) {
        hpk hpkVar = this.a;
        if (hpkVar.f.getAndSet(jpkVar) == null) {
            hpkVar.a.requestRender();
        } else {
            pvd.j();
        }
    }

    @Deprecated
    public lpk getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}

package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class vrg implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vrg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((wrg) obj).a.set(true);
                break;
            default:
                ((xrg) obj).a.set(true);
                break;
        }
    }
}

package defpackage;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class txe {
    public SurfaceSyncGroup a;

    public final /* synthetic */ void a(SurfaceView surfaceView, yp8 yp8Var) {
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        this.a = surfaceSyncGroup;
        z1a.E(surfaceSyncGroup.add(rootSurfaceControl, new x(22)));
        yp8Var.run();
        rootSurfaceControl.applyTransactionOnDraw(by1.f());
    }

    public final void b() {
        SurfaceSyncGroup surfaceSyncGroup = this.a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.a = null;
        }
    }
}

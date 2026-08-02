package defpackage;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zwe extends hoi implements Function2 {
    public final /* synthetic */ SurfaceView r;
    public final /* synthetic */ e1d s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwe(SurfaceView surfaceView, e1d e1dVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = surfaceView;
        this.s = e1dVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new zwe(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zwe) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        SurfaceView surfaceView = this.r;
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl != null) {
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            if (!surfaceSyncGroup.add(rootSurfaceControl, new x(22))) {
                a70.r("Failed to add rootSurfaceControl to SurfaceSyncGroup");
                return null;
            }
            this.s.setValue(surfaceSyncGroup);
            surfaceView.invalidate();
            rootSurfaceControl.applyTransactionOnDraw(by1.f());
        }
        return Unit.a;
    }
}

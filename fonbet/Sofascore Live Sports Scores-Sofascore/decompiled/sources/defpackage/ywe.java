package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ywe extends SurfaceView {
    public final /* synthetic */ e1d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywe(Context context, e1d e1dVar) {
        super(context);
        this.a = e1dVar;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34) {
            e1d e1dVar = this.a;
            SurfaceSyncGroup surfaceSyncGroup = (SurfaceSyncGroup) e1dVar.getValue();
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
            }
            e1dVar.setValue(null);
        }
    }
}

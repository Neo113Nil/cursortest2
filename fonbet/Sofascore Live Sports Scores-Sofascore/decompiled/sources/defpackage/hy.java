package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class hy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy b;

    public /* synthetic */ hy(xy xyVar, int i) {
        this.a = i;
        this.b = xyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xy xyVar = this.b;
        switch (i) {
            case 0:
                vg0 vg0Var = xyVar.i;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!vg0Var.isEmpty()) {
                    try {
                        ((Function0) vg0Var.removeLast()).invoke();
                    } finally {
                        Trace.endSection();
                    }
                }
                Unit unit = Unit.a;
                return;
            case 1:
                xyVar.E0 = false;
                MotionEvent motionEvent = xyVar.w0;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    xyVar.M(motionEvent);
                    return;
                } else {
                    a70.r("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                xy.r(xyVar.getRoot());
                return;
            default:
                xy.r(xyVar.getRoot());
                return;
        }
    }
}

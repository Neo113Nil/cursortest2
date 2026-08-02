package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class v40 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rsk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v40(rsk rskVar, int i) {
        super(1);
        this.i = i;
        this.j = rskVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.i;
        rsk rskVar = this.j;
        switch (i) {
            case 0:
                ryd rydVar = (ryd) obj;
                xy xyVar = rydVar instanceof xy ? (xy) rydVar : null;
                if (xyVar != null) {
                    xyVar.getAndroidViewsHandler$ui().removeViewInLayout(rskVar);
                    i5k.c(xyVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(xyVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(rskVar));
                    rskVar.setImportantForAccessibility(0);
                }
                rskVar.removeAllViewsInLayout();
                return Unit.a;
            case 1:
                rskVar.q = (Function1) obj;
                return Unit.a;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        dispatchTouchEvent = rskVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = rskVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}

package defpackage;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class sze extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ tze j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sze(tze tzeVar, int i) {
        super(1);
        this.i = i;
        this.j = tzeVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        tze tzeVar = this.j;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Function1 function1 = tzeVar.a;
                if (function1 != null) {
                    function1.invoke(motionEvent);
                    return Unit.a;
                }
                Intrinsics.i("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                Function1 function12 = tzeVar.a;
                if (function12 != null) {
                    function12.invoke(motionEvent2);
                    return Unit.a;
                }
                Intrinsics.i("onTouchEvent");
                throw null;
        }
    }
}

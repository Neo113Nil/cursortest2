package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cz extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ dz j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz(dz dzVar, int i) {
        super(1);
        this.i = i;
        this.j = dzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        dz dzVar = this.j;
        switch (i) {
            case 0:
                View view = dzVar.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                nug nugVar = (nug) obj;
                if (nugVar.b.contains(nugVar)) {
                    uyd snapshotObserver = dzVar.d.getSnapshotObserver();
                    snapshotObserver.a.i(nugVar, dzVar.M, new y1(4, nugVar, dzVar));
                }
                return Unit.a;
        }
    }
}

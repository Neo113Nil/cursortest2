package defpackage;

import android.view.WindowInsets;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class u40 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rsk j;
    public final /* synthetic */ wma k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u40(rsk rskVar, wma wmaVar, int i) {
        super(1);
        this.i = i;
        this.j = rskVar;
        this.k = wmaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        WindowInsets g;
        int i = this.i;
        wma wmaVar = this.k;
        rsk rskVar = this.j;
        switch (i) {
            case 0:
                ryd rydVar = (ryd) obj;
                xy xyVar = rydVar instanceof xy ? (xy) rydVar : null;
                if (xyVar != null) {
                    xyVar.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(rskVar, wmaVar);
                    xyVar.getAndroidViewsHandler$ui().addView(rskVar);
                    xyVar.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(wmaVar, rskVar);
                    rskVar.setImportantForAccessibility(1);
                    bsk.q(rskVar, new my(xyVar, wmaVar, xyVar));
                }
                if (rskVar.getView().getParent() != rskVar) {
                    rskVar.addView(rskVar.getView());
                }
                break;
            case 1:
                xw3.M(rskVar, wmaVar);
                break;
            default:
                xw3.M(rskVar, wmaVar);
                ((xy) rskVar.c).H = true;
                int[] iArr = rskVar.n;
                int i2 = iArr[0];
                int i3 = iArr[1];
                rskVar.getView().getLocationOnScreen(iArr);
                long j = rskVar.o;
                long e = ((dma) obj).e();
                rskVar.o = e;
                x9l x9lVar = rskVar.p;
                if (x9lVar != null && ((i2 != iArr[0] || i3 != iArr[1] || !c7a.a(j, e)) && (g = rskVar.l(x9lVar).g()) != null)) {
                    rskVar.getView().dispatchApplyWindowInsets(g);
                }
                break;
        }
        return Unit.a;
    }
}

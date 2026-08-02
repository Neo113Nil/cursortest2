package defpackage;

import com.blaze.blazesdk.features.moments.widgets.compose.BlazeComposeWidgetMomentsStateHandler;
import com.blaze.blazesdk.features.moments.widgets.compose.grid.BlazeComposeMomentsWidgetGridViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nx1 implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BlazeComposeWidgetMomentsStateHandler b;
    public final /* synthetic */ xtc c;
    public final /* synthetic */ int d;

    public /* synthetic */ nx1(xtc xtcVar, BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, int i) {
        this.c = xtcVar;
        this.b = blazeComposeWidgetMomentsStateHandler;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        Integer num = (Integer) obj2;
        switch (this.a) {
            case 0:
                num.intValue();
                BlazeComposeMomentsWidgetGridViewKt.BlazeComposeMomentsWidgetGridView(this.c, this.b, of3Var, aba.K(this.d | 1));
                break;
            default:
                num.getClass();
                s9a.l(this.c, this.b, of3Var, aba.K(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ nx1(BlazeComposeWidgetMomentsStateHandler blazeComposeWidgetMomentsStateHandler, xtc xtcVar, int i) {
        this.b = blazeComposeWidgetMomentsStateHandler;
        this.c = xtcVar;
        this.d = i;
    }
}

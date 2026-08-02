package defpackage;

import com.blaze.blazesdk.features.videos.widgets.compose.BlazeComposeWidgetVideosStateHandler;
import com.blaze.blazesdk.features.videos.widgets.compose.row.BlazeComposeVideosWidgetRowViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class flm implements Function2 {
    public final /* synthetic */ BlazeComposeWidgetVideosStateHandler a;

    public flm(BlazeComposeWidgetVideosStateHandler blazeComposeWidgetVideosStateHandler) {
        this.a = blazeComposeWidgetVideosStateHandler;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        of3 of3Var = (of3) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            av8 av8Var = (av8) of3Var;
            if (av8Var.D()) {
                av8Var.W();
                return Unit.a;
            }
        }
        BlazeComposeVideosWidgetRowViewKt.BlazeComposeVideosWidgetRowView(bkh.e(bkh.d(utc.a, 1.0f), 180.0f), this.a, true, of3Var, 390, 0);
        return Unit.a;
    }
}

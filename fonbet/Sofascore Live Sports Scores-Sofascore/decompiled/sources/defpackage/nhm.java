package defpackage;

import com.blaze.blazesdk.features.stories.widgets.compose.BlazeComposeWidgetStoriesStateHandler;
import com.blaze.blazesdk.features.stories.widgets.compose.row.BlazeComposeStoriesWidgetRowViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nhm implements Function2 {
    public final /* synthetic */ BlazeComposeWidgetStoriesStateHandler a;

    public nhm(BlazeComposeWidgetStoriesStateHandler blazeComposeWidgetStoriesStateHandler) {
        this.a = blazeComposeWidgetStoriesStateHandler;
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
        BlazeComposeStoriesWidgetRowViewKt.BlazeComposeStoriesWidgetRowView(bkh.e(bkh.d(utc.a, 1.0f), 140.0f), this.a, true, of3Var, 390, 0);
        return Unit.a;
    }
}

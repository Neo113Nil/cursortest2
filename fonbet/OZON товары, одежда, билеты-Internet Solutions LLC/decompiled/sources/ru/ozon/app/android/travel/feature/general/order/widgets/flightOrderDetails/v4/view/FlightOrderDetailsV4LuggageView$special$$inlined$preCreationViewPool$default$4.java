package ru.ozon.app.android.travel.feature.general.order.widgets.flightOrderDetails.v4.view;

import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "T", "", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$4 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    final /* synthetic */ FlightOrderDetailsV4LuggageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlightOrderDetailsV4LuggageView$special$$inlined$preCreationViewPool$default$4(FlightOrderDetailsV4LuggageView flightOrderDetailsV4LuggageView) {
        super(1);
        this.this$0 = flightOrderDetailsV4LuggageView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke(textAtomV2View);
        return Unit.f71690a;
    }

    public final void invoke(TextAtomV2View PreCreationViewPoolDelegate) {
        int i11;
        Intrinsics.checkNotNullParameter(PreCreationViewPoolDelegate, "$this$PreCreationViewPoolDelegate");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        i11 = this.this$0.dp4;
        layoutParams.setMarginStart(i11);
        layoutParams.weight = 1.0f;
        PreCreationViewPoolDelegate.setLayoutParams(layoutParams);
    }
}

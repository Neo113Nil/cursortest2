package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetTravelAddNewPassengerFormClearButtonBinding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "isVisible", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Boolean;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormClearButtonWidgetViewHolder$observeLiveData$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ TravelAddNewPassengerFormClearButtonWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormClearButtonWidgetViewHolder$observeLiveData$1(TravelAddNewPassengerFormClearButtonWidgetViewHolder travelAddNewPassengerFormClearButtonWidgetViewHolder) {
        super(1);
        this.this$0 = travelAddNewPassengerFormClearButtonWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke2(bool);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Boolean bool) {
        WidgetTravelAddNewPassengerFormClearButtonBinding widgetTravelAddNewPassengerFormClearButtonBinding;
        widgetTravelAddNewPassengerFormClearButtonBinding = this.this$0.binding;
        SmallBorderlessButtonView clearButtonSbbv = widgetTravelAddNewPassengerFormClearButtonBinding.clearButtonSbbv;
        Intrinsics.checkNotNullExpressionValue(clearButtonSbbv, "clearButtonSbbv");
        clearButtonSbbv.setVisibility(bool.booleanValue() ? 0 : 8);
    }
}

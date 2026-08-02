package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation;

import Tl.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.databinding.WidgetPassengersDirectoryV2Binding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PassengersDirectoryV2WidgetViewHolder$actionHandler$2 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ PassengersDirectoryV2WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PassengersDirectoryV2WidgetViewHolder$actionHandler$2(PassengersDirectoryV2WidgetViewHolder passengersDirectoryV2WidgetViewHolder) {
        super(1);
        this.this$0 = passengersDirectoryV2WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click click) {
        WidgetPassengersDirectoryV2Binding widgetPassengersDirectoryV2Binding;
        if (b.i(click, "action", "clearSearch")) {
            widgetPassengersDirectoryV2Binding = this.this$0.binding;
            widgetPassengersDirectoryV2Binding.searchInputCTIV.updateValue("");
        }
    }
}

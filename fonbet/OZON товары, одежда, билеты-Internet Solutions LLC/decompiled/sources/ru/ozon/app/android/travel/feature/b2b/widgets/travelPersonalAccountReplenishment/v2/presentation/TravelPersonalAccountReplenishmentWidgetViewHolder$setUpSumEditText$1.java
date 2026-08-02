package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "letterCount", "", "start", "stop", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentWidgetViewHolder$setUpSumEditText$1 extends AbstractC7737t implements InterfaceC6511n<Integer, Integer, Integer, Unit> {
    final /* synthetic */ TravelPersonalAccountReplenishmentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentWidgetViewHolder$setUpSumEditText$1(TravelPersonalAccountReplenishmentWidgetViewHolder travelPersonalAccountReplenishmentWidgetViewHolder) {
        super(3);
        this.this$0 = travelPersonalAccountReplenishmentWidgetViewHolder;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
        invoke(num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(int i11, int i12, int i13) {
        TravelPersonalAccountReplenishmentViewModel travelPersonalAccountReplenishmentViewModel;
        travelPersonalAccountReplenishmentViewModel = this.this$0.viewModel;
        travelPersonalAccountReplenishmentViewModel.fitSelectionExcludingSuffix(i11, i12, i13);
    }
}

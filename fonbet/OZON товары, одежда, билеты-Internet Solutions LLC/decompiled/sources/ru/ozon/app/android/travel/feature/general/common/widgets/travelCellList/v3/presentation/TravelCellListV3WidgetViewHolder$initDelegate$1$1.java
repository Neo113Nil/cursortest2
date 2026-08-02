package ru.ozon.app.android.travel.feature.general.common.widgets.travelCellList.v3.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelCellListV3WidgetViewHolder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ TravelCellListV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelCellListV3WidgetViewHolder$initDelegate$1$1(TravelCellListV3WidgetViewHolder travelCellListV3WidgetViewHolder) {
        super(1);
        this.this$0 = travelCellListV3WidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r2 = r1.this$0.onBoardingDelegate;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z11) {
        TravelCellListV3ViewModel travelCellListV3ViewModel;
        OnBoardingDelegate onBoardingDelegate;
        travelCellListV3ViewModel = this.this$0.travelCellListV3ViewModel;
        travelCellListV3ViewModel.onOnboardingShown(z11);
        if (!z11 || onBoardingDelegate == null) {
            return;
        }
        onBoardingDelegate.unbind();
    }
}

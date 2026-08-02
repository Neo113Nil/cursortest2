package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "isDismissed", "", "isHidden", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RateItemsV2WidgetHolder$onTimerFinish$1 extends AbstractC7737t implements Function2<Boolean, Boolean, Unit> {
    final /* synthetic */ RateItemsV2WidgetHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RateItemsV2WidgetHolder$onTimerFinish$1(RateItemsV2WidgetHolder rateItemsV2WidgetHolder) {
        super(2);
        this.this$0 = rateItemsV2WidgetHolder;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
        invoke(bool.booleanValue(), bool2.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, boolean z12) {
        RateItemsV2View rateItemsV2View;
        String asyncData;
        RateItemsV2ViewModel rateItemsV2ViewModel;
        if (z11 || !z12) {
            rateItemsV2View = this.this$0.rateItemsV2View;
            if (rateItemsV2View != null) {
                rateItemsV2View.dismiss();
                return;
            }
            return;
        }
        RateItemsV2WrapperVO boundData = this.this$0.getBoundData();
        if (boundData == null || (asyncData = boundData.getAsyncData()) == null) {
            return;
        }
        rateItemsV2ViewModel = this.this$0.viewModel;
        rateItemsV2ViewModel.fetch(asyncData);
    }
}

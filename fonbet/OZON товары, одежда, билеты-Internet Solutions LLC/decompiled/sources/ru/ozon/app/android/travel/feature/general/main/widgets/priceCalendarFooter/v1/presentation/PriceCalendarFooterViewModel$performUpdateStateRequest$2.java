package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewModel;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "response", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterViewModel$performUpdateStateRequest$2 extends AbstractC7737t implements Function1<PriceCalendarFooterVO, Unit> {
    final /* synthetic */ PriceCalendarFooterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterViewModel$performUpdateStateRequest$2(PriceCalendarFooterViewModel priceCalendarFooterViewModel) {
        super(1);
        this.this$0 = priceCalendarFooterViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceCalendarFooterVO priceCalendarFooterVO) {
        invoke2(priceCalendarFooterVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PriceCalendarFooterVO priceCalendarFooterVO) {
        SingleLiveEvent singleLiveEvent;
        PriceCalendarFooterVO priceCalendarFooterVO2;
        this.this$0.lastVo = priceCalendarFooterVO;
        singleLiveEvent = this.this$0.updateVoLiveData;
        priceCalendarFooterVO2 = this.this$0.lastVo;
        if (priceCalendarFooterVO2 != null) {
            singleLiveEvent.setValue(new PriceCalendarFooterViewModel.UpdateVoResult(priceCalendarFooterVO2, PriceCalendarFooterViewModel.UpdateState.SUCCESS));
        } else {
            Intrinsics.n("lastVo");
            throw null;
        }
    }
}

package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "newFooterState", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateVoResult;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateVoResult;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class PriceCalendarFooterWidgetViewHolder$observeAction$2 extends AbstractC7737t implements Function1<PriceCalendarFooterViewModel.UpdateVoResult, Unit> {
    final /* synthetic */ PriceCalendarFooterWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceCalendarFooterWidgetViewHolder$observeAction$2(PriceCalendarFooterWidgetViewHolder priceCalendarFooterWidgetViewHolder) {
        super(1);
        this.this$0 = priceCalendarFooterWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PriceCalendarFooterViewModel.UpdateVoResult updateVoResult) {
        invoke2(updateVoResult);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PriceCalendarFooterViewModel.UpdateVoResult updateVoResult) {
        i iVar;
        i iVar2;
        if (updateVoResult.getState() == PriceCalendarFooterViewModel.UpdateState.SUCCESS) {
            this.this$0.bindUI(updateVoResult.getVo());
            return;
        }
        if (updateVoResult.getState() == PriceCalendarFooterViewModel.UpdateState.ERROR) {
            iVar = this.this$0.container;
            ViewGroup rootView = ContextExtKt.getRootView(iVar.K().b());
            if (rootView != null) {
                PriceCalendarFooterWidgetViewHolder priceCalendarFooterWidgetViewHolder = this.this$0;
                FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
                iVar2 = priceCalendarFooterWidgetViewHolder.container;
                FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, iVar2.K().f(), 62, null).show();
            }
        }
    }
}

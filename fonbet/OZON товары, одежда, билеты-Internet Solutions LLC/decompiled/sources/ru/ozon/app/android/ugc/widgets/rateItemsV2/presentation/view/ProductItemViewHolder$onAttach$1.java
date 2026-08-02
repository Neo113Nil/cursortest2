package ru.ozon.app.android.ugc.widgets.rateItemsV2.presentation.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.timerMolecule.presentation.TimerTickData;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "timerTickData", "Lru/ozon/app/android/timerMolecule/presentation/TimerTickData;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProductItemViewHolder$onAttach$1 extends AbstractC7737t implements Function1<TimerTickData, Unit> {
    final /* synthetic */ ProductItemViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProductItemViewHolder$onAttach$1(ProductItemViewHolder productItemViewHolder) {
        super(1);
        this.this$0 = productItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TimerTickData timerTickData) {
        invoke2(timerTickData);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TimerTickData timerTickData) {
        TimerTickData.TimerTextType timerTextType;
        TimerTickData.TimerTextType timerTextType2;
        Intrinsics.checkNotNullParameter(timerTickData, "timerTickData");
        timerTextType = this.this$0.lastTimerType;
        if (timerTextType != timerTickData.getType()) {
            timerTextType2 = this.this$0.lastTimerType;
            if (timerTextType2 != null) {
                this.this$0.scheduleHideTitleVisibility();
            }
        }
        this.this$0.lastTimerType = timerTickData.getType();
    }
}

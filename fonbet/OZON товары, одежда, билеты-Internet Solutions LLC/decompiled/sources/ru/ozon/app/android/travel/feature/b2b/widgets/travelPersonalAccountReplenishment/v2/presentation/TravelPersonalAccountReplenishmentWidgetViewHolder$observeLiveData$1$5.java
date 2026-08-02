package ru.ozon.app.android.travel.feature.b2b.widgets.travelPersonalAccountReplenishment.v2.presentation;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.b2b.databinding.WidgetPersonalAccountReplenishmentBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004 \u0005*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$5 extends AbstractC7737t implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
    final /* synthetic */ TravelPersonalAccountReplenishmentWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPersonalAccountReplenishmentWidgetViewHolder$observeLiveData$1$5(TravelPersonalAccountReplenishmentWidgetViewHolder travelPersonalAccountReplenishmentWidgetViewHolder) {
        super(1);
        this.this$0 = travelPersonalAccountReplenishmentWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        invoke2((Pair<Integer, Integer>) pair);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Pair<Integer, Integer> pair) {
        WidgetPersonalAccountReplenishmentBinding widgetPersonalAccountReplenishmentBinding;
        widgetPersonalAccountReplenishmentBinding = this.this$0.binding;
        widgetPersonalAccountReplenishmentBinding.sumEditText.setSelection(pair.e().intValue(), pair.f().intValue());
    }
}

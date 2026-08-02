package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation;

import Sc.o;
import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookAdditions.presentation.HotelsBookAdditionsViewModel;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookAdditions/presentation/HotelsBookAdditionsViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HotelsBookAdditionsWidgetViewHolder$subscribeToLiveData$1 extends AbstractC7737t implements Function1<HotelsBookAdditionsViewModel.Action, Unit> {
    final /* synthetic */ HotelsBookAdditionsWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsBookAdditionsWidgetViewHolder$subscribeToLiveData$1(HotelsBookAdditionsWidgetViewHolder hotelsBookAdditionsWidgetViewHolder) {
        super(1);
        this.this$0 = hotelsBookAdditionsWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HotelsBookAdditionsViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HotelsBookAdditionsViewModel.Action action) {
        l lVar;
        if (action instanceof HotelsBookAdditionsViewModel.Action.UpdateFields) {
            this.this$0.sendUpdate(null, ((HotelsBookAdditionsViewModel.Action.UpdateFields) action).getFields());
            return;
        }
        if (action instanceof HotelsBookAdditionsViewModel.Action.ShowSelector) {
            HotelsBookAdditionsViewModel.Action.ShowSelector showSelector = (HotelsBookAdditionsViewModel.Action.ShowSelector) action;
            this.this$0.showSelector(showSelector.getTitle(), showSelector.getSelectorItems());
        } else if (action instanceof HotelsBookAdditionsViewModel.Action.UpdateVisibility) {
            this.this$0.sendUpdate(Boolean.valueOf(((HotelsBookAdditionsViewModel.Action.UpdateVisibility) action).getIsOpen()), null);
        } else {
            if (!(action instanceof HotelsBookAdditionsViewModel.Action.TrackEvent)) {
                throw new o();
            }
            lVar = this.this$0.tokenizedAnalytics;
            HotelsBookAdditionsViewModel.Action.TrackEvent trackEvent = (HotelsBookAdditionsViewModel.Action.TrackEvent) action;
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView(lVar, trackEvent.getTokenizedEvent(), trackEvent.getModifier());
        }
    }
}

package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "travelClassUpdate", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateSelectedTravelClass;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/UpdateSelectedTravelClass;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPassengersCountSelectorWidgetViewHolder$observeTravelClassUpdates$1 extends AbstractC7737t implements Function1<UpdateSelectedTravelClass, Unit> {
    final /* synthetic */ TravelPassengersCountSelectorWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorWidgetViewHolder$observeTravelClassUpdates$1(TravelPassengersCountSelectorWidgetViewHolder travelPassengersCountSelectorWidgetViewHolder) {
        super(1);
        this.this$0 = travelPassengersCountSelectorWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UpdateSelectedTravelClass updateSelectedTravelClass) {
        invoke2(updateSelectedTravelClass);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UpdateSelectedTravelClass updateSelectedTravelClass) {
        ComposerReferences composerReferences;
        composerReferences = this.this$0.references;
        InterfaceC7851b controller = composerReferences.getController();
        Intrinsics.f(updateSelectedTravelClass);
        controller.update(updateSelectedTravelClass);
    }
}

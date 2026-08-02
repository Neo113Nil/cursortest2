package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation;

import android.view.ViewGroup;
import i10.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersSelectorViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersSelectorViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelPassengersCountSelectorWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TravelPassengersSelectorViewModel.Action, Unit> {
    final /* synthetic */ TravelPassengersCountSelectorWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelPassengersCountSelectorWidgetViewHolder$observeAction$1(TravelPassengersCountSelectorWidgetViewHolder travelPassengersCountSelectorWidgetViewHolder) {
        super(1);
        this.this$0 = travelPassengersCountSelectorWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelPassengersSelectorViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelPassengersSelectorViewModel.Action action) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        if (action instanceof TravelPassengersSelectorViewModel.Action.ShowProgress) {
            composerReferences2 = this.this$0.references;
            composerReferences2.getController().e(new l.a.C1079a(0L, null, 3));
            return;
        }
        if (action instanceof TravelPassengersSelectorViewModel.Action.HideProgress) {
            composerReferences = this.this$0.references;
            composerReferences.getController().hideLoader();
            return;
        }
        if (action instanceof TravelPassengersSelectorViewModel.Action.DismissAndRefresh) {
            this.this$0.handleDismissAndRefreshAction((TravelPassengersSelectorViewModel.Action.DismissAndRefresh) action);
            return;
        }
        if (action instanceof TravelPassengersSelectorViewModel.Action.Error) {
            viewGroup = this.this$0.flashBarRootView;
            if (viewGroup == null) {
                return;
            }
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            viewGroup2 = this.this$0.flashBarRootView;
            FlashbarFactory.createDefaultError$default(flashbarFactory, viewGroup2, null, null, null, null, null, this.this$0, 62, null).show();
        }
    }
}

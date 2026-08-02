package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation;

import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelScrollPriceCalendar.v1.presentation.TravelScrollPriceCalendarViewModel;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelScrollPriceCalendar/v1/presentation/TravelScrollPriceCalendarViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TravelScrollPriceCalendarWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TravelScrollPriceCalendarViewModel.Action, Unit> {
    final /* synthetic */ TravelScrollPriceCalendarWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelScrollPriceCalendarWidgetViewHolder$observeAction$1(TravelScrollPriceCalendarWidgetViewHolder travelScrollPriceCalendarWidgetViewHolder) {
        super(1);
        this.this$0 = travelScrollPriceCalendarWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelScrollPriceCalendarViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelScrollPriceCalendarViewModel.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        if (!Intrinsics.d(action, TravelScrollPriceCalendarViewModel.Action.Error.INSTANCE)) {
            if (action instanceof TravelScrollPriceCalendarViewModel.Action.Success) {
                composerReferences = this.this$0.references;
                composerReferences.getController().update(new UpdateTravelScrollPriceCalendarResult(((TravelScrollPriceCalendarViewModel.Action.Success) action).getTabs()));
                return;
            }
            return;
        }
        composerReferences2 = this.this$0.references;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences2.getContainer().c());
        if (rootView != null) {
            TravelScrollPriceCalendarWidgetViewHolder travelScrollPriceCalendarWidgetViewHolder = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            composerReferences3 = travelScrollPriceCalendarWidgetViewHolder.references;
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, composerReferences3.getContainer().g(), 62, null).show();
        }
    }
}

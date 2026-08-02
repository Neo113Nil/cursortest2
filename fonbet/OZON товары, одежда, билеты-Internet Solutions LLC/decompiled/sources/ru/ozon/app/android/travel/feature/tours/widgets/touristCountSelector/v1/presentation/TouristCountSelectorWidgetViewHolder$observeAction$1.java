package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import Sc.o;
import android.content.Intent;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorViewModel;
import ru.ozon.app.android.uikit.dialog.sort.SortsBottomSheetDialog;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class TouristCountSelectorWidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TouristCountSelectorViewModel.Action, Unit> {
    final /* synthetic */ TouristCountSelectorWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TouristCountSelectorWidgetViewHolder$observeAction$1(TouristCountSelectorWidgetViewHolder touristCountSelectorWidgetViewHolder) {
        super(1);
        this.this$0 = touristCountSelectorWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TouristCountSelectorViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TouristCountSelectorViewModel.Action action) {
        ComposerReferences composerReferences;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        ComposerReferences composerReferences4;
        Function1 function1;
        if (action instanceof TouristCountSelectorViewModel.Action.HandleAction) {
            function1 = this.this$0.actionHandler;
            function1.invoke(((TouristCountSelectorViewModel.Action.HandleAction) action).getAtomAction());
            return;
        }
        if (!Intrinsics.d(action, TouristCountSelectorViewModel.Action.Error.INSTANCE)) {
            if (!(action instanceof TouristCountSelectorViewModel.Action.ShowSelector)) {
                throw new o();
            }
            SortsBottomSheetDialog newInstance$default = SortsBottomSheetDialog.Companion.newInstance$default(SortsBottomSheetDialog.INSTANCE, ((TouristCountSelectorViewModel.Action.ShowSelector) action).getItems(), new Intent(), null, 4, null);
            composerReferences = this.this$0.references;
            newInstance$default.setTargetFragment(composerReferences.getContainer().c(), 34255);
            composerReferences2 = this.this$0.references;
            newInstance$default.show(composerReferences2.getContainer().k(), "SortsBottomSheetDialog");
            return;
        }
        composerReferences3 = this.this$0.references;
        ViewGroup rootView = ContextExtKt.getRootView(composerReferences3.getContainer().c());
        if (rootView != null) {
            TouristCountSelectorWidgetViewHolder touristCountSelectorWidgetViewHolder = this.this$0;
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            composerReferences4 = touristCountSelectorWidgetViewHolder.references;
            FlashbarFactory.createDefaultError$default(flashbarFactory, rootView, null, null, null, null, null, composerReferences4.getContainer().g(), 62, null).show();
        }
    }
}

package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation;

import Sc.o;
import WZ.l;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.M;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3ViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.view.AddNewPassengerFormV3View;
import ru.ozon.app.android.travel.molecules.extensions.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.travel.molecules.fragment.dateSelector.TravelDateSelectorDialogFragment;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorBottomSheetDialog;
import ru.ozon.app.android.travel.molecules.fragment.selector.SelectorItem;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3ViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TravelAddNewPassengerFormV3WidgetViewHolder$observeAction$1 extends AbstractC7737t implements Function1<TravelAddNewPassengerFormV3ViewModel.Action, Unit> {
    final /* synthetic */ TravelAddNewPassengerFormV3WidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TravelAddNewPassengerFormV3WidgetViewHolder$observeAction$1(TravelAddNewPassengerFormV3WidgetViewHolder travelAddNewPassengerFormV3WidgetViewHolder) {
        super(1);
        this.this$0 = travelAddNewPassengerFormV3WidgetViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(TravelAddNewPassengerFormV3WidgetViewHolder travelAddNewPassengerFormV3WidgetViewHolder, ComponentCallbacksC5392m componentCallbacksC5392m, String str, Bundle bundle) {
        SelectorItem selectorItem;
        TravelAddNewPassengerFormV3ViewModel travelAddNewPassengerFormV3ViewModel;
        Object parcelable;
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable("KEY_SELECTED_ITEM", SelectorItem.class);
            selectorItem = (SelectorItem) parcelable;
        } else {
            selectorItem = (SelectorItem) bundle.getParcelable("KEY_SELECTED_ITEM");
        }
        if (selectorItem != null) {
            travelAddNewPassengerFormV3ViewModel = travelAddNewPassengerFormV3WidgetViewHolder.viewModel;
            travelAddNewPassengerFormV3ViewModel.onSelectorValueSelected(selectorItem);
        }
        componentCallbacksC5392m.getChildFragmentManager().s("SelectorBottomSheetDialog.RequestKey");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TravelAddNewPassengerFormV3ViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TravelAddNewPassengerFormV3ViewModel.Action action) {
        l lVar;
        AddNewPassengerFormV3View addNewPassengerFormV3View;
        ComposerReferences composerReferences;
        AddNewPassengerFormV3View addNewPassengerFormV3View2;
        ComposerReferences composerReferences2;
        ComposerReferences composerReferences3;
        Function1 function1;
        if (action instanceof TravelAddNewPassengerFormV3ViewModel.Action.HandleAction) {
            function1 = this.this$0.processedActionHandler;
            function1.invoke(((TravelAddNewPassengerFormV3ViewModel.Action.HandleAction) action).getAtomAction());
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV3ViewModel.Action.ShowSelector) {
            composerReferences3 = this.this$0.references;
            final ComponentCallbacksC5392m j11 = composerReferences3.getContainer().j();
            final TravelAddNewPassengerFormV3WidgetViewHolder travelAddNewPassengerFormV3WidgetViewHolder = this.this$0;
            j11.getChildFragmentManager().n1("SelectorBottomSheetDialog.RequestKey", travelAddNewPassengerFormV3WidgetViewHolder, new M() { // from class: ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.a
                @Override // androidx.fragment.app.M
                public final void f(Bundle bundle, String str) {
                    TravelAddNewPassengerFormV3WidgetViewHolder$observeAction$1.invoke$lambda$1$lambda$0(TravelAddNewPassengerFormV3WidgetViewHolder.this, j11, str, bundle);
                }
            });
            TravelAddNewPassengerFormV3ViewModel.Action.ShowSelector showSelector = (TravelAddNewPassengerFormV3ViewModel.Action.ShowSelector) action;
            SelectorBottomSheetDialog.INSTANCE.newInstance(showSelector.getSelectorTitle(), showSelector.getItems()).show(j11.getChildFragmentManager(), "SelectorBottomSheetDialog");
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV3ViewModel.Action.ShowDateSelector) {
            TravelAddNewPassengerFormV3ViewModel.Action.ShowDateSelector showDateSelector = (TravelAddNewPassengerFormV3ViewModel.Action.ShowDateSelector) action;
            TravelDateSelectorDialogFragment newInstance = TravelDateSelectorDialogFragment.INSTANCE.newInstance(showDateSelector.getSelectorTitle(), showDateSelector.getSelectedDay(), showDateSelector.getSelectedMonth(), showDateSelector.getSelectedYear(), showDateSelector.getStartDateMillis(), showDateSelector.getEndDateMillis(), true);
            composerReferences2 = this.this$0.references;
            newInstance.show(composerReferences2.getContainer().k(), "TravelDateSelectorDialogFragment");
            return;
        }
        if (action instanceof TravelAddNewPassengerFormV3ViewModel.Action.SubmitInputItems) {
            addNewPassengerFormV3View2 = this.this$0.containerView;
            addNewPassengerFormV3View2.setInputsList(((TravelAddNewPassengerFormV3ViewModel.Action.SubmitInputItems) action).getInputItems());
            return;
        }
        if (!(action instanceof TravelAddNewPassengerFormV3ViewModel.Action.NotifyInputChanged)) {
            if (!(action instanceof TravelAddNewPassengerFormV3ViewModel.Action.SendAnalytics)) {
                throw new o();
            }
            lVar = this.this$0.tokenizedAnalytics;
            TokenizedAnalyticsExtensionsKt.processEventsWithFilterNonView$default(lVar, ((TravelAddNewPassengerFormV3ViewModel.Action.SendAnalytics) action).getEvent(), null, 2, null);
            return;
        }
        addNewPassengerFormV3View = this.this$0.containerView;
        TravelAddNewPassengerFormV3ViewModel.Action.NotifyInputChanged notifyInputChanged = (TravelAddNewPassengerFormV3ViewModel.Action.NotifyInputChanged) action;
        addNewPassengerFormV3View.changeInput(notifyInputChanged.getInputPosition(), notifyInputChanged.getPayload());
        composerReferences = this.this$0.references;
        composerReferences.getController().update(new UpdateIsInputV2ChangedByClient(notifyInputChanged.getInputItems()));
    }
}

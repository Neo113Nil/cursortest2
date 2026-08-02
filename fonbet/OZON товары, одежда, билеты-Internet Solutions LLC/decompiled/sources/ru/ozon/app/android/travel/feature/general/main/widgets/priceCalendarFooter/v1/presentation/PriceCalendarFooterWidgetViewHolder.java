package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import Vg.d;
import W10.c;
import WZ.t;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.travel.calendar.viewModel.CalendarViewModel;
import ru.ozon.app.android.travel.feature.general.main.databinding.WidgetPriceCalendarFooterBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J'\u0010 \u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00120(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "calendarViewModel", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel;", "footerViewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel;LVg/d;Ld20/e;)V", "item", "", "bindUI", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;)V", "Landroidx/lifecycle/J;", "lifecycleOwner", "observeAction", "(Landroidx/lifecycle/J;)V", "onWidgetCreated", "()V", "bind", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/travel/calendar/viewModel/CalendarViewModel;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel;", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetPriceCalendarFooterBinding;", "binding", "Lru/ozon/app/android/travel/feature/general/main/databinding/WidgetPriceCalendarFooterBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterWidgetViewHolder extends AbstractC6064a<PriceCalendarFooterVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private WidgetPriceCalendarFooterBinding binding;

    @NotNull
    private final CalendarViewModel calendarViewModel;

    @NotNull
    private final i container;

    @NotNull
    private final PriceCalendarFooterViewModel footerViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceCalendarFooterWidgetViewHolder(@NotNull i container, @NotNull CalendarViewModel calendarViewModel, @NotNull PriceCalendarFooterViewModel footerViewModel, @NotNull d customActionHandlersStoreFactory, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(calendarViewModel, "calendarViewModel");
        Intrinsics.checkNotNullParameter(footerViewModel, "footerViewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.calendarViewModel = calendarViewModel;
        this.footerViewModel = footerViewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new PriceCalendarFooterWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new PriceCalendarFooterWidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUI(PriceCalendarFooterVO item) {
        WidgetPriceCalendarFooterBinding widgetPriceCalendarFooterBinding = this.binding;
        if (widgetPriceCalendarFooterBinding != null) {
            TextAtomView priceCalendarFooterInformerTAV = widgetPriceCalendarFooterBinding.priceCalendarFooterInformerTAV;
            Intrinsics.checkNotNullExpressionValue(priceCalendarFooterInformerTAV, "priceCalendarFooterInformerTAV");
            TextAtomHolderKt.bindOrGone(priceCalendarFooterInformerTAV, item.getInformer(), this.actionHandler);
            if (item.getToggles() != null) {
                VerticalRecyclerContainer priceCalendarFooterTogglesVRC = widgetPriceCalendarFooterBinding.priceCalendarFooterTogglesVRC;
                Intrinsics.checkNotNullExpressionValue(priceCalendarFooterTogglesVRC, "priceCalendarFooterTogglesVRC");
                priceCalendarFooterTogglesVRC.setVisibility(0);
                widgetPriceCalendarFooterBinding.priceCalendarFooterTogglesVRC.bind(item.getToggles());
            } else {
                VerticalRecyclerContainer priceCalendarFooterTogglesVRC2 = widgetPriceCalendarFooterBinding.priceCalendarFooterTogglesVRC;
                Intrinsics.checkNotNullExpressionValue(priceCalendarFooterTogglesVRC2, "priceCalendarFooterTogglesVRC");
                priceCalendarFooterTogglesVRC2.setVisibility(8);
            }
            SmallIconButtonView priceCalendarFooterResetSIBV = widgetPriceCalendarFooterBinding.priceCalendarFooterResetSIBV;
            Intrinsics.checkNotNullExpressionValue(priceCalendarFooterResetSIBV, "priceCalendarFooterResetSIBV");
            WrappedIconButtonHolderKt.bindOrGone(priceCalendarFooterResetSIBV, item.getResetButton(), this.actionHandler);
            LargeButtonView priceCalendarFooterConfirmLBV = widgetPriceCalendarFooterBinding.priceCalendarFooterConfirmLBV;
            Intrinsics.checkNotNullExpressionValue(priceCalendarFooterConfirmLBV, "priceCalendarFooterConfirmLBV");
            LargeButtonHolderKt.bindOrGone(priceCalendarFooterConfirmLBV, item.getConfirmButton(), this.actionHandler);
        }
    }

    private final void observeAction(J lifecycleOwner) {
        this.calendarViewModel.calendarLiveData().observe(lifecycleOwner, new PriceCalendarFooterWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PriceCalendarFooterWidgetViewHolder$observeAction$1(this)));
        this.footerViewModel.updateVoLiveData().observe(lifecycleOwner, new PriceCalendarFooterWidgetViewHolderKt$sam$androidx_lifecycle_Observer$0(new PriceCalendarFooterWidgetViewHolder$observeAction$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        VerticalRecyclerContainer verticalRecyclerContainer;
        WidgetPriceCalendarFooterBinding bind = WidgetPriceCalendarFooterBinding.bind(getView());
        this.binding = bind;
        if (bind != null && (verticalRecyclerContainer = bind.priceCalendarFooterTogglesVRC) != null) {
            verticalRecyclerContainer.setOnAction(this.actionHandler);
        }
        observeAction(this);
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull PriceCalendarFooterVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.footerViewModel.initWith(item);
        bindUI(item);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull PriceCalendarFooterVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}

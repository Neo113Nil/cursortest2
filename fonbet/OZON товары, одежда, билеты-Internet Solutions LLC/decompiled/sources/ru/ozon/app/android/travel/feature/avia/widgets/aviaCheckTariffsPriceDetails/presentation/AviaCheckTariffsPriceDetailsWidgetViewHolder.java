package ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.presentation;

import Ae.C2399j;
import Ae.C2406m0;
import Ae.C2408n0;
import M4.c;
import Vg.d;
import WZ.t;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.K;
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
import ru.ozon.app.android.travel.feature.avia.shared.buttonSwitcher.ButtonWithInformationSwitcherViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001e\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00110\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "buttonSwitcherViewModel", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;", "viewModel", "<init>", "(Ld20/e;LVg/d;Ll10/i;Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;)V", "", "observeButtonSwitcherState", "()V", "observeWidgetState", "item", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onWidgetCreated", "Ll10/i;", "Lru/ozon/app/android/travel/feature/avia/shared/buttonSwitcher/ButtonWithInformationSwitcherViewModel;", "Lru/ozon/app/android/travel/feature/avia/widgets/aviaCheckTariffsPriceDetails/presentation/AviaCheckTariffsPriceDetailsViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AviaCheckTariffsPriceDetailsWidgetViewHolder extends AbstractC6064a<AviaCheckTariffsPriceDetailsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ButtonWithInformationSwitcherViewModel buttonSwitcherViewModel;

    @NotNull
    private final i container;

    @NotNull
    private final AviaCheckTariffsPriceDetailsViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AviaCheckTariffsPriceDetailsWidgetViewHolder(@NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull ButtonWithInformationSwitcherViewModel buttonSwitcherViewModel, @NotNull AviaCheckTariffsPriceDetailsViewModel viewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(buttonSwitcherViewModel, "buttonSwitcherViewModel");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.buttonSwitcherViewModel = buttonSwitcherViewModel;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new AviaCheckTariffsPriceDetailsWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
    }

    private final void observeButtonSwitcherState() {
        C2399j.C(new C2408n0(this.buttonSwitcherViewModel.getSwitcherState(), new AviaCheckTariffsPriceDetailsWidgetViewHolder$observeButtonSwitcherState$1(this, null)), K.a(this));
    }

    private final void observeWidgetState() {
        C2399j.C(new C2408n0(new C2406m0(this.viewModel.getState()), new AviaCheckTariffsPriceDetailsWidgetViewHolder$observeWidgetState$1(this, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        ComponentCallbacksC5392m b11 = this.container.K().b();
        if (b11 != null) {
            AviaCheckTariffsPriceDetailsViewModel aviaCheckTariffsPriceDetailsViewModel = this.viewModel;
            c savedStateRegistry = b11.getSavedStateRegistry();
            Intrinsics.checkNotNullExpressionValue(savedStateRegistry, "<get-savedStateRegistry>(...)");
            aviaCheckTariffsPriceDetailsViewModel.init(savedStateRegistry);
        }
        observeWidgetState();
        observeButtonSwitcherState();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull AviaCheckTariffsPriceDetailsVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.bind(item);
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull AviaCheckTariffsPriceDetailsVO item, @NotNull W10.c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        super.trackView((AviaCheckTariffsPriceDetailsWidgetViewHolder) item, trackingData, viewedPond);
        t viewTracking = item.getViewTracking();
        if (viewTracking != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), viewTracking, null, 2, null);
        }
    }
}

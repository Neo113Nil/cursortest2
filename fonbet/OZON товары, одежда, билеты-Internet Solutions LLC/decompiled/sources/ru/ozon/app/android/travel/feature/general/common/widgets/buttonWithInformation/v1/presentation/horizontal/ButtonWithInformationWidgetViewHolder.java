package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.horizontal;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2395h;
import Vg.d;
import W10.c;
import WZ.t;
import android.view.View;
import android.widget.LinearLayout;
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
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.presentation.view.ButtonWithInformationView;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.ButtonWithInformationVO;
import ru.ozon.app.android.travel.molecules.viewModel.ButtonWithInformationIsVisibleViewModel;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00110 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/horizontal/ButtonWithInformationWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;", "Ll10/i;", "container", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "viewModel", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "<init>", "(Ll10/i;Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;LVg/d;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Ld20/e;)V", "", "observeWidgetVisibility", "()V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/v1/presentation/ButtonWithInformationVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll10/i;", "Lru/ozon/app/android/travel/molecules/viewModel/ButtonWithInformationIsVisibleViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/presentation/view/ButtonWithInformationView;", "getWidgetView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWithInformation/presentation/view/ButtonWithInformationView;", "widgetView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWithInformationWidgetViewHolder extends AbstractC6064a<ButtonWithInformationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final ButtonWithInformationIsVisibleViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithInformationWidgetViewHolder(@NotNull i container, @NotNull ButtonWithInformationIsVisibleViewModel viewModel, @NotNull d customActionHandlersStoreFactory, @NotNull HandlersInhibitor handlersInhibitor, @NotNull InterfaceC6068e<LinearLayout> viewFactory) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        this.container = container;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new ButtonWithInformationWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).enableClickThrottling(handlersInhibitor).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ButtonWithInformationView getWidgetView() {
        View view = getView();
        if (view instanceof ButtonWithInformationView) {
            return (ButtonWithInformationView) view;
        }
        return null;
    }

    private final void observeWidgetVisibility() {
        this.viewModel.addObserver(this, new ButtonWithInformationWidgetViewHolder$observeWidgetVisibility$1(this));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        observeWidgetVisibility();
        InterfaceC2395h<a> eventsFlow = this.container.M().getEventsFlow();
        ButtonWithInformationIsVisibleViewModel buttonWithInformationIsVisibleViewModel = this.viewModel;
        C2399j.C(new C2408n0(eventsFlow, new ButtonWithInformationWidgetViewHolder$onWidgetCreated$$inlined$freezeVisibilityWhileLoading$1(buttonWithInformationIsVisibleViewModel, null)), K.a(this));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull ButtonWithInformationVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        ButtonWithInformationView widgetView = getWidgetView();
        if (widgetView != null) {
            widgetView.bind(item, this.actionHandler);
        }
    }

    @Override // d20.AbstractC6065b
    public void trackView(@NotNull ButtonWithInformationVO item, @NotNull c trackingData, @NotNull f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        Intrinsics.checkNotNullParameter(viewedPond, "viewedPond");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.container.X(), tokenizedEvent, null, 2, null);
        }
    }
}

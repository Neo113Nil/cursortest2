package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button;

import Vg.d;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.J;
import d20.AbstractC6064a;
import d20.InterfaceC6068e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u000f0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonWidgetViewHolder;", "Ld20/a;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;", "Ll10/i;", "container", "Ld20/e;", "Landroid/widget/LinearLayout;", "viewFactory", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "widgetViewModel", "<init>", "(Ll10/i;Ld20/e;LVg/d;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;)V", "", "observeAction", "()V", "onWidgetCreated", "item", "bind", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;)V", "onWidgetDestroyed", "Ll10/i;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/TravelRailwaySeatSelectWidgetViewModel;", "Ll10/b;", "composerController", "Ll10/b;", "Landroidx/lifecycle/J;", "viewOwner", "Landroidx/lifecycle/J;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "getContainerView", "()Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "containerView", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelRailwaySeatSelectStickyButtonWidgetViewHolder extends AbstractC6064a<TravelRailwaySeatSelectStickyButtonVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final i container;

    @NotNull
    private final J viewOwner;

    @NotNull
    private final TravelRailwaySeatSelectWidgetViewModel widgetViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelRailwaySeatSelectStickyButtonWidgetViewHolder(@NotNull i container, @NotNull InterfaceC6068e<LinearLayout> viewFactory, @NotNull d customActionHandlersStoreFactory, @NotNull TravelRailwaySeatSelectWidgetViewModel widgetViewModel) {
        super(container, viewFactory);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewFactory, "viewFactory");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(widgetViewModel, "widgetViewModel");
        this.container = container;
        this.widgetViewModel = widgetViewModel;
        this.composerController = container.M();
        this.viewOwner = container.K().f();
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onClick(new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$actionHandler$2(this)).buildHandler();
    }

    private final SingleAtom getContainerView() {
        View view = getView();
        if (view instanceof SingleAtom) {
            return (SingleAtom) view;
        }
        return null;
    }

    private final void observeAction() {
        this.widgetViewModel.getActionLiveData().observe(this, new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$observeAction$1(this)));
        this.widgetViewModel.getProgressLiveData().observe(this, new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$sam$androidx_lifecycle_Observer$0(new TravelRailwaySeatSelectStickyButtonWidgetViewHolder$observeAction$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        SingleAtom containerView = getContainerView();
        if (containerView != null) {
            containerView.setOnAction(this.actionHandler);
        }
        observeAction();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.widgetViewModel.onCleared();
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TravelRailwaySeatSelectStickyButtonVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        SingleAtom containerView = getContainerView();
        if (containerView != null) {
            SingleAtom.bind$default(containerView, item.getContinueButton(), false, 2, null);
        }
    }
}

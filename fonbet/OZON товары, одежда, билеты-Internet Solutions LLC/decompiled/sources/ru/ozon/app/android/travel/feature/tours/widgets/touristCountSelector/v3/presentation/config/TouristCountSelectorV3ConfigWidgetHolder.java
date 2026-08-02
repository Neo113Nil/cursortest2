package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.config;

import Vg.d;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.J;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ConfigVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ViewModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/config/TouristCountSelectorV3ConfigWidgetHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Ll10/i;", "container", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "viewModel", "<init>", "(LVg/d;Ll10/i;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;)V", "", "onWidgetCreated", "()V", "item", "bind", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;)V", "Ll10/i;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "Landroid/view/View;", "metricView", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "Ll10/b;", "composerController", "Ll10/b;", "Landroidx/fragment/app/m;", "composerFragment", "Landroidx/fragment/app/m;", "Landroidx/lifecycle/J;", "viewOwner", "Landroidx/lifecycle/J;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "shouldScrollToBottom", "Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3ConfigWidgetHolder extends AbstractC6065b<TouristCountSelectorV3ConfigVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final InterfaceC7851b composerController;
    private final ComponentCallbacksC5392m composerFragment;

    @NotNull
    private final i container;
    private final View metricView;
    private boolean shouldScrollToBottom;

    @NotNull
    private final TouristCountSelectorV3ViewModel viewModel;

    @NotNull
    private final J viewOwner;

    public TouristCountSelectorV3ConfigWidgetHolder(@NotNull d customActionHandlersStoreFactory, @NotNull i container, @NotNull TouristCountSelectorV3ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.container = container;
        this.viewModel = viewModel;
        this.composerController = container.M();
        this.composerFragment = container.K().b();
        this.viewOwner = container.K().f();
        this.actionHandler = new ActionHandler.Builder(container, this).onComposerAction(new TouristCountSelectorV3ConfigWidgetHolder$actionHandler$1(viewModel)).customActionHandlers(new TouristCountSelectorV3ConfigWidgetHolder$actionHandler$2(customActionHandlersStoreFactory)).buildHandler();
    }

    @Override // d20.AbstractC6065b
    public View getMetricView() {
        return this.metricView;
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        super.onWidgetCreated();
        TouristCountSelectorV3ViewModel touristCountSelectorV3ViewModel = this.viewModel;
        touristCountSelectorV3ViewModel.roomsUpdateLiveData().observe(this, new TouristCountSelectorV3ConfigWidgetHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$1(this)));
        touristCountSelectorV3ViewModel.restrictionLiveData().observe(this, new TouristCountSelectorV3ConfigWidgetHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$2(this, this)));
        touristCountSelectorV3ViewModel.actionLiveData().observe(this, new TouristCountSelectorV3ConfigWidgetHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$1$3(this)));
        this.composerController.getEvents().observe(this, new TouristCountSelectorV3ConfigWidgetHolder$sam$androidx_lifecycle_Observer$0(new TouristCountSelectorV3ConfigWidgetHolder$onWidgetCreated$2(this)));
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull TouristCountSelectorV3ConfigVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.viewModel.onBindConfig(item);
    }
}

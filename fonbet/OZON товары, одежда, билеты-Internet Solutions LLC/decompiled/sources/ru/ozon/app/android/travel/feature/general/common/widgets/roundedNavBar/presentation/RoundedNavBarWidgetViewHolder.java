package ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.presentation;

import Sc.InterfaceC4008j;
import Vg.d;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.utils.UtilsKt;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.utils.RoundedNavBarViewUtilKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.roundedNavBar.view.RoundedNavBarView;
import ru.ozon.app.android.travel.utils.fullScreenWidget.FullScreenController;
import ru.ozon.app.android.travel.utils.toolbar.ToolbarController;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0018\u0010\u000f\u001a\u00060\rj\u0002`\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00150\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0014R\u0014\u0010-\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarWidgetViewHolder;", "Ld20/b;", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarVO;", "Ll10/i;", "container", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lru/ozon/app/android/travel/utils/toolbar/ToolbarController;", "toolbarController", "Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "fullScreenController", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarPlaceholderController;", "placeholderController", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Ll10/i;Landroidx/appcompat/widget/Toolbar;Lru/ozon/app/android/travel/utils/toolbar/ToolbarController;Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarPlaceholderController;LVg/d;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView;", "createView", "()Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/view/RoundedNavBarView;", "", "onWidgetCreated", "()V", "onWidgetDestroyed", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarVO;)V", "Ll10/i;", "Landroidx/appcompat/widget/Toolbar;", "Lru/ozon/app/android/travel/utils/toolbar/ToolbarController;", "Lru/ozon/app/android/travel/utils/fullScreenWidget/FullScreenController;", "Lru/ozon/app/android/travel/feature/general/common/widgets/roundedNavBar/presentation/RoundedNavBarPlaceholderController;", "LVg/d;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "view$delegate", "LSc/j;", "getView", "view", "Landroid/widget/FrameLayout;", "getPlaceholderContainer", "()Landroid/widget/FrameLayout;", "placeholderContainer", "Landroid/view/View;", "getMetricView", "()Landroid/view/View;", "metricView", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundedNavBarWidgetViewHolder extends AbstractC6065b<RoundedNavBarVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final i container;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final FullScreenController fullScreenController;

    @NotNull
    private final RoundedNavBarPlaceholderController placeholderController;

    @NotNull
    private final Toolbar toolbar;

    @NotNull
    private final ToolbarController toolbarController;

    /* renamed from: view$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j view;

    public RoundedNavBarWidgetViewHolder(@NotNull i container, @NotNull Toolbar toolbar, @NotNull ToolbarController toolbarController, @NotNull FullScreenController fullScreenController, @NotNull RoundedNavBarPlaceholderController placeholderController, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbarController, "toolbarController");
        Intrinsics.checkNotNullParameter(fullScreenController, "fullScreenController");
        Intrinsics.checkNotNullParameter(placeholderController, "placeholderController");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.container = container;
        this.toolbar = toolbar;
        this.toolbarController = toolbarController;
        this.fullScreenController = fullScreenController;
        this.placeholderController = placeholderController;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionHandler = new ActionHandler.Builder(container, this).customActionHandlers(new RoundedNavBarWidgetViewHolder$actionHandler$1(this)).buildHandler();
        this.view = UtilsKt.unsafeLazy(new RoundedNavBarWidgetViewHolder$view$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoundedNavBarView createView() {
        Context L11 = this.container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return RoundedNavBarViewUtilKt.applyLayoutParams(new RoundedNavBarView(L11));
    }

    private final FrameLayout getPlaceholderContainer() {
        return getView().getPlaceholderContainer();
    }

    private final RoundedNavBarView getView() {
        return (RoundedNavBarView) this.view.getValue();
    }

    @Override // d20.AbstractC6065b
    @NotNull
    public View getMetricView() {
        return getView();
    }

    @Override // d20.AbstractC6065b
    public void onWidgetCreated() {
        this.toolbarController.configToolbar(this.toolbar, getView());
        this.placeholderController.setContainer(getPlaceholderContainer());
        this.fullScreenController.enableFullscreenMode(this.container.K().h(), false);
    }

    @Override // d20.AbstractC6065b
    public void onWidgetDestroyed() {
        this.toolbarController.restoreToolbar(this.toolbar);
        this.placeholderController.detachNestedViewHolders();
        this.fullScreenController.disableFullscreenMode(this.container.K().h());
    }

    @Override // d20.AbstractC6065b
    public void bind(@NotNull RoundedNavBarVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getView().bind(item, this.actionHandler);
        this.placeholderController.addNestedWidgets(getViewItem());
    }
}

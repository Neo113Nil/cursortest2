package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile;

import WZ.t;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileView;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaVO;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJO\u0010%\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0005¢\u0006\u0004\b)\u0010*R$\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R$\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010+R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R \u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u0016\u00103\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileDelegate;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarView$ActionListener;", "Lkotlin/Function1;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "sendClickAnalytics", "Lkotlin/Function0;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/FreshTileViewModel;", "viewModelProvider", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "onQuantityControlUpdate", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "newActionBar", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;", "view", "item", "updateActionBar", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "onActionIconClick", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;", "quantityControl", "onPlusClick", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State$QuantityControl;)V", "onMinusClick", "Landroidx/lifecycle/v;", "lifecycle", "Landroidx/lifecycle/B;", "lifecycleScope", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "viewProvider", "dataProvider", "onAttach", "(Landroidx/lifecycle/v;Landroidx/lifecycle/B;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "bind", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileView;)V", "onDetach", "()V", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lxe/B0;", "stateCollectionJob", "Lxe/B0;", "actionCollectionJob", "getFreshTileModel", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileModel;", "freshTileModel", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTileDelegate implements ProductActionBarView.ActionListener {
    private B0 actionCollectionJob;
    private Function1<? super AtomAction, Unit> actionHandler;
    private Function0<? extends FreshTileModel> dataProvider;
    private final Function1<FreshTileModel, Unit> onQuantityControlUpdate;

    @NotNull
    private final Function1<t, Unit> sendClickAnalytics;
    private B0 stateCollectionJob;

    @NotNull
    private final Function0<FreshTileViewModel> viewModelProvider;
    private Function0<FreshTileView> viewProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public FreshTileDelegate(@NotNull Function1<? super t, Unit> sendClickAnalytics, @NotNull Function0<FreshTileViewModel> viewModelProvider, Function1<? super FreshTileModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(sendClickAnalytics, "sendClickAnalytics");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.sendClickAnalytics = sendClickAnalytics;
        this.viewModelProvider = viewModelProvider;
        this.onQuantityControlUpdate = function1;
    }

    private final FreshTileModel getFreshTileModel() {
        Function0<? extends FreshTileModel> function0 = this.dataProvider;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    private final void updateActionBar(ProductActionBarVO newActionBar, FreshTileView view, FreshTileModel item) {
        if (view == null || item == null) {
            return;
        }
        ProductActionBarVO actionBar = item.getActionBar();
        ProductMediaVO productMedia = ((actionBar != null ? actionBar.getAdultActionIcon() : null) == null || newActionBar.getAdultActionIcon() != null) ? item.getProductMedia() : ProductMediaVO.copy$default(item.getProductMedia(), null, null, null, null, false, false, null, false, 223, null);
        FreshTileModel copy$default = FreshTileModel.DefaultImpls.copy$default(item, newActionBar, productMedia, null, null, 12, null);
        view.getActionBarView().bindOrGone(copy$default.getActionBar());
        if (!Intrinsics.d(productMedia, item.getProductMedia())) {
            view.getProductMediaView().bind(copy$default.getProductMedia());
        }
        Function1<FreshTileModel, Unit> function1 = this.onQuantityControlUpdate;
        if (function1 != null) {
            function1.invoke(copy$default);
        }
    }

    static /* synthetic */ void updateActionBar$default(FreshTileDelegate freshTileDelegate, ProductActionBarVO productActionBarVO, FreshTileView freshTileView, FreshTileModel freshTileModel, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            Function0<FreshTileView> function0 = freshTileDelegate.viewProvider;
            freshTileView = function0 != null ? function0.invoke() : null;
        }
        if ((i11 & 4) != 0) {
            freshTileModel = freshTileDelegate.getFreshTileModel();
        }
        freshTileDelegate.updateActionBar(productActionBarVO, freshTileView, freshTileModel);
    }

    public final void bind(@NotNull FreshTileModel item, @NotNull FreshTileView view) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(view, "view");
        view.bind(item, new FreshTileDelegate$bind$1(item, this));
        ProductActionBarVO actionBar = item.getActionBar();
        if (actionBar == null) {
            view.getActionBarView().bindOrGone(actionBar);
        } else {
            this.viewModelProvider.invoke().bindState(item.getId(), actionBar);
        }
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView.ActionListener
    public void onActionIconClick(@NotNull ProductActionBarVO.State item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (!(item instanceof ProductActionBarVO.State.ActionIcon)) {
            onPlusClick((ProductActionBarVO.State.QuantityControl) item);
            return;
        }
        ProductActionBarVO.State.ActionIcon actionIcon = (ProductActionBarVO.State.ActionIcon) item;
        t tokenizedEvent = actionIcon.getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.sendClickAnalytics.invoke(tokenizedEvent);
        }
        Function1<? super AtomAction, Unit> function1 = this.actionHandler;
        if (function1 != null) {
            function1.invoke(actionIcon.getAction());
        }
    }

    public final void onAttach(@NotNull AbstractC5434v lifecycle, @NotNull B lifecycleScope, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function0<FreshTileView> viewProvider, @NotNull Function0<? extends FreshTileModel> dataProvider) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(viewProvider, "viewProvider");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        this.actionHandler = actionHandler;
        this.viewProvider = viewProvider;
        this.dataProvider = dataProvider;
        FreshTileViewModel invoke = this.viewModelProvider.invoke();
        FreshTileModel freshTileModel = getFreshTileModel();
        this.stateCollectionJob = invoke.observeActionBarState(freshTileModel != null ? Long.valueOf(freshTileModel.getId()) : null, lifecycle, lifecycleScope, new FreshTileDelegate$onAttach$1(this));
        this.actionCollectionJob = this.viewModelProvider.invoke().observeAdditionalActions(lifecycle, lifecycleScope, new FreshTileDelegate$onAttach$2(actionHandler));
        viewProvider.invoke().getActionBarView().setListener(this);
    }

    public final void onDetach() {
        FreshTileView invoke;
        ProductActionBarView actionBarView;
        Function0<FreshTileView> function0 = this.viewProvider;
        if (function0 != null && (invoke = function0.invoke()) != null && (actionBarView = invoke.getActionBarView()) != null) {
            actionBarView.removeListener();
        }
        B0 b02 = this.stateCollectionJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.stateCollectionJob = null;
        B0 b03 = this.actionCollectionJob;
        if (b03 != null) {
            b03.j(null);
        }
        this.actionCollectionJob = null;
        this.actionHandler = null;
        this.viewProvider = null;
        this.dataProvider = null;
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView.ActionListener
    public void onMinusClick(@NotNull ProductActionBarVO.State.QuantityControl quantityControl) {
        ProductActionBarVO actionBar;
        Intrinsics.checkNotNullParameter(quantityControl, "quantityControl");
        FreshTileModel freshTileModel = getFreshTileModel();
        if (freshTileModel == null || (actionBar = freshTileModel.getActionBar()) == null) {
            return;
        }
        this.viewModelProvider.invoke().changeProductQuantity(freshTileModel.getId(), actionBar, quantityControl, freshTileModel.getWidgetId(), false);
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarView.ActionListener
    public void onPlusClick(@NotNull ProductActionBarVO.State.QuantityControl quantityControl) {
        ProductActionBarVO actionBar;
        Intrinsics.checkNotNullParameter(quantityControl, "quantityControl");
        FreshTileModel freshTileModel = getFreshTileModel();
        if (freshTileModel == null || (actionBar = freshTileModel.getActionBar()) == null) {
            return;
        }
        this.viewModelProvider.invoke().changeProductQuantity(freshTileModel.getId(), actionBar, quantityControl, freshTileModel.getWidgetId(), true);
    }
}

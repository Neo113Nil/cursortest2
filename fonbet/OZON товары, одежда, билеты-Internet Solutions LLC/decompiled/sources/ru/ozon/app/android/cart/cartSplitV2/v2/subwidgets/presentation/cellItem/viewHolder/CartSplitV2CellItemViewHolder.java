package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.viewHolder;

import Ae.C2399j;
import Ae.C2408n0;
import Vg.d;
import W10.c;
import WZ.l;
import WZ.t;
import WZ.x;
import aY.C4982b;
import android.content.Context;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.K;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.Paddings;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemViewModel;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.util.CollapseAnimationHelper;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.view.CartCellItemView;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.v3.holders.cell.CellHolderKt;
import ru.ozon.uni.core.UniColors;
import xe.B0;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J)\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0018\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00140%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R \u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/viewHolder/CartSplitV2CellItemViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/BaseMultiFrameBindingViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/view/CartCellItemView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/view/CartCellItemView;LWZ/l;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "", "bindCellItem", "()V", "setupTimerStateListener", "onAttach", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onViewInVisibleBounds", "onDetach", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/view/CartCellItemView;", "LWZ/l;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/util/CollapseAnimationHelper;", "animationHelper", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/util/CollapseAnimationHelper;", "Lxe/B0;", "observeTimerStateJob", "Lxe/B0;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2CellItemViewHolder extends BaseMultiFrameBindingViewHolder<CartSplitV2CellItemVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled, DefaultLifecycleObserver {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CollapseAnimationHelper animationHelper;
    private B0 observeTimerStateJob;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartCellItemView view;

    @NotNull
    private final CartSplitV2CellItemViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitV2CellItemViewHolder(@NotNull CartCellItemView view, @NotNull l tokenizedAnalytics, @NotNull CartSplitV2CellItemViewModel viewModel, @NotNull ComposerReferences composerReferences, @NotNull d customActionHandlersStoreFactory, @NotNull FrameBinder frameBinder) {
        super(view, composerReferences, frameBinder);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.viewModel = viewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new CartSplitV2CellItemViewHolder$actionHandler$1(customActionHandlersStoreFactory)).buildHandler();
        this.animationHelper = new CollapseAnimationHelper();
        this.steps = C7714v.a0(new C4982b(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindCellItem() {
        CartCellItemView cartCellItemView = this.view;
        CartSplitV2CellItemVO cartSplitV2CellItemVO = (CartSplitV2CellItemVO) getBoundData();
        if (cartSplitV2CellItemVO == null) {
            return;
        }
        setupTimerStateListener();
        this.animationHelper.resetIfNotAnimating(cartCellItemView);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = cartCellItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, cartSplitV2CellItemVO.getStrokeColor(), UniColors.BG_PREMIUM_PRIMARY.getResId());
        Context context2 = cartCellItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        CellDTO.Settings settings = cartSplitV2CellItemVO.getCell().getSettings();
        Integer parseColor2 = styleParser.parseColor(context2, settings != null ? settings.getBackgroundColor() : null);
        Paddings externalPaddings = cartSplitV2CellItemVO.getExternalPaddings();
        if (externalPaddings != null) {
            cartCellItemView.updatePadding(externalPaddings);
        }
        CellHolderKt.bind(cartCellItemView.getCellView(), cartSplitV2CellItemVO.getCell(), this.actionHandler);
        cartCellItemView.setCellViewBorderWithBackground(parseColor, parseColor2);
        this.viewModel.setupTimer(cartSplitV2CellItemVO.getHidingTimeMls(), cartSplitV2CellItemVO, this.animationHelper.getAnimationDuration());
    }

    private final void setupTimerStateListener() {
        B0 b02 = this.observeTimerStateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.observeTimerStateJob = C2399j.C(new C2408n0(this.viewModel.getTimerState(), new CartSplitV2CellItemViewHolder$setupTimerStateListener$1(this, null)), K.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(CartSplitV2CellItemViewHolder cartSplitV2CellItemViewHolder) {
        cartSplitV2CellItemViewHolder.bindCellItem();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder
    @NotNull
    public List<BindStep> getSteps() {
        return this.steps;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        setupTimerStateListener();
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder, ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        B0 b02 = this.observeTimerStateJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.observeTimerStateJob = null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        super.onViewInVisibleBounds();
        this.viewModel.startTimerIfNotStarted();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartSplitV2CellItemVO item, @NotNull c trackingData, f viewedPond) {
        CellDTO cell;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CartSplitV2CellItemViewHolder) item, trackingData, viewedPond);
        CartSplitV2CellItemVO cartSplitV2CellItemVO = (CartSplitV2CellItemVO) getBoundData();
        if (cartSplitV2CellItemVO == null || (cell = cartSplitV2CellItemVO.getCell()) == null || (common = cell.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) {
            return;
        }
        Long valueOf = Long.valueOf(item.getId());
        Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
        t b11 = x.b(trackingInfo, valueOf, null);
        if (b11 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, b11, null, 2, null);
        }
    }
}

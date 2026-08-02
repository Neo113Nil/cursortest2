package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header;

import Ae.C2408n0;
import EM.g;
import Sc.s;
import Ve.C4598rp;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import Wc.a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.HeaderVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.views.CartSplitHeaderView;
import ru.ozon.app.android.cart.common.presentation.asyncCart.AsyncCartViewModel;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileVO;
import ru.ozon.app.android.product.tiles.skuGrid2.BackgroundDrawBySkuGrid2DecoratorDisabled;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 A2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001ABG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J#\u0010'\u001a\u0004\u0018\u00010!*\u0004\u0018\u00010!2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010)H\u0002¢\u0006\u0004\b+\u0010,J)\u00102\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00104R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00106R \u00109\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u0016078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderWidgetViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/BaseMultiFrameBindingViewHolder;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderVO;", "Lru/ozon/app/android/product/tiles/skuGrid2/BackgroundDrawBySkuGrid2DecoratorDisabled;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/CartSplitHeaderView;", "view", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventsController", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "asyncCartViewModel", "<init>", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/CartSplitHeaderView;LWZ/l;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;)V", "", "bindHeader", "()V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "rightBadgeDTO", "bindRightBadgeOrGone", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "additionalAction", "bindAdditionalActionOrGone", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "clickDelivery", "bindClickDelivery", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;)V", "", "isProcessing", "disableOnAsyncUpdate", "(Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;Ljava/lang/Boolean;)Lru/ozon/app/android/fresh/common/widgets/molecules/cartClickTile/presentation/CartClickTileVO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "iconButton", "bindRemoveSplitIconButtonOrGone", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/views/CartSplitHeaderView;", "LWZ/l;", "Lru/ozon/app/android/cart/common/presentation/asyncCart/AsyncCartViewModel;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2HeaderWidgetViewHolder extends BaseMultiFrameBindingViewHolder<CartSplitV2HeaderVO> implements BackgroundDrawBySkuGrid2DecoratorDisabled {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AsyncCartViewModel asyncCartViewModel;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CartSplitHeaderView view;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final String[] miniApps = {"category", "highlight", "seller"};
    private static final int DP_8 = ResourceExtKt.toPx(8);
    private static final int DP_16 = ResourceExtKt.toPx(16);
    private static final int DP_20 = ResourceExtKt.toPx(20);

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "isProcessing", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderWidgetViewHolder$1", f = "CartSplitV2HeaderWidgetViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.CartSplitV2HeaderWidgetViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Boolean, d<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = CartSplitV2HeaderWidgetViewHolder.this.new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            HeaderVO header;
            CartClickTileVO disableOnAsyncUpdate;
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            boolean z11 = this.Z$0;
            CartSplitV2HeaderVO cartSplitV2HeaderVO = (CartSplitV2HeaderVO) CartSplitV2HeaderWidgetViewHolder.this.getBoundData();
            if (cartSplitV2HeaderVO != null && (header = cartSplitV2HeaderVO.getHeader()) != null) {
                CartSplitV2HeaderWidgetViewHolder cartSplitV2HeaderWidgetViewHolder = CartSplitV2HeaderWidgetViewHolder.this;
                IconButtonV3DTO removeSplitIconButton = header.getRemoveSplitIconButton();
                if (removeSplitIconButton != null) {
                    cartSplitV2HeaderWidgetViewHolder.bindRemoveSplitIconButtonOrGone(removeSplitIconButton);
                }
                CartClickTileVO clickDelivery = header.getClickDelivery();
                if (clickDelivery != null && (disableOnAsyncUpdate = cartSplitV2HeaderWidgetViewHolder.disableOnAsyncUpdate(clickDelivery, Boolean.valueOf(z11))) != null) {
                    cartSplitV2HeaderWidgetViewHolder.bindClickDelivery(disableOnAsyncUpdate);
                }
            }
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/CartSplitV2HeaderWidgetViewHolder$Companion;", "", "<init>", "()V", "", "", "miniApps", "[Ljava/lang/String;", "getMiniApps", "()[Ljava/lang/String;", "FRESH_MINIAPP", "Ljava/lang/String;", "FRESH_MINIAPP_HIGHLIGHT", "SELLER_MINIAPP", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String[] getMiniApps() {
            return CartSplitV2HeaderWidgetViewHolder.miniApps;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartSplitV2HeaderWidgetViewHolder(@NotNull CartSplitHeaderView view, @NotNull l tokenizedAnalytics, @NotNull ComposerReferences composerReferences, @NotNull Vg.d customActionHandlersStoreFactory, @NotNull CartEventsController cartEventsController, @NotNull FrameBinder frameBinder, @NotNull AsyncCartViewModel asyncCartViewModel) {
        super(view, composerReferences, frameBinder);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cartEventsController, "cartEventsController");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        Intrinsics.checkNotNullParameter(asyncCartViewModel, "asyncCartViewModel");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.asyncCartViewModel = asyncCartViewModel;
        this.actionHandler = new ActionHandler.Builder(composerReferences, this).customActionHandlers(new CartSplitV2HeaderWidgetViewHolder$actionHandler$1(customActionHandlersStoreFactory)).onPreProcess(new CartSplitV2HeaderWidgetViewHolder$actionHandler$2(cartEventsController)).buildHandler();
        this.steps = C7714v.a0(new g(this, 3));
        C4598rp.f(composerReferences, new C2408n0(asyncCartViewModel.isProcessing(), new AnonymousClass1(null)));
    }

    private final void bindAdditionalActionOrGone(HeaderVO.AdditionalAction additionalAction) {
        CartSplitHeaderView cartSplitHeaderView = this.view;
        if (additionalAction == null) {
            ViewExtKt.gone(cartSplitHeaderView.getAdditionalActionBtn());
            return;
        }
        ViewExtKt.show(cartSplitHeaderView.getAdditionalActionBtn());
        WrappedBorderlessButtonHolderKt.bind(cartSplitHeaderView.getAdditionalActionBtn(), additionalAction.getButton(), this.actionHandler);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = cartSplitHeaderView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, additionalAction.getTintColor());
        if (parseColor != null) {
            cartSplitHeaderView.getAdditionalActionBtn().setTextColor(parseColor.intValue());
        }
        TextAtomV2View titleSA = cartSplitHeaderView.getTitleSA();
        ViewGroup.LayoutParams layoutParams = titleSA.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = DP_16;
        bVar.f41657u = cartSplitHeaderView.getAdditionalActionBtn().getId();
        titleSA.setLayoutParams(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindClickDelivery(CartClickTileVO clickDelivery) {
        CartSplitHeaderView cartSplitHeaderView = this.view;
        if (clickDelivery == null) {
            ViewExtKt.gone(cartSplitHeaderView.getDeliveryClickMoleculeView());
        } else {
            ViewExtKt.show(cartSplitHeaderView.getDeliveryClickMoleculeView());
            cartSplitHeaderView.getDeliveryClickMoleculeView().bind(clickDelivery, this.actionHandler, new CartSplitV2HeaderWidgetViewHolder$bindClickDelivery$1$1$1(this.tokenizedAnalytics));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindHeader() {
        HeaderVO header;
        CartSplitV2HeaderVO cartSplitV2HeaderVO = (CartSplitV2HeaderVO) getBoundData();
        if (cartSplitV2HeaderVO == null || (header = cartSplitV2HeaderVO.getHeader()) == null) {
            return;
        }
        CartSplitHeaderView cartSplitHeaderView = this.view;
        TextHolderKt.bindOrGone$default(cartSplitHeaderView.getTitleSA(), header.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(cartSplitHeaderView.getSubtitleSA(), header.getSubtitle(), null, 2, null);
        bindAdditionalActionOrGone(header.getAdditionalAction());
        bindRemoveSplitIconButtonOrGone(header.getRemoveSplitIconButton());
        bindRightBadgeOrGone(header.getRightBadge());
        ViewExtKt.show(cartSplitHeaderView);
        ViewExtKt.updatePadding$default(cartSplitHeaderView, 0, 0, 0, header.getRemoveSplitIconButton() != null ? DP_8 : 0, 7, null);
        cartSplitHeaderView.getThermometerMoleculeView().bindOrGone(header.getThermometerMolecule(), this.actionHandler);
        bindClickDelivery(disableOnAsyncUpdate$default(this, header.getClickDelivery(), null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindRemoveSplitIconButtonOrGone(IconButtonV3DTO iconButton) {
        IconButtonV3DTO iconButtonV3DTO;
        CartSplitHeaderView cartSplitHeaderView = this.view;
        if (iconButton == null || (iconButtonV3DTO = IconButtonV3DTO.copy$default(iconButton, null, null, null, null, this.asyncCartViewModel.isProcessing().getValue(), null, null, null, null, null, null, null, null, null, 16367, null)) == null) {
            iconButtonV3DTO = iconButton;
        }
        if (iconButtonV3DTO == null) {
            ViewExtKt.gone(cartSplitHeaderView.getRemoveSplitIconBtn());
            return;
        }
        ViewExtKt.show(cartSplitHeaderView.getRemoveSplitIconBtn());
        IconButtonV3HolderKt.bind(cartSplitHeaderView.getRemoveSplitIconBtn(), iconButtonV3DTO, this.actionHandler);
        TextAtomV2View titleSA = cartSplitHeaderView.getTitleSA();
        ViewGroup.LayoutParams layoutParams = titleSA.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = DP_20;
        bVar.f41657u = cartSplitHeaderView.getRemoveSplitIconBtn().getId();
        titleSA.setLayoutParams(bVar);
    }

    private final void bindRightBadgeOrGone(BadgeDTO rightBadgeDTO) {
        BadgeHolderKt.bindOrGone(this.view.getRightBadge(), rightBadgeDTO, this.actionHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CartClickTileVO disableOnAsyncUpdate(CartClickTileVO cartClickTileVO, Boolean bool) {
        ToggleDTO toggleDTO;
        CellDTO.RightBlock rightBlock;
        AtomDTO control;
        CellDTO.RightBlock rightBlock2 = null;
        if (cartClickTileVO == null) {
            this.view.getDeliveryClickLockerView().setVisibility(8);
            return null;
        }
        boolean booleanValue = bool != null ? bool.booleanValue() : this.asyncCartViewModel.isProcessing().getValue().booleanValue();
        this.view.getDeliveryClickLockerView().setVisibility(booleanValue ? 0 : 8);
        if (!booleanValue) {
            return cartClickTileVO;
        }
        CellDTO.RightBlock rightBlock3 = cartClickTileVO.getCell().getRightBlock();
        if (rightBlock3 != null) {
            AtomDTO control2 = rightBlock3.getControl();
            ToggleDTO toggleDTO2 = control2 instanceof ToggleDTO ? (ToggleDTO) control2 : null;
            if (toggleDTO2 != null) {
                toggleDTO = ToggleDTO.copy$default(toggleDTO2, null, Boolean.FALSE, null, null, null, null, 61, null);
                rightBlock = cartClickTileVO.getCell().getRightBlock();
                if (rightBlock != null) {
                    if (toggleDTO != null) {
                        control = toggleDTO;
                    } else {
                        CellDTO.RightBlock rightBlock4 = cartClickTileVO.getCell().getRightBlock();
                        control = rightBlock4 != null ? rightBlock4.getControl() : null;
                    }
                    rightBlock2 = CellDTO.RightBlock.copy$default(rightBlock, null, null, null, null, null, null, null, null, null, null, control, null, 3071, null);
                }
                return CartClickTileVO.copy$default(cartClickTileVO, null, CellDTO.copy$default(cartClickTileVO.getCell(), null, null, null, rightBlock2, null, 23, null), null, null, null, null, null, 125, null);
            }
        }
        toggleDTO = null;
        rightBlock = cartClickTileVO.getCell().getRightBlock();
        if (rightBlock != null) {
        }
        return CartClickTileVO.copy$default(cartClickTileVO, null, CellDTO.copy$default(cartClickTileVO.getCell(), null, null, null, rightBlock2, null, 23, null), null, null, null, null, null, 125, null);
    }

    static /* synthetic */ CartClickTileVO disableOnAsyncUpdate$default(CartSplitV2HeaderWidgetViewHolder cartSplitV2HeaderWidgetViewHolder, CartClickTileVO cartClickTileVO, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = null;
        }
        return cartSplitV2HeaderWidgetViewHolder.disableOnAsyncUpdate(cartClickTileVO, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit steps$lambda$0(CartSplitV2HeaderWidgetViewHolder cartSplitV2HeaderWidgetViewHolder) {
        cartSplitV2HeaderWidgetViewHolder.bindHeader();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.BaseMultiFrameBindingViewHolder
    @NotNull
    public List<BindStep> getSteps() {
        return this.steps;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull CartSplitV2HeaderVO item, @NotNull c trackingData, f viewedPond) {
        HeaderVO header;
        t tokenizedEvent;
        t tokenizedEvent2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CartSplitV2HeaderWidgetViewHolder) item, trackingData, viewedPond);
        CartSplitV2HeaderVO cartSplitV2HeaderVO = (CartSplitV2HeaderVO) getBoundData();
        if (cartSplitV2HeaderVO == null || (header = cartSplitV2HeaderVO.getHeader()) == null) {
            return;
        }
        CartClickTileVO clickDelivery = header.getClickDelivery();
        if (clickDelivery != null && (tokenizedEvent2 = clickDelivery.getTokenizedEvent()) != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent2, null);
        }
        ThermometerMoleculeVO thermometerMolecule = header.getThermometerMolecule();
        if (thermometerMolecule == null || (tokenizedEvent = thermometerMolecule.getTokenizedEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, tokenizedEvent, null);
    }
}

package ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder;

import Ae.C2399j;
import Ae.C2408n0;
import Ae.I;
import Ge.n;
import Sc.InterfaceC4008j;
import WZ.l;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.product.addToCart.presentation.AddToCartButtonView;
import ru.ozon.app.android.product.common.TileThemeConfigVO;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import xe.E0;
import xe.H0;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0000\u0018\u0000 R2\u00020\u0001:\u0001RB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0015\u001a\u00020\u00142\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001d\u001a\u00020\u001a2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ]\u0010&\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0014\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0018\u00010\u001f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0014\u0018\u00010#2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b&\u0010'J5\u0010+\u001a\u00020\u0014*\u00020\n2\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\b\u0010*\u001a\u0004\u0018\u00010 H\u0002¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020\u00142\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\u0014¢\u0006\u0004\b1\u00102JG\u0010\u0015\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0014\u0018\u00010#2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u00104J\r\u00105\u001a\u00020\u0014¢\u0006\u0004\b5\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00108R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010;R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010<R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u0014\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010=R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010G\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010F\u001a\u0004\bK\u0010LR\u0016\u0010Q\u001a\u0004\u0018\u00010N8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder;", "", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/cart/common/domain/CartService;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;", "view", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "buttonDTO", "Lru/ozon/app/android/cart/common/models/CartItemInfo;", "cartItemInfo", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "source", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "config", "", "bindButton", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", "", "currentCount", "maxItems", "", "isPlusEnabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;II)Z", "isButtonDisabled", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/cart/common/models/CartItemInfo;II)Z", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "setOnClickListener", "(Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;ILjava/util/Map;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;)V", "count", "isPlusDisabled", "automatizationId", "appendLocator", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;IZZLjava/lang/String;)V", "LWZ/l;", "tokenizedAnalytics", "init", "(LWZ/l;)V", "subscribe", "()V", "button", "(Lru/ozon/app/android/product/addToCart/presentation/AddToCartButtonView;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;Lkotlin/jvm/functions/Function1;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;)V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "Lru/ozon/app/android/cart/common/domain/CartService;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/Source;", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/product/common/TileThemeConfigVO$AddToCartButtonConfigVO;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lxe/M;", "scope", "Lxe/M;", "isLikezoneGradientTransformationEnabled$delegate", "LSc/j;", "isLikezoneGradientTransformationEnabled", "()Z", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/AddToCartClickListenerFactory;", "addToCartClickListenerFactory$delegate", "getAddToCartClickListenerFactory", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/AddToCartClickListenerFactory;", "addToCartClickListenerFactory", "", "getSkuId", "()Ljava/lang/Long;", "skuId", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmallTileAddToCartButtonBinder {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Function1<? super AtomAction, Unit> actionHandler;

    /* renamed from: addToCartClickListenerFactory$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j addToCartClickListenerFactory;
    private WeakReference<AddToCartButtonView> button;
    private AddToCartButtonDTO buttonDTO;

    @NotNull
    private final CartService cartService;
    private TileThemeConfigVO.AddToCartButtonConfigVO config;

    @NotNull
    private final CoroutineDispatcherProvider coroutineDispatcherProvider;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final FeatureChecker featureChecker;

    /* renamed from: isLikezoneGradientTransformationEnabled$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isLikezoneGradientTransformationEnabled;

    @NotNull
    private final M scope;
    private Source source;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/smalltile/presentation/binder/SmallTileAddToCartButtonBinder$Companion;", "", "<init>", "()V", "LOCATOR_ADD_TO_CART", "", "LOCATOR_BUTTON_DISABLED", "LOCATOR_COUNTER_PLUS_DISABLED", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SmallTileAddToCartButtonBinder(@NotNull CartService cartService, @NotNull CoroutineDispatcherProvider coroutineDispatcherProvider, @NotNull FeatureChecker featureChecker) {
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "coroutineDispatcherProvider");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.cartService = cartService;
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        this.featureChecker = featureChecker;
        SmallTileAddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1 smallTileAddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1 = new SmallTileAddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = smallTileAddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = N.a(CoroutineContext.Element.a.d(coroutineDispatcherProvider.getMainImmediate(), (H0) X0.b()).plus(smallTileAddToCartButtonBinder$special$$inlined$CoroutineExceptionHandler$1));
        this.isLikezoneGradientTransformationEnabled = LazyUtilsKt.unsafeLazy(new SmallTileAddToCartButtonBinder$isLikezoneGradientTransformationEnabled$2(this));
        this.addToCartClickListenerFactory = LazyUtilsKt.unsafeLazy(new SmallTileAddToCartButtonBinder$addToCartClickListenerFactory$2(this));
    }

    private final void appendLocator(AddToCartButtonView addToCartButtonView, int i11, boolean z11, boolean z12, String str) {
        if (str == null) {
            str = "SmallTile_AddToCartButton";
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 0 && z12) {
            sb2.append("_disabled");
        } else if (z11) {
            sb2.append("_disabled_plus");
        }
        if (i11 > 0) {
            sb2.append("_" + i11);
        }
        addToCartButtonView.setContentDescription(sb2.toString());
    }

    private final AddToCartClickListenerFactory getAddToCartClickListenerFactory() {
        return (AddToCartClickListenerFactory) this.addToCartClickListenerFactory.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long getSkuId() {
        AddToCartButtonDTO addToCartButtonDTO = this.buttonDTO;
        if (addToCartButtonDTO != null) {
            return addToCartButtonDTO.getSkuLong();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        r6 = ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinderKt.getUpdateCartActionFromParams(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isButtonDisabled(AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, int currentCount, int maxItems) {
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        AddToCartButtonDTO.ActionButton actionButton;
        CommonControlSettings common;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        if (buttonDTO != null ? Intrinsics.d(buttonDTO.isDisabled(), Boolean.TRUE) : false) {
            return true;
        }
        if (currentCount == 0) {
            int quantity = (buttonDTO == null || (actionButton = buttonDTO.getActionButton()) == null || (common = actionButton.getCommon()) == null || (r6 = common.getAction()) == null || updateCartActionFromParams == null) ? 1 : updateCartActionFromParams.getQuantity();
            if (quantity > maxItems) {
                return true;
            }
        }
        if (cartItemInfo != null && buttonDTO != null && buttonDTO.getQuantityButton() != null && cartItemInfo.getQuantity() > 0) {
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (!Intrinsics.d((quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema(), cartItemInfo.getSelectedDeliverySchema())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isLikezoneGradientTransformationEnabled() {
        return ((Boolean) this.isLikezoneGradientTransformationEnabled.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        r2 = ru.ozon.app.android.universalwidgets.widgets.uw.sku.smalltile.presentation.binder.SmallTileAddToCartButtonBinderKt.getUpdateCartActionFromParams(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean isPlusEnabled(AddToCartButtonDTO buttonDTO, int currentCount, int maxItems) {
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartActionFromParams;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        Integer num = null;
        if (currentCount > 0) {
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (quantityButton != null && (updateCartAction = quantityButton.getUpdateCartAction()) != null) {
                num = Integer.valueOf(updateCartAction.getQuantity());
            }
        } else {
            CommonControlSettings common = buttonDTO.getActionButton().getCommon();
            if (common != null && (r2 = common.getAction()) != null && updateCartActionFromParams != null) {
                num = Integer.valueOf(updateCartActionFromParams.getQuantity());
            }
        }
        return currentCount + (num != null ? num.intValue() : 1) <= maxItems;
    }

    private final void setOnClickListener(AddToCartButtonDTO buttonDTO, AddToCartButtonView view, int currentCount, Map<String, TokenizedTrackingInfo> trackingInfo, Function1<? super AtomAction, Unit> actionHandler, Source source) {
        view.setClickListener(getAddToCartClickListenerFactory().getOrCreateAddToCartClickListener(buttonDTO, currentCount, trackingInfo, actionHandler, source));
    }

    public final void bindButton(AddToCartButtonView button, AddToCartButtonDTO buttonDTO, Function1<? super AtomAction, Unit> actionHandler, @NotNull Source source, @NotNull TileThemeConfigVO.AddToCartButtonConfigVO config) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(config, "config");
        this.button = button != null ? new WeakReference<>(button) : null;
        this.buttonDTO = buttonDTO;
        this.actionHandler = actionHandler;
        this.source = source;
        this.config = config;
        Long skuId = getSkuId();
        bindButton(button, buttonDTO, skuId != null ? this.cartService.getCartState().getItems().get(Long.valueOf(skuId.longValue())) : null, source, config);
    }

    public final void init(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.cartService.attach(tokenizedAnalytics);
    }

    public final void subscribe() {
        AddToCartButtonDTO addToCartButtonDTO = this.buttonDTO;
        if ((addToCartButtonDTO != null ? addToCartButtonDTO.getQuantityButton() : null) == null) {
            return;
        }
        C2399j.C(new C2408n0(C2399j.B(new I(n.a(CartService.DefaultImpls.observeCartState$default(this.cartService, false, 1, null))), this.coroutineDispatcherProvider.getIO()), new SmallTileAddToCartButtonBinder$subscribe$1(this, null)), this.scope);
    }

    public final void unsubscribe() {
        E0.d(this.scope.getCoroutineContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindButton(AddToCartButtonView view, AddToCartButtonDTO buttonDTO, CartItemInfo cartItemInfo, Source source, TileThemeConfigVO.AddToCartButtonConfigVO config) {
        AddToCartButtonDTO addToCartButtonDTO;
        AddToCartButtonView addToCartButtonView;
        SmallTileAddToCartButtonBinder smallTileAddToCartButtonBinder;
        TestInfo testInfo;
        Integer prevCount;
        AddToCartButtonDTO.QuantityButton.UpdateCartAction updateCartAction;
        if (view == null) {
            return;
        }
        int i11 = 0;
        view.setVisibility(buttonDTO != null ? 0 : 8);
        if (buttonDTO == null) {
            return;
        }
        String str = null;
        if (cartItemInfo != null && buttonDTO.getQuantityButton() != null) {
            Long selectedDeliverySchema = cartItemInfo.getSelectedDeliverySchema();
            AddToCartButtonDTO.QuantityButton quantityButton = buttonDTO.getQuantityButton();
            if (Intrinsics.d(selectedDeliverySchema, (quantityButton == null || (updateCartAction = quantityButton.getUpdateCartAction()) == null) ? null : updateCartAction.getSelectedDeliverySchema())) {
                i11 = cartItemInfo.getQuantity();
            }
        }
        int i12 = i11;
        AddToCartButtonDTO.QuantityButton quantityButton2 = buttonDTO.getQuantityButton();
        int maxItems = quantityButton2 != null ? quantityButton2.getMaxItems() : Integer.MAX_VALUE;
        boolean isButtonDisabled = isButtonDisabled(buttonDTO, cartItemInfo, i12, maxItems);
        boolean isPlusEnabled = isPlusEnabled(buttonDTO, i12, maxItems);
        if (buttonDTO.equals(view.getPrevModel()) && isButtonDisabled == view.getIsDisabled() && (prevCount = view.getPrevCount()) != null && i12 == prevCount.intValue() && isPlusEnabled == view.getIsPlusButtonEnabled()) {
            smallTileAddToCartButtonBinder = this;
            addToCartButtonView = view;
            addToCartButtonDTO = buttonDTO;
        } else {
            view.bind(buttonDTO, isButtonDisabled, i12, isPlusEnabled, config, isLikezoneGradientTransformationEnabled());
            addToCartButtonDTO = buttonDTO;
            boolean z11 = !isPlusEnabled;
            CommonControlSettings common = addToCartButtonDTO.getActionButton().getCommon();
            if (common != null && (testInfo = common.getTestInfo()) != null) {
                str = testInfo.getAutomatizationId();
            }
            addToCartButtonView = view;
            smallTileAddToCartButtonBinder = this;
            smallTileAddToCartButtonBinder.appendLocator(addToCartButtonView, i12, z11, isButtonDisabled, str);
            i12 = i12;
        }
        smallTileAddToCartButtonBinder.setOnClickListener(addToCartButtonDTO, addToCartButtonView, i12, addToCartButtonDTO.getTrackingInfo(), smallTileAddToCartButtonBinder.actionHandler, source);
    }
}

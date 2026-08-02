package ru.ozon.app.android.pdp.widgets.cartButtonV5.core;

import A00.a;
import Vg.d;
import WZ.l;
import WZ.t;
import android.content.Context;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import c20.r;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import d20.AbstractC6065b;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pdp.flags.CartButtonV5LikezonGradientTransformationEnabledFlag;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.ExtKt;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.subscribe.SubscribeViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.data.CartButtonV5DTO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.di.CartButtonV5WidgetComponent;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5BottomSheetViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ButtonsContainerViewGroup;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5Configuration;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5VO;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5ViewModel;
import ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.CartButtonV5WidgetViewHolder;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0016j\b\u0012\u0004\u0012\u00020\u0002`\u00172\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040!2\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R(\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0,0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV5/core/CartButtonV5ViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/di/CartButtonV5WidgetComponent;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "<init>", "()V", "item", "updateConfigurationState", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;)Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5VO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/pdp/widgets/cartButtonV5/data/CartButtonV5DTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "previewButtonConfiguration", "Lru/ozon/app/android/pdp/widgets/cartButtonV5/presentation/CartButtonV5Configuration;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartButtonV5ViewMapper extends OverlayWidgetScreenViewItemMapper2<CartButtonV5WidgetComponent, CartButtonV5DTO, CartButtonV5VO> {

    @NotNull
    private CartButtonV5Configuration previewButtonConfiguration = new CartButtonV5Configuration(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 32767, null);

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(CartButtonV5Update.class, CartButtonV5SubscriptionUpdate.class, CartButtonsV5Update.class);

    private final CartButtonV5VO updateConfigurationState(CartButtonV5VO item) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        CartButtonV5Configuration copy;
        CartButtonV5DTO.CartButton.Button toCart;
        CartButtonV5DTO.CartButton.Button toCart2;
        CartButtonV5Configuration cartButtonV5Configuration = this.previewButtonConfiguration;
        boolean z19 = false;
        boolean z21 = true;
        boolean z22 = item.getSecondCartButton() == null;
        if (item.getCartButton().getToCart().getBadge() != null) {
            z11 = false;
            z19 = true;
        } else {
            z11 = false;
        }
        CartButtonV5VO.CartButton secondCartButton = item.getSecondCartButton();
        Icon icon = null;
        if (((secondCartButton == null || (toCart2 = secondCartButton.getToCart()) == null) ? null : toCart2.getBadge()) != null) {
            z12 = true;
        } else {
            z12 = true;
            z21 = z11;
        }
        if (item.getCartButton().getToCart().getIcon() != null) {
            z13 = z11;
            z11 = z12;
        } else {
            z13 = z11;
        }
        CartButtonV5VO.CartButton secondCartButton2 = item.getSecondCartButton();
        if (secondCartButton2 != null && (toCart = secondCartButton2.getToCart()) != null) {
            icon = toCart.getIcon();
        }
        if (icon != null) {
            z14 = z12;
        } else {
            z14 = z12;
            z12 = z13;
        }
        if (item.getCartButton().getToCart().getSubtitle() == null || item.getAsyncAction() != null) {
            z15 = z14;
            z14 = z13;
        } else {
            z15 = z14;
        }
        if (item.getAsyncAction() == null || item.getCartButton().getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE) {
            z16 = z13;
        } else {
            z16 = z13;
            z13 = z15;
        }
        boolean isInCart = item.getCartButton().getIsInCart();
        if (item.getSecondCartButton() == null || !item.getSecondCartButton().getIsInCart() || item.getCartButton().getIsInCart()) {
            z17 = z15;
            z18 = z16;
        } else {
            z17 = z15;
            z18 = z16;
            z16 = z17;
        }
        boolean isStickyTransparent = item.getIsStickyTransparent();
        if (item.getRelatedProduct() != null) {
            z18 = z17;
        }
        copy = cartButtonV5Configuration.copy((r32 & 1) != 0 ? cartButtonV5Configuration.isSingleButton : z22, (r32 & 2) != 0 ? cartButtonV5Configuration.hasFirstBadge : z19, (r32 & 4) != 0 ? cartButtonV5Configuration.hasSecondBadge : z21, (r32 & 8) != 0 ? cartButtonV5Configuration.isIcon : z11, (r32 & 16) != 0 ? cartButtonV5Configuration.isSecondIcon : z12, (r32 & 32) != 0 ? cartButtonV5Configuration.isSubTitle : z14, (r32 & 64) != 0 ? cartButtonV5Configuration.isAsync : z13, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? cartButtonV5Configuration.isFirstInCart : isInCart, (r32 & 256) != 0 ? cartButtonV5Configuration.isSecondInCart : z16, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? cartButtonV5Configuration.isStickyTransparent : isStickyTransparent, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? cartButtonV5Configuration.isRelatedBottomSheet : z18, (r32 & 2048) != 0 ? cartButtonV5Configuration.isSubscribeButton : item.getCartButton().getToCart().isSubscribeButton(), (r32 & 4096) != 0 ? cartButtonV5Configuration.isTeenMode : false, (r32 & 8192) != 0 ? cartButtonV5Configuration.isMatrixGradient : false, (r32 & 16384) != 0 ? cartButtonV5Configuration.isInModal : false);
        this.previewButtonConfiguration = copy;
        Unit unit = Unit.f71690a;
        return CartButtonV5VO.copy$default(item, 0L, false, 0.0f, null, null, null, null, null, copy, 255, null);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonV5DTO.CartButton.Button toCart;
        CartButtonV5DTO.CartButton.Button toCart2;
        Icon icon = null;
        CartButtonV5DTO cartButtonV5DTO = state instanceof CartButtonV5DTO ? (CartButtonV5DTO) state : null;
        if (cartButtonV5DTO == null) {
            return false;
        }
        boolean z11 = cartButtonV5DTO.getFirstButton().isInCart() && cartButtonV5DTO.getFirstButton().getQuantMultiplicityValue() == null;
        boolean z12 = cartButtonV5DTO.getSecondButton() == null;
        boolean z13 = cartButtonV5DTO.getFirstButton().getToCart().getBadge() != null;
        CartButtonV5DTO.CartButton secondButton = cartButtonV5DTO.getSecondButton();
        boolean z14 = ((secondButton == null || (toCart2 = secondButton.getToCart()) == null) ? null : toCart2.getBadge()) != null;
        boolean z15 = cartButtonV5DTO.getFirstButton().getToCart().getIcon() != null;
        CartButtonV5DTO.CartButton secondButton2 = cartButtonV5DTO.getSecondButton();
        if (secondButton2 != null && (toCart = secondButton2.getToCart()) != null) {
            icon = toCart.getIcon();
        }
        boolean z16 = icon != null;
        boolean z17 = cartButtonV5DTO.getFirstButton().getToCart().getSubtitle() != null && cartButtonV5DTO.getAsyncAction() == null;
        boolean z18 = (cartButtonV5DTO.getAsyncAction() == null || cartButtonV5DTO.getFirstButton().getToCart().getAsyncFetchType() == CartButtonV5DTO.CartButton.Button.AsyncFetchType.NO_FETCH_TYPE) ? false : true;
        boolean z19 = cartButtonV5DTO.getSecondButton() != null && cartButtonV5DTO.getSecondButton().isInCart() && !z11 && cartButtonV5DTO.getSecondButton().getQuantMultiplicityValue() == null;
        boolean isStickyTransparent = cartButtonV5DTO.isStickyTransparent();
        boolean z21 = cartButtonV5DTO.getRelatedProductsCurtain() != null;
        boolean isSubscribeButton = cartButtonV5DTO.getFirstButton().getToCart().isSubscribeButton();
        boolean isTeensModeOn = component().getTeensModeService().isTeensModeOn();
        boolean isEnabled = component().getFeatureChecker().isEnabled(CartButtonV5LikezonGradientTransformationEnabledFlag.INSTANCE);
        Boolean isInModal = cartButtonV5DTO.isInModal();
        this.previewButtonConfiguration = new CartButtonV5Configuration(z12, z13, z14, z15, z16, z17, z18, z11, z19, isStickyTransparent, z21, isSubscribeButton, isTeensModeOn, isEnabled, isInModal != null ? isInModal.booleanValue() : false);
        return true;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CartButtonV5VO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        Context L11 = container.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        CartButtonV5ButtonsContainerViewGroup cartButtonV5ButtonsContainerViewGroup = new CartButtonV5ButtonsContainerViewGroup(L11, this.previewButtonConfiguration);
        w0 a11 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5ViewMapper$createHolder$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CartButtonV5ViewModel cartButtonV5ViewModel = CartButtonV5ViewMapper.this.component().getViewModelProvider().get();
                Intrinsics.g(cartButtonV5ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartButtonV5ViewModel;
            }
        }).a(CartButtonV5ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        CartButtonV5ViewModel cartButtonV5ViewModel = (CartButtonV5ViewModel) a11;
        l tokenizedAnalytics = component().getTokenizedAnalytics();
        w0 a12 = new z0(container.a0().a(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5ViewMapper$createHolder$$inlined$viewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                SubscribeViewModel subscribeViewModel = CartButtonV5ViewMapper.this.component().getSubscribeViewModelProvider().get();
                Intrinsics.g(subscribeViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return subscribeViewModel;
            }
        }).a(SubscribeViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        SubscribeViewModel subscribeViewModel = (SubscribeViewModel) a12;
        PDPOnBoardingViewModel pDPOnBoardingViewModel = (PDPOnBoardingViewModel) new z0(container.b0().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5ViewMapper$createHolder$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                PDPOnBoardingViewModel pdpOnBoardingViewModel = CartButtonV5ViewMapper.this.component().getPdpOnBoardingViewModel();
                Intrinsics.g(pdpOnBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pdpOnBoardingViewModel;
            }
        }).a(PDPOnBoardingViewModel.class);
        FeatureChecker featureChecker = component().getFeatureChecker();
        boolean isRelatedBottomSheet = this.previewButtonConfiguration.getIsRelatedBottomSheet();
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        w0 a13 = new z0(container.a0().b(), new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.cartButtonV5.core.CartButtonV5ViewMapper$createHolder$$inlined$sharedViewModel$2
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CartButtonV5BottomSheetViewModel cartButtonV5BottomSheetViewModel = CartButtonV5ViewMapper.this.component().getBottomSheetViewModelProvider().get();
                Intrinsics.g(cartButtonV5BottomSheetViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return cartButtonV5BottomSheetViewModel;
            }
        }).a(CartButtonV5BottomSheetViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a13, "sharedViewModel(...)");
        return new CartButtonV5WidgetViewHolder(container, cartButtonV5ButtonsContainerViewGroup, cartButtonV5ViewModel, tokenizedAnalytics, subscribeViewModel, pDPOnBoardingViewModel, isRelatedBottomSheet, customActionHandlersStoreFactory, (CartButtonV5BottomSheetViewModel) a13, featureChecker);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<CartButtonV5WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CartButtonV5WidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    @NotNull
    public CartButtonV5VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CartButtonV5VO oldItem) {
        CartButtonV5VO.CartButton copy;
        CartButtonV5VO.CartButton copy2;
        CartButtonV5VO.CartButton copy3;
        TextDTO placeholder;
        TextDTO placeholder2;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof CartButtonsV5Update) {
            CartButtonsV5Update cartButtonsV5Update = (CartButtonsV5Update) update;
            return updateConfigurationState(CartButtonV5VO.copy$default(oldItem, 0L, false, 0.0f, cartButtonsV5Update.getButton(), cartButtonsV5Update.getSecondButton(), null, null, null, null, 487, null));
        }
        if (!(update instanceof CartButtonV5Update)) {
            if (!(update instanceof CartButtonV5SubscriptionUpdate)) {
                return oldItem;
            }
            copy = r3.copy((r32 & 1) != 0 ? r3.cartType : null, (r32 & 2) != 0 ? r3.isInCart : ((CartButtonV5SubscriptionUpdate) update).getIsSubscribed(), (r32 & 4) != 0 ? r3.toCart : null, (r32 & 8) != 0 ? r3.inCart : null, (r32 & 16) != 0 ? r3.additionalButton : null, (r32 & 32) != 0 ? r3.sku : null, (r32 & 64) != 0 ? r3.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r3.freeRest : 0, (r32 & 256) != 0 ? r3.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r3.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r3.multiplicityValue : 0, (r32 & 2048) != 0 ? r3.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r3.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r3.isHowLoader : false, (r32 & 16384) != 0 ? oldItem.getCartButton().dismissAction : null);
            return updateConfigurationState(CartButtonV5VO.copy$default(oldItem, 0L, false, 0.0f, copy, null, null, null, null, null, 503, null));
        }
        CartButtonV5Update cartButtonV5Update = (CartButtonV5Update) update;
        CartButtonV5DTO.CartButton.AdditionalButton additionalButton = null;
        if (Intrinsics.d(oldItem.getCartButton().getDeliverySchema(), cartButtonV5Update.getButton().getDeliverySchema()) && Intrinsics.d(oldItem.getCartButton().getSku(), cartButtonV5Update.getButton().getSku()) && oldItem.getCartButton().getCartType() == cartButtonV5Update.getButton().getCartType()) {
            CartButtonV5VO.CartButton button = cartButtonV5Update.getButton();
            CartButtonV5DTO.CartButton.AdditionalButton additionalButton2 = cartButtonV5Update.getButton().getAdditionalButton();
            copy2 = button.copy((r32 & 1) != 0 ? button.cartType : null, (r32 & 2) != 0 ? button.isInCart : false, (r32 & 4) != 0 ? button.toCart : null, (r32 & 8) != 0 ? button.inCart : null, (r32 & 16) != 0 ? button.additionalButton : (additionalButton2 == null || (placeholder2 = additionalButton2.getPlaceholder()) == null) ? null : CartButtonV5DTO.CartButton.AdditionalButton.copy$default(cartButtonV5Update.getButton().getAdditionalButton(), null, TextDTO.copy$default(placeholder2, OzonSpannableStringKt.toOzonSpannableString(String.valueOf(cartButtonV5Update.getButton().getInCartQuantity())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 29, null), (r32 & 32) != 0 ? button.sku : null, (r32 & 64) != 0 ? button.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? button.freeRest : 0, (r32 & 256) != 0 ? button.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? button.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? button.multiplicityValue : 0, (r32 & 2048) != 0 ? button.quantMultiplicityValue : null, (r32 & 4096) != 0 ? button.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? button.isHowLoader : false, (r32 & 16384) != 0 ? button.dismissAction : null);
        } else {
            copy2 = (oldItem.getCartButton().getIsInCart() && cartButtonV5Update.getButton().getIsInCart()) ? r4.copy((r32 & 1) != 0 ? r4.cartType : null, (r32 & 2) != 0 ? r4.isInCart : false, (r32 & 4) != 0 ? r4.toCart : null, (r32 & 8) != 0 ? r4.inCart : null, (r32 & 16) != 0 ? r4.additionalButton : null, (r32 & 32) != 0 ? r4.sku : null, (r32 & 64) != 0 ? r4.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r4.freeRest : 0, (r32 & 256) != 0 ? r4.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r4.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r4.multiplicityValue : 0, (r32 & 2048) != 0 ? r4.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r4.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r4.isHowLoader : false, (r32 & 16384) != 0 ? oldItem.getCartButton().dismissAction : null) : oldItem.getCartButton();
        }
        CartButtonV5VO.CartButton cartButton = copy2;
        CartButtonV5VO.CartButton secondCartButton = oldItem.getSecondCartButton();
        if (Intrinsics.d(secondCartButton != null ? secondCartButton.getDeliverySchema() : null, cartButtonV5Update.getButton().getDeliverySchema())) {
            CartButtonV5VO.CartButton secondCartButton2 = oldItem.getSecondCartButton();
            if (Intrinsics.d(secondCartButton2 != null ? secondCartButton2.getSku() : null, cartButtonV5Update.getButton().getSku())) {
                CartButtonV5VO.CartButton secondCartButton3 = oldItem.getSecondCartButton();
                if ((secondCartButton3 != null ? secondCartButton3.getCartType() : null) == cartButtonV5Update.getButton().getCartType()) {
                    CartButtonV5VO.CartButton button2 = cartButtonV5Update.getButton();
                    CartButtonV5DTO.CartButton.AdditionalButton additionalButton3 = cartButtonV5Update.getButton().getAdditionalButton();
                    if (additionalButton3 != null && (placeholder = additionalButton3.getPlaceholder()) != null) {
                        additionalButton = CartButtonV5DTO.CartButton.AdditionalButton.copy$default(cartButtonV5Update.getButton().getAdditionalButton(), null, TextDTO.copy$default(placeholder, OzonSpannableStringKt.toOzonSpannableString(String.valueOf(cartButtonV5Update.getButton().getInCartQuantity())), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 29, null);
                    }
                    copy3 = button2.copy((r32 & 1) != 0 ? button2.cartType : null, (r32 & 2) != 0 ? button2.isInCart : false, (r32 & 4) != 0 ? button2.toCart : null, (r32 & 8) != 0 ? button2.inCart : null, (r32 & 16) != 0 ? button2.additionalButton : additionalButton, (r32 & 32) != 0 ? button2.sku : null, (r32 & 64) != 0 ? button2.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? button2.freeRest : 0, (r32 & 256) != 0 ? button2.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? button2.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? button2.multiplicityValue : 0, (r32 & 2048) != 0 ? button2.quantMultiplicityValue : null, (r32 & 4096) != 0 ? button2.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? button2.isHowLoader : false, (r32 & 16384) != 0 ? button2.dismissAction : null);
                    return updateConfigurationState(CartButtonV5VO.copy$default(oldItem, 0L, false, 0.0f, cartButton, copy3, null, null, null, null, 487, null));
                }
            }
        }
        CartButtonV5VO.CartButton secondCartButton4 = oldItem.getSecondCartButton();
        copy3 = (secondCartButton4 != null && secondCartButton4.getIsInCart() && cartButtonV5Update.getButton().getIsInCart()) ? r7.copy((r32 & 1) != 0 ? r7.cartType : null, (r32 & 2) != 0 ? r7.isInCart : false, (r32 & 4) != 0 ? r7.toCart : null, (r32 & 8) != 0 ? r7.inCart : null, (r32 & 16) != 0 ? r7.additionalButton : null, (r32 & 32) != 0 ? r7.sku : null, (r32 & 64) != 0 ? r7.deliverySchema : null, (r32 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? r7.freeRest : 0, (r32 & 256) != 0 ? r7.minAddToCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? r7.inCartQuantity : 0, (r32 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? r7.multiplicityValue : 0, (r32 & 2048) != 0 ? r7.quantMultiplicityValue : null, (r32 & 4096) != 0 ? r7.otherQuantMultiplicityValue : null, (r32 & 8192) != 0 ? r7.isHowLoader : false, (r32 & 16384) != 0 ? oldItem.getSecondCartButton().dismissAction : null) : oldItem.getSecondCartButton();
        return updateConfigurationState(CartButtonV5VO.copy$default(oldItem, 0L, false, 0.0f, cartButton, copy3, null, null, null, null, 487, null));
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CartButtonV5VO> map(@NotNull CartButtonV5DTO state, @NotNull l20.d info) {
        CartButtonV5VO.CartButton vo;
        CartButtonV5VO.CartButton cartButton;
        CartButtonV5VO.RelatedProductsCurtainVO relatedProductsCurtainVO;
        CartButtonV5VO.CartButton vo2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        long widgetId = MapperExtKt.widgetId(info);
        CartButtonV5DTO.CartButton firstButton = state.getFirstButton();
        CartButtonV5VO.CartType cartType = CartButtonV5VO.CartType.FIRST;
        boolean z11 = state.getAsyncAction() == null;
        CartButtonV5DTO.CartButton secondButton = state.getSecondButton();
        vo = CartButtonV5ViewMapperKt.toVO(firstButton, cartType, z11, secondButton != null ? secondButton.getQuantMultiplicityValue() : null, state.getAsyncAction() != null, component().getQuantTypeRepository().getLastCartType());
        CartButtonV5DTO.CartButton secondButton2 = state.getSecondButton();
        if (secondButton2 != null) {
            vo2 = CartButtonV5ViewMapperKt.toVO(secondButton2, CartButtonV5VO.CartType.SECOND, state.getAsyncAction() == null, state.getFirstButton().getQuantMultiplicityValue(), state.getAsyncAction() != null, component().getQuantTypeRepository().getLastCartType());
            cartButton = vo2;
        } else {
            cartButton = null;
        }
        boolean isStickyTransparent = state.isStickyTransparent();
        float pxF = UiExtKt.toPxF(state.getStickyCornerRadius().getPx());
        AtomActionDTO asyncAction = state.getAsyncAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        CartButtonV5DTO.RelatedProductsCurtain relatedProductsCurtain = state.getRelatedProductsCurtain();
        if (relatedProductsCurtain != null) {
            String link = relatedProductsCurtain.getLink();
            CartButtonV4Dto.CurtainTrackingInfo trackingInfo2 = relatedProductsCurtain.getTrackingInfo();
            relatedProductsCurtainVO = new CartButtonV5VO.RelatedProductsCurtainVO(link, trackingInfo2 != null ? ExtKt.toVo(trackingInfo2, widgetId) : null);
        } else {
            relatedProductsCurtainVO = null;
        }
        return C7714v.a0(new CartButtonV5VO(widgetId, isStickyTransparent, pxF, vo, cartButton, asyncAction, tokenizedEvent$default, relatedProductsCurtainVO, this.previewButtonConfiguration));
    }
}

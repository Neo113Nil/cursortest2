package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2DynamicElementsDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CheckboxDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.ControlsDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.HeaderDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.SwipeInfoDTO;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementMapperV2Kt;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.ControlsVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.header.HeaderVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.SwipeAnalyticsExtKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeButtonVO;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.swipeToDelete.viewObjects.SwipeInfoVO;
import ru.ozon.app.android.cart.ui.rightIconButtonView.RightIconButtonDTO;
import ru.ozon.app.android.cart.ui.thermometer.data.ThermometerMoleculeDTO;
import ru.ozon.app.android.cart.ui.thermometer.presentation.mapper.ThermometerMoleculeMapperKt;
import ru.ozon.app.android.cart.ui.thermometer.presentation.vo.ThermometerMoleculeVO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionDTO;
import ru.ozon.app.android.cart.ui.tooltip.molecule.TooltipWithOnboardingActionVOKt;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModel;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.data.CartClickTileDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.cartClickTile.presentation.CartClickTileMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a(\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0000\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\bH\u0000\u001a\u0014\u0010\u0000\u001a\u00020\f*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0010*\u00020\u0011H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a.\u0010\u0000\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0000\u001a \u0010\u001c\u001a\u00020\u001d*\u00020\u00192\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 0\u001fH\u0000\u001a2\u0010!\u001a\u00020\"*\u00020#2\u0006\u0010$\u001a\u00020%2\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\u0006\u0010&\u001a\u00020\u001bH\u0002¨\u0006'"}, d2 = {"toVOV2", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO;", "widgetId", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductVOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductDTOV2;", "checkbox", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CheckboxDTO;", "bottomDynamicElements", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$QuantityControl;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$QuantityControl;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/header/HeaderVO$AdditionalAction;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/HeaderDTO$AdditionalAction;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/ControlsVO$DecrementRemove;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/ControlsDTO$DecrementRemove;", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeInfoVO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "removeButton", "Lru/ozon/app/android/cart/cartSplitV2/v2/util/swipeToDelete/viewObjects/SwipeButtonVO;", "favoriteProduct", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "groupSwipeId", "", "toFavProductModel", "Lru/ozon/app/android/favorites/domain/model/FavoriteProductModel;", "swipeTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "toIconButtonV3DTO", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "isFavorite", "", "tintColor", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2MappersKt {
    @NotNull
    public static final FavoriteProductModel toFavProductModel(@NotNull FavoriteProductMolecule favoriteProductMolecule, @NotNull Map<String, TokenizedTrackingInfo> swipeTrackingInfo) {
        Intrinsics.checkNotNullParameter(favoriteProductMolecule, "<this>");
        Intrinsics.checkNotNullParameter(swipeTrackingInfo, "swipeTrackingInfo");
        return new FavoriteProductModel(favoriteProductMolecule.getSku(), favoriteProductMolecule.isFavorite(), toIconButtonV3DTO(favoriteProductMolecule.getFavoriteButton(), true, swipeTrackingInfo, UniColors.GRAPHIC_TERTIARY.getToken()), toIconButtonV3DTO(favoriteProductMolecule.getUnfavoriteButton(), false, swipeTrackingInfo, UniColors.GRAPHIC_ACCENT_PRIMARY.getToken()), favoriteProductMolecule.getAddToListAction(), favoriteProductMolecule.getChangeSourceId());
    }

    private static final IconButtonV3DTO toIconButtonV3DTO(ButtonV3Atom.SmallIconButton smallIconButton, boolean z11, Map<String, TokenizedTrackingInfo> map, String str) {
        ButtonV3DTO.StyleTypes styleTypes = ButtonV3DTO.StyleTypes.CUSTOM;
        IconButtonV3DTO.IconButtonShape iconButtonShape = IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE;
        String icon = smallIconButton.getIcon();
        String token = UniColors.WHITE_TRANSPARENT_0.getToken();
        AtomActionDTO action = smallIconButton.getAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = smallIconButton.getTrackingInfo();
        return new IconButtonV3DTO(null, styleTypes, iconButtonShape, icon, Boolean.FALSE, str, token, new CommonControlSettings(action, trackingInfo != null ? SwipeAnalyticsExtKt.replaceToSwipeFavoriteClickTracking(trackingInfo, map, z11) : null, smallIconButton.getTestInfo()), Boolean.TRUE, null, null, null, null, null, 15873, null);
    }

    @NotNull
    public static final HeaderVO toVOV2(@NotNull HeaderDTO headerDTO, long j11) {
        Intrinsics.checkNotNullParameter(headerDTO, "<this>");
        TextDTO title = headerDTO.getTitle();
        TextDTO subtitle = headerDTO.getSubtitle();
        HeaderDTO.AdditionalAction additionalAction = headerDTO.getAdditionalAction();
        HeaderVO.AdditionalAction vov2 = additionalAction != null ? toVOV2(additionalAction) : null;
        IconButtonV3DTO removeSplitIconButton = headerDTO.getRemoveSplitIconButton();
        ThermometerMoleculeDTO thermometerMolecule = headerDTO.getThermometerMolecule();
        ThermometerMoleculeVO vo = thermometerMolecule != null ? ThermometerMoleculeMapperKt.toVO(thermometerMolecule, j11) : null;
        CartClickTileDTO clickDelivery = headerDTO.getClickDelivery();
        return new HeaderVO(title, subtitle, vov2, removeSplitIconButton, vo, clickDelivery != null ? CartClickTileMapperKt.toVO(clickDelivery, j11) : null, headerDTO.getRightBadge());
    }

    @NotNull
    public static final ProductVOV2 toVOV2(@NotNull ProductDTOV2 productDTOV2, long j11, CheckboxDTO checkboxDTO, CartSplitV2DynamicElementsDTOV2 cartSplitV2DynamicElementsDTOV2) {
        Intrinsics.checkNotNullParameter(productDTOV2, "<this>");
        String id2 = productDTOV2.getId();
        List<DynamicElementDTOV2> dynamicElements = productDTOV2.getDynamicElements();
        Intrinsics.g(dynamicElements, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List<DynamicElementVOV2> mapDynamicElements = DynamicElementMapperV2Kt.mapDynamicElements(dynamicElements, j11);
        AtomActionDTO action = productDTOV2.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = productDTOV2.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        ProductMediaDTO media = productDTOV2.getMedia();
        CheckboxVO vov2 = checkboxDTO != null ? toVOV2(checkboxDTO) : null;
        List<DynamicElementDTOV2> dynamicElements2 = cartSplitV2DynamicElementsDTOV2 != null ? cartSplitV2DynamicElementsDTOV2.getDynamicElements() : null;
        return new ProductVOV2(id2, mapDynamicElements, atomAction, tokenizedEvent$default, media, vov2, DynamicElementMapperV2Kt.mapDynamicElements(dynamicElements2 instanceof List ? dynamicElements2 : null, j11));
    }

    @NotNull
    public static final CheckboxVO toVOV2(@NotNull CheckboxDTO checkboxDTO) {
        Intrinsics.checkNotNullParameter(checkboxDTO, "<this>");
        AtomActionDTO action = checkboxDTO.getAction();
        return new CheckboxVO(action != null ? AtomActionMapperKt.toAtomAction(action, checkboxDTO.getTrackingInfo()) : null, checkboxDTO.getCheckbox());
    }

    @NotNull
    public static final ControlsVO toVOV2(@NotNull ControlsDTO controlsDTO, long j11) {
        Intrinsics.checkNotNullParameter(controlsDTO, "<this>");
        FavoriteProductMolecule favoriteProduct = controlsDTO.getFavoriteProduct();
        IconButtonV3DTO removeButton = controlsDTO.getRemoveButton();
        ControlsDTO.QuantityControl quantity = controlsDTO.getQuantity();
        ControlsVO.QuantityControl vov2 = quantity != null ? toVOV2(quantity, j11) : null;
        ButtonV3DTO buyInOneClick = controlsDTO.getBuyForStars() == null ? controlsDTO.getBuyInOneClick() : null;
        RightIconButtonDTO buyForStars = controlsDTO.getBuyForStars();
        IconButtonV3DTO moveButton = controlsDTO.getMoveButton();
        TooltipWithOnboardingActionDTO moveButtonTooltipWithAction = controlsDTO.getMoveButtonTooltipWithAction();
        return new ControlsVO(favoriteProduct, removeButton, vov2, buyInOneClick, buyForStars, moveButton, moveButtonTooltipWithAction != null ? TooltipWithOnboardingActionVOKt.toVo(moveButtonTooltipWithAction) : null);
    }

    @NotNull
    public static final ControlsVO.QuantityControl toVOV2(@NotNull ControlsDTO.QuantityControl quantityControl, long j11) {
        ControlsVO.QuantityControl.QuantityStyle quantityStyle;
        int intValue;
        Intrinsics.checkNotNullParameter(quantityControl, "<this>");
        int minimum = quantityControl.getMinimum();
        int maximum = quantityControl.getMaximum();
        int current = quantityControl.getCurrent();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(quantityControl.getAction(), null);
        Integer multiplicity = quantityControl.getMultiplicity();
        int i11 = 1;
        if (multiplicity != null && (intValue = multiplicity.intValue()) >= 1) {
            i11 = intValue;
        }
        int i12 = i11;
        Long debounceDelay = quantityControl.getDebounceDelay();
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo = quantityControl.getIncrementTrackingInfo();
        t tokenizedEvent$default = incrementTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(incrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> decrementTrackingInfo = quantityControl.getDecrementTrackingInfo();
        t tokenizedEvent$default2 = decrementTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(decrementTrackingInfo, Long.valueOf(j11), null, 2, null) : null;
        NotificationDTO quantityChangeDisabledNotificationBar = quantityControl.getQuantityChangeDisabledNotificationBar();
        Integer quantSize = quantityControl.getQuantSize();
        int intValue2 = quantSize != null ? quantSize.intValue() : 0;
        if (quantityControl.getStyle() == ControlsDTO.QuantityControl.QuantityStyle.CUSTOM_DS_COUNT_PICKER) {
            quantityStyle = ControlsVO.QuantityControl.QuantityStyle.CUSTOM_DS_COUNT_PICKER;
        } else {
            quantityStyle = ControlsVO.QuantityControl.QuantityStyle.CART_COUNT_PICKER;
        }
        ControlsDTO.DecrementRemove decrementRemove = quantityControl.getDecrementRemove();
        return new ControlsVO.QuantityControl(minimum, maximum, current, atomAction, i12, debounceDelay, tokenizedEvent$default, tokenizedEvent$default2, quantityChangeDisabledNotificationBar, intValue2, quantityStyle, decrementRemove != null ? toVOV2(decrementRemove, j11) : null);
    }

    private static final HeaderVO.AdditionalAction toVOV2(HeaderDTO.AdditionalAction additionalAction) {
        return new HeaderVO.AdditionalAction(additionalAction.getButton(), additionalAction.getTintColor());
    }

    private static final ControlsVO.DecrementRemove toVOV2(ControlsDTO.DecrementRemove decrementRemove, long j11) {
        return new ControlsVO.DecrementRemove(TrackingInfoMapperKt.mapToTokenizedEvent$default(decrementRemove.getTrackingInfo(), Long.valueOf(j11), null, 2, null), AtomActionMapperKt.toAtomAction(decrementRemove.getAction(), null));
    }

    @NotNull
    public static final SwipeInfoVO toVOV2(@NotNull SwipeInfoDTO swipeInfoDTO, long j11, @NotNull SwipeButtonVO removeButton, FavoriteProductMolecule favoriteProductMolecule, @NotNull String groupSwipeId) {
        Intrinsics.checkNotNullParameter(swipeInfoDTO, "<this>");
        Intrinsics.checkNotNullParameter(removeButton, "removeButton");
        Intrinsics.checkNotNullParameter(groupSwipeId, "groupSwipeId");
        return new SwipeInfoVO(TrackingInfoMapperKt.mapToTokenizedEvent$default(swipeInfoDTO.getTrackingInfo(), Long.valueOf(j11), null, 2, null), groupSwipeId, favoriteProductMolecule != null ? toFavProductModel(favoriteProductMolecule, swipeInfoDTO.getTrackingInfo()) : null, removeButton);
    }
}

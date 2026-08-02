package ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar;

import Sc.o;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.data.ProductActionBarDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOV2;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarViewV2;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0010\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0014\u001a\u0011\u0010\u0010\u001a\u00020\r*\u00020\t¢\u0006\u0004\b\u0010\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "toVOV2", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;J)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;", "size", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "toVO", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "commonStyles", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$QuantityPicker;", "createViewData", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$QuantityPickerVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$QuantityPicker;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionIcon;", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$ActionIconVO;Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$ActionIcon;", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVOV2$CustomStyleVO;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarViewV2$CommonStyles;", "", "MARGIN_DEFAULT", "I", "MARGIN_BIG", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarMapperV2Kt {
    private static final int MARGIN_DEFAULT = UiExtKt.toPx(4);
    private static final int MARGIN_BIG = UiExtKt.toPx(6);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductActionBarDTO.Size.values().length];
            try {
                iArr[ProductActionBarDTO.Size.BIG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductActionBarDTO.Size.MINI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ProductActionBarViewV2.QuantityPicker createViewData(@NotNull ProductActionBarVOV2.QuantityPickerVO quantityPickerVO, @NotNull ProductActionBarViewV2.CommonStyles commonStyles) {
        Intrinsics.checkNotNullParameter(quantityPickerVO, "<this>");
        Intrinsics.checkNotNullParameter(commonStyles, "commonStyles");
        return new ProductActionBarViewV2.QuantityPicker(quantityPickerVO.getValueText(), quantityPickerVO.getIncrementIconToken(), !quantityPickerVO.getIsIncrementDisabled(), quantityPickerVO.getDecrementIconToken(), commonStyles);
    }

    private static final ProductActionBarVOV2.CustomStyleVO toVO(ProductActionBarDTO.CustomStyle customStyle, ProductActionBarDTO.Size size) {
        IconButtonV3DTO.Sizes sizes;
        int i11;
        int i12 = WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
        if (i12 == 1) {
            sizes = IconButtonV3DTO.Sizes.SIZE_500;
            i11 = MARGIN_BIG;
        } else {
            if (i12 != 2) {
                throw new o();
            }
            sizes = IconButtonV3DTO.Sizes.SIZE_400;
            i11 = MARGIN_DEFAULT;
        }
        IconButtonV3DTO.Sizes sizes2 = sizes;
        return new ProductActionBarVOV2.CustomStyleVO(sizes2, UiExtKt.toPx(sizes2.getSize()), customStyle != null ? customStyle.getBackgroundColor() : null, customStyle != null ? customStyle.getIconColor() : null, i11);
    }

    @NotNull
    public static final ProductActionBarVOV2 toVOV2(@NotNull ProductActionBarDTO productActionBarDTO, long j11) {
        ProductActionBarVOV2.ActionIconVO actionIconVO;
        ProductActionBarVOV2.ActionIconVO actionIconVO2;
        ProductActionBarVOV2.QuantityPickerVO quantityPickerVO;
        Intrinsics.checkNotNullParameter(productActionBarDTO, "<this>");
        ProductActionBarVOV2.CustomStyleVO vo = toVO(productActionBarDTO.getCustomStyle(), productActionBarDTO.getSize());
        if (productActionBarDTO.getState() instanceof ProductActionBarDTO.State.ActionIcon) {
            String icon = ((ProductActionBarDTO.State.ActionIcon) productActionBarDTO.getState()).getIcon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(((ProductActionBarDTO.State.ActionIcon) productActionBarDTO.getState()).getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo = ((ProductActionBarDTO.State.ActionIcon) productActionBarDTO.getState()).getTrackingInfo();
            actionIconVO = new ProductActionBarVOV2.ActionIconVO(icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
        } else {
            actionIconVO = null;
        }
        if (actionIconVO != null || productActionBarDTO.getAdultActionIcon() == null) {
            actionIconVO2 = null;
        } else {
            String icon2 = productActionBarDTO.getAdultActionIcon().getIcon();
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(productActionBarDTO.getAdultActionIcon().getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo2 = productActionBarDTO.getAdultActionIcon().getTrackingInfo();
            actionIconVO2 = new ProductActionBarVOV2.ActionIconVO(icon2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
        }
        if (productActionBarDTO.getState() instanceof ProductActionBarDTO.State.QuantityControl) {
            ProductActionBarDTO.State.QuantityControl quantityControl = (ProductActionBarDTO.State.QuantityControl) productActionBarDTO.getState();
            long id2 = quantityControl.getId();
            Long selectedDeliverySchema = quantityControl.getSelectedDeliverySchema();
            Integer value = quantityControl.getValue();
            int intValue = value != null ? value.intValue() : 0;
            TextDTO copy$default = TextDTO.copy$default(quantityControl.getValueTextStyle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
            String icon3 = quantityControl.getCartActionIcon().getIcon();
            AtomAction atomAction3 = AtomActionMapperKt.toAtomAction(quantityControl.getCartActionIcon().getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo3 = quantityControl.getCartActionIcon().getTrackingInfo();
            ProductActionBarVOV2.ActionIconVO actionIconVO3 = new ProductActionBarVOV2.ActionIconVO(icon3, atomAction3, trackingInfo3 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo3, Long.valueOf(j11), null, 2, null) : null);
            CommonControlSettings additionalAction = quantityControl.getAdditionalAction();
            AtomAction atomAction4 = additionalAction != null ? additionalAction.toAtomAction() : null;
            Integer minValue = quantityControl.getMinValue();
            int intValue2 = minValue != null ? minValue.intValue() : 0;
            Integer maxValue = quantityControl.getMaxValue();
            int intValue3 = maxValue != null ? maxValue.intValue() : DescriptorProtos$Edition.EDITION_UNSTABLE_VALUE;
            Integer multiplicity = quantityControl.getMultiplicity();
            int intValue4 = multiplicity != null ? multiplicity.intValue() : 1;
            Integer quantSize = quantityControl.getQuantSize();
            int intValue5 = quantSize != null ? quantSize.intValue() : 0;
            String decrementIcon = quantityControl.getDecrementIcon();
            if (decrementIcon == null) {
                decrementIcon = productActionBarDTO.getSize() == ProductActionBarDTO.Size.BIG ? "ic_m_minus_filled" : "ic_s_minus_filled";
            }
            String str = decrementIcon;
            String incrementIcon = quantityControl.getIncrementIcon();
            if (incrementIcon == null) {
                incrementIcon = productActionBarDTO.getSize() == ProductActionBarDTO.Size.BIG ? "ic_m_plus_sign_filled" : "ic_s_plus_sign_filled";
            }
            quantityPickerVO = new ProductActionBarVOV2.QuantityPickerVO(id2, selectedDeliverySchema, intValue, copy$default, actionIconVO3, atomAction4, intValue2, intValue3, intValue4, intValue5, str, incrementIcon, quantityControl.getTrackingInfo(), false, 8192, null);
        } else {
            quantityPickerVO = null;
        }
        return new ProductActionBarVOV2(j11, actionIconVO, actionIconVO2, quantityPickerVO, vo);
    }

    @NotNull
    public static final ProductActionBarViewV2.ActionIcon createViewData(@NotNull ProductActionBarVOV2.ActionIconVO actionIconVO, @NotNull ProductActionBarViewV2.CommonStyles commonStyles) {
        Intrinsics.checkNotNullParameter(actionIconVO, "<this>");
        Intrinsics.checkNotNullParameter(commonStyles, "commonStyles");
        return new ProductActionBarViewV2.ActionIcon(actionIconVO.getIconToken(), true, commonStyles);
    }

    @NotNull
    public static final ProductActionBarViewV2.CommonStyles createViewData(@NotNull ProductActionBarVOV2.CustomStyleVO customStyleVO) {
        Intrinsics.checkNotNullParameter(customStyleVO, "<this>");
        return new ProductActionBarViewV2.CommonStyles(customStyleVO.getSizeToken(), customStyleVO.getSizePx(), customStyleVO.getBackgroundColorToken(), customStyleVO.getIconColorToken(), customStyleVO.getMarginPx());
    }
}

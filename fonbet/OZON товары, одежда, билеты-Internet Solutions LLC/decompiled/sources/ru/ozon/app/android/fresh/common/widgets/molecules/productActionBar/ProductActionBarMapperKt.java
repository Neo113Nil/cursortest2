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
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productActionBar.presentation.ProductActionBarVOKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\u0004\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0004\u0010\n\u001a\u0015\u0010\u0004\u001a\u00020\f*\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "toVO", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO;J)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;", "size", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$State;JLru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$Size;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$State;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;", "Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "(Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/data/ProductActionBarDTO$CustomStyle;)Lru/ozon/app/android/fresh/common/widgets/molecules/productActionBar/presentation/ProductActionBarVO$CustomStyle;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProductActionBarMapperKt {

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
    public static final ProductActionBarVO toVO(@NotNull ProductActionBarDTO productActionBarDTO, long j11) {
        int big_height_px;
        Intrinsics.checkNotNullParameter(productActionBarDTO, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[productActionBarDTO.getSize().ordinal()];
        if (i11 == 1) {
            big_height_px = ProductActionBarVOKt.getBIG_HEIGHT_PX();
        } else {
            if (i11 != 2) {
                throw new o();
            }
            big_height_px = ProductActionBarVOKt.getMINI_HEIGHT_PX();
        }
        int i12 = big_height_px;
        String obj = productActionBarDTO.getSize().toString();
        ProductActionBarVO.State vo = toVO(productActionBarDTO.getState(), j11, productActionBarDTO.getSize());
        ProductActionBarDTO.State.ActionIcon adultActionIcon = productActionBarDTO.getAdultActionIcon();
        Object vo2 = adultActionIcon != null ? toVO(adultActionIcon, j11, productActionBarDTO.getSize()) : null;
        return new ProductActionBarVO(j11, i12, obj, vo, vo2 instanceof ProductActionBarVO.State.ActionIcon ? (ProductActionBarVO.State.ActionIcon) vo2 : null, toVO(productActionBarDTO.getCustomStyle()));
    }

    private static final ProductActionBarVO.State toVO(ProductActionBarDTO.State state, long j11, ProductActionBarDTO.Size size) {
        if (state instanceof ProductActionBarDTO.State.ActionIcon) {
            ProductActionBarDTO.State.ActionIcon actionIcon = (ProductActionBarDTO.State.ActionIcon) state;
            String icon = actionIcon.getIcon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(actionIcon.getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo = actionIcon.getTrackingInfo();
            return new ProductActionBarVO.State.ActionIcon(icon, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, false, 8, null);
        }
        if (state instanceof ProductActionBarDTO.State.QuantityControl) {
            ProductActionBarDTO.State.QuantityControl quantityControl = (ProductActionBarDTO.State.QuantityControl) state;
            long id2 = quantityControl.getId();
            Long selectedDeliverySchema = quantityControl.getSelectedDeliverySchema();
            Integer value = quantityControl.getValue();
            int intValue = value != null ? value.intValue() : 0;
            TextDTO copy$default = TextDTO.copy$default(quantityControl.getValueTextStyle(), null, TextDTO.TextAlignment.CENTER, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524285, null);
            String icon2 = quantityControl.getCartActionIcon().getIcon();
            AtomAction atomAction2 = AtomActionMapperKt.toAtomAction(quantityControl.getCartActionIcon().getAction(), null);
            Map<String, TokenizedTrackingInfo> trackingInfo2 = quantityControl.getCartActionIcon().getTrackingInfo();
            ProductActionBarVO.State.ActionIcon actionIcon2 = new ProductActionBarVO.State.ActionIcon(icon2, atomAction2, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, false, 8, null);
            CommonControlSettings additionalAction = quantityControl.getAdditionalAction();
            AtomAction atomAction3 = additionalAction != null ? additionalAction.toAtomAction() : null;
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
                decrementIcon = size == ProductActionBarDTO.Size.BIG ? "ic_m_minus_filled" : "ic_s_minus_filled";
            }
            String str = decrementIcon;
            String incrementIcon = quantityControl.getIncrementIcon();
            if (incrementIcon == null) {
                incrementIcon = size == ProductActionBarDTO.Size.BIG ? "ic_m_plus_sign_filled" : "ic_s_plus_sign_filled";
            }
            return new ProductActionBarVO.State.QuantityControl(id2, selectedDeliverySchema, intValue, copy$default, actionIcon2, atomAction3, intValue2, intValue3, intValue4, intValue5, str, incrementIcon, quantityControl.getTrackingInfo(), false, false, 24576, null);
        }
        throw new o();
    }

    private static final ProductActionBarVO.CustomStyle toVO(ProductActionBarDTO.CustomStyle customStyle) {
        return new ProductActionBarVO.CustomStyle(customStyle != null ? customStyle.getBackgroundColor() : null, customStyle != null ? customStyle.getClickedButtonBackgroundColor() : null, customStyle != null ? customStyle.getIconColor() : null);
    }
}

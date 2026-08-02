package ru.ozon.app.android.cart.cartSplitV2.accessories;

import Sc.o;
import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollHeaderDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollWidth;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0005*\u0004\u0018\u00010\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesShelfDTO;", "widgetId", "", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollWidth;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesItemWidth;", "toVo", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollHeaderDTO;", "Lru/ozon/app/android/cart/cartSplitV2/accessories/AccessoriesHeaderDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AccessoriesActionApiKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessoriesItemWidth.values().length];
            try {
                iArr[AccessoriesItemWidth.WIDTH_INVALID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccessoriesItemWidth.WIDTH_220.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccessoriesItemWidth.WIDTH_248.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccessoriesItemWidth.WIDTH_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SkuThinScrollVO toVO(@NotNull AccessoriesShelfDTO accessoriesShelfDTO, long j11) {
        Intrinsics.checkNotNullParameter(accessoriesShelfDTO, "<this>");
        AccessoriesHeaderDTO header = accessoriesShelfDTO.getHeader();
        SkuThinScrollHeaderDTO vo = header != null ? toVo(header) : null;
        List<AccessoriesItemDTO> items = accessoriesShelfDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (AccessoriesItemDTO accessoriesItemDTO : items) {
            Map<String, TokenizedTrackingInfo> trackingInfo = accessoriesItemDTO.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            IconDTO icon = accessoriesItemDTO.getIcon();
            List mapContentElements$default = TileContentItemKt.mapContentElements$default(accessoriesItemDTO.getStateElements(), null, 1, null);
            IconButtonV3DTO button = accessoriesItemDTO.getButton();
            Boolean showBorder = accessoriesItemDTO.getShowBorder();
            boolean booleanValue = showBorder != null ? showBorder.booleanValue() : false;
            AtomActionDTO action = accessoriesItemDTO.getAction();
            arrayList.add(new SkuThinScrollVO.ItemVO(tokenizedEvent$default, icon, mapContentElements$default, button, booleanValue, action != null ? AtomActionMapperKt.toAtomAction(action, accessoriesItemDTO.getTrackingInfo()) : null, toVO(accessoriesShelfDTO.getWidth()), null, null, null, false, false));
        }
        SkuThinScrollWidth vo2 = toVO(accessoriesShelfDTO.getWidth());
        TestInfo testInfo = accessoriesShelfDTO.getTestInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = accessoriesShelfDTO.getTrackingInfo();
        return new SkuThinScrollVO(j11, vo, arrayList, testInfo, vo2, null, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, 32, null);
    }

    @NotNull
    public static final SkuThinScrollHeaderDTO toVo(@NotNull AccessoriesHeaderDTO accessoriesHeaderDTO) {
        Intrinsics.checkNotNullParameter(accessoriesHeaderDTO, "<this>");
        return new SkuThinScrollHeaderDTO(accessoriesHeaderDTO.getTrackingInfo(), accessoriesHeaderDTO.getText());
    }

    @NotNull
    public static final SkuThinScrollWidth toVO(AccessoriesItemWidth accessoriesItemWidth) {
        int i11 = accessoriesItemWidth == null ? -1 : WhenMappings.$EnumSwitchMapping$0[accessoriesItemWidth.ordinal()];
        if (i11 == -1) {
            return SkuThinScrollWidth.WIDTH_248;
        }
        if (i11 == 1) {
            return SkuThinScrollWidth.WIDTH_INVALID;
        }
        if (i11 == 2) {
            return SkuThinScrollWidth.WIDTH_220;
        }
        if (i11 == 3) {
            return SkuThinScrollWidth.WIDTH_248;
        }
        if (i11 == 4) {
            return SkuThinScrollWidth.WIDTH_FILL;
        }
        throw new o();
    }
}

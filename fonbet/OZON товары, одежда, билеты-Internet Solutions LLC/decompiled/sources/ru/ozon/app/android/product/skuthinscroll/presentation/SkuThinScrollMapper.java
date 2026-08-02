package ru.ozon.app.android.product.skuthinscroll.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVO;
import ru.ozon.app.android.product.molecules.blur.presentation.BlurMoleculeVOKt;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollHeaderDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollItemDTO;
import ru.ozon.app.android.product.skuthinscroll.data.SkuThinScrollWidth;
import ru.ozon.app.android.product.skuthinscroll.presentation.SkuThinScrollVO;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItem;
import ru.ozon.app.android.product.tileContentItems.vo.TileContentItemKt;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0015\u001a\u00060\u0003j\u0002`\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;", "Ll20/d;", "", "Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;J)Lru/ozon/app/android/product/skuthinscroll/presentation/SkuThinScrollVO;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO;", "Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;", "sharedData", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "toBlur", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollItemDTO;Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO$SharedData;)Lru/ozon/uni/atoms/data/icon/IconDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/product/skuthinscroll/data/SkuThinScrollDTO;Ll20/d;)Ljava/util/List;", "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SkuThinScrollMapper implements Function2<SkuThinScrollDTO, l20.d, List<? extends SkuThinScrollVO>> {
    private final IconDTO toBlur(SkuThinScrollItemDTO skuThinScrollItemDTO, SkuThinScrollDTO.SharedData sharedData) {
        BlurMoleculeDTO blurItem = skuThinScrollItemDTO.getBlurItem();
        if (blurItem != null) {
            BlurMoleculeVO vO$default = BlurMoleculeVOKt.toVO$default(blurItem, sharedData != null ? sharedData.getBlurItemInfo() : null, null, 2, null);
            if (vO$default != null) {
                String blurPlaceholderImage = vO$default.getBlurPlaceholderImage();
                IconDTO icon = skuThinScrollItemDTO.getIcon();
                IconDTO.IconSize size = icon != null ? icon.getSize() : null;
                IconDTO icon2 = skuThinScrollItemDTO.getIcon();
                return new IconDTO(size, null, icon2 != null ? icon2.getShape() : null, null, vO$default.getIcon(), blurPlaceholderImage, null, null, null, null, null, null, null, null, null, null, 65482, null);
            }
        }
        return null;
    }

    private final SkuThinScrollVO toVO(SkuThinScrollDTO skuThinScrollDTO, long j11) {
        Long y02;
        IconButtonV3DTO addToCart;
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        SkuThinScrollHeaderDTO header = skuThinScrollDTO.getHeader();
        List<SkuThinScrollItemDTO> items = skuThinScrollDTO.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        for (SkuThinScrollItemDTO skuThinScrollItemDTO : items) {
            Object button = skuThinScrollItemDTO.getButton();
            SkuThinScrollItemDTO.AddToCartButton addToCartButton = button instanceof SkuThinScrollItemDTO.AddToCartButton ? (SkuThinScrollItemDTO.AddToCartButton) button : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = skuThinScrollItemDTO.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            IconDTO icon = skuThinScrollItemDTO.getIcon();
            List<TileContentItem> mapContentElements = TileContentItemKt.mapContentElements(skuThinScrollItemDTO.getStateElements(), skuThinScrollItemDTO.isTextTagSupported());
            Object button2 = skuThinScrollItemDTO.getButton();
            IconButtonV3DTO iconButtonV3DTO = button2 instanceof IconButtonV3DTO ? (IconButtonV3DTO) button2 : null;
            Boolean showBorder = skuThinScrollItemDTO.getShowBorder();
            boolean booleanValue = showBorder != null ? showBorder.booleanValue() : false;
            AtomActionDTO action2 = skuThinScrollItemDTO.getAction();
            AtomAction atomAction = action2 != null ? AtomActionMapperKt.toAtomAction(action2, skuThinScrollItemDTO.getTrackingInfo()) : null;
            SkuThinScrollWidth width = skuThinScrollDTO.getWidth();
            if (width == null) {
                width = SkuThinScrollWidth.WIDTH_248;
            }
            SkuThinScrollWidth skuThinScrollWidth = width;
            IconDTO blur = toBlur(skuThinScrollItemDTO, skuThinScrollDTO.getSharedData());
            String skuId = skuThinScrollItemDTO.getSkuId();
            if (skuId == null || (y02 = h.y0(skuId)) == null) {
                y02 = (addToCartButton == null || (addToCart = addToCartButton.getAddToCart()) == null || (common = addToCart.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("sku")) == null) ? null : h.y0(str);
            }
            arrayList.add(new SkuThinScrollVO.ItemVO(tokenizedEvent$default, icon, mapContentElements, iconButtonV3DTO, booleanValue, atomAction, skuThinScrollWidth, blur, addToCartButton, y02, skuThinScrollItemDTO.getBlurItem() != null, false, 2048, null));
        }
        TestInfo testInfo = skuThinScrollDTO.getTestInfo();
        SkuThinScrollWidth width2 = skuThinScrollDTO.getWidth();
        Map<String, TokenizedTrackingInfo> trackingInfo2 = skuThinScrollDTO.getTrackingInfo();
        return new SkuThinScrollVO(j11, header, arrayList, testInfo, width2, null, trackingInfo2 != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, 32, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SkuThinScrollVO> invoke(@NotNull SkuThinScrollDTO state, @NotNull l20.d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }
}

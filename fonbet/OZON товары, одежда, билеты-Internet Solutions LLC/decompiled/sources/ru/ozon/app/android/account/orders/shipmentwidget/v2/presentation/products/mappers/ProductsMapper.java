package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ProductImageDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.data.ProductsDTO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductImageVO;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.viewItem.ProductsVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u0004\u0018\u00010\u0010*\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/mappers/ProductsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;J)Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductsVO;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;", "", "position", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductImageDTO;JI)Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/viewItem/ProductImageVO;", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "extractAction", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;)Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "extractTokenizedEvent", "(Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;J)LWZ/t;", "state", "info", "invoke", "(Lru/ozon/app/android/account/orders/shipmentwidget/v2/data/ProductsDTO;Ll20/d;)Ljava/util/List;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductsMapper implements Function2<ProductsDTO, d, List<? extends ProductsVO>> {
    private final AtomAction extractAction(ImageDTO imageDTO) {
        CommonControlSettings common;
        AtomActionDTO action;
        CommonControlSettings common2;
        AtomActionDTO action2;
        CommonControlSettings common3 = imageDTO.getCommon();
        Map<String, TokenizedTrackingInfo> map = null;
        if (common3 != null && (action2 = common3.getAction()) != null) {
            CommonControlSettings common4 = imageDTO.getCommon();
            AtomAction atomAction = AtomActionMapperKt.toAtomAction(action2, common4 != null ? common4.getTrackingInfo() : null);
            if (atomAction != null) {
                return atomAction;
            }
        }
        ProductMediaDTO productMedia = imageDTO.getProductMedia();
        if (productMedia == null || (common = productMedia.getCommon()) == null || (action = common.getAction()) == null) {
            return null;
        }
        ProductMediaDTO productMedia2 = imageDTO.getProductMedia();
        if (productMedia2 != null && (common2 = productMedia2.getCommon()) != null) {
            map = common2.getTrackingInfo();
        }
        return AtomActionMapperKt.toAtomAction(action, map);
    }

    private final t extractTokenizedEvent(ImageDTO imageDTO, long j11) {
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Map<String, TokenizedTrackingInfo> trackingInfo2;
        t mapToTokenizedEvent$default;
        CommonControlSettings common2 = imageDTO.getCommon();
        if (common2 != null && (trackingInfo2 = common2.getTrackingInfo()) != null && (mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null)) != null) {
            return mapToTokenizedEvent$default;
        }
        ProductMediaDTO productMedia = imageDTO.getProductMedia();
        if (productMedia == null || (common = productMedia.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) {
            return null;
        }
        return TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
    }

    private final ProductsVO toVo(ProductsDTO productsDTO, long j11) {
        AtomAction atomAction;
        AtomAction atomAction2;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        List<ProductImageDTO> products = productsDTO.getProducts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = products.iterator();
        int i11 = 0;
        while (true) {
            t tVar = null;
            if (!it.hasNext()) {
                int px = productsDTO.getSpaceBetween().getPx();
                CommonControlSettings common = productsDTO.getCommon();
                if ((common != null ? common.getAction() : null) == null) {
                    CommonControlSettings rootCommon = productsDTO.getRootCommon();
                    if (rootCommon != null && (action = rootCommon.getAction()) != null) {
                        atomAction = AtomActionMapperKt.toAtomAction(action, productsDTO.getRootCommon().getTrackingInfo());
                        atomAction2 = atomAction;
                    }
                    atomAction2 = null;
                } else {
                    AtomActionDTO action2 = productsDTO.getCommon().getAction();
                    if (action2 != null) {
                        atomAction = AtomActionMapperKt.toAtomAction(action2, productsDTO.getCommon().getTrackingInfo());
                        atomAction2 = atomAction;
                    }
                    atomAction2 = null;
                }
                CommonControlSettings common2 = productsDTO.getCommon();
                if (common2 != null && (trackingInfo = common2.getTrackingInfo()) != null) {
                    tVar = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
                }
                return new ProductsVO(j11, arrayList, px, atomAction2, tVar, productsDTO.getHorizontalPadding(), null, 64, null);
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ProductImageVO vo = toVo((ProductImageDTO) next, j11, i11);
            if (vo != null) {
                arrayList.add(vo);
            }
            i11 = i12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ProductsVO> invoke(@NotNull ProductsDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVo(state, info.d().hashCode()));
    }

    private final ProductImageVO toVo(ProductImageDTO productImageDTO, long j11, int i11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        ProductMediaDTO.Image image;
        ProductMediaDTO productMedia = productImageDTO.getImage().getProductMedia();
        long hashCode = (i11 + "_" + ((productMedia == null || (image = productMedia.getImage()) == null) ? null : image.getUrl())).hashCode();
        ProductMediaDTO productMedia2 = productImageDTO.getImage().getProductMedia();
        if (productMedia2 == null) {
            return null;
        }
        Boolean isAdult = productImageDTO.getImage().isAdult();
        boolean booleanValue = isAdult != null ? isAdult.booleanValue() : false;
        BadgeDTO badge = productImageDTO.getImage().getBadge();
        String blurImageUrl = productImageDTO.getImage().getBlurImageUrl();
        AtomAction extractAction = extractAction(productImageDTO.getImage());
        t extractTokenizedEvent = extractTokenizedEvent(productImageDTO.getImage(), j11);
        Boolean isTranslucent = productImageDTO.getImage().isTranslucent();
        boolean booleanValue2 = isTranslucent != null ? isTranslucent.booleanValue() : false;
        int px = productImageDTO.getTopCornerRadius().getPx();
        BadgeDTO badgeStatus = productImageDTO.getBadgeStatus();
        PriceDTO price = productImageDTO.getPrice();
        BadgeDTO priceBadge = productImageDTO.getPriceBadge();
        TextDTO caption = productImageDTO.getCaption();
        CommonControlSettings captionCommon = productImageDTO.getCaptionCommon();
        AtomAction atomAction = (captionCommon == null || (action = captionCommon.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, productImageDTO.getCaptionCommon().getTrackingInfo());
        CommonControlSettings captionCommon2 = productImageDTO.getCaptionCommon();
        return new ProductImageVO(hashCode, productMedia2, booleanValue, false, blurImageUrl, extractAction, extractTokenizedEvent, badge, booleanValue2, px, badgeStatus, price, priceBadge, caption, atomAction, (captionCommon2 == null || (trackingInfo = captionCommon2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null), 8, null);
    }
}

package ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.presentation;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.data.CheckoutProductsDTO;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProducts.domain.CheckoutProductsVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.data.ProductMediaDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.productMedia.presentation.ProductMediaMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u000f0\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/presentation/CheckoutProductsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO$ProductSplitDTO;", "", "widgetId", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO$ProductSplitDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ProductSplitVO;", "", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "toImageVO", "(Ljava/lang/Object;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImageVO;", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "determineImagePlacementType", "(Ljava/util/List;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/domain/CheckoutProductsVO$ImagesPlacementType;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProducts/data/CheckoutProductsDTO;Ll20/d;)Ljava/util/List;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutProductsMapper implements Function2<CheckoutProductsDTO, d, List<? extends CheckoutProductsVO>> {
    private final CheckoutProductsVO.ImagesPlacementType determineImagePlacementType(List<? extends Object> list) {
        return list.size() == 1 ? CheckoutProductsVO.ImagesPlacementType.SINGLE_IMAGE : list.size() == 2 ? CheckoutProductsVO.ImagesPlacementType.TWO_IMAGES : (list.size() == 3 && (list.get(2) instanceof ProductMediaDTO)) ? CheckoutProductsVO.ImagesPlacementType.THREE_IMAGES : CheckoutProductsVO.ImagesPlacementType.THREE_IMAGES_ICON;
    }

    private final CheckoutProductsVO.ImageVO toImageVO(Object obj) {
        if (obj instanceof IconDTO) {
            return new CheckoutProductsVO.ImageVO.CheckoutIconVO((IconDTO) obj);
        }
        if (obj instanceof ProductMediaDTO) {
            return new CheckoutProductsVO.ImageVO.CheckoutProductMediaVO(ProductMediaMapperKt.toVO$default((ProductMediaDTO) obj, FreshTileType.MAX, false, 2, null));
        }
        throw new IllegalArgumentException("Wrong image type " + N.b(obj.getClass()));
    }

    private final CheckoutProductsVO.ProductSplitVO toVO(CheckoutProductsDTO.ProductSplitDTO productSplitDTO, long j11) {
        TextDTO title = productSplitDTO.getTitle();
        TextDTO copy$default = TextDTO.copy$default(productSplitDTO.getSubtitle(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        List<Object> images = productSplitDTO.getImages();
        ArrayList arrayList = new ArrayList(C7714v.z(images, 10));
        Iterator<T> it = images.iterator();
        while (it.hasNext()) {
            arrayList.add(toImageVO(it.next()));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = productSplitDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        AtomActionDTO clickAction = productSplitDTO.getClickAction();
        return new CheckoutProductsVO.ProductSplitVO(title, copy$default, arrayList, mapToTokenizedEvent$default, clickAction != null ? AtomActionMapperKt.toAtomAction(clickAction, null) : null, determineImagePlacementType(productSplitDTO.getImages()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CheckoutProductsVO> invoke(@NotNull CheckoutProductsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CheckoutProductsDTO.ProductSplitDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CheckoutProductsDTO.ProductSplitDTO) it.next(), hashCode));
        }
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = state.getViewTrackingInfo();
        return C7714v.a0(new CheckoutProductsVO(hashCode, arrayList, viewTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTrackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}

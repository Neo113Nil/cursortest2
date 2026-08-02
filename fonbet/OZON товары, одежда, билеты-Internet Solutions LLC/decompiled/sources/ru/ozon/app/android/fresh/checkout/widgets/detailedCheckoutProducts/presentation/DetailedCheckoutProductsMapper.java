package ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.presentation;

import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.data.DetailedCheckoutProductsDTO;
import ru.ozon.app.android.fresh.checkout.widgets.detailedCheckoutProducts.domain.DetailedCheckoutProductsVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u000b\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u000b\u0010\u0019J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001a\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u0003j\u0002`\u001bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/presentation/DetailedCheckoutProductsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO;J)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem;J)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem;", "", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "titleToVO", "(Ljava/lang/Object;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TitleVO;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "subtitleToVO", "(Ljava/lang/Object;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$SubtitleVO;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO$TileItem$Spacers;)Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/domain/DetailedCheckoutProductsVO$TileItem$Spacers;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/checkout/widgets/detailedCheckoutProducts/data/DetailedCheckoutProductsDTO;Ll20/d;)Ljava/util/List;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DetailedCheckoutProductsMapper implements Function2<DetailedCheckoutProductsDTO, d, List<? extends DetailedCheckoutProductsVO>> {
    private final DetailedCheckoutProductsVO.SubtitleVO subtitleToVO(Object obj) {
        if (obj instanceof BadgeDTO) {
            return new DetailedCheckoutProductsVO.SubtitleVO.Badge((BadgeDTO) obj);
        }
        if (obj instanceof TextDTO) {
            return new DetailedCheckoutProductsVO.SubtitleVO.TextAtom((TextDTO) obj);
        }
        throw new IllegalArgumentException("Wrong text type " + N.b(obj.getClass()));
    }

    private final DetailedCheckoutProductsVO.TitleVO titleToVO(Object obj) {
        if (obj instanceof FreshTextPairDTO) {
            return new DetailedCheckoutProductsVO.TitleVO.TextPair((FreshTextPairDTO) obj);
        }
        if (obj instanceof TextDTO) {
            return new DetailedCheckoutProductsVO.TitleVO.TextAtom((TextDTO) obj);
        }
        throw new IllegalArgumentException("Wrong text type " + N.b(obj.getClass()));
    }

    private final DetailedCheckoutProductsVO toVO(DetailedCheckoutProductsDTO detailedCheckoutProductsDTO, long j11) {
        List<DetailedCheckoutProductsDTO.TileItem> tiles = detailedCheckoutProductsDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((DetailedCheckoutProductsDTO.TileItem) it.next(), j11));
        }
        return new DetailedCheckoutProductsVO(j11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DetailedCheckoutProductsVO> invoke(@NotNull DetailedCheckoutProductsDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d().hashCode()));
    }

    private final DetailedCheckoutProductsVO.TileItem toVO(DetailedCheckoutProductsDTO.TileItem tileItem, long j11) {
        DetailedCheckoutProductsVO.TileItem.TextBoxType textBoxType;
        String image = tileItem.getImage();
        DetailedCheckoutProductsVO.TitleVO titleToVO = titleToVO(tileItem.getTitle());
        TextDTO productQuantity = tileItem.getProductQuantity();
        PriceDTO price = tileItem.getPrice();
        Object subtitle = tileItem.getSubtitle();
        DetailedCheckoutProductsVO.SubtitleVO subtitleToVO = subtitle != null ? subtitleToVO(subtitle) : null;
        int px = tileItem.getRadius().getPx();
        DetailedCheckoutProductsVO.TileItem.Spacers vo = toVO(tileItem.getSpacers());
        DetailedCheckoutProductsDTO.TileItem.Separator separator = tileItem.getSeparator();
        String backgroundColor = tileItem.getBackgroundColor();
        IconDTO icon = tileItem.getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = tileItem.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        if (tileItem.getPrice() != null && tileItem.getSubtitle() != null) {
            textBoxType = DetailedCheckoutProductsVO.TileItem.TextBoxType.FULL_INFO_TEXT;
        } else if (tileItem.getPrice() != null) {
            textBoxType = DetailedCheckoutProductsVO.TileItem.TextBoxType.PRICE_TEXT;
        } else {
            textBoxType = tileItem.getSubtitle() != null ? DetailedCheckoutProductsVO.TileItem.TextBoxType.TITLE_SUBTITLE : DetailedCheckoutProductsVO.TileItem.TextBoxType.SINGLE_TEXT;
        }
        return new DetailedCheckoutProductsVO.TileItem(j11, image, titleToVO, productQuantity, subtitleToVO, price, px, vo, separator, backgroundColor, icon, textBoxType, b11);
    }

    private final DetailedCheckoutProductsVO.TileItem.Spacers toVO(DetailedCheckoutProductsDTO.TileItem.Spacers spacers) {
        return new DetailedCheckoutProductsVO.TileItem.Spacers(ResourceExtKt.toPx(spacers.getVertical().getPx()), ResourceExtKt.toPx(spacers.getHorizontal().getPx()), ResourceExtKt.toPx(spacers.getBetween().getPx()));
    }
}
